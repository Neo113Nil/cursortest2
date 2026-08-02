package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.finsky.externalreferrer.a;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends InstallReferrerClient {
    public int a = 0;
    public final Context b;
    public com.google.android.finsky.externalreferrer.a c;
    public ServiceConnectionC0048a d;

    /* renamed from: com.android.installreferrer.api.a$a, reason: collision with other inner class name */
    public final class ServiceConnectionC0048a implements ServiceConnection {
        public final InstallReferrerStateListener a;

        public ServiceConnectionC0048a(InstallReferrerStateListener installReferrerStateListener) {
            this.a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.google.android.finsky.externalreferrer.a c0105a;
            Log.isLoggable("InstallReferrerClient", 2);
            int i = a.AbstractBinderC0104a.a;
            if (iBinder == null) {
                c0105a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0105a = queryLocalInterface instanceof com.google.android.finsky.externalreferrer.a ? (com.google.android.finsky.externalreferrer.a) queryLocalInterface : new a.AbstractBinderC0104a.C0105a(iBinder);
            }
            a aVar = a.this;
            aVar.c = c0105a;
            aVar.a = 2;
            this.a.a(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.isLoggable("InstallReferrerClient", 5);
            a aVar = a.this;
            aVar.c = null;
            aVar.a = 0;
            this.a.b();
        }
    }

    public a(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a() {
        this.a = 3;
        if (this.d != null) {
            Log.isLoggable("InstallReferrerClient", 2);
            this.b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }

    public final ReferrerDetails b() throws RemoteException {
        if (this.a != 2 || this.c == null || this.d == null) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.b.getPackageName());
        try {
            return new ReferrerDetails(this.c.c(bundle));
        } catch (RemoteException e) {
            Log.isLoggable("InstallReferrerClient", 5);
            this.a = 0;
            throw e;
        }
    }

    public final void c(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        int i = this.a;
        if (i == 2 && this.c != null && this.d != null) {
            Log.isLoggable("InstallReferrerClient", 2);
            installReferrerStateListener.a(0);
            return;
        }
        if (i == 1) {
            Log.isLoggable("InstallReferrerClient", 5);
            installReferrerStateListener.a(3);
            return;
        }
        if (i == 3) {
            Log.isLoggable("InstallReferrerClient", 5);
            installReferrerStateListener.a(3);
            return;
        }
        Log.isLoggable("InstallReferrerClient", 2);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.b;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.a = 0;
            Log.isLoggable("InstallReferrerClient", 2);
            installReferrerStateListener.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC0048a serviceConnectionC0048a = new ServiceConnectionC0048a(installReferrerStateListener);
                    this.d = serviceConnectionC0048a;
                    try {
                        if (context.bindService(intent2, serviceConnectionC0048a, 1)) {
                            Log.isLoggable("InstallReferrerClient", 2);
                            return;
                        }
                        Log.isLoggable("InstallReferrerClient", 5);
                        this.a = 0;
                        installReferrerStateListener.a(1);
                        return;
                    } catch (SecurityException unused) {
                        Log.isLoggable("InstallReferrerClient", 5);
                        this.a = 0;
                        installReferrerStateListener.a(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        Log.isLoggable("InstallReferrerClient", 5);
        this.a = 0;
        installReferrerStateListener.a(2);
    }
}

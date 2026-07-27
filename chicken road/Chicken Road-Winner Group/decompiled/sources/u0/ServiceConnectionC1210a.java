package u0;

import A0.j;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.AbstractBinderC0154c;
import b.C0153b;
import b.InterfaceC0152a;
import b.d;
import o.BinderC1143a;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1210a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f10372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10373b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f10374c;

    /* renamed from: d, reason: collision with root package name */
    public j f10375d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10376e;

    public ServiceConnectionC1210a(String str) {
        this.f10373b = str;
    }

    public final boolean a(Activity context) {
        kotlin.jvm.internal.j.e(context, "context");
        if (this.f10376e) {
            return true;
        }
        try {
            String str = this.f10373b;
            this.f10372a = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            boolean bindService = context.bindService(intent, this, 33);
            if (bindService) {
                this.f10374c = context;
            }
            this.f10376e = bindService;
        } catch (SecurityException unused) {
            this.f10376e = false;
        }
        return this.f10376e;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder iBinder) {
        IInterface iInterface;
        if (this.f10372a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i3 = AbstractBinderC0154c.f2447a;
        j jVar = null;
        if (iBinder == null) {
            iInterface = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(d.f2448c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                C0153b c0153b = new C0153b();
                c0153b.f2446a = iBinder;
                iInterface = c0153b;
            } else {
                iInterface = (d) queryLocalInterface;
            }
        }
        kotlin.jvm.internal.j.e(name, "name");
        try {
            ((C0153b) iInterface).c();
        } catch (RemoteException unused) {
        }
        name.getPackageName();
        BinderC1143a binderC1143a = new BinderC1143a();
        binderC1143a.attachInterface(binderC1143a, InterfaceC0152a.f2445b);
        new Handler(Looper.getMainLooper());
        try {
            if (((C0153b) iInterface).b(binderC1143a)) {
                jVar = new j(iInterface, binderC1143a, name, 23);
            }
        } catch (RemoteException unused2) {
        }
        this.f10375d = jVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.j.e(name, "name");
        this.f10375d = null;
        this.f10376e = false;
    }
}

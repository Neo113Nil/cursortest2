package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class w implements ServiceConnection {
    public x c;
    public final /* synthetic */ C f;
    public int a = 0;
    public final Messenger b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            w wVar = w.this;
            synchronized (wVar) {
                try {
                    z zVar = (z) wVar.e.get(i);
                    if (zVar == null) {
                        return true;
                    }
                    wVar.e.remove(i);
                    wVar.c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        zVar.c(new A("Not supported by GmsCore", null));
                        return true;
                    }
                    zVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final ArrayDeque d = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    public /* synthetic */ w(C c) {
        this.f = c;
    }

    public final synchronized void a(@Nullable String str) {
        b(str, null);
    }

    public final synchronized void b(@Nullable String str, @Nullable SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 4;
            com.google.android.gms.common.stats.a.b().c(this.f.a, this);
            A a = new A(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((z) it.next()).c(a);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                ((z) this.e.valueAt(i2)).c(a);
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 3;
            com.google.android.gms.common.stats.a.b().c(this.f.a, this);
        }
    }

    public final synchronized boolean d(z zVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(zVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(zVar);
            this.f.b.execute(new r(this));
            return true;
        }
        this.d.add(zVar);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (com.google.android.gms.common.stats.a.b().a(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        w wVar = w.this;
                        synchronized (wVar) {
                            if (wVar.a == 1) {
                                wVar.a("Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f.b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.q
            @Override // java.lang.Runnable
            public final void run() {
                w wVar = w.this;
                IBinder iBinder2 = iBinder;
                synchronized (wVar) {
                    if (iBinder2 == null) {
                        wVar.a("Null service connection");
                        return;
                    }
                    try {
                        wVar.c = new x(iBinder2);
                        wVar.a = 2;
                        wVar.f.b.execute(new r(wVar));
                    } catch (RemoteException e) {
                        wVar.a(e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f.b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.t
            @Override // java.lang.Runnable
            public final void run() {
                w.this.a("Service disconnected");
            }
        });
    }
}

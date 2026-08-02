package N2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import j3.ServiceConnectionC2020a;
import j3.f;
import j3.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m3.v;
import p3.C2258a;
import u3.AbstractBinderC2501c;
import u3.AbstractC2499a;
import u3.C2500b;
import u3.InterfaceC2502d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public ServiceConnectionC2020a f3751a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2502d f3752b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3753c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3754d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public d f3755e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3756g;

    public b(Context context, long j5, boolean z3) {
        Context applicationContext;
        v.e(context);
        if (z3 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.f3753c = false;
        this.f3756g = j5;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a f = bVar.f();
            e(f, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z3;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            v.d("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.f3753c) {
                        synchronized (bVar.f3754d) {
                            d dVar = bVar.f3755e;
                            if (dVar == null || !dVar.f3762n) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.f3753c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e3) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                        }
                    }
                    v.e(bVar.f3751a);
                    v.e(bVar.f3752b);
                    try {
                        C2500b c2500b = (C2500b) bVar.f3752b;
                        c2500b.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel L5 = c2500b.L(obtain, 6);
                        int i = AbstractC2499a.f20072a;
                        z3 = L5.readInt() != 0;
                        L5.recycle();
                    } catch (RemoteException e5) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.g();
            return z3;
        } finally {
            bVar.c();
        }
    }

    public static void e(a aVar, long j5, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (aVar != null) {
                hashMap.put("limit_ad_tracking", true != aVar.f3750b ? "0" : "1");
                String str = aVar.f3749a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j5));
            new c(0, hashMap).start();
        }
    }

    public final void c() {
        v.d("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.f3751a == null) {
                    return;
                }
                try {
                    if (this.f3753c) {
                        C2258a.a().b(this.f, this.f3751a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f3753c = false;
                this.f3752b = null;
                this.f3751a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z3) {
        v.d("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3753c) {
                    c();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c5 = f.f17514b.c(context, 12451000);
                    if (c5 != 0 && c5 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2020a serviceConnectionC2020a = new ServiceConnectionC2020a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C2258a.a().c(context, context.getClass().getName(), intent, serviceConnectionC2020a, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f3751a = serviceConnectionC2020a;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a5 = serviceConnectionC2020a.a();
                            int i = AbstractBinderC2501c.f20074k;
                            IInterface queryLocalInterface = a5.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f3752b = queryLocalInterface instanceof InterfaceC2502d ? (InterfaceC2502d) queryLocalInterface : new C2500b(a5);
                            this.f3753c = true;
                            if (z3) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a f() {
        a aVar;
        v.d("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f3753c) {
                    synchronized (this.f3754d) {
                        d dVar = this.f3755e;
                        if (dVar == null || !dVar.f3762n) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f3753c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e3) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                    }
                }
                v.e(this.f3751a);
                v.e(this.f3752b);
                try {
                    C2500b c2500b = (C2500b) this.f3752b;
                    c2500b.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel L5 = c2500b.L(obtain, 1);
                    String readString = L5.readString();
                    L5.recycle();
                    C2500b c2500b2 = (C2500b) this.f3752b;
                    c2500b2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = AbstractC2499a.f20072a;
                    obtain2.writeInt(1);
                    Parcel L6 = c2500b2.L(obtain2, 2);
                    boolean z3 = L6.readInt() != 0;
                    L6.recycle();
                    aVar = new a(readString, z3);
                } catch (RemoteException e5) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f3754d) {
            d dVar = this.f3755e;
            if (dVar != null) {
                dVar.f3761m.countDown();
                try {
                    this.f3755e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j5 = this.f3756g;
            if (j5 > 0) {
                this.f3755e = new d(this, j5);
            }
        }
    }
}

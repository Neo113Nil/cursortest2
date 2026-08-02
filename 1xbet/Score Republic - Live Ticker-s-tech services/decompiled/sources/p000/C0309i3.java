package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0309i3 {

    /* JADX INFO: renamed from: a */
    public ServiceConnectionC0502nc f3406a;

    /* JADX INFO: renamed from: b */
    public ow1 f3407b;

    /* JADX INFO: renamed from: c */
    public boolean f3408c;

    /* JADX INFO: renamed from: d */
    public final Object f3409d = new Object();

    /* JADX INFO: renamed from: e */
    public yt1 f3410e;

    /* JADX INFO: renamed from: f */
    public final Context f3411f;

    /* JADX INFO: renamed from: g */
    public final long f3412g;

    public C0309i3(Context context) {
        p80.m3863h(context);
        Context applicationContext = context.getApplicationContext();
        this.f3411f = applicationContext != null ? applicationContext : context;
        this.f3408c = false;
        this.f3412g = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static C0272h3 m2522a(Context context) {
        C0309i3 c0309i3 = new C0309i3(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0309i3.m2525c();
            C0272h3 c0272h3M2526e = c0309i3.m2526e();
            m2523d(c0272h3M2526e, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            c0309i3.m2524b();
            return c0272h3M2526e;
        } catch (Throwable th) {
            try {
                m2523d(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                c0309i3.m2524b();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2523d(C0272h3 c0272h3, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c0272h3 != null) {
                map.put("limit_ad_tracking", true != c0272h3.f3022c ? "0" : "1");
                String str = (String) c0272h3.f3021b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new nm1(map).start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2524b() {
        p80.m3862g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3411f == null || this.f3406a == null) {
                    return;
                }
                try {
                    if (this.f3408c) {
                        b90.m606u().m625w(this.f3411f, this.f3406a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f3408c = false;
                this.f3407b = null;
                this.f3406a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2525c() {
        p80.m3862g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3408c) {
                    m2524b();
                }
                Context context = this.f3411f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM2575b = i90.f3485b.m2575b(context, 12451000);
                    if (iM2575b != 0 && iM2575b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0502nc serviceConnectionC0502nc = new ServiceConnectionC0502nc();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!b90.m606u().m623s(context, intent, serviceConnectionC0502nc, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f3406a = serviceConnectionC0502nc;
                        try {
                            IBinder iBinderM3513a = serviceConnectionC0502nc.m3513a();
                            int i = gw1.f2953b;
                            IInterface iInterfaceQueryLocalInterface = iBinderM3513a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f3407b = iInterfaceQueryLocalInterface instanceof ow1 ? (ow1) iInterfaceQueryLocalInterface : new ov1(iBinderM3513a);
                            this.f3408c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new m90();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0272h3 m2526e() {
        C0272h3 c0272h3;
        p80.m3862g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f3408c) {
                    synchronized (this.f3409d) {
                        yt1 yt1Var = this.f3410e;
                        if (yt1Var == null || !yt1Var.f9466m) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m2525c();
                        if (!this.f3408c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                p80.m3863h(this.f3406a);
                p80.m3863h(this.f3407b);
                try {
                    ov1 ov1Var = (ov1) this.f3407b;
                    ov1Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelM3800a = ov1Var.m3800a(parcelObtain, 1);
                    String string = parcelM3800a.readString();
                    parcelM3800a.recycle();
                    ov1 ov1Var2 = (ov1) this.f3407b;
                    ov1Var2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = qu1.f6617a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM3800a2 = ov1Var2.m3800a(parcelObtain2, 2);
                    if (parcelM3800a2.readInt() == 0) {
                        z = false;
                    }
                    parcelM3800a2.recycle();
                    c0272h3 = new C0272h3(0, string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f3409d) {
            yt1 yt1Var2 = this.f3410e;
            if (yt1Var2 != null) {
                yt1Var2.f9465l.countDown();
                try {
                    this.f3410e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f3412g;
            if (j > 0) {
                this.f3410e = new yt1(this, j);
            }
        }
        return c0272h3;
    }

    public final void finalize() throws Throwable {
        m2524b();
        super.finalize();
    }
}

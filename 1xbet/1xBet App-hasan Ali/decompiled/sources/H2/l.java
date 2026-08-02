package H2;

import a.AbstractC0444a;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import t2.C2421i;

/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f2303k;

    /* renamed from: l, reason: collision with root package name */
    public Context f2304l;

    /* renamed from: m, reason: collision with root package name */
    public D2.f f2305m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2306n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2307o = true;

    public l(C2421i c2421i) {
        this.f2303k = new WeakReference(c2421i);
    }

    public final synchronized void a() {
        D2.f iVar;
        try {
            C2421i c2421i = (C2421i) this.f2303k.get();
            if (c2421i == null) {
                b();
            } else if (this.f2305m == null) {
                if (c2421i.f19567d.f2295b) {
                    Context context = c2421i.f19564a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC0444a.m(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        iVar = new j3.i(3);
                    } else {
                        try {
                            iVar = new v3.e(connectivityManager, this);
                        } catch (Exception unused) {
                            iVar = new j3.i(3);
                        }
                    }
                } else {
                    iVar = new j3.i(3);
                }
                this.f2305m = iVar;
                this.f2307o = iVar.g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f2306n) {
                return;
            }
            this.f2306n = true;
            Context context = this.f2304l;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            D2.f fVar = this.f2305m;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.f2303k.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C2421i) this.f2303k.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        C2421i c2421i = (C2421i) this.f2303k.get();
        if (c2421i != null) {
            C2.d dVar = (C2.d) c2421i.f19566c.getValue();
            if (dVar != null) {
                dVar.f822a.m(i);
                dVar.f823b.j(i);
            }
        } else {
            b();
        }
    }
}

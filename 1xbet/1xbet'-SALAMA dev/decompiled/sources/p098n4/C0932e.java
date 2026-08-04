package p098n4;

import B.v;
import L4.b;
import Y3.i;
import android.os.Build;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.w;
import p028d6.k;
import p063i4.d;
import p136t.e;
import p145u1.c;
import p155w1.C1017n0;
import p155w1.L;

/* JADX INFO: renamed from: n4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0932e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f15406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f15408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f15409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f15410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15414i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f15415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1017n0 f15417m;

    public final void a() {
        if (this.f15416l) {
            throw new d("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public final b b() {
        t tVar = this.f15410e;
        if (tVar != null) {
            return (b) tVar.f8076b;
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public final t c(String str) {
        return new t(this.f15406a, str, (Object) null, 24);
    }

    public final C1017n0 d() {
        if (this.f15417m == null) {
            synchronized (this) {
                this.f15417m = new C1017n0(this.f15415k);
            }
        }
        return this.f15417m;
    }

    public final void e() {
        if (this.f15406a == null) {
            C1017n0 c1017n0D = d();
            int i7 = this.f15413h;
            c1017n0D.getClass();
            this.f15406a = new v(i7);
        }
        d();
        if (this.f15412g == null) {
            d().getClass();
            this.f15412g = L.i("Firebase/5/21.0.0/", p031e1.k.g(new StringBuilder(), Build.VERSION.SDK_INT, "/Android"));
        }
        if (this.f15407b == null) {
            d().getClass();
            this.f15407b = new c(20);
        }
        if (this.f15410e == null) {
            C1017n0 c1017n0 = this.f15417m;
            c1017n0.getClass();
            this.f15410e = new t(c1017n0, c("RunLoop"));
        }
        if (this.f15411f == null) {
            this.f15411f = "default";
        }
        D.j(this.f15408c, "You must register an authTokenProvider before initializing Context.");
        D.j(this.f15409d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final synchronized void f(int i7) {
        String str;
        try {
            a();
            int iE = e.e(i7);
            if (iE == 0) {
                this.f15413h = 1;
            } else if (iE == 1) {
                this.f15413h = 2;
            } else if (iE == 2) {
                this.f15413h = 3;
            } else if (iE == 3) {
                this.f15413h = 4;
            } else {
                if (iE != 4) {
                    if (i7 == 1) {
                        str = "DEBUG";
                    } else if (i7 == 2) {
                        str = "INFO";
                    } else if (i7 == 3) {
                        str = "WARN";
                    } else if (i7 != 4) {
                        str = i7 != 5 ? "null" : "NONE";
                    } else {
                        str = "ERROR";
                    }
                    throw new IllegalArgumentException("Unknown log level: ".concat(str));
                }
                this.f15413h = 5;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

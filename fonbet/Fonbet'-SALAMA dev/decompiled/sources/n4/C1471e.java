package n4;

import android.os.Build;
import d6.C0977k;
import i4.C1267d;
import w1.C1726n0;

/* renamed from: n4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1471e {

    /* renamed from: a, reason: collision with root package name */
    public B.v f15400a;

    /* renamed from: b, reason: collision with root package name */
    public u1.c f15401b;

    /* renamed from: c, reason: collision with root package name */
    public C0977k f15402c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f15403d;

    /* renamed from: e, reason: collision with root package name */
    public android.support.v4.media.session.t f15404e;

    /* renamed from: f, reason: collision with root package name */
    public String f15405f;

    /* renamed from: g, reason: collision with root package name */
    public String f15406g;

    /* renamed from: h, reason: collision with root package name */
    public int f15407h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15408i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public Y3.i f15409k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15410l;

    /* renamed from: m, reason: collision with root package name */
    public C1726n0 f15411m;

    public final void a() {
        if (this.f15410l) {
            throw new C1267d("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public final L4.b b() {
        android.support.v4.media.session.t tVar = this.f15404e;
        if (tVar != null) {
            return (L4.b) tVar.f8076b;
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public final android.support.v4.media.session.t c(String str) {
        return new android.support.v4.media.session.t(this.f15400a, str, (Object) null, 24);
    }

    public final C1726n0 d() {
        if (this.f15411m == null) {
            synchronized (this) {
                this.f15411m = new C1726n0(this.f15409k);
            }
        }
        return this.f15411m;
    }

    public final void e() {
        if (this.f15400a == null) {
            C1726n0 d7 = d();
            int i7 = this.f15407h;
            d7.getClass();
            this.f15400a = new B.v(i7);
        }
        d();
        if (this.f15406g == null) {
            d().getClass();
            this.f15406g = w1.L.i("Firebase/5/21.0.0/", e1.k.g(new StringBuilder(), Build.VERSION.SDK_INT, "/Android"));
        }
        if (this.f15401b == null) {
            d().getClass();
            this.f15401b = new u1.c(20);
        }
        if (this.f15404e == null) {
            C1726n0 c1726n0 = this.f15411m;
            c1726n0.getClass();
            this.f15404e = new android.support.v4.media.session.t(c1726n0, c("RunLoop"));
        }
        if (this.f15405f == null) {
            this.f15405f = "default";
        }
        com.google.android.gms.common.internal.D.j(this.f15402c, "You must register an authTokenProvider before initializing Context.");
        com.google.android.gms.common.internal.D.j(this.f15403d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final synchronized void f(int i7) {
        try {
            a();
            int e7 = t.e.e(i7);
            if (e7 == 0) {
                this.f15407h = 1;
            } else if (e7 == 1) {
                this.f15407h = 2;
            } else if (e7 == 2) {
                this.f15407h = 3;
            } else if (e7 == 3) {
                this.f15407h = 4;
            } else {
                if (e7 != 4) {
                    throw new IllegalArgumentException("Unknown log level: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "NONE" : "ERROR" : "WARN" : "INFO" : "DEBUG"));
                }
                this.f15407h = 5;
            }
        } finally {
        }
    }
}

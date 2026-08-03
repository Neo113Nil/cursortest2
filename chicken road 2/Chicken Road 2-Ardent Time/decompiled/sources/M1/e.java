package M1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1039c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1040d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f1041e;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2) {
        this.f1038b = str == null ? "libapp.so" : str;
        this.f1039c = str2 == null ? "flutter_assets" : str2;
        this.f1041e = str4;
        this.f1040d = str3 == null ? "" : str3;
        this.f1037a = z2;
    }

    public java.io.IOException a(boolean z2, boolean z3, java.io.IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        M1.i call = (M1.i) this.f1038b;
        if (z3) {
            if (iOException != null) {
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        return call.f(this, z3, z2, iOException);
    }

    public I1.z b(I1.y yVar) {
        N1.e eVar = (N1.e) this.f1040d;
        try {
            I1.y.a(yVar, "Content-Type");
            long e2 = eVar.e(yVar);
            return new I1.z(e2, new V1.q(new M1.d(this, eVar.b(yVar), e2)), 1);
        } catch (java.io.IOException e3) {
            M1.i call = (M1.i) this.f1038b;
            kotlin.jvm.internal.i.e(call, "call");
            d(e3);
            throw e3;
        }
    }

    public I1.x c(boolean z2) {
        try {
            I1.x f2 = ((N1.e) this.f1040d).f(z2);
            if (f2 != null) {
                f2.f856m = this;
            }
            return f2;
        } catch (java.io.IOException e2) {
            M1.i call = (M1.i) this.f1038b;
            kotlin.jvm.internal.i.e(call, "call");
            d(e2);
            throw e2;
        }
    }

    public void d(java.io.IOException iOException) {
        this.f1037a = true;
        ((M1.f) this.f1039c).c(iOException);
        M1.k g2 = ((N1.e) this.f1040d).g();
        M1.i call = (M1.i) this.f1038b;
        synchronized (g2) {
            try {
                kotlin.jvm.internal.i.e(call, "call");
                if (!(iOException instanceof P1.F)) {
                    if (!(g2.f1074g != null) || (iOException instanceof P1.C0053a)) {
                        g2.f1077j = true;
                        if (g2.f1080m == 0) {
                            M1.k.d(call.f1053a, g2.f1069b, iOException);
                            g2.f1079l++;
                        }
                    }
                } else if (((P1.F) iOException).f1443a == P1.EnumC0054b.REFUSED_STREAM) {
                    int i2 = g2.f1081n + 1;
                    g2.f1081n = i2;
                    if (i2 > 1) {
                        g2.f1077j = true;
                        g2.f1079l++;
                    }
                } else if (((P1.F) iOException).f1443a != P1.EnumC0054b.CANCEL || !call.f1065m) {
                    g2.f1077j = true;
                    g2.f1079l++;
                }
            } finally {
            }
        }
    }

    public e(M1.i call, M1.f finder, N1.e eVar) {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(finder, "finder");
        this.f1038b = call;
        this.f1039c = finder;
        this.f1040d = eVar;
        this.f1041e = eVar.g();
    }
}

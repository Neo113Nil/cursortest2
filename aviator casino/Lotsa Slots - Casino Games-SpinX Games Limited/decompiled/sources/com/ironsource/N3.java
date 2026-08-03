package com.ironsource;

/* loaded from: classes5.dex */
public final class N3 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3029ee f5847a;
    private final com.ironsource.D9 b;
    private final com.ironsource.U2 c;
    private final com.ironsource.Pb d;
    private final com.ironsource.C1 e;
    private final com.ironsource.Xf f;
    private final com.ironsource.mediationsdk.adquality.a g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.ironsource.C3029ee f5848a;
        private com.ironsource.D9 b;
        private com.ironsource.U2 c;
        private com.ironsource.Pb d;
        private com.ironsource.C1 e;
        private com.ironsource.Xf f;
        private com.ironsource.mediationsdk.adquality.a g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final com.ironsource.N3.a a(com.ironsource.C3029ee c3029ee, com.ironsource.D9 d9, com.ironsource.U2 u2, com.ironsource.Pb pb, com.ironsource.C1 c1, com.ironsource.Xf xf, com.ironsource.mediationsdk.adquality.a aVar) {
            return new com.ironsource.N3.a(c3029ee, d9, u2, pb, c1, xf, aVar);
        }

        public final com.ironsource.C3029ee b() {
            return this.f5848a;
        }

        public final com.ironsource.D9 c() {
            return this.b;
        }

        public final com.ironsource.U2 d() {
            return this.c;
        }

        public final com.ironsource.Pb e() {
            return this.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.N3.a)) {
                return false;
            }
            com.ironsource.N3.a aVar = (com.ironsource.N3.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5848a, aVar.f5848a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, aVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, aVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, aVar.g);
        }

        public final com.ironsource.C1 f() {
            return this.e;
        }

        public final com.ironsource.Xf g() {
            return this.f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            com.ironsource.C3029ee c3029ee = this.f5848a;
            int hashCode = (c3029ee == null ? 0 : c3029ee.hashCode()) * 31;
            com.ironsource.D9 d9 = this.b;
            int hashCode2 = (hashCode + (d9 == null ? 0 : d9.hashCode())) * 31;
            com.ironsource.U2 u2 = this.c;
            int hashCode3 = (hashCode2 + (u2 == null ? 0 : u2.hashCode())) * 31;
            com.ironsource.Pb pb = this.d;
            int hashCode4 = (hashCode3 + (pb == null ? 0 : pb.hashCode())) * 31;
            com.ironsource.C1 c1 = this.e;
            int hashCode5 = (hashCode4 + (c1 == null ? 0 : c1.hashCode())) * 31;
            com.ironsource.Xf xf = this.f;
            int hashCode6 = (hashCode5 + (xf == null ? 0 : xf.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        public final com.ironsource.C1 j() {
            return this.e;
        }

        public final com.ironsource.U2 k() {
            return this.c;
        }

        public final com.ironsource.D9 l() {
            return this.b;
        }

        public final com.ironsource.Pb m() {
            return this.d;
        }

        public final com.ironsource.C3029ee n() {
            return this.f5848a;
        }

        public final com.ironsource.Xf o() {
            return this.f;
        }

        public java.lang.String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f5848a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public a(com.ironsource.C3029ee c3029ee, com.ironsource.D9 d9, com.ironsource.U2 u2, com.ironsource.Pb pb, com.ironsource.C1 c1, com.ironsource.Xf xf, com.ironsource.mediationsdk.adquality.a aVar) {
            this.f5848a = c3029ee;
            this.b = d9;
            this.c = u2;
            this.d = pb;
            this.e = c1;
            this.f = xf;
            this.g = aVar;
        }

        public static /* synthetic */ com.ironsource.N3.a a(com.ironsource.N3.a aVar, com.ironsource.C3029ee c3029ee, com.ironsource.D9 d9, com.ironsource.U2 u2, com.ironsource.Pb pb, com.ironsource.C1 c1, com.ironsource.Xf xf, com.ironsource.mediationsdk.adquality.a aVar2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c3029ee = aVar.f5848a;
            }
            if ((i & 2) != 0) {
                d9 = aVar.b;
            }
            com.ironsource.D9 d92 = d9;
            if ((i & 4) != 0) {
                u2 = aVar.c;
            }
            com.ironsource.U2 u22 = u2;
            if ((i & 8) != 0) {
                pb = aVar.d;
            }
            com.ironsource.Pb pb2 = pb;
            if ((i & 16) != 0) {
                c1 = aVar.e;
            }
            com.ironsource.C1 c12 = c1;
            if ((i & 32) != 0) {
                xf = aVar.f;
            }
            com.ironsource.Xf xf2 = xf;
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            return aVar.a(c3029ee, d92, u22, pb2, c12, xf2, aVar2);
        }

        public final void b(com.ironsource.C3029ee c3029ee) {
            this.f5848a = c3029ee;
        }

        public final void a(com.ironsource.Xf xf) {
            this.f = xf;
        }

        public final void b(com.ironsource.D9 d9) {
            this.b = d9;
        }

        public final com.ironsource.N3.a a(com.ironsource.C3029ee c3029ee) {
            this.f5848a = c3029ee;
            return this;
        }

        public final void b(com.ironsource.U2 u2) {
            this.c = u2;
        }

        public final com.ironsource.N3.a a(com.ironsource.D9 d9) {
            this.b = d9;
            return this;
        }

        public final void b(com.ironsource.Pb pb) {
            this.d = pb;
        }

        public final com.ironsource.N3.a a(com.ironsource.U2 u2) {
            this.c = u2;
            return this;
        }

        public final void b(com.ironsource.C1 c1) {
            this.e = c1;
        }

        public final com.ironsource.N3.a a(com.ironsource.Pb pb) {
            this.d = pb;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        public final com.ironsource.N3.a a(com.ironsource.C1 c1) {
            this.e = c1;
            return this;
        }

        public final com.ironsource.N3.a b(com.ironsource.Xf xf) {
            this.f = xf;
            return this;
        }

        public final com.ironsource.N3.a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        public /* synthetic */ a(com.ironsource.C3029ee c3029ee, com.ironsource.D9 d9, com.ironsource.U2 u2, com.ironsource.Pb pb, com.ironsource.C1 c1, com.ironsource.Xf xf, com.ironsource.mediationsdk.adquality.a aVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c3029ee, (i & 2) != 0 ? null : d9, (i & 4) != 0 ? null : u2, (i & 8) != 0 ? null : pb, (i & 16) != 0 ? null : c1, (i & 32) != 0 ? null : xf, (i & 64) != 0 ? null : aVar);
        }

        public final com.ironsource.N3 a() {
            return new com.ironsource.N3(this.f5848a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ N3(com.ironsource.C3029ee c3029ee, com.ironsource.D9 d9, com.ironsource.U2 u2, com.ironsource.Pb pb, com.ironsource.C1 c1, com.ironsource.Xf xf, com.ironsource.mediationsdk.adquality.a aVar, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3029ee, d9, u2, pb, c1, xf, aVar);
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    public final com.ironsource.C1 b() {
        return this.e;
    }

    public final com.ironsource.U2 c() {
        return this.c;
    }

    public final com.ironsource.D9 d() {
        return this.b;
    }

    public final com.ironsource.Pb e() {
        return this.d;
    }

    public final com.ironsource.C3029ee f() {
        return this.f5847a;
    }

    public final com.ironsource.Xf g() {
        return this.f;
    }

    public java.lang.String toString() {
        return "configurations(\n" + this.f5847a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private N3(com.ironsource.C3029ee c3029ee, com.ironsource.D9 d9, com.ironsource.U2 u2, com.ironsource.Pb pb, com.ironsource.C1 c1, com.ironsource.Xf xf, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f5847a = c3029ee;
        this.b = d9;
        this.c = u2;
        this.d = pb;
        this.e = c1;
        this.f = xf;
        this.g = aVar;
    }
}

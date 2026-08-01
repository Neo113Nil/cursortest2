package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4376de f7718a;
    private final D9 b;
    private final S2 c;
    private final Pb d;
    private final A1 e;
    private final Yf f;
    private final com.ironsource.mediationsdk.adquality.a g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C4376de f7719a;
        private D9 b;
        private S2 c;
        private Pb d;
        private A1 e;
        private Yf f;
        private com.ironsource.mediationsdk.adquality.a g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final a a(C4376de c4376de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c4376de, d9, s2, pb, a1, yf, aVar);
        }

        public final C4376de b() {
            return this.f7719a;
        }

        public final D9 c() {
            return this.b;
        }

        public final S2 d() {
            return this.c;
        }

        public final Pb e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f7719a, aVar.f7719a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
        }

        public final A1 f() {
            return this.e;
        }

        public final Yf g() {
            return this.f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            C4376de c4376de = this.f7719a;
            int hashCode = (c4376de == null ? 0 : c4376de.hashCode()) * 31;
            D9 d9 = this.b;
            int hashCode2 = (hashCode + (d9 == null ? 0 : d9.hashCode())) * 31;
            S2 s2 = this.c;
            int hashCode3 = (hashCode2 + (s2 == null ? 0 : s2.hashCode())) * 31;
            Pb pb = this.d;
            int hashCode4 = (hashCode3 + (pb == null ? 0 : pb.hashCode())) * 31;
            A1 a1 = this.e;
            int hashCode5 = (hashCode4 + (a1 == null ? 0 : a1.hashCode())) * 31;
            Yf yf = this.f;
            int hashCode6 = (hashCode5 + (yf == null ? 0 : yf.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        public final A1 j() {
            return this.e;
        }

        public final S2 k() {
            return this.c;
        }

        public final D9 l() {
            return this.b;
        }

        public final Pb m() {
            return this.d;
        }

        public final C4376de n() {
            return this.f7719a;
        }

        public final Yf o() {
            return this.f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f7719a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public a(C4376de c4376de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar) {
            this.f7719a = c4376de;
            this.b = d9;
            this.c = s2;
            this.d = pb;
            this.e = a1;
            this.f = yf;
            this.g = aVar;
        }

        public static /* synthetic */ a a(a aVar, C4376de c4376de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                c4376de = aVar.f7719a;
            }
            if ((i & 2) != 0) {
                d9 = aVar.b;
            }
            D9 d92 = d9;
            if ((i & 4) != 0) {
                s2 = aVar.c;
            }
            S2 s22 = s2;
            if ((i & 8) != 0) {
                pb = aVar.d;
            }
            Pb pb2 = pb;
            if ((i & 16) != 0) {
                a1 = aVar.e;
            }
            A1 a12 = a1;
            if ((i & 32) != 0) {
                yf = aVar.f;
            }
            Yf yf2 = yf;
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            return aVar.a(c4376de, d92, s22, pb2, a12, yf2, aVar2);
        }

        public final void b(C4376de c4376de) {
            this.f7719a = c4376de;
        }

        public final void a(Yf yf) {
            this.f = yf;
        }

        public final void b(D9 d9) {
            this.b = d9;
        }

        public final a a(C4376de c4376de) {
            this.f7719a = c4376de;
            return this;
        }

        public final void b(S2 s2) {
            this.c = s2;
        }

        public final a a(D9 d9) {
            this.b = d9;
            return this;
        }

        public final void b(Pb pb) {
            this.d = pb;
        }

        public final a a(S2 s2) {
            this.c = s2;
            return this;
        }

        public final void b(A1 a1) {
            this.e = a1;
        }

        public final a a(Pb pb) {
            this.d = pb;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        public final a a(A1 a1) {
            this.e = a1;
            return this;
        }

        public final a b(Yf yf) {
            this.f = yf;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        public /* synthetic */ a(C4376de c4376de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c4376de, (i & 2) != 0 ? null : d9, (i & 4) != 0 ? null : s2, (i & 8) != 0 ? null : pb, (i & 16) != 0 ? null : a1, (i & 32) != 0 ? null : yf, (i & 64) != 0 ? null : aVar);
        }

        public final K3 a() {
            return new K3(this.f7719a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ K3(C4376de c4376de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4376de, d9, s2, pb, a1, yf, aVar);
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    public final A1 b() {
        return this.e;
    }

    public final S2 c() {
        return this.c;
    }

    public final D9 d() {
        return this.b;
    }

    public final Pb e() {
        return this.d;
    }

    public final C4376de f() {
        return this.f7718a;
    }

    public final Yf g() {
        return this.f;
    }

    public String toString() {
        return "configurations(\n" + this.f7718a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private K3(C4376de c4376de, D9 d9, S2 s2, Pb pb, A1 a1, Yf yf, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f7718a = c4376de;
        this.b = d9;
        this.c = s2;
        this.d = pb;
        this.e = a1;
        this.f = yf;
        this.g = aVar;
    }
}

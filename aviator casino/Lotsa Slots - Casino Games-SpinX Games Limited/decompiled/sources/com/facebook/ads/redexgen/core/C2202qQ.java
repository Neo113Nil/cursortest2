package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.qQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2202qQ implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public com.facebook.ads.redexgen.core.C03731z A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public static java.lang.String[] A06 = {"SFReXFLlI4UOpNrTR2oqZFPGLDG", "ddXxuwKTXrUgQKU5ch6dGlXzKHCNOB4g", "Ka5UQw68nW6F3F15EfeRiHjBxEcftjYi", "TyFhGc", "kpbiwOTtMuCD4LdTginQH36Spnec", "0F8UT5ylucYBCPc3EM7PRaW9", "xfENz4MNKGXPVezlH9FH4FhAxccJ4akv", "0RZwBffOFnQLfCTDTyZnu0"};
    public static final com.facebook.ads.redexgen.core.C2202qQ A07 = new com.facebook.ads.redexgen.core.AnonymousClass20().A05();
    public static final java.lang.String A0A = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A0B = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A0D = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final java.lang.String A09 = com.facebook.ads.redexgen.core.C5C.A0h(3);
    public static final java.lang.String A0C = com.facebook.ads.redexgen.core.C5C.A0h(4);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2202qQ> A08 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qR
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            return com.facebook.ads.redexgen.core.C2202qQ.A00(bundle);
        }
    };

    public C2202qQ(int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        this.A03 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A04 = i5;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2202qQ A00(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.AnonymousClass20 anonymousClass20 = new com.facebook.ads.redexgen.core.AnonymousClass20();
        if (bundle.containsKey(A0A)) {
            anonymousClass20.A01(bundle.getInt(A0A));
        }
        if (bundle.containsKey(A0B)) {
            anonymousClass20.A02(bundle.getInt(A0B));
        }
        java.lang.String str = A0D;
        if (A06[0].length() == 22) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[5] = "GWwDRzmwjjhTaGez4rqlH73J";
        strArr[4] = "f0ceflDKapN9i1ydncZgjkps1oFM";
        if (bundle.containsKey(str)) {
            anonymousClass20.A04(bundle.getInt(A0D));
        }
        if (bundle.containsKey(A09)) {
            anonymousClass20.A00(bundle.getInt(A09));
        }
        if (bundle.containsKey(A0C)) {
            anonymousClass20.A03(bundle.getInt(A0C));
        }
        return anonymousClass20.A05();
    }

    public final com.facebook.ads.redexgen.core.C03731z A01() {
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.C03731z(this);
        }
        return this.A00;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2202qQ c2202qQ = (com.facebook.ads.redexgen.core.C2202qQ) obj;
        return this.A02 == c2202qQ.A02 && this.A03 == c2202qQ.A03 && this.A05 == c2202qQ.A05 && this.A01 == c2202qQ.A01 && this.A04 == c2202qQ.A04;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A03) * 31;
        int result3 = this.A05;
        int result4 = (((result2 + result3) * 31) + this.A01) * 31;
        int result5 = this.A04;
        return result4 + result5;
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AR extends com.facebook.ads.androidx.media3.common.Timeline {
    public static java.lang.String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2163pl> A00;
    public final com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2161pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AR(com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2161pj> bp, com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2163pl> bp2, int[] iArr) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(bp.size() == iArr.length);
        this.A01 = bp;
        this.A00 = bp2;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i = 0; i < i; i++) {
            int[] iArr2 = this.A03;
            int i2 = iArr[i];
            iArr2[i2] = i;
        }
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A08(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == A0C(z)) {
            if (i2 == 2) {
                return A0B(z);
            }
            return -1;
        }
        if (z) {
            return this.A02[this.A03[i] + 1];
        }
        return i + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z) {
        if (A0N()) {
            return -1;
        }
        if (!z) {
            return 0;
        }
        int[] iArr = this.A02;
        if (A04[1].charAt(22) == 'H') {
            throw new java.lang.RuntimeException();
        }
        A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
        return iArr[0];
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        if (z) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final com.facebook.ads.redexgen.core.C2163pl A0I(int i, com.facebook.ads.redexgen.core.C2163pl p, boolean z) {
        com.facebook.ads.redexgen.core.C2204qS c2204qS;
        com.facebook.ads.redexgen.core.C2163pl p2 = this.A00.get(i);
        java.lang.Object obj = p2.A03;
        java.lang.Object obj2 = p2.A04;
        int i2 = p2.A00;
        long j = p2.A01;
        long j2 = p2.A02;
        c2204qS = p2.A06;
        p.A0G(obj, obj2, i2, j, j2, c2204qS, p2.A05);
        return p;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final com.facebook.ads.redexgen.core.C2161pj A0L(int i, com.facebook.ads.redexgen.core.C2161pj c2161pj, long j) {
        com.facebook.ads.redexgen.core.C2161pj c2161pj2 = this.A01.get(i);
        c2161pj.A07(c2161pj2.A0C, c2161pj2.A09, c2161pj2.A0A, c2161pj2.A06, c2161pj2.A07, c2161pj2.A04, c2161pj2.A0G, c2161pj2.A0D, c2161pj2.A08, c2161pj2.A02, c2161pj2.A03, c2161pj2.A00, c2161pj2.A01, c2161pj2.A05);
        c2161pj.A0F = c2161pj2.A0F;
        return c2161pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final java.lang.Object A0M(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}

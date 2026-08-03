package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2010nG extends com.facebook.ads.redexgen.core.AbstractC0670Eh<com.facebook.ads.redexgen.core.C2010nG> implements java.lang.Comparable<com.facebook.ads.redexgen.core.C2010nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(java.util.List<com.facebook.ads.redexgen.core.C2010nG> list, java.util.List<com.facebook.ads.redexgen.core.C2010nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2010nG(int i, com.facebook.ads.redexgen.core.C2159pg c2159pg, int i2, com.facebook.ads.redexgen.core.C05549i c05549i, int i3, java.lang.String str) {
        super(i, c2159pg, i2);
        java.util.List<java.lang.String> list;
        int A00;
        int i4 = 0;
        this.A08 = com.facebook.ads.redexgen.core.C05539h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((com.facebook.ads.redexgen.core.C2155pc) c05549i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c05549i.A0K.isEmpty()) {
            list = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c05549i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = com.facebook.ads.redexgen.core.C05539h.A02(super.A02, list.get(bestLanguageIndex), c05549i.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = com.facebook.ads.redexgen.core.C05539h.A00(super.A02.A0E, ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = com.facebook.ads.redexgen.core.C05539h.A02(super.A02, str, com.facebook.ads.redexgen.core.C05539h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c05549i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (com.facebook.ads.redexgen.core.C05539h.A0S(i3, c05549i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C2010nG c2010nG) {
        com.facebook.ads.redexgen.core.AbstractC2048ns A06 = com.facebook.ads.redexgen.core.AbstractC2048ns.A01().A09(this.A08, c2010nG.A08).A08(java.lang.Integer.valueOf(this.A00), java.lang.Integer.valueOf(c2010nG.A00), com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06()).A06(this.A01, c2010nG.A01).A06(this.A02, c2010nG.A02).A09(this.A06, c2010nG.A06).A08(java.lang.Boolean.valueOf(this.A07), java.lang.Boolean.valueOf(c2010nG.A07), this.A01 == 0 ? com.facebook.ads.redexgen.core.AbstractC2198qK.A03() : com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06()).A06(this.A03, c2010nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c2010nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2010nG> A02(int i, com.facebook.ads.redexgen.core.C2159pg c2159pg, com.facebook.ads.redexgen.core.C05549i c05549i, int[] iArr, java.lang.String str) {
        com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
        for (int i2 = 0; i2 < c2159pg.A01; i2++) {
            A01.A04(new com.facebook.ads.redexgen.core.C2010nG(i, c2159pg, i2, c05549i, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0670Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(com.facebook.ads.redexgen.core.C2010nG c2010nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0670Eh
    public final int A08() {
        return this.A04;
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2016nM extends com.facebook.ads.redexgen.core.AbstractC0670Eh<com.facebook.ads.redexgen.core.C2016nM> implements java.lang.Comparable<com.facebook.ads.redexgen.core.C2016nM> {
    public static java.lang.String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final com.facebook.ads.redexgen.core.C05549i A0A;
    public final java.lang.String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2016nM(int i, com.facebook.ads.redexgen.core.C2159pg c2159pg, int i2, com.facebook.ads.redexgen.core.C05549i c05549i, int i3, boolean z, com.facebook.ads.redexgen.core.InterfaceC1867kj<com.facebook.ads.redexgen.core.C2196qI> interfaceC1867kj) {
        super(i, c2159pg, i2);
        int A00;
        this.A0A = c05549i;
        this.A0B = com.facebook.ads.redexgen.core.C05539h.A0K(super.A02.A0V);
        this.A0F = com.facebook.ads.redexgen.core.C05539h.A0S(i3, false);
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            if (i6 >= c05549i.A0I.size()) {
                break;
            }
            int A02 = com.facebook.ads.redexgen.core.C05539h.A02(super.A02, c05549i.A0I.get(i6), false);
            if (A02 > 0) {
                i5 = i6;
                i4 = A02;
                break;
            }
            i6++;
        }
        this.A04 = i5;
        this.A05 = i4;
        A00 = com.facebook.ads.redexgen.core.C05539h.A00(super.A02.A0E, ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A0B);
        this.A07 = A00;
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A02) && interfaceC1867kj.A4C(super.A02);
        java.lang.String[] A1L = com.facebook.ads.redexgen.core.C5C.A1L();
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= A1L.length) {
                break;
            }
            int A022 = com.facebook.ads.redexgen.core.C05539h.A02(super.A02, A1L[i9], false);
            if (A022 > 0) {
                i7 = i9;
                i8 = A022;
                break;
            }
            i9++;
        }
        this.A02 = i7;
        this.A03 = i8;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 < c05549i.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c05549i.A0J.get(i11))) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.A06 = i10;
        this.A0H = com.facebook.ads.redexgen.core.AbstractC05087i.A02(i3) == 128;
        this.A0G = com.facebook.ads.redexgen.core.AbstractC05087i.A04(i3) == 64;
        this.A09 = A00(i3, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(java.util.List<com.facebook.ads.redexgen.core.C2016nM> list, java.util.List<com.facebook.ads.redexgen.core.C2016nM> list2) {
        return ((com.facebook.ads.redexgen.core.C2016nM) java.util.Collections.max(list)).compareTo((com.facebook.ads.redexgen.core.C2016nM) java.util.Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2016nM> A03(int i, com.facebook.ads.redexgen.core.C2159pg c2159pg, com.facebook.ads.redexgen.core.C05549i c05549i, int[] iArr, boolean z, com.facebook.ads.redexgen.core.InterfaceC1867kj<com.facebook.ads.redexgen.core.C2196qI> interfaceC1867kj) {
        com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
        for (int i2 = 0; i2 < c2159pg.A01; i2++) {
            A01.A04(new com.facebook.ads.redexgen.core.C2016nM(i, c2159pg, i2, c05549i, iArr[i2], z, interfaceC1867kj));
        }
        return A01.A05();
    }

    private int A00(int i, boolean z) {
        if (!com.facebook.ads.redexgen.core.C05539h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (com.facebook.ads.redexgen.core.C05539h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C2016nM c2016nM) {
        com.facebook.ads.redexgen.core.AbstractC2198qK abstractC2198qK;
        com.facebook.ads.redexgen.core.AbstractC2198qK A06;
        com.facebook.ads.redexgen.core.AbstractC2198qK abstractC2198qK2;
        com.facebook.ads.redexgen.core.AbstractC2198qK abstractC2198qK3;
        if (!this.A0E || !this.A0F) {
            abstractC2198qK = com.facebook.ads.redexgen.core.C05539h.A09;
            A06 = abstractC2198qK.A06();
        } else {
            A06 = com.facebook.ads.redexgen.core.C05539h.A09;
        }
        com.facebook.ads.redexgen.core.AbstractC2048ns A08 = com.facebook.ads.redexgen.core.AbstractC2048ns.A01().A09(this.A0F, c2016nM.A0F).A08(java.lang.Integer.valueOf(this.A04), java.lang.Integer.valueOf(c2016nM.A04), com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06()).A06(this.A05, c2016nM.A05).A06(this.A07, c2016nM.A07).A09(this.A0D, c2016nM.A0D).A09(this.A0C, c2016nM.A0C).A08(java.lang.Integer.valueOf(this.A02), java.lang.Integer.valueOf(c2016nM.A02), com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06()).A06(this.A03, c2016nM.A03).A09(this.A0E, c2016nM.A0E).A08(java.lang.Integer.valueOf(this.A06), java.lang.Integer.valueOf(c2016nM.A06), com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.A00);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c2016nM.A00);
        if (this.A0A.A0O) {
            abstractC2198qK3 = com.facebook.ads.redexgen.core.C05539h.A09;
            abstractC2198qK2 = abstractC2198qK3.A06();
        } else {
            abstractC2198qK2 = com.facebook.ads.redexgen.core.C05539h.A0A;
        }
        com.facebook.ads.redexgen.core.AbstractC2048ns A082 = A08.A08(valueOf, valueOf2, abstractC2198qK2).A09(this.A0H, c2016nM.A0H).A09(this.A0G, c2016nM.A0G).A08(java.lang.Integer.valueOf(this.A01), java.lang.Integer.valueOf(c2016nM.A01), A06).A08(java.lang.Integer.valueOf(this.A08), java.lang.Integer.valueOf(c2016nM.A08), A06);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.A00);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c2016nM.A00);
        if (!com.facebook.ads.redexgen.core.C5C.A1E(this.A0B, c2016nM.A0B)) {
            A06 = com.facebook.ads.redexgen.core.C05539h.A0A;
        }
        return A082.A08(valueOf3, valueOf4, A06).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == ((com.facebook.ads.redexgen.core.AbstractC0670Eh) r6).A02.A06) goto L10;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC0670Eh
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09(com.facebook.ads.redexgen.core.C2016nM c2016nM) {
        if (!this.A0A.A00) {
            if (super.A02.A06 != -1) {
                int i = super.A02.A06;
                java.lang.String[] strArr = A0I;
                if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0I;
                strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
                strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            }
        }
        return (this.A0A.A02 || (super.A02.A0W != null && android.text.TextUtils.equals(super.A02.A0W, ((com.facebook.ads.redexgen.core.AbstractC0670Eh) c2016nM).A02.A0W))) && (this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((com.facebook.ads.redexgen.core.AbstractC0670Eh) c2016nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2016nM.A0H && this.A0G == c2016nM.A0G));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0670Eh
    public final int A08() {
        return this.A09;
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC05559j implements com.facebook.ads.redexgen.core.InterfaceC2008nE {
    public int A00;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final com.facebook.ads.redexgen.core.C2196qI[] A04;
    public final int A05;
    public final com.facebook.ads.redexgen.core.C2159pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC05559j(com.facebook.ads.redexgen.core.C2159pg c2159pg, int[] iArr, int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (com.facebook.ads.redexgen.core.C2159pg) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2159pg);
        this.A05 = iArr.length;
        this.A04 = new com.facebook.ads.redexgen.core.C2196qI[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr = this.A04;
            int i3 = iArr[i2];
            c2196qIArr[i2] = c2159pg.A08(i3);
        }
        java.util.Arrays.sort(this.A04, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.facebook.ads.redexgen.core.AbstractC05559j.A07((com.facebook.ads.redexgen.core.C2196qI) obj, (com.facebook.ads.redexgen.core.C2196qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c2159pg.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C2196qI c2196qI2) {
        return c2196qI2.A05 - c2196qI.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2008nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2008nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0679Eq
    public final com.facebook.ads.redexgen.core.C2196qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0679Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2008nE
    public final com.facebook.ads.redexgen.core.C2196qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0679Eq
    public final com.facebook.ads.redexgen.core.C2159pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0679Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2008nE
    public void AFJ(float f) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.AbstractC05559j abstractC05559j = (com.facebook.ads.redexgen.core.AbstractC05559j) obj;
        return this.A06 == abstractC05559j.A06 && java.util.Arrays.equals(this.A07, abstractC05559j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (java.lang.System.identityHashCode(this.A06) * 31) + java.util.Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0679Eq
    public final int length() {
        return this.A07.length;
    }
}

package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0677Eo {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2026nW A01;
    public final int[] A02;
    public final int[] A03;
    public final com.facebook.ads.redexgen.core.C2026nW[] A04;
    public final java.lang.String[] A05;
    public final int[][][] A06;

    public C0677Eo(java.lang.String[] strArr, int[] iArr, com.facebook.ads.redexgen.core.C2026nW[] c2026nWArr, int[] iArr2, int[][][] iArr3, com.facebook.ads.redexgen.core.C2026nW c2026nW) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c2026nWArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c2026nW;
        this.A00 = iArr.length;
    }

    private final int A00(int i, int i2, int i3) {
        return this.A06[i][i2][i3];
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int A01(int i, int i2, int[] iArr) {
        int i3 = 0;
        int i4 = 16;
        boolean z = false;
        java.lang.String str = null;
        int i5 = 0;
        while (i5 < handledTrackCount) {
            int adaptiveSupport = iArr[i5];
            java.lang.String firstSampleMimeType = this.A04[i].A05(i2).A08(adaptiveSupport).A0W;
            int adaptiveSupport2 = i3 + 1;
            if (i3 == 0) {
                str = firstSampleMimeType;
            } else {
                z = (!com.facebook.ads.redexgen.core.C5C.A1E(str, firstSampleMimeType)) | z;
            }
            i4 = java.lang.Math.min(i4, com.facebook.ads.redexgen.core.AbstractC05087i.A01(this.A06[i][i2][i5]));
            i5++;
            i3 = adaptiveSupport2;
        }
        if (z) {
            int handledTrackCount = this.A02[i];
            return java.lang.Math.min(i4, handledTrackCount);
        }
        return i4;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i) {
        return this.A03[i];
    }

    public final int A04(int i, int i2, int i3) {
        return com.facebook.ads.redexgen.core.AbstractC05087i.A03(A00(i, i2, i3));
    }

    public final int A05(int i, int i2, boolean z) {
        int i3 = this.A04[i].A05(i2).A01;
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i3; trackIndexCount++) {
            int A04 = A04(i, i2, trackIndexCount);
            if (A04 == 4 || (z && A04 == 3)) {
                int trackCount = i4 + 1;
                iArr[i4] = trackIndexCount;
                i4 = trackCount;
            }
        }
        int trackCount2 = A01(i, i2, java.util.Arrays.copyOf(iArr, i4));
        return trackCount2;
    }

    public final com.facebook.ads.redexgen.core.C2026nW A06() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.C2026nW A07(int i) {
        return this.A04[i];
    }
}

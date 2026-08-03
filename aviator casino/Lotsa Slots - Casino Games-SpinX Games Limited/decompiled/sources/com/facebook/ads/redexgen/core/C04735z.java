package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04735z {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final android.media.MediaCodec.CryptoInfo A08 = new android.media.MediaCodec.CryptoInfo();
    public final com.facebook.ads.redexgen.core.C04725y A09;

    public C04735z() {
        this.A09 = com.facebook.ads.redexgen.core.C5C.A02 >= 24 ? new com.facebook.ads.redexgen.core.C04725y(this.A08) : null;
    }

    public final android.media.MediaCodec.CryptoInfo A00() {
        return this.A08;
    }

    public final void A01(int i) {
        if (i == 0) {
            return;
        }
        if (this.A06 == null) {
            this.A06 = new int[1];
            this.A08.numBytesOfClearData = this.A06;
        }
        int[] iArr = this.A06;
        iArr[0] = iArr[0] + i;
    }

    public final void A02(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.A03 = i;
        this.A06 = iArr;
        this.A07 = iArr2;
        this.A05 = bArr;
        this.A04 = bArr2;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A08.numSubSamples = i;
        this.A08.numBytesOfClearData = iArr;
        this.A08.numBytesOfEncryptedData = iArr2;
        this.A08.key = bArr;
        this.A08.iv = bArr2;
        this.A08.mode = i2;
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 24) {
            ((com.facebook.ads.redexgen.core.C04725y) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A09)).A00(i3, i4);
        }
    }
}

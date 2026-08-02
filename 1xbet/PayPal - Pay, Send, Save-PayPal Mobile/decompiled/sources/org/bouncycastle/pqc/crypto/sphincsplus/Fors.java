package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
class Fors {
    org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.sphincsplus.WotsPlus getHighSpeedVideoSizes;

    public final byte[] getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.sphincsplus.SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        int i;
        int i2 = 2;
        byte[][] bArr3 = new byte[2][];
        byte[][] bArr4 = new byte[this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes][];
        int i3 = this.getHighSpeedVideoFpsRanges.getInputFormats;
        int[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            int i6 = highSpeedVideoSizes[i5];
            byte[] bArr5 = sig_forsArr[i5].getHighSpeedVideoSizes;
            int i7 = 24;
            org.bouncycastle.util.Pack.intToBigEndian(i4, adrs.getHighSpeedVideoFpsRanges, 24);
            int i8 = (i5 * i3) + i6;
            int i9 = 28;
            org.bouncycastle.util.Pack.intToBigEndian(i8, adrs.getHighSpeedVideoFpsRanges, 28);
            bArr3[i4] = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(bArr2, adrs, bArr5);
            byte[][] bArr6 = sig_forsArr[i5].getHighSpeedVideoFpsRanges;
            org.bouncycastle.util.Pack.intToBigEndian(i8, adrs.getHighSpeedVideoFpsRanges, 28);
            int i10 = i4;
            while (i10 < this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI) {
                int i11 = i10 + 1;
                org.bouncycastle.util.Pack.intToBigEndian(i11, adrs.getHighSpeedVideoFpsRanges, i7);
                if ((i6 / (1 << i10)) % 2 == 0) {
                    org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs.getHighSpeedVideoFpsRanges, i9) / i2, adrs.getHighSpeedVideoFpsRanges, i9);
                    bArr3[1] = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(bArr2, adrs, bArr3[0], bArr6[i10]);
                    i = 0;
                } else {
                    org.bouncycastle.util.Pack.intToBigEndian((org.bouncycastle.util.Pack.bigEndianToInt(adrs.getHighSpeedVideoFpsRanges, 28) - 1) / 2, adrs.getHighSpeedVideoFpsRanges, 28);
                    i = 0;
                    bArr3[1] = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(bArr2, adrs, bArr6[i10], bArr3[0]);
                }
                bArr3[i] = bArr3[1];
                i10 = i11;
                i4 = i;
                i2 = 2;
                i7 = 24;
                i9 = 28;
            }
            bArr4[i5] = bArr3[i4];
            i5++;
            i2 = 2;
            i4 = 0;
        }
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
        org.bouncycastle.util.Pack.intToBigEndian(4, adrs2.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr7 = adrs2.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr7, 20, bArr7.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs.getHighSpeedVideoFpsRanges, 20), adrs2.getHighSpeedVideoFpsRanges, 20);
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(bArr2, adrs2, org.bouncycastle.util.Arrays.concatenate(bArr4));
    }

    static int[] getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i4] = iArr[i4] ^ (((bArr[i3 >> 3] >> (i3 & 7)) & 1) << i5);
                i3++;
            }
        }
        return iArr;
    }

    public Fors(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.getHighSpeedVideoFpsRanges = sPHINCSPlusEngine;
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.sphincsplus.WotsPlus(sPHINCSPlusEngine);
    }
}

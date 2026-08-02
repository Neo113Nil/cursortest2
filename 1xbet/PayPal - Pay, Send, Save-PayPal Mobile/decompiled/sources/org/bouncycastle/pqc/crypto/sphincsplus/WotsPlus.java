package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
class WotsPlus {
    final org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;

    byte[] getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        if (i2 == 0) {
            return org.bouncycastle.util.Arrays.clone(bArr);
        }
        int i3 = i + i2;
        if (i3 > this.getHighResolutionOutputSizeshNQ4ISI - 1) {
            return null;
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i, i2 - 1, bArr2, adrs);
        org.bouncycastle.util.Pack.intToBigEndian(i3 - 1, adrs.getHighSpeedVideoFpsRanges, 28);
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(bArr2, adrs, highSpeedVideoFpsRanges);
    }

    final byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
        byte[][] bArr3 = new byte[this.Camera2StreamConfigurationMap.getOutputFormats][];
        for (int i = 0; i < this.Camera2StreamConfigurationMap.getOutputFormats; i++) {
            org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs3 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
            org.bouncycastle.util.Pack.intToBigEndian(i, adrs3.getHighSpeedVideoFpsRanges, 24);
            org.bouncycastle.util.Pack.intToBigEndian(0, adrs3.getHighSpeedVideoFpsRanges, 28);
            bArr3[i] = getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr, adrs3), 0, this.getHighResolutionOutputSizeshNQ4ISI - 1, bArr2, adrs3);
        }
        org.bouncycastle.util.Pack.intToBigEndian(1, adrs2.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr4 = adrs2.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr4, 20, bArr4.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs.getHighSpeedVideoFpsRanges, 20), adrs2.getHighSpeedVideoFpsRanges, 20);
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr2, adrs2, org.bouncycastle.util.Arrays.concatenate(bArr3));
    }

    public final byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
        int[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI);
        int i = 0;
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI; i2++) {
            i += (this.getHighResolutionOutputSizeshNQ4ISI - 1) - highSpeedVideoFpsRangesFor[i2];
        }
        if (this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM % 8 != 0) {
            i <<= 8 - ((this.Camera2StreamConfigurationMap.getOutputMinFrameDuration * this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM) % 8);
        }
        int i3 = ((this.Camera2StreamConfigurationMap.getOutputMinFrameDuration * this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM) + 7) / 8;
        byte[] intToBigEndian = org.bouncycastle.util.Pack.intToBigEndian(i);
        int[] concatenate = org.bouncycastle.util.Arrays.concatenate(highSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(org.bouncycastle.util.Arrays.copyOfRange(intToBigEndian, i3, intToBigEndian.length), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getOutputMinFrameDuration));
        byte[][] bArr4 = new byte[this.Camera2StreamConfigurationMap.getOutputFormats][];
        for (int i4 = 0; i4 < this.Camera2StreamConfigurationMap.getOutputFormats; i4++) {
            org.bouncycastle.util.Pack.intToBigEndian(i4, adrs2.getHighSpeedVideoFpsRanges, 24);
            org.bouncycastle.util.Pack.intToBigEndian(0, adrs2.getHighSpeedVideoFpsRanges, 28);
            bArr4[i4] = getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr2, adrs2), 0, concatenate[i4], bArr3, adrs2);
        }
        return org.bouncycastle.util.Arrays.concatenate(bArr4);
    }

    int[] getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            if (i3 == 0) {
                i6 = bArr[i4];
                i4++;
                i3 += 8;
            }
            i3 -= this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
            iArr[i5] = (i6 >>> i3) & (i - 1);
            i5++;
        }
        return iArr;
    }

    WotsPlus(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.Camera2StreamConfigurationMap = sPHINCSPlusEngine;
        this.getHighResolutionOutputSizeshNQ4ISI = sPHINCSPlusEngine.getOutputSizes;
    }
}

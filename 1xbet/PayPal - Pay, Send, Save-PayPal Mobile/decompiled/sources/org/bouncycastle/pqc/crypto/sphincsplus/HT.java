package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
class HT {
    org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine Camera2StreamConfigurationMap;
    final byte[] getHighResolutionOutputSizeshNQ4ISI;
    final byte[] getHighSpeedVideoFpsRanges;
    org.bouncycastle.pqc.crypto.sphincsplus.WotsPlus getHighSpeedVideoFpsRangesFor;
    final byte[] getHighSpeedVideoSizes;

    public HT(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine, byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        this.Camera2StreamConfigurationMap = sPHINCSPlusEngine;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.sphincsplus.WotsPlus(sPHINCSPlusEngine);
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS();
        org.bouncycastle.util.Pack.intToBigEndian(sPHINCSPlusEngine.getHighSpeedVideoFpsRanges - 1, adrs.getHighSpeedVideoFpsRanges, 0);
        org.bouncycastle.util.Pack.longToBigEndian(0L, adrs.getHighSpeedVideoFpsRanges, 8);
        if (bArr != null) {
            this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(bArr, 0, this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor, bArr2, adrs);
        } else {
            this.getHighSpeedVideoSizes = null;
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i3 = 1 << i2;
        if (i % i3 != 0) {
            return null;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            org.bouncycastle.util.Pack.intToBigEndian(0, adrs2.getHighSpeedVideoFpsRanges, 16);
            byte[] bArr3 = adrs2.getHighSpeedVideoFpsRanges;
            org.bouncycastle.util.Arrays.fill(bArr3, 20, bArr3.length, (byte) 0);
            int i5 = i + i4;
            org.bouncycastle.util.Pack.intToBigEndian(i5, adrs2.getHighSpeedVideoFpsRanges, 20);
            byte[] highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(bArr, bArr2, adrs2);
            org.bouncycastle.util.Pack.intToBigEndian(2, adrs2.getHighSpeedVideoFpsRanges, 16);
            byte[] bArr4 = adrs2.getHighSpeedVideoFpsRanges;
            org.bouncycastle.util.Arrays.fill(bArr4, 20, bArr4.length, (byte) 0);
            org.bouncycastle.util.Pack.intToBigEndian(1, adrs2.getHighSpeedVideoFpsRanges, 24);
            org.bouncycastle.util.Pack.intToBigEndian(i5, adrs2.getHighSpeedVideoFpsRanges, 28);
            while (!linkedList.isEmpty() && ((org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry) linkedList.get(0)).getHighSpeedVideoSizes == org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 24)) {
                org.bouncycastle.util.Pack.intToBigEndian((org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 28) - 1) / 2, adrs2.getHighSpeedVideoFpsRanges, 28);
                highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(bArr2, adrs2, ((org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry) linkedList.remove(0)).Camera2StreamConfigurationMap, highSpeedVideoSizes);
                org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 24) + 1, adrs2.getHighSpeedVideoFpsRanges, 24);
            }
            linkedList.add(0, new org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry(highSpeedVideoSizes, org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 24)));
        }
        return ((org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry) linkedList.get(0)).Camera2StreamConfigurationMap;
    }

    final byte[] Camera2StreamConfigurationMap(int i, org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        int i2;
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
        int i3 = 0;
        org.bouncycastle.util.Pack.intToBigEndian(0, adrs2.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr3 = adrs2.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr3, 20, bArr3.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(i, adrs2.getHighSpeedVideoFpsRanges, 20);
        byte[] bArr4 = sig_xmss.Camera2StreamConfigurationMap;
        byte[][] bArr5 = sig_xmss.getHighSpeedVideoFpsRanges;
        org.bouncycastle.pqc.crypto.sphincsplus.WotsPlus wotsPlus = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs3 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs2);
        int[] highSpeedVideoFpsRangesFor = wotsPlus.getHighSpeedVideoFpsRangesFor(bArr, wotsPlus.getHighResolutionOutputSizeshNQ4ISI, wotsPlus.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= wotsPlus.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI) {
                break;
            }
            i5 += (wotsPlus.getHighResolutionOutputSizeshNQ4ISI - 1) - highSpeedVideoFpsRangesFor[i4];
            i4++;
        }
        int[] concatenate = org.bouncycastle.util.Arrays.concatenate(highSpeedVideoFpsRangesFor, wotsPlus.getHighSpeedVideoFpsRangesFor(org.bouncycastle.util.Arrays.copyOfRange(org.bouncycastle.util.Pack.intToBigEndian(i5 << (8 - ((wotsPlus.Camera2StreamConfigurationMap.getOutputMinFrameDuration * wotsPlus.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM) % 8))), 4 - (((wotsPlus.Camera2StreamConfigurationMap.getOutputMinFrameDuration * wotsPlus.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM) + 7) / 8), 4), wotsPlus.getHighResolutionOutputSizeshNQ4ISI, wotsPlus.Camera2StreamConfigurationMap.getOutputMinFrameDuration));
        byte[] bArr6 = new byte[wotsPlus.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor];
        byte[][] bArr7 = new byte[wotsPlus.Camera2StreamConfigurationMap.getOutputFormats][];
        int i6 = 0;
        while (i6 < wotsPlus.Camera2StreamConfigurationMap.getOutputFormats) {
            org.bouncycastle.util.Pack.intToBigEndian(i6, adrs2.getHighSpeedVideoFpsRanges, 24);
            java.lang.System.arraycopy(bArr4, wotsPlus.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor * i6, bArr6, i3, wotsPlus.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor);
            int i7 = concatenate[i6];
            int i8 = (wotsPlus.getHighResolutionOutputSizeshNQ4ISI - i2) - i7;
            int i9 = i6;
            byte[][] bArr8 = bArr7;
            bArr8[i9] = wotsPlus.getHighSpeedVideoFpsRanges(bArr6, i7, i8, bArr2, adrs2);
            i6 = i9 + 1;
            adrs3 = adrs3;
            bArr7 = bArr8;
            i2 = 1;
            i3 = 0;
        }
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs4 = adrs3;
        org.bouncycastle.util.Pack.intToBigEndian(1, adrs4.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr9 = adrs4.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr9, 20, bArr9.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 20), adrs4.getHighSpeedVideoFpsRanges, 20);
        byte[] highSpeedVideoFpsRangesFor2 = wotsPlus.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr2, adrs4, org.bouncycastle.util.Arrays.concatenate(bArr7));
        org.bouncycastle.util.Pack.intToBigEndian(2, adrs2.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr10 = adrs2.getHighSpeedVideoFpsRanges;
        int i10 = 0;
        org.bouncycastle.util.Arrays.fill(bArr10, 20, bArr10.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(i, adrs2.getHighSpeedVideoFpsRanges, 28);
        while (i10 < this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            int i11 = i10 + 1;
            org.bouncycastle.util.Pack.intToBigEndian(i11, adrs2.getHighSpeedVideoFpsRanges, 24);
            if ((i / (1 << i10)) % 2 == 0) {
                org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 28) / 2, adrs2.getHighSpeedVideoFpsRanges, 28);
                highSpeedVideoFpsRangesFor2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(bArr2, adrs2, highSpeedVideoFpsRangesFor2, bArr5[i10]);
            } else {
                org.bouncycastle.util.Pack.intToBigEndian((org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 28) - 1) / 2, adrs2.getHighSpeedVideoFpsRanges, 28);
                highSpeedVideoFpsRangesFor2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(bArr2, adrs2, bArr5[i10], highSpeedVideoFpsRangesFor2);
            }
            i10 = i11;
        }
        return highSpeedVideoFpsRangesFor2;
    }

    final org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        byte[][] bArr4 = new byte[this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor][];
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor; i2++) {
            int i3 = 1 << i2;
            bArr4[i2] = getHighResolutionOutputSizeshNQ4ISI(bArr2, (1 ^ (i / i3)) * i3, i2, bArr3, adrs);
        }
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
        org.bouncycastle.util.Pack.intToBigEndian(0, adrs2.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr5 = adrs2.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr5, 20, bArr5.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(i, adrs2.getHighSpeedVideoFpsRanges, 20);
        return new org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(bArr, bArr2, bArr3, adrs2), bArr4);
    }
}

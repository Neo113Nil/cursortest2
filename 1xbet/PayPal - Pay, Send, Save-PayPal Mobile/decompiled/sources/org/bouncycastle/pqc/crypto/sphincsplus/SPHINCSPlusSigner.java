package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
public class SPHINCSPlusSigner implements org.bouncycastle.pqc.crypto.MessageSigner {
    private org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        int i;
        int i2;
        org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i3;
        org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine2 = this.Camera2StreamConfigurationMap.getParameters().getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr5 = new byte[sPHINCSPlusEngine2.getHighSpeedVideoSizesFor];
        java.security.SecureRandom secureRandom = this.getHighResolutionOutputSizeshNQ4ISI;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr5);
        }
        org.bouncycastle.pqc.crypto.sphincsplus.Fors fors = new org.bouncycastle.pqc.crypto.sphincsplus.Fors(sPHINCSPlusEngine2);
        byte[] highResolutionOutputSizeshNQ4ISI = sPHINCSPlusEngine2.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes, bArr5, bArr);
        org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest highSpeedVideoFpsRangesFor = sPHINCSPlusEngine2.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getHighSpeedVideoSizes, bArr);
        byte[] bArr6 = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
        long j = highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS();
        org.bouncycastle.util.Pack.intToBigEndian(3, adrs.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr7 = adrs.getHighSpeedVideoFpsRanges;
        int i5 = 0;
        org.bouncycastle.util.Arrays.fill(bArr7, 20, bArr7.length, (byte) 0);
        org.bouncycastle.util.Pack.longToBigEndian(j, adrs.getHighSpeedVideoFpsRanges, 8);
        org.bouncycastle.util.Pack.intToBigEndian(i4, adrs.getHighSpeedVideoFpsRanges, 20);
        byte[] bArr8 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        byte[] bArr9 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
        int[] highSpeedVideoSizes = org.bouncycastle.pqc.crypto.sphincsplus.Fors.getHighSpeedVideoSizes(bArr6, fors.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes, fors.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
        int i6 = fors.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        org.bouncycastle.pqc.crypto.sphincsplus.SIG_FORS[] sig_forsArr = new org.bouncycastle.pqc.crypto.sphincsplus.SIG_FORS[i6];
        int i7 = fors.getHighSpeedVideoFpsRanges.getInputFormats;
        while (true) {
            i = i6;
            if (i5 >= fors.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
                break;
            }
            int i8 = highSpeedVideoSizes[i5];
            int[] iArr = highSpeedVideoSizes;
            int i9 = i4;
            org.bouncycastle.util.Pack.intToBigEndian(0, adrs.getHighSpeedVideoFpsRanges, 24);
            int i10 = i5 * i7;
            int i11 = i7;
            org.bouncycastle.util.Pack.intToBigEndian(i10 + i8, adrs.getHighSpeedVideoFpsRanges, 28);
            byte[] highSpeedVideoFpsRangesFor2 = fors.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(bArr8, adrs);
            byte[][] bArr10 = new byte[fors.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI][];
            long j2 = j;
            int i12 = 0;
            while (i12 < fors.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI) {
                int i13 = 1 << i12;
                int i14 = (((i8 / i13) ^ 1) * i13) + i10;
                org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS(adrs);
                int i15 = i10;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (i14 % i13 != 0) {
                    bArr4 = null;
                    sPHINCSPlusEngine = sPHINCSPlusEngine2;
                    i2 = i8;
                    bArr2 = bArr6;
                    bArr3 = bArr8;
                } else {
                    i2 = i8;
                    int i16 = 0;
                    while (i16 < i13) {
                        int i17 = i13;
                        org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine3 = sPHINCSPlusEngine2;
                        byte[] bArr11 = bArr6;
                        org.bouncycastle.util.Pack.intToBigEndian(0, adrs2.getHighSpeedVideoFpsRanges, 24);
                        int i18 = i14 + i16;
                        org.bouncycastle.util.Pack.intToBigEndian(i18, adrs2.getHighSpeedVideoFpsRanges, 28);
                        byte[] Camera2StreamConfigurationMap = fors.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(bArr9, adrs2, fors.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(bArr8, adrs2));
                        byte[] bArr12 = bArr8;
                        int i19 = 24;
                        org.bouncycastle.util.Pack.intToBigEndian(1, adrs2.getHighSpeedVideoFpsRanges, 24);
                        org.bouncycastle.util.Pack.intToBigEndian(i18, adrs2.getHighSpeedVideoFpsRanges, 28);
                        byte[] bArr13 = Camera2StreamConfigurationMap;
                        while (true) {
                            if (linkedList.isEmpty()) {
                                i3 = i19;
                                break;
                            }
                            if (((org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry) linkedList.get(0)).getHighSpeedVideoSizes != org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, i19)) {
                                i3 = 24;
                                break;
                            }
                            org.bouncycastle.util.Pack.intToBigEndian((org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 28) - 1) / 2, adrs2.getHighSpeedVideoFpsRanges, 28);
                            bArr13 = fors.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(bArr9, adrs2, ((org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry) linkedList.remove(0)).Camera2StreamConfigurationMap, bArr13);
                            org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, 24) + 1, adrs2.getHighSpeedVideoFpsRanges, 24);
                            i19 = 24;
                        }
                        linkedList.add(0, new org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry(bArr13, org.bouncycastle.util.Pack.bigEndianToInt(adrs2.getHighSpeedVideoFpsRanges, i3)));
                        i16++;
                        i13 = i17;
                        sPHINCSPlusEngine2 = sPHINCSPlusEngine3;
                        bArr6 = bArr11;
                        bArr8 = bArr12;
                    }
                    sPHINCSPlusEngine = sPHINCSPlusEngine2;
                    bArr2 = bArr6;
                    bArr3 = bArr8;
                    bArr4 = ((org.bouncycastle.pqc.crypto.sphincsplus.NodeEntry) linkedList.get(0)).Camera2StreamConfigurationMap;
                }
                bArr10[i12] = bArr4;
                i12++;
                i10 = i15;
                i8 = i2;
                sPHINCSPlusEngine2 = sPHINCSPlusEngine;
                bArr6 = bArr2;
                bArr8 = bArr3;
            }
            sig_forsArr[i5] = new org.bouncycastle.pqc.crypto.sphincsplus.SIG_FORS(highSpeedVideoFpsRangesFor2, bArr10);
            i5++;
            i6 = i;
            highSpeedVideoSizes = iArr;
            i4 = i9;
            i7 = i11;
            j = j2;
        }
        int i20 = i4;
        org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine4 = sPHINCSPlusEngine2;
        long j3 = j;
        byte[] highSpeedVideoSizes2 = fors.getHighSpeedVideoSizes(sig_forsArr, bArr6, this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges, adrs);
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs3 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS();
        org.bouncycastle.util.Pack.intToBigEndian(2, adrs3.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr14 = adrs3.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr14, 20, bArr14.length, (byte) 0);
        org.bouncycastle.pqc.crypto.sphincsplus.HT ht = new org.bouncycastle.pqc.crypto.sphincsplus.HT(sPHINCSPlusEngine4, this.Camera2StreamConfigurationMap.getSeed(), this.Camera2StreamConfigurationMap.getPublicSeed());
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs4 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS();
        org.bouncycastle.util.Pack.intToBigEndian(0, adrs4.getHighSpeedVideoFpsRanges, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j3, adrs4.getHighSpeedVideoFpsRanges, 8);
        org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS highSpeedVideoFpsRangesFor3 = ht.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2, ht.getHighSpeedVideoFpsRanges, i20, ht.getHighResolutionOutputSizeshNQ4ISI, adrs4);
        int i21 = ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
        org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS[] sig_xmssArr = new org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS[i21];
        sig_xmssArr[0] = highSpeedVideoFpsRangesFor3;
        org.bouncycastle.util.Pack.intToBigEndian(0, adrs4.getHighSpeedVideoFpsRanges, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j3, adrs4.getHighSpeedVideoFpsRanges, 8);
        long j4 = j3;
        byte[] Camera2StreamConfigurationMap2 = ht.Camera2StreamConfigurationMap(i20, highSpeedVideoFpsRangesFor3, highSpeedVideoSizes2, ht.getHighResolutionOutputSizeshNQ4ISI, adrs4);
        int i22 = 1;
        while (i22 < ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges) {
            int i23 = (int) (((1 << ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) - 1) & j4);
            long j5 = j4 >>> ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.util.Pack.intToBigEndian(i22, adrs4.getHighSpeedVideoFpsRanges, 0);
            org.bouncycastle.util.Pack.longToBigEndian(j5, adrs4.getHighSpeedVideoFpsRanges, 8);
            org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS highSpeedVideoFpsRangesFor4 = ht.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2, ht.getHighSpeedVideoFpsRanges, i23, ht.getHighResolutionOutputSizeshNQ4ISI, adrs4);
            sig_xmssArr[i22] = highSpeedVideoFpsRangesFor4;
            if (i22 < ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges - 1) {
                Camera2StreamConfigurationMap2 = ht.Camera2StreamConfigurationMap(i23, highSpeedVideoFpsRangesFor4, Camera2StreamConfigurationMap2, ht.getHighResolutionOutputSizeshNQ4ISI, adrs4);
            }
            i22++;
            j4 = j5;
        }
        byte[][] bArr15 = new byte[i21][];
        for (int i24 = 0; i24 != i21; i24++) {
            bArr15[i24] = org.bouncycastle.util.Arrays.concatenate(sig_xmssArr[i24].Camera2StreamConfigurationMap, org.bouncycastle.util.Arrays.concatenate(sig_xmssArr[i24].getHighSpeedVideoFpsRanges));
        }
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr15);
        byte[][] bArr16 = new byte[i + 2][];
        int i25 = 0;
        bArr16[0] = highResolutionOutputSizeshNQ4ISI;
        while (i25 != i) {
            int i26 = i25 + 1;
            bArr16[i26] = org.bouncycastle.util.Arrays.concatenate(sig_forsArr[i25].getHighSpeedVideoSizes, org.bouncycastle.util.Arrays.concatenate(sig_forsArr[i25].getHighSpeedVideoFpsRanges));
            i25 = i26;
        }
        bArr16[i + 1] = concatenate;
        return org.bouncycastle.util.Arrays.concatenate(bArr16);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine = this.getHighSpeedVideoFpsRanges.getParameters().getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS();
        org.bouncycastle.pqc.crypto.sphincsplus.SIG sig = new org.bouncycastle.pqc.crypto.sphincsplus.SIG(sPHINCSPlusEngine.getHighSpeedVideoSizesFor, sPHINCSPlusEngine.getHighSpeedVideoSizes, sPHINCSPlusEngine.getHighResolutionOutputSizeshNQ4ISI, sPHINCSPlusEngine.getHighSpeedVideoFpsRanges, sPHINCSPlusEngine.getHighSpeedVideoFpsRangesFor, sPHINCSPlusEngine.getOutputFormats, bArr2);
        byte[] bArr3 = sig.getHighSpeedVideoFpsRanges;
        org.bouncycastle.pqc.crypto.sphincsplus.SIG_FORS[] sig_forsArr = sig.getHighSpeedVideoSizes;
        org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS[] sig_xmssArr = sig.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest highSpeedVideoFpsRangesFor = sPHINCSPlusEngine.getHighSpeedVideoFpsRangesFor(bArr3, this.getHighSpeedVideoFpsRanges.getSeed(), this.getHighSpeedVideoFpsRanges.getRoot(), bArr);
        byte[] bArr4 = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
        long j = highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        int i = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Pack.intToBigEndian(0, adrs.getHighSpeedVideoFpsRanges, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j, adrs.getHighSpeedVideoFpsRanges, 8);
        org.bouncycastle.util.Pack.intToBigEndian(3, adrs.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr5 = adrs.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr5, 20, bArr5.length, (byte) 0);
        org.bouncycastle.util.Pack.intToBigEndian(i, adrs.getHighSpeedVideoFpsRanges, 20);
        byte[] highSpeedVideoSizes = new org.bouncycastle.pqc.crypto.sphincsplus.Fors(sPHINCSPlusEngine).getHighSpeedVideoSizes(sig_forsArr, bArr4, this.getHighSpeedVideoFpsRanges.getSeed(), adrs);
        org.bouncycastle.util.Pack.intToBigEndian(2, adrs.getHighSpeedVideoFpsRanges, 16);
        byte[] bArr6 = adrs.getHighSpeedVideoFpsRanges;
        org.bouncycastle.util.Arrays.fill(bArr6, 20, bArr6.length, (byte) 0);
        org.bouncycastle.pqc.crypto.sphincsplus.HT ht = new org.bouncycastle.pqc.crypto.sphincsplus.HT(sPHINCSPlusEngine, null, this.getHighSpeedVideoFpsRanges.getSeed());
        byte[] seed = this.getHighSpeedVideoFpsRanges.getSeed();
        byte[] root = this.getHighSpeedVideoFpsRanges.getRoot();
        org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs2 = new org.bouncycastle.pqc.crypto.sphincsplus.ADRS();
        org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS sig_xmss = sig_xmssArr[0];
        org.bouncycastle.util.Pack.intToBigEndian(0, adrs2.getHighSpeedVideoFpsRanges, 0);
        org.bouncycastle.util.Pack.longToBigEndian(j, adrs2.getHighSpeedVideoFpsRanges, 8);
        byte[] Camera2StreamConfigurationMap = ht.Camera2StreamConfigurationMap(i, sig_xmss, highSpeedVideoSizes, seed, adrs2);
        for (int i2 = 1; i2 < ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges; i2++) {
            int i3 = (int) (((1 << ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) - 1) & j);
            j >>>= ht.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.pqc.crypto.sphincsplus.SIG_XMSS sig_xmss2 = sig_xmssArr[i2];
            org.bouncycastle.util.Pack.intToBigEndian(i2, adrs2.getHighSpeedVideoFpsRanges, 0);
            org.bouncycastle.util.Pack.longToBigEndian(j, adrs2.getHighSpeedVideoFpsRanges, 8);
            Camera2StreamConfigurationMap = ht.Camera2StreamConfigurationMap(i3, sig_xmss2, Camera2StreamConfigurationMap, seed, adrs2);
        }
        return org.bouncycastle.util.Arrays.areEqual(root, Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!z) {
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
                this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters) cipherParameters;
                return;
            }
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters) parametersWithRandom.getParameters();
            this.getHighResolutionOutputSizeshNQ4ISI = parametersWithRandom.getRandom();
        }
    }
}

package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LM_OTS {
    public static org.bouncycastle.pqc.crypto.lms.LMOtsSignature Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = lMOtsPrivateKey.Camera2StreamConfigurationMap;
        int n = lMOtsParameters.getN();
        int p = lMOtsParameters.getP();
        int w = lMOtsParameters.getW();
        byte[] bArr3 = new byte[p * n];
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMOtsParameters.getDigestOID());
        org.bouncycastle.pqc.crypto.lms.SeedDerive highSpeedVideoFpsRanges = lMOtsPrivateKey.getHighSpeedVideoFpsRanges();
        int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, n, lMOtsParameters);
        bArr[n] = (byte) ((highSpeedVideoSizes >>> 8) & 255);
        bArr[n + 1] = (byte) highSpeedVideoSizes;
        int i = n + 23;
        byte[] build = org.bouncycastle.pqc.crypto.lms.Composer.compose().bytes(lMOtsPrivateKey.getHighSpeedVideoFpsRangesFor).u32str(lMOtsPrivateKey.getHighSpeedVideoSizes).padUntil(0, i).build();
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = 0;
        int i2 = 0;
        while (i2 < p) {
            org.bouncycastle.util.Pack.shortToBigEndian((short) i2, build, 20);
            boolean z = i2 < p + (-1);
            int i3 = 23;
            highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(build, 23);
            if (z) {
                highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI++;
            }
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr, i2, w);
            for (int i4 = 0; i4 < highSpeedVideoFpsRanges2; i4++) {
                build[22] = (byte) i4;
                highSpeedVideoFpsRangesFor.update(build, 0, i);
                i3 = 23;
                highSpeedVideoFpsRangesFor.doFinal(build, 23);
            }
            java.lang.System.arraycopy(build, i3, bArr3, n * i2, n);
            i2++;
        }
        return new org.bouncycastle.pqc.crypto.lms.LMOtsSignature(lMOtsParameters, bArr2, bArr3);
    }

    public static byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = publicKey.Camera2StreamConfigurationMap;
        java.lang.Object signature = lMSContext.getSignature();
        org.bouncycastle.pqc.crypto.lms.LMOtsSignature lMOtsSignature = signature instanceof org.bouncycastle.pqc.crypto.lms.LMSSignature ? ((org.bouncycastle.pqc.crypto.lms.LMSSignature) signature).getHighResolutionOutputSizeshNQ4ISI : (org.bouncycastle.pqc.crypto.lms.LMOtsSignature) signature;
        int n = lMOtsParameters.getN();
        int w = lMOtsParameters.getW();
        int p = lMOtsParameters.getP();
        byte[] bArr = new byte[34];
        lMSContext.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, 0);
        lMSContext.getHighResolutionOutputSizeshNQ4ISI = null;
        int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, n, lMOtsParameters);
        bArr[n] = (byte) ((highSpeedVideoSizes >>> 8) & 255);
        bArr[n + 1] = (byte) highSpeedVideoSizes;
        byte[] bArr2 = publicKey.getHighResolutionOutputSizeshNQ4ISI;
        int i = publicKey.getHighSpeedVideoFpsRanges;
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMOtsParameters.getDigestOID());
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(bArr2, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(i, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -32640, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.Composer u32str = org.bouncycastle.pqc.crypto.lms.Composer.compose().bytes(bArr2).u32str(i);
        int i2 = n + 23;
        byte[] build = u32str.padUntil(0, i2).build();
        byte[] bArr3 = lMOtsSignature.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor2 = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMOtsParameters.getDigestOID());
        for (int i3 = 0; i3 < p; i3++) {
            org.bouncycastle.util.Pack.shortToBigEndian((short) i3, build, 20);
            java.lang.System.arraycopy(bArr3, i3 * n, build, 23, n);
            for (int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i3, w); highSpeedVideoFpsRanges < (1 << w) - 1; highSpeedVideoFpsRanges++) {
                build[22] = (byte) highSpeedVideoFpsRanges;
                highSpeedVideoFpsRangesFor2.update(build, 0, i2);
                highSpeedVideoFpsRangesFor2.doFinal(build, 23);
            }
            highSpeedVideoFpsRangesFor.update(build, 23, n);
        }
        byte[] bArr4 = new byte[n];
        highSpeedVideoFpsRangesFor.doFinal(bArr4, 0);
        return bArr4;
    }

    static byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMOtsParameters.getDigestOID());
        byte[] build = org.bouncycastle.pqc.crypto.lms.Composer.compose().bytes(bArr).u32str(i).u16str(-32640).padUntil(0, 22).build();
        highSpeedVideoFpsRangesFor.update(build, 0, build.length);
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor2 = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMOtsParameters.getDigestOID());
        byte[] build2 = org.bouncycastle.pqc.crypto.lms.Composer.compose().bytes(bArr).u32str(i).padUntil(0, highSpeedVideoFpsRangesFor2.getDigestSize() + 23).build();
        org.bouncycastle.pqc.crypto.lms.SeedDerive seedDerive = new org.bouncycastle.pqc.crypto.lms.SeedDerive(bArr, bArr2, org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMOtsParameters.getDigestOID()));
        seedDerive.getHighSpeedVideoFpsRanges = i;
        seedDerive.getHighResolutionOutputSizeshNQ4ISI = 0;
        int p = lMOtsParameters.getP();
        int n = lMOtsParameters.getN();
        int w = lMOtsParameters.getW();
        int i2 = 0;
        while (i2 < p) {
            boolean z = i2 < p + (-1);
            seedDerive.Camera2StreamConfigurationMap(build2, 23);
            if (z) {
                seedDerive.getHighResolutionOutputSizeshNQ4ISI++;
            }
            org.bouncycastle.util.Pack.shortToBigEndian((short) i2, build2, 20);
            for (int i3 = 0; i3 < (1 << w) - 1; i3++) {
                build2[22] = (byte) i3;
                highSpeedVideoFpsRangesFor2.update(build2, 0, build2.length);
                highSpeedVideoFpsRangesFor2.doFinal(build2, 23);
            }
            highSpeedVideoFpsRangesFor.update(build2, 23, n);
            i2++;
        }
        byte[] bArr3 = new byte[highSpeedVideoFpsRangesFor.getDigestSize()];
        highSpeedVideoFpsRangesFor.doFinal(bArr3, 0);
        return bArr3;
    }

    private static int getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) {
        return (bArr[(i * i2) / 8] >>> (((~i) & ((8 / i2) - 1)) * i2)) & ((1 << i2) - 1);
    }

    private static int getHighSpeedVideoSizes(byte[] bArr, int i, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters) {
        int w = lMOtsParameters.getW();
        int i2 = 0;
        for (int i3 = 0; i3 < (i * 8) / lMOtsParameters.getW(); i3++) {
            i2 = (i2 + ((1 << w) - 1)) - getHighSpeedVideoFpsRanges(bArr, i3, lMOtsParameters.getW());
        }
        return i2 << lMOtsParameters.getLs();
    }

    LM_OTS() {
    }
}

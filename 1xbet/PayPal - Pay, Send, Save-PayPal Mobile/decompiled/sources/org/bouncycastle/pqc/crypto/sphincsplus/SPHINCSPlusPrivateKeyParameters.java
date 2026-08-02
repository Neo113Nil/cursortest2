package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
public class SPHINCSPlusPrivateKeyParameters extends org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusKeyParameters {
    final org.bouncycastle.pqc.crypto.sphincsplus.PK Camera2StreamConfigurationMap;
    final org.bouncycastle.pqc.crypto.sphincsplus.SK getHighSpeedVideoFpsRangesFor;

    public SPHINCSPlusPrivateKeyParameters(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int i = sPHINCSPlusParameters.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        int i2 = i * 4;
        if (bArr.length != i2) {
            throw new java.lang.IllegalArgumentException("private key encoding does not match parameters");
        }
        int i3 = i * 2;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.sphincsplus.SK(org.bouncycastle.util.Arrays.copyOfRange(bArr, 0, i), org.bouncycastle.util.Arrays.copyOfRange(bArr, i, i3));
        int i4 = i * 3;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.sphincsplus.PK(org.bouncycastle.util.Arrays.copyOfRange(bArr, i3, i4), org.bouncycastle.util.Arrays.copyOfRange(bArr, i4, i2));
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap);
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges);
    }

    public byte[] getPublicKey() {
        return org.bouncycastle.util.Arrays.concatenate(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes);
    }

    public byte[] getPrf() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes);
    }

    public byte[] getEncoded() {
        return org.bouncycastle.util.Arrays.concatenate(this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes);
    }

    SPHINCSPlusPrivateKeyParameters(org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters sPHINCSPlusParameters, org.bouncycastle.pqc.crypto.sphincsplus.SK sk, org.bouncycastle.pqc.crypto.sphincsplus.PK pk) {
        super(true, sPHINCSPlusParameters);
        this.getHighSpeedVideoFpsRangesFor = sk;
        this.Camera2StreamConfigurationMap = pk;
    }
}

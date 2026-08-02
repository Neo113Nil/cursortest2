package org.bouncycastle.pqc.jcajce.provider.rainbow;

/* loaded from: classes17.dex */
public class BCRainbowPrivateKey implements java.security.PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] Camera2StreamConfigurationMap;
    private short[] getHighResolutionOutputSizeshNQ4ISI;
    private short[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.rainbow.Layer[] getHighSpeedVideoFpsRangesFor;
    private short[][] getHighSpeedVideoSizes;
    private int[] getInputFormats;

    public int hashCode() {
        int length = (((((((((this.getHighSpeedVideoFpsRangesFor.length * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getInputFormats);
        for (int length2 = this.getHighSpeedVideoFpsRangesFor.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.getHighSpeedVideoFpsRangesFor[length2].hashCode();
        }
        return length;
    }

    public int[] getVi() {
        return this.getInputFormats;
    }

    public org.bouncycastle.pqc.crypto.rainbow.Layer[] getLayers() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public short[][] getInvA2() {
        return this.Camera2StreamConfigurationMap;
    }

    public short[][] getInvA1() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbow, org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.pqc.asn1.RainbowPrivateKey(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor)).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public short[] getB2() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public short[] getB1() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "Rainbow";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey bCRainbowPrivateKey = (org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey) obj;
        boolean z = org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighSpeedVideoSizes, bCRainbowPrivateKey.getInvA1()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.Camera2StreamConfigurationMap, bCRainbowPrivateKey.getInvA2()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighResolutionOutputSizeshNQ4ISI, bCRainbowPrivateKey.getB1()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighSpeedVideoFpsRanges, bCRainbowPrivateKey.getB2()) && java.util.Arrays.equals(this.getInputFormats, bCRainbowPrivateKey.getVi());
        if (this.getHighSpeedVideoFpsRangesFor.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.getHighSpeedVideoFpsRangesFor.length - 1; length >= 0; length--) {
            z &= this.getHighSpeedVideoFpsRangesFor[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return z;
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.pqc.crypto.rainbow.Layer[] layerArr) {
        this.getHighSpeedVideoSizes = sArr;
        this.getHighResolutionOutputSizeshNQ4ISI = sArr2;
        this.Camera2StreamConfigurationMap = sArr3;
        this.getHighSpeedVideoFpsRanges = sArr4;
        this.getInputFormats = iArr;
        this.getHighSpeedVideoFpsRangesFor = layerArr;
    }

    public BCRainbowPrivateKey(org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec rainbowPrivateKeySpec) {
        this(rainbowPrivateKeySpec.getInvA1(), rainbowPrivateKeySpec.getB1(), rainbowPrivateKeySpec.getInvA2(), rainbowPrivateKeySpec.getB2(), rainbowPrivateKeySpec.getVi(), rainbowPrivateKeySpec.getLayers());
    }

    public BCRainbowPrivateKey(org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters rainbowPrivateKeyParameters) {
        this(rainbowPrivateKeyParameters.getInvA1(), rainbowPrivateKeyParameters.getB1(), rainbowPrivateKeyParameters.getInvA2(), rainbowPrivateKeyParameters.getB2(), rainbowPrivateKeyParameters.getVi(), rainbowPrivateKeyParameters.getLayers());
    }
}

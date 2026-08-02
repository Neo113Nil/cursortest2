package org.bouncycastle.pqc.jcajce.provider.rainbow;

/* loaded from: classes17.dex */
public class BCRainbowPublicKey implements java.security.PublicKey {
    private static final long serialVersionUID = 1;
    private int Camera2StreamConfigurationMap;
    private short[] getHighResolutionOutputSizeshNQ4ISI;
    private short[][] getHighSpeedVideoFpsRangesFor;
    private short[][] getHighSpeedVideoSizes;

    public int hashCode() {
        return (((((this.Camera2StreamConfigurationMap * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.pqc.jcajce.provider.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbow, org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.pqc.asn1.RainbowPublicKey(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public int getDocLength() {
        return this.Camera2StreamConfigurationMap;
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.getHighSpeedVideoSizes.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.getHighSpeedVideoSizes;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = org.bouncycastle.util.Arrays.clone(sArr2[i]);
            i++;
        }
    }

    public short[] getCoeffScalar() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public short[][] getCoeffQuadratic() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.Key
    public final java.lang.String getAlgorithm() {
        return "Rainbow";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey bCRainbowPublicKey = (org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey) obj;
        return this.Camera2StreamConfigurationMap == bCRainbowPublicKey.getDocLength() && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighSpeedVideoFpsRangesFor, bCRainbowPublicKey.getCoeffQuadratic()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighSpeedVideoSizes, bCRainbowPublicKey.getCoeffSingular()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighResolutionOutputSizeshNQ4ISI, bCRainbowPublicKey.getCoeffScalar());
    }

    public BCRainbowPublicKey(org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec rainbowPublicKeySpec) {
        this(rainbowPublicKeySpec.getDocLength(), rainbowPublicKeySpec.getCoeffQuadratic(), rainbowPublicKeySpec.getCoeffSingular(), rainbowPublicKeySpec.getCoeffScalar());
    }

    public BCRainbowPublicKey(org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters rainbowPublicKeyParameters) {
        this(rainbowPublicKeyParameters.getDocLength(), rainbowPublicKeyParameters.getCoeffQuadratic(), rainbowPublicKeyParameters.getCoeffSingular(), rainbowPublicKeyParameters.getCoeffScalar());
    }

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = sArr;
        this.getHighSpeedVideoSizes = sArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = sArr3;
    }
}

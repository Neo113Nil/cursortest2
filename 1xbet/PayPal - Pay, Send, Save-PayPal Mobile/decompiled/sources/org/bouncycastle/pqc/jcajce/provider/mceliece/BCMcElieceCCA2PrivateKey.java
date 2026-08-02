package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class BCMcElieceCCA2PrivateKey implements java.security.PrivateKey {
    private static final long serialVersionUID = 1;
    org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters getHighSpeedVideoFpsRangesFor;

    public int hashCode() {
        return (((((((((this.getHighSpeedVideoFpsRangesFor.getK() * 37) + this.getHighSpeedVideoFpsRangesFor.getN()) * 37) + this.getHighSpeedVideoFpsRangesFor.getField().hashCode()) * 37) + this.getHighSpeedVideoFpsRangesFor.getGoppaPoly().hashCode()) * 37) + this.getHighSpeedVideoFpsRangesFor.getP().hashCode()) * 37) + this.getHighSpeedVideoFpsRangesFor.getH().hashCode();
    }

    public int getT() {
        return this.getHighSpeedVideoFpsRangesFor.getGoppaPoly().getDegree();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getQInv() {
        return this.getHighSpeedVideoFpsRangesFor.getQInv();
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP() {
        return this.getHighSpeedVideoFpsRangesFor.getP();
    }

    public int getN() {
        return this.getHighSpeedVideoFpsRangesFor.getN();
    }

    public int getK() {
        return this.getHighSpeedVideoFpsRangesFor.getK();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getH() {
        return this.getHighSpeedVideoFpsRangesFor.getH();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getGoppaPoly() {
        return this.getHighSpeedVideoFpsRangesFor.getGoppaPoly();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return this.getHighSpeedVideoFpsRangesFor.getField();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2), new org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey(getN(), getK(), getField(), getGoppaPoly(), getP(), org.bouncycastle.pqc.jcajce.provider.mceliece.Utils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getDigest()))).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey) obj;
        return getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH());
    }

    public BCMcElieceCCA2PrivateKey(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PrivateKeyParameters;
    }
}

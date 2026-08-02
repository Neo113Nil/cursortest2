package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class BCMcEliecePrivateKey implements org.bouncycastle.crypto.CipherParameters, java.security.PrivateKey {
    private static final long serialVersionUID = 1;
    private org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters getHighSpeedVideoFpsRanges;

    public int hashCode() {
        return (((((((((((this.getHighSpeedVideoFpsRanges.getK() * 37) + this.getHighSpeedVideoFpsRanges.getN()) * 37) + this.getHighSpeedVideoFpsRanges.getField().hashCode()) * 37) + this.getHighSpeedVideoFpsRanges.getGoppaPoly().hashCode()) * 37) + this.getHighSpeedVideoFpsRanges.getP1().hashCode()) * 37) + this.getHighSpeedVideoFpsRanges.getP2().hashCode()) * 37) + this.getHighSpeedVideoFpsRanges.getSInv().hashCode();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getSInv() {
        return this.getHighSpeedVideoFpsRanges.getSInv();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getQInv() {
        return this.getHighSpeedVideoFpsRanges.getQInv();
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP2() {
        return this.getHighSpeedVideoFpsRanges.getP2();
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP1() {
        return this.getHighSpeedVideoFpsRanges.getP1();
    }

    public int getN() {
        return this.getHighSpeedVideoFpsRanges.getN();
    }

    public int getK() {
        return this.getHighSpeedVideoFpsRanges.getK();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getH() {
        return this.getHighSpeedVideoFpsRanges.getH();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getGoppaPoly() {
        return this.getHighSpeedVideoFpsRanges.getGoppaPoly();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return this.getHighSpeedVideoFpsRanges.getField();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcEliece), new org.bouncycastle.pqc.asn1.McEliecePrivateKey(this.getHighSpeedVideoFpsRanges.getN(), this.getHighSpeedVideoFpsRanges.getK(), this.getHighSpeedVideoFpsRanges.getField(), this.getHighSpeedVideoFpsRanges.getGoppaPoly(), this.getHighSpeedVideoFpsRanges.getP1(), this.getHighSpeedVideoFpsRanges.getP2(), this.getHighSpeedVideoFpsRanges.getSInv())).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "McEliece";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey bCMcEliecePrivateKey = (org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    public BCMcEliecePrivateKey(org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.getHighSpeedVideoFpsRanges = mcEliecePrivateKeyParameters;
    }
}

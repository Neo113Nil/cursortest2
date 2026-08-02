package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class BCMcEliecePublicKey implements java.security.PublicKey {
    private static final long serialVersionUID = 1;
    org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters Camera2StreamConfigurationMap;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("McEliecePublicKey:\n length of the code         : ");
        sb.append(this.Camera2StreamConfigurationMap.getN());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(" error correction capability: ");
        sb2.append(this.Camera2StreamConfigurationMap.getT());
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj2);
        sb3.append(" generator matrix           : ");
        sb3.append(this.Camera2StreamConfigurationMap.getG());
        return sb3.toString();
    }

    public int hashCode() {
        return ((this.Camera2StreamConfigurationMap.getN() + (this.Camera2StreamConfigurationMap.getT() * 37)) * 37) + this.Camera2StreamConfigurationMap.getG().hashCode();
    }

    public int getT() {
        return this.Camera2StreamConfigurationMap.getT();
    }

    public int getN() {
        return this.Camera2StreamConfigurationMap.getN();
    }

    public int getK() {
        return this.Camera2StreamConfigurationMap.getK();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getG() {
        return this.Camera2StreamConfigurationMap.getG();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcEliece), new org.bouncycastle.pqc.asn1.McEliecePublicKey(this.Camera2StreamConfigurationMap.getN(), this.Camera2StreamConfigurationMap.getT(), this.Camera2StreamConfigurationMap.getG())).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "McEliece";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey bCMcEliecePublicKey = (org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey) obj;
        return this.Camera2StreamConfigurationMap.getN() == bCMcEliecePublicKey.getN() && this.Camera2StreamConfigurationMap.getT() == bCMcEliecePublicKey.getT() && this.Camera2StreamConfigurationMap.getG().equals(bCMcEliecePublicKey.getG());
    }

    public BCMcEliecePublicKey(org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        this.Camera2StreamConfigurationMap = mcEliecePublicKeyParameters;
    }
}

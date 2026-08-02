package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class BCMcElieceCCA2PublicKey implements org.bouncycastle.crypto.CipherParameters, java.security.PublicKey {
    private static final long serialVersionUID = 1;
    org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("McEliecePublicKey:\n length of the code         : ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getN());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(" error correction capability: ");
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getT());
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj2);
        sb3.append(" generator matrix           : ");
        sb3.append(this.getHighResolutionOutputSizeshNQ4ISI.getG().toString());
        return sb3.toString();
    }

    public int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI.getN() + (this.getHighResolutionOutputSizeshNQ4ISI.getT() * 37)) * 37) + this.getHighResolutionOutputSizeshNQ4ISI.getG().hashCode();
    }

    public int getT() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getT();
    }

    public int getN() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getN();
    }

    public int getK() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getK();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getG() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getG();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2), new org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey(this.getHighResolutionOutputSizeshNQ4ISI.getN(), this.getHighResolutionOutputSizeshNQ4ISI.getT(), this.getHighResolutionOutputSizeshNQ4ISI.getG(), org.bouncycastle.pqc.jcajce.provider.mceliece.Utils.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI.getDigest()))).getEncoded();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey)) {
            return false;
        }
        org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.getN() == bCMcElieceCCA2PublicKey.getN() && this.getHighResolutionOutputSizeshNQ4ISI.getT() == bCMcElieceCCA2PublicKey.getT() && this.getHighResolutionOutputSizeshNQ4ISI.getG().equals(bCMcElieceCCA2PublicKey.getG());
    }

    public BCMcElieceCCA2PublicKey(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = mcElieceCCA2PublicKeyParameters;
    }
}

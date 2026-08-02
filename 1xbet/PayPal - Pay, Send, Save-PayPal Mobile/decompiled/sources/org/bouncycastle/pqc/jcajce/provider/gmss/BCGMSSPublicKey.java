package org.bouncycastle.pqc.jcajce.provider.gmss;

/* loaded from: classes17.dex */
public class BCGMSSPublicKey implements org.bouncycastle.crypto.CipherParameters, java.security.PublicKey {
    private static final long serialVersionUID = 1;
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.gmss.GMSSParameters getHighResolutionOutputSizeshNQ4ISI;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GMSS public key : ");
        sb.append(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(this.Camera2StreamConfigurationMap)));
        sb.append("\nHeight of Trees: \n");
        java.lang.String obj = sb.toString();
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.getHeightOfTrees().length; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append("Layer ");
            sb2.append(i);
            sb2.append(" : ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getHeightOfTrees()[i]);
            sb2.append(" WinternitzParameter: ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getWinternitzParameter()[i]);
            sb2.append(" K: ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getK()[i]);
            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            obj = sb2.toString();
        }
        return obj;
    }

    public byte[] getPublicKeyBytes() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.pqc.crypto.gmss.GMSSParameters getParameterSet() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return org.bouncycastle.pqc.jcajce.provider.util.KeyUtil.getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.gmss, new org.bouncycastle.pqc.asn1.ParSet(this.getHighResolutionOutputSizeshNQ4ISI.getNumOfLayers(), this.getHighResolutionOutputSizeshNQ4ISI.getHeightOfTrees(), this.getHighResolutionOutputSizeshNQ4ISI.getWinternitzParameter(), this.getHighResolutionOutputSizeshNQ4ISI.getK()).toASN1Primitive()), new org.bouncycastle.pqc.asn1.GMSSPublicKey(this.Camera2StreamConfigurationMap));
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "GMSS";
    }

    public BCGMSSPublicKey(byte[] bArr, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = gMSSParameters;
        this.Camera2StreamConfigurationMap = bArr;
    }

    public BCGMSSPublicKey(org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters gMSSPublicKeyParameters) {
        this(gMSSPublicKeyParameters.getPublicKey(), gMSSPublicKeyParameters.getParameters());
    }
}

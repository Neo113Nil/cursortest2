package org.bouncycastle.its.jcajce;

/* loaded from: classes17.dex */
public class JceITSPublicEncryptionKey extends org.bouncycastle.its.ITSPublicEncryptionKey {
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    JceITSPublicEncryptionKey(java.security.PublicKey publicKey, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        super(r6);
        org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey;
        if (!(publicKey instanceof java.security.interfaces.ECPublicKey)) {
            throw new java.lang.IllegalArgumentException("must be ECPublicKey instance");
        }
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) publicKey;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm().getParameters());
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
            publicEncryptionKey = new org.bouncycastle.oer.its.PublicEncryptionKey(org.bouncycastle.oer.its.SymmAlgorithm.aes128Ccm, new org.bouncycastle.oer.its.BasePublicEncryptionKey.Builder().setChoice(0).setValue(org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY())).createBasePublicEncryptionKey());
        } else {
            if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
                throw new java.lang.IllegalArgumentException("unknown curve in public encryption key");
            }
            publicEncryptionKey = new org.bouncycastle.oer.its.PublicEncryptionKey(org.bouncycastle.oer.its.SymmAlgorithm.aes128Ccm, new org.bouncycastle.oer.its.BasePublicEncryptionKey.Builder().setChoice(1).setValue(org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY())).createBasePublicEncryptionKey());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = jcaJceHelper;
    }

    public static class Builder {
        private org.bouncycastle.jcajce.util.JcaJceHelper Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

        public org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey.Builder setProvider(java.security.Provider provider) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
            return this;
        }

        public org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey.Builder setProvider(java.lang.String str) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
            return this;
        }

        public org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey build(org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey) {
            return new org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey(publicEncryptionKey, this.Camera2StreamConfigurationMap);
        }

        public org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey build(java.security.PublicKey publicKey) {
            return new org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey(publicKey, this.Camera2StreamConfigurationMap);
        }
    }

    public java.security.PublicKey getKey() {
        org.bouncycastle.asn1.x9.X9ECParameters byOID;
        org.bouncycastle.oer.its.BasePublicEncryptionKey basePublicEncryptionKey = this.encryptionKey.getBasePublicEncryptionKey();
        int choice = basePublicEncryptionKey.getChoice();
        if (choice == 0) {
            byOID = org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1);
        } else {
            if (choice != 1) {
                throw new java.lang.IllegalStateException("unknown key type");
            }
            byOID = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getByOID(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1);
        }
        if (!(this.encryptionKey.getBasePublicEncryptionKey().getValue() instanceof org.bouncycastle.oer.its.EccCurvePoint)) {
            throw new java.lang.IllegalStateException("extension to public verification key not supported");
        }
        org.bouncycastle.oer.its.EccCurvePoint eccCurvePoint = (org.bouncycastle.oer.its.EccCurvePoint) basePublicEncryptionKey.getValue();
        org.bouncycastle.math.ec.ECCurve curve = byOID.getCurve();
        if (!(eccCurvePoint instanceof org.bouncycastle.oer.its.EccP256CurvePoint) && !(eccCurvePoint instanceof org.bouncycastle.oer.its.EccP384CurvePoint)) {
            throw new java.lang.IllegalStateException("unknown key type");
        }
        org.bouncycastle.math.ec.ECPoint normalize = curve.decodePoint(eccCurvePoint.getEncodedPoint()).normalize();
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.createKeyFactory("EC").generatePublic(new java.security.spec.ECPublicKeySpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(normalize), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(byOID)));
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e.getMessage(), e);
        }
    }

    JceITSPublicEncryptionKey(org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        super(publicEncryptionKey);
        this.getHighResolutionOutputSizeshNQ4ISI = jcaJceHelper;
    }
}

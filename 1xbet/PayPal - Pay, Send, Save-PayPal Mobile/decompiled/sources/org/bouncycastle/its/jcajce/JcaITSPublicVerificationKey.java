package org.bouncycastle.its.jcajce;

/* loaded from: classes17.dex */
public class JcaITSPublicVerificationKey extends org.bouncycastle.its.ITSPublicVerificationKey {
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    JcaITSPublicVerificationKey(java.security.PublicKey publicKey, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        super(r0);
        org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey;
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) publicKey;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(eCPublicKey.getEncoded()).getAlgorithm().getParameters());
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
            publicVerificationKey = new org.bouncycastle.oer.its.PublicVerificationKey(0, org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()));
        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            publicVerificationKey = new org.bouncycastle.oer.its.PublicVerificationKey(1, org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()));
        } else {
            if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                throw new java.lang.IllegalArgumentException("unknown curve in public encryption key");
            }
            publicVerificationKey = new org.bouncycastle.oer.its.PublicVerificationKey(3, org.bouncycastle.oer.its.EccP384CurvePoint.builder().createUncompressedP384(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()));
        }
        this.getHighSpeedVideoFpsRangesFor = jcaJceHelper;
    }

    public static class Builder {
        private org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

        public org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey.Builder setProvider(java.security.Provider provider) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
            return this;
        }

        public org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey.Builder setProvider(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
            return this;
        }

        public org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey build(org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey) {
            return new org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey(publicVerificationKey, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey build(java.security.PublicKey publicKey) {
            return new org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey(publicKey, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public java.security.PublicKey getKey() {
        org.bouncycastle.asn1.x9.X9ECParameters byOID;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        int choice = this.verificationKey.getChoice();
        if (choice != 0) {
            if (choice == 1) {
                aSN1ObjectIdentifier = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1;
            } else {
                if (choice != 3) {
                    throw new java.lang.IllegalStateException("unknown key type");
                }
                aSN1ObjectIdentifier = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1;
            }
            byOID = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getByOID(aSN1ObjectIdentifier);
        } else {
            byOID = org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1);
        }
        org.bouncycastle.math.ec.ECCurve curve = byOID.getCurve();
        if (!(this.verificationKey.getCurvePoint() instanceof org.bouncycastle.oer.its.EccCurvePoint)) {
            throw new java.lang.IllegalStateException("extension to public verification key not supported");
        }
        org.bouncycastle.oer.its.EccCurvePoint eccCurvePoint = (org.bouncycastle.oer.its.EccCurvePoint) this.verificationKey.getCurvePoint();
        if (!(eccCurvePoint instanceof org.bouncycastle.oer.its.EccP256CurvePoint) && !(eccCurvePoint instanceof org.bouncycastle.oer.its.EccP384CurvePoint)) {
            throw new java.lang.IllegalStateException("unknown key type");
        }
        org.bouncycastle.math.ec.ECPoint normalize = curve.decodePoint(eccCurvePoint.getEncodedPoint()).normalize();
        try {
            return this.getHighSpeedVideoFpsRangesFor.createKeyFactory("EC").generatePublic(new java.security.spec.ECPublicKeySpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(normalize), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(byOID)));
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e.getMessage(), e);
        }
    }

    JcaITSPublicVerificationKey(org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        super(publicVerificationKey);
        this.getHighSpeedVideoFpsRangesFor = jcaJceHelper;
    }
}

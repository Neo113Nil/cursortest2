package org.bouncycastle.its.bc;

/* loaded from: classes17.dex */
public class BcITSPublicVerificationKey extends org.bouncycastle.its.ITSPublicVerificationKey {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BcITSPublicVerificationKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(r0);
        org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey;
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) asymmetricKeyParameter;
        org.bouncycastle.asn1.ASN1ObjectIdentifier name2 = ((org.bouncycastle.crypto.params.ECNamedDomainParameters) eCPublicKeyParameters.getParameters()).getName();
        org.bouncycastle.math.ec.ECPoint q = eCPublicKeyParameters.getQ();
        if (name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
            publicVerificationKey = new org.bouncycastle.oer.its.PublicVerificationKey(0, org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(q.getAffineXCoord().toBigInteger(), q.getAffineYCoord().toBigInteger()));
        } else if (name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            publicVerificationKey = new org.bouncycastle.oer.its.PublicVerificationKey(1, org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(q.getAffineXCoord().toBigInteger(), q.getAffineYCoord().toBigInteger()));
        } else {
            if (!name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                throw new java.lang.IllegalArgumentException("unknown curve in public encryption key");
            }
            publicVerificationKey = new org.bouncycastle.oer.its.PublicVerificationKey(3, org.bouncycastle.oer.its.EccP384CurvePoint.builder().createUncompressedP384(q.getAffineXCoord().toBigInteger(), q.getAffineYCoord().toBigInteger()));
        }
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getKey() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        org.bouncycastle.asn1.x9.X9ECParameters byOID;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        int choice = this.verificationKey.getChoice();
        if (choice != 0) {
            if (choice == 1) {
                aSN1ObjectIdentifier = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1;
                aSN1ObjectIdentifier2 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1;
            } else {
                if (choice != 3) {
                    throw new java.lang.IllegalStateException("unknown key type");
                }
                aSN1ObjectIdentifier = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1;
                aSN1ObjectIdentifier2 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1;
            }
            byOID = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getByOID(aSN1ObjectIdentifier2);
        } else {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1;
            byOID = org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1);
        }
        org.bouncycastle.math.ec.ECCurve curve = byOID.getCurve();
        if (!(this.verificationKey.getCurvePoint() instanceof org.bouncycastle.oer.its.EccCurvePoint)) {
            throw new java.lang.IllegalStateException("extension to public verification key not supported");
        }
        org.bouncycastle.oer.its.EccCurvePoint eccCurvePoint = (org.bouncycastle.oer.its.EccCurvePoint) this.verificationKey.getCurvePoint();
        if ((eccCurvePoint instanceof org.bouncycastle.oer.its.EccP256CurvePoint) || (eccCurvePoint instanceof org.bouncycastle.oer.its.EccP384CurvePoint)) {
            return new org.bouncycastle.crypto.params.ECPublicKeyParameters(curve.decodePoint(eccCurvePoint.getEncodedPoint()).normalize(), new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier, byOID));
        }
        throw new java.lang.IllegalStateException("unknown key type");
    }

    public BcITSPublicVerificationKey(org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey) {
        super(publicVerificationKey);
    }
}

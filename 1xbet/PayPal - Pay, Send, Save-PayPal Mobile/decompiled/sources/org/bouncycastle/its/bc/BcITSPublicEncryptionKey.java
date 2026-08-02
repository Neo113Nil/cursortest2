package org.bouncycastle.its.bc;

/* loaded from: classes17.dex */
public class BcITSPublicEncryptionKey extends org.bouncycastle.its.ITSPublicEncryptionKey {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BcITSPublicEncryptionKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(r0);
        org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey;
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) asymmetricKeyParameter;
        org.bouncycastle.asn1.ASN1ObjectIdentifier name2 = ((org.bouncycastle.crypto.params.ECNamedDomainParameters) eCPublicKeyParameters.getParameters()).getName();
        org.bouncycastle.math.ec.ECPoint q = eCPublicKeyParameters.getQ();
        if (name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
            publicEncryptionKey = new org.bouncycastle.oer.its.PublicEncryptionKey(org.bouncycastle.oer.its.SymmAlgorithm.aes128Ccm, new org.bouncycastle.oer.its.BasePublicEncryptionKey.Builder().setChoice(0).setValue(org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(q.getAffineXCoord().toBigInteger(), q.getAffineYCoord().toBigInteger())).createBasePublicEncryptionKey());
        } else {
            if (!name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
                throw new java.lang.IllegalArgumentException("unknown curve in public encryption key");
            }
            publicEncryptionKey = new org.bouncycastle.oer.its.PublicEncryptionKey(org.bouncycastle.oer.its.SymmAlgorithm.aes128Ccm, new org.bouncycastle.oer.its.BasePublicEncryptionKey.Builder().setChoice(1).setValue(org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(q.getAffineXCoord().toBigInteger(), q.getAffineYCoord().toBigInteger())).createBasePublicEncryptionKey());
        }
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getKey() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        org.bouncycastle.asn1.x9.X9ECParameters byOID;
        org.bouncycastle.oer.its.BasePublicEncryptionKey basePublicEncryptionKey = this.encryptionKey.getBasePublicEncryptionKey();
        int choice = basePublicEncryptionKey.getChoice();
        if (choice == 0) {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1;
            byOID = org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1);
        } else {
            if (choice != 1) {
                throw new java.lang.IllegalStateException("unknown key type");
            }
            aSN1ObjectIdentifier = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1;
            byOID = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getByOID(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1);
        }
        org.bouncycastle.math.ec.ECCurve curve = byOID.getCurve();
        if (!(this.encryptionKey.getBasePublicEncryptionKey().getValue() instanceof org.bouncycastle.oer.its.EccCurvePoint)) {
            throw new java.lang.IllegalStateException("extension to public verification key not supported");
        }
        org.bouncycastle.oer.its.EccCurvePoint eccCurvePoint = (org.bouncycastle.oer.its.EccCurvePoint) basePublicEncryptionKey.getValue();
        if ((eccCurvePoint instanceof org.bouncycastle.oer.its.EccP256CurvePoint) || (eccCurvePoint instanceof org.bouncycastle.oer.its.EccP384CurvePoint)) {
            return new org.bouncycastle.crypto.params.ECPublicKeyParameters(curve.decodePoint(eccCurvePoint.getEncodedPoint()).normalize(), new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier, byOID));
        }
        throw new java.lang.IllegalStateException("unknown key type");
    }

    public BcITSPublicEncryptionKey(org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey) {
        super(publicEncryptionKey);
    }
}

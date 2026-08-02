package org.bouncycastle.its.operator;

/* loaded from: classes17.dex */
public class ECDSAEncoder {
    public static byte[] toX962(org.bouncycastle.oer.its.Signature signature) {
        byte[] octets;
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString;
        if (signature.getChoice() == 0 || signature.getChoice() == 1) {
            org.bouncycastle.oer.its.EcdsaP256Signature ecdsaP256Signature = org.bouncycastle.oer.its.EcdsaP256Signature.getInstance(signature.getValue());
            octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(ecdsaP256Signature.getrSig().getValue()).getOctets();
            aSN1OctetString = ecdsaP256Signature.getsSig();
        } else {
            org.bouncycastle.oer.its.EcdsaP384Signature ecdsaP384Signature = org.bouncycastle.oer.its.EcdsaP384Signature.getInstance(signature.getValue());
            octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(ecdsaP384Signature.getrSig().getValue()).getOctets();
            aSN1OctetString = ecdsaP384Signature.getsSig();
        }
        try {
            return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{new org.bouncycastle.asn1.ASN1Integer(org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(octets)), new org.bouncycastle.asn1.ASN1Integer(org.bouncycastle.util.BigIntegers.fromUnsignedByteArray(aSN1OctetString.getOctets()))}).getEncoded();
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("der encoding r & s");
        }
    }

    public static org.bouncycastle.oer.its.Signature toITS(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
            return new org.bouncycastle.oer.its.Signature(0, new org.bouncycastle.oer.its.EcdsaP256Signature(new org.bouncycastle.oer.its.EccP256CurvePoint(0, new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(32, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue()))), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(32, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue()))));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            return new org.bouncycastle.oer.its.Signature(1, new org.bouncycastle.oer.its.EcdsaP256Signature(new org.bouncycastle.oer.its.EccP256CurvePoint(0, new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(32, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue()))), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(32, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue()))));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
            return new org.bouncycastle.oer.its.Signature(3, new org.bouncycastle.oer.its.EcdsaP384Signature(new org.bouncycastle.oer.its.EccP384CurvePoint(0, new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(48, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue()))), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(48, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue()))));
        }
        throw new java.lang.IllegalArgumentException("unknown curveID");
    }
}

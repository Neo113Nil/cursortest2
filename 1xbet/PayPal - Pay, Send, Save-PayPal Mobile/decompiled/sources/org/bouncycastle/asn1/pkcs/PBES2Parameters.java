package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class PBES2Parameters extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    private org.bouncycastle.asn1.pkcs.EncryptionScheme getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.pkcs.KeyDerivationFunc getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.pkcs.KeyDerivationFunc getKeyDerivationFunc() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.pkcs.EncryptionScheme getEncryptionScheme() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.pkcs.PBES2Parameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.PBES2Parameters) {
            return (org.bouncycastle.asn1.pkcs.PBES2Parameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.PBES2Parameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PBES2Parameters(org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc, org.bouncycastle.asn1.pkcs.EncryptionScheme encryptionScheme) {
        this.getHighSpeedVideoSizes = keyDerivationFunc;
        this.getHighSpeedVideoFpsRanges = encryptionScheme;
    }

    private PBES2Parameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive());
        if (aSN1Sequence2.getObjectAt(0).equals(id_PBKDF2)) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(id_PBKDF2, org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(aSN1Sequence2.getObjectAt(1)));
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.pkcs.KeyDerivationFunc.getInstance(aSN1Sequence2);
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.pkcs.EncryptionScheme.getInstance(objects.nextElement());
    }
}

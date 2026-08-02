package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class KeyDerivationFunc extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes.toASN1Primitive();
    }

    public org.bouncycastle.asn1.ASN1Encodable getParameters() {
        return this.getHighSpeedVideoSizes.getParameters();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithm() {
        return this.getHighSpeedVideoSizes.getAlgorithm();
    }

    public static org.bouncycastle.asn1.pkcs.KeyDerivationFunc getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.KeyDerivationFunc) {
            return (org.bouncycastle.asn1.pkcs.KeyDerivationFunc) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private KeyDerivationFunc(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence);
    }

    public KeyDerivationFunc(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, aSN1Encodable);
    }
}

package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class EncryptionScheme extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges.toASN1Primitive();
    }

    public org.bouncycastle.asn1.ASN1Encodable getParameters() {
        return this.getHighSpeedVideoFpsRanges.getParameters();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithm() {
        return this.getHighSpeedVideoFpsRanges.getAlgorithm();
    }

    public static org.bouncycastle.asn1.pkcs.EncryptionScheme getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.EncryptionScheme) {
            return (org.bouncycastle.asn1.pkcs.EncryptionScheme) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private EncryptionScheme(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence);
    }

    public EncryptionScheme(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public EncryptionScheme(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier);
    }
}

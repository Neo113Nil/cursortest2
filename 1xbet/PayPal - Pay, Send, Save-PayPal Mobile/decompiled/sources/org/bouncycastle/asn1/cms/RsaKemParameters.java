package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class RsaKemParameters extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private final java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getKeyLength() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyDerivationFunction() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.RsaKemParameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.RsaKemParameters) {
            return (org.bouncycastle.asn1.cms.RsaKemParameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.RsaKemParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RsaKemParameters(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighSpeedVideoSizes = java.math.BigInteger.valueOf(i);
    }

    private RsaKemParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
    }
}

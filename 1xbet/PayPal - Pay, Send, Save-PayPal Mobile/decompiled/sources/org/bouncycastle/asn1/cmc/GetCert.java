package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class GetCert extends org.bouncycastle.asn1.ASN1Object {
    private final java.math.BigInteger Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getSerialNumber() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.GeneralName getIssuerName() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.GetCert getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.GetCert) {
            return (org.bouncycastle.asn1.cmc.GetCert) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.GetCert(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GetCert(org.bouncycastle.asn1.x509.GeneralName generalName, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = generalName;
        this.Camera2StreamConfigurationMap = bigInteger;
    }

    private GetCert(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
    }
}

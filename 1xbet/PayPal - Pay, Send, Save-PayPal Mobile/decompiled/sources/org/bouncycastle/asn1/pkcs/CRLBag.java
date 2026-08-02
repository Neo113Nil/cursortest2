package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class CRLBag extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, this.Camera2StreamConfigurationMap));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getCrlValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getCrlId() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.pkcs.CRLBag getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.CRLBag) {
            return (org.bouncycastle.asn1.pkcs.CRLBag) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.CRLBag(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CRLBag(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1)).getObject();
    }

    public CRLBag(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Encodable;
    }
}

package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class ContentInfo extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRanges;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.BERTaggedObject(true, 0, aSN1Encodable));
        }
        return this.getHighSpeedVideoSizes ? new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector) : new org.bouncycastle.asn1.DLSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Encodable getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.pkcs.ContentInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.ContentInfo) {
            return (org.bouncycastle.asn1.pkcs.ContentInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ContentInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = true;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1ObjectIdentifier) objects.nextElement();
        if (objects.hasMoreElements()) {
            this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement()).getObject();
        }
        this.getHighSpeedVideoSizes = aSN1Sequence instanceof org.bouncycastle.asn1.BERSequence;
    }

    public ContentInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = true;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}

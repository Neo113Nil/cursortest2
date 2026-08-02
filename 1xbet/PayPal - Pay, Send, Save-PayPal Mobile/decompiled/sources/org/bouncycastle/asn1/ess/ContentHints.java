package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class ContentHints extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1UTF8String getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1UTF8String != null) {
            aSN1EncodableVector.add(aSN1UTF8String);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1UTF8String getContentDescriptionUTF8() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.DERUTF8String getContentDescription() {
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighResolutionOutputSizeshNQ4ISI;
        return (aSN1UTF8String == null || (aSN1UTF8String instanceof org.bouncycastle.asn1.DERUTF8String)) ? (org.bouncycastle.asn1.DERUTF8String) aSN1UTF8String : new org.bouncycastle.asn1.DERUTF8String(this.getHighResolutionOutputSizeshNQ4ISI.getString());
    }

    public static org.bouncycastle.asn1.ess.ContentHints getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.ContentHints) {
            return (org.bouncycastle.asn1.ess.ContentHints) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.ContentHints(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ContentHints(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (objectAt.toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1UTF8String) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1UTF8String.getInstance(objectAt);
            i = 1;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
    }

    public ContentHints(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1UTF8String;
    }

    public ContentHints(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}

package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class ProtectedPart extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cmp.PKIHeader Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cmp.PKIBody getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIHeader getHeader() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cmp.PKIBody getBody() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cmp.ProtectedPart getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.ProtectedPart) {
            return (org.bouncycastle.asn1.cmp.ProtectedPart) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.ProtectedPart(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ProtectedPart(org.bouncycastle.asn1.cmp.PKIHeader pKIHeader, org.bouncycastle.asn1.cmp.PKIBody pKIBody) {
        this.Camera2StreamConfigurationMap = pKIHeader;
        this.getHighSpeedVideoFpsRanges = pKIBody;
    }

    private ProtectedPart(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmp.PKIHeader.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.PKIBody.getInstance(aSN1Sequence.getObjectAt(1));
    }
}

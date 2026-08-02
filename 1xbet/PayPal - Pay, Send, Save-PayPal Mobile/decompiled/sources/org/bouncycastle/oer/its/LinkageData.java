package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class LinkageData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.IValue Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.GroupLinkageValue getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.LinkageValue getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1EncodableVector());
    }

    public static org.bouncycastle.oer.its.LinkageData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.LinkageData) {
            return (org.bouncycastle.oer.its.LinkageData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.LinkageData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private LinkageData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("sequence must be size 2 or 3");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.oer.its.IValue.getInstance(aSN1Sequence.getObjectAt(2));
        this.getHighSpeedVideoSizes = org.bouncycastle.oer.its.LinkageValue.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.oer.its.GroupLinkageValue.getInstance(aSN1Sequence.getObjectAt(2));
    }
}

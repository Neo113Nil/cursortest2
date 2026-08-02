package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class PKIData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.TaggedContentInfo[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.cmc.OtherMsg[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cmc.TaggedAttribute[] getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.TaggedRequest[] getHighSpeedVideoSizes;

    public PKIData(org.bouncycastle.asn1.cmc.TaggedAttribute[] taggedAttributeArr, org.bouncycastle.asn1.cmc.TaggedRequest[] taggedRequestArr, org.bouncycastle.asn1.cmc.TaggedContentInfo[] taggedContentInfoArr, org.bouncycastle.asn1.cmc.OtherMsg[] otherMsgArr) {
        int length = taggedAttributeArr.length;
        org.bouncycastle.asn1.cmc.TaggedAttribute[] taggedAttributeArr2 = new org.bouncycastle.asn1.cmc.TaggedAttribute[length];
        java.lang.System.arraycopy(taggedAttributeArr, 0, taggedAttributeArr2, 0, length);
        this.getHighSpeedVideoFpsRanges = taggedAttributeArr2;
        int length2 = taggedRequestArr.length;
        org.bouncycastle.asn1.cmc.TaggedRequest[] taggedRequestArr2 = new org.bouncycastle.asn1.cmc.TaggedRequest[length2];
        java.lang.System.arraycopy(taggedRequestArr, 0, taggedRequestArr2, 0, length2);
        this.getHighSpeedVideoSizes = taggedRequestArr2;
        int length3 = taggedContentInfoArr.length;
        org.bouncycastle.asn1.cmc.TaggedContentInfo[] taggedContentInfoArr2 = new org.bouncycastle.asn1.cmc.TaggedContentInfo[length3];
        java.lang.System.arraycopy(taggedContentInfoArr, 0, taggedContentInfoArr2, 0, length3);
        this.Camera2StreamConfigurationMap = taggedContentInfoArr2;
        int length4 = otherMsgArr.length;
        org.bouncycastle.asn1.cmc.OtherMsg[] otherMsgArr2 = new org.bouncycastle.asn1.cmc.OtherMsg[length4];
        java.lang.System.arraycopy(otherMsgArr, 0, otherMsgArr2, 0, length4);
        this.getHighResolutionOutputSizeshNQ4ISI = otherMsgArr2;
    }

    public org.bouncycastle.asn1.cmc.TaggedContentInfo[] getCmsSequence() {
        org.bouncycastle.asn1.cmc.TaggedContentInfo[] taggedContentInfoArr = this.Camera2StreamConfigurationMap;
        int length = taggedContentInfoArr.length;
        org.bouncycastle.asn1.cmc.TaggedContentInfo[] taggedContentInfoArr2 = new org.bouncycastle.asn1.cmc.TaggedContentInfo[length];
        java.lang.System.arraycopy(taggedContentInfoArr, 0, taggedContentInfoArr2, 0, length);
        return taggedContentInfoArr2;
    }

    public org.bouncycastle.asn1.cmc.TaggedAttribute[] getControlSequence() {
        org.bouncycastle.asn1.cmc.TaggedAttribute[] taggedAttributeArr = this.getHighSpeedVideoFpsRanges;
        int length = taggedAttributeArr.length;
        org.bouncycastle.asn1.cmc.TaggedAttribute[] taggedAttributeArr2 = new org.bouncycastle.asn1.cmc.TaggedAttribute[length];
        java.lang.System.arraycopy(taggedAttributeArr, 0, taggedAttributeArr2, 0, length);
        return taggedAttributeArr2;
    }

    public org.bouncycastle.asn1.cmc.OtherMsg[] getOtherMsgSequence() {
        org.bouncycastle.asn1.cmc.OtherMsg[] otherMsgArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = otherMsgArr.length;
        org.bouncycastle.asn1.cmc.OtherMsg[] otherMsgArr2 = new org.bouncycastle.asn1.cmc.OtherMsg[length];
        java.lang.System.arraycopy(otherMsgArr, 0, otherMsgArr2, 0, length);
        return otherMsgArr2;
    }

    public org.bouncycastle.asn1.cmc.TaggedRequest[] getReqSequence() {
        org.bouncycastle.asn1.cmc.TaggedRequest[] taggedRequestArr = this.getHighSpeedVideoSizes;
        int length = taggedRequestArr.length;
        org.bouncycastle.asn1.cmc.TaggedRequest[] taggedRequestArr2 = new org.bouncycastle.asn1.cmc.TaggedRequest[length];
        java.lang.System.arraycopy(taggedRequestArr, 0, taggedRequestArr2, 0, length);
        return taggedRequestArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRanges), new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoSizes), new org.bouncycastle.asn1.DERSequence(this.Camera2StreamConfigurationMap), new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI)});
    }

    public static org.bouncycastle.asn1.cmc.PKIData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.PKIData) {
            return (org.bouncycastle.asn1.cmc.PKIData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.PKIData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PKIData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new java.lang.IllegalArgumentException("Sequence not 4 elements.");
        }
        int i = 0;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.cmc.TaggedAttribute[aSN1Sequence2.size()];
        int i2 = 0;
        while (true) {
            org.bouncycastle.asn1.cmc.TaggedAttribute[] taggedAttributeArr = this.getHighSpeedVideoFpsRanges;
            if (i2 >= taggedAttributeArr.length) {
                break;
            }
            taggedAttributeArr[i2] = org.bouncycastle.asn1.cmc.TaggedAttribute.getInstance(aSN1Sequence2.getObjectAt(i2));
            i2++;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(1);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cmc.TaggedRequest[aSN1Sequence3.size()];
        int i3 = 0;
        while (true) {
            org.bouncycastle.asn1.cmc.TaggedRequest[] taggedRequestArr = this.getHighSpeedVideoSizes;
            if (i3 >= taggedRequestArr.length) {
                break;
            }
            taggedRequestArr[i3] = org.bouncycastle.asn1.cmc.TaggedRequest.getInstance(aSN1Sequence3.getObjectAt(i3));
            i3++;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(2);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cmc.TaggedContentInfo[aSN1Sequence4.size()];
        int i4 = 0;
        while (true) {
            org.bouncycastle.asn1.cmc.TaggedContentInfo[] taggedContentInfoArr = this.Camera2StreamConfigurationMap;
            if (i4 >= taggedContentInfoArr.length) {
                break;
            }
            taggedContentInfoArr[i4] = org.bouncycastle.asn1.cmc.TaggedContentInfo.getInstance(aSN1Sequence4.getObjectAt(i4));
            i4++;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence5 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.cmc.OtherMsg[aSN1Sequence5.size()];
        while (true) {
            org.bouncycastle.asn1.cmc.OtherMsg[] otherMsgArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= otherMsgArr.length) {
                return;
            }
            otherMsgArr[i] = org.bouncycastle.asn1.cmc.OtherMsg.getInstance(aSN1Sequence5.getObjectAt(i));
            i++;
        }
    }
}

package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class GroupLinkageValue extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.ASN1OctetString getjValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.GroupLinkageValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.GroupLinkageValue) {
            return (org.bouncycastle.oer.its.GroupLinkageValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.GroupLinkageValue(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private GroupLinkageValue(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("sequence not length 2");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }
}

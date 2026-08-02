package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class BitmapSspRange extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.asn1.ASN1OctetString getSspValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getSspBitmask() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.BitmapSspRange getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.BitmapSspRange) {
            return (org.bouncycastle.oer.its.BitmapSspRange) obj;
        }
        if (obj == null) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.BitmapSspRange(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public BitmapSspRange(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
        this.getHighSpeedVideoSizes = aSN1OctetString2;
    }
}

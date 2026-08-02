package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSTime extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private final org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighResolutionOutputSizeshNQ4ISI;
        return aSN1GeneralizedTime != null ? aSN1GeneralizedTime.toString() : this.getHighSpeedVideoFpsRangesFor.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighResolutionOutputSizeshNQ4ISI;
        return aSN1GeneralizedTime != null ? aSN1GeneralizedTime : this.getHighSpeedVideoFpsRangesFor.toASN1Primitive();
    }

    public org.bouncycastle.asn1.cms.ContentInfo getTimeStampToken() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getGenTime() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.dvcs.DVCSTime getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.dvcs.DVCSTime getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.DVCSTime) {
            return (org.bouncycastle.asn1.dvcs.DVCSTime) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) {
            return new org.bouncycastle.asn1.dvcs.DVCSTime(org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(obj));
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.DVCSTime(org.bouncycastle.asn1.cms.ContentInfo.getInstance(obj));
        }
        return null;
    }

    public DVCSTime(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = contentInfo;
    }

    public DVCSTime(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    public DVCSTime(java.util.Date date) {
        this(new org.bouncycastle.asn1.ASN1GeneralizedTime(date));
    }
}

package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class Time extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getTime() {
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = this.getHighSpeedVideoFpsRanges;
        return aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTCTime ? ((org.bouncycastle.asn1.ASN1UTCTime) aSN1Primitive).getAdjustedTime() : ((org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Primitive).getTime();
    }

    public java.util.Date getDate() {
        try {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = this.getHighSpeedVideoFpsRanges;
            return aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTCTime ? ((org.bouncycastle.asn1.ASN1UTCTime) aSN1Primitive).getAdjustedDate() : ((org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Primitive).getDate();
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid date string: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public static org.bouncycastle.asn1.cms.Time getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.cms.Time getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.Time)) {
            return (org.bouncycastle.asn1.cms.Time) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1UTCTime) {
            return new org.bouncycastle.asn1.cms.Time((org.bouncycastle.asn1.ASN1UTCTime) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) {
            return new org.bouncycastle.asn1.cms.Time((org.bouncycastle.asn1.ASN1GeneralizedTime) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private Time(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTCTime) && !(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GeneralizedTime)) {
            throw new java.lang.IllegalArgumentException("unknown object passed to Time");
        }
        this.getHighSpeedVideoFpsRanges = aSN1Primitive;
    }

    public Time(java.util.Date date, java.util.Locale locale) {
        java.util.SimpleTimeZone simpleTimeZone = new java.util.SimpleTimeZone(0, "Z");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleDateFormat.format(date));
        sb.append("Z");
        java.lang.String obj = sb.toString();
        int parseInt = java.lang.Integer.parseInt(obj.substring(0, 4));
        this.getHighSpeedVideoFpsRanges = (parseInt < 1950 || parseInt > 2049) ? new org.bouncycastle.asn1.DERGeneralizedTime(obj) : new org.bouncycastle.asn1.DERUTCTime(obj.substring(2));
    }

    public Time(java.util.Date date) {
        java.util.SimpleTimeZone simpleTimeZone = new java.util.SimpleTimeZone(0, "Z");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleDateFormat.format(date));
        sb.append("Z");
        java.lang.String obj = sb.toString();
        int parseInt = java.lang.Integer.parseInt(obj.substring(0, 4));
        this.getHighSpeedVideoFpsRanges = (parseInt < 1950 || parseInt > 2049) ? new org.bouncycastle.asn1.DERGeneralizedTime(obj) : new org.bouncycastle.asn1.DERUTCTime(obj.substring(2));
    }
}

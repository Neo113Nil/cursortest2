package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1GeneralizedTime extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1GeneralizedTime.class) { // from class: org.bouncycastle.asn1.ASN1GeneralizedTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1GeneralizedTime.getHighSpeedVideoFpsRanges(dEROctetString.getOctets());
        }
    };
    final byte[] getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    ASN1GeneralizedTime(byte[] bArr) {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        if (bArr.length < 4) {
            throw new java.lang.IllegalArgumentException("GeneralizedTime string too short");
        }
        this.getHighSpeedVideoFpsRanges = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57 || bArr.length <= 2 || (b3 = bArr[2]) < 48 || b3 > 57 || bArr.length <= 3 || (b4 = bArr[3]) < 48 || b4 > 57) {
            throw new java.lang.IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    private java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String str2;
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i = rawOffset / com.adjust.sdk.Constants.ONE_HOUR;
        int i2 = (rawOffset - (com.adjust.sdk.Constants.ONE_HOUR * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    str = getHighSpeedVideoFpsRangesFor(str);
                }
                java.text.SimpleDateFormat highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("GMT");
                sb.append(str2);
                sb.append(i < 10 ? "0".concat(java.lang.String.valueOf(i)) : java.lang.Integer.toString(i));
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                sb.append(i2 < 10 ? "0".concat(java.lang.String.valueOf(i2)) : java.lang.Integer.toString(i2));
                if (timeZone.inDaylightTime(highSpeedVideoFpsRanges.parse(sb.toString()))) {
                    i += str2.equals("+") ? 1 : -1;
                }
            }
        } catch (java.text.ParseException unused) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("GMT");
        sb2.append(str2);
        sb2.append(i < 10 ? "0".concat(java.lang.String.valueOf(i)) : java.lang.Integer.toString(i));
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb2.append(i2 < 10 ? "0".concat(java.lang.String.valueOf(i2)) : java.lang.Integer.toString(i2));
        return sb2.toString();
    }

    public static org.bouncycastle.asn1.ASN1GeneralizedTime getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1GeneralizedTime)) {
            return (org.bouncycastle.asn1.ASN1GeneralizedTime) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) {
                return (org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1GeneralizedTime) getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1GeneralizedTime getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRangesFor;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(24);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(bArr.length);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, bArr.length);
    }

    protected boolean hasMinutes() {
        byte b;
        byte b2;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        return bArr.length > 10 && (b = bArr[10]) >= 48 && b <= 57 && bArr.length > 11 && (b2 = bArr[11]) >= 48 && b2 <= 57;
    }

    protected boolean hasSeconds() {
        byte b;
        byte b2;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        return bArr.length > 12 && (b = bArr[12]) >= 48 && b <= 57 && bArr.length > 13 && (b2 = bArr[13]) >= 48 && b2 <= 57;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DERGeneralizedTime(this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DERGeneralizedTime(this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    protected boolean hasFractionalSeconds() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public java.lang.String getTimeString() {
        return org.bouncycastle.util.Strings.fromByteArray(this.getHighSpeedVideoFpsRanges);
    }

    public java.lang.String getTime() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.String fromByteArray = org.bouncycastle.util.Strings.fromByteArray(this.getHighSpeedVideoFpsRanges);
        if (fromByteArray.charAt(fromByteArray.length() - 1) == 'Z') {
            sb = new java.lang.StringBuilder();
            sb.append(fromByteArray.substring(0, fromByteArray.length() - 1));
            str = "GMT+00:00";
        } else {
            int length = fromByteArray.length();
            char charAt = fromByteArray.charAt(length - 6);
            if ((charAt == '-' || charAt == '+') && fromByteArray.indexOf("GMT") == length - 9) {
                return fromByteArray;
            }
            int length2 = fromByteArray.length();
            int i = length2 - 5;
            char charAt2 = fromByteArray.charAt(i);
            if (charAt2 == '-' || charAt2 == '+') {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(fromByteArray.substring(0, i));
                sb2.append("GMT");
                int i2 = length2 - 2;
                sb2.append(fromByteArray.substring(i, i2));
                sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
                sb2.append(fromByteArray.substring(i2));
                sb = sb2;
                return sb.toString();
            }
            int length3 = fromByteArray.length() - 3;
            char charAt3 = fromByteArray.charAt(length3);
            if (charAt3 == '-' || charAt3 == '+') {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(fromByteArray.substring(0, length3));
                sb3.append("GMT");
                sb3.append(fromByteArray.substring(length3));
                str = ":00";
                sb = sb3;
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(fromByteArray);
                str = getHighSpeedVideoSizes(fromByteArray);
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public java.util.Date getDate() throws java.text.ParseException {
        java.text.SimpleDateFormat highSpeedVideoFpsRanges;
        java.lang.String fromByteArray = org.bouncycastle.util.Strings.fromByteArray(this.getHighSpeedVideoFpsRanges);
        if (fromByteArray.endsWith("Z")) {
            highSpeedVideoFpsRanges = hasFractionalSeconds() ? new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : hasSeconds() ? new java.text.SimpleDateFormat("yyyyMMddHHmmss'Z'") : hasMinutes() ? new java.text.SimpleDateFormat("yyyyMMddHHmm'Z'") : new java.text.SimpleDateFormat("yyyyMMddHH'Z'");
            highSpeedVideoFpsRanges.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        } else if (fromByteArray.indexOf(45) > 0 || fromByteArray.indexOf(43) > 0) {
            fromByteArray = getTime();
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        } else {
            highSpeedVideoFpsRanges = hasFractionalSeconds() ? new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS") : hasSeconds() ? new java.text.SimpleDateFormat("yyyyMMddHHmmss") : hasMinutes() ? new java.text.SimpleDateFormat("yyyyMMddHHmm") : new java.text.SimpleDateFormat("yyyyMMddHH");
            highSpeedVideoFpsRanges.setTimeZone(new java.util.SimpleTimeZone(0, java.util.TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            fromByteArray = getHighSpeedVideoFpsRangesFor(fromByteArray);
        }
        return org.bouncycastle.asn1.DateUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges.parse(fromByteArray));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoFpsRanges.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges, ((org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Primitive).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String obj;
        java.lang.StringBuilder sb;
        char charAt;
        java.lang.String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(substring.substring(0, 4));
            sb2.append(substring.substring(i));
            obj = sb2.toString();
            sb = new java.lang.StringBuilder();
        } else if (i2 == 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(substring.substring(0, i));
            sb3.append(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
            sb3.append(substring.substring(i));
            obj = sb3.toString();
            sb = new java.lang.StringBuilder();
        } else {
            if (i2 != 2) {
                return str;
            }
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(substring.substring(0, i));
            sb4.append("0");
            sb4.append(substring.substring(i));
            obj = sb4.toString();
            sb = new java.lang.StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(obj);
        return sb.toString();
    }

    static org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges(byte[] bArr) {
        return new org.bouncycastle.asn1.ASN1GeneralizedTime(bArr);
    }

    private java.text.SimpleDateFormat getHighSpeedVideoFpsRanges() {
        java.text.SimpleDateFormat simpleDateFormat = hasFractionalSeconds() ? new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSSz") : hasSeconds() ? new java.text.SimpleDateFormat("yyyyMMddHHmmssz") : hasMinutes() ? new java.text.SimpleDateFormat("yyyyMMddHHmmz") : new java.text.SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public ASN1GeneralizedTime(java.util.Date date, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(java.util.Date date) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss'Z'", org.bouncycastle.asn1.DateUtil.getHighSpeedVideoSizes);
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Strings.toByteArray(str);
        try {
            getDate();
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid date string: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}

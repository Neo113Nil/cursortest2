package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1UTCTime extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1UTCTime.class) { // from class: org.bouncycastle.asn1.ASN1UTCTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1UTCTime.Camera2StreamConfigurationMap(dEROctetString.getOctets());
        }
    };
    final byte[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    private ASN1UTCTime(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            throw new java.lang.IllegalArgumentException("UTCTime string too short");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            throw new java.lang.IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    public static org.bouncycastle.asn1.ASN1UTCTime getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1UTCTime)) {
            return (org.bouncycastle.asn1.ASN1UTCTime) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTCTime) {
                return (org.bouncycastle.asn1.ASN1UTCTime) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1UTCTime) getHighSpeedVideoSizes.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1UTCTime getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoSizes;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1UTCTime) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        return org.bouncycastle.util.Strings.fromByteArray(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.lang.String getTime() {
        java.lang.StringBuilder sb;
        java.lang.String substring;
        java.lang.String fromByteArray = org.bouncycastle.util.Strings.fromByteArray(this.getHighResolutionOutputSizeshNQ4ISI);
        if (fromByteArray.indexOf(45) >= 0 || fromByteArray.indexOf(43) >= 0) {
            int indexOf = fromByteArray.indexOf(45);
            if (indexOf < 0) {
                indexOf = fromByteArray.indexOf(43);
            }
            if (indexOf == fromByteArray.length() - 3) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(fromByteArray);
                sb2.append(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
                fromByteArray = sb2.toString();
            }
            if (indexOf == 10) {
                sb = new java.lang.StringBuilder();
                sb.append(fromByteArray.substring(0, 10));
                sb.append("00GMT");
                sb.append(fromByteArray.substring(10, 13));
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                substring = fromByteArray.substring(13, 15);
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(fromByteArray.substring(0, 12));
                sb.append("GMT");
                sb.append(fromByteArray.substring(12, 15));
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                substring = fromByteArray.substring(15, 17);
            }
        } else if (fromByteArray.length() == 11) {
            sb = new java.lang.StringBuilder();
            sb.append(fromByteArray.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(fromByteArray.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb.append(substring);
        return sb.toString();
    }

    public java.util.Date getDate() throws java.text.ParseException {
        return org.bouncycastle.asn1.DateUtil.getHighSpeedVideoFpsRangesFor(new java.text.SimpleDateFormat("yyMMddHHmmssz").parse(getTime()));
    }

    public java.lang.String getAdjustedTime() {
        java.lang.String time = getTime();
        java.lang.StringBuilder sb = time.charAt(0) < '5' ? new java.lang.StringBuilder("20") : new java.lang.StringBuilder("19");
        sb.append(time);
        return sb.toString();
    }

    public java.util.Date getAdjustedDate() throws java.text.ParseException {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        return org.bouncycastle.asn1.DateUtil.getHighSpeedVideoFpsRangesFor(simpleDateFormat.parse(getAdjustedTime()));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighResolutionOutputSizeshNQ4ISI.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 23, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTCTime) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((org.bouncycastle.asn1.ASN1UTCTime) aSN1Primitive).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1UTCTime Camera2StreamConfigurationMap(byte[] bArr) {
        return new org.bouncycastle.asn1.ASN1UTCTime(bArr);
    }

    public ASN1UTCTime(java.util.Date date, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(java.util.Date date) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyMMddHHmmss'Z'", org.bouncycastle.asn1.DateUtil.getHighSpeedVideoSizes);
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Strings.toByteArray(str);
        try {
            getDate();
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid date string: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}

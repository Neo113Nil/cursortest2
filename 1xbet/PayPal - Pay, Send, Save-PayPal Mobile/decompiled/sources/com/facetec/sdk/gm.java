package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gm {
    private static final java.util.TimeZone e = java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0055, B:20:0x0065, B:21:0x0067, B:23:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:38:0x00a3, B:40:0x00a9, B:44:0x00b6, B:48:0x00c1, B:53:0x00e6, B:55:0x00ec, B:57:0x00f2, B:58:0x0195, B:64:0x00fe, B:65:0x0116, B:66:0x0117, B:69:0x0134, B:71:0x0141, B:74:0x014a, B:76:0x0162, B:79:0x0171, B:80:0x0190, B:82:0x0193, B:83:0x0123, B:84:0x01c6, B:85:0x01cd, B:86:0x00d1, B:87:0x00d4, B:90:0x00bd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0055, B:20:0x0065, B:21:0x0067, B:23:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:38:0x00a3, B:40:0x00a9, B:44:0x00b6, B:48:0x00c1, B:53:0x00e6, B:55:0x00ec, B:57:0x00f2, B:58:0x0195, B:64:0x00fe, B:65:0x0116, B:66:0x0117, B:69:0x0134, B:71:0x0141, B:74:0x014a, B:76:0x0162, B:79:0x0171, B:80:0x0190, B:82:0x0193, B:83:0x0123, B:84:0x01c6, B:85:0x01cd, B:86:0x00d1, B:87:0x00d4, B:90:0x00bd), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Date c(java.lang.String str, java.text.ParsePosition parsePosition) throws java.text.ParseException {
        java.lang.String obj;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        java.util.TimeZone timeZone;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int e2 = e(str, index, i7);
            if (d(str, i7, '-')) {
                i7 = index + 5;
            }
            int i8 = i7 + 2;
            int e3 = e(str, i7, i8);
            if (d(str, i8, '-')) {
                i8 = i7 + 3;
            }
            int i9 = i8 + 2;
            int e4 = e(str, i8, i9);
            boolean d = d(str, i9, 'T');
            if (!d && str.length() <= i9) {
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(e2, e3 - 1, e4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (d) {
                int i10 = i8 + 5;
                i = e(str, i8 + 3, i10);
                if (d(str, i10, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                    i10 = i8 + 6;
                }
                int i11 = i10 + 2;
                i2 = e(str, i10, i11);
                i9 = d(str, i11, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON) ? i10 + 3 : i11;
                if (str.length() > i9 && (charAt = str.charAt(i9)) != 'Z' && charAt != '+' && charAt != '-') {
                    i3 = i9 + 2;
                    i6 = e(str, i9, i3);
                    if (i6 > 59 && i6 < 63) {
                        i6 = 59;
                    }
                    if (d(str, i3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR)) {
                        int i12 = i9 + 3;
                        for (int i13 = i9 + 4; i13 < str.length(); i13++) {
                            char charAt2 = str.charAt(i13);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i13;
                        }
                        length2 = str.length();
                        int min = java.lang.Math.min(length2, i9 + 6);
                        i5 = e(str, i12, min);
                        int i14 = min - i12;
                        if (i14 == 1) {
                            i5 *= 100;
                        } else if (i14 == 2) {
                            i5 *= 10;
                        }
                        i3 = length2;
                        i4 = i2;
                    } else {
                        i4 = i2;
                        i5 = 0;
                    }
                    if (str.length() > i3) {
                        throw new java.lang.IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i3);
                    if (charAt3 == 'Z') {
                        timeZone = e;
                        length = i3 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid time zone indicator '");
                            sb.append(charAt3);
                            sb.append("'");
                            throw new java.lang.IndexOutOfBoundsException(sb.toString());
                        }
                        java.lang.String substring = str.substring(i3);
                        if (substring.length() < 5) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(substring);
                            sb2.append(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
                            substring = sb2.toString();
                        }
                        length = i3 + substring.length();
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            java.lang.String concat = "GMT".concat(java.lang.String.valueOf(substring));
                            java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone(concat);
                            java.lang.String id = timeZone2.getID();
                            if (!id.equals(concat) && !id.replace(io.ktor.sse.ServerSentEventKt.COLON, "").equals(concat)) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Mismatching time zone indicator: ");
                                sb3.append(concat);
                                sb3.append(" given, resolves to ");
                                sb3.append(timeZone2.getID());
                                throw new java.lang.IndexOutOfBoundsException(sb3.toString());
                            }
                            timeZone = timeZone2;
                        }
                        timeZone = e;
                    }
                    java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, e2);
                    gregorianCalendar2.set(2, e3 - 1);
                    gregorianCalendar2.set(5, e4);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i4);
                    gregorianCalendar2.set(13, i6);
                    gregorianCalendar2.set(14, i5);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
            } else {
                i = 0;
                i2 = 0;
            }
            i3 = i9;
            i4 = i2;
            i5 = 0;
            i6 = 0;
            if (str.length() > i3) {
            }
        } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException e5) {
            if (str == null) {
                obj = null;
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\"");
                sb4.append(str);
                sb4.append('\"');
                obj = sb4.toString();
            }
            java.lang.String message = e5.getMessage();
            if (message == null || message.isEmpty()) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("(");
                sb5.append(e5.getClass().getName());
                sb5.append(")");
                message = sb5.toString();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to parse date [");
            sb6.append(obj);
            sb6.append("]: ");
            sb6.append(message);
            java.text.ParseException parseException = new java.text.ParseException(sb6.toString(), parsePosition.getIndex());
            parseException.initCause(e5);
            throw parseException;
        }
    }

    private static boolean d(java.lang.String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int e(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new java.lang.NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = java.lang.Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new java.lang.NumberFormatException(sb.toString());
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = java.lang.Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new java.lang.NumberFormatException(sb2.toString());
            }
            i3 = (i3 * 10) - digit2;
            i4++;
        }
        return -i3;
    }
}

package com.google.gson.internal.bind.util;

/* loaded from: classes4.dex */
public class ISO8601Utils {
    private static final java.util.TimeZone TIMEZONE_UTC = java.util.TimeZone.getTimeZone("UTC");
    private static final java.lang.String UTC_ID = "UTC";

    private ISO8601Utils() {
    }

    public static java.lang.String format(java.util.Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static java.lang.String format(java.util.Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static java.lang.String format(java.util.Date date, boolean z, java.util.TimeZone timeZone) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(timeZone, java.util.Locale.US);
        gregorianCalendar.setTime(date);
        java.lang.StringBuilder sb = new java.lang.StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? "Z" : "+hh:mm").length());
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = java.lang.Math.abs(i / 60);
            int abs2 = java.lang.Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            padInt(sb, abs2, 2);
        } else {
            sb.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    public static java.util.Date parse(java.lang.String str, java.text.ParsePosition parsePosition) throws java.text.ParseException {
        java.lang.String obj;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        java.util.TimeZone timeZone;
        int i5;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int parseInt = parseInt(str, index, i6);
            if (checkOffset(str, i6, '-')) {
                i6 = index + 5;
            }
            int i7 = i6 + 2;
            int parseInt2 = parseInt(str, i6, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int parseInt3 = parseInt(str, i7, i8);
            boolean checkOffset = checkOffset(str, i8, 'T');
            if (!checkOffset && str.length() <= i8) {
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i8);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i9 = i7 + 5;
                i2 = parseInt(str, i7 + 3, i9);
                if (checkOffset(str, i9, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                int parseInt4 = parseInt(str, i9, i10);
                if (checkOffset(str, i10, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                    i10 = i9 + 3;
                }
                if (str.length() <= i10 || (charAt = str.charAt(i10)) == 'Z' || charAt == '+' || charAt == '-') {
                    i8 = i10;
                    i4 = 0;
                } else {
                    i8 = i10 + 2;
                    i4 = parseInt(str, i10, i8);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i8, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR)) {
                        int i11 = i10 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i10 + 4);
                        int min = java.lang.Math.min(indexOfNonDigit, i10 + 6);
                        i5 = parseInt(str, i11, min);
                        int i12 = min - i11;
                        if (i12 == 1) {
                            i5 *= 100;
                        } else if (i12 == 2) {
                            i5 *= 10;
                        }
                        i8 = indexOfNonDigit;
                        i = parseInt4;
                        i3 = i5;
                    }
                }
                i5 = 0;
                i = parseInt4;
                i3 = i5;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i8) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i8);
            if (charAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i8 + 1;
            } else {
                if (charAt2 != '+' && charAt2 != '-') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid time zone indicator '");
                    sb.append(charAt2);
                    sb.append("'");
                    throw new java.lang.IndexOutOfBoundsException(sb.toString());
                }
                java.lang.String substring = str.substring(i8);
                if (substring.length() < 5) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(substring);
                    sb2.append(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
                    substring = sb2.toString();
                }
                length = i8 + substring.length();
                if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("GMT");
                    sb3.append(substring);
                    java.lang.String obj2 = sb3.toString();
                    java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone(obj2);
                    java.lang.String id = timeZone2.getID();
                    if (!id.equals(obj2) && !id.replace(io.ktor.sse.ServerSentEventKt.COLON, "").equals(obj2)) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Mismatching time zone indicator: ");
                        sb4.append(obj2);
                        sb4.append(" given, resolves to ");
                        sb4.append(timeZone2.getID());
                        throw new java.lang.IndexOutOfBoundsException(sb4.toString());
                    }
                    timeZone = timeZone2;
                }
                timeZone = TIMEZONE_UTC;
            }
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, parseInt);
            gregorianCalendar2.set(2, parseInt2 - 1);
            gregorianCalendar2.set(5, parseInt3);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i);
            gregorianCalendar2.set(13, i4);
            gregorianCalendar2.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException e) {
            if (str == null) {
                obj = null;
            } else {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("\"");
                sb5.append(str);
                sb5.append('\"');
                obj = sb5.toString();
            }
            java.lang.String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
                sb6.append(e.getClass().getName());
                sb6.append(")");
                message = sb6.toString();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Failed to parse date [");
            sb7.append(obj);
            sb7.append("]: ");
            sb7.append(message);
            java.text.ParseException parseException = new java.text.ParseException(sb7.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean checkOffset(java.lang.String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
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

    private static void padInt(java.lang.StringBuilder sb, int i, int i2) {
        java.lang.String num = java.lang.Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(num);
    }

    private static int indexOfNonDigit(java.lang.String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}

package com.payair.hce;

/* loaded from: classes4.dex */
public final class getAckAlwaysRequiredIfCurrencyProvided {
    private static final java.util.TimeZone values = java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);

    public static java.util.Date values(java.lang.String str, java.text.ParsePosition parsePosition) throws java.text.ParseException {
        java.lang.String obj;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        java.util.TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int DigitizedCardProfile = DigitizedCardProfile(str, index, i5);
            if (i5 < str.length() && str.charAt(i5) == '-') {
                i5 = index + 5;
            }
            int i6 = i5 + 2;
            int DigitizedCardProfile2 = DigitizedCardProfile(str, i5, i6);
            if (i6 < str.length() && str.charAt(i6) == '-') {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int DigitizedCardProfile3 = DigitizedCardProfile(str, i6, i7);
            boolean z = i7 < str.length() && str.charAt(i7) == 'T';
            if (!z && str.length() <= i7) {
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(DigitizedCardProfile, DigitizedCardProfile2 - 1, DigitizedCardProfile3);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (z) {
                int i8 = i6 + 5;
                i2 = DigitizedCardProfile(str, i6 + 3, i8);
                if (i8 < str.length() && str.charAt(i8) == ':') {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                i4 = DigitizedCardProfile(str, i8, i9);
                if (i9 < str.length() && str.charAt(i9) == ':') {
                    i9 = i8 + 3;
                }
                if (str.length() <= i9 || (charAt = str.charAt(i9)) == 'Z' || charAt == '+' || charAt == '-') {
                    i7 = i9;
                    i = 0;
                } else {
                    i7 = i9 + 2;
                    i = DigitizedCardProfile(str, i9, i7);
                    if (i > 59 && i < 63) {
                        i = 59;
                    }
                    if (i7 < str.length() && str.charAt(i7) == '.') {
                        int i10 = i9 + 3;
                        int i11 = i9 + 4;
                        while (true) {
                            if (i11 < str.length()) {
                                char charAt2 = str.charAt(i11);
                                if (charAt2 < '0' || charAt2 > '9') {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = str.length();
                                break;
                            }
                        }
                        int min = java.lang.Math.min(i11, i9 + 6);
                        i3 = DigitizedCardProfile(str, i10, min);
                        int i12 = min - i10;
                        if (i12 == 1) {
                            i3 *= 100;
                        } else if (i12 == 2) {
                            i3 *= 10;
                        }
                        i7 = i11;
                    }
                }
                i3 = 0;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i7) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            char charAt3 = str.charAt(i7);
            if (charAt3 == 'Z') {
                timeZone = values;
                length = i7 + 1;
            } else {
                if (charAt3 != '+' && charAt3 != '-') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid time zone indicator '");
                    sb.append(charAt3);
                    sb.append("'");
                    throw new java.lang.IndexOutOfBoundsException(sb.toString());
                }
                java.lang.String substring = str.substring(i7);
                if (substring.length() < 5) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(substring);
                    sb2.append(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
                    substring = sb2.toString();
                }
                length = i7 + substring.length();
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
                timeZone = values;
            }
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, DigitizedCardProfile);
            gregorianCalendar2.set(2, DigitizedCardProfile2 - 1);
            gregorianCalendar2.set(5, DigitizedCardProfile3);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i4);
            gregorianCalendar2.set(13, i);
            gregorianCalendar2.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException e) {
            if (str == null) {
                obj = null;
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\"");
                sb4.append(str);
                sb4.append('\"');
                obj = sb4.toString();
            }
            java.lang.String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("(");
                sb5.append(e.getClass().getName());
                sb5.append(")");
                message = sb5.toString();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to parse date [");
            sb6.append(obj);
            sb6.append("]: ");
            sb6.append(message);
            java.text.ParseException parseException = new java.text.ParseException(sb6.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static int DigitizedCardProfile(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
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

package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    public static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i7, char c3) {
        return i7 < str.length() && str.charAt(i7) == c3;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i7) {
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i7, int i8) {
        String num = Integer.toString(i7);
        for (int length = i8 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str, ParsePosition parsePosition) {
        String str2;
        String message;
        int i7;
        int i8;
        int i9;
        int i10;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i11 = index + 4;
            int parseInt = parseInt(str, index, i11);
            if (checkOffset(str, i11, '-')) {
                i11 = index + 5;
            }
            int i12 = i11 + 2;
            int parseInt2 = parseInt(str, i11, i12);
            if (checkOffset(str, i12, '-')) {
                i12 = i11 + 3;
            }
            int i13 = i12 + 2;
            int parseInt3 = parseInt(str, i12, i13);
            boolean checkOffset = checkOffset(str, i13, 'T');
            if (!checkOffset && str.length() <= i13) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                parsePosition.setIndex(i13);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i14 = i12 + 5;
                int parseInt4 = parseInt(str, i12 + 3, i14);
                if (checkOffset(str, i14, ':')) {
                    i14 = i12 + 6;
                }
                int i15 = i14 + 2;
                int parseInt5 = parseInt(str, i14, i15);
                if (checkOffset(str, i15, ':')) {
                    i15 = i14 + 3;
                }
                if (str.length() <= i15 || (charAt = str.charAt(i15)) == 'Z' || charAt == '+' || charAt == '-') {
                    i8 = parseInt5;
                    i9 = 0;
                    i10 = 0;
                    i13 = i15;
                    i7 = parseInt4;
                } else {
                    int i16 = i15 + 2;
                    i10 = parseInt(str, i15, i16);
                    if (i10 > 59 && i10 < 63) {
                        i10 = 59;
                    }
                    if (checkOffset(str, i16, '.')) {
                        int i17 = i15 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i15 + 4);
                        int min = Math.min(indexOfNonDigit, i15 + 6);
                        int parseInt6 = parseInt(str, i17, min);
                        int i18 = min - i17;
                        if (i18 == 1) {
                            parseInt6 *= 100;
                        } else if (i18 == 2) {
                            parseInt6 *= 10;
                        }
                        i7 = parseInt4;
                        i13 = indexOfNonDigit;
                        i8 = parseInt5;
                        i9 = parseInt6;
                    } else {
                        i7 = parseInt4;
                        i13 = i16;
                        i8 = parseInt5;
                        i9 = 0;
                    }
                }
            } else {
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
            }
            if (str.length() <= i13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i13);
            if (charAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i13 + 1;
            } else {
                if (charAt2 != '+' && charAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                }
                String substring = str.substring(i13);
                if (substring.length() < 5) {
                    substring = substring.concat("00");
                }
                length = i13 + substring.length();
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String concat = "GMT".concat(substring);
                    TimeZone timeZone2 = TimeZone.getTimeZone(concat);
                    String id = timeZone2.getID();
                    if (!id.equals(concat) && !id.replace(":", "").equals(concat)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + concat + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
                timeZone = TIMEZONE_UTC;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, parseInt);
            gregorianCalendar2.set(2, parseInt2 - 1);
            gregorianCalendar2.set(5, parseInt3);
            gregorianCalendar2.set(11, i7);
            gregorianCalendar2.set(12, i8);
            gregorianCalendar2.set(13, i10);
            gregorianCalendar2.set(14, i9);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(AbstractC1663a.f("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e8) {
            e = e8;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(AbstractC1663a.f("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e9) {
            e = e9;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException(AbstractC1663a.f("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static int parseInt(String str, int i7, int i8) {
        int i9;
        int i10;
        if (i7 < 0 || i8 > str.length() || i7 > i8) {
            throw new NumberFormatException(str);
        }
        if (i7 < i8) {
            i10 = i7 + 1;
            int digit = Character.digit(str.charAt(i7), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = -digit;
        } else {
            i9 = 0;
            i10 = i7;
        }
        while (i10 < i8) {
            int i11 = i10 + 1;
            int digit2 = Character.digit(str.charAt(i10), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = (i9 * 10) - digit2;
            i10 = i11;
        }
        return -i9;
    }

    public static String format(Date date, boolean z4) {
        return format(date, z4, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z4, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z4 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z4) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i7 = offset / 60000;
            int abs = Math.abs(i7 / 60);
            int abs2 = Math.abs(i7 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}

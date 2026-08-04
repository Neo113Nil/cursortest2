package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p150v0.a;

/* JADX INFO: loaded from: classes2.dex */
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
            char cCharAt = str.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i7, int i8) {
        String string = Integer.toString(i7);
        for (int length = i8 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01bd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x01dc, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i7;
        int i8;
        int i9;
        int i10;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i11 = index + 4;
            int i12 = parseInt(str, index, i11);
            if (checkOffset(str, i11, '-')) {
                i11 = index + 5;
            }
            int i13 = i11 + 2;
            int i14 = parseInt(str, i11, i13);
            if (checkOffset(str, i13, '-')) {
                i13 = i11 + 3;
            }
            int i15 = i13 + 2;
            int i16 = parseInt(str, i13, i15);
            boolean zCheckOffset = checkOffset(str, i15, 'T');
            if (!zCheckOffset && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i12, i14 - 1, i16);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i17 = i13 + 5;
                int i18 = parseInt(str, i13 + 3, i17);
                if (checkOffset(str, i17, ':')) {
                    i17 = i13 + 6;
                }
                int i19 = i17 + 2;
                int i20 = parseInt(str, i17, i19);
                if (checkOffset(str, i19, ':')) {
                    i19 = i17 + 3;
                }
                if (str.length() <= i19 || (cCharAt = str.charAt(i19)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i8 = i20;
                    i9 = 0;
                    i10 = 0;
                    i15 = i19;
                    i7 = i18;
                } else {
                    int i21 = i19 + 2;
                    i10 = parseInt(str, i19, i21);
                    if (i10 > 59 && i10 < 63) {
                        i10 = 59;
                    }
                    if (checkOffset(str, i21, '.')) {
                        int i22 = i19 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i19 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i19 + 6);
                        int i23 = parseInt(str, i22, iMin);
                        int i24 = iMin - i22;
                        if (i24 == 1) {
                            i23 *= 100;
                        } else if (i24 == 2) {
                            i23 *= 10;
                        }
                        i7 = i18;
                        i15 = iIndexOfNonDigit;
                        i8 = i20;
                        i9 = i23;
                    } else {
                        i7 = i18;
                        i15 = i21;
                        i8 = i20;
                        i9 = 0;
                    }
                }
            } else {
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
            }
            if (str.length() <= i15) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i15 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i15);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring.concat("00");
                }
                length = i15 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    String strConcat = "GMT".concat(strSubstring);
                    TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                    String id = timeZone2.getID();
                    if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i12);
            gregorianCalendar2.set(2, i14 - 1);
            gregorianCalendar2.set(5, i16);
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
            ParseException parseException = new ParseException(a.f("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e8) {
            e = e8;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(a.f("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e9) {
            e = e9;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(a.f("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
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
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = -iDigit;
        } else {
            i9 = 0;
            i10 = i7;
        }
        while (i10 < i8) {
            int i11 = i10 + 1;
            int iDigit2 = Character.digit(str.charAt(i10), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = (i9 * 10) - iDigit2;
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
            int iAbs = Math.abs(i7 / 60);
            int iAbs2 = Math.abs(i7 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}

package J3;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f2736a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c5) {
        return i < str.length() && str.charAt(i) == c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        String message;
        int i;
        int i5;
        int i6;
        int i7;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i8 = index + 4;
            int c5 = c(index, i8, str);
            if (a(str, i8, '-')) {
                i8 = index + 5;
            }
            int i9 = i8 + 2;
            int c6 = c(i8, i9, str);
            if (a(str, i9, '-')) {
                i9 = i8 + 3;
            }
            int i10 = i9 + 2;
            int c7 = c(i9, i10, str);
            boolean a5 = a(str, i10, 'T');
            if (!a5 && str.length() <= i10) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c5, c6 - 1, c7);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i10);
                return gregorianCalendar.getTime();
            }
            if (a5) {
                int i11 = i9 + 5;
                int c8 = c(i9 + 3, i11, str);
                if (a(str, i11, ':')) {
                    i11 = i9 + 6;
                }
                int i12 = i11 + 2;
                int c9 = c(i11, i12, str);
                if (a(str, i12, ':')) {
                    i12 = i11 + 3;
                }
                if (str.length() > i12 && (charAt = str.charAt(i12)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i13 = i12 + 2;
                    i7 = c(i12, i13, str);
                    if (i7 > 59 && i7 < 63) {
                        i7 = 59;
                    }
                    if (a(str, i13, '.')) {
                        int i14 = i12 + 3;
                        for (int i15 = i12 + 4; i15 < str.length(); i15++) {
                            char charAt2 = str.charAt(i15);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i15;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i12 + 6);
                        i6 = c(i14, min, str);
                        int i16 = min - i14;
                        if (i16 == 1) {
                            i6 *= 100;
                        } else if (i16 == 2) {
                            i6 *= 10;
                        }
                        i = c8;
                        i10 = length2;
                        i5 = c9;
                    } else {
                        i = c8;
                        i10 = i13;
                        i5 = c9;
                        i6 = 0;
                    }
                    if (str.length() > i10) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i10);
                    TimeZone timeZone = f2736a;
                    if (charAt3 == 'Z') {
                        length = i10 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i10);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i10 + substring.length();
                        if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                            String str2 = "GMT" + substring;
                            timeZone = TimeZone.getTimeZone(str2);
                            String id = timeZone.getID();
                            if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, c5);
                    gregorianCalendar2.set(2, c6 - 1);
                    gregorianCalendar2.set(5, c7);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i5);
                    gregorianCalendar2.set(13, i7);
                    gregorianCalendar2.set(14, i6);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i10 = i12;
                i = c8;
                i5 = c9;
            } else {
                i = 0;
                i5 = 0;
            }
            i6 = 0;
            i7 = 0;
            if (str.length() > i10) {
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            String str3 = str != null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int c(int i, int i5, String str) {
        int i6;
        int i7;
        if (i < 0 || i5 > str.length() || i > i5) {
            throw new NumberFormatException(str);
        }
        if (i < i5) {
            i7 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i5));
            }
            i6 = -digit;
        } else {
            i6 = 0;
            i7 = i;
        }
        while (i7 < i5) {
            int i8 = i7 + 1;
            int digit2 = Character.digit(str.charAt(i7), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i5));
            }
            i6 = (i6 * 10) - digit2;
            i7 = i8;
        }
        return -i6;
    }
}

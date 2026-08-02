package K8;

import I0.C3173b;
import Sh.b;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f15365a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005b, B:20:0x006b, B:21:0x006d, B:23:0x0079, B:24:0x007c, B:26:0x0082, B:30:0x008c, B:35:0x009c, B:37:0x00a4, B:38:0x00a8, B:40:0x00ae, B:44:0x00bb, B:48:0x00c6, B:53:0x00f1, B:55:0x00f7, B:59:0x01a9, B:64:0x0109, B:65:0x0124, B:66:0x0125, B:69:0x0142, B:71:0x014f, B:74:0x0158, B:76:0x0177, B:79:0x0186, B:80:0x01a8, B:81:0x0131, B:82:0x01da, B:83:0x01e1, B:84:0x00d6, B:85:0x00d9, B:88:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        String message;
        int i11;
        int i12;
        int i13;
        int i14;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int c11 = c(index, i15, str);
            if (a(str, i15, '-')) {
                i15 = index + 5;
            }
            int i16 = i15 + 2;
            int c12 = c(i15, i16, str);
            if (a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int c13 = c(i16, i17, str);
            boolean a11 = a(str, i17, 'T');
            if (!a11 && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c11, c12 - 1, c13);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (a11) {
                int i18 = i16 + 5;
                int c14 = c(i16 + 3, i18, str);
                if (a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                int c15 = c(i18, i19, str);
                if (a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() > i19 && (charAt = str.charAt(i19)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i21 = i19 + 2;
                    i14 = c(i19, i21, str);
                    if (i14 > 59 && i14 < 63) {
                        i14 = 59;
                    }
                    if (a(str, i21, '.')) {
                        int i22 = i19 + 3;
                        for (int i23 = i19 + 4; i23 < str.length(); i23++) {
                            char charAt2 = str.charAt(i23);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i23;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i19 + 6);
                        i13 = c(i22, min, str);
                        int i24 = min - i22;
                        if (i24 == 1) {
                            i13 *= 100;
                        } else if (i24 == 2) {
                            i13 *= 10;
                        }
                        i11 = c14;
                        i17 = length2;
                        i12 = c15;
                    } else {
                        i11 = c14;
                        i17 = i21;
                        i12 = c15;
                        i13 = 0;
                    }
                    if (str.length() > i17) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i17);
                    TimeZone timeZone = f15365a;
                    if (charAt3 == 'Z') {
                        length = i17 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i17);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i17 + substring.length();
                        if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                            String str2 = "GMT" + substring;
                            timeZone = TimeZone.getTimeZone(str2);
                            String id2 = timeZone.getID();
                            if (!id2.equals(str2) && !id2.replace(ProductContainerDTO.RATIO_DELIMITER, "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, c11);
                    gregorianCalendar2.set(2, c12 - 1);
                    gregorianCalendar2.set(5, c13);
                    gregorianCalendar2.set(11, i11);
                    gregorianCalendar2.set(12, i12);
                    gregorianCalendar2.set(13, i14);
                    gregorianCalendar2.set(14, i13);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i17 = i19;
                i11 = c14;
                i12 = c15;
            } else {
                i11 = 0;
                i12 = 0;
            }
            i13 = 0;
            i14 = 0;
            if (str.length() > i17) {
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            String a12 = str != null ? null : C3173b.a('\"', "\"", str);
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(b.c("Failed to parse date [", a12, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(b.c("Failed to parse date [", a12, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    private static int c(int i11, int i12, String str) throws NumberFormatException {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int digit = Character.digit(str.charAt(i11), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = -digit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int digit2 = Character.digit(str.charAt(i14), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - digit2;
            i14 = i15;
        }
        return -i13;
    }
}

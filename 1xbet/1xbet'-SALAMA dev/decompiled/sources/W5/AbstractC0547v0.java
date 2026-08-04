package W5;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: W5.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0547v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f7379a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!(list.get(i7) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i7), Integer.valueOf(i7), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(String str, Map map) {
        List listC = c(str, map);
        if (listC == null) {
            return null;
        }
        for (int i7 = 0; i7 < listC.size(); i7++) {
            if (!(listC.get(i7) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i7), Integer.valueOf(i7), listC));
            }
        }
        return listC;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d7 = (Double) obj;
        int iIntValue = d7.intValue();
        if (iIntValue == d7.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d7);
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(String str, Map map) {
        String strH = h(str, map);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static long j(int i7, long j) {
        long j3;
        int i8 = i7;
        long j7 = i8;
        long j8 = f7379a;
        if (j7 <= (-j8) || j7 >= j8) {
            long j9 = j7 / j8;
            j3 = j + j9;
            if (!((j ^ j9) < 0) && !((j ^ j3) >= 0)) {
                throw new ArithmeticException(AbstractC0486a1.i(p031e1.k.j("overflow: checkedAdd(", ", ", j), j9, ")"));
            }
            i8 = (int) (j7 % j8);
        } else {
            j3 = j;
        }
        if (j3 > 0 && i8 < 0) {
            i8 = (int) (((long) i8) + j8);
            j3--;
        }
        if (j3 < 0 && i8 > 0) {
            i8 = (int) (((long) i8) - j8);
            j3++;
        }
        if (j3 >= -315576000000L && j3 <= 315576000000L) {
            long j10 = i8;
            if (j10 >= -999999999 && j10 < j8 && ((j3 >= 0 && i8 >= 0) || (j3 <= 0 && i8 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j3);
                long j11 = i8;
                long j12 = nanos + j11;
                return (((j11 ^ nanos) > 0L ? 1 : ((j11 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j3 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i8 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) throws ParseException {
        boolean z4;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z4 = true;
        } else {
            z4 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i7 = 0; i7 < 9; i7++) {
                iCharAt *= 10;
                if (i7 < strSubstring.length()) {
                    if (strSubstring.charAt(i7) < '0' || strSubstring.charAt(i7) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i7) - '0') + iCharAt;
                }
            }
        }
        if (j < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z4) {
            j = -j;
            iCharAt = -iCharAt;
        }
        try {
            return j(iCharAt, j);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}

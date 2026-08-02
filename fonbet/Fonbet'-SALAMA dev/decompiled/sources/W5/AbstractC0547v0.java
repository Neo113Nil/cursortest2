package W5;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: W5.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0547v0 {

    /* renamed from: a, reason: collision with root package name */
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
        List c3 = c(str, map);
        if (c3 == null) {
            return null;
        }
        for (int i7 = 0; i7 < c3.size(); i7++) {
            if (!(c3.get(i7) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", c3.get(i7), Integer.valueOf(i7), c3));
            }
        }
        return c3;
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
        int intValue = d7.intValue();
        if (intValue == d7.doubleValue()) {
            return Integer.valueOf(intValue);
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
        String h6 = h(str, map);
        if (h6 == null) {
            return null;
        }
        try {
            return Long.valueOf(k(h6));
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
                throw new ArithmeticException(AbstractC0486a1.i(e1.k.j("overflow: checkedAdd(", ", ", j), j9, ")"));
            }
            i8 = (int) (j7 % j8);
        } else {
            j3 = j;
        }
        if (j3 > 0 && i8 < 0) {
            i8 = (int) (i8 + j8);
            j3--;
        }
        if (j3 < 0 && i8 > 0) {
            i8 = (int) (i8 - j8);
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

    public static long k(String str) {
        boolean z4;
        String str2;
        int i7;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z4 = true;
        } else {
            z4 = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(substring);
        if (str2.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 0;
            for (int i8 = 0; i8 < 9; i8++) {
                i7 *= 10;
                if (i8 < str2.length()) {
                    if (str2.charAt(i8) < '0' || str2.charAt(i8) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i7 = (str2.charAt(i8) - '0') + i7;
                }
            }
        }
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z4) {
            parseLong = -parseLong;
            i7 = -i7;
        }
        try {
            return j(i7, parseLong);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}

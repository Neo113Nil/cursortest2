package B4;

import a.AbstractC0169a;

/* loaded from: classes.dex */
public abstract class r extends q {
    public static boolean H(String str, String suffix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean I(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void J(String str) {
        throw new NumberFormatException(B0.o.j("Invalid number format: '", str, '\''));
    }

    public static boolean K(int i2, int i3, int i6, String str, String other, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z ? str.regionMatches(i2, other, i3, i6) : str.regionMatches(z, i2, other, i3, i6);
    }

    public static String L(String str, char c2, char c6) {
        kotlin.jvm.internal.i.e(str, "<this>");
        String replace = str.replace(c2, c6);
        kotlin.jvm.internal.i.d(replace, "replace(...)");
        return replace;
    }

    public static String M(String str, String str2, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int V5 = k.V(0, str, str2, false);
        if (V5 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, V5);
            sb.append(newValue);
            i3 = V5 + length;
            if (V5 >= str.length()) {
                break;
            }
            V5 = k.V(V5 + i2, str, str2, false);
        } while (V5 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean N(String str, int i2, String str2, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return !z ? str.startsWith(str2, i2) : K(i2, 0, str2.length(), str, str2, z);
    }

    public static boolean O(String str, String prefix, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return !z ? str.startsWith(prefix) : K(0, 0, prefix.length(), str, prefix, z);
    }

    public static Integer P(String str) {
        boolean z;
        int i2;
        int i3;
        kotlin.jvm.internal.i.e(str, "<this>");
        AbstractC0169a.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        int i7 = -2147483647;
        if (kotlin.jvm.internal.i.g(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i7 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i8 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if ((i6 < i8 && (i8 != -59652323 || i6 < (i8 = i7 / 10))) || (i3 = i6 * 10) < i7 + digit) {
                return null;
            }
            i6 = i3 - digit;
            i2++;
        }
        return z ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }

    public static Long Q(String str) {
        boolean z;
        kotlin.jvm.internal.i.e(str, "<this>");
        AbstractC0169a.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        if (kotlin.jvm.internal.i.g(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j2 = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j6 = -256204778801521550L;
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 != j6) {
                    return null;
                }
                j8 = j2 / 10;
                if (j7 < j8) {
                    return null;
                }
            }
            long j9 = j7 * 10;
            long j10 = digit;
            if (j9 < j2 + j10) {
                return null;
            }
            j7 = j9 - j10;
            i2++;
            j6 = -256204778801521550L;
        }
        return z ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}

package o4;

import a.AbstractC0444a;

/* renamed from: o4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2234l extends AbstractC2233k {
    public static boolean r0(String str, String str2, boolean z3) {
        kotlin.jvm.internal.l.f("<this>", str);
        return !z3 ? str.endsWith(str2) : t0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean s0(String str, String str2, boolean z3) {
        return str == null ? str2 == null : !z3 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean t0(int i, int i5, int i6, String str, String str2, boolean z3) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("other", str2);
        return !z3 ? str.regionMatches(i, str2, i5, i6) : str.regionMatches(z3, i, str2, i5, i6);
    }

    public static String u0(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i5 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i6 = 0; i6 < i; i6++) {
                cArr[i6] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i5 == i) {
                    break;
                }
                i5++;
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.c(sb2);
        return sb2;
    }

    public static String v0(String str, String str2, String str3) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("oldValue", str2);
        kotlin.jvm.internal.l.f("newValue", str3);
        int E0 = AbstractC2227e.E0(str, str2, 0, false);
        if (E0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, E0);
            sb.append(str3);
            i5 = E0 + length;
            if (E0 >= str.length()) {
                break;
            }
            E0 = AbstractC2227e.E0(str, str2, E0 + i, false);
        } while (E0 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public static boolean w0(String str, int i, String str2, boolean z3) {
        kotlin.jvm.internal.l.f("<this>", str);
        return !z3 ? str.startsWith(str2, i) : t0(i, 0, str2.length(), str, str2, z3);
    }

    public static boolean x0(String str, String str2, boolean z3) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("prefix", str2);
        return !z3 ? str.startsWith(str2) : t0(0, 0, str2.length(), str, str2, z3);
    }

    public static Integer y0(String str) {
        boolean z3;
        int i;
        int i5;
        AbstractC0444a.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        int i7 = -2147483647;
        if (kotlin.jvm.internal.l.g(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i7 = Integer.MIN_VALUE;
                z3 = true;
            }
        } else {
            z3 = false;
            i = 0;
        }
        int i8 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i6 < i8 && (i8 != -59652323 || i6 < (i8 = i7 / 10))) || (i5 = i6 * 10) < i7 + digit) {
                return null;
            }
            i6 = i5 - digit;
            i++;
        }
        return z3 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }

    public static Long z0(String str) {
        boolean z3;
        kotlin.jvm.internal.l.f("<this>", str);
        AbstractC0444a.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j5 = -9223372036854775807L;
        if (kotlin.jvm.internal.l.g(charAt, 48) < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j5 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z3 = false;
        }
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j5 / 10;
                if (j6 < j7) {
                    return null;
                }
            }
            long j8 = j6 * 10;
            long j9 = digit;
            if (j8 < j5 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i++;
        }
        return z3 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}

package a1;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class h extends g {
    public static boolean O(String str, String str2) {
        j.e(str, "<this>");
        return R(2, str, str2, false) >= 0;
    }

    public static final int P(CharSequence charSequence) {
        j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Q(int i2, String str, String string, boolean z2) {
        j.e(str, "<this>");
        j.e(string, "string");
        if (!z2) {
            return str.indexOf(string, i2);
        }
        int length = str.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i3 = new X0.c(i2, length, 1).f510b;
        if (i2 <= i3) {
            while (true) {
                int length3 = string.length();
                if (!(!z2 ? string.regionMatches(0, str, i2, length3) : string.regionMatches(z2, 0, str, i2, length3))) {
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int R(int i2, String str, String str2, boolean z2) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return Q(0, str, str2, z2);
    }

    public static boolean S(CharSequence charSequence) {
        j.e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String T(String str, String str2, String str3) {
        j.e(str, "<this>");
        int Q2 = Q(0, str, str2, false);
        if (Q2 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, Q2);
            sb.append(str3);
            i3 = Q2 + length;
            if (Q2 >= str.length()) {
                break;
            }
            Q2 = Q(Q2 + i2, str, str2, false);
        } while (Q2 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean U(String str, String prefix) {
        j.e(str, "<this>");
        j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String V(String str, String delimiter) {
        j.e(delimiter, "delimiter");
        int R2 = R(6, str, delimiter, false);
        if (R2 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + R2, str.length());
        j.d(substring, "substring(...)");
        return substring;
    }

    public static String W(String str) {
        int lastIndexOf = str.lastIndexOf(46, P(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        j.d(substring, "substring(...)");
        return substring;
    }
}

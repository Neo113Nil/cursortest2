package y1;

/* loaded from: classes.dex */
public abstract class o extends y1.n {
    public static boolean F(java.lang.String str, java.lang.String suffix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean G(java.lang.String str, java.lang.String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean H(int i2, int i3, int i4, java.lang.String str, java.lang.String other, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z2 ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z2, i2, other, i3, i4);
    }

    public static java.lang.String I(java.lang.String str, java.lang.String oldValue, java.lang.String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(oldValue, "oldValue");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int P2 = y1.g.P(str, oldValue, 0, false);
        if (P2 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((java.lang.CharSequence) str, i3, P2);
            sb.append(newValue);
            i3 = P2 + length;
            if (P2 >= str.length()) {
                break;
            }
            P2 = y1.g.P(str, oldValue, P2 + i2, false);
        } while (P2 > 0);
        sb.append((java.lang.CharSequence) str, i3, str.length());
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean J(int i2, java.lang.String str, java.lang.String str2, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : H(i2, 0, str2.length(), str, str2, z2);
    }

    public static boolean K(java.lang.String str, java.lang.String prefix, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : H(0, 0, prefix.length(), str, prefix, z2);
    }
}

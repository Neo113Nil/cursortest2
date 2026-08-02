package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fb1 extends eb1 {
    /* JADX INFO: renamed from: u */
    public static boolean m1759u(String str, CharSequence charSequence) {
        str.getClass();
        if (charSequence instanceof String) {
            if (m1760v(str, (String) charSequence, 0, false) >= 0) {
                return true;
            }
        } else if (m1761w(str, charSequence, 0, str.length(), false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static final int m1760v(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? m1761w(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: w */
    public static int m1761w(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        boolean z2;
        boolean zRegionMatches;
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i2 > length) {
            i2 = length;
        }
        be0 be0Var = new be0(i, i2, 1);
        boolean z3 = charSequence instanceof String;
        int i3 = be0Var.f840k;
        if (z3 && (charSequence2 instanceof String)) {
            if (i > i3) {
                return -1;
            }
            int i4 = i;
            while (true) {
                String str = (String) charSequence2;
                String str2 = (String) charSequence;
                int length2 = str.length();
                if (z) {
                    z2 = z;
                    zRegionMatches = str.regionMatches(z2, 0, str2, i4, length2);
                } else {
                    zRegionMatches = str.regionMatches(0, str2, i4, length2);
                    z2 = z;
                }
                if (zRegionMatches) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4++;
                z = z2;
            }
        } else {
            if (i > i3) {
                return -1;
            }
            while (true) {
                int length3 = charSequence2.length();
                charSequence.getClass();
                if (i >= 0 && charSequence2.length() - length3 >= 0 && i <= charSequence.length() - length3) {
                    for (int i5 = 0; i5 < length3; i5++) {
                        char cCharAt = charSequence2.charAt(i5);
                        char cCharAt2 = charSequence.charAt(i + i5);
                        if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    return i;
                }
                if (i == i3) {
                    return -1;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m1762x(String str, String str2, String str3) {
        int iM1760v = m1760v(str, str2, 0, false);
        if (iM1760v < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM1760v);
            sb.append(str3);
            i2 = iM1760v + length;
            if (iM1760v >= str.length()) {
                break;
            }
            iM1760v = m1760v(str, str2, iM1760v + i, false);
        } while (iM1760v > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m1763y(String str, String str2) {
        int iM1760v = m1760v(str, str2, 0, false);
        return iM1760v == -1 ? str : str.substring(str2.length() + iM1760v, str.length());
    }
}

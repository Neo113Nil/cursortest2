package y1;

/* loaded from: classes.dex */
public abstract class g extends y1.o {
    public static boolean L(java.lang.CharSequence charSequence, char c2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return Q(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean M(java.lang.CharSequence charSequence, java.lang.String str) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return R(charSequence, str, 0, false, 2) >= 0;
    }

    public static java.lang.Character N(java.lang.String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return java.lang.Character.valueOf(str.charAt(0));
    }

    public static final int O(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int P(java.lang.CharSequence charSequence, java.lang.String string, int i2, boolean z2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z2 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(string, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        v1.C1002c c1002c = new v1.C1002c(i2, length, 1);
        boolean z3 = charSequence instanceof java.lang.String;
        int i3 = c1002c.f8389c;
        int i4 = c1002c.f8388b;
        int i5 = c1002c.f8387a;
        if (!z3 || string == null) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!V(string, 0, charSequence, i5, string.length(), z2)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
            return -1;
        }
        if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!y1.o.H(0, i5, string.length(), string, (java.lang.String) charSequence, z2)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int Q(java.lang.CharSequence charSequence, char c2, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof java.lang.String)) ? S(charSequence, new char[]{c2}, i2, z2) : ((java.lang.String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int R(java.lang.CharSequence charSequence, java.lang.String str, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return P(charSequence, str, i2, z2);
    }

    public static final int S(java.lang.CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof java.lang.String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new java.util.NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new java.lang.IllegalArgumentException("Array has more than one element.");
            }
            return ((java.lang.String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int O2 = O(charSequence);
        if (i2 > O2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (u0.AbstractC0995a.l(c2, charAt, z2)) {
                    return i2;
                }
            }
            if (i2 == O2) {
                return -1;
            }
            i2++;
        }
    }

    public static boolean T(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!u0.AbstractC0995a.p(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int U(java.lang.String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = O(str);
        }
        kotlin.jvm.internal.i.e(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }

    public static final boolean V(java.lang.String str, int i2, java.lang.CharSequence other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > str.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!u0.AbstractC0995a.l(str.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String W(java.lang.String str, java.lang.String str2) {
        if (!y1.o.K(str, str2, false)) {
            return str;
        }
        java.lang.String substring = str.substring(str2.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final void X(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final java.util.List Y(int i2, java.lang.String str, java.lang.String str2, boolean z2) {
        X(i2);
        int i3 = 0;
        int P2 = P(str, str2, 0, z2);
        if (P2 == -1 || i2 == 1) {
            return u0.AbstractC0995a.q(str.toString());
        }
        boolean z3 = i2 > 0;
        int i4 = 10;
        if (z3 && i2 <= 10) {
            i4 = i2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i4);
        do {
            arrayList.add(str.subSequence(i3, P2).toString());
            i3 = str2.length() + P2;
            if (z3 && arrayList.size() == i2 - 1) {
                break;
            }
            P2 = P(str, str2, i3, z2);
        } while (P2 != -1);
        arrayList.add(str.subSequence(i3, str.length()).toString());
        return arrayList;
    }

    public static java.util.List Z(java.lang.String str, char[] cArr) {
        kotlin.jvm.internal.i.e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            return Y(0, str, java.lang.String.valueOf(cArr[0]), false);
        }
        X(0);
        x1.f fVar = new x1.f(new y1.c(str, 0, 0, new y1.p(cArr, z2, 0)));
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(fVar));
        java.util.Iterator it = fVar.iterator();
        while (true) {
            y1.b bVar = (y1.b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            v1.C1002c range = (v1.C1002c) bVar.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(str.subSequence(range.f8387a, range.f8388b + 1).toString());
        }
    }

    public static java.lang.String a0(java.lang.String str, java.lang.String delimiter) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int R2 = R(str, delimiter, 0, false, 6);
        if (R2 == -1) {
            return str;
        }
        java.lang.String substring = str.substring(delimiter.length() + R2, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static java.lang.String b0(int i2, java.lang.String str) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.g(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        java.lang.String substring = str.substring(0, i2);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static java.lang.CharSequence c0(java.lang.String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean p2 = u0.AbstractC0995a.p(str.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!p2) {
                    break;
                }
                length--;
            } else if (p2) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}

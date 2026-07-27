package B4;

import a.AbstractC0169a;
import b2.AbstractC0279e;
import g4.AbstractC0464i;
import g4.AbstractC0467l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import y4.C1574c;

/* loaded from: classes.dex */
public abstract class k extends r {
    public static boolean R(CharSequence charSequence, String str, boolean z) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return X(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean S(CharSequence charSequence, char c2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return W(charSequence, c2, 0, false, 2) >= 0;
    }

    public static String T(int i2, String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(B0.o.g(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(i2);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final int U(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int V(int i2, CharSequence charSequence, String string, boolean z) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1574c c1574c = new C1574c(i2, length, 1);
        boolean z5 = charSequence instanceof String;
        int i3 = c1574c.f12441c;
        int i6 = c1574c.f12440b;
        int i7 = c1574c.f12439a;
        if (!z5 || string == null) {
            if ((i3 > 0 && i7 <= i6) || (i3 < 0 && i6 <= i7)) {
                while (!d0(string, 0, charSequence, i7, string.length(), z)) {
                    if (i7 != i6) {
                        i7 += i3;
                    }
                }
                return i7;
            }
            return -1;
        }
        if ((i3 > 0 && i7 <= i6) || (i3 < 0 && i6 <= i7)) {
            while (!r.K(0, i7, string.length(), string, (String) charSequence, z)) {
                if (i7 != i6) {
                    i7 += i3;
                }
            }
            return i7;
        }
        return -1;
    }

    public static int W(CharSequence charSequence, char c2, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? Y(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return V(i2, charSequence, str, z);
    }

    public static final int Y(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int U2 = U(charSequence);
        if (i2 > U2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (AbstractC0169a.m(c2, charAt, z)) {
                    return i2;
                }
            }
            if (i2 == U2) {
                return -1;
            }
            i2++;
        }
    }

    public static boolean Z(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!AbstractC0169a.y(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int a0(int i2, String str, String string) {
        int U2 = (i2 & 2) != 0 ? U(str) : 0;
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        return str.lastIndexOf(string, U2);
    }

    public static int b0(String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = U(str);
        }
        return str.lastIndexOf(c2, i2);
    }

    public static String c0(int i2, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(B0.o.g(i2, "Desired length ", " is less than zero."));
        }
        if (i2 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            int length = i2 - str.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean d0(String str, int i2, CharSequence other, int i3, int i6, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > str.length() - i6 || i3 > other.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!AbstractC0169a.m(str.charAt(i2 + i7), other.charAt(i3 + i7), z)) {
                return false;
            }
        }
        return true;
    }

    public static String e0(String str, String str2) {
        if (!r.O(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static final void f0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List g0(int i2, CharSequence charSequence, String str, boolean z) {
        f0(i2);
        int i3 = 0;
        int V5 = V(0, charSequence, str, z);
        if (V5 == -1 || i2 == 1) {
            return K1.b.W(charSequence.toString());
        }
        boolean z5 = i2 > 0;
        int i6 = 10;
        if (z5 && i2 <= 10) {
            i6 = i2;
        }
        ArrayList arrayList = new ArrayList(i6);
        do {
            arrayList.add(charSequence.subSequence(i3, V5).toString());
            i3 = str.length() + V5;
            if (z5 && arrayList.size() == i2 - 1) {
                break;
            }
            V5 = V(i3, charSequence, str, z);
        } while (V5 != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List h0(CharSequence charSequence, String[] strArr, int i2, int i3) {
        boolean z = false;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return g0(i2, charSequence, str, false);
            }
        }
        f0(i2);
        A4.i iVar = new A4.i(0, new c(charSequence, 0, i2, new s(AbstractC0464i.M(strArr), z, 1)));
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            C1574c range = (C1574c) bVar.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f12439a, range.f12440b + 1).toString());
        }
    }

    public static List i0(String str, char[] cArr) {
        kotlin.jvm.internal.i.e(str, "<this>");
        boolean z = false;
        if (cArr.length == 1) {
            return g0(0, str, String.valueOf(cArr[0]), false);
        }
        f0(0);
        A4.i iVar = new A4.i(0, new c(str, 0, 0, new s(cArr, z, 0)));
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            C1574c range = (C1574c) bVar.next();
            kotlin.jvm.internal.i.e(range, "range");
            arrayList.add(str.subSequence(range.f12439a, range.f12440b + 1).toString());
        }
    }

    public static boolean j0(String str, char c2) {
        return str.length() > 0 && AbstractC0169a.m(str.charAt(0), c2, false);
    }

    public static String k0(String str, String delimiter) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        int X5 = X(str, delimiter, 0, false, 6);
        if (X5 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + X5, str.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String l0(int i2, String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(B0.o.g(i2, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(0, i2);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static String m0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length();
        String substring = str.substring(length - (8 > length ? length : 8));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence n0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean y5 = AbstractC0169a.y(str.charAt(!z ? i2 : length));
            if (z) {
                if (!y5) {
                    break;
                }
                length--;
            } else if (y5) {
                i2++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}

package o4;

import K0.C0196a;
import X3.o;
import a.AbstractC0444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.C2062d;
import n.AbstractC2107A;
import r0.AbstractC2346c;

/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2227e extends AbstractC2234l {
    public static boolean A0(CharSequence charSequence, char c5) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return F0(charSequence, c5, 0, 2) >= 0;
    }

    public static boolean B0(CharSequence charSequence, String str) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("other", str);
        return E0(charSequence, str, 0, false) >= 0;
    }

    public static boolean C0(String str, char c5) {
        return str.length() > 0 && AbstractC0444a.H(str.charAt(D0(str)), c5, false);
    }

    public static final int D0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int E0(CharSequence charSequence, String str, int i, boolean z3) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("string", str);
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C2062d c2062d = new C2062d(i, length, 1);
        boolean z5 = charSequence instanceof String;
        int i5 = c2062d.f17853m;
        int i6 = c2062d.f17852l;
        int i7 = c2062d.f17851k;
        if (z5 && AbstractC2107A.A(str)) {
            if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
                return -1;
            }
            int i8 = i7;
            while (true) {
                String str2 = str;
                boolean z6 = z3;
                if (AbstractC2234l.t0(0, i8, str.length(), str2, (String) charSequence, z6)) {
                    return i8;
                }
                if (i8 == i6) {
                    return -1;
                }
                i8 += i5;
                str = str2;
                z3 = z6;
            }
        } else {
            if ((i5 <= 0 || i7 > i6) && (i5 >= 0 || i6 > i7)) {
                return -1;
            }
            while (true) {
                int length3 = str.length();
                kotlin.jvm.internal.l.f("<this>", str);
                kotlin.jvm.internal.l.f("other", charSequence);
                boolean z7 = false;
                if (i7 >= 0 && str.length() - length3 >= 0 && i7 <= charSequence.length() - length3) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length3) {
                            z7 = true;
                            break;
                        }
                        if (!AbstractC0444a.H(str.charAt(0 + i9), charSequence.charAt(i7 + i9), z3)) {
                            break;
                        }
                        i9++;
                    }
                }
                if (z7) {
                    return i7;
                }
                if (i7 == i6) {
                    return -1;
                }
                i7 += i5;
            }
        }
    }

    public static int F0(CharSequence charSequence, char c5, int i, int i5) {
        if ((i5 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return !(charSequence instanceof String) ? G0(charSequence, new char[]{c5}, i, false) : ((String) charSequence).indexOf(c5, i);
    }

    public static final int G0(CharSequence charSequence, char[] cArr, int i, boolean z3) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(X3.l.H0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int D02 = D0(charSequence);
        if (i > D02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c5 : cArr) {
                if (AbstractC0444a.H(c5, charAt, z3)) {
                    return i;
                }
            }
            if (i == D02) {
                return -1;
            }
            i++;
        }
    }

    public static boolean H0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC0444a.S(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int I0(CharSequence charSequence, char c5, int i, int i5) {
        if ((i5 & 2) != 0) {
            i = D0(charSequence);
        }
        kotlin.jvm.internal.l.f("<this>", charSequence);
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c5, i);
        }
        char[] cArr = {c5};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(X3.l.H0(cArr), i);
        }
        int D02 = D0(charSequence);
        if (i > D02) {
            i = D02;
        }
        while (-1 < i) {
            if (AbstractC0444a.H(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static String J0(String str, int i) {
        CharSequence charSequence;
        kotlin.jvm.internal.l.f("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(L1.a.l(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i5 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String K0(String str, String str2) {
        if (!AbstractC2234l.x0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    public static List L0(String str, char[] cArr) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int E0 = E0(str, valueOf, 0, false);
            if (E0 == -1) {
                return AbstractC2346c.A(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, E0).toString());
                i = valueOf.length() + E0;
                E0 = E0(str, valueOf, i, false);
            } while (E0 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        n4.k kVar = new n4.k(new n4.f(str, new C0196a(11, cArr)));
        ArrayList arrayList2 = new ArrayList(o.S(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            C2224b c2224b = (C2224b) it;
            if (!c2224b.hasNext()) {
                return arrayList2;
            }
            C2062d c2062d = (C2062d) c2224b.next();
            kotlin.jvm.internal.l.f("range", c2062d);
            arrayList2.add(str.subSequence(c2062d.f17851k, c2062d.f17852l + 1).toString());
        }
    }

    public static String M0(String str, String str2) {
        kotlin.jvm.internal.l.f("delimiter", str2);
        int E0 = E0(str, str2, 0, false);
        if (E0 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + E0, str.length());
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    public static String N0(String str, char c5, String str2) {
        int I02 = I0(str, c5, 0, 6);
        if (I02 == -1) {
            return str2;
        }
        String substring = str.substring(I02 + 1, str.length());
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    public static String O0(String str, char c5) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("missingDelimiterValue", str);
        int I02 = I0(str, c5, 0, 6);
        if (I02 == -1) {
            return str;
        }
        String substring = str.substring(0, I02);
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    public static String P0(String str, int i) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(L1.a.l(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        kotlin.jvm.internal.l.e("substring(...)", substring);
        return substring;
    }

    public static CharSequence Q0(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        int length = str.length() - 1;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean S4 = AbstractC0444a.S(str.charAt(!z3 ? i : length));
            if (z3) {
                if (!S4) {
                    break;
                }
                length--;
            } else if (S4) {
                i++;
            } else {
                z3 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}

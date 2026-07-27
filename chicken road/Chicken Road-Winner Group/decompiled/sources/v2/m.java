package v2;

import e2.AbstractC0294i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends k {
    public static boolean k0(String str, String str2) {
        kotlin.jvm.internal.j.e(str, "<this>");
        return m0(str, str2, 0, false) >= 0;
    }

    public static final int l0(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int m0(String str, String string, int i3, boolean z3) {
        String str2;
        String str3;
        boolean z4;
        boolean regionMatches;
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z3) {
            return str.indexOf(string, i3);
        }
        int length = str.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i4 = new s2.c(i3, length, 1).f10344b;
        if (i3 > i4) {
            return -1;
        }
        int i5 = i3;
        while (true) {
            int length3 = string.length();
            if (z3) {
                str2 = str;
                str3 = string;
                z4 = z3;
                regionMatches = str3.regionMatches(z4, 0, str2, i5, length3);
            } else {
                regionMatches = string.regionMatches(0, str, i5, length3);
                str2 = str;
                str3 = string;
                z4 = z3;
            }
            if (regionMatches) {
                return i5;
            }
            if (i5 == i4) {
                return -1;
            }
            i5++;
            string = str3;
            z3 = z4;
            str = str2;
        }
    }

    public static boolean n0(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String o0(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e(str, "<this>");
        int m02 = m0(str, str2, 0, false);
        if (m02 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, m02);
            sb.append(str3);
            i4 = m02 + length;
            if (m02 >= str.length()) {
                break;
            }
            m02 = m0(str, str2, m02 + i3, false);
        } while (m02 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static List p0(String str, char[] cArr) {
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int m02 = m0(str, valueOf, 0, false);
            if (m02 == -1) {
                return X0.a.z(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(str.subSequence(i3, m02).toString());
                i3 = valueOf.length() + m02;
                m02 = m0(str, valueOf, i3, false);
            } while (m02 != -1);
            arrayList.add(str.subSequence(i3, str.length()).toString());
            return arrayList;
        }
        u2.h hVar = new u2.h(new c(str, new l(cArr)));
        ArrayList arrayList2 = new ArrayList(AbstractC0294i.U(hVar));
        Iterator it = hVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            s2.c range = (s2.c) bVar.next();
            kotlin.jvm.internal.j.e(range, "range");
            arrayList2.add(str.subSequence(range.f10343a, range.f10344b + 1).toString());
        }
    }

    public static boolean q0(String str, String prefix) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String r0(String str, String delimiter) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        int m02 = m0(str, delimiter, 0, false);
        if (m02 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + m02, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public static String s0(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, l0(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }
}

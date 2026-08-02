package C6;

import W5.AbstractC0486a1;
import Y4.D;
import f6.C1111d;
import g6.AbstractC1158g;
import g6.AbstractC1161j;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class o extends m {
    public static List A0(String str, String[] strArr) {
        t6.h.e(str, "<this>");
        final boolean z4 = false;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return z0(str, 2, str2, false);
            }
        }
        final List p02 = AbstractC1158g.p0(strArr);
        B6.g gVar = new B6.g(new c(str, 0, 2, new Function2() { // from class: C6.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                C1111d c1111d;
                Object obj4;
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                t6.h.e(charSequence, "$this$DelimitedRangesSequence");
                List list = p02;
                boolean z7 = z4;
                if (z7 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    z6.f fVar = new z6.f(intValue, charSequence.length(), 1);
                    boolean z8 = charSequence instanceof String;
                    int i7 = fVar.f18536c;
                    int i8 = fVar.f18535b;
                    if (z8) {
                        if ((i7 > 0 && intValue <= i8) || (i7 < 0 && i8 <= intValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it.next();
                                    String str3 = (String) obj4;
                                    if (o.w0(0, intValue, str3.length(), str3, (String) charSequence, z7)) {
                                        break;
                                    }
                                }
                                String str4 = (String) obj4;
                                if (str4 == null) {
                                    if (intValue == i8) {
                                        break;
                                    }
                                    intValue += i7;
                                } else {
                                    c1111d = new C1111d(Integer.valueOf(intValue), str4);
                                    break;
                                }
                            }
                        }
                        c1111d = null;
                    } else {
                        if ((i7 > 0 && intValue <= i8) || (i7 < 0 && i8 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it2.next();
                                    String str5 = (String) obj3;
                                    if (o.x0(intValue, str5.length(), charSequence, str5, z7)) {
                                        break;
                                    }
                                }
                                String str6 = (String) obj3;
                                if (str6 == null) {
                                    if (intValue == i8) {
                                        break;
                                    }
                                    intValue += i7;
                                } else {
                                    c1111d = new C1111d(Integer.valueOf(intValue), str6);
                                    break;
                                }
                            }
                        }
                        c1111d = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str7 = (String) list.get(0);
                    int t02 = o.t0(intValue, 4, charSequence, str7, false);
                    if (t02 >= 0) {
                        c1111d = new C1111d(Integer.valueOf(t02), str7);
                    }
                    c1111d = null;
                }
                if (c1111d == null) {
                    return null;
                }
                return new C1111d(c1111d.f13000a, Integer.valueOf(((String) c1111d.f13001b).length()));
            }
        }));
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(gVar));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            z6.f fVar = (z6.f) bVar.next();
            t6.h.e(fVar, "range");
            arrayList.add(str.subSequence(fVar.f18534a, fVar.f18535b + 1).toString());
        }
    }

    public static boolean B0(String str, String str2) {
        t6.h.e(str, "<this>");
        t6.h.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static String C0(String str, String str2, String str3) {
        t6.h.e(str2, "delimiter");
        t6.h.e(str3, "missingDelimiterValue");
        int t02 = t0(0, 6, str, str2, false);
        if (t02 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + t02, str.length());
        t6.h.d(substring, "substring(...)");
        return substring;
    }

    public static String D0(String str, String str2) {
        t6.h.e(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, r0(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        t6.h.d(substring, "substring(...)");
        return substring;
    }

    public static Integer E0(String str) {
        boolean z4;
        int i7;
        int i8;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (t6.h.f(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z4 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z4 = true;
            }
        } else {
            z4 = false;
            i7 = 0;
        }
        int i11 = -59652323;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + digit) {
                return null;
            }
            i9 = i8 - digit;
            i7++;
        }
        return z4 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long F0(String str) {
        boolean z4;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (t6.h.f(charAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z4 = false;
                i7 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z4 = false;
        }
        long j3 = 0;
        long j7 = -256204778801521550L;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if (j3 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j / 10;
                if (j3 < j7) {
                    return null;
                }
            }
            long j8 = j3 * 10;
            long j9 = digit;
            if (j8 < j + j9) {
                return null;
            }
            j3 = j8 - j9;
            i7++;
        }
        return z4 ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    public static boolean p0(String str, String str2, boolean z4) {
        t6.h.e(str, "<this>");
        t6.h.e(str2, Request.JsonKeys.OTHER);
        return t0(0, 2, str, str2, z4) >= 0;
    }

    public static final int r0(CharSequence charSequence) {
        t6.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int s0(CharSequence charSequence, String str, int i7, boolean z4) {
        t6.h.e(charSequence, "<this>");
        t6.h.e(str, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i7);
        }
        int length = charSequence.length();
        if (i7 < 0) {
            i7 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        z6.f fVar = new z6.f(i7, length, 1);
        boolean z7 = charSequence instanceof String;
        int i8 = fVar.f18536c;
        int i9 = fVar.f18535b;
        int i10 = fVar.f18534a;
        if (!z7 || str == null) {
            if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
                while (!x0(i10, str.length(), charSequence, str, z4)) {
                    if (i10 != i9) {
                        i10 += i8;
                    }
                }
                return i10;
            }
            return -1;
        }
        if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
            while (!w0(0, i10, str.length(), str, (String) charSequence, z4)) {
                if (i10 != i9) {
                    i10 += i8;
                }
            }
            return i10;
        }
        return -1;
    }

    public static /* synthetic */ int t0(int i7, int i8, CharSequence charSequence, String str, boolean z4) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z4 = false;
        }
        return s0(charSequence, str, i7, z4);
    }

    public static boolean u0(CharSequence charSequence) {
        t6.h.e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(int i7, String str) {
        CharSequence charSequence;
        t6.h.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Desired length ", " is less than zero."));
        }
        if (i7 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i7);
            sb.append((CharSequence) str);
            int length = i7 - str.length();
            int i8 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                }
            }
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean w0(int i7, int i8, int i9, String str, String str2, boolean z4) {
        t6.h.e(str, "<this>");
        t6.h.e(str2, Request.JsonKeys.OTHER);
        return !z4 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z4, i7, str2, i8, i9);
    }

    public static final boolean x0(int i7, int i8, CharSequence charSequence, String str, boolean z4) {
        char upperCase;
        char upperCase2;
        t6.h.e(str, "<this>");
        t6.h.e(charSequence, Request.JsonKeys.OTHER);
        if (i7 < 0 || str.length() - i8 < 0 || i7 > charSequence.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            char charAt = str.charAt(i9);
            char charAt2 = charSequence.charAt(i7 + i9);
            if (charAt != charAt2 && (!z4 || ((upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String y0(String str, String str2, String str3) {
        t6.h.e(str, "<this>");
        int s02 = s0(str, str2, 0, false);
        if (s02 < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, s02);
            sb.append(str3);
            i8 = s02 + length;
            if (s02 >= str.length()) {
                break;
            }
            s02 = s0(str, str2, s02 + i7, false);
        } while (s02 > 0);
        sb.append((CharSequence) str, i8, str.length());
        String sb2 = sb.toString();
        t6.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static final List z0(String str, int i7, String str2, boolean z4) {
        if (i7 < 0) {
            throw new IllegalArgumentException(e1.k.d(i7, "Limit must be non-negative, but was ").toString());
        }
        int i8 = 0;
        int s02 = s0(str, str2, 0, z4);
        if (s02 == -1 || i7 == 1) {
            return D.D(str.toString());
        }
        boolean z7 = i7 > 0;
        int i9 = 10;
        if (z7 && i7 <= 10) {
            i9 = i7;
        }
        ArrayList arrayList = new ArrayList(i9);
        do {
            arrayList.add(str.subSequence(i8, s02).toString());
            i8 = str2.length() + s02;
            if (z7 && arrayList.size() == i7 - 1) {
                break;
            }
            s02 = s0(str, str2, i8, z4);
        } while (s02 != -1);
        arrayList.add(str.subSequence(i8, str.length()).toString());
        return arrayList;
    }
}

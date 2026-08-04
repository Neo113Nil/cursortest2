package C6;

import W5.AbstractC0486a1;
import Y4.D;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
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
        final List listP0 = p050g6.g.p0(strArr);
        B6.g gVar = new B6.g(new c(str, 0, 2, new Function2() { // from class: C6.n
            /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[EDGE_INSN: B:54:0x00d6->B:55:0x00d7 BREAK  A[LOOP:0: B:26:0x006a->B:37:0x009d]] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object next;
                p044f6.d dVar;
                String str3;
                Object next2;
                String str4;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                t6.h.e(charSequence, "$this$DelimitedRangesSequence");
                List list = listP0;
                boolean z7 = z4;
                if (z7 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    z6.f fVar = new z6.f(iIntValue, charSequence.length(), 1);
                    boolean z8 = charSequence instanceof String;
                    int i7 = fVar.f18542c;
                    int i8 = fVar.f18541b;
                    if (!z8) {
                        if ((i7 > 0 && iIntValue <= i8) || (i7 < 0 && i8 <= iIntValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    str3 = (String) next;
                                } while (!o.x0(iIntValue, str3.length(), charSequence, str3, z7));
                                String str5 = (String) next;
                                if (str5 == null) {
                                    if (iIntValue == i8) {
                                        dVar = null;
                                        break;
                                    }
                                    iIntValue += i7;
                                } else {
                                    dVar = new p044f6.d(Integer.valueOf(iIntValue), str5);
                                    break;
                                }
                            }
                        } else {
                            dVar = null;
                            break;
                        }
                    } else if ((i7 > 0 && iIntValue <= i8) || (i7 < 0 && i8 <= iIntValue)) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                str4 = (String) next2;
                            } while (!o.w0(0, iIntValue, str4.length(), str4, (String) charSequence, z7));
                            String str6 = (String) next2;
                            if (str6 == null) {
                                if (iIntValue == i8) {
                                    dVar = null;
                                    break;
                                }
                                iIntValue += i7;
                            } else {
                                dVar = new p044f6.d(Integer.valueOf(iIntValue), str6);
                                break;
                            }
                        }
                    } else {
                        dVar = null;
                        break;
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
                    int iT0 = o.t0(iIntValue, 4, charSequence, str7, false);
                    if (iT0 < 0) {
                        dVar = null;
                        break;
                    }
                    dVar = new p044f6.d(Integer.valueOf(iT0), str7);
                }
                if (dVar == null) {
                    return null;
                }
                return new p044f6.d(dVar.f13006a, Integer.valueOf(((String) dVar.f13007b).length()));
            }
        }));
        ArrayList arrayList = new ArrayList(p050g6.j.N0(gVar));
        Iterator it = gVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            z6.f fVar = (z6.f) bVar.next();
            t6.h.e(fVar, "range");
            arrayList.add(str.subSequence(fVar.f18540a, fVar.f18541b + 1).toString());
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
        int iT0 = t0(0, 6, str, str2, false);
        if (iT0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iT0, str.length());
        t6.h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String D0(String str, String str2) {
        t6.h.e(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, r0(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        t6.h.d(strSubstring, "substring(...)");
        return strSubstring;
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
        char cCharAt = str.charAt(0);
        int i10 = -2147483647;
        if (t6.h.f(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z4 = false;
            } else {
                if (cCharAt != '-') {
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
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + iDigit) {
                return null;
            }
            i9 = i8 - iDigit;
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
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (t6.h.f(cCharAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z4 = false;
                i7 = 1;
            } else {
                if (cCharAt != '-') {
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
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j / ((long) 10);
                if (j3 < j7) {
                    return null;
                }
            }
            long j8 = j3 * ((long) 10);
            long j9 = iDigit;
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
        int i8 = fVar.f18542c;
        int i9 = fVar.f18541b;
        int i10 = fVar.f18540a;
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
            char cCharAt = charSequence.charAt(i7);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(int i7, String str) {
        CharSequence charSequenceSubSequence;
        t6.h.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Desired length ", " is less than zero."));
        }
        if (i7 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
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
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
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
            char cCharAt = str.charAt(i9);
            char cCharAt2 = charSequence.charAt(i7 + i9);
            if (cCharAt != cCharAt2 && (!z4 || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String y0(String str, String str2, String str3) {
        t6.h.e(str, "<this>");
        int iS0 = s0(str, str2, 0, false);
        if (iS0 < 0) {
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
            sb.append((CharSequence) str, i8, iS0);
            sb.append(str3);
            i8 = iS0 + length;
            if (iS0 >= str.length()) {
                break;
            }
            iS0 = s0(str, str2, iS0 + i7, false);
        } while (iS0 > 0);
        sb.append((CharSequence) str, i8, str.length());
        String string = sb.toString();
        t6.h.d(string, "toString(...)");
        return string;
    }

    public static final List z0(String str, int i7, String str2, boolean z4) {
        if (i7 < 0) {
            throw new IllegalArgumentException(p031e1.k.d(i7, "Limit must be non-negative, but was ").toString());
        }
        int length = 0;
        int iS0 = s0(str, str2, 0, z4);
        if (iS0 == -1 || i7 == 1) {
            return D.D(str.toString());
        }
        boolean z7 = i7 > 0;
        int i8 = 10;
        if (z7 && i7 <= 10) {
            i8 = i7;
        }
        ArrayList arrayList = new ArrayList(i8);
        do {
            arrayList.add(str.subSequence(length, iS0).toString());
            length = str2.length() + iS0;
            if (z7 && arrayList.size() == i7 - 1) {
                break;
            }
            iS0 = s0(str, str2, length, z4);
        } while (iS0 != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }
}

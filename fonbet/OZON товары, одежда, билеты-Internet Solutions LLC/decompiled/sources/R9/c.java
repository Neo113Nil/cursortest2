package R9;

import B3.D;
import T9.d;
import T9.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<S9.c> f24816a;

    public static final class a extends Exception {
    }

    public c(@NotNull List<S9.c> customNotations) {
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        this.f24816a = customNotations;
    }

    private final S9.d b(String str, boolean z11, boolean z12, Character ch2) {
        e.a bVar;
        if (str.length() == 0) {
            return new T9.a(null);
        }
        char E11 = h.E(str);
        if (E11 == '[') {
            if (ch2 == null || '\\' != ch2.charValue()) {
                return b(h.y(1, str), true, false, Character.valueOf(E11));
            }
        } else if (E11 == '{') {
            if (ch2 == null || '\\' != ch2.charValue()) {
                return b(h.y(1, str), false, true, Character.valueOf(E11));
            }
        } else if (E11 == ']') {
            if (ch2 == null || '\\' != ch2.charValue()) {
                return b(h.y(1, str), false, false, Character.valueOf(E11));
            }
        } else if (E11 == '}') {
            if (ch2 == null || '\\' != ch2.charValue()) {
                return b(h.y(1, str), false, false, Character.valueOf(E11));
            }
        } else if (E11 == '\\' && (ch2 == null || '\\' != ch2.charValue())) {
            return b(h.y(1, str), z11, z12, Character.valueOf(E11));
        }
        if (!z11) {
            return z12 ? new T9.b(b(h.y(1, str), false, true, Character.valueOf(E11)), E11) : new T9.c(b(h.y(1, str), false, false, Character.valueOf(E11)), E11);
        }
        if (E11 == '0') {
            return new e(b(h.y(1, str), true, false, Character.valueOf(E11)), new e.a.C0537e(0));
        }
        if (E11 == 'A') {
            return new e(b(h.y(1, str), true, false, Character.valueOf(E11)), new e.a.d(0));
        }
        if (E11 == '_') {
            return new e(b(h.y(1, str), true, false, Character.valueOf(E11)), new e.a.C0536a(0));
        }
        List<S9.c> list = this.f24816a;
        if (E11 != 8230) {
            if (E11 == '9') {
                return new T9.d(b(h.y(1, str), true, false, Character.valueOf(E11)), new d.a.C0535d(0));
            }
            if (E11 == 'a') {
                return new T9.d(b(h.y(1, str), true, false, Character.valueOf(E11)), new d.a.c(0));
            }
            if (E11 == '-') {
                return new T9.d(b(h.y(1, str), true, false, Character.valueOf(E11)), new d.a.C0534a(0));
            }
            Iterator<S9.c> it = list.iterator();
            while (it.hasNext()) {
                it.next().getClass();
                if ('F' == E11) {
                    return new e(b(h.y(1, str), true, false, Character.valueOf(E11)), new e.a.b("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZабвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789!@#$%^&*+?()-_:;'=[]/.\", ~", E11));
                }
            }
            throw new a();
        }
        if ((ch2 != null && ch2.charValue() == '0') || (ch2 != null && ch2.charValue() == '9')) {
            bVar = new e.a.C0537e(0);
        } else if ((ch2 != null && ch2.charValue() == 'A') || (ch2 != null && ch2.charValue() == 'a')) {
            bVar = new e.a.d(0);
        } else if ((ch2 != null && ch2.charValue() == '_') || (ch2 != null && ch2.charValue() == '-')) {
            bVar = new e.a.C0536a(0);
        } else if (ch2 != null && ch2.charValue() == 8230) {
            bVar = new e.a.C0536a(0);
        } else {
            if (ch2 == null || ch2.charValue() != '[') {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((S9.c) it2.next()).getClass();
                    if (ch2 != null && 'F' == ch2.charValue()) {
                        bVar = new e.a.b("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZабвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789!@#$%^&*+?()-_:;'=[]/.\", ~", ch2.charValue());
                    }
                }
                throw new a();
            }
            bVar = new e.a.C0536a(0);
        }
        return new e(bVar);
    }

    @NotNull
    public final S9.d a(@NotNull String formatString) throws a {
        int i11;
        int i12;
        String str;
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        char[] charArray = formatString.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            char c11 = '[';
            if (i13 >= length) {
                ArrayList arrayList = new ArrayList();
                char[] charArray2 = formatString.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
                boolean z15 = false;
                String str2 = "";
                for (char c12 : charArray2) {
                    if ('\\' != c12 || z15) {
                        if (('[' == c12 || '{' == c12) && !z15) {
                            if (str2.length() > 0) {
                                arrayList.add(str2);
                            }
                            str2 = "";
                        }
                        str2 = str2 + c12;
                        if ((']' == c12 || '}' == c12) && !z15) {
                            arrayList.add(str2);
                            str2 = "";
                        }
                        z15 = false;
                    } else {
                        str2 = str2 + c12;
                        z15 = true;
                    }
                }
                if (str2.length() != 0) {
                    arrayList.add(str2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (h.e0(str3, "[", z11)) {
                        int length2 = str3.length();
                        String str4 = "";
                        int i14 = 0;
                        while (i14 < length2) {
                            Iterator it2 = it;
                            char charAt = str3.charAt(i14);
                            if (charAt == c11) {
                                StringBuilder sb2 = new StringBuilder();
                                i11 = length2;
                                sb2.append(str4);
                                sb2.append(charAt);
                                str = sb2.toString();
                                i12 = i14;
                            } else {
                                i11 = length2;
                                String str5 = str4;
                                if (charAt == ']') {
                                    i12 = i14;
                                    if (!h.A(str5, "\\", false)) {
                                        arrayList2.add(str5 + charAt);
                                        it = it2;
                                    }
                                } else {
                                    i12 = i14;
                                }
                                if ((charAt == '0' || charAt == '9') && (h.t(str5, "A", false) || h.t(str5, "a", false) || h.t(str5, "-", false) || h.t(str5, "_", false))) {
                                    arrayList2.add(str5.concat("]"));
                                    str = "[" + charAt;
                                } else if ((charAt == 'A' || charAt == 'a') && (h.t(str5, "0", false) || h.t(str5, "9", false) || h.t(str5, "-", false) || h.t(str5, "_", false))) {
                                    arrayList2.add(str5.concat("]"));
                                    str = "[" + charAt;
                                } else if ((charAt == '-' || charAt == '_') && (h.t(str5, "0", false) || h.t(str5, "9", false) || h.t(str5, "A", false) || h.t(str5, "a", false))) {
                                    arrayList2.add(str5.concat("]"));
                                    str = "[" + charAt;
                                } else {
                                    str = str5 + charAt;
                                }
                            }
                            i14 = i12 + 1;
                            str4 = str;
                            length2 = i11;
                            c11 = '[';
                            it = it2;
                        }
                        z11 = false;
                    } else {
                        arrayList2.add(str3);
                    }
                    z11 = false;
                    c11 = '[';
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str6 = (String) it3.next();
                    if (h.e0(str6, "[", false)) {
                        if (h.t(str6, "0", false) || h.t(str6, "9", false)) {
                            StringBuilder sb3 = new StringBuilder("[");
                            char[] charArray3 = h.X(h.X(str6, "[", "", false), "]", "", false).toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray3, "this as java.lang.String).toCharArray()");
                            str6 = D.c(sb3, C7714v.V(C7705l.b0(charArray3), "", null, null, null, 62), ']');
                        } else if (h.t(str6, "a", false) || h.t(str6, "A", false)) {
                            StringBuilder sb4 = new StringBuilder("[");
                            char[] charArray4 = h.X(h.X(str6, "[", "", false), "]", "", false).toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray4, "this as java.lang.String).toCharArray()");
                            str6 = D.c(sb4, C7714v.V(C7705l.b0(charArray4), "", null, null, null, 62), ']');
                        } else {
                            StringBuilder sb5 = new StringBuilder("[");
                            char[] charArray5 = h.X(h.X(h.X(h.X(str6, "[", "", false), "]", "", false), "_", "A", false), "-", "a", false).toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray5, "this as java.lang.String).toCharArray()");
                            str6 = h.X(h.X(D.c(sb5, C7714v.V(C7705l.b0(charArray5), "", null, null, null, 62), ']'), "A", "_", false), "a", "-", false);
                        }
                        arrayList3.add(str6);
                    }
                    arrayList3.add(str6);
                }
                return b(C7714v.V(arrayList3, "", null, null, null, 62), false, false, null);
            }
            char c13 = charArray[i13];
            if ('\\' == c13) {
                z12 = !z12;
            } else {
                if ('[' == c13) {
                    if (z13) {
                        throw new a();
                    }
                    z13 = !z12;
                }
                if (']' == c13 && !z12) {
                    z13 = false;
                }
                if ('{' == c13) {
                    if (z14) {
                        throw new a();
                    }
                    z14 = !z12;
                }
                if ('}' == c13 && !z12) {
                    z14 = false;
                }
                z12 = false;
            }
            i13++;
        }
    }
}

package y4;

import A0.C0052p0;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import o0.C2202f;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public final class m implements Iterable, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final String[] f21360k;

    public m(String[] strArr) {
        this.f21360k = strArr;
    }

    public final String c(String str) {
        kotlin.jvm.internal.l.f("name", str);
        String[] strArr = this.f21360k;
        int length = strArr.length - 2;
        int A3 = G4.l.A(length, 0, -2);
        if (A3 > length) {
            return null;
        }
        while (!AbstractC2234l.s0(str, strArr[length], true)) {
            if (length == A3) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final Date d(String str) {
        String c5 = c(str);
        if (c5 == null) {
            return null;
        }
        C0052p0 c0052p0 = D4.c.f973a;
        if (c5.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) D4.c.f973a.get()).parse(c5, parsePosition);
        if (parsePosition.getIndex() == c5.length()) {
            return parse;
        }
        String[] strArr = D4.c.f974b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = D4.c.f975c;
                    DateFormat dateFormat = dateFormatArr[i];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(D4.c.f974b[i], Locale.US);
                        dateFormat.setTimeZone(z4.b.f21983e);
                        dateFormatArr[i] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(c5, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e(int i) {
        return this.f21360k[i * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Arrays.equals(this.f21360k, ((m) obj).f21360k);
        }
        return false;
    }

    public final C2202f f() {
        C2202f c2202f = new C2202f(1);
        ArrayList arrayList = c2202f.f18548a;
        kotlin.jvm.internal.l.f("<this>", arrayList);
        String[] strArr = this.f21360k;
        kotlin.jvm.internal.l.f("elements", strArr);
        arrayList.addAll(X3.l.o0(strArr));
        return c2202f;
    }

    public final String g(int i) {
        return this.f21360k[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21360k);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        W3.h[] hVarArr = new W3.h[size];
        for (int i = 0; i < size; i++) {
            hVarArr[i] = new W3.h(e(i), g(i));
        }
        return kotlin.jvm.internal.l.i(hVarArr);
    }

    public final int size() {
        return this.f21360k.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String e3 = e(i);
            String g5 = g(i);
            sb.append(e3);
            sb.append(": ");
            if (z4.b.p(e3)) {
                g5 = "██";
            }
            sb.append(g5);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", sb2);
        return sb2;
    }
}

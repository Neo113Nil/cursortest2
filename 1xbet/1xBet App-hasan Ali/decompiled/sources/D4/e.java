package D4;

import L4.C0229l;
import X3.v;
import j3.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import o4.C2226d;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import v.w0;
import y4.C2674b;
import y4.j;
import y4.m;
import y4.n;
import y4.z;

/* loaded from: classes.dex */
public abstract class e {
    static {
        C0229l c0229l = C0229l.f3092n;
        i.q("\"\\");
        i.q("\t ,=");
    }

    public static final boolean a(z zVar) {
        if (l.a((String) zVar.f21448k.f812c, "HEAD")) {
            return false;
        }
        int i = zVar.f21451n;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && z4.b.j(zVar) == -1 && !"chunked".equalsIgnoreCase(z.b("Transfer-Encoding", zVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ea, code lost:
    
        if (r3.f18666k.matcher(r0).matches() == false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C2674b c2674b, n nVar, m mVar) {
        List list;
        int i;
        j jVar;
        int i5;
        j jVar2;
        int i6 = 1;
        l.f("<this>", c2674b);
        l.f("url", nVar);
        l.f("headers", mVar);
        if (c2674b == C2674b.f21301b) {
            return;
        }
        Pattern pattern = j.f21342j;
        int size = mVar.size();
        int i7 = 0;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            if ("Set-Cookie".equalsIgnoreCase(mVar.e(i8))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mVar.g(i8));
            }
        }
        List list2 = v.f6090k;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            l.e("{\n      Collections.unmodifiableList(result)\n    }", unmodifiableList);
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i9 = 0;
        ArrayList arrayList2 = null;
        while (i9 < size2) {
            String str = (String) list.get(i9);
            l.f("setCookie", str);
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = z4.b.f21979a;
            char c5 = ';';
            int f = z4.b.f(str, ';', i7, str.length());
            char c6 = '=';
            int f5 = z4.b.f(str, '=', i7, f);
            if (f5 != f) {
                String x5 = z4.b.x(i7, f5, str);
                if (x5.length() != 0) {
                    i = i6;
                    if (z4.b.l(x5) == -1) {
                        String x6 = z4.b.x(f5 + 1, f, str);
                        if (z4.b.l(x6) == -1) {
                            int i10 = f + 1;
                            int length = str.length();
                            long j5 = 253402300799999L;
                            int i11 = i7;
                            int i12 = i11;
                            int i13 = i12 == true ? 1 : 0;
                            long j6 = 253402300799999L;
                            boolean z3 = i;
                            String str2 = null;
                            String str3 = null;
                            long j7 = -1;
                            boolean z5 = i12;
                            while (true) {
                                if (i10 < length) {
                                    int f6 = z4.b.f(str, c5, i10, length);
                                    int f7 = z4.b.f(str, c6, i10, f6);
                                    String x7 = z4.b.x(i10, f7, str);
                                    String x8 = f7 < f6 ? z4.b.x(f7 + 1, f6, str) : "";
                                    if (x7.equalsIgnoreCase("expires")) {
                                        try {
                                            j6 = v1.j.e(x8, x8.length());
                                            z5 = i;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                        i10 = f6 + 1;
                                        c5 = ';';
                                        c6 = '=';
                                        z5 = z5;
                                        z3 = z3;
                                    } else if (x7.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(x8);
                                            j7 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                        } catch (NumberFormatException e3) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            l.e("compile(...)", compile);
                                            if (!compile.matcher(x8).matches()) {
                                                throw e3;
                                            }
                                            j7 = AbstractC2234l.x0(x8, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                        }
                                        z5 = i;
                                        i10 = f6 + 1;
                                        c5 = ';';
                                        c6 = '=';
                                        z5 = z5;
                                        z3 = z3;
                                    } else {
                                        if (x7.equalsIgnoreCase("domain")) {
                                            if (AbstractC2234l.r0(x8, ".", false)) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String f8 = w0.f(AbstractC2227e.K0(x8, "."));
                                            if (f8 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str2 = f8;
                                            z3 = 0;
                                        } else if (x7.equalsIgnoreCase("path")) {
                                            str3 = x8;
                                        } else if (x7.equalsIgnoreCase("secure")) {
                                            i13 = i;
                                        } else if (x7.equalsIgnoreCase("httponly")) {
                                            i11 = i;
                                        }
                                        i10 = f6 + 1;
                                        c5 = ';';
                                        c6 = '=';
                                        z5 = z5;
                                        z3 = z3;
                                    }
                                } else {
                                    if (j7 == Long.MIN_VALUE) {
                                        j5 = Long.MIN_VALUE;
                                    } else if (j7 != -1) {
                                        long j8 = currentTimeMillis + (j7 <= 9223372036854775L ? j7 * 1000 : Long.MAX_VALUE);
                                        if (j8 >= currentTimeMillis && j8 <= 253402300799999L) {
                                            j5 = j8;
                                        }
                                    } else {
                                        j5 = j6;
                                    }
                                    String str4 = nVar.f21365d;
                                    if (str2 == null) {
                                        str2 = str4;
                                    } else if (!l.a(str4, str2)) {
                                        if (AbstractC2234l.r0(str4, str2, false) && str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                                            C2226d c2226d = z4.b.f;
                                            c2226d.getClass();
                                        }
                                        i5 = 0;
                                        jVar = null;
                                        jVar2 = jVar;
                                    }
                                    if (str4.length() == str2.length() || PublicSuffixDatabase.f18668g.a(str2) != null) {
                                        String str5 = "/";
                                        i5 = 0;
                                        if (str3 == null || !AbstractC2234l.x0(str3, "/", false)) {
                                            String b3 = nVar.b();
                                            int I02 = AbstractC2227e.I0(b3, '/', 0, 6);
                                            if (I02 != 0) {
                                                str5 = b3.substring(0, I02);
                                                l.e("this as java.lang.String…ing(startIndex, endIndex)", str5);
                                            }
                                            str3 = str5;
                                        }
                                        jVar = new j(x5, x6, j5, str2, str3, i13, i11, z5, z3);
                                        jVar2 = jVar;
                                    }
                                    i5 = 0;
                                    jVar = null;
                                    jVar2 = jVar;
                                }
                            }
                        }
                    }
                    i5 = i7;
                    jVar2 = null;
                    if (jVar2 != null) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(jVar2);
                    }
                    i9++;
                    i7 = i5;
                    i6 = i;
                }
            }
            i = i6;
            i5 = i7;
            jVar2 = null;
            if (jVar2 != null) {
            }
            i9++;
            i7 = i5;
            i6 = i;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            l.e("{\n        Collections.un…ableList(cookies)\n      }", list2);
        }
        list2.isEmpty();
    }
}

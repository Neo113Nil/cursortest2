package z4;

import D4.g;
import F4.C0122b;
import L4.C;
import L4.C0226i;
import L4.C0229l;
import L4.I;
import L4.y;
import X3.C0442b;
import X3.j;
import X3.n;
import a.AbstractC0444a;
import j3.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import o4.C2226d;
import v.AbstractC2527w;
import y4.m;
import y4.u;
import y4.z;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f21979a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f21980b = AbstractC2527w.e(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final g f21981c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f21982d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f21983e;
    public static final C2226d f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f21984g;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        continue;
     */
    static {
        byte[] bArr = new byte[0];
        f21979a = bArr;
        C0226i c0226i = new C0226i();
        c0226i.N(bArr, 0, 0);
        long j5 = 0;
        f21981c = new g(null, j5, c0226i, 1);
        b(j5, j5, j5);
        C0229l c0229l = C0229l.f3092n;
        C0229l[] c0229lArr = {i.p("efbbbf"), i.p("feff"), i.p("fffe"), i.p("0000ffff"), i.p("ffff0000")};
        ArrayList arrayList = new ArrayList(new j(c0229lArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 5) {
            arrayList2.set(n.M(arrayList, c0229lArr[i5]), Integer.valueOf(i6));
            i5++;
            i6++;
        }
        if (((C0229l) arrayList.get(0)).c() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C0229l c0229l2 = (C0229l) arrayList.get(i7);
            int i8 = i7 + 1;
            int i9 = i8;
            while (i9 < arrayList.size()) {
                C0229l c0229l3 = (C0229l) arrayList.get(i9);
                c0229l3.getClass();
                l.f("prefix", c0229l2);
                if (c0229l3.l(0, c0229l2, c0229l2.c())) {
                    if (c0229l3.c() == c0229l2.c()) {
                        throw new IllegalArgumentException(("duplicate option: " + c0229l3).toString());
                    }
                    if (((Number) arrayList2.get(i9)).intValue() > ((Number) arrayList2.get(i7)).intValue()) {
                        arrayList.remove(i9);
                        arrayList2.remove(i9);
                    } else {
                        i9++;
                    }
                }
            }
            i7 = i8;
        }
        C0226i c0226i2 = new C0226i();
        AbstractC0444a.j(0L, c0226i2, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i10 = (int) (c0226i2.f3091l / 4);
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = c0226i2.E();
        }
        Object[] copyOf = Arrays.copyOf(c0229lArr, 5);
        l.e("copyOf(...)", copyOf);
        f21982d = new y((C0229l[]) copyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l.c(timeZone);
        f21983e = timeZone;
        f = new C2226d("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String K02 = AbstractC2227e.K0(u.class.getName(), "okhttp3.");
        if (AbstractC2234l.r0(K02, "Client", false)) {
            K02 = K02.substring(0, K02.length() - 6);
            l.e("substring(...)", K02);
        }
        f21984g = K02;
    }

    public static final boolean a(y4.n nVar, y4.n nVar2) {
        l.f("<this>", nVar);
        l.f("other", nVar2);
        return l.a(nVar.f21365d, nVar2.f21365d) && nVar.f21366e == nVar2.f21366e && l.a(nVar.f21362a, nVar2.f21362a);
    }

    public static final void b(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void c(Closeable closeable) {
        l.f("<this>", closeable);
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        l.f("<this>", socket);
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e5) {
            if (!l.a(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i5, String str, String str2) {
        l.f("<this>", str);
        while (i < i5) {
            if (AbstractC2227e.A0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i5;
    }

    public static final int f(String str, char c5, int i, int i5) {
        l.f("<this>", str);
        while (i < i5) {
            if (str.charAt(i) == c5) {
                return i;
            }
            i++;
        }
        return i5;
    }

    public static final boolean g(I i) {
        l.f("timeUnit", TimeUnit.MILLISECONDS);
        try {
            return s(i, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        l.f("format", str);
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        l.f("<this>", strArr);
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0442b i = l.i(strArr2);
                while (i.hasNext()) {
                    if (comparator.compare(str, (String) i.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(z zVar) {
        String c5 = zVar.f21453p.c("Content-Length");
        if (c5 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(c5);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        l.f("elements", objArr);
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(n.O(Arrays.copyOf(objArr2, objArr2.length)));
        l.e("unmodifiableList(listOf(*elements.clone()))", unmodifiableList);
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (l.g(charAt, 31) <= 0 || l.g(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i5, String str) {
        l.f("<this>", str);
        while (i < i5) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i5;
    }

    public static final int n(int i, int i5, String str) {
        l.f("<this>", str);
        int i6 = i5 - 1;
        if (i <= i6) {
            while (true) {
                char charAt = str.charAt(i6);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i) {
                    break;
                }
                i6--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        l.f("other", strArr2);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        l.f("name", str);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' > c5 || c5 >= 'G') {
            return -1;
        }
        return c5 - '7';
    }

    public static final int r(C c5) {
        l.f("<this>", c5);
        return (c5.f() & 255) | ((c5.f() & 255) << 16) | ((c5.f() & 255) << 8);
    }

    public static final boolean s(I i, int i5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.f("timeUnit", timeUnit);
        long nanoTime = System.nanoTime();
        long c5 = i.c().e() ? i.c().c() - nanoTime : Long.MAX_VALUE;
        i.c().d(Math.min(c5, timeUnit.toNanos(i5)) + nanoTime);
        try {
            C0226i c0226i = new C0226i();
            while (i.e(c0226i, 8192L) != -1) {
                c0226i.b();
            }
            if (c5 == Long.MAX_VALUE) {
                i.c().a();
                return true;
            }
            i.c().d(nanoTime + c5);
            return true;
        } catch (InterruptedIOException unused) {
            if (c5 == Long.MAX_VALUE) {
                i.c().a();
                return false;
            }
            i.c().d(nanoTime + c5);
            return false;
        } catch (Throwable th) {
            if (c5 == Long.MAX_VALUE) {
                i.c().a();
            } else {
                i.c().d(nanoTime + c5);
            }
            throw th;
        }
    }

    public static final m t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0122b c0122b = (C0122b) it.next();
            String p5 = c0122b.f1572a.p();
            String p6 = c0122b.f1573b.p();
            arrayList.add(p5);
            arrayList.add(AbstractC2227e.Q0(p6).toString());
        }
        return new m((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(y4.n nVar, boolean z3) {
        l.f("<this>", nVar);
        String str = nVar.f21365d;
        if (AbstractC2227e.B0(str, ":")) {
            str = "[" + str + ']';
        }
        int i = nVar.f21366e;
        if (!z3) {
            String str2 = nVar.f21362a;
            l.f("scheme", str2);
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List v(List list) {
        l.f("<this>", list);
        List unmodifiableList = Collections.unmodifiableList(X3.m.n0(list));
        l.e("unmodifiableList(toMutableList())", unmodifiableList);
        return unmodifiableList;
    }

    public static final int w(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String x(int i, int i5, String str) {
        int m5 = m(i, i5, str);
        String substring = str.substring(m5, n(m5, i5, str));
        l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }
}

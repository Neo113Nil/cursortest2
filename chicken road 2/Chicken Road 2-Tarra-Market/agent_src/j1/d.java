package j1;

import i1.C0071b;
import i1.l;
import i1.m;
import i1.o;
import i1.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import p.AbstractC0819i;
import s1.e;
import s1.h;
import s1.s;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6053a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6054b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final z f6055c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f6056d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f6057e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f6058f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f6059g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f6060h;

    static {
        Method method;
        byte[] bArr = new byte[0];
        f6053a = bArr;
        e eVar = new e();
        eVar.s(0, bArr);
        long j2 = 0;
        f6055c = new z(j2, eVar, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        h.a("efbbbf");
        h.a("feff");
        h.a("fffe");
        h.a("0000ffff");
        h.a("ffff0000");
        f6056d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        f6057e = TimeZone.getTimeZone("GMT");
        f6058f = new b();
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f6059g = method;
        f6060h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static String b(String str) {
        int i2 = -1;
        if (!str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (r2 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(r2);
                    r2 = (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) ? r2 + 1 : 0;
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress f2 = (str.startsWith("[") && str.endsWith("]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (f2 == null) {
            return null;
        }
        byte[] address = f2.getAddress();
        if (address.length != 16) {
            throw new AssertionError(AbstractC0819i.a("Invalid IPv6 address: '", str, "'"));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        e eVar = new e();
        while (r2 < address.length) {
            if (r2 == i2) {
                eVar.t(58);
                r2 += i4;
                if (r2 == 16) {
                    eVar.t(58);
                }
            } else {
                if (r2 > 0) {
                    eVar.t(58);
                }
                eVar.u(((address[r2] & 255) << 8) | (address[r2 + 1] & 255));
                r2 += 2;
            }
        }
        return eVar.o();
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!m(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InetAddress f(String str, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 16;
        byte[] bArr = new byte[16];
        int i7 = 0;
        int i8 = i2;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            if (i8 >= i3) {
                i4 = i6;
                break;
            }
            if (i9 != i6) {
                int i12 = i8 + 2;
                if (i12 <= i3 && str.regionMatches(i8, "::", i7, 2)) {
                    if (i10 == -1) {
                        i9 += 2;
                        if (i12 != i3) {
                            i10 = i9;
                            i11 = i12;
                            i8 = i11;
                            int i13 = 0;
                            while (i8 < i3) {
                            }
                            i5 = i8 - i11;
                            if (i5 == 0) {
                                break;
                            }
                            break;
                        }
                        i4 = i6;
                        i10 = i9;
                        break;
                    }
                    return null;
                }
                if (i9 != 0) {
                    if (!str.regionMatches(i8, StringUtils.PROCESS_POSTFIX_DELIMITER, i7, 1)) {
                        if (!str.regionMatches(i8, ".", i7, 1)) {
                            return null;
                        }
                        int i14 = i9 - 2;
                        int i15 = i14;
                        loop2: while (true) {
                            if (i11 < i3) {
                                if (i15 == i6) {
                                    break;
                                }
                                if (i15 != i14) {
                                    if (str.charAt(i11) != '.') {
                                        break;
                                    }
                                    i11++;
                                }
                                int i16 = i7;
                                int i17 = i11;
                                while (i17 < i3) {
                                    char charAt = str.charAt(i17);
                                    if (charAt < '0' || charAt > '9') {
                                        break;
                                    }
                                    if ((i16 == 0 && i11 != i17) || (i16 = ((i16 * 10) + charAt) - 48) > 255) {
                                        break loop2;
                                    }
                                    i17++;
                                }
                                if (i17 - i11 == 0) {
                                    break;
                                }
                                bArr[i15] = (byte) i16;
                                i15++;
                                i11 = i17;
                                i6 = 16;
                                i7 = 0;
                            } else if (i15 == i9 + 2) {
                                i9 += 2;
                                i4 = 16;
                            }
                        }
                        return null;
                    }
                    i8++;
                }
                i11 = i8;
                i8 = i11;
                int i132 = 0;
                while (i8 < i3) {
                    int e2 = e(str.charAt(i8));
                    if (e2 == -1) {
                        break;
                    }
                    i132 = (i132 << 4) + e2;
                    i8++;
                }
                i5 = i8 - i11;
                if (i5 == 0 || i5 > 4) {
                    break;
                }
                int i18 = i9 + 1;
                bArr[i9] = (byte) ((i132 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i9 += 2;
                bArr[i18] = (byte) (i132 & KotlinVersion.MAX_COMPONENT_VALUE);
                i6 = 16;
                i7 = 0;
            } else {
                return null;
            }
        }
        if (i9 != i4) {
            if (i10 == -1) {
                return null;
            }
            int i19 = i9 - i10;
            System.arraycopy(bArr, i10, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i10, (16 - i9) + i10, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int g(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int h(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean i(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String j(o oVar, boolean z2) {
        boolean contains = oVar.f1379d.contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
        String str = oVar.f1379d;
        if (contains) {
            str = AbstractC0819i.a("[", str, "]");
        }
        int i2 = oVar.f1380e;
        if (!z2 && i2 == o.b(oVar.f1376a)) {
            return str;
        }
        return str + StringUtils.PROCESS_POSTFIX_DELIMITER + i2;
    }

    public static List k(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] l(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean m(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean n(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean o(s sVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = sVar.d().e() ? sVar.d().c() - nanoTime : Long.MAX_VALUE;
        sVar.d().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            e eVar = new e();
            while (sVar.c(eVar, 8192L) != -1) {
                try {
                    eVar.q(eVar.f6618b);
                } catch (EOFException e2) {
                    throw new AssertionError(e2);
                }
            }
            if (c2 == Long.MAX_VALUE) {
                sVar.d().a();
                return true;
            }
            sVar.d().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                sVar.d().a();
                return false;
            }
            sVar.d().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                sVar.d().a();
            } else {
                sVar.d().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int p(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int q(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static m r(ArrayList arrayList) {
        l lVar = new l(0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o1.b bVar = (o1.b) it.next();
            C0071b c0071b = C0071b.f1293e;
            String l2 = bVar.f6260a.l();
            String l3 = bVar.f6261b.l();
            c0071b.getClass();
            lVar.a(l2, l3);
        }
        return new m(lVar);
    }
}

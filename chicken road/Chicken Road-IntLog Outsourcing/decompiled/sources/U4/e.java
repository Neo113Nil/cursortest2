package U4;

import B4.k;
import B4.r;
import L3.j;
import T4.o;
import T4.q;
import T4.u;
import T4.z;
import a5.C0202d;
import g4.AbstractC0464i;
import g4.C0471p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j5.f;
import j5.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f3179a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3180b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        i.b(timeZone);
        f3179a = timeZone;
        String e02 = k.e0(u.class.getName(), "okhttp3.");
        if (r.H(e02, "Client")) {
            e02 = e02.substring(0, e02.length() - 6);
            i.d(e02, "substring(...)");
        }
        f3180b = e02;
    }

    public static final boolean a(q qVar, q other) {
        i.e(qVar, "<this>");
        i.e(other, "other");
        return i.a(qVar.f2926d, other.f2926d) && qVar.f2927e == other.f2927e && i.a(qVar.f2923a, other.f2923a);
    }

    public static final int b(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e3) {
            throw e3;
        } catch (RuntimeException e6) {
            if (!i.a(e6.getMessage(), "bio == null")) {
                throw e6;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean d(w wVar, TimeUnit timeUnit) {
        i.e(timeUnit, "timeUnit");
        try {
            return g(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String e(String format, Object... objArr) {
        i.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long f(z zVar) {
        String c2 = zVar.f3020f.c("Content-Length");
        if (c2 == null) {
            return -1L;
        }
        byte[] bArr = c.f3176a;
        try {
            return Long.parseLong(c2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final boolean g(w wVar, int i2, TimeUnit timeUnit) {
        i.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = wVar.d().e() ? wVar.d().c() - nanoTime : Long.MAX_VALUE;
        wVar.d().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            f fVar = new f();
            while (wVar.s(fVar, 8192L) != -1) {
                fVar.D(fVar.f10495b);
            }
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final o h(List list) {
        j jVar = new j(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0202d c0202d = (C0202d) it.next();
            B0.f.i(jVar, c0202d.f3932a.k(), c0202d.f3933b.k());
        }
        return jVar.d();
    }

    public static final String i(q qVar, boolean z) {
        i.e(qVar, "<this>");
        String str = qVar.f2926d;
        if (k.R(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            str = B0.o.j("[", str, ']');
        }
        int i2 = qVar.f2927e;
        if (!z) {
            String scheme = qVar.f2923a;
            i.e(scheme, "scheme");
            if (i2 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List j(List list) {
        i.e(list, "<this>");
        if (list.isEmpty()) {
            return C0471p.f5750a;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            i.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        i.d(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(AbstractC0464i.M(array));
        i.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C0471p.f5750a;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            i.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(AbstractC0464i.M((Object[]) objArr.clone()));
        i.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}

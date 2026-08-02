package Ye;

import Sc.C4001c;
import We.A;
import We.E;
import We.InterfaceC4865g;
import We.K;
import We.L;
import We.M;
import We.N;
import We.v;
import We.z;
import gf.C6727c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import sf.C9674B;
import sf.C9681g;
import sf.C9684j;
import sf.G;
import sf.InterfaceC9683i;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f34900a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final z f34901b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final N f34902c;

    /* renamed from: d, reason: collision with root package name */
    private static final C9674B f34903d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final TimeZone f34904e;

    /* renamed from: f, reason: collision with root package name */
    private static final Regex f34905f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f34906g;

    static final class a implements v.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f34907a;

        a(v vVar) {
            this.f34907a = vVar;
        }

        @Override // We.v.c
        @NotNull
        public final v create(@NotNull InterfaceC4865g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f34907a;
        }
    }

    /* renamed from: Ye.b$b, reason: collision with other inner class name */
    static final class ThreadFactoryC0649b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34908a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34909b;

        ThreadFactoryC0649b(String str, boolean z11) {
            this.f34908a = str;
            this.f34909b = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f34908a);
            thread.setDaemon(this.f34909b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f34900a = bArr;
        z.f33821b.getClass();
        f34901b = z.b.f(new String[0]);
        M.INSTANCE.getClass();
        f34902c = M.Companion.c(bArr, null);
        K.Companion.d(K.INSTANCE, bArr, null, 0, 7);
        int i11 = C9674B.f98649d;
        C9684j c9684j = C9684j.f98719d;
        f34903d = C9674B.a.b(C9684j.a.b("efbbbf"), C9684j.a.b("feff"), C9684j.a.b("fffe"), C9684j.a.b("0000ffff"), C9684j.a.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.f(timeZone);
        f34904e = timeZone;
        f34905f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = E.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f34906g = h.U(h.S(name, "okhttp3."), "Client");
    }

    @NotNull
    public static final String A(@NotNull A toHostHeader, boolean z11) {
        String h11;
        Intrinsics.checkNotNullParameter(toHostHeader, "$this$toHostHeader");
        if (h.t(toHostHeader.h(), ProductContainerDTO.RATIO_DELIMITER, false)) {
            h11 = "[" + toHostHeader.h() + ']';
        } else {
            h11 = toHostHeader.h();
        }
        if (!z11) {
            int n11 = toHostHeader.n();
            A.b bVar = A.f33515l;
            String u11 = toHostHeader.u();
            bVar.getClass();
            if (n11 == A.b.b(u11)) {
                return h11;
            }
        }
        return h11 + ':' + toHostHeader.n();
    }

    @NotNull
    public static final <T> List<T> B(@NotNull List<? extends T> toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C7714v.W0(toImmutableList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int C(int i11, String str) {
        if (str == null) {
            return i11;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    @NotNull
    public static final String D(int i11, int i12, @NotNull String trimSubstring) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int p11 = p(i11, i12, trimSubstring);
        String substring = trimSubstring.substring(p11, q(p11, i12, trimSubstring));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final void E(@NotNull IOException withSuppressed, @NotNull List suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            C4001c.a(withSuppressed, (Exception) it.next());
        }
    }

    @NotNull
    public static final v.c a(@NotNull v asFactory) {
        Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
        return new a(asFactory);
    }

    public static final boolean b(@NotNull String canParseAsIpAddress) {
        Intrinsics.checkNotNullParameter(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return f34905f.f(canParseAsIpAddress);
    }

    public static final boolean c(@NotNull A canReuseConnectionFor, @NotNull A other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.d(canReuseConnectionFor.h(), other.h()) && canReuseConnectionFor.n() == other.n() && Intrinsics.d(canReuseConnectionFor.u(), other.u());
    }

    public static final int d(@NotNull String name, TimeUnit timeUnit, long j11) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j11 < 0) {
            throw new IllegalStateException(name.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j11);
        if (millis > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(name.concat(" too large.").toString());
        }
        if (millis != 0 || j11 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(name.concat(" too small.").toString());
    }

    public static final void e(@NotNull Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final void f(@NotNull Socket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (!Intrinsics.d(e12.getMessage(), "bio == null")) {
                throw e12;
            }
        } catch (Exception unused) {
        }
    }

    public static final int g(int i11, int i12, @NotNull String delimiterOffset, @NotNull String delimiters) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i11 < i12) {
            if (h.u(delimiters, delimiterOffset.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final int h(@NotNull String delimiterOffset, char c11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i11 < i12) {
            if (delimiterOffset.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int i(String str, char c11, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return h(str, c11, i11, i12);
    }

    public static final boolean j(@NotNull sf.M discard) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return x(discard, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final String k(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    public static final boolean l(@NotNull String[] hasIntersection, String[] strArr, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (hasIntersection.length != 0 && strArr != null && strArr.length != 0) {
            for (String str : hasIntersection) {
                for (String str2 : strArr) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long m(@NotNull L headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String toLongOrDefault = headersContentLength.r().c("Content-Length");
        if (toLongOrDefault == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> n(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C7714v.b0(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int o(@NotNull String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = indexOfControlOrNonAscii.charAt(i11);
            if (Intrinsics.i(charAt, 31) <= 0 || Intrinsics.i(charAt, 127) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int p(int i11, int i12, @NotNull String indexOfFirstNonAsciiWhitespace) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i11 < i12) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final int q(int i11, int i12, @NotNull String indexOfLastNonAsciiWhitespace) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i13 = i12 - 1;
        if (i13 >= i11) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i13);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13--;
            }
        }
        return i11;
    }

    @NotNull
    public static final String[] r(@NotNull String[] intersect, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i11]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i11++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean s(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return h.D(name, "Authorization", true) || h.D(name, "Cookie", true) || h.D(name, "Proxy-Authorization", true) || h.D(name, "Set-Cookie", true);
    }

    public static final int t(char c11) {
        if ('0' <= c11 && '9' >= c11) {
            return c11 - '0';
        }
        if ('a' <= c11 && 'f' >= c11) {
            return c11 - 'W';
        }
        if ('A' <= c11 && 'F' >= c11) {
            return c11 - '7';
        }
        return -1;
    }

    @NotNull
    public static final Charset u(@NotNull InterfaceC9683i readBomAsCharset, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(readBomAsCharset, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int R02 = readBomAsCharset.R0(f34903d);
        if (R02 == -1) {
            return charset;
        }
        if (R02 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (R02 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (R02 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (R02 == 3) {
            Charsets.f71941a.getClass();
            return Charsets.a();
        }
        if (R02 != 4) {
            throw new AssertionError();
        }
        Charsets.f71941a.getClass();
        return Charsets.b();
    }

    public static final int v(@NotNull G readMedium) throws IOException {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return (readMedium.readByte() & 255) | ((readMedium.readByte() & 255) << 16) | ((readMedium.readByte() & 255) << 8);
    }

    public static final int w(@NotNull C9681g skipAll, byte b11) {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        int i11 = 0;
        while (!skipAll.m() && skipAll.o(0L) == b11) {
            i11++;
            skipAll.readByte();
        }
        return i11;
    }

    public static final boolean x(@NotNull sf.M skipAll, int i11) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c11 = skipAll.timeout().e() ? skipAll.timeout().c() - nanoTime : Long.MAX_VALUE;
        skipAll.timeout().d(Math.min(c11, timeUnit.toNanos(i11)) + nanoTime);
        try {
            C9681g c9681g = new C9681g();
            while (skipAll.read(c9681g, 8192L) != -1) {
                c9681g.c();
            }
            if (c11 == Long.MAX_VALUE) {
                skipAll.timeout().a();
                return true;
            }
            skipAll.timeout().d(nanoTime + c11);
            return true;
        } catch (InterruptedIOException unused) {
            if (c11 == Long.MAX_VALUE) {
                skipAll.timeout().a();
                return false;
            }
            skipAll.timeout().d(nanoTime + c11);
            return false;
        } catch (Throwable th2) {
            if (c11 == Long.MAX_VALUE) {
                skipAll.timeout().a();
            } else {
                skipAll.timeout().d(nanoTime + c11);
            }
            throw th2;
        }
    }

    @NotNull
    public static final ThreadFactory y(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactoryC0649b(name, z11);
    }

    @NotNull
    public static final z z(@NotNull List<C6727c> toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        z.a aVar = new z.a();
        for (C6727c c6727c : toHeaders) {
            aVar.c(c6727c.f64303b.H(), c6727c.f64304c.H());
        }
        return aVar.e();
    }
}

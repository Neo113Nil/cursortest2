package We;

import We.C4864f;
import We.M;
import We.z;
import cf.C5822c;
import ef.C6355e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes6.dex */
public final class L implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private C4864f f33637a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final G f33638b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final F f33639c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f33640d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33641e;

    /* renamed from: f, reason: collision with root package name */
    private final y f33642f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final z f33643g;

    /* renamed from: h, reason: collision with root package name */
    private final M f33644h;

    /* renamed from: i, reason: collision with root package name */
    private final L f33645i;

    /* renamed from: j, reason: collision with root package name */
    private final L f33646j;

    /* renamed from: k, reason: collision with root package name */
    private final L f33647k;

    /* renamed from: l, reason: collision with root package name */
    private final long f33648l;

    /* renamed from: m, reason: collision with root package name */
    private final long f33649m;

    /* renamed from: n, reason: collision with root package name */
    private final C5822c f33650n;

    public L(@NotNull G request, @NotNull F protocol, @NotNull String message, int i11, y yVar, @NotNull z headers, M m11, L l11, L l12, L l13, long j11, long j12, C5822c c5822c) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f33638b = request;
        this.f33639c = protocol;
        this.f33640d = message;
        this.f33641e = i11;
        this.f33642f = yVar;
        this.f33643g = headers;
        this.f33644h = m11;
        this.f33645i = l11;
        this.f33646j = l12;
        this.f33647k = l13;
        this.f33648l = j11;
        this.f33649m = j12;
        this.f33650n = c5822c;
    }

    public static String q(L l11, String name) {
        l11.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String c11 = l11.f33643g.c(name);
        if (c11 != null) {
            return c11;
        }
        return null;
    }

    @NotNull
    public final F B() {
        return this.f33639c;
    }

    public final long I() {
        return this.f33649m;
    }

    @NotNull
    public final G L() {
        return this.f33638b;
    }

    public final long O() {
        return this.f33648l;
    }

    public final M c() {
        return this.f33644h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        M m11 = this.f33644h;
        if (m11 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        m11.close();
    }

    @NotNull
    public final C4864f d() {
        C4864f c4864f = this.f33637a;
        if (c4864f != null) {
            return c4864f;
        }
        C4864f.b bVar = C4864f.f33719p;
        z zVar = this.f33643g;
        bVar.getClass();
        C4864f a11 = C4864f.b.a(zVar);
        this.f33637a = a11;
        return a11;
    }

    public final L j() {
        return this.f33646j;
    }

    @NotNull
    public final List<C4868j> k() {
        String str;
        int i11 = this.f33641e;
        if (i11 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i11 != 407) {
                return kotlin.collections.K.f71697a;
            }
            str = "Proxy-Authenticate";
        }
        return C6355e.a(this.f33643g, str);
    }

    public final int m() {
        return this.f33641e;
    }

    public final C5822c o() {
        return this.f33650n;
    }

    public final y p() {
        return this.f33642f;
    }

    @NotNull
    public final z r() {
        return this.f33643g;
    }

    @NotNull
    public final List<String> s(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f33643g.l(name);
    }

    public final boolean t() {
        int i11 = this.f33641e;
        if (i11 == 307 || i11 == 308) {
            return true;
        }
        switch (i11) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    @NotNull
    public final String toString() {
        return "Response{protocol=" + this.f33639c + ", code=" + this.f33641e + ", message=" + this.f33640d + ", url=" + this.f33638b.j() + '}';
    }

    public final boolean v() {
        int i11 = this.f33641e;
        return 200 <= i11 && 299 >= i11;
    }

    @NotNull
    public final String w() {
        return this.f33640d;
    }

    public final L x() {
        return this.f33645i;
    }

    @NotNull
    public final N y(long j11) throws IOException {
        M m11 = this.f33644h;
        Intrinsics.f(m11);
        sf.G source = m11.source().peek();
        C9681g c9681g = new C9681g();
        source.n(j11);
        long min = Math.min(j11, source.f98667b.size());
        Intrinsics.checkNotNullParameter(source, "source");
        while (min > 0) {
            long read = source.read(c9681g, min);
            if (read == -1) {
                throw new EOFException();
            }
            min -= read;
        }
        M.Companion companion = M.INSTANCE;
        C contentType = m11.contentType();
        long size = c9681g.size();
        companion.getClass();
        return M.Companion.b(c9681g, contentType, size);
    }

    public final L z() {
        return this.f33647k;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private G f33651a;

        /* renamed from: b, reason: collision with root package name */
        private F f33652b;

        /* renamed from: c, reason: collision with root package name */
        private int f33653c;

        /* renamed from: d, reason: collision with root package name */
        private String f33654d;

        /* renamed from: e, reason: collision with root package name */
        private y f33655e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private z.a f33656f;

        /* renamed from: g, reason: collision with root package name */
        private M f33657g;

        /* renamed from: h, reason: collision with root package name */
        private L f33658h;

        /* renamed from: i, reason: collision with root package name */
        private L f33659i;

        /* renamed from: j, reason: collision with root package name */
        private L f33660j;

        /* renamed from: k, reason: collision with root package name */
        private long f33661k;

        /* renamed from: l, reason: collision with root package name */
        private long f33662l;

        /* renamed from: m, reason: collision with root package name */
        private C5822c f33663m;

        public a() {
            this.f33653c = -1;
            this.f33656f = new z.a();
        }

        private static void e(L l11, String str) {
            if (l11 != null) {
                if (l11.c() != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (l11.x() != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (l11.j() != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (l11.z() != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f33656f.a(name, value);
        }

        @NotNull
        public final void b(M m11) {
            this.f33657g = m11;
        }

        @NotNull
        public final L c() {
            int i11 = this.f33653c;
            if (i11 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f33653c).toString());
            }
            G g10 = this.f33651a;
            if (g10 == null) {
                throw new IllegalStateException("request == null");
            }
            F f7 = this.f33652b;
            if (f7 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f33654d;
            if (str != null) {
                return new L(g10, f7, str, i11, this.f33655e, this.f33656f.e(), this.f33657g, this.f33658h, this.f33659i, this.f33660j, this.f33661k, this.f33662l, this.f33663m);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public final void d(L l11) {
            e(l11, "cacheResponse");
            this.f33659i = l11;
        }

        @NotNull
        public final void f(int i11) {
            this.f33653c = i11;
        }

        public final int g() {
            return this.f33653c;
        }

        @NotNull
        public final void h(y yVar) {
            this.f33655e = yVar;
        }

        @NotNull
        public final void i(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            z.a aVar = this.f33656f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            z.b bVar = z.f33821b;
            z.b.a(bVar, name);
            z.b.b(bVar, value, name);
            aVar.h(name);
            aVar.c(name, value);
        }

        @NotNull
        public final void j(@NotNull z headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f33656f = headers.h();
        }

        public final void k(@NotNull C5822c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f33663m = deferredTrailers;
        }

        @NotNull
        public final void l(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f33654d = message;
        }

        @NotNull
        public final void m(L l11) {
            e(l11, "networkResponse");
            this.f33658h = l11;
        }

        @NotNull
        public final void n(L l11) {
            if (l11.c() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f33660j = l11;
        }

        @NotNull
        public final void o(@NotNull F protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f33652b = protocol;
        }

        @NotNull
        public final void p(long j11) {
            this.f33662l = j11;
        }

        @NotNull
        public final void q(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f33656f.h(name);
        }

        @NotNull
        public final void r(@NotNull G request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f33651a = request;
        }

        @NotNull
        public final void s(long j11) {
            this.f33661k = j11;
        }

        public a(@NotNull L response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f33653c = -1;
            this.f33651a = response.L();
            this.f33652b = response.B();
            this.f33653c = response.m();
            this.f33654d = response.w();
            this.f33655e = response.p();
            this.f33656f = response.r().h();
            this.f33657g = response.c();
            this.f33658h = response.x();
            this.f33659i = response.j();
            this.f33660j = response.z();
            this.f33661k = response.O();
            this.f33662l = response.I();
            this.f33663m = response.o();
        }
    }
}

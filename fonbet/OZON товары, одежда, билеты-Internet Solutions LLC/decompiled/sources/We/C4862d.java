package We;

import We.C;
import We.G;
import We.L;
import We.P;
import We.z;
import af.C5015e;
import af.InterfaceC5013c;
import ef.C6360j;
import hf.InterfaceC6945b;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p002if.j;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9683i;

/* renamed from: We.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4862d implements Closeable, Flushable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f33686d = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5015e f33687a;

    /* renamed from: b, reason: collision with root package name */
    private int f33688b;

    /* renamed from: c, reason: collision with root package name */
    private int f33689c;

    /* renamed from: We.d$a */
    private static final class a extends M {

        /* renamed from: a, reason: collision with root package name */
        private final sf.G f33690a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C5015e.c f33691b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33692c;

        /* renamed from: d, reason: collision with root package name */
        private final String f33693d;

        /* renamed from: We.d$a$a, reason: collision with other inner class name */
        public static final class C0597a extends sf.q {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ sf.M f33695b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0597a(sf.M m11, sf.M m12) {
                super(m12);
                this.f33695b = m11;
            }

            @Override // sf.q, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                a.this.c().close();
                super.close();
            }
        }

        public a(@NotNull C5015e.c snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f33691b = snapshot;
            this.f33692c = str;
            this.f33693d = str2;
            sf.M d11 = snapshot.d(1);
            this.f33690a = sf.z.d(new C0597a(d11, d11));
        }

        @NotNull
        public final C5015e.c c() {
            return this.f33691b;
        }

        @Override // We.M
        public final long contentLength() {
            String toLongOrDefault = this.f33693d;
            if (toLongOrDefault == null) {
                return -1L;
            }
            byte[] bArr = Ye.b.f34900a;
            Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
            try {
                return Long.parseLong(toLongOrDefault);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // We.M
        public final C contentType() {
            String str = this.f33692c;
            if (str == null) {
                return null;
            }
            C.f33536g.getClass();
            return C.a.b(str);
        }

        @Override // We.M
        @NotNull
        public final InterfaceC9683i source() {
            return this.f33690a;
        }
    }

    /* renamed from: We.d$b */
    public static final class b {
        public static boolean a(@NotNull L hasVaryAll) {
            Intrinsics.checkNotNullParameter(hasVaryAll, "$this$hasVaryAll");
            return d(hasVaryAll.r()).contains("*");
        }

        @NotNull
        public static String b(@NotNull A url) {
            Intrinsics.checkNotNullParameter(url, "url");
            C9684j c9684j = C9684j.f98719d;
            return C9684j.a.c(url.toString()).d("MD5").h();
        }

        public static int c(@NotNull sf.G source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long j11 = source.j();
                String s11 = source.s(Long.MAX_VALUE);
                if (j11 >= 0 && j11 <= Integer.MAX_VALUE && s11.length() <= 0) {
                    return (int) j11;
                }
                throw new IOException("expected an int but was \"" + j11 + s11 + '\"');
            } catch (NumberFormatException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        private static Set d(z zVar) {
            int size = zVar.size();
            TreeSet treeSet = null;
            for (int i11 = 0; i11 < size; i11++) {
                if ("Vary".equalsIgnoreCase(zVar.e(i11))) {
                    String k11 = zVar.k(i11);
                    if (treeSet == null) {
                        Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    for (String str : kotlin.text.h.l(k11, new char[]{','}, 0, 6)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(kotlin.text.h.z0(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : kotlin.collections.M.f71699a;
        }

        @NotNull
        public static z e(@NotNull L varyHeaders) {
            Intrinsics.checkNotNullParameter(varyHeaders, "$this$varyHeaders");
            L x11 = varyHeaders.x();
            Intrinsics.f(x11);
            z e11 = x11.L().e();
            Set d11 = d(varyHeaders.r());
            if (d11.isEmpty()) {
                return Ye.b.f34901b;
            }
            z.a aVar = new z.a();
            int size = e11.size();
            for (int i11 = 0; i11 < size; i11++) {
                String e12 = e11.e(i11);
                if (d11.contains(e12)) {
                    aVar.a(e12, e11.k(i11));
                }
            }
            return aVar.e();
        }

        public static boolean f(@NotNull L cachedResponse, @NotNull z cachedRequest, @NotNull G newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> d11 = d(cachedResponse.r());
            if ((d11 instanceof Collection) && d11.isEmpty()) {
                return true;
            }
            for (String str : d11) {
                if (!Intrinsics.d(cachedRequest.l(str), newRequest.f(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: We.d$d, reason: collision with other inner class name */
    public final class C0598d implements InterfaceC5013c {

        /* renamed from: a, reason: collision with root package name */
        private final sf.K f33708a;

        /* renamed from: b, reason: collision with root package name */
        private final a f33709b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33710c;

        /* renamed from: d, reason: collision with root package name */
        private final C5015e.a f33711d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4862d f33712e;

        /* renamed from: We.d$d$a */
        public static final class a extends sf.p {
            a(sf.K k11) {
                super(k11);
            }

            @Override // sf.p, sf.K, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                synchronized (C0598d.this.f33712e) {
                    if (C0598d.this.d()) {
                        return;
                    }
                    C0598d.this.e();
                    C4862d c4862d = C0598d.this.f33712e;
                    c4862d.q(c4862d.k() + 1);
                    super.close();
                    C0598d.this.f33711d.b();
                }
            }
        }

        public C0598d(@NotNull C4862d c4862d, C5015e.a editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f33712e = c4862d;
            this.f33711d = editor;
            sf.K f7 = editor.f(1);
            this.f33708a = f7;
            this.f33709b = new a(f7);
        }

        @Override // af.InterfaceC5013c
        public final void a() {
            synchronized (this.f33712e) {
                if (this.f33710c) {
                    return;
                }
                this.f33710c = true;
                C4862d c4862d = this.f33712e;
                c4862d.p(c4862d.j() + 1);
                Ye.b.e(this.f33708a);
                try {
                    this.f33711d.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // af.InterfaceC5013c
        @NotNull
        public final a b() {
            return this.f33709b;
        }

        public final boolean d() {
            return this.f33710c;
        }

        public final void e() {
            this.f33710c = true;
        }
    }

    public C4862d(@NotNull File directory, long j11) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        InterfaceC6945b fileSystem = InterfaceC6945b.f65492a;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f33687a = new C5015e(directory, j11, bf.e.f55976h);
    }

    public static void r(@NotNull L cached, @NotNull L network) {
        C5015e.a aVar;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        c cVar = new c(network);
        M c11 = cached.c();
        if (c11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            aVar = ((a) c11).c().c();
            if (aVar != null) {
                try {
                    cVar.e(aVar);
                    aVar.b();
                } catch (IOException unused) {
                    if (aVar != null) {
                        try {
                            aVar.a();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (IOException unused3) {
            aVar = null;
        }
    }

    public final L c(@NotNull G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        A j11 = request.j();
        f33686d.getClass();
        try {
            C5015e.c v11 = this.f33687a.v(b.b(j11));
            if (v11 != null) {
                try {
                    c cVar = new c(v11.d(0));
                    L c11 = cVar.c(v11);
                    if (cVar.a(request, c11)) {
                        return c11;
                    }
                    M c12 = c11.c();
                    if (c12 != null) {
                        Ye.b.e(c12);
                        return null;
                    }
                } catch (IOException unused) {
                    Ye.b.e(v11);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33687a.close();
    }

    @NotNull
    public final C5015e d() {
        return this.f33687a;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.f33687a.flush();
    }

    public final int j() {
        return this.f33689c;
    }

    public final int k() {
        return this.f33688b;
    }

    public final InterfaceC5013c m(@NotNull L response) {
        C5015e.a aVar;
        Intrinsics.checkNotNullParameter(response, "response");
        String h11 = response.L().h();
        String method = response.L().h();
        Intrinsics.checkNotNullParameter(method, "method");
        if (Intrinsics.d(method, "POST") || Intrinsics.d(method, "PATCH") || Intrinsics.d(method, "PUT") || Intrinsics.d(method, "DELETE") || Intrinsics.d(method, "MOVE")) {
            o(response.L());
            return null;
        }
        if (Intrinsics.d(h11, "GET")) {
            f33686d.getClass();
            if (!b.a(response)) {
                c cVar = new c(response);
                try {
                    C5015e c5015e = this.f33687a;
                    String b11 = b.b(response.L().j());
                    Regex regex = C5015e.f36710t;
                    aVar = c5015e.t(-1L, b11);
                    if (aVar != null) {
                        try {
                            cVar.e(aVar);
                            return new C0598d(this, aVar);
                        } catch (IOException unused) {
                            if (aVar != null) {
                                aVar.a();
                            }
                            return null;
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                }
            }
        }
        return null;
    }

    public final void o(@NotNull G request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        A j11 = request.j();
        f33686d.getClass();
        this.f33687a.W(b.b(j11));
    }

    public final void p(int i11) {
        this.f33689c = i11;
    }

    public final void q(int i11) {
        this.f33688b = i11;
    }

    @NotNull
    public final C4863e s() throws IOException {
        return new C4863e(this);
    }

    public final synchronized int t() {
        return this.f33689c;
    }

    public final synchronized int v() {
        return this.f33688b;
    }

    /* renamed from: We.d$c */
    private static final class c {

        /* renamed from: k, reason: collision with root package name */
        private static final String f33696k;

        /* renamed from: l, reason: collision with root package name */
        private static final String f33697l;

        /* renamed from: a, reason: collision with root package name */
        private final String f33698a;

        /* renamed from: b, reason: collision with root package name */
        private final z f33699b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33700c;

        /* renamed from: d, reason: collision with root package name */
        private final F f33701d;

        /* renamed from: e, reason: collision with root package name */
        private final int f33702e;

        /* renamed from: f, reason: collision with root package name */
        private final String f33703f;

        /* renamed from: g, reason: collision with root package name */
        private final z f33704g;

        /* renamed from: h, reason: collision with root package name */
        private final y f33705h;

        /* renamed from: i, reason: collision with root package name */
        private final long f33706i;

        /* renamed from: j, reason: collision with root package name */
        private final long f33707j;

        static {
            p002if.j jVar;
            p002if.j jVar2;
            j.a aVar = p002if.j.f66400c;
            aVar.getClass();
            jVar = p002if.j.f66398a;
            jVar.getClass();
            f33696k = "OkHttp-Sent-Millis";
            aVar.getClass();
            jVar2 = p002if.j.f66398a;
            jVar2.getClass();
            f33697l = "OkHttp-Received-Millis";
        }

        public c(@NotNull sf.M rawSource) throws IOException {
            P tlsVersion;
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                sf.G d11 = sf.z.d(rawSource);
                this.f33698a = d11.s(Long.MAX_VALUE);
                this.f33700c = d11.s(Long.MAX_VALUE);
                z.a aVar = new z.a();
                C4862d.f33686d.getClass();
                int c11 = b.c(d11);
                for (int i11 = 0; i11 < c11; i11++) {
                    aVar.b(d11.s(Long.MAX_VALUE));
                }
                this.f33699b = aVar.e();
                C6360j a11 = C6360j.a.a(d11.s(Long.MAX_VALUE));
                this.f33701d = a11.f62236a;
                this.f33702e = a11.f62237b;
                this.f33703f = a11.f62238c;
                z.a aVar2 = new z.a();
                C4862d.f33686d.getClass();
                int c12 = b.c(d11);
                for (int i12 = 0; i12 < c12; i12++) {
                    aVar2.b(d11.s(Long.MAX_VALUE));
                }
                String str = f33696k;
                String f7 = aVar2.f(str);
                String str2 = f33697l;
                String f11 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.f33706i = f7 != null ? Long.parseLong(f7) : 0L;
                this.f33707j = f11 != null ? Long.parseLong(f11) : 0L;
                this.f33704g = aVar2.e();
                if (kotlin.text.h.e0(this.f33698a, "https://", false)) {
                    String s11 = d11.s(Long.MAX_VALUE);
                    if (s11.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + s11 + '\"');
                    }
                    C4869k cipherSuite = C4869k.f33769t.b(d11.s(Long.MAX_VALUE));
                    List peerCertificates = b(d11);
                    List localCertificates = b(d11);
                    if (d11.c()) {
                        tlsVersion = P.SSL_3_0;
                    } else {
                        P.a aVar3 = P.Companion;
                        String s12 = d11.s(Long.MAX_VALUE);
                        aVar3.getClass();
                        tlsVersion = P.a.a(s12);
                    }
                    y.f33814e.getClass();
                    Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
                    Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                    Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
                    this.f33705h = new y(tlsVersion, cipherSuite, Ye.b.B(localCertificates), new x(Ye.b.B(peerCertificates)));
                } else {
                    this.f33705h = null;
                }
                rawSource.close();
            } catch (Throwable th2) {
                rawSource.close();
                throw th2;
            }
        }

        private static List b(sf.G g10) throws IOException {
            C4862d.f33686d.getClass();
            int c11 = b.c(g10);
            if (c11 == -1) {
                return kotlin.collections.K.f71697a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c11);
                for (int i11 = 0; i11 < c11; i11++) {
                    String s11 = g10.s(Long.MAX_VALUE);
                    C9681g c9681g = new C9681g();
                    C9684j c9684j = C9684j.f98719d;
                    C9684j a11 = C9684j.a.a(s11);
                    Intrinsics.f(a11);
                    c9681g.X(a11);
                    arrayList.add(certificateFactory.generateCertificate(c9681g.a2()));
                }
                return arrayList;
            } catch (CertificateException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        private static void d(sf.F f7, List list) throws IOException {
            try {
                f7.Y(list.size());
                f7.h0(10);
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    byte[] bytes = ((Certificate) list.get(i11)).getEncoded();
                    C9684j c9684j = C9684j.f98719d;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    f7.h1(C9684j.a.d(bytes).a());
                    f7.h0(10);
                }
            } catch (CertificateEncodingException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        public final boolean a(@NotNull G request, @NotNull L response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!Intrinsics.d(this.f33698a, request.j().toString()) || !Intrinsics.d(this.f33700c, request.h())) {
                return false;
            }
            C4862d.f33686d.getClass();
            return b.f(response, this.f33699b, request);
        }

        @NotNull
        public final L c(@NotNull C5015e.c snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            z zVar = this.f33704g;
            String c11 = zVar.c("Content-Type");
            String c12 = zVar.c("Content-Length");
            G.a aVar = new G.a();
            aVar.k(this.f33698a);
            aVar.f(null, this.f33700c);
            aVar.e(this.f33699b);
            G b11 = aVar.b();
            L.a aVar2 = new L.a();
            aVar2.r(b11);
            aVar2.o(this.f33701d);
            aVar2.f(this.f33702e);
            aVar2.l(this.f33703f);
            aVar2.j(zVar);
            aVar2.b(new a(snapshot, c11, c12));
            aVar2.h(this.f33705h);
            aVar2.s(this.f33706i);
            aVar2.p(this.f33707j);
            return aVar2.c();
        }

        public final void e(@NotNull C5015e.a editor) throws IOException {
            String str = this.f33698a;
            y yVar = this.f33705h;
            z zVar = this.f33704g;
            z zVar2 = this.f33699b;
            Intrinsics.checkNotNullParameter(editor, "editor");
            sf.F c11 = sf.z.c(editor.f(0));
            try {
                c11.h1(str);
                c11.h0(10);
                c11.h1(this.f33700c);
                c11.h0(10);
                c11.Y(zVar2.size());
                c11.h0(10);
                int size = zVar2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c11.h1(zVar2.e(i11));
                    c11.h1(": ");
                    c11.h1(zVar2.k(i11));
                    c11.h0(10);
                }
                F protocol = this.f33701d;
                int i12 = this.f33702e;
                String message = this.f33703f;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb2 = new StringBuilder();
                if (protocol == F.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(i12);
                sb2.append(' ');
                sb2.append(message);
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                c11.h1(sb3);
                c11.h0(10);
                c11.Y(zVar.size() + 2);
                c11.h0(10);
                int size2 = zVar.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    c11.h1(zVar.e(i13));
                    c11.h1(": ");
                    c11.h1(zVar.k(i13));
                    c11.h0(10);
                }
                c11.h1(f33696k);
                c11.h1(": ");
                c11.Y(this.f33706i);
                c11.h0(10);
                c11.h1(f33697l);
                c11.h1(": ");
                c11.Y(this.f33707j);
                c11.h0(10);
                if (kotlin.text.h.e0(str, "https://", false)) {
                    c11.h0(10);
                    Intrinsics.f(yVar);
                    c11.h1(yVar.a().c());
                    c11.h0(10);
                    d(c11, yVar.c());
                    d(c11, yVar.b());
                    c11.h1(yVar.d().a());
                    c11.h0(10);
                }
                Unit unit = Unit.f71690a;
                c11.close();
            } finally {
            }
        }

        public c(@NotNull L response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f33698a = response.L().j().toString();
            C4862d.f33686d.getClass();
            this.f33699b = b.e(response);
            this.f33700c = response.L().h();
            this.f33701d = response.B();
            this.f33702e = response.m();
            this.f33703f = response.w();
            this.f33704g = response.r();
            this.f33705h = response.p();
            this.f33706i = response.O();
            this.f33707j = response.I();
        }
    }
}

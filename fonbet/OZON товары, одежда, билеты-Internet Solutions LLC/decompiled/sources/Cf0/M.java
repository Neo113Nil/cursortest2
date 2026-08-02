package Cf0;

import De.C2859b;
import E0.C2942q;
import We.B;
import We.C4869k;
import We.InterfaceC4870l;
import ef.C6355e;
import io.sentry.W2;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9683i;

/* loaded from: classes7.dex */
public final class M implements We.B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private volatile kotlin.collections.M f4879a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private volatile a f4880b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASIC;
        public static final a BODY;
        public static final a HEADERS;
        public static final a NONE;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("BASIC", 1);
            BASIC = aVar2;
            a aVar3 = new a("HEADERS", 2);
            HEADERS = aVar3;
            a aVar4 = new a("BODY", 3);
            BODY = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f4881a = new N();
    }

    public M() {
        b logger = b.f4881a;
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f4879a = kotlin.collections.M.f71699a;
        this.f4880b = a.NONE;
    }

    private final void a(We.z zVar, int i11) {
        this.f4879a.contains(zVar.e(i11));
        String k11 = zVar.k(i11);
        String message = zVar.e(i11) + ": " + k11;
        Intrinsics.checkNotNullParameter(message, "message");
        C2859b.g(p002if.j.f66400c, message, 6);
    }

    public final void b(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f4880b = aVar;
    }

    @Override // We.B
    @NotNull
    public final We.L intercept(@NotNull B.a chain) throws IOException {
        We.G g10;
        boolean z11;
        String str;
        String str2;
        String str3;
        We.M m11;
        String str4;
        String str5;
        String str6;
        String b11;
        Long l11;
        Charset UTF_8;
        p002if.j jVar;
        p002if.j jVar2;
        C4869k a11;
        String str7;
        Charset UTF_82;
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.f4880b;
        We.G request = chain.request();
        if (aVar == a.NONE) {
            return chain.proceed(request);
        }
        boolean z12 = aVar == a.BODY;
        boolean z13 = z12 || aVar == a.HEADERS;
        We.K a12 = request.a();
        InterfaceC4870l connection = chain.connection();
        String message = "--> " + request.h() + " " + request.j() + (connection != null ? " " + connection.a() : "");
        if (!z13 && a12 != null) {
            message = message + " (" + a12.contentLength() + "-byte body)";
        }
        Intrinsics.checkNotNullParameter(message, "message");
        C2859b.g(p002if.j.f66400c, message, 6);
        boolean z14 = z13;
        if (z14) {
            z11 = z12;
            We.z e11 = request.e();
            if (a12 != null) {
                str3 = " ";
                We.C contentType = a12.getContentType();
                if (contentType == null || e11.c("Content-Type") != null) {
                    g10 = request;
                } else {
                    g10 = request;
                    String message2 = "Content-Type: " + contentType;
                    Intrinsics.checkNotNullParameter(message2, "message");
                    C2859b.g(p002if.j.f66400c, message2, 6);
                }
                if (a12.contentLength() == -1 || e11.c("Content-Length") != null) {
                    str = "-byte body omitted, exceeds limit of 1048576 bytes)";
                    str7 = "-byte body)";
                } else {
                    str = "-byte body omitted, exceeds limit of 1048576 bytes)";
                    str7 = "-byte body)";
                    String message3 = "Content-Length: " + a12.contentLength();
                    Intrinsics.checkNotNullParameter(message3, "message");
                    C2859b.g(p002if.j.f66400c, message3, 6);
                }
            } else {
                g10 = request;
                str = "-byte body omitted, exceeds limit of 1048576 bytes)";
                str7 = "-byte body)";
                str3 = " ";
            }
            int size = e11.size();
            for (int i11 = 0; i11 < size; i11++) {
                a(e11, i11);
            }
            if (!z11 || a12 == null) {
                str2 = str7;
                String message4 = "--> END " + g10.h();
                Intrinsics.checkNotNullParameter(message4, "message");
                C2859b.g(p002if.j.f66400c, message4, 6);
            } else {
                String c11 = g10.e().c("Content-Encoding");
                if (c11 != null && !c11.equalsIgnoreCase("identity") && !c11.equalsIgnoreCase("gzip")) {
                    String message5 = "--> END " + g10.h() + " (encoded body omitted)";
                    Intrinsics.checkNotNullParameter(message5, "message");
                    C2859b.g(p002if.j.f66400c, message5, 6);
                } else if (a12.isDuplex()) {
                    String message6 = "--> END " + g10.h() + " (duplex request body omitted)";
                    Intrinsics.checkNotNullParameter(message6, "message");
                    C2859b.g(p002if.j.f66400c, message6, 6);
                } else if (a12.isOneShot()) {
                    String message7 = "--> END " + g10.h() + " (one-shot body omitted)";
                    Intrinsics.checkNotNullParameter(message7, "message");
                    C2859b.g(p002if.j.f66400c, message7, 6);
                } else {
                    long contentLength = a12.contentLength();
                    if (contentLength == -1 || contentLength > W2.MAX_EVENT_SIZE_BYTES) {
                        str2 = str7;
                        StringBuilder d11 = C2942q.d(a12.contentLength(), "--> END ", g10.h(), " (");
                        d11.append(str);
                        String message8 = d11.toString();
                        Intrinsics.checkNotNullParameter(message8, "message");
                        C2859b.g(p002if.j.f66400c, message8, 6);
                    } else {
                        C9681g c9681g = new C9681g();
                        a12.writeTo(c9681g);
                        We.C contentType2 = a12.getContentType();
                        if (contentType2 == null || (UTF_82 = contentType2.c(StandardCharsets.UTF_8)) == null) {
                            UTF_82 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                        }
                        b bVar = b.f4881a;
                        ((N) bVar).a("");
                        if (O.b(c9681g)) {
                            ((N) bVar).a(c9681g.t0(UTF_82));
                            StringBuilder d12 = C2942q.d(a12.contentLength(), "--> END ", g10.h(), " (");
                            str2 = str7;
                            d12.append(str2);
                            ((N) bVar).a(d12.toString());
                        } else {
                            str2 = str7;
                            StringBuilder d13 = C2942q.d(a12.contentLength(), "--> END ", g10.h(), " (binary ");
                            d13.append("-byte body omitted)");
                            ((N) bVar).a(d13.toString());
                        }
                    }
                }
                str2 = str7;
            }
        } else {
            g10 = request;
            z11 = z12;
            str = "-byte body omitted, exceeds limit of 1048576 bytes)";
            str2 = "-byte body)";
            str3 = " ";
        }
        long nanoTime = System.nanoTime();
        try {
            We.L proceed = chain.proceed(g10);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            We.M c12 = proceed.c();
            Intrinsics.f(c12);
            long contentLength2 = c12.contentLength();
            if (contentLength2 != -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(contentLength2);
                m11 = c12;
                sb2.append("-byte");
                str4 = sb2.toString();
            } else {
                m11 = c12;
                str4 = "unknown-length";
            }
            if (proceed.w().length() == 0) {
                str5 = str2;
                b11 = "";
                str6 = str3;
            } else {
                str5 = str2;
                str6 = str3;
                b11 = Nk.a.b(str6, proceed.w());
            }
            StringBuilder sb3 = new StringBuilder();
            String str8 = str;
            sb3.append("<-- " + proceed.m() + b11 + str6 + proceed.L().j());
            StringBuilder sb4 = new StringBuilder("(");
            sb4.append(millis);
            sb4.append("ms");
            sb3.append(sb4.toString());
            if (!z14) {
                Fj.c.f(", ", str4, " body", sb3);
            }
            We.y p11 = proceed.p();
            if (p11 != null && (a11 = p11.a()) != null) {
                sb3.append(", " + a11 + " suite");
            }
            sb3.append(")");
            String message9 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(message9, "toString(...)");
            Intrinsics.checkNotNullParameter(message9, "message");
            C2859b.g(p002if.j.f66400c, message9, 6);
            if (z14) {
                We.z r11 = proceed.r();
                int size2 = r11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    a(r11, i12);
                }
                if (z11 && C6355e.b(proceed)) {
                    String c13 = proceed.r().c("Content-Encoding");
                    if (c13 != null && !c13.equalsIgnoreCase("identity") && !c13.equalsIgnoreCase("gzip")) {
                        Intrinsics.checkNotNullParameter("<-- END HTTP (encoded body omitted)", "message");
                        C2859b.g(p002if.j.f66400c, "<-- END HTTP (encoded body omitted)", 6);
                        return proceed;
                    }
                    if (contentLength2 == -1 || contentLength2 > W2.MAX_EVENT_SIZE_BYTES) {
                        String message10 = "<-- END HTTP (" + contentLength2 + str8;
                        Intrinsics.checkNotNullParameter(message10, "message");
                        C2859b.g(p002if.j.f66400c, message10, 6);
                        return proceed;
                    }
                    InterfaceC9683i source = m11.source();
                    source.n(Long.MAX_VALUE);
                    C9681g f7 = source.f();
                    if ("gzip".equalsIgnoreCase(r11.c("Content-Encoding"))) {
                        l11 = Long.valueOf(f7.size());
                        sf.t tVar = new sf.t(f7.clone());
                        try {
                            f7 = new C9681g();
                            f7.y0(tVar);
                            tVar.close();
                        } finally {
                        }
                    } else {
                        l11 = null;
                    }
                    We.C contentType3 = m11.contentType();
                    if (contentType3 == null || (UTF_8 = contentType3.c(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!O.b(f7)) {
                        Intrinsics.checkNotNullParameter("", "message");
                        p002if.j.f66400c.getClass();
                        jVar2 = p002if.j.f66398a;
                        p002if.j.k(jVar2, "", 6);
                        String message11 = "<-- END HTTP (binary " + f7.size() + "-byte body omitted)";
                        Intrinsics.checkNotNullParameter(message11, "message");
                        C2859b.g(p002if.j.f66400c, message11, 6);
                        return proceed;
                    }
                    if (contentLength2 != 0) {
                        Intrinsics.checkNotNullParameter("", "message");
                        p002if.j.f66400c.getClass();
                        jVar = p002if.j.f66398a;
                        p002if.j.k(jVar, "", 6);
                        String message12 = f7.clone().t0(UTF_8);
                        Intrinsics.checkNotNullParameter(message12, "message");
                        C2859b.g(p002if.j.f66400c, message12, 6);
                    }
                    if (l11 == null) {
                        String message13 = "<-- END HTTP (" + f7.size() + str5;
                        Intrinsics.checkNotNullParameter(message13, "message");
                        C2859b.g(p002if.j.f66400c, message13, 6);
                        return proceed;
                    }
                    String message14 = "<-- END HTTP (" + f7.size() + "-byte, " + l11 + "-gzipped-byte body)";
                    Intrinsics.checkNotNullParameter(message14, "message");
                    C2859b.g(p002if.j.f66400c, message14, 6);
                    return proceed;
                }
                Intrinsics.checkNotNullParameter("<-- END HTTP", "message");
                C2859b.g(p002if.j.f66400c, "<-- END HTTP", 6);
            }
            return proceed;
        } catch (Exception e12) {
            String message15 = "<-- HTTP FAILED: " + e12;
            Intrinsics.checkNotNullParameter(message15, "message");
            C2859b.g(p002if.j.f66400c, message15, 6);
            throw e12;
        }
    }
}

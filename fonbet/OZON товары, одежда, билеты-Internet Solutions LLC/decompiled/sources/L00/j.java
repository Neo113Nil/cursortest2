package L00;

import I0.C3173b;
import L00.l;
import Sc.InterfaceC4008j;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f16113a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16114b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16115c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16116d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final l f16117e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f16118f;

    /* renamed from: g, reason: collision with root package name */
    private final L f16119g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16120h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private N00.a f16121i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16122j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private g f16123a;

        /* renamed from: c, reason: collision with root package name */
        private String f16125c;

        /* renamed from: d, reason: collision with root package name */
        private String f16126d;

        /* renamed from: f, reason: collision with root package name */
        private Object f16128f;

        /* renamed from: g, reason: collision with root package name */
        private L f16129g;

        /* renamed from: h, reason: collision with root package name */
        private L f16130h;

        /* renamed from: b, reason: collision with root package name */
        private int f16124b = -1;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private l f16127e = l.a.a();

        @NotNull
        public final void a(String str) {
            this.f16126d = str;
        }

        @NotNull
        public final j b() {
            int i11 = this.f16124b;
            if (i11 < 0) {
                throw new IllegalStateException(Ej.b.a(i11, "code < 0: ").toString());
            }
            g gVar = this.f16123a;
            if (gVar == null) {
                throw new IllegalStateException("request == null");
            }
            String str = this.f16125c;
            if (str == null) {
                throw new IllegalStateException("message == null");
            }
            String str2 = this.f16126d;
            l lVar = this.f16127e;
            Object obj = this.f16128f;
            if (obj != null) {
                return new j(gVar, i11, str, str2, lVar, obj, this.f16129g, this.f16130h);
            }
            throw new IllegalStateException("response == null");
        }

        @NotNull
        public final void c(L l11) {
            this.f16129g = l11;
        }

        @NotNull
        public final void d(int i11) {
            this.f16124b = i11;
        }

        @NotNull
        public final void e(@NotNull l headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f16127e = headers;
        }

        @NotNull
        public final void f(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f16125c = message;
        }

        @NotNull
        public final void g(L l11) {
            this.f16130h = l11;
        }

        @NotNull
        public final void h(Object obj) {
            this.f16128f = obj;
        }

        @NotNull
        public final void i(@NotNull g request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f16123a = request;
        }
    }

    public static final class b {
        @NotNull
        public static j a(@NotNull g request, int i11, @NotNull String message, String str, @NotNull l headers, @NotNull Object rawResponse) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (200 <= i11 && i11 < 300) {
                throw new IllegalArgumentException("response should not be successful");
            }
            a aVar = new a();
            aVar.i(request);
            aVar.d(i11);
            aVar.f(message);
            aVar.a(str);
            aVar.e(headers);
            aVar.h(rawResponse);
            aVar.c(null);
            return aVar.b();
        }

        @NotNull
        public static j b(@NotNull g request, int i11, @NotNull String message, String str, @NotNull l headers, @NotNull L rawResponse, L l11, L l12) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (200 > i11 || i11 >= 300) {
                throw new IllegalArgumentException("response must be successful");
            }
            a aVar = new a();
            aVar.i(request);
            aVar.d(i11);
            aVar.f(message);
            aVar.a(str);
            aVar.e(headers);
            aVar.h(rawResponse);
            aVar.c(l11);
            aVar.g(l12);
            return aVar.b();
        }
    }

    public j(@NotNull g request, int i11, @NotNull String message, String str, @NotNull l headers, @NotNull Object rawResponse, L l11, L l12) {
        N00.a aVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        this.f16113a = request;
        this.f16114b = i11;
        this.f16115c = message;
        this.f16116d = str;
        this.f16117e = headers;
        this.f16118f = rawResponse;
        this.f16119g = l12;
        this.f16120h = headers.get("Server-Redirect-Final");
        aVar = N00.a.f18344z;
        this.f16121i = aVar;
        this.f16122j = Sc.k.b(new k(this));
    }

    public final String a() {
        return this.f16116d;
    }

    public final int b() {
        return this.f16114b;
    }

    @NotNull
    public final l c() {
        return this.f16117e;
    }

    @NotNull
    public final String d() {
        return this.f16115c;
    }

    @NotNull
    public final N00.a e() {
        return this.f16121i;
    }

    public final Object f() {
        return this.f16119g;
    }

    @NotNull
    public final Object g() {
        return this.f16118f;
    }

    @NotNull
    public final g h() {
        return this.f16113a;
    }

    public final String i() {
        return (String) this.f16122j.getValue();
    }

    public final String j() {
        return this.f16120h;
    }

    public final boolean k() {
        int i11 = this.f16114b;
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

    public final void l(@NotNull N00.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f16121i = aVar;
    }

    @NotNull
    public final String toString() {
        String j11 = this.f16113a.j();
        StringBuilder sb2 = new StringBuilder("ComposerResponse(code=");
        sb2.append(this.f16114b);
        sb2.append(", message='");
        return C3173b.c(sb2, this.f16115c, "', url=", j11, ")");
    }
}

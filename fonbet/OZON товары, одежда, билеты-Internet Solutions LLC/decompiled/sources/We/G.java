package We;

import B0.A0;
import We.A;
import We.C4864f;
import We.z;
import ef.C6356f;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private C4864f f33618a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A f33619b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f33620c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final z f33621d;

    /* renamed from: e, reason: collision with root package name */
    private final K f33622e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, Object> f33623f;

    public G(@NotNull A url, @NotNull String method, @NotNull z headers, K k11, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f33619b = url;
        this.f33620c = method;
        this.f33621d = headers;
        this.f33622e = k11;
        this.f33623f = tags;
    }

    public final K a() {
        return this.f33622e;
    }

    @NotNull
    public final C4864f b() {
        C4864f c4864f = this.f33618a;
        if (c4864f != null) {
            return c4864f;
        }
        C4864f.b bVar = C4864f.f33719p;
        z zVar = this.f33621d;
        bVar.getClass();
        C4864f a11 = C4864f.b.a(zVar);
        this.f33618a = a11;
        return a11;
    }

    @NotNull
    public final Map<Class<?>, Object> c() {
        return this.f33623f;
    }

    public final String d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f33621d.c(name);
    }

    @NotNull
    public final z e() {
        return this.f33621d;
    }

    @NotNull
    public final List<String> f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f33621d.l(name);
    }

    public final boolean g() {
        return this.f33619b.i();
    }

    @NotNull
    public final String h() {
        return this.f33620c;
    }

    public final <T> T i(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f33623f.get(type));
    }

    @NotNull
    public final A j() {
        return this.f33619b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f33620c);
        sb2.append(", url=");
        sb2.append(this.f33619b);
        z zVar = this.f33621d;
        if (zVar.size() != 0) {
            sb2.append(", headers=[");
            int i11 = 0;
            for (Pair<? extends String, ? extends String> pair : zVar) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String a11 = pair2.a();
                String b11 = pair2.b();
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a11);
                sb2.append(':');
                sb2.append(b11);
                i11 = i12;
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f33623f;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private A f33624a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f33625b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private z.a f33626c;

        /* renamed from: d, reason: collision with root package name */
        private K f33627d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private LinkedHashMap f33628e;

        public a() {
            this.f33628e = new LinkedHashMap();
            this.f33625b = "GET";
            this.f33626c = new z.a();
        }

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f33626c.a(name, value);
        }

        @NotNull
        public final G b() {
            Map unmodifiableMap;
            A a11 = this.f33624a;
            if (a11 == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f33625b;
            z e11 = this.f33626c.e();
            K k11 = this.f33627d;
            LinkedHashMap toImmutableMap = this.f33628e;
            byte[] bArr = Ye.b.f34900a;
            Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
            if (toImmutableMap.isEmpty()) {
                unmodifiableMap = U.c();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new G(a11, str, e11, k11, unmodifiableMap);
        }

        @NotNull
        public final void c(@NotNull C4864f cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String c4864f = cacheControl.toString();
            if (c4864f.length() == 0) {
                h("Cache-Control");
            } else {
                d("Cache-Control", c4864f);
            }
        }

        @NotNull
        public final void d(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            z.a aVar = this.f33626c;
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
        public final void e(@NotNull z headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f33626c = headers.h();
        }

        @NotNull
        public final void f(K k11, @NotNull String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (k11 == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(A0.b("method ", method, " must have a request body.").toString());
                }
            } else if (!C6356f.a(method)) {
                throw new IllegalArgumentException(A0.b("method ", method, " must not have a request body.").toString());
            }
            this.f33625b = method;
            this.f33627d = k11;
        }

        @NotNull
        public final void g(@NotNull K body) {
            Intrinsics.checkNotNullParameter(body, "body");
            f(body, "POST");
        }

        @NotNull
        public final void h(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f33626c.h(name);
        }

        @NotNull
        public final void i(@NotNull Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f33628e.remove(type);
                return;
            }
            if (this.f33628e.isEmpty()) {
                this.f33628e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f33628e;
            Object cast = type.cast(obj);
            Intrinsics.f(cast);
            linkedHashMap.put(type, cast);
        }

        @NotNull
        public final void j(@NotNull A url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f33624a = url;
        }

        @NotNull
        public final void k(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (kotlin.text.h.e0(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder("http:");
                String substring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                url = sb2.toString();
            } else if (kotlin.text.h.e0(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder("https:");
                String substring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                url = sb3.toString();
            }
            A.f33515l.getClass();
            A url2 = A.b.c(url);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f33624a = url2;
        }

        @NotNull
        public final void l(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            A.b bVar = A.f33515l;
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "url.toString()");
            bVar.getClass();
            A url3 = A.b.c(url2);
            Intrinsics.checkNotNullParameter(url3, "url");
            this.f33624a = url3;
        }

        public a(@NotNull G request) {
            LinkedHashMap u11;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f33628e = new LinkedHashMap();
            this.f33624a = request.j();
            this.f33625b = request.h();
            this.f33627d = request.a();
            if (request.c().isEmpty()) {
                u11 = new LinkedHashMap();
            } else {
                u11 = U.u(request.c());
            }
            this.f33628e = u11;
            this.f33626c = request.e().h();
        }
    }
}

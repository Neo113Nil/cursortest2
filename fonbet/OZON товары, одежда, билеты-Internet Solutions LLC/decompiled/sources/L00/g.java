package L00;

import T7.E;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.cache.CacheTime;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final g f16089j = new g(P4.f.b("toString(...)"), "", U.c(), "", "GET", U.c(), null, null, U.c());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16090a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16091b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f16092c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16093d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f16094e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f16095f;

    /* renamed from: g, reason: collision with root package name */
    private final h f16096g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16097h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f16098i;

    public g(@NotNull String uuid, @NotNull String page, @NotNull Map<String, ? extends Object> params, String str, @NotNull String method, @NotNull Map<String, String> headers, h hVar, String str2, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f16090a = uuid;
        this.f16091b = page;
        this.f16092c = params;
        this.f16093d = str;
        this.f16094e = method;
        this.f16095f = headers;
        this.f16096g = hVar;
        this.f16097h = str2;
        this.f16098i = tags;
    }

    public final h c() {
        return this.f16096g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    @NotNull
    public final Map<String, String> d() {
        return this.f16095f;
    }

    @NotNull
    public final String e() {
        return this.f16094e;
    }

    @NotNull
    public final String f() {
        return this.f16091b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @NotNull
    public final Map<String, Object> g() {
        return this.f16092c;
    }

    public final String h() {
        return this.f16097h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
    @NotNull
    public final Map<Class<?>, Object> i() {
        return this.f16098i;
    }

    @NotNull
    public final String j() {
        String str = this.f16093d;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("url == null");
    }

    @NotNull
    public final String k() {
        return this.f16090a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Object l() {
        Intrinsics.checkNotNullParameter(CacheTime.class, "type");
        return CacheTime.class.cast(this.f16098i.get(CacheTime.class));
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerRequest(uuid='");
        sb2.append(this.f16090a);
        sb2.append("', method='");
        sb2.append(this.f16094e);
        sb2.append("', url=");
        sb2.append(this.f16093d);
        sb2.append(", headers=");
        sb2.append(this.f16095f);
        sb2.append(", tags=");
        return E.c(this.f16098i, ")", sb2);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f16099a;

        /* renamed from: b, reason: collision with root package name */
        private String f16100b;

        /* renamed from: c, reason: collision with root package name */
        private String f16101c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private String f16102d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private LinkedHashMap f16103e;

        /* renamed from: f, reason: collision with root package name */
        private h f16104f;

        /* renamed from: g, reason: collision with root package name */
        private String f16105g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap<String, String> f16106h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap<Class<? extends Object>, Object> f16107i;

        public a() {
            this.f16104f = null;
            this.f16100b = null;
            this.f16099a = null;
            this.f16101c = null;
            this.f16102d = "GET";
            this.f16103e = new LinkedHashMap();
            this.f16106h = new LinkedHashMap<>();
            this.f16107i = new LinkedHashMap<>();
            this.f16105g = null;
        }

        @NotNull
        public final g a() {
            String str = this.f16100b;
            if (str == null) {
                str = P4.f.b("toString(...)");
            }
            String str2 = str;
            String str3 = this.f16101c;
            if (str3 == null) {
                throw new IllegalArgumentException("page == null");
            }
            return new g(str2, str3, this.f16103e, this.f16099a, this.f16102d, this.f16106h, this.f16104f, this.f16105g, this.f16107i);
        }

        @NotNull
        public final void b() {
            this.f16102d = "GET";
        }

        @NotNull
        public final String c() {
            return this.f16102d;
        }

        @NotNull
        public final Map<String, Object> d() {
            return this.f16103e;
        }

        @NotNull
        public final void e(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f16106h.put(name, value);
        }

        @NotNull
        public final void f(@NotNull String type, h hVar) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f16102d = type;
            this.f16104f = hVar;
        }

        @NotNull
        public final void g(@NotNull String page) {
            Intrinsics.checkNotNullParameter(page, "page");
            this.f16101c = page;
        }

        @NotNull
        public final void h(@NotNull Map params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f16103e = U.u(params);
        }

        @NotNull
        public final void i() {
            this.f16102d = "POST";
        }

        @NotNull
        public final void j(@NotNull String redirectKey) {
            Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
            this.f16105g = redirectKey;
        }

        @NotNull
        public final void k(@NotNull Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            LinkedHashMap<Class<? extends Object>, Object> linkedHashMap = this.f16107i;
            if (obj == null) {
                linkedHashMap.remove(type);
                return;
            }
            Object cast = type.cast(obj);
            Intrinsics.f(cast);
            linkedHashMap.put(type, cast);
        }

        @NotNull
        public final void l(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f16099a = url;
        }

        public a(@NotNull g request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f16100b = request.k();
            this.f16099a = request.f16093d;
            this.f16101c = request.f();
            this.f16103e = new LinkedHashMap(request.g());
            this.f16102d = request.e();
            this.f16104f = request.c();
            this.f16106h = new LinkedHashMap<>(request.d());
            this.f16105g = request.h();
            this.f16107i = new LinkedHashMap<>(request.i());
        }
    }
}

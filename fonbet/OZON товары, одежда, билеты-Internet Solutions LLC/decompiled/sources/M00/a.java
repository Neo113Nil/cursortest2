package M00;

import L00.f;
import L00.h;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f17208a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f17209b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f17210c;

    /* renamed from: d, reason: collision with root package name */
    private final h f17211d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, Object> f17212e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f17213f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f17214g;

    public a(f url, Map headers, h hVar, Map tags, String uuid, String asyncData, Map bodyParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter("POST", "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        this.f17208a = url;
        this.f17209b = "POST";
        this.f17210c = headers;
        this.f17211d = hVar;
        this.f17212e = tags;
        this.f17213f = asyncData;
        this.f17214g = bodyParams;
    }

    @NotNull
    public final String a() {
        return this.f17213f;
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f17214g;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.f17210c;
    }

    @NotNull
    public final String d() {
        return this.f17209b;
    }

    public final h e() {
        return this.f17211d;
    }

    @NotNull
    public final Map<Class<?>, Object> f() {
        return this.f17212e;
    }

    @NotNull
    public final f g() {
        return this.f17208a;
    }

    /* renamed from: M00.a$a, reason: collision with other inner class name */
    public static final class C0334a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private f f17215a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f17216b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private Map<String, String> f17217c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private Map<Class<?>, ? extends Object> f17218d;

        /* renamed from: e, reason: collision with root package name */
        private String f17219e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private Map<String, ? extends Object> f17220f;

        /* renamed from: g, reason: collision with root package name */
        private h f17221g;

        public C0334a(@NotNull f url, @NotNull String asyncData) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            this.f17215a = url;
            this.f17216b = asyncData;
            this.f17217c = U.c();
            this.f17218d = U.c();
            this.f17220f = U.c();
        }

        @NotNull
        public final void a(@NotNull Map bodyParams) {
            Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
            this.f17220f = bodyParams;
        }

        @NotNull
        public final a b() {
            f fVar = this.f17215a;
            Map<Class<?>, ? extends Object> map = this.f17218d;
            String str = this.f17219e;
            if (str == null) {
                str = P4.f.b("toString(...)");
            }
            h hVar = this.f17221g;
            Map<String, ? extends Object> map2 = this.f17220f;
            return new a(fVar, this.f17217c, hVar, map, str, this.f17216b, map2);
        }

        @NotNull
        public final void c(h hVar) {
            this.f17221g = hVar;
        }

        @NotNull
        public final void d(@NotNull Tc.d tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.f17218d = tags;
        }

        @NotNull
        public final void e(@NotNull f url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f17215a = url;
        }

        @NotNull
        public final void f(@NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.f17219e = uuid;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0334a(@NotNull a request) {
            this(request.g(), request.a());
            Intrinsics.checkNotNullParameter(request, "request");
            this.f17217c = request.c();
            this.f17221g = request.e();
            this.f17218d = request.f();
            this.f17220f = request.b();
        }
    }
}

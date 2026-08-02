package Ja;

import Sc.InterfaceC4008j;
import Sc.n;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final AtomicLong f14303k = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f14304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f14305b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f14306c;

    /* renamed from: d, reason: collision with root package name */
    private final Ka.b f14307d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<e, Object> f14308e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14309f;

    /* renamed from: g, reason: collision with root package name */
    private final long f14310g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f14311h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14312i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14313j;

    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Intrinsics.d(i.this.j().c(), "http"));
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Intrinsics.d(i.this.j().c(), "https"));
        }
    }

    static final class c extends AbstractC7737t implements Function0<k> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k invoke() {
            String uri = i.this.k();
            Intrinsics.checkNotNullParameter(uri, "uri");
            Uri parse = Uri.parse(uri);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return new k(parse);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull d method, @NotNull String url, @NotNull Map<String, ? extends List<String>> headers, Ka.b bVar, Map<e, ? extends Object> map, boolean z11) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f14304a = method;
        this.f14305b = url;
        this.f14306c = headers;
        this.f14307d = bVar;
        this.f14308e = map;
        this.f14309f = z11;
        this.f14310g = f14303k.getAndIncrement();
        this.f14311h = Sc.k.a(n.NONE, new c());
        this.f14312i = Sc.k.b(new a());
        this.f14313j = Sc.k.b(new b());
        method.getClass();
    }

    public final Ka.b a() {
        return this.f14307d;
    }

    public final boolean b() {
        return this.f14309f;
    }

    public final String c() {
        Intrinsics.checkNotNullParameter(FormPageDTO.Field.FIELD_TYPE_RANGE, CommentV3DTO.HEADER_FIELD_NAME);
        List list = (List) Ia.a.b(FormPageDTO.Field.FIELD_TYPE_RANGE, this.f14306c);
        if (list != null) {
            return Ia.a.a(list);
        }
        return null;
    }

    public final List<String> d(@NotNull String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return (List) Ia.a.b(header, this.f14306c);
    }

    @NotNull
    public final Map<String, List<String>> e() {
        return this.f14306c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f14304a == iVar.f14304a && Intrinsics.d(this.f14305b, iVar.f14305b) && Intrinsics.d(this.f14306c, iVar.f14306c) && Intrinsics.d(this.f14307d, iVar.f14307d) && Intrinsics.d(this.f14308e, iVar.f14308e) && this.f14309f == iVar.f14309f;
    }

    public final long f() {
        return this.f14310g;
    }

    @NotNull
    public final d g() {
        return this.f14304a;
    }

    public final <V> V h(@NotNull e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<e, Object> map = this.f14308e;
        V v11 = map != null ? (V) map.get(key) : null;
        try {
            Intrinsics.g(v11, "null cannot be cast to non-null type V of com.vk.knet.core.http.HttpRequest.getPayload");
            return v11;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int hashCode() {
        int a11 = D40.c.a(this.f14306c, G.g.a(this.f14304a.hashCode() * 31, 31, this.f14305b), 31);
        Ka.b bVar = this.f14307d;
        int hashCode = (a11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Map<e, Object> map = this.f14308e;
        return Boolean.hashCode(this.f14309f) + ((hashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final Map<e, Object> i() {
        return this.f14308e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final k j() {
        return (k) this.f14311h.getValue();
    }

    @NotNull
    public final String k() {
        return this.f14305b;
    }

    public final boolean l() {
        return ((Boolean) this.f14312i.getValue()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) this.f14313j.getValue()).booleanValue();
    }

    @NotNull
    public final <V> i n(@NotNull e key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<e, Object> map = this.f14308e;
        LinkedHashMap u11 = map != null ? U.u(map) : new LinkedHashMap();
        u11.put(key, value);
        d method = this.f14304a;
        Intrinsics.checkNotNullParameter(method, "method");
        String url = this.f14305b;
        Intrinsics.checkNotNullParameter(url, "url");
        Map<String, List<String>> headers = this.f14306c;
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new i(method, url, headers, this.f14307d, u11, this.f14309f);
    }

    @NotNull
    public final String toString() {
        return "HttpRequest(method=" + this.f14304a + ", url=" + this.f14305b + ", headers=" + this.f14306c + ", body=" + this.f14307d + ", payload=" + this.f14308e + ", disableCache=" + this.f14309f + ")";
    }
}

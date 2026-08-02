package L00;

import L00.g;
import L00.h;
import Sc.InterfaceC4008j;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.D;
import d10.C6023a;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<Type> f16074f = Sc.k.b(a.f16080b);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f16075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final L00.a f16076b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U00.b f16077c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final N00.b f16078d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f16079e;

    static final class a extends AbstractC7737t implements Function0<Type> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16080b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Type invoke() {
            return D.e(Map.class, String.class, Object.class).getRawType();
        }
    }

    public e(@NotNull String apiBaseUrl, @NotNull b api, @NotNull L00.a apiConfig, @NotNull U00.b serializer, @NotNull N00.b networkMetricsProvider, boolean z11) {
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter("v2", "apiVersion");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(apiConfig, "apiConfig");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(networkMetricsProvider, "networkMetricsProvider");
        this.f16075a = api;
        this.f16076b = apiConfig;
        this.f16077c = serializer;
        this.f16078d = networkMetricsProvider;
        this.f16079e = Uri.parse(apiBaseUrl).buildUpon().appendEncodedPath(C6023a.a("composer-api.bx/page/json/", z11)).appendPath("v2").build();
    }

    @Override // L00.d
    @NotNull
    public final c a(@NotNull g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.getClass();
        g.a aVar = new g.a(request);
        String f7 = request.f();
        String e11 = request.e();
        Map<String, Object> g10 = request.g();
        Uri.Builder appendQueryParameter = this.f16079e.buildUpon().appendQueryParameter(ImagesContract.URL, f7);
        if (Intrinsics.d(e11, "GET")) {
            for (Map.Entry<String, Object> entry : g10.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    appendQueryParameter.appendQueryParameter(key, value.toString());
                }
            }
        }
        Uri build = appendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        aVar.l(uri);
        String c11 = aVar.c();
        h hVar = null;
        if (!Intrinsics.d(c11, "GET") && Intrinsics.d(c11, "POST")) {
            if (aVar.d().isEmpty()) {
                hVar = new h(null, new byte[0]);
            } else {
                Map<String, Object> d11 = aVar.d();
                Type value2 = f16074f.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                hVar = h.a.a(this.f16077c.toJson(d11, value2));
            }
        }
        aVar.f(aVar.c(), hVar);
        L00.a aVar2 = this.f16076b;
        aVar.e("User-Agent", aVar2.c());
        aVar.e("x-o3-app-name", aVar2.a());
        aVar.e("x-o3-app-version", aVar2.d());
        aVar.e("x-o3-device-type", aVar2.b());
        String str = request.d().get("x-page-view-id");
        if (str == null) {
            str = P4.f.b("toString(...)");
        }
        aVar.e("x-page-view-id", str);
        return new c(aVar.a(), this.f16075a, this.f16078d);
    }
}

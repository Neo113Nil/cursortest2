package HZ;

import CZ.g;
import GZ.j;
import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8475a.c f10770a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final BZ.b f10771b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final BZ.e f10772c;

    public d(@NotNull C8475a.c config, @NotNull BZ.b appHandlerCache, @NotNull BZ.e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(appHandlerCache, "appHandlerCache");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.f10770a = config;
        this.f10771b = appHandlerCache;
        this.f10772c = miniAppConfigHolder;
    }

    @NotNull
    public final String a() {
        return BZ.f.a(this.f10772c);
    }

    @NotNull
    public final String b(@NotNull String deeplink, @NotNull GZ.c deeplinkSourceType) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(deeplinkSourceType, "deeplinkSourceType");
        Uri parse = Uri.parse(deeplink);
        String queryParameter = parse.getQueryParameter("miniapp");
        if (queryParameter == null || this.f10771b.b(queryParameter)) {
            if (deeplinkSourceType != GZ.c.EXTERNAL) {
                String a11 = BZ.f.a(this.f10772c);
                if (a11.length() != 0 && !a11.equals(this.f10770a.a()) && queryParameter == null) {
                    String builder = parse.buildUpon().appendQueryParameter("miniapp", a11).toString();
                    Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
                    return builder;
                }
            }
            return deeplink;
        }
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            if (!h.D(str, "miniapp", true)) {
                clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
            }
        }
        Uri build = clearQuery.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @NotNull
    public final pZ.f d(@NotNull pZ.f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(destination, "destination");
        pZ.f.Companion.getClass();
        if (destination == pZ.f.NONE || (destination instanceof CZ.c) || (destination instanceof C8880a)) {
            return destination;
        }
        GZ.c c11 = route.c();
        GZ.c cVar = GZ.c.EXTERNAL;
        C8475a.c cVar2 = this.f10770a;
        if (c11 == cVar) {
            String queryParameter = route.b().getQueryParameter("miniapp");
            if (queryParameter == null) {
                queryParameter = cVar2.a();
            }
            return new g(queryParameter, destination);
        }
        String queryParameter2 = route.b().getQueryParameter("miniapp");
        if (queryParameter2 == null) {
            queryParameter2 = cVar2.a();
        }
        if (!Intrinsics.d(BZ.f.a(this.f10772c), queryParameter2)) {
            return new g(queryParameter2, destination);
        }
        return destination;
    }
}

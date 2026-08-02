package GZ;

import android.net.Uri;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8475a.c f9872a;

    public k(@NotNull C8475a.c compassConfig) {
        Intrinsics.checkNotNullParameter(compassConfig, "compassConfig");
        this.f9872a = compassConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j b(k kVar, String str, Map map, int i11) {
        if ((i11 & 2) != 0) {
            map = U.c();
        }
        return kVar.a(str, map, c.INTERNAL);
    }

    public final j a(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties, @NotNull c deeplinkSourceType) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(deeplinkSourceType, "deeplinkSourceType");
        Uri parse = Uri.parse(deeplink);
        Uri c11 = c(parse);
        if (c11 == null) {
            return null;
        }
        return new j(c11, parse, properties, deeplinkSourceType);
    }

    public final Uri c(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        String host = deeplinkUri.getHost();
        if (host == null || !deeplinkUri.isHierarchical()) {
            return null;
        }
        C8475a.c cVar = this.f9872a;
        if (!C7705l.m(cVar.d(), deeplinkUri.getScheme())) {
            return null;
        }
        if (cVar.c().a(host)) {
            deeplinkUri = deeplinkUri.buildUpon().scheme("ozon").authority("").build();
            Intrinsics.checkNotNullExpressionValue(deeplinkUri, "build(...)");
        }
        String uri = deeplinkUri.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return Uri.parse(kotlin.text.h.X(uri, ":///", "://", false));
    }
}

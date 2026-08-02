package Je0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14653a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.PRE_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.REAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14653a = iArr;
        }
    }

    public static final String a(@NotNull GeoProviderConfig geoProviderConfig, @NotNull n providerType) {
        Intrinsics.checkNotNullParameter(geoProviderConfig, "<this>");
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        int i11 = a.f14653a[providerType.ordinal()];
        if (i11 == 1) {
            return "precached";
        }
        if (i11 == 2) {
            return geoProviderConfig.getName();
        }
        if (i11 != 3) {
            throw new Sc.o();
        }
        GeoProviderConfig.Companion companion = GeoProviderConfig.INSTANCE;
        return Intrinsics.d(geoProviderConfig, companion.getDefaultLibre()) ? "fallback_ozon_maps" : Intrinsics.d(geoProviderConfig, companion.getDefaultYandex()) ? "fallback_yandex_maps" : geoProviderConfig.getName();
    }
}

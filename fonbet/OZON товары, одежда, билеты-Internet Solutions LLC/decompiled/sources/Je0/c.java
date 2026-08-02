package Je0;

import Ae.InterfaceC2395h;
import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static c f14654d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f14655a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f14656b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f14657c;

    public c(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f14655a = ozonTracker;
        this.f14656b = new a(ozonTracker);
        this.f14657c = new f(ozonTracker);
    }

    public static void d(c cVar, GeoProviderConfig geoProviderConfig, e eventName, String str, Long l11, String str2, s sVar, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            l11 = null;
        }
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        if ((i11 & 64) != 0) {
            sVar = null;
        }
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        s sVar2 = sVar;
        String str3 = str2;
        Long l12 = l11;
        String str4 = str;
        cVar.f14656b.a(geoProviderConfig, eventName, str4, l12, str3, sVar2);
        cVar.f14657c.f(geoProviderConfig, eventName, str4, l12, str3, sVar2);
    }

    public final void c(@NotNull InterfaceC2395h<Boolean> tilesLoadingFlow) {
        Intrinsics.checkNotNullParameter(tilesLoadingFlow, "tilesLoadingFlow");
        this.f14657c.e(tilesLoadingFlow);
    }
}

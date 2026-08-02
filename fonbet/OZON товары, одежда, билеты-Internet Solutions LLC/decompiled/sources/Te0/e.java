package Te0;

import De.C2862e;
import Le0.w;
import Sc.InterfaceC4008j;
import Sc.k;
import fg.C6561a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.CircleLayer;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f27148a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f27149b;

    /* renamed from: c, reason: collision with root package name */
    private CircleLayer f27150c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27151d;

    public e(@NotNull w mapView, @NotNull MapLibreMap mapboxMap, @NotNull C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27148a = mapView;
        this.f27149b = mapboxMap;
        this.f27151d = k.b(d.f27147b);
    }

    private static C6561a a(int i11) {
        return C6561a.c(new C6561a.c("exponential", new C6561a.C1021a(Float.valueOf(2.0f))), new C6561a("zoom", new C6561a[0]), C6561a.e(0, 0), C6561a.e(20, Integer.valueOf(i11)));
    }

    public final void b() {
        MapLibreMap mapLibreMap = this.f27149b;
        if (this.f27150c == null) {
            return;
        }
        Style u11 = mapLibreMap.u();
        if (u11 != null) {
            CircleLayer circleLayer = this.f27150c;
            Intrinsics.f(circleLayer);
            u11.r(circleLayer);
        }
        this.f27150c = null;
    }
}

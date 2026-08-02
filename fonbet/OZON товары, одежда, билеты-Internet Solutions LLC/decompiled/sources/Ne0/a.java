package Ne0;

import Le0.w;
import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f19478a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f19479b;

    /* renamed from: c, reason: collision with root package name */
    private Yf.a f19480c;

    /* renamed from: d, reason: collision with root package name */
    private Pe0.a f19481d;

    /* renamed from: e, reason: collision with root package name */
    private Qe0.b f19482e;

    public a(@NotNull w mapView, @NotNull MapLibreMap mapLibreMap) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        this.f19478a = mapView;
        this.f19479b = mapLibreMap;
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Yf.a aVar = new Yf.a(context, false);
        aVar.b().w(ViewConfiguration.get(context).getScaledTouchSlop());
        this.f19480c = aVar;
    }

    @NotNull
    public final Qe0.b b() {
        Qe0.b bVar = this.f19482e;
        if (bVar == null) {
            Yf.a aVar = this.f19480c;
            if (aVar == null) {
                Intrinsics.n("androidGesturesManager");
                throw null;
            }
            bVar = new Qe0.b(this.f19478a, this.f19479b, aVar);
        }
        this.f19482e = bVar;
        return bVar;
    }

    @NotNull
    public final Pe0.a c() {
        Pe0.a aVar = this.f19481d;
        if (aVar == null) {
            Yf.a aVar2 = this.f19480c;
            if (aVar2 == null) {
                Intrinsics.n("androidGesturesManager");
                throw null;
            }
            aVar = new Pe0.a(this.f19478a, this.f19479b, aVar2);
        }
        this.f19481d = aVar;
        return aVar;
    }
}

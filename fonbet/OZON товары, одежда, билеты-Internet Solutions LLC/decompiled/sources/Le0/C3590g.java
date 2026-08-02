package Le0;

import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import we0.C10551g;

/* renamed from: Le0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3590g implements Uf.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10551g f16953a;

    C3590g(C10551g c10551g) {
        this.f16953a = c10551g;
    }

    @Override // Uf.b
    public final CameraPosition a(MapLibreMap maplibreMap) {
        Intrinsics.checkNotNullParameter(maplibreMap, "maplibreMap");
        CameraPosition.a aVar = new CameraPosition.a();
        C10551g c10551g = this.f16953a;
        aVar.d(new LatLng(c10551g.c().getLatitude(), c10551g.c().getLongitude()));
        aVar.f(c10551g.e() - 1);
        aVar.e(c10551g.d());
        aVar.a(c10551g.b());
        return aVar.b();
    }
}

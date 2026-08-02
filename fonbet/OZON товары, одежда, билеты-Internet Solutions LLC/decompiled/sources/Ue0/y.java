package Ue0;

import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.mapview.MapView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapObjectCollection f27717a;

    public y(MapView mapView) {
        MapObjectCollection polylineCollection = mapView.getMap().getMapObjects().addCollection();
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(polylineCollection, "polylineCollection");
        this.f27717a = polylineCollection;
        new LinkedHashMap();
        new LinkedHashMap();
    }
}

package Le0;

import De.C2862e;
import android.content.Context;
import ce0.InterfaceC5817a;
import kotlin.jvm.internal.Intrinsics;
import ne0.AbstractC8582a;
import ne0.InterfaceC8587f;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import pe0.AbstractC8905a;
import pe0.C8914j;
import xe0.InterfaceC10766e;
import ze0.InterfaceC11117a;

/* loaded from: classes3.dex */
public final class l extends AbstractC8582a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Te0.a f16969c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(@NotNull MapLibreMap mapboxMap, @NotNull InterfaceC10766e placemarkControllerForUserPin, @NotNull InterfaceC11117a projectionController, @NotNull InterfaceC5817a cameraController, @NotNull w mapView, @NotNull C2862e coroutineScope) {
        super(r2, coroutineScope, mapView, projectionController, cameraController);
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(placemarkControllerForUserPin, "placemarkControllerForUserPin");
        Intrinsics.checkNotNullParameter(projectionController, "projectionController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Te0.b userLocationRenderer = new Te0.b(mapView, mapboxMap, coroutineScope, placemarkControllerForUserPin);
        oe0.o locationProvider = c();
        C8914j components = d().a(userLocationRenderer);
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userLocationRenderer, "userLocationRenderer");
        Intrinsics.checkNotNullParameter(components, "components");
        this.f16969c = new Te0.a(coroutineScope, locationProvider, userLocationRenderer, components);
    }

    @Override // ne0.InterfaceC8585d
    public final InterfaceC8587f a() {
        return this.f16969c;
    }

    @Override // ne0.AbstractC8582a
    public final AbstractC8905a e() {
        return this.f16969c;
    }
}

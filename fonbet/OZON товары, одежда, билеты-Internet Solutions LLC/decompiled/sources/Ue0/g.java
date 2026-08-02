package Ue0;

import De.C2862e;
import android.content.Context;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.mapview.MapView;
import kotlin.jvm.internal.Intrinsics;
import ne0.AbstractC8582a;
import ne0.InterfaceC8587f;
import org.jetbrains.annotations.NotNull;
import pe0.AbstractC8905a;
import ze0.InterfaceC11117a;

/* loaded from: classes3.dex */
public final class g extends AbstractC8582a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Xe0.d f27677c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(@NotNull MapView mapView, @NotNull Ve0.a yandexAnimationLoader, @NotNull InterfaceC11117a projectionController, @NotNull InterfaceC5817a cameraController, @NotNull C2862e coroutineScope) {
        super(r2, coroutineScope, mapView, projectionController, cameraController);
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(yandexAnimationLoader, "yandexAnimationLoader");
        Intrinsics.checkNotNullParameter(projectionController, "projectionController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Xe0.f fVar = new Xe0.f(mapView, yandexAnimationLoader, coroutineScope);
        this.f27677c = new Xe0.d(c(), coroutineScope, fVar, d().a(fVar), mapView);
    }

    @Override // ne0.InterfaceC8585d
    public final InterfaceC8587f a() {
        return this.f27677c;
    }

    @Override // ne0.AbstractC8582a
    public final AbstractC8905a e() {
        return this.f27677c;
    }
}

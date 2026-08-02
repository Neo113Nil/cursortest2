package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public abstract class ImmutableZoomState implements androidx.camera.core.ZoomState {
    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    public static androidx.camera.core.ZoomState create(float f, float f2, float f3, float f4) {
        return new androidx.camera.core.internal.AutoValue_ImmutableZoomState(f, f2, f3, f4);
    }

    public static androidx.camera.core.ZoomState create(androidx.camera.core.ZoomState zoomState) {
        return new androidx.camera.core.internal.AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}

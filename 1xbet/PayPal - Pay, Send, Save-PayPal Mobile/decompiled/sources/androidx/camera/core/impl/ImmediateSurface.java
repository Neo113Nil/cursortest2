package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class ImmediateSurface extends androidx.camera.core.impl.DeferrableSurface {
    private final android.view.Surface getHighSpeedVideoFpsRanges;

    public ImmediateSurface(android.view.Surface surface, android.util.Size size, int i) {
        super(size, i);
        this.getHighSpeedVideoFpsRanges = surface;
    }

    public ImmediateSurface(android.view.Surface surface) {
        this.getHighSpeedVideoFpsRanges = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.getHighSpeedVideoFpsRanges);
    }
}

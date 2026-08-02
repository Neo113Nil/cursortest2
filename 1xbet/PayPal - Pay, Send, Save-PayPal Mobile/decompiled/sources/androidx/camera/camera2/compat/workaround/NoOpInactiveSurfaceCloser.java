package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/NoOpInactiveSurfaceCloser;", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/core/impl/DeferrableSurface;", "deferrableSurface", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "", "configure-hB7JTeY", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;)V", "configure", "onSurfaceInactive", "(Landroidx/camera/core/impl/DeferrableSurface;)V", "closeAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoOpInactiveSurfaceCloser implements androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser {
    public static final androidx.camera.camera2.compat.workaround.NoOpInactiveSurfaceCloser INSTANCE = new androidx.camera.camera2.compat.workaround.NoOpInactiveSurfaceCloser();

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public final void closeAll() {
    }

    private NoOpInactiveSurfaceCloser() {
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public final void onSurfaceInactive(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    /* renamed from: configure-hB7JTeY */
    public final void mo74configurehB7JTeY(int streamId, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph graph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graph, "");
    }
}

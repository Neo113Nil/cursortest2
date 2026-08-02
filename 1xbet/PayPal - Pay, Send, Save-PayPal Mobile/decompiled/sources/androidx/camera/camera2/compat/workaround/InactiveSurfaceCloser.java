package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0010J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/core/impl/DeferrableSurface;", "deferrableSurface", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "", "configure-hB7JTeY", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;)V", "configure", "onSurfaceInactive", "(Landroidx/camera/core/impl/DeferrableSurface;)V", "closeAll", "()V", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InactiveSurfaceCloser {
    void closeAll();

    /* renamed from: configure-hB7JTeY, reason: not valid java name */
    void mo74configurehB7JTeY(int streamId, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph graph);

    void onSurfaceInactive(androidx.camera.core.impl.DeferrableSurface deferrableSurface);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser$Bindings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser.Bindings.Companion INSTANCE = new androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser.Bindings.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser$Bindings$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "provideInactiveSurfaceCloser", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @dagger.Provides
            public final androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser provideInactiveSurfaceCloser(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
                androidx.camera.core.impl.Quirks quirks = cameraQuirks.getQuirks();
                return (quirks.contains(androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk.class) || quirks.contains(androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk.class)) ? new androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl() : androidx.camera.camera2.compat.workaround.NoOpInactiveSurfaceCloser.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}

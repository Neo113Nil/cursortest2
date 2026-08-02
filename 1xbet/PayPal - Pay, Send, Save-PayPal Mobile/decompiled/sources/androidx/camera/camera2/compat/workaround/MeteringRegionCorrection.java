package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "", "Landroidx/camera/core/MeteringPoint;", "meteringPoint", "", "meteringMode", "Landroid/graphics/PointF;", "getCorrectedPoint", "(Landroidx/camera/core/MeteringPoint;I)Landroid/graphics/PointF;", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MeteringRegionCorrection {
    android.graphics.PointF getCorrectedPoint(androidx.camera.core.MeteringPoint meteringPoint, int meteringMode);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection$Bindings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.workaround.MeteringRegionCorrection.Bindings.Companion INSTANCE = new androidx.camera.camera2.compat.workaround.MeteringRegionCorrection.Bindings.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection$Bindings$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "provideMeteringRegionCorrection", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @dagger.Provides
            public final androidx.camera.camera2.compat.workaround.MeteringRegionCorrection provideMeteringRegionCorrection(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
                if (cameraQuirks.getQuirks().contains(androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk.class)) {
                    return androidx.camera.camera2.compat.workaround.MeteringRegionQuirkCorrection.INSTANCE;
                }
                return androidx.camera.camera2.compat.workaround.NoOpMeteringRegionCorrection.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}

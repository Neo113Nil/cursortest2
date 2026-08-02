package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0002\b\u0007J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "calculateIntrinsicZoomRatio", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Ljava/lang/Float;", "Companion", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IntrinsicZoomCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.internal.IntrinsicZoomCalculator.Companion INSTANCE = androidx.camera.camera2.internal.IntrinsicZoomCalculator.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/internal/IntrinsicZoomCalculator$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculatorImpl;", "impl", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "bindIntrinsicZoomCalculatorImpl", "(Landroidx/camera/camera2/internal/IntrinsicZoomCalculatorImpl;)Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        public abstract androidx.camera.camera2.internal.IntrinsicZoomCalculator bindIntrinsicZoomCalculatorImpl(androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl impl);
    }

    java.lang.Float calculateIntrinsicZoomRatio(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/internal/IntrinsicZoomCalculator$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "NO_OP_INTRINSIC_ZOOM_CALCULATOR", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "getNO_OP_INTRINSIC_ZOOM_CALCULATOR", "()Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.internal.IntrinsicZoomCalculator.Companion Camera2StreamConfigurationMap = new androidx.camera.camera2.internal.IntrinsicZoomCalculator.Companion();
        private static final androidx.camera.camera2.internal.IntrinsicZoomCalculator NO_OP_INTRINSIC_ZOOM_CALCULATOR = new androidx.camera.camera2.internal.IntrinsicZoomCalculator() { // from class: androidx.camera.camera2.internal.IntrinsicZoomCalculator$Companion$NO_OP_INTRINSIC_ZOOM_CALCULATOR$1
            @Override // androidx.camera.camera2.internal.IntrinsicZoomCalculator
            public final java.lang.Float calculateIntrinsicZoomRatio(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
                return java.lang.Float.valueOf(1.0f);
            }
        };

        private Companion() {
        }

        public final androidx.camera.camera2.internal.IntrinsicZoomCalculator getNO_OP_INTRINSIC_ZOOM_CALCULATOR() {
            return NO_OP_INTRINSIC_ZOOM_CALCULATOR;
        }
    }
}

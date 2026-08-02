package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0005\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0014\u0010\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t"}, d2 = {"Landroidx/camera/viewfinder/core/ScaleTypeKt$Fit$1;", "Camera2StreamConfigurationMap", "Landroidx/camera/viewfinder/core/ScaleTypeKt$Fit$1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/viewfinder/core/ScaleTypeKt$Fill$1;", "getHighSpeedVideoSizes", "Landroidx/camera/viewfinder/core/ScaleTypeKt$Fill$1;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/viewfinder/core/impl/Alignment;", "Landroidx/camera/viewfinder/core/impl/Alignment;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaleTypeKt {
    private static final androidx.camera.viewfinder.core.ScaleTypeKt$Fit$1 Camera2StreamConfigurationMap = new androidx.camera.viewfinder.core.impl.ContentScale() { // from class: androidx.camera.viewfinder.core.ScaleTypeKt$Fit$1
        @Override // androidx.camera.viewfinder.core.impl.ContentScale
        /* renamed from: computeScaleFactor-ho9e9VQ */
        public final long mo1043computeScaleFactorho9e9VQ(android.util.SizeF srcSize, android.util.SizeF dstSize) {
            float min;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(srcSize, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstSize, "");
            min = java.lang.Math.min(dstSize.getWidth() / srcSize.getWidth(), dstSize.getHeight() / srcSize.getHeight());
            return androidx.camera.viewfinder.core.impl.TransformationsKt.ScaleFactorF(min, min);
        }
    };
    private static final androidx.camera.viewfinder.core.ScaleTypeKt$Fill$1 getHighSpeedVideoSizes = new androidx.camera.viewfinder.core.impl.ContentScale() { // from class: androidx.camera.viewfinder.core.ScaleTypeKt$Fill$1
        @Override // androidx.camera.viewfinder.core.impl.ContentScale
        /* renamed from: computeScaleFactor-ho9e9VQ */
        public final long mo1043computeScaleFactorho9e9VQ(android.util.SizeF srcSize, android.util.SizeF dstSize) {
            float max;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(srcSize, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstSize, "");
            max = java.lang.Math.max(dstSize.getWidth() / srcSize.getWidth(), dstSize.getHeight() / srcSize.getHeight());
            return androidx.camera.viewfinder.core.impl.TransformationsKt.ScaleFactorF(max, max);
        }
    };
    private static final androidx.camera.viewfinder.core.impl.Alignment getHighSpeedVideoFpsRangesFor = new androidx.camera.viewfinder.core.BiasAlignment(-1.0f, -1.0f);
    private static final androidx.camera.viewfinder.core.impl.Alignment getHighSpeedVideoFpsRanges = new androidx.camera.viewfinder.core.BiasAlignment(0.0f, 0.0f);
    private static final androidx.camera.viewfinder.core.impl.Alignment getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.viewfinder.core.BiasAlignment(1.0f, 1.0f);
}

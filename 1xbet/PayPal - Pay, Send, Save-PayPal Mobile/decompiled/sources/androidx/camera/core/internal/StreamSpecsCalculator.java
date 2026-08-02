package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006Ju\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/internal/StreamSpecsCalculator;", "", "Landroidx/camera/core/impl/CameraDeviceSurfaceManager;", "cameraDeviceSurfaceManager", "", "setCameraDeviceSurfaceManager", "(Landroidx/camera/core/impl/CameraDeviceSurfaceManager;)V", "", "cameraMode", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "", "Landroidx/camera/core/UseCase;", "newUseCases", "attachedUseCases", "Landroidx/camera/core/impl/CameraConfig;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "calculateSuggestedStreamSpecs", "(ILandroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/impl/CameraConfig;ILandroid/util/Range;ZZ)Landroidx/camera/core/internal/StreamSpecQueryResult;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StreamSpecsCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.internal.StreamSpecsCalculator.Companion INSTANCE = androidx.camera.core.internal.StreamSpecsCalculator.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.camera.core.internal.StreamSpecsCalculator NO_OP_STREAM_SPECS_CALCULATOR = new androidx.camera.core.internal.StreamSpecsCalculator() { // from class: androidx.camera.core.internal.StreamSpecsCalculator$Companion$NO_OP_STREAM_SPECS_CALCULATOR$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.internal.StreamSpecsCalculator
        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecs(int cameraMode, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> newUseCases, java.util.List<? extends androidx.camera.core.UseCase> attachedUseCases, androidx.camera.core.impl.CameraConfig cameraConfig, int sessionType, android.util.Range<java.lang.Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newUseCases, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachedUseCases, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetFrameRate, "");
            return new androidx.camera.core.internal.StreamSpecQueryResult(null, 0, 3, 0 == true ? 1 : 0);
        }
    };

    androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecs(int cameraMode, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> newUseCases, java.util.List<? extends androidx.camera.core.UseCase> attachedUseCases, androidx.camera.core.impl.CameraConfig cameraConfig, int sessionType, android.util.Range<java.lang.Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate);

    static /* synthetic */ androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecs$default(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List list, java.util.List list2, androidx.camera.core.impl.CameraConfig cameraConfig, int i2, android.util.Range range, boolean z, boolean z2, int i3, java.lang.Object obj) {
        androidx.camera.core.impl.CameraConfig cameraConfig2;
        android.util.Range range2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSuggestedStreamSpecs");
        }
        java.util.List emptyList = (i3 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
        if ((i3 & 16) != 0) {
            androidx.camera.core.impl.CameraConfig defaultConfig = androidx.camera.core.impl.CameraConfigs.defaultConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultConfig, "");
            cameraConfig2 = defaultConfig;
        } else {
            cameraConfig2 = cameraConfig;
        }
        int i4 = (i3 & 32) != 0 ? 0 : i2;
        if ((i3 & 64) != 0) {
            android.util.Range<java.lang.Integer> range3 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range3, "");
            range2 = range3;
        } else {
            range2 = range;
        }
        return streamSpecsCalculator.calculateSuggestedStreamSpecs(i, cameraInfoInternal, list, emptyList, cameraConfig2, i4, range2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? false : z2);
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u0016\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u0001"}, d2 = {"Landroidx/camera/core/internal/StreamSpecsCalculator$Companion;", "", "<init>", "()V", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "", "cameraMode", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "", "Landroidx/camera/core/UseCase;", "newUseCases", "Landroidx/camera/core/impl/CameraConfig;", "cameraConfig", "", "isFeatureComboInvocation", "attachedUseCases", "sessionType", "Landroid/util/Range;", "targetFrameRate", "findMaxSupportedFrameRate", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "calculateSuggestedStreamSpecsCompat", "(Landroidx/camera/core/internal/StreamSpecsCalculator;ILandroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Landroidx/camera/core/impl/CameraConfig;ZLjava/util/List;ILandroid/util/Range;Z)Landroidx/camera/core/internal/StreamSpecQueryResult;", "NO_OP_STREAM_SPECS_CALCULATOR", "Landroidx/camera/core/internal/StreamSpecsCalculator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.core.internal.StreamSpecsCalculator.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.internal.StreamSpecsCalculator.Companion();

        private Companion() {
        }

        public static /* synthetic */ androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat$default(androidx.camera.core.internal.StreamSpecsCalculator.Companion companion, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List list, androidx.camera.core.impl.CameraConfig cameraConfig, boolean z, java.util.List list2, int i2, android.util.Range range, boolean z2, int i3, java.lang.Object obj) {
            androidx.camera.core.impl.CameraConfig cameraConfig2;
            android.util.Range range2;
            if ((i3 & 8) != 0) {
                androidx.camera.core.impl.CameraConfig defaultConfig = androidx.camera.core.impl.CameraConfigs.defaultConfig();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultConfig, "");
                cameraConfig2 = defaultConfig;
            } else {
                cameraConfig2 = cameraConfig;
            }
            boolean z3 = (i3 & 16) != 0 ? false : z;
            java.util.List emptyList = (i3 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
            int i4 = (i3 & 64) != 0 ? 0 : i2;
            if ((i3 & 128) != 0) {
                android.util.Range<java.lang.Integer> range3 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range3, "");
                range2 = range3;
            } else {
                range2 = range;
            }
            return companion.calculateSuggestedStreamSpecsCompat(streamSpecsCalculator, i, cameraInfoInternal, list, cameraConfig2, z3, emptyList, i4, range2, (i3 & 256) != 0 ? false : z2);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.impl.CameraConfig cameraConfig, boolean z, java.util.List<? extends androidx.camera.core.UseCase> list2, int i2, android.util.Range<java.lang.Integer> range, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
            return streamSpecsCalculator.calculateSuggestedStreamSpecs(i, cameraInfoInternal, list, list2, cameraConfig, i2, range, z, z2);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.impl.CameraConfig cameraConfig, boolean z, java.util.List<? extends androidx.camera.core.UseCase> list2, int i2, android.util.Range<java.lang.Integer> range) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i, cameraInfoInternal, list, cameraConfig, z, list2, i2, range, false, 256, null);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.impl.CameraConfig cameraConfig, boolean z, java.util.List<? extends androidx.camera.core.UseCase> list2, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i, cameraInfoInternal, list, cameraConfig, z, list2, i2, null, false, 384, null);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.impl.CameraConfig cameraConfig, boolean z, java.util.List<? extends androidx.camera.core.UseCase> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i, cameraInfoInternal, list, cameraConfig, z, list2, 0, null, false, 448, null);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.impl.CameraConfig cameraConfig, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i, cameraInfoInternal, list, cameraConfig, z, null, 0, null, false, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.impl.CameraConfig cameraConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i, cameraInfoInternal, list, cameraConfig, false, null, 0, null, false, 496, null);
        }

        public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, int i, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i, cameraInfoInternal, list, null, false, null, 0, null, false, 504, null);
        }
    }

    default void setCameraDeviceSurfaceManager(androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "");
    }
}

package androidx.camera.camera2.pipe.compat;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "metadataProvider", "Landroidx/camera/camera2/pipe/StrictMode;", "strictMode", "<init>", "(Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;Landroidx/camera/camera2/pipe/StrictMode;)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "", "shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Z", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "shouldCreateEmptyCaptureSessionBeforeClosing-EfqyGwQ$camera_camera2_pipe", "(Ljava/lang/String;)Z", "shouldCreateEmptyCaptureSessionBeforeClosing", "shouldWaitForCameraDeviceOnClosed-EfqyGwQ$camera_camera2_pipe", "shouldWaitForCameraDeviceOnClosed", "shouldCloseCameraBeforeCreatingCaptureSession-EfqyGwQ$camera_camera2_pipe", "shouldCloseCameraBeforeCreatingCaptureSession", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "graphConfigFlags", "", "getRepeatingRequestFrameCountForCapture$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/CameraGraph$Flags;)I", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/StrictMode;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2Quirks {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.Camera2MetadataProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.StrictMode getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.compat.Camera2Quirks.Companion INSTANCE = new androidx.camera.camera2.pipe.compat.Camera2Quirks.Companion(null);
    private static final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Google", kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"})));
    private static final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adjust.sdk.Constants.REFERRER_API_GOOGLE, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"pixel 4", "pixel 4 xl"})), kotlin.TuplesKt.to(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, kotlin.collections.SetsKt.setOf("sm-g770f")));

    @javax.inject.Inject
    public Camera2Quirks(androidx.camera.camera2.pipe.compat.Camera2MetadataProvider camera2MetadataProvider, androidx.camera.camera2.pipe.StrictMode strictMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2MetadataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strictMode, "");
        this.getHighSpeedVideoSizes = camera2MetadataProvider;
        this.getHighSpeedVideoFpsRanges = strictMode;
    }

    public final boolean shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe(androidx.camera.camera2.pipe.CameraGraph.Config graphConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
        if (this.getHighSpeedVideoFpsRanges.getEnabled()) {
            return false;
        }
        java.lang.Boolean awaitRepeatingRequestOnDisconnect = graphConfig.getFlags().getAwaitRepeatingRequestOnDisconnect();
        return awaitRepeatingRequestOnDisconnect != null ? awaitRepeatingRequestOnDisconnect.booleanValue() : androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.getHighSpeedVideoSizes.mo796awaitCameraMetadataEfqyGwQ(graphConfig.m353getCameraDz_R5H8()));
    }

    /* renamed from: shouldCreateEmptyCaptureSessionBeforeClosing-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m801xfcf3eba9(java.lang.String cameraId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        return !this.getHighSpeedVideoFpsRanges.getEnabled() && android.os.Build.VERSION.SDK_INT < 29 && androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.getHighSpeedVideoSizes.mo796awaitCameraMetadataEfqyGwQ(cameraId));
    }

    /* renamed from: shouldWaitForCameraDeviceOnClosed-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m802shouldWaitForCameraDeviceOnClosedEfqyGwQ$camera_camera2_pipe(java.lang.String cameraId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        if (this.getHighSpeedVideoFpsRanges.getEnabled()) {
            return false;
        }
        return androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.getHighSpeedVideoSizes.mo796awaitCameraMetadataEfqyGwQ(cameraId));
    }

    /* renamed from: shouldCloseCameraBeforeCreatingCaptureSession-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m800x552c1673(java.lang.String cameraId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        if (this.getHighSpeedVideoFpsRanges.getEnabled()) {
            return false;
        }
        return (android.os.Build.VERSION.SDK_INT <= 32 && androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.getHighSpeedVideoSizes.mo796awaitCameraMetadataEfqyGwQ(cameraId))) || (kotlin.text.StringsKt.equals("motorola", android.os.Build.BRAND, true) && kotlin.text.StringsKt.equals("moto e20", android.os.Build.MODEL, true) && kotlin.jvm.internal.Intrinsics.areEqual(cameraId, "1"));
    }

    public final int getRepeatingRequestFrameCountForCapture$camera_camera2_pipe(androidx.camera.camera2.pipe.CameraGraph.Flags graphConfigFlags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfigFlags, "");
        int i = 0;
        if (this.getHighSpeedVideoFpsRanges.getEnabled()) {
            return 0;
        }
        androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture = graphConfigFlags.getAwaitRepeatingRequestBeforeCapture();
        java.util.Set<java.lang.String> set = getHighSpeedVideoFpsRanges.get(android.os.Build.MANUFACTURER);
        if (set != null && set.contains(android.os.Build.DEVICE) && android.os.Build.VERSION.SDK_INT < 34) {
            i = java.lang.Math.max(0, 10);
        }
        int i2 = androidx.camera.camera2.pipe.compat.Camera2Quirks.WhenMappings.$EnumSwitchMapping$0[awaitRepeatingRequestBeforeCapture.getCompletionBehavior().ordinal()];
        if (i2 == 1) {
            return java.lang.Math.max(i, awaitRepeatingRequestBeforeCapture.getRepeatingFramesToComplete());
        }
        if (i2 != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return awaitRepeatingRequestBeforeCapture.getRepeatingFramesToComplete();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2Quirks$Companion;", "", "<init>", "()V", "", "shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe", "()Z", "", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe() {
            if (android.os.Build.VERSION.SDK_INT <= 27 || kotlin.jvm.internal.Intrinsics.areEqual(android.os.Build.HARDWARE, "samsungexynos7870")) {
                return true;
            }
            if (!kotlin.text.StringsKt.equals(android.os.Build.HARDWARE, "qcom", true) || android.os.Build.VERSION.SDK_INT > 31) {
                java.util.Map map = androidx.camera.camera2.pipe.compat.Camera2Quirks.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str = android.os.Build.BRAND;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.util.Set set = (java.util.Set) map.get(lowerCase);
                if (set == null) {
                    return false;
                }
                java.lang.String str2 = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (!set.contains(lowerCase2)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.values().length];
            try {
                iArr[androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.EXACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

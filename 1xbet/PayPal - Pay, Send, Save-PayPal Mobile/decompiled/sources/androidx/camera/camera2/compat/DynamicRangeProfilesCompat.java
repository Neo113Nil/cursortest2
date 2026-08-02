package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;", "impl", "<init>", "(Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;)V", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "", "getDynamicRangeCaptureRequestConstraints", "(Landroidx/camera/core/DynamicRange;)Ljava/util/Set;", "", "isExtraLatencyPresent", "(Landroidx/camera/core/DynamicRange;)Z", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "toDynamicRangeProfiles", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;", "getHighSpeedVideoFpsRangesFor", "getSupportedDynamicRanges", "()Ljava/util/Set;", "supportedDynamicRanges", "Companion", "DynamicRangeProfilesCompatImpl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeProfilesCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.DynamicRangeProfilesCompat.Companion INSTANCE = new androidx.camera.camera2.compat.DynamicRangeProfilesCompat.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;", "", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "", "getDynamicRangeCaptureRequestConstraints", "(Landroidx/camera/core/DynamicRange;)Ljava/util/Set;", "", "isExtraLatencyPresent", "(Landroidx/camera/core/DynamicRange;)Z", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "unwrap", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "getSupportedDynamicRanges", "()Ljava/util/Set;", "supportedDynamicRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DynamicRangeProfilesCompatImpl {
        java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange);

        java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

        boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange);

        /* renamed from: unwrap */
        android.hardware.camera2.params.DynamicRangeProfiles getGetHighSpeedVideoFpsRanges();
    }

    public DynamicRangeProfilesCompat(androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRangeProfilesCompatImpl, "");
        this.getHighSpeedVideoFpsRangesFor = dynamicRangeProfilesCompatImpl;
    }

    public final java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return this.getHighSpeedVideoFpsRangesFor.getSupportedDynamicRanges();
    }

    public final java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        return this.getHighSpeedVideoFpsRangesFor.getDynamicRangeCaptureRequestConstraints(dynamicRange);
    }

    public final boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        return this.getHighSpeedVideoFpsRangesFor.isExtraLatencyPresent(dynamicRange);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "fromCameraMetaData", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "toDynamicRangesCompat", "(Landroid/hardware/camera2/params/DynamicRangeProfiles;)Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.compat.DynamicRangeProfilesCompat fromCameraMetaData(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            androidx.camera.camera2.compat.DynamicRangeProfilesCompat dynamicRangeProfilesCompat;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                dynamicRangeProfilesCompat = toDynamicRangesCompat((android.hardware.camera2.params.DynamicRangeProfiles) cameraMetadata.get(key));
            } else {
                dynamicRangeProfilesCompat = null;
            }
            return dynamicRangeProfilesCompat == null ? androidx.camera.camera2.compat.DynamicRangeProfilesCompatBaseImpl.INSTANCE.getCOMPAT_INSTANCE() : dynamicRangeProfilesCompat;
        }

        public final androidx.camera.camera2.compat.DynamicRangeProfilesCompat toDynamicRangesCompat(android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
            if (dynamicRangeProfiles == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                return new androidx.camera.camera2.compat.DynamicRangeProfilesCompat(new androidx.camera.camera2.compat.DynamicRangeProfilesCompatApi33Impl(dynamicRangeProfiles));
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ");
            sb.append(android.os.Build.VERSION.SDK_INT);
            sb.append(" (requires API 33)");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final android.hardware.camera2.params.DynamicRangeProfiles toDynamicRangeProfiles() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append(" (requires API 33)");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}

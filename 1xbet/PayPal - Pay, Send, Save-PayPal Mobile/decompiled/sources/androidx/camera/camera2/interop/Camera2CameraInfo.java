package androidx.camera.camera2.interop;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/interop/Camera2CameraInfo;", "", "Landroidx/camera/camera2/impl/CameraProperties;", "p0", "", "Landroid/util/Pair;", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "p1", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Ljava/util/List;)V", "T", "key", "getCameraCharacteristic", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "", "getCameraId", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap", "cameraId", "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Camera2CameraInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.interop.Camera2CameraInfo.Companion INSTANCE = new androidx.camera.camera2.interop.Camera2CameraInfo.Companion(null);
    public final /* synthetic */ java.lang.String cameraId;
    private final androidx.camera.camera2.impl.CameraProperties getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object>> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CameraInfo(androidx.camera.camera2.impl.CameraProperties cameraProperties, java.util.List<? extends android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object>> list) {
        this.getHighSpeedVideoFpsRanges = cameraProperties;
        this.Camera2StreamConfigurationMap = list;
        this.cameraId = cameraProperties.mo106getCameraIdDz_R5H8();
    }

    /* synthetic */ Camera2CameraInfo(androidx.camera.camera2.impl.CameraProperties cameraProperties, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraProperties, (i & 2) != 0 ? null : list);
    }

    public final <T> T getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object>> list = this.Camera2StreamConfigurationMap;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(pair.first, key)) {
                    return (T) pair.second;
                }
            }
        }
        return (T) androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt.getSafely(this.getHighSpeedVideoFpsRanges.getMetadata(), key);
    }

    public final java.lang.String getCameraId() {
        return this.cameraId;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/interop/Camera2CameraInfo$Companion;", "", "<init>", "()V", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "from", "(Landroidx/camera/core/CameraInfo;)Landroidx/camera/camera2/interop/Camera2CameraInfo;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "create", "(Landroidx/camera/camera2/impl/CameraProperties;)Landroidx/camera/camera2/interop/Camera2CameraInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.interop.Camera2CameraInfo from(androidx.camera.core.CameraInfo cameraInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
            androidx.camera.camera2.interop.Camera2CameraInfo camera2CameraInfo = (androidx.camera.camera2.interop.Camera2CameraInfo) androidx.camera.camera2.adapter.CameraInfoAdapter.INSTANCE.unwrapAs(cameraInfo, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.interop.Camera2CameraInfo.class));
            if (camera2CameraInfo == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not unwrap ");
                sb.append(cameraInfo);
                sb.append(" as Camera2CameraInfo!");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (cameraInfo instanceof androidx.camera.core.impl.AdapterCameraInfo) {
                androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo = (androidx.camera.core.impl.AdapterCameraInfo) cameraInfo;
                if (adapterCameraInfo.getSessionProcessor() != null) {
                    androidx.camera.camera2.impl.CameraProperties cameraProperties = camera2CameraInfo.getHighSpeedVideoFpsRanges;
                    androidx.camera.core.impl.SessionProcessor sessionProcessor = adapterCameraInfo.getSessionProcessor();
                    return new androidx.camera.camera2.interop.Camera2CameraInfo(cameraProperties, sessionProcessor != null ? sessionProcessor.getAvailableCharacteristicsKeyValues() : null, null);
                }
            }
            return camera2CameraInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.interop.Camera2CameraInfo create(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
            return new androidx.camera.camera2.interop.Camera2CameraInfo(cameraProperties, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.interop.Camera2CameraInfo from(androidx.camera.core.CameraInfo cameraInfo) {
        return INSTANCE.from(cameraInfo);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.interop.Camera2CameraInfo create(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        return INSTANCE.create(cameraProperties);
    }

    public /* synthetic */ Camera2CameraInfo(androidx.camera.camera2.impl.CameraProperties cameraProperties, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraProperties, list);
    }
}

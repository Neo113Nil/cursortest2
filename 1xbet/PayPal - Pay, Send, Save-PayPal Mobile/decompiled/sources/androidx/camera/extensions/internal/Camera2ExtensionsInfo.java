package androidx.camera.extensions.internal;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f"}, d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsInfo;", "Landroidx/camera/extensions/internal/Camera2ExtensionsInfoProvider;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "<init>", "(Landroid/hardware/camera2/CameraManager;)V", "", "cameraId", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "getExtensionCharacteristics", "(Ljava/lang/String;)Landroid/hardware/camera2/CameraExtensionCharacteristics;", "", "mode", "", "isExtensionAvailable", "(Ljava/lang/String;I)Z", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/util/List;", "format", "Landroid/util/Size;", "getSupportedOutputSizes", "(Ljava/lang/String;II)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Landroid/hardware/camera2/CameraManager;", "getHighResolutionOutputSizeshNQ4ISI", "", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ExtensionsInfo implements androidx.camera.extensions.internal.Camera2ExtensionsInfoProvider {
    private static final androidx.camera.extensions.internal.Camera2ExtensionsInfo.Companion Companion = new androidx.camera.extensions.internal.Camera2ExtensionsInfo.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.util.List<android.util.Size>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.hardware.camera2.CameraManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, android.hardware.camera2.CameraExtensionCharacteristics> getHighSpeedVideoFpsRangesFor;

    public Camera2ExtensionsInfo(android.hardware.camera2.CameraManager cameraManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cameraManager;
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    @Override // androidx.camera.extensions.internal.Camera2ExtensionsInfoProvider
    public final android.hardware.camera2.CameraExtensionCharacteristics getExtensionCharacteristics(java.lang.String cameraId) {
        android.hardware.camera2.CameraExtensionCharacteristics cameraExtensionCharacteristics;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        synchronized (this.getHighSpeedVideoSizes) {
            cameraExtensionCharacteristics = this.getHighSpeedVideoFpsRangesFor.get(cameraId);
            if (cameraExtensionCharacteristics == null) {
                cameraExtensionCharacteristics = this.getHighResolutionOutputSizeshNQ4ISI.getCameraExtensionCharacteristics(cameraId);
                this.getHighSpeedVideoFpsRangesFor.put(cameraId, cameraExtensionCharacteristics);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraExtensionCharacteristics, "");
            }
        }
        return cameraExtensionCharacteristics;
    }

    @Override // androidx.camera.extensions.internal.Camera2ExtensionsInfoProvider
    public final boolean isExtensionAvailable(java.lang.String cameraId, int mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        return getHighSpeedVideoSizes(cameraId).contains(java.lang.Integer.valueOf(mode));
    }

    private final java.util.List<java.lang.Integer> getHighSpeedVideoSizes(java.lang.String p0) {
        java.util.List<java.lang.Integer> list;
        synchronized (this.getHighSpeedVideoSizes) {
            list = this.Camera2StreamConfigurationMap.get(p0);
            if (list == null) {
                list = getExtensionCharacteristics(p0).getSupportedExtensions();
                this.Camera2StreamConfigurationMap.put(p0, list);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
            }
        }
        return list;
    }

    @Override // androidx.camera.extensions.internal.Camera2ExtensionsInfoProvider
    public final java.util.List<android.util.Size> getSupportedOutputSizes(java.lang.String cameraId, int mode, int format) {
        java.util.List<android.util.Size> list;
        java.util.List<android.util.Size> extensionSupportedSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cameraId);
        sb.append('-');
        sb.append(mode);
        sb.append('-');
        sb.append(format);
        java.lang.String obj = sb.toString();
        synchronized (this.getHighSpeedVideoSizes) {
            list = this.getHighSpeedVideoFpsRanges.get(obj);
        }
        if (list != null) {
            return list;
        }
        try {
            if (format == 34) {
                extensionSupportedSizes = getExtensionCharacteristics(cameraId).getExtensionSupportedSizes(mode, android.graphics.SurfaceTexture.class);
            } else {
                extensionSupportedSizes = getExtensionCharacteristics(cameraId).getExtensionSupportedSizes(mode, format);
            }
            synchronized (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.put(obj, extensionSupportedSizes);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(extensionSupportedSizes);
            return extensionSupportedSizes;
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to retrieve supported output sizes for camera ");
            sb2.append(cameraId);
            sb2.append(", mode ");
            sb2.append(mode);
            sb2.append(", format ");
            sb2.append(format);
            androidx.camera.core.Logger.e("Camera2ExtensionsInfo", sb2.toString(), e);
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsInfo$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

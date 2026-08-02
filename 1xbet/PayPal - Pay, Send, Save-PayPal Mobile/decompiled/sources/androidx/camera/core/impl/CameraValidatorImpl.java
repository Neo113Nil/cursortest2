package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0003\"#!B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 "}, d2 = {"Landroidx/camera/core/impl/CameraValidatorImpl;", "Landroidx/camera/core/impl/CameraValidator;", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraSelector;", "availableCamerasSelector", "<init>", "(Landroid/content/Context;Landroidx/camera/core/CameraSelector;)V", "Landroidx/camera/core/impl/CameraRepository;", "cameraRepository", "", "validateOnFirstInit", "(Landroidx/camera/core/impl/CameraRepository;)V", "", "Landroidx/camera/core/impl/CameraInternal;", "currentCameras", "Landroidx/camera/core/CameraIdentifier;", "removedCameras", "", "isChangeInvalid", "(Ljava/util/Set;Ljava/util/Set;)Z", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/Set;Landroidx/camera/core/CameraSelector;)Z", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Landroidx/camera/core/CameraSelector;", "getHighSpeedVideoFpsRangesFor", "Z", "Landroidx/camera/core/impl/CameraValidatorImpl$ValidationCriteria;", "Landroidx/camera/core/impl/CameraValidatorImpl$ValidationCriteria;", "Companion", "ValidationCriteria", "Api34Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraValidatorImpl implements androidx.camera.core.impl.CameraValidator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;
    private final androidx.camera.core.CameraSelector getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraValidatorImpl.ValidationCriteria Camera2StreamConfigurationMap;

    public CameraValidatorImpl(android.content.Context context, androidx.camera.core.CameraSelector cameraSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRanges = cameraSelector;
        boolean z = true;
        this.getHighSpeedVideoFpsRangesFor = android.os.Build.VERSION.SDK_INT >= 34 && androidx.camera.core.impl.CameraValidatorImpl.Api34Impl.INSTANCE.getHighSpeedVideoFpsRanges(context) != 0;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.lang.Integer lensFacing = cameraSelector != null ? cameraSelector.getLensFacing() : null;
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = hasSystemFeature && (lensFacing == null || lensFacing.intValue() == 1);
        if (!hasSystemFeature2 || (lensFacing != null && lensFacing.intValue() != 0)) {
            z = false;
        }
        this.Camera2StreamConfigurationMap = new androidx.camera.core.impl.CameraValidatorImpl.ValidationCriteria(z2, z);
    }

    @Override // androidx.camera.core.impl.CameraValidator
    public final void validateOnFirstInit(androidx.camera.core.impl.CameraRepository cameraRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraRepository, "");
        if (this.getHighSpeedVideoFpsRangesFor) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Virtual device with ");
            sb.append(cameraRepository.getCameras().size());
            sb.append(" cameras. Skipping validation.");
            androidx.camera.core.Logger.d("CameraValidator", sb.toString());
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Verifying camera lens facing on ");
        sb2.append(android.os.Build.DEVICE);
        androidx.camera.core.Logger.d("CameraValidator", sb2.toString());
        if (this.Camera2StreamConfigurationMap.getCamera2StreamConfigurationMap()) {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras()));
            } catch (java.lang.RuntimeException e) {
                e = e;
                androidx.camera.core.Logger.w("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes()) {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras()));
            } catch (java.lang.RuntimeException e2) {
                androidx.camera.core.Logger.w("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException("Expected camera missing from device.", cameraRepository.getCameras().size(), e);
        }
    }

    @Override // androidx.camera.core.impl.CameraValidator
    public final boolean isChangeInvalid(java.util.Set<? extends androidx.camera.core.impl.CameraInternal> currentCameras, java.util.Set<androidx.camera.core.CameraIdentifier> removedCameras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCameras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removedCameras, "");
        if (this.getHighSpeedVideoFpsRangesFor || !(this.Camera2StreamConfigurationMap.getCamera2StreamConfigurationMap() || this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes())) {
            return false;
        }
        androidx.camera.core.CameraSelector cameraSelector = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(currentCameras, cameraSelector);
        androidx.camera.core.CameraSelector cameraSelector2 = androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector2, "");
        boolean highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(currentCameras, cameraSelector2);
        java.util.Set<androidx.camera.core.CameraIdentifier> set = removedCameras;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.camera.core.CameraIdentifier) it.next()).getInternalId());
        }
        java.util.Set set2 = kotlin.collections.CollectionsKt.toSet(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : currentCameras) {
            if (!set2.contains(((androidx.camera.core.impl.CameraInternal) obj).getCamera2StreamConfigurationMap().getCameraId())) {
                arrayList2.add(obj);
            }
        }
        java.util.Set set3 = kotlin.collections.CollectionsKt.toSet(arrayList2);
        androidx.camera.core.CameraSelector cameraSelector3 = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector3, "");
        boolean highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(set3, cameraSelector3);
        androidx.camera.core.CameraSelector cameraSelector4 = androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector4, "");
        return (this.Camera2StreamConfigurationMap.getCamera2StreamConfigurationMap() && highSpeedVideoFpsRanges && !highSpeedVideoFpsRanges3) || (this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes() && highSpeedVideoFpsRanges2 && !getHighSpeedVideoFpsRanges(set3, cameraSelector4));
    }

    private static boolean getHighSpeedVideoFpsRanges(java.util.Set<? extends androidx.camera.core.impl.CameraInternal> p0, androidx.camera.core.CameraSelector p1) {
        try {
            p1.select(new java.util.LinkedHashSet<>(p0));
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012"}, d2 = {"Landroidx/camera/core/impl/CameraValidatorImpl$ValidationCriteria;", "", "", "p0", "p1", "<init>", "(ZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "()Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class ValidationCriteria {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final boolean Camera2StreamConfigurationMap;
        private final boolean getHighSpeedVideoSizes;

        public ValidationCriteria(boolean z, boolean z2) {
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoSizes = z2;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final boolean getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationCriteria(Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.core.impl.CameraValidatorImpl.ValidationCriteria)) {
                return false;
            }
            androidx.camera.core.impl.CameraValidatorImpl.ValidationCriteria validationCriteria = (androidx.camera.core.impl.CameraValidatorImpl.ValidationCriteria) p0;
            return this.Camera2StreamConfigurationMap == validationCriteria.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == validationCriteria.getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/core/impl/CameraValidatorImpl$Api34Impl;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/content/Context;)I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.camera.core.impl.CameraValidatorImpl.Api34Impl INSTANCE = new androidx.camera.core.impl.CameraValidatorImpl.Api34Impl();

        private Api34Impl() {
        }

        public final int getHighSpeedVideoFpsRanges(android.content.Context p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return p0.getDeviceId();
        }
    }
}

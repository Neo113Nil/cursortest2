package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraInfoInternal extends androidx.camera.core.CameraInfo {
    void addSessionCaptureCallback(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback);

    java.lang.Object getCameraCharacteristics();

    java.lang.String getCameraId();

    androidx.camera.core.impl.Quirks getCameraQuirks();

    /* renamed from: getEncoderProfilesProvider */
    androidx.camera.core.impl.EncoderProfilesProvider getGetInputFormats();

    default androidx.camera.core.impl.CameraInfoInternal getImplementation() {
        return this;
    }

    java.lang.Object getPhysicalCameraCharacteristics(java.lang.String str);

    android.graphics.Rect getSensorRect();

    java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

    java.util.List<android.util.Size> getSupportedHighResolutions(int i);

    java.util.Set<android.util.Range<java.lang.Integer>> getSupportedHighSpeedFrameRateRanges();

    java.util.Set<android.util.Range<java.lang.Integer>> getSupportedHighSpeedFrameRateRangesFor(android.util.Size size);

    java.util.List<android.util.Size> getSupportedHighSpeedResolutions();

    java.util.List<android.util.Size> getSupportedHighSpeedResolutionsFor(android.util.Range<java.lang.Integer> range);

    java.util.Set<java.lang.Integer> getSupportedOutputFormats();

    java.util.List<android.util.Size> getSupportedResolutions(int i);

    androidx.camera.core.impl.Timebase getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    boolean isHighSpeedSupported();

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    default boolean isUseCaseCombinationSupported(java.util.List<androidx.camera.core.UseCase> list, int i, boolean z, androidx.camera.core.impl.CameraConfig cameraConfig) {
        return false;
    }

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback);

    @Override // androidx.camera.core.CameraInfo
    default java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges(androidx.camera.core.SessionConfig sessionConfig) {
        java.util.Set<android.util.Range<java.lang.Integer>> supportedFrameRateRanges;
        try {
            int maxSupportedFrameRate = androidx.camera.core.impl.UseCaseAdditionSimulator.simulateAddUseCases(this, sessionConfig, true).getPrimaryStreamSpecResult().getMaxSupportedFrameRate();
            if (sessionConfig.getSessionType() == 1) {
                supportedFrameRateRanges = androidx.camera.core.impl.utils.RangeUtil.filterFixedRanges(getSupportedHighSpeedFrameRateRanges());
            } else {
                supportedFrameRateRanges = getSupportedFrameRateRanges();
            }
            if (supportedFrameRateRanges.isEmpty()) {
                return java.util.Collections.emptySet();
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (android.util.Range<java.lang.Integer> range : supportedFrameRateRanges) {
                if (range.getUpper().intValue() <= maxSupportedFrameRate) {
                    linkedHashSet.add(range);
                }
            }
            return linkedHashSet;
        } catch (java.lang.Throwable th) {
            androidx.camera.core.Logger.w("CameraInfoInternal", "Failed to get max supported frameRate by SessionConfig: ".concat(java.lang.String.valueOf(sessionConfig)), th);
            return java.util.Collections.emptySet();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    default androidx.camera.core.CameraSelector getCameraSelector() {
        return new androidx.camera.core.CameraSelector.Builder().addCameraFilter(new androidx.camera.core.CameraFilter() { // from class: androidx.camera.core.impl.CameraInfoInternal$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final java.util.List filter(java.util.List list) {
                return androidx.camera.core.impl.CameraInfoInternal.lambda$getCameraSelector$0(androidx.camera.core.impl.CameraInfoInternal.this, list);
            }
        }).addCameraFilter(new androidx.camera.core.impl.LensFacingCameraFilter(getLensFacing())).build();
    }

    static /* synthetic */ java.util.List lambda$getCameraSelector$0(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List list) {
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.CameraInfo cameraInfo = (androidx.camera.core.CameraInfo) it.next();
            androidx.core.util.Preconditions.checkArgument(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal);
            if (((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return java.util.Collections.singletonList(cameraInfo);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find camera with id ");
        sb.append(cameraId);
        sb.append(" from list of available cameras.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    default boolean isUseCaseCombinationSupported(java.util.List<androidx.camera.core.UseCase> list) {
        return isUseCaseCombinationSupported(list, 0);
    }

    default boolean isUseCaseCombinationSupported(java.util.List<androidx.camera.core.UseCase> list, int i) {
        return isUseCaseCombinationSupported(list, i, false);
    }

    default boolean isUseCaseCombinationSupported(java.util.List<androidx.camera.core.UseCase> list, int i, boolean z) {
        return isUseCaseCombinationSupported(list, i, z, androidx.camera.core.impl.CameraConfigs.defaultConfig());
    }

    @Override // androidx.camera.core.CameraInfo
    default boolean isSessionConfigSupported(androidx.camera.core.SessionConfig sessionConfig) {
        try {
            androidx.camera.core.CameraFilter cameraFilter = sessionConfig.getCameraFilter();
            if (cameraFilter != null && cameraFilter.filter(java.util.Collections.singletonList(this)).isEmpty()) {
                return false;
            }
            androidx.camera.core.impl.UseCaseAdditionSimulator.simulateAddUseCases(this, sessionConfig, false);
            return true;
        } catch (androidx.camera.core.internal.CameraUseCaseAdapter.CameraException | java.lang.IllegalArgumentException e) {
            androidx.camera.core.Logger.d("CameraInfoInternal", "CameraInfoInternal.isSessionConfigSupported failed", e);
            return false;
        }
    }

    default boolean isResolvedFeatureGroupSupported(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup, androidx.camera.core.SessionConfig sessionConfig) {
        for (androidx.camera.core.featuregroup.GroupableFeature groupableFeature : resolvedFeatureGroup.getFeatures()) {
            if (!groupableFeature.isSupportedIndividually(this, sessionConfig)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(groupableFeature);
                sb.append(" is not supported.");
                androidx.camera.core.Logger.d("CameraInfoInternal", sb.toString());
                return false;
            }
        }
        try {
            androidx.camera.core.impl.UseCaseAdditionSimulator.simulateAddUseCases(this, sessionConfig, false, resolvedFeatureGroup);
            return true;
        } catch (androidx.camera.core.internal.CameraUseCaseAdapter.CameraException | java.lang.IllegalArgumentException e) {
            androidx.camera.core.Logger.d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
            return false;
        }
    }

    default void setCameraUseCaseAdapterProvider(androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider) {
        androidx.camera.core.impl.UseCaseAdditionSimulator.setCameraUseCaseAdapterProvider(cameraUseCaseAdapterProvider);
    }

    @Override // androidx.camera.core.CameraInfo
    default androidx.camera.core.CameraIdentifier getCameraIdentifier() {
        return androidx.camera.core.CameraIdentifier.Factory.create(getCameraId());
    }

    default java.util.Set<java.lang.Integer> getAvailableCapabilities() {
        return java.util.Collections.emptySet();
    }

    default boolean isExternalCamera() {
        return getLensFacing() == 2;
    }
}

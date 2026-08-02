package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
class VirtualCameraAdapter implements androidx.camera.core.UseCase.StateChangeCallback {
    final java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.Set<androidx.camera.core.UseCase> getHighSpeedVideoFpsRanges;
    final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.UseCaseConfig<?>> getHighSpeedVideoFpsRangesFor;
    final androidx.camera.core.impl.CameraInternal getInputFormats;
    final androidx.camera.core.streamsharing.ResolutionsMerger getOutputFormats;
    final androidx.camera.core.impl.CameraInternal getOutputMinFrameDuration;
    androidx.camera.core.streamsharing.ResolutionsMerger getOutputSizeshNQ4ISI;
    final androidx.camera.core.impl.UseCaseConfigFactory getOutputStallDuration;
    final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> getHighSpeedVideoSizes = new java.util.HashMap();
    final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.streamsharing.VirtualCamera> getHighSpeedVideoSizesFor = new java.util.HashMap();
    final java.util.Map<androidx.camera.core.UseCase, java.lang.Boolean> Camera2StreamConfigurationMap = new java.util.HashMap();
    final androidx.camera.core.impl.CameraCaptureCallback getInputSizeshNQ4ISI = new androidx.camera.core.streamsharing.VirtualCameraAdapter.VirtualCameraCaptureCallback(this);

    VirtualCameraAdapter(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, java.util.Set<androidx.camera.core.UseCase> set, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.streamsharing.StreamSharing.Control control) {
        this.getOutputMinFrameDuration = cameraInternal;
        this.getInputFormats = cameraInternal2;
        this.getOutputStallDuration = useCaseConfigFactory;
        this.getHighSpeedVideoFpsRanges = set;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : set) {
            hashMap.put(useCase, useCase.mergeConfigs(cameraInternal.getCamera2StreamConfigurationMap(), null, useCase.getDefaultConfig(true, useCaseConfigFactory)));
        }
        this.getHighSpeedVideoFpsRangesFor = hashMap;
        java.util.HashSet hashSet = new java.util.HashSet(hashMap.values());
        this.getHighResolutionOutputSizeshNQ4ISI = hashSet;
        this.getOutputFormats = new androidx.camera.core.streamsharing.ResolutionsMerger(cameraInternal, hashSet);
        if (cameraInternal2 != null) {
            this.getOutputSizeshNQ4ISI = new androidx.camera.core.streamsharing.ResolutionsMerger(cameraInternal2, hashSet);
        }
        for (androidx.camera.core.UseCase useCase2 : set) {
            this.Camera2StreamConfigurationMap.put(useCase2, java.lang.Boolean.FALSE);
            this.getHighSpeedVideoSizesFor.put(useCase2, new androidx.camera.core.streamsharing.VirtualCamera(cameraInternal, this, control));
        }
    }

    final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.util.OutConfig> getHighSpeedVideoSizes(androidx.camera.core.processing.SurfaceEdge surfaceEdge, int i, boolean z, boolean z2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : this.getHighSpeedVideoFpsRanges) {
            androidx.camera.core.processing.util.OutConfig Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(useCase, this.getOutputFormats, this.getOutputMinFrameDuration, surfaceEdge, i, z, z2);
            getHighResolutionOutputSizeshNQ4ISI(useCase);
            hashMap.put(useCase, Camera2StreamConfigurationMap);
        }
        return hashMap;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.CameraInternal cameraInternal = this.getOutputMinFrameDuration;
        ((androidx.camera.core.streamsharing.VirtualCamera) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizesFor.get(useCase))).getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor = cameraInternal.getCameraInfo().getSensorRotationDegrees(((androidx.camera.core.impl.ImageOutputConfig) useCase.getCurrentConfig()).getTargetRotation(0));
    }

    final java.util.Map<androidx.camera.core.UseCase, android.util.Size> getHighSpeedVideoFpsRanges(androidx.camera.core.processing.SurfaceEdge surfaceEdge, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : this.getHighSpeedVideoFpsRanges) {
            androidx.camera.core.streamsharing.PreferredChildSize highSpeedVideoFpsRanges = this.getOutputFormats.getHighSpeedVideoFpsRanges((androidx.camera.core.impl.UseCaseConfig) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor.get(useCase)), surfaceEdge.getCropRect(), androidx.camera.core.impl.utils.TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z);
            hashMap.put(useCase, highSpeedVideoFpsRanges.getOriginalSelectedChildSize());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Selected child size: ");
            sb.append(highSpeedVideoFpsRanges.getOriginalSelectedChildSize());
            sb.append(", useCase: ");
            sb.append(useCase);
            androidx.camera.core.Logger.d("VirtualCameraAdapter", sb.toString());
        }
        return hashMap;
    }

    final androidx.camera.core.processing.util.OutConfig Camera2StreamConfigurationMap(androidx.camera.core.UseCase useCase, androidx.camera.core.streamsharing.ResolutionsMerger resolutionsMerger, androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.processing.SurfaceEdge surfaceEdge, int i, boolean z, boolean z2) {
        int i2;
        int sensorRotationDegrees = cameraInternal.getCameraInfo().getSensorRotationDegrees(i);
        boolean isMirrored = androidx.camera.core.impl.utils.TransformUtils.isMirrored(surfaceEdge.getSensorToBufferTransform());
        androidx.camera.core.streamsharing.PreferredChildSize highSpeedVideoFpsRanges = resolutionsMerger.getHighSpeedVideoFpsRanges((androidx.camera.core.impl.UseCaseConfig) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor.get(useCase)), surfaceEdge.getCropRect(), androidx.camera.core.impl.utils.TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z);
        android.graphics.Rect cropRectBeforeScaling = highSpeedVideoFpsRanges.getCropRectBeforeScaling();
        android.util.Size childSizeToScale = highSpeedVideoFpsRanges.getChildSizeToScale();
        int within360 = androidx.camera.core.impl.utils.TransformUtils.within360((surfaceEdge.getRotationDegrees() + cameraInternal.getCameraInfo().getSensorRotationDegrees(((androidx.camera.core.impl.ImageOutputConfig) useCase.getCurrentConfig()).getTargetRotation(0))) - sensorRotationDegrees);
        boolean isMirroringRequired = z2 ? false : useCase.isMirroringRequired(cameraInternal) ^ isMirrored;
        if (useCase instanceof androidx.camera.core.Preview) {
            i2 = 1;
        } else {
            i2 = useCase instanceof androidx.camera.core.ImageCapture ? 4 : 2;
        }
        return androidx.camera.core.processing.util.OutConfig.of(i2, useCase instanceof androidx.camera.core.ImageCapture ? 256 : 34, cropRectBeforeScaling, androidx.camera.core.impl.utils.TransformUtils.rotateSize(childSizeToScale, within360), within360, isMirroringRequired);
    }

    final void getHighSpeedVideoSizes(java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> map, java.util.Map<androidx.camera.core.UseCase, android.util.Size> map2) {
        this.getHighSpeedVideoSizes.clear();
        this.getHighSpeedVideoSizes.putAll(map);
        for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.processing.SurfaceEdge> entry : this.getHighSpeedVideoSizes.entrySet()) {
            androidx.camera.core.UseCase key = entry.getKey();
            androidx.camera.core.processing.SurfaceEdge value = entry.getValue();
            key.setViewPortCropRect(value.getCropRect());
            key.setSensorToBufferTransformMatrix(value.getSensorToBufferTransform());
            androidx.camera.core.impl.StreamSpec.Builder builder = value.getStreamSpec().toBuilder();
            android.util.Size size = map2.get(key);
            if (size != null) {
                builder.setOriginalConfiguredResolution(size);
            }
            key.updateSuggestedStreamSpec(builder.build(), null);
            key.notifyState();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (((java.lang.Boolean) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.get(useCase))).booleanValue()) {
            return;
        }
        this.Camera2StreamConfigurationMap.put(useCase, java.lang.Boolean.TRUE);
        androidx.camera.core.impl.DeferrableSurface highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(useCase);
        if (highSpeedVideoFpsRangesFor != null) {
            androidx.camera.core.processing.SurfaceEdge surfaceEdge = (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes.get(useCase));
            androidx.camera.core.impl.SessionConfig sessionConfig = useCase.getSessionConfig();
            surfaceEdge.invalidate();
            try {
                surfaceEdge.setProvider(highSpeedVideoFpsRangesFor);
            } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
                if (sessionConfig.getErrorListener() != null) {
                    sessionConfig.getErrorListener().onError(sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            }
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (((java.lang.Boolean) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.get(useCase))).booleanValue()) {
            this.Camera2StreamConfigurationMap.put(useCase, java.lang.Boolean.FALSE);
            ((androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes.get(useCase))).disconnect();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (((java.lang.Boolean) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.get(useCase))).booleanValue()) {
            androidx.camera.core.processing.SurfaceEdge surfaceEdge = (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes.get(useCase));
            androidx.camera.core.impl.DeferrableSurface highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(useCase);
            if (highSpeedVideoFpsRangesFor != null) {
                androidx.camera.core.impl.SessionConfig sessionConfig = useCase.getSessionConfig();
                surfaceEdge.invalidate();
                try {
                    surfaceEdge.setProvider(highSpeedVideoFpsRangesFor);
                    return;
                } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
                    if (sessionConfig.getErrorListener() != null) {
                        sessionConfig.getErrorListener().onError(sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                        return;
                    }
                    return;
                }
            }
            surfaceEdge.disconnect();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.DeferrableSurface highSpeedVideoFpsRangesFor;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes.get(useCase));
        if (!((java.lang.Boolean) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.get(useCase))).booleanValue() || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(useCase)) == null) {
            return;
        }
        androidx.camera.core.impl.SessionConfig sessionConfig = useCase.getSessionConfig();
        surfaceEdge.invalidate();
        try {
            surfaceEdge.setProvider(highSpeedVideoFpsRangesFor);
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
            if (sessionConfig.getErrorListener() != null) {
                sessionConfig.getErrorListener().onError(sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    static int getHighResolutionOutputSizeshNQ4ISI(java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = java.lang.Math.max(i, it.next().getSurfaceOccupancyPriority(0));
        }
        return i;
    }

    private static androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoFpsRangesFor(androidx.camera.core.UseCase useCase) {
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces;
        if (useCase instanceof androidx.camera.core.ImageCapture) {
            surfaces = useCase.getSessionConfig().getSurfaces();
        } else {
            surfaces = useCase.getSessionConfig().getRepeatingCaptureConfig().getSurfaces();
        }
        androidx.core.util.Preconditions.checkState(surfaces.size() <= 1);
        if (surfaces.size() == 1) {
            return surfaces.get(0);
        }
        return null;
    }

    static class VirtualCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        private final java.lang.ref.WeakReference<androidx.camera.core.streamsharing.VirtualCameraAdapter> getHighSpeedVideoSizes;

        VirtualCameraCaptureCallback(androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter) {
            this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(virtualCameraAdapter);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            androidx.camera.core.streamsharing.VirtualCameraAdapter virtualCameraAdapter = this.getHighSpeedVideoSizes.get();
            if (virtualCameraAdapter != null) {
                java.util.Iterator<androidx.camera.core.UseCase> it = virtualCameraAdapter.getHighSpeedVideoFpsRanges.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.streamsharing.VirtualCameraAdapter.getHighResolutionOutputSizeshNQ4ISI(cameraCaptureResult, it.next().getSessionConfig(), i);
                }
            }
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult, androidx.camera.core.impl.SessionConfig sessionConfig, int i) {
        java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = sessionConfig.getRepeatingCameraCaptureCallbacks().iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(i, new androidx.camera.core.streamsharing.VirtualCameraCaptureResult(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), cameraCaptureResult));
        }
    }

    static android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRanges(java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            android.util.Range<java.lang.Integer> range2 = (android.util.Range) java.util.Objects.requireNonNull(it.next().getTargetFrameRate(range));
            if (androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range)) {
                range = range2;
            } else {
                try {
                    range = range.intersect(range2);
                } catch (java.lang.IllegalArgumentException unused) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: ");
                    sb.append(range);
                    sb.append(" <<>> ");
                    sb.append(range2);
                    androidx.camera.core.Logger.d("VirtualCameraAdapter", sb.toString());
                    return range.extend(range2);
                }
            }
        }
        return range;
    }
}

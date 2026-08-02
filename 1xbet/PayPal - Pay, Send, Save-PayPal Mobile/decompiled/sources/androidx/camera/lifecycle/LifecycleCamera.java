package androidx.camera.lifecycle;

/* loaded from: classes.dex */
public final class LifecycleCamera implements androidx.view.LifecycleObserver, androidx.camera.core.Camera {
    final androidx.camera.core.internal.CameraUseCaseAdapter getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.core.RotationProvider getHighSpeedVideoSizes;
    private final androidx.view.LifecycleOwner getHighSpeedVideoSizesFor;
    final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private volatile boolean Camera2StreamConfigurationMap = false;
    private boolean getInputFormats = false;
    private boolean getOutputMinFrameDuration = false;
    androidx.camera.core.SessionConfig getHighSpeedVideoFpsRanges = null;

    LifecycleCamera(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter, androidx.camera.core.RotationProvider rotationProvider) {
        this.getHighSpeedVideoSizesFor = lifecycleOwner;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraUseCaseAdapter;
        this.getHighSpeedVideoSizes = rotationProvider;
        if (lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onStart(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (!this.getInputFormats && !this.getOutputMinFrameDuration) {
                this.getHighResolutionOutputSizeshNQ4ISI.attachUseCases();
                this.Camera2StreamConfigurationMap = true;
            }
        }
    }

    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onStop(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (!this.getInputFormats && !this.getOutputMinFrameDuration) {
                this.getHighResolutionOutputSizeshNQ4ISI.detachUseCases();
                this.Camera2StreamConfigurationMap = false;
            }
        }
    }

    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = this.getHighResolutionOutputSizeshNQ4ISI;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void onResume(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighResolutionOutputSizeshNQ4ISI.setActiveResumingMode(true);
    }

    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public final void onPause(androidx.view.LifecycleOwner lifecycleOwner) {
        this.getHighResolutionOutputSizeshNQ4ISI.setActiveResumingMode(false);
    }

    public final void suspend() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getInputFormats) {
                return;
            }
            onStop(this.getHighSpeedVideoSizesFor);
            this.getInputFormats = true;
        }
    }

    public final void unsuspend() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getInputFormats) {
                this.getInputFormats = false;
                if (this.getHighSpeedVideoSizesFor.getLifecycle().getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    onStart(this.getHighSpeedVideoSizesFor);
                }
            }
        }
    }

    public final boolean isActive() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            z = this.Camera2StreamConfigurationMap;
        }
        return z;
    }

    public final boolean isBound(androidx.camera.core.UseCase useCase) {
        boolean contains;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            contains = this.getHighResolutionOutputSizeshNQ4ISI.getUseCases().contains(useCase);
        }
        return contains;
    }

    public final boolean isBound(androidx.camera.core.SessionConfig sessionConfig) {
        boolean z;
        androidx.core.util.Preconditions.checkState(!sessionConfig.getIsLegacy());
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            z = this.getHighSpeedVideoFpsRanges == sessionConfig;
        }
        return z;
    }

    public final java.util.List<androidx.camera.core.UseCase> getUseCases() {
        java.util.List<androidx.camera.core.UseCase> unmodifiableList;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            unmodifiableList = java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI.getUseCases());
        }
        return unmodifiableList;
    }

    public final androidx.view.LifecycleOwner getLifecycleOwner() {
        androidx.view.LifecycleOwner lifecycleOwner;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            lifecycleOwner = this.getHighSpeedVideoSizesFor;
        }
        return lifecycleOwner;
    }

    public final androidx.camera.core.internal.CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup, androidx.camera.core.SessionConfig sessionConfig) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (resolvedFeatureGroup != null) {
            hashSet.addAll(resolvedFeatureGroup.getFeatures());
        }
        sessionConfig.getFeatureSelectionListener().accept(hashSet);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.camera.core.UseCase> list, androidx.camera.core.RotationProvider rotationProvider) {
        for (androidx.camera.core.UseCase useCase : list) {
            if (useCase.isAutoRotationSupported()) {
                useCase.setRotationProvider(rotationProvider);
            }
        }
    }

    final boolean getHighSpeedVideoFpsRanges() {
        boolean isLegacy;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.core.SessionConfig sessionConfig = this.getHighSpeedVideoFpsRanges;
            isLegacy = sessionConfig == null ? false : sessionConfig.getIsLegacy();
        }
        return isLegacy;
    }

    final void Camera2StreamConfigurationMap(androidx.camera.core.SessionConfig sessionConfig) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.core.SessionConfig sessionConfig2 = this.getHighSpeedVideoFpsRanges;
            if (sessionConfig2 != null && sessionConfig2.getIsLegacy() == sessionConfig.getIsLegacy()) {
                if (!this.getHighSpeedVideoFpsRanges.getIsLegacy() && !sessionConfig.getIsLegacy()) {
                    if (this.getHighSpeedVideoFpsRanges != sessionConfig) {
                        return;
                    } else {
                        this.getHighSpeedVideoFpsRanges = null;
                    }
                } else if (this.getHighSpeedVideoFpsRanges.getIsLegacy() && sessionConfig.getIsLegacy()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges.getUseCases());
                    arrayList.removeAll(sessionConfig.getUseCases());
                    this.getHighSpeedVideoFpsRanges = arrayList.isEmpty() ? null : new androidx.camera.core.LegacySessionConfig(arrayList, this.getHighSpeedVideoFpsRanges.getViewPort(), this.getHighSpeedVideoFpsRanges.getEffects());
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(sessionConfig.getUseCases());
                arrayList2.retainAll(this.getHighResolutionOutputSizeshNQ4ISI.getUseCases());
                this.getHighResolutionOutputSizeshNQ4ISI.removeUseCases(arrayList2);
                getHighResolutionOutputSizeshNQ4ISI(arrayList2, null);
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            java.util.List<androidx.camera.core.UseCase> useCases = this.getHighResolutionOutputSizeshNQ4ISI.getUseCases();
            this.getHighResolutionOutputSizeshNQ4ISI.removeUseCases(useCases);
            getHighResolutionOutputSizeshNQ4ISI(useCases, null);
            this.getHighSpeedVideoFpsRanges = null;
        }
    }

    @Override // androidx.camera.core.Camera
    public final androidx.camera.core.CameraControl getCameraControl() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public final androidx.camera.core.CameraInfo getCameraInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCameraInfo();
    }

    @Override // androidx.camera.core.Camera
    /* renamed from: getExtendedConfig */
    public final androidx.camera.core.impl.CameraConfig getGetOutputFormats() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputFormats();
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(boolean z, androidx.camera.core.UseCase... useCaseArr) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isUseCasesCombinationSupported(z, useCaseArr);
    }
}

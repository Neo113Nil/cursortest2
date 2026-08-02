package androidx.camera.core.internal;

/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements androidx.camera.core.Camera {
    private androidx.camera.core.ViewPort ArtificialStackFrames;
    private final androidx.camera.core.concurrent.CameraCoordinator Camera2StreamConfigurationMap;
    private final java.util.List<androidx.camera.core.UseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.CameraIdentifier getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.CameraConfig getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private final androidx.camera.core.impl.AdapterCameraInternal getHighSpeedVideoSizesFor;
    private final java.util.List<androidx.camera.core.UseCase> getInputFormats;
    private android.util.Range<java.lang.Integer> getInputSizeshNQ4ISI;
    private java.util.List<androidx.camera.core.CameraEffect> getOutputFormats;
    private final androidx.camera.core.CompositionSettings getOutputMinFrameDuration;
    private final java.lang.Object getOutputMinFrameDurationlomOqCM;
    private androidx.camera.core.UseCase getOutputSizes;
    private androidx.camera.core.impl.Config getOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.AdapterCameraInternal getOutputStallDuration;
    private final androidx.camera.core.CompositionSettings getOutputStallDurationlomOqCM;
    private final androidx.camera.core.impl.UseCaseConfigFactory getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private final androidx.camera.core.internal.StreamSpecsCalculator isOutputSupportedForhNQ4ISI;
    private final androidx.camera.core.internal.compat.workaround.StreamSharingForceEnabler toString;
    private androidx.camera.core.streamsharing.StreamSharing unwrapAs;

    public CameraUseCaseAdapter(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        this(cameraInternal, null, new androidx.camera.core.impl.AdapterCameraInfo(cameraInternal.getCamera2StreamConfigurationMap(), androidx.camera.core.impl.CameraConfigs.defaultConfig()), null, androidx.camera.core.CompositionSettings.DEFAULT, androidx.camera.core.CompositionSettings.DEFAULT, cameraCoordinator, streamSpecsCalculator, useCaseConfigFactory);
    }

    public CameraUseCaseAdapter(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo, androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo2, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getInputFormats = new java.util.ArrayList();
        this.getOutputFormats = java.util.Collections.emptyList();
        this.isOutputSupportedFor = 0;
        this.getInputSizeshNQ4ISI = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        this.getOutputMinFrameDurationlomOqCM = new java.lang.Object();
        this.getHighSpeedVideoSizes = true;
        this.getOutputSizeshNQ4ISI = null;
        this.toString = new androidx.camera.core.internal.compat.workaround.StreamSharingForceEnabler();
        this.getHighSpeedVideoFpsRangesFor = adapterCameraInfo.getCameraConfig();
        this.getHighSpeedVideoSizesFor = new androidx.camera.core.impl.AdapterCameraInternal(cameraInternal, adapterCameraInfo);
        if (cameraInternal2 != null && adapterCameraInfo2 != null) {
            this.getOutputStallDuration = new androidx.camera.core.impl.AdapterCameraInternal(cameraInternal2, adapterCameraInfo2);
        } else {
            this.getOutputStallDuration = null;
        }
        this.getOutputMinFrameDuration = compositionSettings;
        this.getOutputStallDurationlomOqCM = compositionSettings2;
        this.Camera2StreamConfigurationMap = cameraCoordinator;
        this.getValidOutputFormatsForInputhNQ4ISI = useCaseConfigFactory;
        this.getHighSpeedVideoFpsRanges = androidx.camera.core.CameraIdentifier.Factory.fromAdapterInfos(adapterCameraInfo, adapterCameraInfo2);
        this.isOutputSupportedForhNQ4ISI = streamSpecsCalculator;
    }

    public final androidx.camera.core.CameraIdentifier getAdapterIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isEquivalent(androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        return getAdapterIdentifier().equals(cameraUseCaseAdapter.getAdapterIdentifier());
    }

    public final void setViewPort(androidx.camera.core.ViewPort viewPort) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.ArtificialStackFrames = viewPort;
        }
    }

    public final void setEffects(java.util.List<androidx.camera.core.CameraEffect> list) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.getOutputFormats = list;
        }
    }

    public final androidx.camera.core.ViewPort getViewPort() {
        androidx.camera.core.ViewPort viewPort;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            viewPort = this.ArtificialStackFrames;
        }
        return viewPort;
    }

    public final java.util.List<androidx.camera.core.CameraEffect> getEffects() {
        java.util.List<androidx.camera.core.CameraEffect> list;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            list = this.getOutputFormats;
        }
        return list;
    }

    public final void setSessionType(int i) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.isOutputSupportedFor = i;
        }
    }

    public final int getSessionType() {
        int i;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            i = this.isOutputSupportedFor;
        }
        return i;
    }

    public final void setFrameRate(android.util.Range<java.lang.Integer> range) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.getInputSizeshNQ4ISI = range;
        }
    }

    public final android.util.Range<java.lang.Integer> getFrameRate() {
        android.util.Range<java.lang.Integer> range;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            range = this.getInputSizeshNQ4ISI;
        }
        return range;
    }

    public final void addUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        addUseCases(collection, null);
    }

    public final void addUseCases(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("addUseCases: appUseCasesToAdd = ");
        sb.append(collection);
        sb.append(", featureGroup = ");
        sb.append(resolvedFeatureGroup);
        androidx.camera.core.Logger.d("CameraUseCaseAdapter", sb.toString());
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.getHighSpeedVideoSizesFor.setExtendedConfig(this.getHighSpeedVideoFpsRangesFor);
            androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
            if (adapterCameraInternal != null) {
                adapterCameraInternal.setExtendedConfig(this.getHighSpeedVideoFpsRangesFor);
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.getHighResolutionOutputSizeshNQ4ISI);
            linkedHashSet.addAll(collection);
            java.util.Map<androidx.camera.core.UseCase, java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(linkedHashSet, resolvedFeatureGroup);
            try {
                Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor((java.util.Collection<androidx.camera.core.UseCase>) linkedHashSet, this.getOutputStallDuration != null, false));
            } catch (java.lang.IllegalArgumentException e) {
                getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges);
                throw new androidx.camera.core.internal.CameraUseCaseAdapter.CameraException(e);
            }
        }
    }

    public final androidx.camera.core.internal.CalculatedUseCaseInfo simulateAddUseCases(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup, boolean z) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        androidx.camera.core.internal.CalculatedUseCaseInfo highSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("simulateAddUseCases: appUseCasesToAdd = ");
        sb.append(collection);
        sb.append(", featureGroup = ");
        sb.append(resolvedFeatureGroup);
        androidx.camera.core.Logger.d("CameraUseCaseAdapter", sb.toString());
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.getHighSpeedVideoSizesFor.setExtendedConfig(this.getHighSpeedVideoFpsRangesFor);
            androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
            if (adapterCameraInternal != null) {
                adapterCameraInternal.setExtendedConfig(this.getHighSpeedVideoFpsRangesFor);
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.getHighResolutionOutputSizeshNQ4ISI);
            linkedHashSet.addAll(collection);
            java.util.Map<androidx.camera.core.UseCase, java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(linkedHashSet, resolvedFeatureGroup);
            try {
                try {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(linkedHashSet, this.getOutputStallDuration != null, z);
                } catch (java.lang.IllegalArgumentException e) {
                    throw new androidx.camera.core.internal.CameraUseCaseAdapter.CameraException(e);
                }
            } finally {
                getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges);
            }
        }
        return highSpeedVideoFpsRangesFor;
    }

    public final void removeUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            java.util.Iterator<androidx.camera.core.UseCase> it = collection.iterator();
            while (it.hasNext()) {
                it.next().setFeatureGroup(null);
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.getHighResolutionOutputSizeshNQ4ISI);
            linkedHashSet.removeAll(collection);
            Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor((java.util.Collection<androidx.camera.core.UseCase>) linkedHashSet, this.getOutputStallDuration != null, false));
        }
    }

    public final void removeAllUseCases() {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            removeUseCases(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    private void Camera2StreamConfigurationMap(androidx.camera.core.internal.CalculatedUseCaseInfo calculatedUseCaseInfo) {
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> streamSpecs = calculatedUseCaseInfo.getPrimaryStreamSpecResult().getStreamSpecs();
        java.util.Collection<androidx.camera.core.UseCase> cameraUseCases = calculatedUseCaseInfo.getCameraUseCases();
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            if (this.ArtificialStackFrames != null && !cameraUseCases.isEmpty()) {
                java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects = androidx.camera.core.internal.ViewPorts.calculateViewPortRects(this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap().getSensorRect(), this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap().getLensFacing() == 0, this.ArtificialStackFrames.getAspectRatio(), this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap().getSensorRotationDegrees(this.ArtificialStackFrames.getRotation()), this.ArtificialStackFrames.getScaleType(), this.ArtificialStackFrames.getLayoutDirection(), streamSpecs);
                for (androidx.camera.core.UseCase useCase : cameraUseCases) {
                    useCase.setViewPortCropRect((android.graphics.Rect) androidx.core.util.Preconditions.checkNotNull(calculateViewPortRects.get(useCase)));
                }
            }
            for (androidx.camera.core.UseCase useCase2 : cameraUseCases) {
                android.graphics.Rect sensorRect = this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap().getSensorRect();
                android.util.Size resolution = ((androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(streamSpecs.get(useCase2))).getResolution();
                androidx.core.util.Preconditions.checkArgument(sensorRect.width() > 0 && sensorRect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
                android.graphics.RectF rectF = new android.graphics.RectF(sensorRect);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, resolution.getWidth(), resolution.getHeight()), rectF, android.graphics.Matrix.ScaleToFit.CENTER);
                matrix.invert(matrix);
                useCase2.setSensorToBufferTransformMatrix(matrix);
            }
        }
        java.util.List<androidx.camera.core.CameraEffect> list = this.getOutputFormats;
        java.util.Collection<androidx.camera.core.UseCase> cameraUseCases2 = calculatedUseCaseInfo.getCameraUseCases();
        java.util.Collection<androidx.camera.core.UseCase> appUseCases = calculatedUseCaseInfo.getAppUseCases();
        java.util.List<androidx.camera.core.CameraEffect> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list, cameraUseCases2);
        java.util.ArrayList arrayList = new java.util.ArrayList(appUseCases);
        arrayList.removeAll(cameraUseCases2);
        java.util.List<androidx.camera.core.CameraEffect> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, arrayList);
        if (!highResolutionOutputSizeshNQ4ISI2.isEmpty()) {
            androidx.camera.core.Logger.w("CameraUseCaseAdapter", "Unused effects: ".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI2)));
        }
        java.util.Iterator<androidx.camera.core.UseCase> it = calculatedUseCaseInfo.getCameraUseCasesToDetach().iterator();
        while (it.hasNext()) {
            it.next().unbindFromCamera(this.getHighSpeedVideoSizesFor);
        }
        this.getHighSpeedVideoSizesFor.detachUseCases(calculatedUseCaseInfo.getCameraUseCasesToDetach());
        if (this.getOutputStallDuration != null) {
            java.util.Iterator<androidx.camera.core.UseCase> it2 = calculatedUseCaseInfo.getCameraUseCasesToDetach().iterator();
            while (it2.hasNext()) {
                it2.next().unbindFromCamera((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(this.getOutputStallDuration));
            }
            ((androidx.camera.core.impl.AdapterCameraInternal) java.util.Objects.requireNonNull(this.getOutputStallDuration)).detachUseCases(calculatedUseCaseInfo.getCameraUseCasesToDetach());
        }
        if (calculatedUseCaseInfo.getCameraUseCasesToDetach().isEmpty()) {
            for (androidx.camera.core.UseCase useCase3 : calculatedUseCaseInfo.getCameraUseCasesToKeep()) {
                java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> streamSpecs2 = calculatedUseCaseInfo.getPrimaryStreamSpecResult().getStreamSpecs();
                if (streamSpecs2.containsKey(useCase3)) {
                    androidx.camera.core.impl.StreamSpec streamSpec = streamSpecs2.get(useCase3);
                    androidx.camera.core.impl.Config implementationOptions = ((androidx.camera.core.impl.StreamSpec) java.util.Objects.requireNonNull(streamSpec)).getImplementationOptions();
                    if (implementationOptions != null) {
                        androidx.camera.core.impl.SessionConfig sessionConfig = useCase3.getSessionConfig();
                        androidx.camera.core.impl.Config implementationOptions2 = streamSpec.getImplementationOptions();
                        androidx.camera.core.impl.Config implementationOptions3 = sessionConfig.getImplementationOptions();
                        if (((androidx.camera.core.impl.Config) java.util.Objects.requireNonNull(implementationOptions2)).listOptions().size() == sessionConfig.getImplementationOptions().listOptions().size()) {
                            for (androidx.camera.core.impl.Config.Option<?> option : implementationOptions2.listOptions()) {
                                if (implementationOptions3.containsOption(option) && java.util.Objects.equals(implementationOptions3.retrieveOption(option), implementationOptions2.retrieveOption(option))) {
                                }
                            }
                        }
                        useCase3.updateSuggestedStreamSpecImplementationOptions(implementationOptions);
                        if (this.getHighSpeedVideoSizes) {
                            this.getHighSpeedVideoSizesFor.onUseCaseUpdated(useCase3);
                            androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
                            if (adapterCameraInternal != null) {
                                ((androidx.camera.core.impl.AdapterCameraInternal) java.util.Objects.requireNonNull(adapterCameraInternal)).onUseCaseUpdated(useCase3);
                            }
                        }
                    }
                }
            }
        }
        for (androidx.camera.core.UseCase useCase4 : calculatedUseCaseInfo.getCameraUseCasesToAttach()) {
            androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = (androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair) java.util.Objects.requireNonNull(calculatedUseCaseInfo.getUseCaseConfigs().get(useCase4));
            androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal2 = this.getOutputStallDuration;
            if (adapterCameraInternal2 != null) {
                useCase4.bindToCamera(this.getHighSpeedVideoSizesFor, (androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(adapterCameraInternal2), configPair.Camera2StreamConfigurationMap, configPair.getHighSpeedVideoFpsRanges);
                useCase4.updateSuggestedStreamSpec((androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(calculatedUseCaseInfo.getPrimaryStreamSpecResult().getStreamSpecs().get(useCase4)), ((androidx.camera.core.internal.StreamSpecQueryResult) androidx.core.util.Preconditions.checkNotNull(calculatedUseCaseInfo.getSecondaryStreamSpecResult())).getStreamSpecs().get(useCase4));
            } else {
                useCase4.bindToCamera(this.getHighSpeedVideoSizesFor, null, configPair.Camera2StreamConfigurationMap, configPair.getHighSpeedVideoFpsRanges);
                useCase4.updateSuggestedStreamSpec((androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(calculatedUseCaseInfo.getPrimaryStreamSpecResult().getStreamSpecs().get(useCase4)), null);
            }
        }
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizesFor.attachUseCases(calculatedUseCaseInfo.getCameraUseCasesToAttach());
            androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal3 = this.getOutputStallDuration;
            if (adapterCameraInternal3 != null) {
                ((androidx.camera.core.impl.AdapterCameraInternal) java.util.Objects.requireNonNull(adapterCameraInternal3)).attachUseCases(calculatedUseCaseInfo.getCameraUseCasesToAttach());
            }
        }
        java.util.Iterator<androidx.camera.core.UseCase> it3 = calculatedUseCaseInfo.getCameraUseCasesToAttach().iterator();
        while (it3.hasNext()) {
            it3.next().notifyState();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.addAll(calculatedUseCaseInfo.getAppUseCases());
        this.getInputFormats.clear();
        this.getInputFormats.addAll(calculatedUseCaseInfo.getCameraUseCases());
        this.getOutputSizes = calculatedUseCaseInfo.getPlaceholderForExtensions();
        this.unwrapAs = calculatedUseCaseInfo.getStreamSharing();
    }

    private static java.util.Map<androidx.camera.core.UseCase, java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> getHighSpeedVideoFpsRanges(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : collection) {
            hashMap.put(useCase, useCase.getFeatureGroup());
            useCase.setFeatureGroup(resolvedFeatureGroup != null ? resolvedFeatureGroup.getFeatures() : null);
        }
        return hashMap;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.Map<androidx.camera.core.UseCase, java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> map) {
        for (java.util.Map.Entry<androidx.camera.core.UseCase, java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> entry : map.entrySet()) {
            entry.getKey().setFeatureGroup(entry.getValue());
        }
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            return this.Camera2StreamConfigurationMap.getCameraOperatingMode() == 2 ? 1 : 0;
        }
    }

    private boolean getHighSpeedVideoSizes() {
        boolean z;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            z = this.getHighSpeedVideoFpsRangesFor.getSessionProcessor(null) != null;
        }
        return z;
    }

    private int getHighSpeedVideoFpsRanges(boolean z) {
        int targets;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            java.util.Iterator<androidx.camera.core.CameraEffect> it = this.getOutputFormats.iterator();
            androidx.camera.core.CameraEffect cameraEffect = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.CameraEffect next = it.next();
                if (androidx.camera.core.processing.TargetUtils.getNumberOfTargets(next.getTargets()) > 1) {
                    androidx.core.util.Preconditions.checkState(cameraEffect == null, "Can only have one sharing effect.");
                    cameraEffect = next;
                }
            }
            targets = cameraEffect != null ? cameraEffect.getTargets() : 0;
            if (z) {
                targets |= 3;
            }
        }
        return targets;
    }

    private androidx.camera.core.streamsharing.StreamSharing getHighSpeedVideoFpsRangesFor(java.util.Collection<androidx.camera.core.UseCase> collection, boolean z) {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            java.util.HashSet<androidx.camera.core.UseCase> hashSet = new java.util.HashSet();
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(z);
            for (androidx.camera.core.UseCase useCase : collection) {
                androidx.core.util.Preconditions.checkArgument(true ^ androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase), "Only support one level of sharing for now.");
                if (useCase.isEffectTargetsSupported(highSpeedVideoFpsRanges)) {
                    hashSet.add(useCase);
                }
            }
            if (hashSet.size() < 2 && (!getHighSpeedVideoSizes() || !androidx.camera.core.impl.utils.UseCaseUtil.containsVideoCapture(hashSet))) {
                return null;
            }
            androidx.camera.core.streamsharing.StreamSharing streamSharing = this.unwrapAs;
            if (streamSharing != null && streamSharing.getChildren().equals(hashSet)) {
                this.unwrapAs.updateFeatureGroup(hashSet);
                return (androidx.camera.core.streamsharing.StreamSharing) java.util.Objects.requireNonNull(this.unwrapAs);
            }
            int[] iArr = {1, 2, 4};
            java.util.HashSet hashSet2 = new java.util.HashSet();
            for (androidx.camera.core.UseCase useCase2 : hashSet) {
                for (int i = 0; i < 3; i++) {
                    int i2 = iArr[i];
                    if (useCase2.isEffectTargetsSupported(i2)) {
                        if (hashSet2.contains(java.lang.Integer.valueOf(i2))) {
                            return null;
                        }
                        hashSet2.add(java.lang.Integer.valueOf(i2));
                    }
                }
            }
            return new androidx.camera.core.streamsharing.StreamSharing(this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM, hashSet, this.getValidOutputFormatsForInputhNQ4ISI);
        }
    }

    private static java.util.Collection<androidx.camera.core.UseCase> getHighSpeedVideoFpsRangesFor(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.UseCase useCase, androidx.camera.core.streamsharing.StreamSharing streamSharing) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (useCase != null) {
            arrayList.add(useCase);
        }
        if (streamSharing != null) {
            arrayList.add(streamSharing);
            arrayList.removeAll(streamSharing.getChildren());
        }
        return arrayList;
    }

    public final java.util.List<androidx.camera.core.UseCase> getUseCases() {
        java.util.ArrayList arrayList;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return arrayList;
    }

    public final java.util.Collection<androidx.camera.core.UseCase> getCameraUseCases() {
        java.util.ArrayList arrayList;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            arrayList = new java.util.ArrayList(this.getInputFormats);
        }
        return arrayList;
    }

    public final void attachUseCases() {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            if (!this.getHighSpeedVideoSizes) {
                if (!this.getInputFormats.isEmpty()) {
                    this.getHighSpeedVideoSizesFor.setExtendedConfig(this.getHighSpeedVideoFpsRangesFor);
                    androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
                    if (adapterCameraInternal != null) {
                        adapterCameraInternal.setExtendedConfig(this.getHighSpeedVideoFpsRangesFor);
                    }
                }
                this.getHighSpeedVideoSizesFor.attachUseCases(this.getInputFormats);
                androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal2 = this.getOutputStallDuration;
                if (adapterCameraInternal2 != null) {
                    adapterCameraInternal2.attachUseCases(this.getInputFormats);
                }
                synchronized (this.getOutputMinFrameDurationlomOqCM) {
                    if (this.getOutputSizeshNQ4ISI != null) {
                        this.getHighSpeedVideoSizesFor.getGetHighSpeedVideoFpsRangesFor().addInteropConfig(this.getOutputSizeshNQ4ISI);
                    }
                }
                java.util.Iterator<androidx.camera.core.UseCase> it = this.getInputFormats.iterator();
                while (it.hasNext()) {
                    it.next().notifyState();
                }
                this.getHighSpeedVideoSizes = true;
            }
        }
    }

    public final void setActiveResumingMode(boolean z) {
        this.getHighSpeedVideoSizesFor.setActiveResumingMode(z);
    }

    public final void detachUseCases() {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizesFor.detachUseCases(new java.util.ArrayList(this.getInputFormats));
                androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
                if (adapterCameraInternal != null) {
                    adapterCameraInternal.detachUseCases(new java.util.ArrayList(this.getInputFormats));
                }
                synchronized (this.getOutputMinFrameDurationlomOqCM) {
                    androidx.camera.core.impl.CameraControlInternal getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor.getGetHighSpeedVideoFpsRangesFor();
                    this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor.getInteropConfig();
                    getHighSpeedVideoFpsRangesFor.clearInteropConfig();
                }
                this.getHighSpeedVideoSizes = false;
            }
        }
    }

    private static java.util.List<androidx.camera.core.CameraEffect> getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.camera.core.CameraEffect> list, java.util.Collection<androidx.camera.core.UseCase> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (androidx.camera.core.UseCase useCase : collection) {
            useCase.setEffect(null);
            for (androidx.camera.core.CameraEffect cameraEffect : list) {
                if (useCase.isEffectTargetsSupported(cameraEffect.getTargets())) {
                    boolean z = useCase.getEffect() == null;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(useCase);
                    sb.append(" already has effect");
                    sb.append(useCase.getEffect());
                    androidx.core.util.Preconditions.checkState(z, sb.toString());
                    useCase.setEffect(cameraEffect);
                    arrayList.remove(cameraEffect);
                }
            }
        }
        return arrayList;
    }

    /* loaded from: classes6.dex */
    public static class ConfigPair {
        androidx.camera.core.impl.UseCaseConfig<?> Camera2StreamConfigurationMap;
        androidx.camera.core.impl.UseCaseConfig<?> getHighSpeedVideoFpsRanges;

        ConfigPair(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2) {
            this.Camera2StreamConfigurationMap = useCaseConfig;
            this.getHighSpeedVideoFpsRanges = useCaseConfig2;
        }
    }

    static java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> getHighResolutionOutputSizeshNQ4ISI(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory2, int i, android.util.Range<java.lang.Integer> range) {
        androidx.camera.core.impl.UseCaseConfig<?> defaultConfig;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : collection) {
            if (androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase)) {
                defaultConfig = getHighSpeedVideoFpsRangesFor(useCaseConfigFactory, (androidx.camera.core.streamsharing.StreamSharing) useCase);
            } else {
                defaultConfig = useCase.getDefaultConfig(false, useCaseConfigFactory);
            }
            hashMap.put(useCase, new androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair(defaultConfig, getHighResolutionOutputSizeshNQ4ISI(useCase, useCase.getDefaultConfig(true, useCaseConfigFactory2), i, range)));
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    private static androidx.camera.core.impl.UseCaseConfig<?> getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.UseCase useCase, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, int i, android.util.Range<java.lang.Integer> range) {
        androidx.camera.core.impl.MutableOptionsBundle from = useCaseConfig != null ? androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) useCaseConfig) : androidx.camera.core.impl.MutableOptionsBundle.create();
        from.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_TYPE, java.lang.Integer.valueOf(i));
        if (!androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range)) {
            from.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE, androidx.camera.core.impl.Config.OptionPriority.HIGH_PRIORITY_REQUIRED, range);
            from.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_IS_STRICT_FRAME_RATE_REQUIRED, java.lang.Boolean.TRUE);
        }
        return useCase.getUseCaseConfigBuilder(from).getUseCaseConfig();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    private static androidx.camera.core.impl.UseCaseConfig<?> getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.streamsharing.StreamSharing streamSharing) {
        androidx.camera.core.impl.UseCaseConfig<?> defaultConfig = new androidx.camera.core.Preview.Builder().build().getDefaultConfig(false, useCaseConfigFactory);
        if (defaultConfig == null) {
            return null;
        }
        androidx.camera.core.impl.MutableOptionsBundle from = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) defaultConfig);
        from.removeOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS);
        return streamSharing.getUseCaseConfigBuilder(from).getUseCaseConfig();
    }

    private static boolean Camera2StreamConfigurationMap(java.util.Collection<androidx.camera.core.UseCase> collection) {
        for (androidx.camera.core.UseCase useCase : collection) {
            if (useCase instanceof androidx.camera.core.ImageCapture) {
                androidx.camera.core.impl.UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
                if (currentConfig.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT) && ((java.lang.Integer) androidx.core.util.Preconditions.checkNotNull((java.lang.Integer) currentConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class CameraException extends java.lang.Exception {
        public CameraException() {
        }

        public CameraException(java.lang.String str) {
            super(str);
        }

        public CameraException(java.lang.Throwable th) {
            super(th);
        }
    }

    @Override // androidx.camera.core.Camera
    public final androidx.camera.core.CameraControl getCameraControl() {
        return this.getHighSpeedVideoSizesFor.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public final androidx.camera.core.CameraInfo getCameraInfo() {
        return this.getHighSpeedVideoSizesFor.getCameraInfo();
    }

    public final androidx.camera.core.CameraInfo getSecondaryCameraInfo() {
        androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
        if (adapterCameraInternal != null) {
            return adapterCameraInternal.getCameraInfo();
        }
        return null;
    }

    @Override // androidx.camera.core.Camera
    /* renamed from: getExtendedConfig */
    public final androidx.camera.core.impl.CameraConfig getGetOutputFormats() {
        androidx.camera.core.impl.CameraConfig cameraConfig;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            cameraConfig = this.getHighSpeedVideoFpsRangesFor;
        }
        return cameraConfig;
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(boolean z, androidx.camera.core.UseCase... useCaseArr) {
        boolean isUseCaseCombinationSupported;
        java.util.Collection<androidx.camera.core.UseCase> asList = java.util.Arrays.asList(useCaseArr);
        if (z) {
            try {
                asList = getHighSpeedVideoFpsRangesFor(asList, (androidx.camera.core.UseCase) null, getHighSpeedVideoFpsRangesFor(asList, true));
            } catch (java.lang.IllegalArgumentException e) {
                androidx.camera.core.Logger.d("CameraUseCaseAdapter", "Unable to apply StreamSharing", e);
                return false;
            }
        }
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            isUseCaseCombinationSupported = this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap().isUseCaseCombinationSupported(new java.util.ArrayList(asList), getHighResolutionOutputSizeshNQ4ISI(), false, this.getHighSpeedVideoFpsRangesFor);
        }
        return isUseCaseCombinationSupported;
    }

    private androidx.camera.core.UseCase getHighSpeedVideoFpsRanges(java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.streamsharing.StreamSharing streamSharing) {
        androidx.camera.core.UseCase useCase;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            java.util.ArrayList<androidx.camera.core.UseCase> arrayList = new java.util.ArrayList(collection);
            if (streamSharing != null) {
                arrayList.add(streamSharing);
                arrayList.removeAll(streamSharing.getChildren());
            }
            if (getHighSpeedVideoFpsRanges()) {
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (androidx.camera.core.UseCase useCase2 : arrayList) {
                    if ((useCase2 instanceof androidx.camera.core.Preview) || androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase2)) {
                        z3 = true;
                    } else if (useCase2 instanceof androidx.camera.core.ImageCapture) {
                        z2 = true;
                    }
                }
                if (z2 && !z3) {
                    androidx.camera.core.UseCase useCase3 = this.getOutputSizes;
                    if (useCase3 instanceof androidx.camera.core.Preview) {
                        useCase = useCase3;
                    } else {
                        androidx.camera.core.Preview build = new androidx.camera.core.Preview.Builder().setTargetName("Preview-Extra").build();
                        build.setSurfaceProvider(new androidx.camera.core.Preview.SurfaceProvider() { // from class: androidx.camera.core.internal.CameraUseCaseAdapter$$ExternalSyntheticLambda1
                            @Override // androidx.camera.core.Preview.SurfaceProvider
                            public final void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest) {
                                androidx.camera.core.internal.CameraUseCaseAdapter.Camera2StreamConfigurationMap(surfaceRequest);
                            }
                        });
                        useCase = build;
                    }
                } else {
                    boolean z4 = false;
                    for (androidx.camera.core.UseCase useCase4 : arrayList) {
                        if ((useCase4 instanceof androidx.camera.core.Preview) || androidx.camera.core.streamsharing.StreamSharing.isStreamSharing(useCase4)) {
                            z = true;
                        } else if (useCase4 instanceof androidx.camera.core.ImageCapture) {
                            z4 = true;
                        }
                    }
                    if (z && !z4) {
                        androidx.camera.core.UseCase useCase5 = this.getOutputSizes;
                        useCase = useCase5 instanceof androidx.camera.core.ImageCapture ? useCase5 : new androidx.camera.core.ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
                    }
                }
            }
            useCase = null;
        }
        return useCase;
    }

    private boolean getHighSpeedVideoFpsRanges() {
        boolean z;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            z = this.getHighSpeedVideoFpsRangesFor.getUseCaseCombinationRequiredRule() == 1;
        }
        return z;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.camera.core.SurfaceRequest surfaceRequest) {
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), new androidx.core.util.Consumer() { // from class: androidx.camera.core.internal.CameraUseCaseAdapter$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.internal.CameraUseCaseAdapter.getHighSpeedVideoSizes(surface, surfaceTexture);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoSizes(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public final boolean isRemoved() {
        if (this.getHighSpeedVideoSizesFor.isRemoved()) {
            return true;
        }
        androidx.camera.core.impl.AdapterCameraInternal adapterCameraInternal = this.getOutputStallDuration;
        return adapterCameraInternal != null && adapterCameraInternal.isRemoved();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        throw new java.lang.IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        throw new java.lang.IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private androidx.camera.core.internal.CalculatedUseCaseInfo getHighSpeedVideoFpsRangesFor(java.util.Collection<androidx.camera.core.UseCase> collection, boolean z, boolean z2) throws java.lang.IllegalArgumentException {
        androidx.camera.core.streamsharing.StreamSharing highSpeedVideoFpsRangesFor;
        androidx.camera.core.UseCase highSpeedVideoFpsRanges;
        java.util.Collection<androidx.camera.core.UseCase> highSpeedVideoFpsRangesFor2;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> highResolutionOutputSizeshNQ4ISI;
        androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecs;
        androidx.camera.core.internal.StreamSpecQueryResult streamSpecQueryResult;
        boolean z3 = z;
        loop0: while (true) {
            if (getHighSpeedVideoSizes()) {
                java.util.Iterator<androidx.camera.core.UseCase> it = collection.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.DynamicRange dynamicRange = it.next().getCurrentConfig().getDynamicRange();
                    boolean z4 = dynamicRange.getBitDepth() == 10;
                    boolean z5 = (dynamicRange.getEncoding() == 1 || dynamicRange.getEncoding() == 0) ? false : true;
                    if (z4 || z5) {
                        break loop0;
                    }
                }
                if (Camera2StreamConfigurationMap(collection)) {
                    throw new java.lang.IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
                }
            }
            synchronized (this.getOutputMinFrameDurationlomOqCM) {
                if (!this.getOutputFormats.isEmpty()) {
                    java.util.Iterator<androidx.camera.core.UseCase> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            if (Camera2StreamConfigurationMap(collection)) {
                                break;
                            }
                        } else {
                            androidx.camera.core.UseCase next = it2.next();
                            if (next instanceof androidx.camera.core.ImageCapture) {
                                androidx.camera.core.impl.UseCaseConfig<?> currentConfig = next.getCurrentConfig();
                                if (currentConfig.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT) && ((java.lang.Integer) androidx.core.util.Preconditions.checkNotNull((java.lang.Integer) currentConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT))).intValue() == 1) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
            if (z3 || !((getHighSpeedVideoSizes() && androidx.camera.core.impl.utils.UseCaseUtil.containsVideoCapture(collection)) || this.toString.shouldForceEnableStreamSharing(this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap().getCameraId(), collection))) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(collection, z3);
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(collection, highSpeedVideoFpsRangesFor);
                highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(collection, highSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor);
                arrayList = new java.util.ArrayList(highSpeedVideoFpsRangesFor2);
                arrayList.removeAll(this.getInputFormats);
                arrayList2 = new java.util.ArrayList(highSpeedVideoFpsRangesFor2);
                arrayList2.retainAll(this.getInputFormats);
                arrayList3 = new java.util.ArrayList(this.getInputFormats);
                arrayList3.removeAll(highSpeedVideoFpsRangesFor2);
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(arrayList, this.getHighSpeedVideoFpsRangesFor.getUseCaseConfigFactory(), this.getValidOutputFormatsForInputhNQ4ISI, this.isOutputSupportedFor, this.getInputSizeshNQ4ISI);
                java.util.List[] listArr = {arrayList, arrayList2};
                boolean z6 = false;
                for (int i = 0; i < 2; i++) {
                    java.util.Iterator it3 = listArr[i].iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (((androidx.camera.core.UseCase) it3.next()).getFeatureGroup() != null) {
                            z6 = true;
                            break;
                        }
                    }
                    if (z6) {
                        break;
                    }
                }
                boolean z7 = z6;
                try {
                    calculateSuggestedStreamSpecs = this.isOutputSupportedForhNQ4ISI.calculateSuggestedStreamSpecs(getHighResolutionOutputSizeshNQ4ISI(), this.getHighSpeedVideoSizesFor.getCamera2StreamConfigurationMap(), arrayList, arrayList2, this.getHighSpeedVideoFpsRangesFor, this.isOutputSupportedFor, this.getInputSizeshNQ4ISI, z7, z2);
                    if (this.getOutputStallDuration == null) {
                        streamSpecQueryResult = null;
                        break;
                    }
                    streamSpecQueryResult = this.isOutputSupportedForhNQ4ISI.calculateSuggestedStreamSpecs(getHighResolutionOutputSizeshNQ4ISI(), ((androidx.camera.core.impl.AdapterCameraInternal) java.util.Objects.requireNonNull(this.getOutputStallDuration)).getCamera2StreamConfigurationMap(), arrayList, arrayList2, this.getHighSpeedVideoFpsRangesFor, this.isOutputSupportedFor, this.getInputSizeshNQ4ISI, z7, z2);
                    break;
                } catch (java.lang.IllegalArgumentException e) {
                    if (z3 || getHighSpeedVideoSizes() || this.getOutputStallDuration != null || this.isOutputSupportedFor == 1) {
                        throw e;
                    }
                    z3 = true;
                }
            } else {
                z3 = true;
            }
        }
        return new androidx.camera.core.internal.CalculatedUseCaseInfo(collection, highSpeedVideoFpsRangesFor2, arrayList, arrayList2, arrayList3, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI, calculateSuggestedStreamSpecs, streamSpecQueryResult);
    }
}

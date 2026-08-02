package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class UseCaseAttachState {
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    private final java.lang.String getHighSpeedVideoSizes;

    interface AttachStateFilter {
        boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo);
    }

    public UseCaseAttachState(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public final void setUseCaseActive(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        Camera2StreamConfigurationMap(str, sessionConfig, useCaseConfig, streamSpec, list).getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public final void setUseCaseInactive(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.Camera2StreamConfigurationMap.get(str);
            useCaseAttachInfo.getHighResolutionOutputSizeshNQ4ISI = false;
            if (useCaseAttachInfo.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.Camera2StreamConfigurationMap.remove(str);
        }
    }

    public final void setUseCaseAttached(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        Camera2StreamConfigurationMap(str, sessionConfig, useCaseConfig, streamSpec, list).getHighSpeedVideoFpsRangesFor = true;
        updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
    }

    public final void setUseCaseDetached(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.Camera2StreamConfigurationMap.get(str);
            useCaseAttachInfo.getHighSpeedVideoFpsRangesFor = false;
            if (useCaseAttachInfo.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.Camera2StreamConfigurationMap.remove(str);
        }
    }

    public final boolean isUseCaseAttached(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            return this.Camera2StreamConfigurationMap.get(str).getHighSpeedVideoFpsRangesFor;
        }
        return false;
    }

    public final java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> getAttachedUseCaseConfigs() {
        androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter = new androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda2
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                boolean z;
                z = useCaseAttachInfo.getHighSpeedVideoFpsRangesFor;
                return z;
            }
        };
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            if (attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getUseCaseConfig());
            }
        }
        return java.util.Collections.unmodifiableCollection(arrayList);
    }

    public final java.util.Collection<androidx.camera.core.impl.SessionConfig> getAttachedSessionConfigs() {
        return java.util.Collections.unmodifiableCollection(getHighResolutionOutputSizeshNQ4ISI(new androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                boolean z;
                z = useCaseAttachInfo.getHighSpeedVideoFpsRangesFor;
                return z;
            }
        }));
    }

    public final java.util.Collection<androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> getAttachedUseCaseInfo() {
        androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter = new androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                boolean z;
                z = useCaseAttachInfo.getHighSpeedVideoFpsRangesFor;
                return z;
            }
        };
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            if (attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return java.util.Collections.unmodifiableCollection(arrayList);
    }

    public final java.util.Collection<androidx.camera.core.impl.SessionConfig> getActiveAndAttachedSessionConfigs() {
        return java.util.Collections.unmodifiableCollection(getHighResolutionOutputSizeshNQ4ISI(new androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda3
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                return androidx.camera.core.impl.UseCaseAttachState.getHighResolutionOutputSizeshNQ4ISI(useCaseAttachInfo);
            }
        }));
    }

    public final void updateUseCase(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        if (this.Camera2StreamConfigurationMap.containsKey(str)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = new androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo(sessionConfig, useCaseConfig, streamSpec, list);
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = this.Camera2StreamConfigurationMap.get(str);
            useCaseAttachInfo.getHighSpeedVideoFpsRangesFor = useCaseAttachInfo2.getHighSpeedVideoFpsRangesFor;
            useCaseAttachInfo.getHighResolutionOutputSizeshNQ4ISI = useCaseAttachInfo2.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap.put(str, useCaseAttachInfo);
        }
    }

    public final void removeUseCase(java.lang.String str) {
        this.Camera2StreamConfigurationMap.remove(str);
    }

    public final androidx.camera.core.impl.SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo value = entry.getValue();
            if (value.getHighResolutionOutputSizeshNQ4ISI && value.getHighSpeedVideoFpsRangesFor) {
                java.lang.String key = entry.getKey();
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(key);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Active and attached use case: ");
        sb.append(arrayList);
        sb.append(" for camera: ");
        sb.append(this.getHighSpeedVideoSizes);
        androidx.camera.core.Logger.d("UseCaseAttachState", sb.toString());
        return validatingBuilder;
    }

    public final androidx.camera.core.impl.SessionConfig.ValidatingBuilder getAttachedBuilder() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo value = entry.getValue();
            if (value.getHighSpeedVideoFpsRangesFor) {
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(entry.getKey());
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("All use case: ");
        sb.append(arrayList);
        sb.append(" for camera: ");
        sb.append(this.getHighSpeedVideoSizes);
        androidx.camera.core.Logger.d("UseCaseAttachState", sb.toString());
        return validatingBuilder;
    }

    private androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo Camera2StreamConfigurationMap(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.Camera2StreamConfigurationMap.get(str);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = new androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo(sessionConfig, useCaseConfig, streamSpec, list);
        this.Camera2StreamConfigurationMap.put(str, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    private java.util.Collection<androidx.camera.core.impl.SessionConfig> getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            if (attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getSessionConfig());
            }
        }
        return arrayList;
    }

    public static final class UseCaseAttachInfo {
        private final androidx.camera.core.impl.StreamSpec Camera2StreamConfigurationMap;
        private final androidx.camera.core.impl.SessionConfig getHighSpeedVideoFpsRanges;
        private final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getHighSpeedVideoSizes;
        private final androidx.camera.core.impl.UseCaseConfig<?> getHighSpeedVideoSizesFor;
        boolean getHighSpeedVideoFpsRangesFor = false;
        boolean getHighResolutionOutputSizeshNQ4ISI = false;

        UseCaseAttachInfo(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
            this.getHighSpeedVideoFpsRanges = sessionConfig;
            this.getHighSpeedVideoSizesFor = useCaseConfig;
            this.Camera2StreamConfigurationMap = streamSpec;
            this.getHighSpeedVideoSizes = list;
        }

        public final androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final androidx.camera.core.impl.SessionConfig getSessionConfig() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final androidx.camera.core.impl.StreamSpec getStreamSpec() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UseCaseAttachInfo{mSessionConfig=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", mUseCaseConfig=");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append(", mStreamSpec=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", mCaptureTypes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", mAttached=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", mActive=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getHighResolutionOutputSizeshNQ4ISI && useCaseAttachInfo.getHighSpeedVideoFpsRangesFor;
    }
}

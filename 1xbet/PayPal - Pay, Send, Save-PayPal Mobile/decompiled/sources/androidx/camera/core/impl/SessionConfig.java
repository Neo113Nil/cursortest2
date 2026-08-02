package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class SessionConfig {
    public static final int DEFAULT_SESSION_TYPE = 0;
    public static final int SESSION_TYPE_HIGH_SPEED = 1;
    public static final int SESSION_TYPE_REGULAR = 0;
    private static final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges = java.util.Arrays.asList(1, 5, 3);
    private android.hardware.camera2.params.InputConfiguration Camera2StreamConfigurationMap;
    private final java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.SessionConfig.ErrorListener getHighSpeedVideoSizes;
    private final androidx.camera.core.impl.CaptureConfig getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getInputSizeshNQ4ISI;
    private final androidx.camera.core.impl.SessionConfig.OutputConfig getOutputFormats;
    private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> getOutputMinFrameDuration;

    public interface ErrorListener {
        void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError);
    }

    public interface OptionUnpacker {
        void unpack(android.util.Size size, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.SessionConfig.Builder builder);
    }

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static abstract class OutputConfig {
        public static final int SURFACE_GROUP_ID_NONE = -1;

        public static abstract class Builder {
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig build();

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setMirrorMode(int i);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setPhysicalCameraId(java.lang.String str);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSharedSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> list);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i);
        }

        public abstract androidx.camera.core.DynamicRange getDynamicRange();

        public abstract int getMirrorMode();

        public abstract java.lang.String getPhysicalCameraId();

        public abstract java.util.List<androidx.camera.core.impl.DeferrableSurface> getSharedSurfaces();

        public abstract androidx.camera.core.impl.DeferrableSurface getSurface();

        public abstract int getSurfaceGroupId();

        public static androidx.camera.core.impl.SessionConfig.OutputConfig.Builder builder(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            return new androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig.Builder().setSurface(deferrableSurface).setSharedSurfaces(java.util.Collections.emptyList()).setPhysicalCameraId(null).setMirrorMode(-1).setSurfaceGroupId(-1).setDynamicRange(androidx.camera.core.DynamicRange.SDR);
        }
    }

    SessionConfig(java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> list, java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list2, java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list3, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list4, androidx.camera.core.impl.CaptureConfig captureConfig, androidx.camera.core.impl.SessionConfig.ErrorListener errorListener, android.hardware.camera2.params.InputConfiguration inputConfiguration, int i, androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(list2);
        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(list3);
        this.getInputSizeshNQ4ISI = java.util.Collections.unmodifiableList(list4);
        this.getHighSpeedVideoSizes = errorListener;
        this.getHighSpeedVideoSizesFor = captureConfig;
        this.Camera2StreamConfigurationMap = inputConfiguration;
        this.getInputFormats = i;
        this.getOutputFormats = outputConfig;
    }

    public static androidx.camera.core.impl.SessionConfig defaultEmptySessionConfig() {
        return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(), new java.util.ArrayList(0), new java.util.ArrayList(0), new java.util.ArrayList(0), new androidx.camera.core.impl.CaptureConfig.Builder().build(), null, null, 0, null);
    }

    public final android.hardware.camera2.params.InputConfiguration getInputConfiguration() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : this.getHighResolutionOutputSizeshNQ4ISI) {
            arrayList.add(outputConfig.getSurface());
            java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public final java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> getOutputConfigs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.camera.core.impl.SessionConfig.OutputConfig getPostviewOutputConfig() {
        return this.getOutputFormats;
    }

    public final androidx.camera.core.impl.Config getImplementationOptions() {
        return this.getHighSpeedVideoSizesFor.getImplementationOptions();
    }

    public final int getTemplateType() {
        return this.getHighSpeedVideoSizesFor.getTemplateType();
    }

    public final int getSessionType() {
        return this.getInputFormats;
    }

    public final android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
        return this.getHighSpeedVideoSizesFor.getExpectedFrameRateRange();
    }

    public final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
        return this.getHighSpeedVideoSizesFor.getCameraCaptureCallbacks();
    }

    public final androidx.camera.core.impl.SessionConfig.ErrorListener getErrorListener() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
        return this.getInputSizeshNQ4ISI;
    }

    public final androidx.camera.core.impl.CaptureConfig getRepeatingCaptureConfig() {
        return this.getHighSpeedVideoSizesFor;
    }

    public static int getHigherPriorityTemplateType(int i, int i2) {
        java.util.List<java.lang.Integer> list = getHighSpeedVideoFpsRanges;
        return list.indexOf(java.lang.Integer.valueOf(i)) >= list.indexOf(java.lang.Integer.valueOf(i2)) ? i : i2;
    }

    public static final class CloseableErrorListener implements androidx.camera.core.impl.SessionConfig.ErrorListener {
        private final androidx.camera.core.impl.SessionConfig.ErrorListener getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);

        public CloseableErrorListener(androidx.camera.core.impl.SessionConfig.ErrorListener errorListener) {
            this.getHighSpeedVideoFpsRanges = errorListener;
        }

        @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
        public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
            if (this.getHighSpeedVideoFpsRangesFor.get()) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.onError(sessionConfig, sessionError);
        }

        public final void close() {
            this.getHighSpeedVideoFpsRangesFor.set(true);
        }
    }

    static class BaseBuilder {
        android.hardware.camera2.params.InputConfiguration getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.core.impl.SessionConfig.ErrorListener getHighSpeedVideoFpsRanges;
        androidx.camera.core.impl.SessionConfig.OutputConfig getInputFormats;
        final java.util.Set<androidx.camera.core.impl.SessionConfig.OutputConfig> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashSet();
        final androidx.camera.core.impl.CaptureConfig.Builder getHighSpeedVideoSizes = new androidx.camera.core.impl.CaptureConfig.Builder();
        final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> Camera2StreamConfigurationMap = new java.util.ArrayList();
        final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> getHighSpeedVideoSizesFor = new java.util.ArrayList();
        final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getOutputFormats = new java.util.ArrayList();
        int getOutputMinFrameDuration = 0;

        BaseBuilder() {
        }
    }

    public static class Builder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        public static androidx.camera.core.impl.SessionConfig.Builder createFrom(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.util.Size size) {
            androidx.camera.core.impl.SessionConfig.OptionUnpacker sessionOptionUnpacker = useCaseConfig.getSessionOptionUnpacker(null);
            if (sessionOptionUnpacker == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Implementation is missing option unpacker for ");
                sb.append(useCaseConfig.getTargetName(useCaseConfig.toString()));
                throw new java.lang.IllegalStateException(sb.toString());
            }
            androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
            sessionOptionUnpacker.unpack(size, useCaseConfig, builder);
            return builder;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setInputConfiguration(android.hardware.camera2.params.InputConfiguration inputConfiguration) {
            this.getHighResolutionOutputSizeshNQ4ISI = inputConfiguration;
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setTemplateType(int i) {
            this.getHighSpeedVideoSizes.setTemplateType(i);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setSessionType(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range) {
            this.getHighSpeedVideoSizes.setExpectedFrameRateRange(range);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setPreviewStabilization(int i) {
            if (i != 0) {
                this.getHighSpeedVideoSizes.setPreviewStabilization(i);
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setVideoStabilization(int i) {
            if (i != 0) {
                this.getHighSpeedVideoSizes.setVideoStabilization(i);
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addTag(java.lang.String str, java.lang.Object obj) {
            this.getHighSpeedVideoSizes.addTag(str, obj);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            if (this.Camera2StreamConfigurationMap.contains(stateCallback)) {
                return this;
            }
            this.Camera2StreamConfigurationMap.add(stateCallback);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllDeviceStateCallbacks(java.util.Collection<android.hardware.camera2.CameraDevice.StateCallback> collection) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                addDeviceStateCallback(it.next());
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            if (this.getHighSpeedVideoSizesFor.contains(stateCallback)) {
                return this;
            }
            this.getHighSpeedVideoSizesFor.add(stateCallback);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllSessionStateCallbacks(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                addSessionStateCallback(it.next());
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addRepeatingCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.getHighSpeedVideoSizes.addCameraCaptureCallback(cameraCaptureCallback);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllRepeatingCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> collection) {
            this.getHighSpeedVideoSizes.addAllCameraCaptureCallbacks(collection);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.getHighSpeedVideoSizes.addCameraCaptureCallback(cameraCaptureCallback);
            if (!this.getOutputFormats.contains(cameraCaptureCallback)) {
                this.getOutputFormats.add(cameraCaptureCallback);
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> collection) {
            for (androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : collection) {
                this.getHighSpeedVideoSizes.addCameraCaptureCallback(cameraCaptureCallback);
                if (!this.getOutputFormats.contains(cameraCaptureCallback)) {
                    this.getOutputFormats.add(cameraCaptureCallback);
                }
            }
            return this;
        }

        public boolean removeCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            return this.getHighSpeedVideoSizes.removeCameraCaptureCallback(cameraCaptureCallback) || this.getOutputFormats.remove(cameraCaptureCallback);
        }

        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            return java.util.Collections.unmodifiableList(this.getOutputFormats);
        }

        public androidx.camera.core.impl.SessionConfig.Builder setErrorListener(androidx.camera.core.impl.SessionConfig.ErrorListener errorListener) {
            this.getHighSpeedVideoFpsRanges = errorListener;
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            return addSurface(deferrableSurface, androidx.camera.core.DynamicRange.SDR);
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.core.DynamicRange dynamicRange) {
            return addSurface(deferrableSurface, dynamicRange, null, -1);
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.core.DynamicRange dynamicRange, java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRangesFor.add(androidx.camera.core.impl.SessionConfig.OutputConfig.builder(deferrableSurface).setPhysicalCameraId(str).setDynamicRange(dynamicRange).setMirrorMode(i).build());
            this.getHighSpeedVideoSizes.addSurface(deferrableSurface);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addOutputConfig(androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig) {
            this.getHighSpeedVideoFpsRangesFor.add(outputConfig);
            this.getHighSpeedVideoSizes.addSurface(outputConfig.getSurface());
            java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                this.getHighSpeedVideoSizes.addSurface(it.next());
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addNonRepeatingSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            return addNonRepeatingSurface(deferrableSurface, androidx.camera.core.DynamicRange.SDR);
        }

        public androidx.camera.core.impl.SessionConfig.Builder addNonRepeatingSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.core.DynamicRange dynamicRange) {
            this.getHighSpeedVideoFpsRangesFor.add(androidx.camera.core.impl.SessionConfig.OutputConfig.builder(deferrableSurface).setDynamicRange(dynamicRange).build());
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setPostviewSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            this.getInputFormats = androidx.camera.core.impl.SessionConfig.OutputConfig.builder(deferrableSurface).build();
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder removeSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig;
            java.util.Iterator<androidx.camera.core.impl.SessionConfig.OutputConfig> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (true) {
                if (!it.hasNext()) {
                    outputConfig = null;
                    break;
                }
                outputConfig = it.next();
                if (outputConfig.getSurface().equals(deferrableSurface)) {
                    break;
                }
            }
            if (outputConfig != null) {
                this.getHighSpeedVideoFpsRangesFor.remove(outputConfig);
            }
            this.getHighSpeedVideoSizes.removeSurface(deferrableSurface);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder clearSurfaces() {
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoSizes.clearSurfaces();
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.getHighSpeedVideoSizes.setImplementationOptions(config);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addImplementationOptions(androidx.camera.core.impl.Config config) {
            this.getHighSpeedVideoSizes.addImplementationOptions(config);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig build() {
            return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor), new java.util.ArrayList(this.Camera2StreamConfigurationMap), new java.util.ArrayList(this.getHighSpeedVideoSizesFor), new java.util.ArrayList(this.getOutputFormats), this.getHighSpeedVideoSizes.build(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats);
        }
    }

    public static final class ValidatingBuilder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        private final androidx.camera.core.internal.compat.workaround.SurfaceSorter getOutputSizes = new androidx.camera.core.internal.compat.workaround.SurfaceSorter();
        private boolean getOutputSizeshNQ4ISI = true;
        private java.lang.StringBuilder getOutputStallDurationlomOqCM = new java.lang.StringBuilder();
        private boolean getOutputMinFrameDurationlomOqCM = false;
        java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> getInputSizeshNQ4ISI = new java.util.ArrayList();

        public final <T> void addImplementationOption(androidx.camera.core.impl.Config.Option<T> option, T t) {
            this.getHighSpeedVideoSizes.addImplementationOption(option, t);
        }

        public final void add(androidx.camera.core.impl.SessionConfig sessionConfig) {
            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getTemplateType() != -1) {
                this.getOutputMinFrameDurationlomOqCM = true;
                this.getHighSpeedVideoSizes.setTemplateType(androidx.camera.core.impl.SessionConfig.getHigherPriorityTemplateType(repeatingCaptureConfig.getTemplateType(), this.getHighSpeedVideoSizes.getTemplateType()));
            }
            android.util.Range<java.lang.Integer> expectedFrameRateRange = repeatingCaptureConfig.getExpectedFrameRateRange();
            if (!expectedFrameRateRange.equals(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                if (this.getHighSpeedVideoSizes.getExpectedFrameRateRange().equals(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    this.getHighSpeedVideoSizes.setExpectedFrameRateRange(expectedFrameRateRange);
                } else if (!this.getHighSpeedVideoSizes.getExpectedFrameRateRange().equals(expectedFrameRateRange)) {
                    this.getOutputSizeshNQ4ISI = false;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Different ExpectedFrameRateRange values; current = ");
                    sb.append(this.getHighSpeedVideoSizes.getExpectedFrameRateRange());
                    sb.append(", new = ");
                    sb.append(expectedFrameRateRange);
                    java.lang.String obj = sb.toString();
                    androidx.camera.core.Logger.e("ValidatingBuilder", obj);
                    this.getOutputStallDurationlomOqCM.append(obj);
                }
            }
            int previewStabilizationMode = repeatingCaptureConfig.getPreviewStabilizationMode();
            if (previewStabilizationMode != 0) {
                this.getHighSpeedVideoSizes.setPreviewStabilization(previewStabilizationMode);
            }
            int videoStabilizationMode = repeatingCaptureConfig.getVideoStabilizationMode();
            if (videoStabilizationMode != 0) {
                this.getHighSpeedVideoSizes.setVideoStabilization(videoStabilizationMode);
            }
            this.getHighSpeedVideoSizes.addAllTags(sessionConfig.getRepeatingCaptureConfig().getTagBundle());
            this.Camera2StreamConfigurationMap.addAll(sessionConfig.getDeviceStateCallbacks());
            this.getHighSpeedVideoSizesFor.addAll(sessionConfig.getSessionStateCallbacks());
            this.getHighSpeedVideoSizes.addAllCameraCaptureCallbacks(sessionConfig.getRepeatingCameraCaptureCallbacks());
            this.getOutputFormats.addAll(sessionConfig.getSingleCameraCaptureCallbacks());
            if (sessionConfig.getErrorListener() != null) {
                this.getInputSizeshNQ4ISI.add(sessionConfig.getErrorListener());
            }
            if (sessionConfig.getInputConfiguration() != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = sessionConfig.getInputConfiguration();
            }
            this.getHighSpeedVideoFpsRangesFor.addAll(sessionConfig.getOutputConfigs());
            this.getHighSpeedVideoSizes.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : this.getHighSpeedVideoFpsRangesFor) {
                arrayList.add(outputConfig.getSurface());
                java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            if (!arrayList.containsAll(this.getHighSpeedVideoSizes.getSurfaces())) {
                androidx.camera.core.Logger.d("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.getOutputSizeshNQ4ISI = false;
                this.getOutputStallDurationlomOqCM.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (sessionConfig.getSessionType() != this.getOutputMinFrameDuration && sessionConfig.getSessionType() != 0 && this.getOutputMinFrameDuration != 0) {
                androidx.camera.core.Logger.d("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.getOutputSizeshNQ4ISI = false;
                this.getOutputStallDurationlomOqCM.append("Invalid configuration due to that two non-default session types are set");
            } else if (sessionConfig.getSessionType() != 0) {
                this.getOutputMinFrameDuration = sessionConfig.getSessionType();
            }
            if (sessionConfig.getOutputFormats != null) {
                if (this.getInputFormats == sessionConfig.getOutputFormats || this.getInputFormats == null) {
                    this.getInputFormats = sessionConfig.getOutputFormats;
                } else {
                    androidx.camera.core.Logger.d("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.getOutputSizeshNQ4ISI = false;
                    this.getOutputStallDurationlomOqCM.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.getHighSpeedVideoSizes.addImplementationOptions(repeatingCaptureConfig.getImplementationOptions());
        }

        public final void clearSurfaces() {
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoSizes.clearSurfaces();
        }

        public final boolean isValid() {
            return this.getOutputMinFrameDurationlomOqCM && this.getOutputSizeshNQ4ISI;
        }

        public final java.lang.String getInvalidReason() {
            if (!this.getOutputMinFrameDurationlomOqCM) {
                return "Template is not set";
            }
            return this.getOutputStallDurationlomOqCM.toString();
        }

        public final androidx.camera.core.impl.SessionConfig build() {
            if (!this.getOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalArgumentException("Unsupported session configuration combination");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
            this.getOutputSizes.sort(arrayList);
            if (this.getOutputMinFrameDuration == 1) {
                new androidx.camera.core.internal.HighSpeedFpsModifier().modifyFpsForPreviewOnlyRepeating(arrayList, this.getHighSpeedVideoSizes);
            }
            return new androidx.camera.core.impl.SessionConfig(arrayList, new java.util.ArrayList(this.Camera2StreamConfigurationMap), new java.util.ArrayList(this.getHighSpeedVideoSizesFor), new java.util.ArrayList(this.getOutputFormats), this.getHighSpeedVideoSizes.build(), !this.getInputSizeshNQ4ISI.isEmpty() ? new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.impl.SessionConfig$ValidatingBuilder$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                    java.util.Iterator<androidx.camera.core.impl.SessionConfig.ErrorListener> it = androidx.camera.core.impl.SessionConfig.ValidatingBuilder.this.getInputSizeshNQ4ISI.iterator();
                    while (it.hasNext()) {
                        it.next().onError(sessionConfig, sessionError);
                    }
                }
            } : null, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats);
        }
    }
}

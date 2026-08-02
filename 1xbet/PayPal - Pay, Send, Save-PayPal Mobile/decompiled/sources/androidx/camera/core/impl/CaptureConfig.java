package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class CaptureConfig {
    public static final java.lang.String CAPTURE_CONFIG_ID_TAG_KEY = "CAPTURE_CONFIG_ID_KEY";
    public static final int DEFAULT_ID = -1;
    public static final int TEMPLATE_TYPE_NONE = -1;
    final boolean Camera2StreamConfigurationMap;
    final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<androidx.camera.core.impl.DeferrableSurface> getHighSpeedVideoFpsRanges;
    final androidx.camera.core.impl.Config getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    private final androidx.camera.core.impl.TagBundle getHighSpeedVideoSizesFor;
    private final androidx.camera.core.impl.CameraCaptureResult getInputSizeshNQ4ISI;
    private final boolean getOutputMinFrameDuration;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_ROTATION = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.rotation", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_JPEG_QUALITY = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.jpegQuality", java.lang.Integer.class);
    private static final androidx.camera.core.impl.Config.Option<android.util.Range<java.lang.Integer>> getOutputFormats = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.resolvedFrameRate", android.util.Range.class);

    public interface OptionUnpacker {
        void unpack(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.CaptureConfig.Builder builder);
    }

    CaptureConfig(java.util.List<androidx.camera.core.impl.DeferrableSurface> list, androidx.camera.core.impl.Config config, int i, boolean z, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list2, boolean z2, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = config;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(list2);
        this.getOutputMinFrameDuration = z2;
        this.getHighSpeedVideoSizesFor = tagBundle;
        this.getInputSizeshNQ4ISI = cameraCaptureResult;
        this.Camera2StreamConfigurationMap = z;
    }

    public static androidx.camera.core.impl.CaptureConfig defaultEmptyCaptureConfig() {
        return new androidx.camera.core.impl.CaptureConfig.Builder().build();
    }

    public final androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
    }

    public final androidx.camera.core.impl.Config getImplementationOptions() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getTemplateType() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getId() {
        java.lang.Object tag = this.getHighSpeedVideoSizesFor.getTag(CAPTURE_CONFIG_ID_TAG_KEY);
        if (tag == null) {
            return -1;
        }
        return ((java.lang.Integer) tag).intValue();
    }

    public final android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
        return (android.util.Range) java.util.Objects.requireNonNull((android.util.Range) this.getHighSpeedVideoFpsRangesFor.retrieveOption(getOutputFormats, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED));
    }

    public final int getPreviewStabilizationMode() {
        return ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) this.getHighSpeedVideoFpsRangesFor.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0))).intValue();
    }

    public final int getVideoStabilizationMode() {
        return ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) this.getHighSpeedVideoFpsRangesFor.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0))).intValue();
    }

    public final boolean isPostviewEnabled() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean isUseRepeatingSurface() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCameraCaptureCallbacks() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.getHighSpeedVideoSizesFor;
    }

    public static final class Builder {
        private java.util.List<androidx.camera.core.impl.CameraCaptureCallback> Camera2StreamConfigurationMap;
        private androidx.camera.core.impl.MutableConfig getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private androidx.camera.core.impl.MutableTagBundle getHighSpeedVideoFpsRangesFor;
        private androidx.camera.core.impl.CameraCaptureResult getHighSpeedVideoSizes;
        private int getInputFormats;
        private final java.util.Set<androidx.camera.core.impl.DeferrableSurface> getInputSizeshNQ4ISI;
        private boolean getOutputMinFrameDuration;

        public Builder() {
            this.getInputSizeshNQ4ISI = new java.util.HashSet();
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.MutableOptionsBundle.create();
            this.getInputFormats = -1;
            this.getHighSpeedVideoFpsRanges = false;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.MutableTagBundle.create();
        }

        private Builder(androidx.camera.core.impl.CaptureConfig captureConfig) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.getInputSizeshNQ4ISI = hashSet;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.MutableOptionsBundle.create();
            this.getInputFormats = -1;
            this.getHighSpeedVideoFpsRanges = false;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.MutableTagBundle.create();
            hashSet.addAll(captureConfig.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.MutableOptionsBundle.from(captureConfig.getHighSpeedVideoFpsRangesFor);
            this.getInputFormats = captureConfig.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap.addAll(captureConfig.getCameraCaptureCallbacks());
            this.getOutputMinFrameDuration = captureConfig.isUseRepeatingSurface();
            this.getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.MutableTagBundle.from(captureConfig.getTagBundle());
            this.getHighSpeedVideoFpsRanges = captureConfig.Camera2StreamConfigurationMap;
        }

        public static androidx.camera.core.impl.CaptureConfig.Builder createFrom(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
            androidx.camera.core.impl.CaptureConfig.OptionUnpacker captureOptionUnpacker = useCaseConfig.getCaptureOptionUnpacker(null);
            if (captureOptionUnpacker == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Implementation is missing option unpacker for ");
                sb.append(useCaseConfig.getTargetName(useCaseConfig.toString()));
                throw new java.lang.IllegalStateException(sb.toString());
            }
            androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
            captureOptionUnpacker.unpack(useCaseConfig, builder);
            return builder;
        }

        public static androidx.camera.core.impl.CaptureConfig.Builder from(androidx.camera.core.impl.CaptureConfig captureConfig) {
            return new androidx.camera.core.impl.CaptureConfig.Builder(captureConfig);
        }

        public final void setCameraCaptureResult(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            this.getHighSpeedVideoSizes = cameraCaptureResult;
        }

        public final int getTemplateType() {
            return this.getInputFormats;
        }

        public final android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
            return (android.util.Range) this.getHighResolutionOutputSizeshNQ4ISI.retrieveOption(androidx.camera.core.impl.CaptureConfig.getOutputFormats, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        }

        public final void setTemplateType(int i) {
            this.getInputFormats = i;
        }

        public final void setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range) {
            addImplementationOption(androidx.camera.core.impl.CaptureConfig.getOutputFormats, range);
        }

        public final void setPreviewStabilization(int i) {
            if (i != 0) {
                addImplementationOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, java.lang.Integer.valueOf(i));
            }
        }

        public final void setVideoStabilization(int i) {
            if (i != 0) {
                addImplementationOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, java.lang.Integer.valueOf(i));
            }
        }

        public final void setPostviewEnabled(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
        }

        public final void addCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            if (this.Camera2StreamConfigurationMap.contains(cameraCaptureCallback)) {
                return;
            }
            this.Camera2StreamConfigurationMap.add(cameraCaptureCallback);
        }

        public final void addAllCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> collection) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = collection.iterator();
            while (it.hasNext()) {
                addCameraCaptureCallback(it.next());
            }
        }

        public final boolean removeCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            return this.Camera2StreamConfigurationMap.remove(cameraCaptureCallback);
        }

        public final void addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            this.getInputSizeshNQ4ISI.add(deferrableSurface);
        }

        public final void removeSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            this.getInputSizeshNQ4ISI.remove(deferrableSurface);
        }

        public final void clearSurfaces() {
            this.getInputSizeshNQ4ISI.clear();
        }

        public final java.util.Set<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
            return this.getInputSizeshNQ4ISI;
        }

        public final void setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.MutableOptionsBundle.from(config);
        }

        public final void addImplementationOptions(androidx.camera.core.impl.Config config) {
            for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
                java.lang.Object retrieveOption = this.getHighResolutionOutputSizeshNQ4ISI.retrieveOption(option, null);
                java.lang.Object retrieveOption2 = config.retrieveOption(option);
                if (retrieveOption instanceof androidx.camera.core.impl.MultiValueSet) {
                    ((androidx.camera.core.impl.MultiValueSet) retrieveOption).addAll(((androidx.camera.core.impl.MultiValueSet) retrieveOption2).getAllItems());
                } else {
                    if (retrieveOption2 instanceof androidx.camera.core.impl.MultiValueSet) {
                        retrieveOption2 = ((androidx.camera.core.impl.MultiValueSet) retrieveOption2).m1009clone();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.insertOption(option, config.getOptionPriority(option), retrieveOption2);
                }
            }
        }

        public final <T> void addImplementationOption(androidx.camera.core.impl.Config.Option<T> option, T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.insertOption(option, t);
        }

        public final androidx.camera.core.impl.Config getImplementationOptions() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean isUseRepeatingSurface() {
            return this.getOutputMinFrameDuration;
        }

        public final void setUseRepeatingSurface(boolean z) {
            this.getOutputMinFrameDuration = z;
        }

        public final java.lang.Object getTag(java.lang.String str) {
            return this.getHighSpeedVideoFpsRangesFor.getTag(str);
        }

        public final void addTag(java.lang.String str, java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor.putTag(str, obj);
        }

        public final void setId(int i) {
            this.getHighSpeedVideoFpsRangesFor.putTag(androidx.camera.core.impl.CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY, java.lang.Integer.valueOf(i));
        }

        public final void addAllTags(androidx.camera.core.impl.TagBundle tagBundle) {
            this.getHighSpeedVideoFpsRangesFor.addTagBundle(tagBundle);
        }

        public final androidx.camera.core.impl.CaptureConfig build() {
            return new androidx.camera.core.impl.CaptureConfig(new java.util.ArrayList(this.getInputSizeshNQ4ISI), androidx.camera.core.impl.OptionsBundle.from(this.getHighResolutionOutputSizeshNQ4ISI), this.getInputFormats, this.getHighSpeedVideoFpsRanges, new java.util.ArrayList(this.Camera2StreamConfigurationMap), this.getOutputMinFrameDuration, androidx.camera.core.impl.TagBundle.from(this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoSizes);
        }
    }
}

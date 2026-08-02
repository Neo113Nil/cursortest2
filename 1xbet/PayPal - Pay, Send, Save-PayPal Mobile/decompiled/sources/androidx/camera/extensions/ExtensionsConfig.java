package androidx.camera.extensions;

/* loaded from: classes6.dex */
class ExtensionsConfig implements androidx.camera.core.impl.CameraConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> getHighSpeedVideoFpsRanges = androidx.camera.core.impl.Config.Option.create("camerax.extensions.extensionMode", java.lang.Integer.TYPE);
    private final androidx.camera.core.impl.Config getHighResolutionOutputSizeshNQ4ISI;

    ExtensionsConfig(androidx.camera.core.impl.Config config) {
        this.getHighResolutionOutputSizeshNQ4ISI = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig */
    public androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public androidx.camera.core.impl.Identifier getCompatibilityId() {
        return (androidx.camera.core.impl.Identifier) retrieveOption(OPTION_COMPATIBILITY_ID);
    }

    static final class Builder implements androidx.camera.core.impl.CameraConfig.Builder<androidx.camera.extensions.ExtensionsConfig.Builder> {
        final androidx.camera.core.impl.MutableOptionsBundle getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.MutableOptionsBundle.create();

        Builder() {
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setCaptureProcessProgressSupported(boolean z) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, java.lang.Boolean.valueOf(z));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setCompatibilityId(androidx.camera.core.impl.Identifier identifier) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setPostviewFormatSelector(androidx.camera.core.impl.CameraConfig.PostviewFormatSelector postviewFormatSelector) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_POSTVIEW_FORMAT_SELECTOR, postviewFormatSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setPostviewSupported(boolean z) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_POSTVIEW_SUPPORTED, java.lang.Boolean.valueOf(z));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setSessionProcessor(androidx.camera.core.impl.SessionProcessor sessionProcessor) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setUseCaseCombinationRequiredRule(int i) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, java.lang.Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setUseCaseConfigFactory(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public final /* synthetic */ androidx.camera.extensions.ExtensionsConfig.Builder setZslDisabled(boolean z) {
            this.getHighSpeedVideoFpsRangesFor.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }
    }
}

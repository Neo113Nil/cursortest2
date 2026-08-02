package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
class StreamSharingBuilder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.streamsharing.StreamSharing, androidx.camera.core.streamsharing.StreamSharingConfig, androidx.camera.core.streamsharing.StreamSharingBuilder> {
    private final androidx.camera.core.impl.MutableOptionsBundle getHighResolutionOutputSizeshNQ4ISI;

    StreamSharingBuilder() {
        this(androidx.camera.core.impl.MutableOptionsBundle.create());
    }

    StreamSharingBuilder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
        this.getHighResolutionOutputSizeshNQ4ISI = mutableOptionsBundle;
        java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
        if (cls != null && !cls.equals(androidx.camera.core.streamsharing.StreamSharing.class)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid target class configuration for ");
            sb.append(this);
            sb.append(": ");
            sb.append(cls);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING);
        setTargetClass(androidx.camera.core.streamsharing.StreamSharing.class);
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public androidx.camera.core.impl.MutableConfig getMutableConfig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.camera.core.internal.TargetConfig.Builder
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.camera.core.streamsharing.StreamSharingBuilder setTargetClass(java.lang.Class<androidx.camera.core.streamsharing.StreamSharing> cls) {
        getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
        if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append("-");
            sb.append(java.util.UUID.randomUUID());
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, sb.toString());
        }
        return this;
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public /* synthetic */ java.lang.Object build() {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingConfig getUseCaseConfig() {
        return new androidx.camera.core.streamsharing.StreamSharingConfig(androidx.camera.core.impl.OptionsBundle.from(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
        getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setHighResolutionDisabled(boolean z) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase) {
        getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setSurfaceOccupancyPriority(int i) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public /* synthetic */ java.lang.Object setTargetName(java.lang.String str) {
        getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public /* synthetic */ androidx.camera.core.streamsharing.StreamSharingBuilder setZslDisabled(boolean z) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }
}

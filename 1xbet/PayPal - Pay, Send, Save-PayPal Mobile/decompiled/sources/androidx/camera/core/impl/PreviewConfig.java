package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class PreviewConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.Preview>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.ThreadConfig {
    private final androidx.camera.core.impl.OptionsBundle getHighSpeedVideoSizes;

    public PreviewConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.getHighSpeedVideoSizes = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig */
    public final androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((java.lang.Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }
}

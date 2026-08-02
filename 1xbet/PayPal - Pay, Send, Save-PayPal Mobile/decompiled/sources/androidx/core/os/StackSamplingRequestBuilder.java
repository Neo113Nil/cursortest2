package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/core/os/StackSamplingRequestBuilder;", "Landroidx/core/os/ProfilingRequestBuilder;", "<init>", "()V", "Landroid/os/Bundle;", "getParams", "()Landroid/os/Bundle;", "", "getProfilingType", "()I", "getThis", "()Landroidx/core/os/StackSamplingRequestBuilder;", "bufferSizeKb", "setBufferSizeKb", "(I)Landroidx/core/os/StackSamplingRequestBuilder;", "durationMs", "setDurationMs", "samplingFrequencyHz", "setSamplingFrequencyHz", "Camera2StreamConfigurationMap", "Landroid/os/Bundle;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StackSamplingRequestBuilder extends androidx.core.os.ProfilingRequestBuilder<androidx.core.os.StackSamplingRequestBuilder> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI = new android.os.Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected final int getProfilingType() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.os.ProfilingRequestBuilder
    public final androidx.core.os.StackSamplingRequestBuilder getThis() {
        return this;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    /* renamed from: getParams, reason: from getter */
    protected final android.os.Bundle getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.core.os.StackSamplingRequestBuilder setBufferSizeKb(int bufferSizeKb) {
        this.getHighResolutionOutputSizeshNQ4ISI.putInt("KEY_SIZE_KB", bufferSizeKb);
        return this;
    }

    public final androidx.core.os.StackSamplingRequestBuilder setDurationMs(int durationMs) {
        this.getHighResolutionOutputSizeshNQ4ISI.putInt("KEY_DURATION_MS", durationMs);
        return this;
    }

    public final androidx.core.os.StackSamplingRequestBuilder setSamplingFrequencyHz(int samplingFrequencyHz) {
        this.getHighResolutionOutputSizeshNQ4ISI.putInt("KEY_FREQUENCY_HZ", samplingFrequencyHz);
        return this;
    }
}

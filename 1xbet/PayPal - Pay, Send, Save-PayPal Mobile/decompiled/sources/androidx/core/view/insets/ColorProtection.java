package androidx.core.view.insets;

/* loaded from: classes7.dex */
public class ColorProtection extends androidx.core.view.insets.Protection {
    private boolean getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private final android.graphics.drawable.ColorDrawable getOutputMinFrameDuration;

    @Override // androidx.core.view.insets.Protection
    final boolean getHighSpeedVideoFpsRanges() {
        return true;
    }

    public ColorProtection(int i) {
        super(i);
        this.getOutputMinFrameDuration = new android.graphics.drawable.ColorDrawable();
        this.getOutputFormats = 0;
    }

    public ColorProtection(int i, int i2) {
        this(i);
        setColor(i2);
    }

    @Override // androidx.core.view.insets.Protection
    final void Camera2StreamConfigurationMap(int i) {
        if (this.getInputSizeshNQ4ISI || this.getOutputFormats == i) {
            return;
        }
        this.getOutputFormats = i;
        this.getOutputMinFrameDuration.setColor(i);
        androidx.core.view.insets.Protection.Attributes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration);
    }

    public void setColor(int i) {
        this.getInputSizeshNQ4ISI = true;
        if (this.getOutputFormats != i) {
            this.getOutputFormats = i;
            this.getOutputMinFrameDuration.setColor(i);
            androidx.core.view.insets.Protection.Attributes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration);
        }
    }

    public int getColor() {
        return this.getOutputFormats;
    }
}

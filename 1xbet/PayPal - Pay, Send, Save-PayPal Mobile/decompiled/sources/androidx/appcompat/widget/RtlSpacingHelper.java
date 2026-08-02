package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class RtlSpacingHelper {
    int getHighSpeedVideoFpsRangesFor = 0;
    int getHighSpeedVideoFpsRanges = 0;
    private int getOutputMinFrameDuration = Integer.MIN_VALUE;
    private int Camera2StreamConfigurationMap = Integer.MIN_VALUE;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;
    private int getHighSpeedVideoSizes = 0;
    private boolean getInputFormats = false;
    private boolean getOutputFormats = false;

    RtlSpacingHelper() {
    }

    public final int getHighSpeedVideoFpsRangesFor() {
        return this.getInputFormats ? this.getHighSpeedVideoFpsRanges : this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getInputFormats ? this.getHighSpeedVideoFpsRangesFor : this.getHighSpeedVideoFpsRanges;
    }

    public final void Camera2StreamConfigurationMap(int i, int i2) {
        this.getOutputMinFrameDuration = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getOutputFormats = true;
        if (this.getInputFormats) {
            if (i2 != Integer.MIN_VALUE) {
                this.getHighSpeedVideoFpsRangesFor = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.getHighSpeedVideoFpsRanges = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.getHighSpeedVideoFpsRanges = i2;
        }
    }

    public final void getHighSpeedVideoSizes(int i, int i2) {
        this.getOutputFormats = false;
        if (i != Integer.MIN_VALUE) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.getHighSpeedVideoSizes = i2;
            this.getHighSpeedVideoFpsRanges = i2;
        }
    }

    public final void Camera2StreamConfigurationMap(boolean z) {
        if (z == this.getInputFormats) {
            return;
        }
        this.getInputFormats = z;
        if (!this.getOutputFormats) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
            return;
        }
        if (z) {
            int i = this.Camera2StreamConfigurationMap;
            if (i == Integer.MIN_VALUE) {
                i = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            int i2 = this.getOutputMinFrameDuration;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.getHighSpeedVideoSizes;
            }
            this.getHighSpeedVideoFpsRanges = i2;
            return;
        }
        int i3 = this.getOutputMinFrameDuration;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        this.getHighSpeedVideoFpsRangesFor = i3;
        int i4 = this.Camera2StreamConfigurationMap;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.getHighSpeedVideoSizes;
        }
        this.getHighSpeedVideoFpsRanges = i4;
    }
}

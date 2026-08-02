package my.com.softspace.pinpad;

/* loaded from: classes17.dex */
public class PinpadParam {
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private android.text.SpannableString getOutputMinFrameDuration;

    private PinpadParam() {
    }

    public android.text.SpannableString getSpannableFormattedAmount() {
        return this.getOutputMinFrameDuration;
    }

    public java.lang.String getFormattedAmount() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getCurrency() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isCurrencyDisplayBack() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getPanToken() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getDrawableBtnOKColor() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getTimeout() {
        return this.getHighSpeedVideoSizesFor;
    }

    public boolean isFallbackMode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getPlaceholderCount() {
        return this.getInputFormats;
    }

    public java.lang.String getPinEntryMessage() {
        return this.getOutputFormats;
    }

    public static class Builder {
        private boolean Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private byte[] getInputFormats;
        private java.lang.String getInputSizeshNQ4ISI;
        private android.text.SpannableString getOutputFormats;
        private int getOutputMinFrameDuration;

        private Builder() {
        }

        public static my.com.softspace.pinpad.PinpadParam.Builder create() {
            return new my.com.softspace.pinpad.PinpadParam.Builder();
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setSpannableFormattedAmount(android.text.SpannableString spannableString) {
            this.getOutputFormats = spannableString;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setFormattedAmount(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setCurrency(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setCurrencyDisplayBack(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setPanToken(byte[] bArr) {
            this.getInputFormats = bArr;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setDrawableBtnOKColor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setTimeout(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setFallbackMode(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setPlaceholderCount(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam.Builder setPinEntryMessage(java.lang.String str) {
            this.getInputSizeshNQ4ISI = str;
            return this;
        }

        public my.com.softspace.pinpad.PinpadParam build() {
            my.com.softspace.pinpad.PinpadParam pinpadParam = new my.com.softspace.pinpad.PinpadParam((byte) 0);
            pinpadParam.getOutputMinFrameDuration = this.getOutputFormats;
            pinpadParam.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
            pinpadParam.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes;
            pinpadParam.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
            pinpadParam.getInputSizeshNQ4ISI = this.getInputFormats;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                i = -6705889;
            }
            pinpadParam.Camera2StreamConfigurationMap = i;
            int i2 = this.getHighSpeedVideoSizesFor;
            if (i2 == 0) {
                i2 = 60;
            }
            pinpadParam.getHighSpeedVideoSizesFor = i2;
            pinpadParam.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getOutputMinFrameDuration;
            if (i3 == 0) {
                i3 = 4;
            }
            pinpadParam.getInputFormats = i3;
            pinpadParam.getOutputFormats = this.getInputSizeshNQ4ISI;
            return pinpadParam;
        }
    }

    /* synthetic */ PinpadParam(byte b) {
        this();
    }
}

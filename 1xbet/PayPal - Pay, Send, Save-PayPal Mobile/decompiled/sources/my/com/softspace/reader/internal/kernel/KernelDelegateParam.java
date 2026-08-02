package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public class KernelDelegateParam {
    private boolean Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private boolean getInputFormats;

    private KernelDelegateParam() {
    }

    public java.lang.String getAmount() {
        return this.getHighSpeedVideoSizes;
    }

    public int getTimeout() {
        return this.getHighSpeedVideoSizesFor;
    }

    public byte[] getAid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getFci() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isBertlvFormat() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isCipherData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isLCR() {
        return this.getInputFormats;
    }

    public static class Builder {
        private byte[] Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoFpsRanges;
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;
        private int getInputFormats;
        private boolean getOutputMinFrameDuration;

        private Builder() {
        }

        public static my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder create() {
            return new my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder();
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setAmount(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setTimeout(int i) {
            this.getInputFormats = i;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setAID(byte[] bArr) {
            this.Camera2StreamConfigurationMap = bArr;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setFCI(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = bArr;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setBertlvFormat(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setCipherData(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder setLCR(boolean z) {
            this.getOutputMinFrameDuration = z;
            return this;
        }

        public my.com.softspace.reader.internal.kernel.KernelDelegateParam build() {
            my.com.softspace.reader.internal.kernel.KernelDelegateParam kernelDelegateParam = new my.com.softspace.reader.internal.kernel.KernelDelegateParam((byte) 0);
            kernelDelegateParam.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor;
            kernelDelegateParam.getHighSpeedVideoSizesFor = this.getInputFormats;
            kernelDelegateParam.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
            kernelDelegateParam.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
            kernelDelegateParam.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
            kernelDelegateParam.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI;
            kernelDelegateParam.getInputFormats = this.getOutputMinFrameDuration;
            return kernelDelegateParam;
        }
    }

    /* synthetic */ KernelDelegateParam(byte b) {
        this();
    }
}

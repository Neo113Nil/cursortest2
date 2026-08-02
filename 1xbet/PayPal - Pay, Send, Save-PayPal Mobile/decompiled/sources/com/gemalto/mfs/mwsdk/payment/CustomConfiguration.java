package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes8.dex */
public class CustomConfiguration {

    public static class Builder {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private int getHighResolutionOutputSizeshNQ4ISI = 978;
        private int getOutputMinFrameDuration = 45;
        private boolean getOutputFormats = false;
        private int getInputSizeshNQ4ISI = 0;
        private long getHighSpeedVideoSizes = 0;
        private long getHighSpeedVideoSizesFor = 0;
        private boolean Camera2StreamConfigurationMap = true;

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder keyValidityPeriod(int i) {
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = (i2 ^ 67) + ((i2 & 67) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                this.getOutputMinFrameDuration = i;
                return this;
            }
            this.getOutputMinFrameDuration = i;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder domesticCurrencyCode(int i) {
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                int i4 = i2 + 119;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder supportTransitWithoutCDCVM(boolean z) {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = (((i | 51) << 1) - (i ^ 51)) % 128;
            getHighSpeedVideoFpsRangesFor = i2;
            this.getOutputFormats = z;
            int i3 = i2 + 121;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder maxConsecutivePaymentsForLVT(int i) {
            int i2 = getHighSpeedVideoFpsRangesFor + 83;
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRanges = i3;
            if (i2 % 2 != 0) {
                this.getInputSizeshNQ4ISI = i;
                getHighSpeedVideoFpsRangesFor = (i3 + 43) % 128;
                return this;
            }
            this.getInputSizeshNQ4ISI = i;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder singleTransactionAmountLimitForLVT(long j) {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = ((i & 77) + (i | 77)) % 128;
            getHighSpeedVideoFpsRangesFor = i2;
            this.getHighSpeedVideoSizes = j;
            int i3 = (i2 ^ 83) + ((i2 & 83) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder maxCumulativeAmountForLVT(long j) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i ^ 9) + ((i & 9) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                this.getHighSpeedVideoSizesFor = j;
                return this;
            }
            this.getHighSpeedVideoSizesFor = j;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration.Builder selectCvmOnlinePINPriority() {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (((i | 29) << 1) - (i ^ 29)) % 128;
            getHighSpeedVideoFpsRanges = i2;
            this.Camera2StreamConfigurationMap = false;
            getHighSpeedVideoFpsRangesFor = ((i2 ^ 107) + ((i2 & 107) << 1)) % 128;
            return this;
        }

        public com.gemalto.mfs.mwsdk.payment.CustomConfiguration build() {
            util.h.xy.bu.a aVar = new util.h.xy.bu.a(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i & 35) + (i | 35)) % 128;
            return aVar;
        }
    }
}

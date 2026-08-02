package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public abstract class PaymentInputData {

    public static class PaymentInputBuilder {
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private util.h.xy.bq.rc.a getHighSpeedVideoSizes;

        public PaymentInputBuilder(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
            this.getHighSpeedVideoSizes = new util.h.xy.bq.rc.a(paymentType);
        }

        public com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData.PaymentInputBuilder withRemotePaymentParameters(long j, char c) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i | 101) << 1) - (i ^ 101)) % 128;
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.m25587(j, c);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }

        public com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData.PaymentInputBuilder withMCRemotePaymentParameters(char c, com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType, com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType, long j) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 113;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.m25589(c, transactionType, cryptogramDataType, j);
                return this;
            }
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.m25589(c, transactionType, cryptogramDataType, j);
            throw null;
        }

        public com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData.PaymentInputBuilder withQRCodePaymentParameters(java.lang.String str, char c, char c2) {
            int i = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 83) + (i | 83)) % 128;
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.m25585(str, c, c2);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i2 ^ 19) + ((i2 & 19) << 1)) % 128;
            return this;
        }

        public com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData.PaymentInputBuilder withPureQRCodePaymentParameters(byte[] bArr, byte[] bArr2) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | 115) << 1) - (i ^ 115);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.m25586(bArr, bArr2);
                return this;
            }
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.m25586(bArr, bArr2);
            throw null;
        }

        public com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData build() {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 35) % 128;
            util.h.xy.bq.rc m25588 = this.getHighSpeedVideoSizes.m25588();
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i | 15) << 1) - (i ^ 15)) % 128;
            return m25588;
        }
    }
}

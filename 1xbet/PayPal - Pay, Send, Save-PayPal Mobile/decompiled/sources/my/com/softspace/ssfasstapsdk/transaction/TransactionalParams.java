package my.com.softspace.ssfasstapsdk.transaction;

/* loaded from: classes17.dex */
public class TransactionalParams {
    private java.lang.String amount;
    private java.lang.String amountOther;
    private boolean isBerTlvMode;
    private boolean isDebitOptIn;
    private my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams kernelConfig;
    private int waitForUserInputTimeout;

    private TransactionalParams() {
    }

    public java.lang.String getAmount() {
        return this.amount;
    }

    public java.lang.String getAmountOther() {
        return this.amountOther;
    }

    public my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams getKernelConfig() {
        return this.kernelConfig;
    }

    public int getWaitForUserInputTimeout() {
        return this.waitForUserInputTimeout;
    }

    public boolean isDebitOptIn() {
        return this.isDebitOptIn;
    }

    public boolean isBerTlvMode() {
        return this.isBerTlvMode;
    }

    public static class Builder {
        private java.lang.String amount;
        private java.lang.String amountOther;
        private my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams kernelConfig;
        private java.lang.Integer waitForUserInputTimeout;
        private boolean isDebitOptIn = false;
        private boolean isBerTlvMode = false;

        private Builder() {
        }

        public static my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder create() {
            return new my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder();
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder setAmount(java.lang.String str) {
            this.amount = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder setAmountOther(java.lang.String str) {
            this.amountOther = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder setKernelConfig(my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams kernelConfigurationParams) {
            this.kernelConfig = kernelConfigurationParams;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder setWaitForUserInputTimeout(java.lang.Integer num) {
            this.waitForUserInputTimeout = num;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder setDebitOptIn(boolean z) {
            this.isDebitOptIn = z;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder setBerTlvMode(boolean z) {
            this.isBerTlvMode = z;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public my.com.softspace.ssfasstapsdk.transaction.TransactionalParams build() {
            if (android.text.TextUtils.isEmpty(this.amount) || !android.text.TextUtils.isDigitsOnly(this.amount)) {
                throw new java.lang.IllegalArgumentException("Invalid amount passed in");
            }
            if (this.waitForUserInputTimeout.intValue() < 0) {
                throw new java.lang.IllegalArgumentException("Invalid timeout timer");
            }
            my.com.softspace.ssfasstapsdk.transaction.TransactionalParams transactionalParams = new my.com.softspace.ssfasstapsdk.transaction.TransactionalParams(0 == true ? 1 : 0);
            transactionalParams.amount = this.amount;
            transactionalParams.amountOther = this.amountOther;
            transactionalParams.kernelConfig = this.kernelConfig;
            transactionalParams.isDebitOptIn = this.isDebitOptIn;
            java.lang.Integer num = this.waitForUserInputTimeout;
            transactionalParams.waitForUserInputTimeout = num != null ? num.intValue() : 0;
            transactionalParams.isBerTlvMode = this.isBerTlvMode;
            return transactionalParams;
        }
    }

    /* synthetic */ TransactionalParams(byte b) {
        this();
    }
}

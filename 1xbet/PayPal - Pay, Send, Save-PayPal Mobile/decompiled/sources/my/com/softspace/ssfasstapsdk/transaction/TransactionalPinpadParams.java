package my.com.softspace.ssfasstapsdk.transaction;

/* loaded from: classes17.dex */
public class TransactionalPinpadParams {
    private java.lang.String currency;
    private int drawableBtnOKColor;
    private java.lang.String formattedAmount;
    private boolean isCurrencyDisplayBack;
    private boolean isFallbackMode;
    private byte[] panToken;
    private int placeholderCount;
    private android.text.SpannableString spannableFormattedAmount;
    private int timeout;

    private TransactionalPinpadParams() {
    }

    public android.text.SpannableString getSpannableFormattedAmount() {
        return this.spannableFormattedAmount;
    }

    public java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    public java.lang.String getCurrency() {
        return this.currency;
    }

    public boolean isCurrencyDisplayBack() {
        return this.isCurrencyDisplayBack;
    }

    public byte[] getPanToken() {
        return this.panToken;
    }

    public int getDrawableBtnOKColor() {
        return this.drawableBtnOKColor;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public boolean isFallbackMode() {
        return this.isFallbackMode;
    }

    public int getPlaceholderCount() {
        return this.placeholderCount;
    }

    public static class Builder {
        private java.lang.String currency;
        private int drawableBtnOKColor;
        private java.lang.String formattedAmount;
        private boolean isCurrencyDisplayBack;
        private boolean isFallbackMode;
        private byte[] panToken;
        private int placeholderCount;
        private android.text.SpannableString spannableFormattedAmount;
        private int timeout;

        private Builder() {
        }

        public static my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder create() {
            return new my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder();
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setSpannableFormattedAmount(android.text.SpannableString spannableString) {
            this.spannableFormattedAmount = spannableString;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setFormattedAmount(java.lang.String str) {
            this.formattedAmount = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setCurrency(java.lang.String str) {
            this.currency = str;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setCurrencyDisplayBack(boolean z) {
            this.isCurrencyDisplayBack = z;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setPanToken(byte[] bArr) {
            this.panToken = bArr;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setDrawableBtnOKColor(int i) {
            this.drawableBtnOKColor = i;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setTimeout(int i) {
            this.timeout = i;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setFallbackMode(boolean z) {
            this.isFallbackMode = z;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder setPlaceholderCount(int i) {
            this.placeholderCount = i;
            return this;
        }

        public my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams build() {
            my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams transactionalPinpadParams = new my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams((byte) 0);
            transactionalPinpadParams.spannableFormattedAmount = this.spannableFormattedAmount;
            transactionalPinpadParams.formattedAmount = this.formattedAmount;
            transactionalPinpadParams.currency = this.currency;
            transactionalPinpadParams.isCurrencyDisplayBack = this.isCurrencyDisplayBack;
            transactionalPinpadParams.panToken = this.panToken;
            transactionalPinpadParams.drawableBtnOKColor = this.drawableBtnOKColor;
            transactionalPinpadParams.timeout = this.timeout;
            transactionalPinpadParams.isFallbackMode = this.isFallbackMode;
            transactionalPinpadParams.placeholderCount = this.placeholderCount;
            return transactionalPinpadParams;
        }
    }

    /* synthetic */ TransactionalPinpadParams(byte b) {
        this();
    }
}

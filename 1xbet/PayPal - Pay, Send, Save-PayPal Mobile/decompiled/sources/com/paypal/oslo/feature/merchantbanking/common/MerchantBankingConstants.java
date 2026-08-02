package com.paypal.oslo.feature.merchantbanking.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/common/MerchantBankingConstants;", "", "<init>", "()V", "Masking", "Formatting", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.HttpStatus}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MerchantBankingConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants INSTANCE = new com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants();

    private MerchantBankingConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/common/MerchantBankingConstants$Masking;", "", "<init>", "()V", "", "ACCOUNT_MASKED_DIGITS_COUNT", com.visa.cbp.getEncExpo.warmup, "MIN_MASKABLE_LENGTH", "", "BULLET_CHARACTER", "Ljava/lang/String;", "BULLET_MASK_PREFIX"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Masking {
        public static final int $stable = 0;
        public static final int ACCOUNT_MASKED_DIGITS_COUNT = 4;
        public static final java.lang.String BULLET_CHARACTER = "•";
        public static final java.lang.String BULLET_MASK_PREFIX = "•••• ";
        public static final com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.Masking INSTANCE = new com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.Masking();
        public static final int MIN_MASKABLE_LENGTH = 9;

        private Masking() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/common/MerchantBankingConstants$Formatting;", "", "<init>", "()V", "", "ACCOUNT_NUMBER_SPACE_INDEX", com.visa.cbp.getEncExpo.warmup, "ROUTING_NUMBER_SPACE_INDEX", "", "SPACE", "Ljava/lang/String;", "EMPTY_STRING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Formatting {
        public static final int $stable = 0;
        public static final int ACCOUNT_NUMBER_SPACE_INDEX = 4;
        public static final java.lang.String EMPTY_STRING = "";
        public static final com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.Formatting INSTANCE = new com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.Formatting();
        public static final int ROUTING_NUMBER_SPACE_INDEX = 3;
        public static final java.lang.String SPACE = " ";

        private Formatting() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/common/MerchantBankingConstants$HttpStatus;", "", "<init>", "()V", "", "CLIENT_ERROR_START", com.visa.cbp.getEncExpo.warmup, "CLIENT_ERROR_END", "SERVER_ERROR_START", "SERVER_ERROR_END"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HttpStatus {
        public static final int $stable = 0;
        public static final int CLIENT_ERROR_END = 499;
        public static final int CLIENT_ERROR_START = 400;
        public static final com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.HttpStatus INSTANCE = new com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.HttpStatus();
        public static final int SERVER_ERROR_END = 599;
        public static final int SERVER_ERROR_START = 500;

        private HttpStatus() {
        }
    }
}

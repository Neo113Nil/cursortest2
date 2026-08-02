package com.paypal.oslo.feature.directdeposit.constants;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/constants/DirectDepositConstants;", "", "<init>", "()V", "RemoteConfig", "Retry", "Urls", "BalanceIntegration", "Form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants INSTANCE = new com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants();

    private DirectDepositConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/constants/DirectDepositConstants$RemoteConfig;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "MAIN_FEATURE_KEY", "SMART_ROUTE_FEATURE_KEY", "BUNDLE_ENROLLMENT_FEATURE_KEY", "EARLY_ACCESS_ENROLLED_KEY", "FILL_OUT_FORM_FEATURE_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RemoteConfig {
        public static final int $stable = 0;
        public static final java.lang.String BUNDLE_ENROLLMENT_FEATURE_KEY = "banking_bundle_enrollment";
        public static final java.lang.String DOMAIN = "directdeposit";
        public static final java.lang.String EARLY_ACCESS_ENROLLED_KEY = "early_access_enrolled";
        public static final java.lang.String FILL_OUT_FORM_FEATURE_KEY = "fill_out_form_enabled";
        public static final com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig INSTANCE = new com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig();
        public static final java.lang.String MAIN_FEATURE_KEY = "mainfeature";
        public static final java.lang.String SMART_ROUTE_FEATURE_KEY = "smart_route_entry_point_enabled";

        private RemoteConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/constants/DirectDepositConstants$Retry;", "", "<init>", "()V", "", "MAX_RETRY_ATTEMPTS", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Retry {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Retry INSTANCE = new com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Retry();
        public static final int MAX_RETRY_ATTEMPTS = 3;

        private Retry() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/constants/DirectDepositConstants$Urls;", "", "<init>", "()V", "", "PROGRAM_BANKS", "Ljava/lang/String;", "LEARN_MORE", "PROGRAM_BANK", "PAYPAL_BALANCE_TERMS", "USER_AGREEMENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Urls {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Urls INSTANCE = new com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Urls();
        public static final java.lang.String LEARN_MORE = "https://www.paypal.com/us/legalhub/paypal/pp-balance-tnc";
        public static final java.lang.String PAYPAL_BALANCE_TERMS = "https://www.paypal.com/us/legalhub/paypal/pp-balance-tnc";
        public static final java.lang.String PROGRAM_BANK = "https://www.paypal.com/us/legalhub/paypal/program-banks-tnc";
        public static final java.lang.String PROGRAM_BANKS = "https://www.paypal.com/us/legalhub/paypal/program-banks-tnc";
        public static final java.lang.String USER_AGREEMENT = "https://www.paypal.com/us/legalhub/useragreement-full";

        private Urls() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/constants/DirectDepositConstants$BalanceIntegration;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "BALANCE_L2_SMART_ROUTE_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceIntegration {
        public static final int $stable = 0;
        public static final java.lang.String BALANCE_L2_SMART_ROUTE_KEY = "balance_l2_smart_route";
        public static final java.lang.String DOMAIN = "money_management";
        public static final com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.BalanceIntegration INSTANCE = new com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.BalanceIntegration();

        private BalanceIntegration() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/constants/DirectDepositConstants$Form;", "", "<init>", "()V", "", "MIN_COMPANY_NAME_LENGTH", com.visa.cbp.getEncExpo.warmup, "MAX_COMPANY_NAME_LENGTH", "", com.zettle.sdk.commons.network.JsonKt.KEY_INSTALLMENT_MIN_AMOUNT, "D", "MAX_PERCENTAGE_NUMBER", "MAX_AMOUNT_NUMBER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Form {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Form INSTANCE = new com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.Form();
        public static final double MAX_AMOUNT_NUMBER = 999999.0d;
        public static final int MAX_COMPANY_NAME_LENGTH = 91;
        public static final double MAX_PERCENTAGE_NUMBER = 100.0d;
        public static final double MIN_AMOUNT = 0.01d;
        public static final int MIN_COMPANY_NAME_LENGTH = 2;

        private Form() {
        }
    }
}

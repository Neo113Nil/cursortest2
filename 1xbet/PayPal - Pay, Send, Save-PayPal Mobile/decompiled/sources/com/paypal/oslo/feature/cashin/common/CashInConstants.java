package com.paypal.oslo.feature.cashin.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/common/CashInConstants;", "", "<init>", "()V", "RemoteConfig", "DebitCardIntegration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cashin.common.CashInConstants INSTANCE = new com.paypal.oslo.feature.cashin.common.CashInConstants();

    private CashInConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/common/CashInConstants$RemoteConfig;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "MAIN_FEATURE_KEY", "EXPERIMENT_NAME_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RemoteConfig {
        public static final int $stable = 0;
        public static final java.lang.String DOMAIN = "cashin";
        public static final java.lang.String EXPERIMENT_NAME_KEY = "experiment_name";
        public static final com.paypal.oslo.feature.cashin.common.CashInConstants.RemoteConfig INSTANCE = new com.paypal.oslo.feature.cashin.common.CashInConstants.RemoteConfig();
        public static final java.lang.String MAIN_FEATURE_KEY = "mainfeature";

        private RemoteConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/common/CashInConstants$DebitCardIntegration;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "ACQUISITION_ENTRYPOINT_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DebitCardIntegration {
        public static final int $stable = 0;
        public static final java.lang.String ACQUISITION_ENTRYPOINT_KEY = "acquisition_entrypoint_enabled";
        public static final java.lang.String DOMAIN = "debit_card";
        public static final com.paypal.oslo.feature.cashin.common.CashInConstants.DebitCardIntegration INSTANCE = new com.paypal.oslo.feature.cashin.common.CashInConstants.DebitCardIntegration();

        private DebitCardIntegration() {
        }
    }
}

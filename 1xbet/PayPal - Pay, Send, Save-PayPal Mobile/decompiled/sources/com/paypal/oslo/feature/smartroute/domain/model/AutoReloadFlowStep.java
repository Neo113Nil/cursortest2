package com.paypal.oslo.feature.smartroute.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "", "<init>", "(Ljava/lang/String;I)V", "FETCH_SETUP_DETAILS", "VALIDATE_SAVINGS_BALANCE", "SETUP_AUTO_RELOAD", "DEACTIVATE_AUTO_RELOAD", "UPDATE_SMART_ROUTE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoReloadFlowStep {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep DEACTIVATE_AUTO_RELOAD;
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep FETCH_SETUP_DETAILS;
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep SETUP_AUTO_RELOAD;
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep UPDATE_SMART_ROUTE;
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep VALIDATE_SAVINGS_BALANCE;
    private static final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep[] getHighResolutionOutputSizeshNQ4ISI;

    private AutoReloadFlowStep(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep("FETCH_SETUP_DETAILS", 0);
        FETCH_SETUP_DETAILS = autoReloadFlowStep;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep2 = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep("VALIDATE_SAVINGS_BALANCE", 1);
        VALIDATE_SAVINGS_BALANCE = autoReloadFlowStep2;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep3 = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep("SETUP_AUTO_RELOAD", 2);
        SETUP_AUTO_RELOAD = autoReloadFlowStep3;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep4 = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep("DEACTIVATE_AUTO_RELOAD", 3);
        DEACTIVATE_AUTO_RELOAD = autoReloadFlowStep4;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep5 = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep("UPDATE_SMART_ROUTE", 4);
        UPDATE_SMART_ROUTE = autoReloadFlowStep5;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep[] autoReloadFlowStepArr = {autoReloadFlowStep, autoReloadFlowStep2, autoReloadFlowStep3, autoReloadFlowStep4, autoReloadFlowStep5};
        getHighResolutionOutputSizeshNQ4ISI = autoReloadFlowStepArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(autoReloadFlowStepArr);
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep[] values() {
        return (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep) java.lang.Enum.valueOf(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

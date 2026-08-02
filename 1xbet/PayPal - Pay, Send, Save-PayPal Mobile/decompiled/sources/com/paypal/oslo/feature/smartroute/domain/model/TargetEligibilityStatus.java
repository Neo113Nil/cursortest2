package com.paypal.oslo.feature.smartroute.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/TargetEligibilityStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, "PROVISIONED", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TargetEligibilityStatus {
    public static final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus INELIGIBLE;
    public static final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus PROVISIONED;
    public static final com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus[] getHighSpeedVideoSizes;

    private TargetEligibilityStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus = new com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0);
        ELIGIBLE = targetEligibilityStatus;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus2 = new com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus("PROVISIONED", 1);
        PROVISIONED = targetEligibilityStatus2;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus3 = new com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 2);
        INELIGIBLE = targetEligibilityStatus3;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus targetEligibilityStatus4 = new com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus("UNKNOWN", 3);
        UNKNOWN = targetEligibilityStatus4;
        com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus[] targetEligibilityStatusArr = {targetEligibilityStatus, targetEligibilityStatus2, targetEligibilityStatus3, targetEligibilityStatus4};
        getHighSpeedVideoSizes = targetEligibilityStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(targetEligibilityStatusArr);
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus[] values() {
        return (com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

package com.paypal.oslo.feature.bankingbundle.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/model/EligibilityStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "ELIGIBLE_WITH_CONDITION", "BUNDLE_PROVISIONED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EligibilityStatus {
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus BUNDLE_PROVISIONED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus ELIGIBLE_WITH_CONDITION;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private EligibilityStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0);
        ELIGIBLE = eligibilityStatus;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus2 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 1);
        INELIGIBLE = eligibilityStatus2;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus3 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus("ELIGIBLE_WITH_CONDITION", 2);
        ELIGIBLE_WITH_CONDITION = eligibilityStatus3;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus4 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus("BUNDLE_PROVISIONED", 3);
        BUNDLE_PROVISIONED = eligibilityStatus4;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus[] eligibilityStatusArr = {eligibilityStatus, eligibilityStatus2, eligibilityStatus3, eligibilityStatus4};
        getHighResolutionOutputSizeshNQ4ISI = eligibilityStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(eligibilityStatusArr);
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus[] values() {
        return (com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

package com.paypal.oslo.feature.qrc.domain.model.eligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, "ELIGIBLE_WITH_CONDITIONS", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "ENROLLED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcEligibilityStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus ELIGIBLE_WITH_CONDITIONS;
    public static final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus ENROLLED;
    public static final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus[] getHighSpeedVideoFpsRanges;

    private QrcEligibilityStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus = new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0);
        ELIGIBLE = qrcEligibilityStatus;
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus2 = new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus("ELIGIBLE_WITH_CONDITIONS", 1);
        ELIGIBLE_WITH_CONDITIONS = qrcEligibilityStatus2;
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus3 = new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 2);
        INELIGIBLE = qrcEligibilityStatus3;
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus4 = new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus("ENROLLED", 3);
        ENROLLED = qrcEligibilityStatus4;
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus[] qrcEligibilityStatusArr = {qrcEligibilityStatus, qrcEligibilityStatus2, qrcEligibilityStatus3, qrcEligibilityStatus4};
        getHighSpeedVideoFpsRanges = qrcEligibilityStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(qrcEligibilityStatusArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

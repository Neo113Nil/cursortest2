package com.paypal.oslo.feature.qrc.domain.model.enrollment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentNextAction;", "", "<init>", "(Ljava/lang/String;I)V", "STEPUP_AUTH_REQUIRED", "IDENTITY_VERIFICATION_REQUIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcEnrollmentNextAction {
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction IDENTITY_VERIFICATION_REQUIRED;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction STEPUP_AUTH_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private QrcEnrollmentNextAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction qrcEnrollmentNextAction = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction("STEPUP_AUTH_REQUIRED", 0);
        STEPUP_AUTH_REQUIRED = qrcEnrollmentNextAction;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction qrcEnrollmentNextAction2 = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction("IDENTITY_VERIFICATION_REQUIRED", 1);
        IDENTITY_VERIFICATION_REQUIRED = qrcEnrollmentNextAction2;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction[] qrcEnrollmentNextActionArr = {qrcEnrollmentNextAction, qrcEnrollmentNextAction2};
        Camera2StreamConfigurationMap = qrcEnrollmentNextActionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(qrcEnrollmentNextActionArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

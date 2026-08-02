package com.paypal.oslo.feature.qrc.domain.model.enrollment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ENROLLED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "NEED_MORE_DATA"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcEnrollmentStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus DENIED;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus ENROLLED;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus NEED_MORE_DATA;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus PENDING;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus[] getHighSpeedVideoSizes;

    private QrcEnrollmentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus qrcEnrollmentStatus = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus("ENROLLED", 0);
        ENROLLED = qrcEnrollmentStatus;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus qrcEnrollmentStatus2 = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 1);
        DENIED = qrcEnrollmentStatus2;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus qrcEnrollmentStatus3 = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 2);
        PENDING = qrcEnrollmentStatus3;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus qrcEnrollmentStatus4 = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus("NEED_MORE_DATA", 3);
        NEED_MORE_DATA = qrcEnrollmentStatus4;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus[] qrcEnrollmentStatusArr = {qrcEnrollmentStatus, qrcEnrollmentStatus2, qrcEnrollmentStatus3, qrcEnrollmentStatus4};
        getHighSpeedVideoSizes = qrcEnrollmentStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(qrcEnrollmentStatusArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

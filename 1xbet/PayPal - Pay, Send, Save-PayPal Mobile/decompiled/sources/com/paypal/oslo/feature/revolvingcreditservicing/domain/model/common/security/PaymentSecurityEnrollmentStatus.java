package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "ENROLLED", "UNENROLLED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentSecurityEnrollmentStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus CANCELED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus ENROLLED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus PENDING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus UNENROLLED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus[] getHighResolutionOutputSizeshNQ4ISI;

    private PaymentSecurityEnrollmentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 0);
        CANCELED = paymentSecurityEnrollmentStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1);
        PENDING = paymentSecurityEnrollmentStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus("ENROLLED", 2);
        ENROLLED = paymentSecurityEnrollmentStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus("UNENROLLED", 3);
        UNENROLLED = paymentSecurityEnrollmentStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus("UNKNOWN", 4);
        UNKNOWN = paymentSecurityEnrollmentStatus5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus[] paymentSecurityEnrollmentStatusArr = {paymentSecurityEnrollmentStatus, paymentSecurityEnrollmentStatus2, paymentSecurityEnrollmentStatus3, paymentSecurityEnrollmentStatus4, paymentSecurityEnrollmentStatus5};
        getHighResolutionOutputSizeshNQ4ISI = paymentSecurityEnrollmentStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentSecurityEnrollmentStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

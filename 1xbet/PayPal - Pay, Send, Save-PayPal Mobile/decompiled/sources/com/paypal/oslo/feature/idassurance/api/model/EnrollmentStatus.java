package com.paypal.oslo.feature.idassurance.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/idassurance/api/model/EnrollmentStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "NOT_STARTED", "WAITING_FOR_CUSTOMER", "UNDER_PROCESSING", "UNDER_REVIEW", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "TOKEN_EXPIRED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnrollmentStatus {
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus CANCELLED;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus COMPLETED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus FAILED;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus NOT_STARTED;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus TOKEN_EXPIRED;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus UNDER_PROCESSING;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus UNDER_REVIEW;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus UNKNOWN;
    public static final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus WAITING_FOR_CUSTOMER;
    private static final /* synthetic */ com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus[] getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private EnrollmentStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("NOT_STARTED", 0, "NOT_STARTED");
        NOT_STARTED = enrollmentStatus;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus2 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("WAITING_FOR_CUSTOMER", 1, "WAITING_FOR_CUSTOMER");
        WAITING_FOR_CUSTOMER = enrollmentStatus2;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus3 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("UNDER_PROCESSING", 2, "UNDER_PROCESSING");
        UNDER_PROCESSING = enrollmentStatus3;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus4 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("UNDER_REVIEW", 3, "UNDER_REVIEW");
        UNDER_REVIEW = enrollmentStatus4;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus5 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("COMPLETED", 4, "COMPLETED");
        COMPLETED = enrollmentStatus5;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus6 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 5, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = enrollmentStatus6;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus7 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 6, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        CANCELLED = enrollmentStatus7;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus8 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("TOKEN_EXPIRED", 7, "TOKEN_EXPIRED");
        TOKEN_EXPIRED = enrollmentStatus8;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus9 = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus("UNKNOWN", 8, "UNKNOWN");
        UNKNOWN = enrollmentStatus9;
        com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus[] enrollmentStatusArr = {enrollmentStatus, enrollmentStatus2, enrollmentStatus3, enrollmentStatus4, enrollmentStatus5, enrollmentStatus6, enrollmentStatus7, enrollmentStatus8, enrollmentStatus9};
        getHighSpeedVideoFpsRanges = enrollmentStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(enrollmentStatusArr);
        INSTANCE = new com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/idassurance/api/model/EnrollmentStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/idassurance/api/model/EnrollmentStatus;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/idassurance/api/model/EnrollmentStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus enrollmentStatus = (com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus) obj;
            return enrollmentStatus == null ? com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus.UNKNOWN : enrollmentStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus[] values() {
        return (com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.idassurance.api.model.EnrollmentStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

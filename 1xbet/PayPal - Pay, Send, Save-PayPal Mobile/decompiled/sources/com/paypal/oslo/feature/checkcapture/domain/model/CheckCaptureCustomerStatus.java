package com.paypal.oslo.feature.checkcapture.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "NEW", "EXISTING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureCustomerStatus {
    private static final /* synthetic */ com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus EXISTING;
    public static final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus NEW;
    public static final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private CheckCaptureCustomerStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus = new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus("NEW", 0, "NEW");
        NEW = checkCaptureCustomerStatus;
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus2 = new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus("EXISTING", 1, "EXISTING");
        EXISTING = checkCaptureCustomerStatus2;
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus3 = new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus("UNKNOWN", 2, "UNKNOWN");
        UNKNOWN = checkCaptureCustomerStatus3;
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus[] checkCaptureCustomerStatusArr = {checkCaptureCustomerStatus, checkCaptureCustomerStatus2, checkCaptureCustomerStatus3};
        Camera2StreamConfigurationMap = checkCaptureCustomerStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(checkCaptureCustomerStatusArr);
        INSTANCE = new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus$Companion;", "", "<init>", "()V", "", "status", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus fromString(java.lang.String status) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus) obj).getValue(), status, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus = (com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus) obj;
            return checkCaptureCustomerStatus == null ? com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus.UNKNOWN : checkCaptureCustomerStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus[] values() {
        return (com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

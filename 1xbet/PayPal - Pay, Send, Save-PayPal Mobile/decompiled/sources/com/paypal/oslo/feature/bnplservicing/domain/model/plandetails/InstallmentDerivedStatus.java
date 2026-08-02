package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "DUE_TODAY", "DELINQUENT", "PAID", "PAST_DUE", "SCHEDULED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentDerivedStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus DELINQUENT;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus DUE_TODAY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus PAID;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus PAST_DUE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus SCHEDULED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private InstallmentDerivedStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus("DUE_TODAY", 0);
        DUE_TODAY = installmentDerivedStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus2 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus("DELINQUENT", 1);
        DELINQUENT = installmentDerivedStatus2;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus3 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus("PAID", 2);
        PAID = installmentDerivedStatus3;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus4 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus("PAST_DUE", 3);
        PAST_DUE = installmentDerivedStatus4;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus5 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus("SCHEDULED", 4);
        SCHEDULED = installmentDerivedStatus5;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus6 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus("UNKNOWN", 5);
        UNKNOWN = installmentDerivedStatus6;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus[] installmentDerivedStatusArr = {installmentDerivedStatus, installmentDerivedStatus2, installmentDerivedStatus3, installmentDerivedStatus4, installmentDerivedStatus5, installmentDerivedStatus6};
        getHighResolutionOutputSizeshNQ4ISI = installmentDerivedStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(installmentDerivedStatusArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDerivedStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus installmentDerivedStatus = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus) obj;
            return installmentDerivedStatus == null ? com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.UNKNOWN : installmentDerivedStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

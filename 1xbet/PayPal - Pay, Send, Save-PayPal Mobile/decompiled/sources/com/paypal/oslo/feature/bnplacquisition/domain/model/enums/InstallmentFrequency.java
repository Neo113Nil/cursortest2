package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "MONTHLY", "BI_WEEKLY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentFrequency {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency BI_WEEKLY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency MONTHLY;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency[] getHighSpeedVideoFpsRangesFor;

    private InstallmentFrequency(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency("MONTHLY", 0);
        MONTHLY = installmentFrequency;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency("BI_WEEKLY", 1);
        BI_WEEKLY = installmentFrequency2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency installmentFrequency3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency("UNKNOWN", 2);
        UNKNOWN = installmentFrequency3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency[] installmentFrequencyArr = {installmentFrequency, installmentFrequency2, installmentFrequency3};
        getHighSpeedVideoFpsRangesFor = installmentFrequencyArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(installmentFrequencyArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/InstallmentFrequency;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency fromString(java.lang.String value) {
            java.lang.String str;
            if (value != null) {
                str = value.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            } else {
                str = null;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(str, "P1M") ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.MONTHLY : kotlin.jvm.internal.Intrinsics.areEqual(str, "P2W") ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.BI_WEEKLY : com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

package com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "ELIGIBLE_WITH_CONDITION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EligibilityStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus ELIGIBLE_WITH_CONDITION;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private EligibilityStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus = new com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE);
        ELIGIBLE = eligibilityStatus;
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 1, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE);
        INELIGIBLE = eligibilityStatus2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus("ELIGIBLE_WITH_CONDITION", 2, "ELIGIBLE_WITH_CONDITION");
        ELIGIBLE_WITH_CONDITION = eligibilityStatus3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus[] eligibilityStatusArr = {eligibilityStatus, eligibilityStatus2, eligibilityStatus3};
        getHighSpeedVideoFpsRangesFor = eligibilityStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(eligibilityStatusArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus = (com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus) obj;
            return eligibilityStatus == null ? com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE : eligibilityStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

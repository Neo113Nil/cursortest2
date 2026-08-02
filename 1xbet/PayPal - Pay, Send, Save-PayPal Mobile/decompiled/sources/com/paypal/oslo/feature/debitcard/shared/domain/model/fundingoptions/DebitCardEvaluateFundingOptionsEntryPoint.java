package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "MANAGE_CARD", "CHANGE_FI", "REQUEST_PHYSICAL_CARD", "TAP_TO_PAY_CARD_PROVISIONING_FLOW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardEvaluateFundingOptionsEntryPoint {
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint CHANGE_FI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint MANAGE_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint REQUEST_PHYSICAL_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint TAP_TO_PAY_CARD_PROVISIONING_FLOW;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint[] getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private DebitCardEvaluateFundingOptionsEntryPoint(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint("MANAGE_CARD", 0, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.MANAGE_CARD_FEATURE);
        MANAGE_CARD = debitCardEvaluateFundingOptionsEntryPoint;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint("CHANGE_FI", 1, "change_fi");
        CHANGE_FI = debitCardEvaluateFundingOptionsEntryPoint2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint("REQUEST_PHYSICAL_CARD", 2, "request_physical_card_change_fi");
        REQUEST_PHYSICAL_CARD = debitCardEvaluateFundingOptionsEntryPoint3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint debitCardEvaluateFundingOptionsEntryPoint4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint("TAP_TO_PAY_CARD_PROVISIONING_FLOW", 3, "tap_to_pay_card_provisioning_flow");
        TAP_TO_PAY_CARD_PROVISIONING_FLOW = debitCardEvaluateFundingOptionsEntryPoint4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint[] debitCardEvaluateFundingOptionsEntryPointArr = {debitCardEvaluateFundingOptionsEntryPoint, debitCardEvaluateFundingOptionsEntryPoint2, debitCardEvaluateFundingOptionsEntryPoint3, debitCardEvaluateFundingOptionsEntryPoint4};
        getHighSpeedVideoFpsRanges = debitCardEvaluateFundingOptionsEntryPointArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(debitCardEvaluateFundingOptionsEntryPointArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardEvaluateFundingOptionsEntryPoint;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

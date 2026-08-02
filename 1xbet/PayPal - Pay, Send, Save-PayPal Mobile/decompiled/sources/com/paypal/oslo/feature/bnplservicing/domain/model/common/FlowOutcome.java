package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowOutcome;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CREDIT_FINANCIAL_INSTRUMENT", "VIRTUAL_CREDIT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowOutcome {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome CREDIT_FINANCIAL_INSTRUMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome UNKNOWN;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome VIRTUAL_CREDIT_CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome[] getHighSpeedVideoSizes;

    private FlowOutcome(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome flowOutcome = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome("CREDIT_FINANCIAL_INSTRUMENT", 0);
        CREDIT_FINANCIAL_INSTRUMENT = flowOutcome;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome flowOutcome2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome("VIRTUAL_CREDIT_CARD", 1);
        VIRTUAL_CREDIT_CARD = flowOutcome2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome flowOutcome3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome("UNKNOWN", 2);
        UNKNOWN = flowOutcome3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome[] flowOutcomeArr = {flowOutcome, flowOutcome2, flowOutcome3};
        getHighSpeedVideoSizes = flowOutcomeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(flowOutcomeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowOutcome$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowOutcome;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowOutcome;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome flowOutcome = (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome) obj;
            return flowOutcome == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.UNKNOWN : flowOutcome;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

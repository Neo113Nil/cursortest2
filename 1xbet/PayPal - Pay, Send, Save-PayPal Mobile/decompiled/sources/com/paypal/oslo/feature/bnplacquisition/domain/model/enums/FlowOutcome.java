package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowOutcome;", "", "<init>", "(Ljava/lang/String;I)V", "VIRTUAL_CREDIT_CARD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowOutcome {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome UNKNOWN__;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome VIRTUAL_CREDIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome[] getHighSpeedVideoSizes;

    private FlowOutcome(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome("VIRTUAL_CREDIT_CARD", 0);
        VIRTUAL_CREDIT_CARD = flowOutcome;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome("UNKNOWN__", 1);
        UNKNOWN__ = flowOutcome2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome[] flowOutcomeArr = {flowOutcome, flowOutcome2};
        getHighSpeedVideoSizes = flowOutcomeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(flowOutcomeArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

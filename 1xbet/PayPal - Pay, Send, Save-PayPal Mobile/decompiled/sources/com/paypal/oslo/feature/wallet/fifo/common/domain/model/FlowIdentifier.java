package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;", "", "<init>", "(Ljava/lang/String;)V", "CONSUMER_TRANSFERS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlowIdentifier {
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier CONSUMER_TRANSFERS;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier[] getHighResolutionOutputSizeshNQ4ISI;

    private FlowIdentifier(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier flowIdentifier = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier("CONSUMER_TRANSFERS");
        CONSUMER_TRANSFERS = flowIdentifier;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier[] flowIdentifierArr = {flowIdentifier};
        getHighResolutionOutputSizeshNQ4ISI = flowIdentifierArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(flowIdentifierArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

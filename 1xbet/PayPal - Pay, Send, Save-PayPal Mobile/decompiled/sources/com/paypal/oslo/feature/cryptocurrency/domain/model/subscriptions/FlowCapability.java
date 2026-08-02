package com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "capabilityName", "Ljava/lang/String;", "getCapabilityName", "()Ljava/lang/String;", "SELL_CRYPTO", "BUY_CRYPTO", "HOLD_CRYPTO", "RECEIVE_CRYPTO", "SEND_CRYPTO", "BUY_SELL_CRYPTO", "REDEEM_CRYPTO"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlowCapability {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability BUY_CRYPTO;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability BUY_SELL_CRYPTO;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability HOLD_CRYPTO;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability RECEIVE_CRYPTO;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability REDEEM_CRYPTO;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability SELL_CRYPTO;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability SEND_CRYPTO;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String capabilityName;

    private FlowCapability(java.lang.String str, int i, java.lang.String str2) {
        this.capabilityName = str2;
    }

    public final java.lang.String getCapabilityName() {
        return this.capabilityName;
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("SELL_CRYPTO", 0, "SELL_CRYPTO");
        SELL_CRYPTO = flowCapability;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("BUY_CRYPTO", 1, "BUY_CRYPTO");
        BUY_CRYPTO = flowCapability2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("HOLD_CRYPTO", 2, "HOLD_CRYPTO");
        HOLD_CRYPTO = flowCapability3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability4 = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("RECEIVE_CRYPTO", 3, "RECEIVE_CRYPTO_ON_BLOCKCHAIN");
        RECEIVE_CRYPTO = flowCapability4;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability5 = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("SEND_CRYPTO", 4, "SEND_CRYPTO_ON_BLOCKCHAIN");
        SEND_CRYPTO = flowCapability5;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability6 = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("BUY_SELL_CRYPTO", 5, "BUY_SELL_CRYPTO");
        BUY_SELL_CRYPTO = flowCapability6;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability7 = new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability("REDEEM_CRYPTO", 6, "BUY_SELL_SEND_CRYPTO");
        REDEEM_CRYPTO = flowCapability7;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability[] flowCapabilityArr = {flowCapability, flowCapability2, flowCapability3, flowCapability4, flowCapability5, flowCapability6, flowCapability7};
        getHighSpeedVideoFpsRangesFor = flowCapabilityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(flowCapabilityArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

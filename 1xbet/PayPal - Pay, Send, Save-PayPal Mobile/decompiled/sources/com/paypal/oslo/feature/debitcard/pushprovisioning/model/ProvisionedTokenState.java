package com.paypal.oslo.feature.debitcard.pushprovisioning.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/ProvisionedTokenState;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "REQUIRES_ACTIVATION", "ACTIVATING", "SUSPENDED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProvisionedTokenState {
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState ACTIVATING;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState ACTIVE;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState REQUIRES_ACTIVATION;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState SUSPENDED;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState[] getHighSpeedVideoSizes;

    private ProvisionedTokenState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState provisionedTokenState = new com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = provisionedTokenState;
        com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState provisionedTokenState2 = new com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState("REQUIRES_ACTIVATION", 1);
        REQUIRES_ACTIVATION = provisionedTokenState2;
        com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState provisionedTokenState3 = new com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState("ACTIVATING", 2);
        ACTIVATING = provisionedTokenState3;
        com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState provisionedTokenState4 = new com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState("SUSPENDED", 3);
        SUSPENDED = provisionedTokenState4;
        com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState provisionedTokenState5 = new com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState("UNKNOWN", 4);
        UNKNOWN = provisionedTokenState5;
        com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState[] provisionedTokenStateArr = {provisionedTokenState, provisionedTokenState2, provisionedTokenState3, provisionedTokenState4, provisionedTokenState5};
        getHighSpeedVideoSizes = provisionedTokenStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(provisionedTokenStateArr);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState[] values() {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.pushprovisioning.model.ProvisionedTokenState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

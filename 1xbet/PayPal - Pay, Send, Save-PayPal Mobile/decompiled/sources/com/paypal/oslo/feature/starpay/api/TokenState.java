package com.paypal.oslo.feature.starpay.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/TokenState;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "REQUIRES_ACTIVATION", "ACTIVATING", "SUSPENDED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenState {
    public static final com.paypal.oslo.feature.starpay.api.TokenState ACTIVATING;
    public static final com.paypal.oslo.feature.starpay.api.TokenState ACTIVE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.starpay.api.TokenState REQUIRES_ACTIVATION;
    public static final com.paypal.oslo.feature.starpay.api.TokenState SUSPENDED;
    public static final com.paypal.oslo.feature.starpay.api.TokenState UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.starpay.api.TokenState[] getHighResolutionOutputSizeshNQ4ISI;

    private TokenState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.starpay.api.TokenState tokenState = new com.paypal.oslo.feature.starpay.api.TokenState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = tokenState;
        com.paypal.oslo.feature.starpay.api.TokenState tokenState2 = new com.paypal.oslo.feature.starpay.api.TokenState("REQUIRES_ACTIVATION", 1);
        REQUIRES_ACTIVATION = tokenState2;
        com.paypal.oslo.feature.starpay.api.TokenState tokenState3 = new com.paypal.oslo.feature.starpay.api.TokenState("ACTIVATING", 2);
        ACTIVATING = tokenState3;
        com.paypal.oslo.feature.starpay.api.TokenState tokenState4 = new com.paypal.oslo.feature.starpay.api.TokenState("SUSPENDED", 3);
        SUSPENDED = tokenState4;
        com.paypal.oslo.feature.starpay.api.TokenState tokenState5 = new com.paypal.oslo.feature.starpay.api.TokenState("UNKNOWN", 4);
        UNKNOWN = tokenState5;
        com.paypal.oslo.feature.starpay.api.TokenState[] tokenStateArr = {tokenState, tokenState2, tokenState3, tokenState4, tokenState5};
        getHighResolutionOutputSizeshNQ4ISI = tokenStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(tokenStateArr);
    }

    public static com.paypal.oslo.feature.starpay.api.TokenState[] values() {
        return (com.paypal.oslo.feature.starpay.api.TokenState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.starpay.api.TokenState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.starpay.api.TokenState) java.lang.Enum.valueOf(com.paypal.oslo.feature.starpay.api.TokenState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.starpay.api.TokenState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

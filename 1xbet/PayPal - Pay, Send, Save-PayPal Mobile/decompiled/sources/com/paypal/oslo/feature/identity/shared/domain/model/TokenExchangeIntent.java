package com.paypal.oslo.feature.identity.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/TokenExchangeIntent;", "", "<init>", "(Ljava/lang/String;I)V", "WEB_SINGLE_SIGN_ON", "INTERAPP_SINGLE_SIGN_ON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TokenExchangeIntent {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent INTERAPP_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent WEB_SINGLE_SIGN_ON;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent[] getHighSpeedVideoFpsRangesFor;

    private TokenExchangeIntent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent tokenExchangeIntent = new com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent("WEB_SINGLE_SIGN_ON", 0);
        WEB_SINGLE_SIGN_ON = tokenExchangeIntent;
        com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent tokenExchangeIntent2 = new com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent("INTERAPP_SINGLE_SIGN_ON", 1);
        INTERAPP_SINGLE_SIGN_ON = tokenExchangeIntent2;
        com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent[] tokenExchangeIntentArr = {tokenExchangeIntent, tokenExchangeIntent2};
        getHighSpeedVideoFpsRangesFor = tokenExchangeIntentArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tokenExchangeIntentArr);
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent[] values() {
        return (com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

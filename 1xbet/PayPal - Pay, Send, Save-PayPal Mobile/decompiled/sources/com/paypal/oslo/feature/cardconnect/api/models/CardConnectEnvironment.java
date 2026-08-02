package com.paypal.oslo.feature.cardconnect.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCTION", "STAGE", "SANDBOX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardConnectEnvironment {
    public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment PRODUCTION;
    public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment SANDBOX;
    public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment STAGE;
    private static final /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CardConnectEnvironment(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment("PRODUCTION", 0);
        PRODUCTION = cardConnectEnvironment;
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment2 = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment("STAGE", 1);
        STAGE = cardConnectEnvironment2;
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment3 = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment("SANDBOX", 2);
        SANDBOX = cardConnectEnvironment3;
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment[] cardConnectEnvironmentArr = {cardConnectEnvironment, cardConnectEnvironment2, cardConnectEnvironment3};
        getHighResolutionOutputSizeshNQ4ISI = cardConnectEnvironmentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cardConnectEnvironmentArr);
    }

    public static com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment[] values() {
        return (com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment) java.lang.Enum.valueOf(com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

package com.paypal.oslo.feature.starpay.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "", "<init>", "(Ljava/lang/String;I)V", "VISA", "MASTERCARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardNetwork {
    public static final com.paypal.oslo.feature.starpay.api.CardNetwork MASTERCARD;
    public static final com.paypal.oslo.feature.starpay.api.CardNetwork VISA;
    private static final /* synthetic */ com.paypal.oslo.feature.starpay.api.CardNetwork[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CardNetwork(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork = new com.paypal.oslo.feature.starpay.api.CardNetwork("VISA", 0);
        VISA = cardNetwork;
        com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork2 = new com.paypal.oslo.feature.starpay.api.CardNetwork("MASTERCARD", 1);
        MASTERCARD = cardNetwork2;
        com.paypal.oslo.feature.starpay.api.CardNetwork[] cardNetworkArr = {cardNetwork, cardNetwork2};
        getHighSpeedVideoFpsRanges = cardNetworkArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cardNetworkArr);
    }

    public static com.paypal.oslo.feature.starpay.api.CardNetwork[] values() {
        return (com.paypal.oslo.feature.starpay.api.CardNetwork[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.starpay.api.CardNetwork valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.starpay.api.CardNetwork) java.lang.Enum.valueOf(com.paypal.oslo.feature.starpay.api.CardNetwork.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.starpay.api.CardNetwork> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

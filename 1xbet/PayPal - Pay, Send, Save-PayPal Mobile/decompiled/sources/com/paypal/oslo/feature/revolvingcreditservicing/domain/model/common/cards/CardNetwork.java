package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;", "", "<init>", "(Ljava/lang/String;I)V", "MASTERCARD", "VISA", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardNetwork {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork MASTERCARD;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork UNKNOWN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork VISA;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CardNetwork(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork("MASTERCARD", 0);
        MASTERCARD = cardNetwork;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork("VISA", 1);
        VISA = cardNetwork2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork cardNetwork3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork("UNKNOWN", 2);
        UNKNOWN = cardNetwork3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork[] cardNetworkArr = {cardNetwork, cardNetwork2, cardNetwork3};
        getHighResolutionOutputSizeshNQ4ISI = cardNetworkArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cardNetworkArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

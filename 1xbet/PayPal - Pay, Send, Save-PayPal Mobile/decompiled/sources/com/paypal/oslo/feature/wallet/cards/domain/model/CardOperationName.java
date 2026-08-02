package com.paypal.oslo.feature.wallet.cards.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardOperationName {
    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName ADD;
    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName UPDATE;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CardOperationName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName = new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName("ADD", 0);
        ADD = cardOperationName;
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName2 = new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName("UPDATE", 1);
        UPDATE = cardOperationName2;
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName3 = new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName("UNKNOWN", 2);
        UNKNOWN = cardOperationName3;
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName[] cardOperationNameArr = {cardOperationName, cardOperationName2, cardOperationName3};
        getHighSpeedVideoFpsRangesFor = cardOperationNameArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cardOperationNameArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

package com.paypal.oslo.feature.wallet.cards.domain.add.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBER", "EXPIRY", "CVV"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardField {
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField CVV;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField EXPIRY;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField NUMBER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField[] getHighSpeedVideoSizes;

    private CardField(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField("NUMBER", 0);
        NUMBER = cardField;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField2 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField("EXPIRY", 1);
        EXPIRY = cardField2;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField cardField3 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField("CVV", 2);
        CVV = cardField3;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField[] cardFieldArr = {cardField, cardField2, cardField3};
        getHighSpeedVideoSizes = cardFieldArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardFieldArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

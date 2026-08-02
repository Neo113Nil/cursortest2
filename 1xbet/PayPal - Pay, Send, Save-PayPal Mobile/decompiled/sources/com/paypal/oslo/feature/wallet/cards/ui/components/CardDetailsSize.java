package com.paypal.oslo.feature.wallet.cards.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/components/CardDetailsSize;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "STANDARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDetailsSize {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize SMALL;
    public static final com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize STANDARD;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize[] getHighResolutionOutputSizeshNQ4ISI;

    private CardDetailsSize(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize cardDetailsSize = new com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize("SMALL", 0);
        SMALL = cardDetailsSize;
        com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize cardDetailsSize2 = new com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize("STANDARD", 1);
        STANDARD = cardDetailsSize2;
        com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize[] cardDetailsSizeArr = {cardDetailsSize, cardDetailsSize2};
        getHighResolutionOutputSizeshNQ4ISI = cardDetailsSizeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cardDetailsSizeArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize[] values() {
        return (com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

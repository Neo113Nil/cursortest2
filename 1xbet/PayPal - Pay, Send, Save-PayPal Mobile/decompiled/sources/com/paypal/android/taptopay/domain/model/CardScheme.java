package com.paypal.android.taptopay.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/CardScheme;", "", "<init>", "(Ljava/lang/String;I)V", "MASTERCARD", "PURE", "VISA", "UNKNOWN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardScheme {
    public static final com.paypal.android.taptopay.domain.model.CardScheme MASTERCARD;
    public static final com.paypal.android.taptopay.domain.model.CardScheme PURE;
    public static final com.paypal.android.taptopay.domain.model.CardScheme UNKNOWN;
    public static final com.paypal.android.taptopay.domain.model.CardScheme VISA;
    private static final /* synthetic */ com.paypal.android.taptopay.domain.model.CardScheme[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CardScheme(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.taptopay.domain.model.CardScheme cardScheme = new com.paypal.android.taptopay.domain.model.CardScheme("MASTERCARD", 0);
        MASTERCARD = cardScheme;
        com.paypal.android.taptopay.domain.model.CardScheme cardScheme2 = new com.paypal.android.taptopay.domain.model.CardScheme("PURE", 1);
        PURE = cardScheme2;
        com.paypal.android.taptopay.domain.model.CardScheme cardScheme3 = new com.paypal.android.taptopay.domain.model.CardScheme("VISA", 2);
        VISA = cardScheme3;
        com.paypal.android.taptopay.domain.model.CardScheme cardScheme4 = new com.paypal.android.taptopay.domain.model.CardScheme("UNKNOWN", 3);
        UNKNOWN = cardScheme4;
        com.paypal.android.taptopay.domain.model.CardScheme[] cardSchemeArr = {cardScheme, cardScheme2, cardScheme3, cardScheme4};
        getHighResolutionOutputSizeshNQ4ISI = cardSchemeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cardSchemeArr);
    }

    public static com.paypal.android.taptopay.domain.model.CardScheme[] values() {
        return (com.paypal.android.taptopay.domain.model.CardScheme[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.android.taptopay.domain.model.CardScheme valueOf(java.lang.String str) {
        return (com.paypal.android.taptopay.domain.model.CardScheme) java.lang.Enum.valueOf(com.paypal.android.taptopay.domain.model.CardScheme.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.domain.model.CardScheme> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

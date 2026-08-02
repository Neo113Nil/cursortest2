package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/payair/model/CardScheme;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "MASTERCARD", "VISA"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardScheme {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.CardScheme[] $VALUES;
    public static final com.payair.model.CardScheme MASTERCARD = new com.payair.model.CardScheme("MASTERCARD", 0, com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_MASTERCARD);
    public static final com.payair.model.CardScheme VISA = new com.payair.model.CardScheme("VISA", 1, com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_VISA);
    private final java.lang.String value;

    static {
        com.payair.model.CardScheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private CardScheme(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public static com.payair.model.CardScheme[] values() {
        return (com.payair.model.CardScheme[]) $VALUES.clone();
    }

    public static com.payair.model.CardScheme valueOf(java.lang.String str) {
        return (com.payair.model.CardScheme) java.lang.Enum.valueOf(com.payair.model.CardScheme.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.model.CardScheme> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.CardScheme[] $values() {
        return new com.payair.model.CardScheme[]{MASTERCARD, VISA};
    }
}

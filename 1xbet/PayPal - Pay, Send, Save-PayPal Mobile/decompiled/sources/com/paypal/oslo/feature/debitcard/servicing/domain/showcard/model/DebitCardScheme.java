package com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardScheme;", "", "<init>", "(Ljava/lang/String;I)V", "MASTER_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardScheme {
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme MASTER_CARD;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardScheme(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme = new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme("MASTER_CARD", 0);
        MASTER_CARD = debitCardScheme;
        com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme debitCardScheme2 = new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme("UNKNOWN", 1);
        UNKNOWN = debitCardScheme2;
        com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme[] debitCardSchemeArr = {debitCardScheme, debitCardScheme2};
        Camera2StreamConfigurationMap = debitCardSchemeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(debitCardSchemeArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

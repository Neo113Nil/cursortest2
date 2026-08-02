package com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NO_MONEY", "TRANSACTIONS_DECLINED", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardReason {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason DEFAULT;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason NO_MONEY;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason OTHER;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason TRANSACTIONS_DECLINED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason[] getHighSpeedVideoSizes;

    private CancelCardReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason("DEFAULT", 0);
        DEFAULT = cancelCardReason;
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason2 = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason("NO_MONEY", 1);
        NO_MONEY = cancelCardReason2;
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason3 = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason("TRANSACTIONS_DECLINED", 2);
        TRANSACTIONS_DECLINED = cancelCardReason3;
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason4 = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason("OTHER", 3);
        OTHER = cancelCardReason4;
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason[] cancelCardReasonArr = {cancelCardReason, cancelCardReason2, cancelCardReason3, cancelCardReason4};
        getHighSpeedVideoSizes = cancelCardReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cancelCardReasonArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

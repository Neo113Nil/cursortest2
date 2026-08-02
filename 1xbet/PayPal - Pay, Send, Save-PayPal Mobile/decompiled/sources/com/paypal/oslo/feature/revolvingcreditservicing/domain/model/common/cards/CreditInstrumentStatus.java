package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", "FROZEN", "TERMINATED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreditInstrumentStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus ACTIVE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus BLOCKED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus FROZEN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus TERMINATED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private CreditInstrumentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = creditInstrumentStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus("BLOCKED", 1);
        BLOCKED = creditInstrumentStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus("FROZEN", 2);
        FROZEN = creditInstrumentStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus("TERMINATED", 3);
        TERMINATED = creditInstrumentStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus("UNKNOWN", 4);
        UNKNOWN = creditInstrumentStatus5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus[] creditInstrumentStatusArr = {creditInstrumentStatus, creditInstrumentStatus2, creditInstrumentStatus3, creditInstrumentStatus4, creditInstrumentStatus5};
        getHighResolutionOutputSizeshNQ4ISI = creditInstrumentStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(creditInstrumentStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

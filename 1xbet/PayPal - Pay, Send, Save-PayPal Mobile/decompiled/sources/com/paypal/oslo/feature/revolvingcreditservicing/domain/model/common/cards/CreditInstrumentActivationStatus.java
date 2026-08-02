package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentActivationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "ACTIVATED", "NOT_READY_TO_ACTIVATE", "READY_TO_ACTIVATE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreditInstrumentActivationStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus ACTIVATED;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus NOT_READY_TO_ACTIVATE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus READY_TO_ACTIVATE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String rawValue;

    private CreditInstrumentActivationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus("ACTIVATED", 0, "ACTIVATED");
        ACTIVATED = creditInstrumentActivationStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus("NOT_READY_TO_ACTIVATE", 1, "NOT_READY_TO_ACTIVATE");
        NOT_READY_TO_ACTIVATE = creditInstrumentActivationStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus("READY_TO_ACTIVATE", 2, "READY_TO_ACTIVATE");
        READY_TO_ACTIVATE = creditInstrumentActivationStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus creditInstrumentActivationStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = creditInstrumentActivationStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus[] creditInstrumentActivationStatusArr = {creditInstrumentActivationStatus, creditInstrumentActivationStatus2, creditInstrumentActivationStatus3, creditInstrumentActivationStatus4};
        Camera2StreamConfigurationMap = creditInstrumentActivationStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(creditInstrumentActivationStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

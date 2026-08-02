package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/CardActivationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "READY_TO_ACTIVATE", "NOT_READY_TO_ACTIVATE", "ACTIVATED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardActivationStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus ACTIVATED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus NOT_READY_TO_ACTIVATE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus READY_TO_ACTIVATE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private CardActivationStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus("READY_TO_ACTIVATE", 0);
        READY_TO_ACTIVATE = cardActivationStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus("NOT_READY_TO_ACTIVATE", 1);
        NOT_READY_TO_ACTIVATE = cardActivationStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus("ACTIVATED", 2);
        ACTIVATED = cardActivationStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus cardActivationStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus("UNKNOWN", 3);
        UNKNOWN = cardActivationStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus[] cardActivationStatusArr = {cardActivationStatus, cardActivationStatus2, cardActivationStatus3, cardActivationStatus4};
        getHighSpeedVideoFpsRanges = cardActivationStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cardActivationStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

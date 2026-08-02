package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPT_PAYMENT_TYPE", "UPDATE_PAYMENT_TYPE_TO_PURCHASE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScamCustomerChoice {
    public static final com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice ACCEPT_PAYMENT_TYPE;
    public static final com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice UPDATE_PAYMENT_TYPE_TO_PURCHASE;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ScamCustomerChoice(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice scamCustomerChoice = new com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice("ACCEPT_PAYMENT_TYPE", 0);
        ACCEPT_PAYMENT_TYPE = scamCustomerChoice;
        com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice scamCustomerChoice2 = new com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice("UPDATE_PAYMENT_TYPE_TO_PURCHASE", 1);
        UPDATE_PAYMENT_TYPE_TO_PURCHASE = scamCustomerChoice2;
        com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice[] scamCustomerChoiceArr = {scamCustomerChoice, scamCustomerChoice2};
        getHighSpeedVideoFpsRanges = scamCustomerChoiceArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(scamCustomerChoiceArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

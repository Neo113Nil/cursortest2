package com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;", "", "<init>", "(Ljava/lang/String;I)V", "LOST_STOLEN", "WORN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReissueCardReason {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason LOST_STOLEN;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason WORN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason[] getHighSpeedVideoFpsRangesFor;

    private ReissueCardReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reissueCardReason = new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason("LOST_STOLEN", 0);
        LOST_STOLEN = reissueCardReason;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reissueCardReason2 = new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason("WORN", 1);
        WORN = reissueCardReason2;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason[] reissueCardReasonArr = {reissueCardReason, reissueCardReason2};
        getHighSpeedVideoFpsRangesFor = reissueCardReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(reissueCardReasonArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

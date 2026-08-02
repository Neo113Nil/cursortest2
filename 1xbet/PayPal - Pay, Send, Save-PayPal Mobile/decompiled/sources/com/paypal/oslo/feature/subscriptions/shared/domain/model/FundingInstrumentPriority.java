package com.paypal.oslo.feature.subscriptions.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "BACKUP", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentPriority {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority BACKUP;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority NONE;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority PRIMARY;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FundingInstrumentPriority(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority("PRIMARY", 0);
        PRIMARY = fundingInstrumentPriority;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority("BACKUP", 1);
        BACKUP = fundingInstrumentPriority2;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority3 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority("NONE", 2);
        NONE = fundingInstrumentPriority3;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority[] fundingInstrumentPriorityArr = {fundingInstrumentPriority, fundingInstrumentPriority2, fundingInstrumentPriority3};
        getHighSpeedVideoFpsRangesFor = fundingInstrumentPriorityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentPriorityArr);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "PAYPAL_BALANCE", "PAYPAL_PLUS_POINTS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedemptionOption {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption NONE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption PAYPAL_BALANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption PAYPAL_PLUS_POINTS;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private RedemptionOption(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption("NONE", 0);
        NONE = redemptionOption;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption("PAYPAL_BALANCE", 1);
        PAYPAL_BALANCE = redemptionOption2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption("PAYPAL_PLUS_POINTS", 2);
        PAYPAL_PLUS_POINTS = redemptionOption3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption[] redemptionOptionArr = {redemptionOption, redemptionOption2, redemptionOption3};
        getHighResolutionOutputSizeshNQ4ISI = redemptionOptionArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(redemptionOptionArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

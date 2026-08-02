package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayBadgeState;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "badgeTextRes", com.visa.cbp.getEncExpo.warmup, "getBadgeTextRes", "()I", "Enabled", "Disabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayBadgeState {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState Disabled;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState Enabled;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState[] getHighSpeedVideoFpsRangesFor;
    private final int badgeTextRes;

    private AutopayBadgeState(java.lang.String str, int i, int i2) {
        this.badgeTextRes = i2;
    }

    public final int getBadgeTextRes() {
        return this.badgeTextRes;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState autopayBadgeState = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState("Enabled", 0, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_on);
        Enabled = autopayBadgeState;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState autopayBadgeState2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState("Disabled", 1, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_off);
        Disabled = autopayBadgeState2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState[] autopayBadgeStateArr = {autopayBadgeState, autopayBadgeState2};
        getHighSpeedVideoFpsRangesFor = autopayBadgeStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(autopayBadgeStateArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayBadgeState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}

package com.paypal.oslo.feature.savings.ui.goals.creategoal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/goals/creategoal/PresetAmount;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "TEN", "FIFTY", "ONE_FIFTY", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PresetAmount {
    public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount FIFTY;
    public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount ONE_FIFTY;
    public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount OTHER;
    public static final com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount TEN;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int value;

    private PresetAmount(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount presetAmount = new com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount("TEN", 0, 10);
        TEN = presetAmount;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount presetAmount2 = new com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount("FIFTY", 1, 50);
        FIFTY = presetAmount2;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount presetAmount3 = new com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount("ONE_FIFTY", 2, 150);
        ONE_FIFTY = presetAmount3;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount presetAmount4 = new com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount("OTHER", 3, 0);
        OTHER = presetAmount4;
        com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount[] presetAmountArr = {presetAmount, presetAmount2, presetAmount3, presetAmount4};
        getHighResolutionOutputSizeshNQ4ISI = presetAmountArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(presetAmountArr);
    }

    public static com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount[] values() {
        return (com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.ui.goals.creategoal.PresetAmount> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

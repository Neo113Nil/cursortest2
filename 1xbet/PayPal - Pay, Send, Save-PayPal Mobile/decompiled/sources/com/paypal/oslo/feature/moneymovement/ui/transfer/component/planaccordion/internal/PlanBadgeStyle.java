package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadgeStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "POSITIVE", "WARNING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanBadgeStyle {
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle NEUTRAL;
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle POSITIVE;
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PlanBadgeStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle("NEUTRAL", 0);
        NEUTRAL = planBadgeStyle;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle2 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle("POSITIVE", 1);
        POSITIVE = planBadgeStyle2;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle3 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle("WARNING", 2);
        WARNING = planBadgeStyle3;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle[] planBadgeStyleArr = {planBadgeStyle, planBadgeStyle2, planBadgeStyle3};
        getHighSpeedVideoFpsRanges = planBadgeStyleArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(planBadgeStyleArr);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle[] values() {
        return (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle> getEntries() {
        return getHighSpeedVideoSizes;
    }
}

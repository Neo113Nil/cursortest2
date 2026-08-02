package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItemTitleStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/paypal/pds/core/Typography;", "getTextStyle", "()Lcom/paypal/pds/core/Typography;", "textStyle", "BodySmall", "BodyMedium"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanCardItemTitleStyle {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle BodyMedium;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle BodySmall;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private PlanCardItemTitleStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle("BodySmall", 0);
        BodySmall = planCardItemTitleStyle;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle planCardItemTitleStyle2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle("BodyMedium", 1);
        BodyMedium = planCardItemTitleStyle2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle[] planCardItemTitleStyleArr = {planCardItemTitleStyle, planCardItemTitleStyle2};
        Camera2StreamConfigurationMap = planCardItemTitleStyleArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(planCardItemTitleStyleArr);
    }

    public final com.paypal.pds.core.Typography getTextStyle() {
        int i = com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return com.paypal.pds.core.Typography.BodySmall.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle[]) Camera2StreamConfigurationMap.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.BodySmall.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.BodyMedium.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItemTitleStyle> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

package com.paypal.oslo.feature.bnplservicing.ui.common.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/paypal/pds/core/Icon;", "getIcon$bnpl_servicing_prodRelease", "()Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/pds/components/AvatarBadge;", "getBadge$bnpl_servicing_prodRelease", "()Lcom/paypal/pds/components/AvatarBadge;", "badge", "PURCHASE", "AUTOMATIC_PAYMENT_SUCCESSFUL", "AUTOMATIC_PAYMENT_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanActivityState {
    public static final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState AUTOMATIC_PAYMENT_FAILED;
    public static final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState AUTOMATIC_PAYMENT_SUCCESSFUL;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState PURCHASE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private PlanActivityState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState = new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState("PURCHASE", 0);
        PURCHASE = planActivityState;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState2 = new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState("AUTOMATIC_PAYMENT_SUCCESSFUL", 1);
        AUTOMATIC_PAYMENT_SUCCESSFUL = planActivityState2;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState3 = new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState("AUTOMATIC_PAYMENT_FAILED", 2);
        AUTOMATIC_PAYMENT_FAILED = planActivityState3;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState[] planActivityStateArr = {planActivityState, planActivityState2, planActivityState3};
        Camera2StreamConfigurationMap = planActivityStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(planActivityStateArr);
    }

    public final com.paypal.pds.core.Icon getIcon$bnpl_servicing_prodRelease() {
        int i = com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return com.paypal.pds.core.Icon.Bag.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE;
    }

    public final com.paypal.pds.components.AvatarBadge getBadge$bnpl_servicing_prodRelease() {
        if (com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.WhenMappings.$EnumSwitchMapping$0[ordinal()] == 3) {
            return new com.paypal.pds.components.AvatarBadge.Icon(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.pds.components.BadgeStyle.Negative.INSTANCE);
        }
        return null;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState[] values() {
        return (com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState[]) Camera2StreamConfigurationMap.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.AUTOMATIC_PAYMENT_SUCCESSFUL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.AUTOMATIC_PAYMENT_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

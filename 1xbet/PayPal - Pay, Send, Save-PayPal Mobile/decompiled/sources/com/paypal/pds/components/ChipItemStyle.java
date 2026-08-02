package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lcom/paypal/pds/components/ChipItemStyle;", "Lcom/paypal/pds/components/ButtonStyle;", "Lcom/paypal/pds/core/Color;", "p0", "p1", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "Selected", "Unselected", "Lcom/paypal/pds/components/ChipItemStyle$Selected;", "Lcom/paypal/pds/components/ChipItemStyle$Unselected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
abstract class ChipItemStyle extends com.paypal.pds.components.ButtonStyle {
    private ChipItemStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        super(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, color, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, color2, com.paypal.pds.core.ConstantsKt.getBorderSize1(), 16, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ChipItemStyle$Selected;", "Lcom/paypal/pds/components/ChipItemStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Selected extends com.paypal.pds.components.ChipItemStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ChipItemStyle.Selected INSTANCE = new com.paypal.pds.components.ChipItemStyle.Selected();

        private Selected() {
            super(com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, com.paypal.pds.core.Color.BorderUtilitySelected.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ChipItemStyle$Unselected;", "Lcom/paypal/pds/components/ChipItemStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unselected extends com.paypal.pds.components.ChipItemStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ChipItemStyle.Unselected INSTANCE = new com.paypal.pds.components.ChipItemStyle.Unselected();

        private Unselected() {
            super(com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, null);
        }
    }

    public /* synthetic */ ChipItemStyle(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2);
    }
}

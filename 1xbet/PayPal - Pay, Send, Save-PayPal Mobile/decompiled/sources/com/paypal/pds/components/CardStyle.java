package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0082\u0001\u0002\u0015\u0016"}, d2 = {"Lcom/paypal/pds/components/CardStyle;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "Lcom/paypal/pds/core/Color;", "p1", "p2", "<init>", "(FLcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "borderWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBorderWidth-D9Ej5fM$pds_release", "()F", "borderColor", "Lcom/paypal/pds/core/Color;", "getBorderColor$pds_release", "()Lcom/paypal/pds/core/Color;", "backgroundColor", "getBackgroundColor$pds_release", "Filled", "Outlined", "Lcom/paypal/pds/components/CardStyle$Filled;", "Lcom/paypal/pds/components/CardStyle$Outlined;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CardStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color backgroundColor;
    private final com.paypal.pds.core.Color borderColor;
    private final float borderWidth;

    private CardStyle(float f, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        this.borderWidth = f;
        this.borderColor = color;
        this.backgroundColor = color2;
    }

    /* renamed from: getBorderWidth-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: getBorderColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: getBackgroundColor$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/CardStyle$Filled;", "Lcom/paypal/pds/components/CardStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Filled extends com.paypal.pds.components.CardStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.CardStyle.Filled INSTANCE = new com.paypal.pds.components.CardStyle.Filled();

        private Filled() {
            super(com.paypal.pds.core.ConstantsKt.getSize0(), com.paypal.pds.core.Color.BorderContainerFilled.INSTANCE, com.paypal.pds.core.Color.BackgroundContainerFilled.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/CardStyle$Outlined;", "Lcom/paypal/pds/components/CardStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Outlined extends com.paypal.pds.components.CardStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.CardStyle.Outlined INSTANCE = new com.paypal.pds.components.CardStyle.Outlined();

        private Outlined() {
            super(com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, null);
        }
    }

    public /* synthetic */ CardStyle(float f, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, color, color2);
    }
}

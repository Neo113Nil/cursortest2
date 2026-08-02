package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "<init>", "(Lcom/paypal/pds/core/Color;)V", "lineColor", "Lcom/paypal/pds/core/Color;", "getLineColor$common_ui_release", "()Lcom/paypal/pds/core/Color;", "Positive", "Negative", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle$Negative;", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle$Positive;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class PriceChartStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color lineColor;

    private PriceChartStyle(com.paypal.pds.core.Color color) {
        this.lineColor = color;
    }

    /* renamed from: getLineColor$common_ui_release, reason: from getter */
    public final com.paypal.pds.core.Color getLineColor() {
        return this.lineColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle$Positive;", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Positive extends com.paypal.oslo.core.commonui.components.chart.PriceChartStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.Positive INSTANCE = new com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.Positive();

        private Positive() {
            super(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle$Negative;", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Negative extends com.paypal.oslo.core.commonui.components.chart.PriceChartStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.Negative INSTANCE = new com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.Negative();

        private Negative() {
            super(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, null);
        }
    }

    public /* synthetic */ PriceChartStyle(com.paypal.pds.core.Color color, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color);
    }
}

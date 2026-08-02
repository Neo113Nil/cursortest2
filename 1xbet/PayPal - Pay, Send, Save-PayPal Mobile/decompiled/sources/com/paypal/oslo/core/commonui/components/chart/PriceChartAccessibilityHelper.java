package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR.\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityHelper;", "Landroidx/customview/widget/ExploreByTouchHelper;", "Landroid/view/View;", "hostView", "<init>", "(Landroid/view/View;)V", "", "", "virtualViewIds", "", "getVisibleVirtualViews", "(Ljava/util/List;)V", "", "x", "y", "getVirtualViewAt", "(FF)I", "virtualViewId", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "node", "onPopulateNodeForVirtualView", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "action", "Landroid/os/Bundle;", "arguments", "", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/View;", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "accessibilityInfo", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", "getAccessibilityInfo", "()Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", "setAccessibilityInfo", "(Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class PriceChartAccessibilityHelper extends androidx.customview.widget.ExploreByTouchHelper {
    private com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo accessibilityInfo;
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int virtualViewId, int action, android.os.Bundle arguments) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceChartAccessibilityHelper(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }

    public final com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final void setAccessibilityInfo(com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo) {
        this.accessibilityInfo = priceChartAccessibilityInfo;
        invalidateRoot();
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int virtualViewId, androidx.core.view.accessibility.AccessibilityNodeInfoCompat node) {
        android.graphics.Rect rect;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo = this.accessibilityInfo;
        if (priceChartAccessibilityInfo == null) {
            node.setBoundsInParent(new android.graphics.Rect(0, 0, 1, 1));
            node.setContentDescription("");
            return;
        }
        int width = this.getHighResolutionOutputSizeshNQ4ISI.getWidth();
        int height = this.getHighResolutionOutputSizeshNQ4ISI.getHeight();
        int size = priceChartAccessibilityInfo.getSegmentDescriptions().size();
        if (size <= 0) {
            rect = new android.graphics.Rect(0, 0, 0, 0);
        } else {
            float f = size;
            float f2 = width;
            int i = (int) ((virtualViewId / f) * f2);
            if (virtualViewId != size - 1) {
                width = (int) (((virtualViewId + 1) / f) * f2);
            }
            rect = new android.graphics.Rect(i, 0, width, height);
        }
        node.setBoundsInParent(rect);
        java.util.List<java.lang.String> segmentDescriptions = priceChartAccessibilityInfo.getSegmentDescriptions();
        if (virtualViewId >= 0 && virtualViewId < segmentDescriptions.size()) {
            str = segmentDescriptions.get(virtualViewId);
        }
        node.setContentDescription(str);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float x, float y) {
        java.util.List<java.lang.String> segmentDescriptions;
        java.util.List<java.lang.String> segmentDescriptions2;
        java.util.List<java.lang.String> segmentDescriptions3;
        com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo = this.accessibilityInfo;
        if (priceChartAccessibilityInfo == null || (segmentDescriptions = priceChartAccessibilityInfo.getSegmentDescriptions()) == null || segmentDescriptions.size() == 0 || this.getHighResolutionOutputSizeshNQ4ISI.getWidth() <= 0) {
            return Integer.MIN_VALUE;
        }
        float width = x / this.getHighResolutionOutputSizeshNQ4ISI.getWidth();
        com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo2 = this.accessibilityInfo;
        int size = (int) (width * ((priceChartAccessibilityInfo2 == null || (segmentDescriptions3 = priceChartAccessibilityInfo2.getSegmentDescriptions()) == null) ? 0 : segmentDescriptions3.size()));
        com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo3 = this.accessibilityInfo;
        return kotlin.ranges.RangesKt.coerceIn(size, 0, ((priceChartAccessibilityInfo3 == null || (segmentDescriptions2 = priceChartAccessibilityInfo3.getSegmentDescriptions()) == null) ? 0 : segmentDescriptions2.size()) - 1);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(java.util.List<java.lang.Integer> virtualViewIds) {
        java.util.List<java.lang.String> segmentDescriptions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualViewIds, "");
        com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo = this.accessibilityInfo;
        int size = (priceChartAccessibilityInfo == null || (segmentDescriptions = priceChartAccessibilityInfo.getSegmentDescriptions()) == null) ? 0 : segmentDescriptions.size();
        for (int i = 0; i < size; i++) {
            virtualViewIds.add(java.lang.Integer.valueOf(i));
        }
    }
}

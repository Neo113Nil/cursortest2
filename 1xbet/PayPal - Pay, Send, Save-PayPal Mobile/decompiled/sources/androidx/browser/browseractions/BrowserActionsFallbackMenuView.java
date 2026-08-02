package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighResolutionOutputSizeshNQ4ISI = getResources().getDimensionPixelOffset(androidx.browser.R.dimen.browser_actions_context_menu_min_padding);
        this.getHighSpeedVideoFpsRangesFor = getResources().getDimensionPixelOffset(androidx.browser.R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.getHighResolutionOutputSizeshNQ4ISI * 2), this.getHighSpeedVideoFpsRangesFor), 1073741824), i2);
    }
}

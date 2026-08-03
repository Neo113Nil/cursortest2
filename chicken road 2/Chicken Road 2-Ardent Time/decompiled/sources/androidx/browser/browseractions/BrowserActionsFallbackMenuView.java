package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f2165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2166b;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2165a = getResources().getDimensionPixelOffset(com.watchfacestudio.huasi_urx110.R.dimen.browser_actions_context_menu_min_padding);
        this.f2166b = getResources().getDimensionPixelOffset(com.watchfacestudio.huasi_urx110.R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2165a * 2), this.f2166b), 1073741824), i3);
    }
}

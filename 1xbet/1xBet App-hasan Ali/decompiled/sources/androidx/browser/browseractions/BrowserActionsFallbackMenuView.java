package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import game.betting133.sports1xbet.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public final int f6796k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6797l;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6796k = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f6797l = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f6796k * 2), this.f6797l), 1073741824), i5);
    }
}

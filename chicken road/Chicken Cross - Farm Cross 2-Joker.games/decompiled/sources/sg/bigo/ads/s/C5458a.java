package sg.bigo.ads.s;

import android.content.Context;
import android.view.View;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.q.v;
import sg.bigo.ads.q.x;

/* renamed from: sg.bigo.ads.s.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5458a extends RealtimeBlurLinearLayout {
    public x b;

    public C5458a(Context context) {
        super(context, null, 0);
    }

    public x getIconAdsRenderStyle() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        x xVar = this.b;
        if ((xVar instanceof v) && xVar.b.size() == 4) {
            int defaultSize = (int) ((((View.getDefaultSize(Integer.MIN_VALUE, i) - (((v) this.b).j * 3.0f)) / 4.0f) * 3.0f) + (r0 * 2));
            setMeasuredDimension(defaultSize, getMeasuredHeight());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChildWithMargins(getChildAt(i3), makeMeasureSpec, 0, i2, 0);
            }
        }
    }
}

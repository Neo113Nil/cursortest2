package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public class MaximumHeightMediaView extends MediaView {
    public int b;

    public MaximumHeightMediaView(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.b;
        if (i3 > 0 && size > i3) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.b = i;
    }

    public MaximumHeightMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaximumHeightMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

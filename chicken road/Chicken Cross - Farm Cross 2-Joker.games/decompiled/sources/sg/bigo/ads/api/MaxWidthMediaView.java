package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
public class MaxWidthMediaView extends MediaView {
    public int b;

    public MaxWidthMediaView(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b;
        if (i3 > 0 && size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxWidth(int i) {
        this.b = i;
    }

    public MaxWidthMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxWidthMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

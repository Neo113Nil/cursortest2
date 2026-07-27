package sg.bigo.ads.G;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class g extends ImageView {
    public g(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }
}

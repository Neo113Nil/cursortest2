package sg.bigo.ads.H;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class o extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final View f12318a;

    public o(Context context, View view) {
        super(context);
        this.f12318a = view;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f12318a;
        if (view == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(view.getMeasuredWidth(), this.f12318a.getMeasuredHeight());
        }
    }
}

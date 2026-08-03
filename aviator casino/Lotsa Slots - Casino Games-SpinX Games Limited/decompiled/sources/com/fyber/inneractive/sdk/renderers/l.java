package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class l extends android.widget.RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f4243a;

    public l(android.content.Context context, float f) {
        super(context);
        this.f4243a = f;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        android.view.View.MeasureSpec.getMode(i);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        if (mode == 0 || (mode == Integer.MIN_VALUE && android.view.View.MeasureSpec.getSize(i2) > 0)) {
            int size = android.view.View.MeasureSpec.getSize(i);
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            float f = this.f4243a;
            if (f != 0.0f) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824);
            }
            i3 = makeMeasureSpec;
        } else {
            int size2 = android.view.View.MeasureSpec.getSize(i);
            int size3 = android.view.View.MeasureSpec.getSize(i2);
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        }
        super.onMeasure(i3, i2);
    }
}

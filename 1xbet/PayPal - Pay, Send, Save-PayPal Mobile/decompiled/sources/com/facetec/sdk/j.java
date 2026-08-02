package com.facetec.sdk;

/* loaded from: classes8.dex */
final class j extends android.view.SurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private int f3632a;
    private int c;

    public j(android.content.Context context) {
        this(context, null);
    }

    public j(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.f3632a = 0;
    }

    public final void setAspectRatio(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("Size cannot be negative.");
        }
        this.c = i;
        this.f3632a = i2;
        requestLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i4 = this.c;
        if (i4 == 0 || (i3 = this.f3632a) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i3 * size) / i4);
        }
    }
}

package com.facetec.sdk;

/* loaded from: classes8.dex */
final class h extends android.view.TextureView {

    /* renamed from: a, reason: collision with root package name */
    private int f3621a;
    private int b;

    public h(android.content.Context context) {
        this(context, null);
    }

    public h(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        this.f3621a = 0;
    }

    public final void setAspectRatio(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("Size cannot be negative.");
        }
        this.b = i;
        this.f3621a = i2;
        requestLayout();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i4 = this.b;
        if (i4 == 0 || (i3 = this.f3621a) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i3 * size) / i4);
        }
    }
}

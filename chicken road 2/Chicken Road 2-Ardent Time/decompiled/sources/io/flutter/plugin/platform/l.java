package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class l extends android.view.ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f7786a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f7787b;

    public l(android.content.Context context) {
        super(context);
        this.f7786a = new android.graphics.Rect();
        this.f7787b = new android.graphics.Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            android.view.View childAt = getChildAt(i6);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f7786a.set(i2, i3, i4, i5);
            android.view.Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f7786a, layoutParams.x, layoutParams.y, this.f7787b);
            android.graphics.Rect rect = this.f7787b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i2), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i3), Integer.MIN_VALUE));
        }
        super.onMeasure(i2, i3);
    }
}

package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class n extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f10256a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10257b;

    public n(Context context) {
        super(context);
        this.f10256a = new Rect();
        this.f10257b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f10256a.set(i2, i3, i6, i7);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f10256a, layoutParams.x, layoutParams.y, this.f10257b);
            Rect rect = this.f10257b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE));
        }
        super.onMeasure(i2, i3);
    }
}

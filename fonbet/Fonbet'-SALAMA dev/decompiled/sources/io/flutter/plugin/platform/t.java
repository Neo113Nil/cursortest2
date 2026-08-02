package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class t extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f14207a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f14208b;

    public t(Context context) {
        super(context);
        this.f14207a = new Rect();
        this.f14208b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f14207a.set(i7, i8, i9, i10);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f14207a, layoutParams.x, layoutParams.y, this.f14208b);
            Rect rect = this.f14208b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            getChildAt(i9).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), Integer.MIN_VALUE));
        }
        super.onMeasure(i7, i8);
    }
}

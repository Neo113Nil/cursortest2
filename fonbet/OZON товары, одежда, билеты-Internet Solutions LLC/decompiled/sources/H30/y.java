package H30;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f10569a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f10570b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f10571c;

    public y(View view, View view2, View view3) {
        this.f10569a = view;
        this.f10570b = view2;
        this.f10571c = view3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f10569a;
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int[] iArr = new int[2];
        View view2 = this.f10570b;
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        View view3 = this.f10571c;
        view3.getLocationOnScreen(iArr2);
        int height = (view3.getHeight() + iArr2[1]) - iArr[1];
        Intrinsics.checkNotNullParameter(view2, "<this>");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams.height != height) {
            layoutParams.height = height;
            view2.setLayoutParams(layoutParams);
        }
    }
}

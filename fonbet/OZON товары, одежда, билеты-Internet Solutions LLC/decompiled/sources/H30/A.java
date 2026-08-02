package H30;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class A implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConstraintLayout f10549a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f10550b;

    public A(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.f10549a = constraintLayout;
        this.f10550b = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ConstraintLayout constraintLayout = this.f10549a;
        if (constraintLayout.getMeasuredWidth() <= 0 || constraintLayout.getMeasuredHeight() <= 0) {
            return;
        }
        constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        float height = constraintLayout.getHeight() * 0.6f;
        FrameLayout frameLayout = this.f10550b;
        Object layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.f41610Q = (int) height;
        }
        if (frameLayout != null) {
            frameLayout.setLayoutParams(bVar);
        }
    }
}

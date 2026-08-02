package androidx.constraintlayout.widget;

import B.c;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n() {
        c cVar = (c) getLayoutParams();
        cVar.f758q0.P(0);
        cVar.f758q0.M(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        e();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        e();
    }
}

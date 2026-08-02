package androidx.constraintlayout.widget;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import v.AbstractC1662m;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: A, reason: collision with root package name */
    public boolean f9025A;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9026z;

    public VirtualLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 6) {
                    this.f9026z = true;
                } else if (index == 22) {
                    this.f9025A = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9026z || this.f9025A) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i7 = 0; i7 < this.f8991b; i7++) {
                    View b7 = constraintLayout.b(this.f8990a[i7]);
                    if (b7 != null) {
                        if (this.f9026z) {
                            b7.setVisibility(visibility);
                        }
                        if (this.f9025A && elevation > 0.0f) {
                            b7.setTranslationZ(b7.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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

    public void r(AbstractC1662m abstractC1662m, int i7, int i8) {
    }
}

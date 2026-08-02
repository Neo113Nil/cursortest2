package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import v.AbstractC1662m;
import v.C1659j;
import v.C1661l;

/* loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f8993d = new C1661l();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i7, int i8) {
        r(null, i7, i8);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(AbstractC1662m abstractC1662m, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (abstractC1662m == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC1662m.V(mode, size, mode2, size2);
            setMeasuredDimension(abstractC1662m.f17061D0, abstractC1662m.f17062E0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(C1659j c1659j, SparseArray sparseArray) {
    }
}

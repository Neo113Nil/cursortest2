package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import p149v.j;
import p149v.l;
import p149v.m;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f8993d = new l();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i7, int i8) {
        r(null, i7, i8);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(m mVar, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.V(mode, size, mode2, size2);
            setMeasuredDimension(mVar.f17067D0, mVar.f17068E0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(j jVar, SparseArray sparseArray) {
    }
}

package androidx.constraintlayout.widget;

import B.c;
import B.h;
import B.i;
import B.m;
import B.n;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public m f9016a;

    public Constraints(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new n();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n nVar = new n(context, attributeSet);
        nVar.f917r0 = 1.0f;
        nVar.f918s0 = false;
        nVar.f919t0 = 0.0f;
        nVar.f920u0 = 0.0f;
        nVar.f921v0 = 0.0f;
        nVar.f922w0 = 0.0f;
        nVar.f923x0 = 1.0f;
        nVar.f924y0 = 1.0f;
        nVar.f925z0 = 0.0f;
        nVar.f913A0 = 0.0f;
        nVar.f914B0 = 0.0f;
        nVar.f915C0 = 0.0f;
        nVar.f916D0 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f936g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 15) {
                nVar.f917r0 = obtainStyledAttributes.getFloat(index, nVar.f917r0);
            } else if (index == 28) {
                nVar.f919t0 = obtainStyledAttributes.getFloat(index, nVar.f919t0);
                nVar.f918s0 = true;
            } else if (index == 23) {
                nVar.f921v0 = obtainStyledAttributes.getFloat(index, nVar.f921v0);
            } else if (index == 24) {
                nVar.f922w0 = obtainStyledAttributes.getFloat(index, nVar.f922w0);
            } else if (index == 22) {
                nVar.f920u0 = obtainStyledAttributes.getFloat(index, nVar.f920u0);
            } else if (index == 20) {
                nVar.f923x0 = obtainStyledAttributes.getFloat(index, nVar.f923x0);
            } else if (index == 21) {
                nVar.f924y0 = obtainStyledAttributes.getFloat(index, nVar.f924y0);
            } else if (index == 16) {
                nVar.f925z0 = obtainStyledAttributes.getFloat(index, nVar.f925z0);
            } else if (index == 17) {
                nVar.f913A0 = obtainStyledAttributes.getFloat(index, nVar.f913A0);
            } else if (index == 18) {
                nVar.f914B0 = obtainStyledAttributes.getFloat(index, nVar.f914B0);
            } else if (index == 19) {
                nVar.f915C0 = obtainStyledAttributes.getFloat(index, nVar.f915C0);
            } else if (index == 27) {
                nVar.f916D0 = obtainStyledAttributes.getFloat(index, nVar.f916D0);
            }
        }
        obtainStyledAttributes.recycle();
        return nVar;
    }

    public m getConstraintSet() {
        if (this.f9016a == null) {
            this.f9016a = new m();
        }
        m mVar = this.f9016a;
        mVar.getClass();
        int childCount = getChildCount();
        HashMap hashMap = mVar.f912f;
        hashMap.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            n nVar = (n) childAt.getLayoutParams();
            int id = childAt.getId();
            if (mVar.f911e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new h());
            }
            h hVar = (h) hashMap.get(Integer.valueOf(id));
            if (hVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    hVar.d(id, nVar);
                    if (constraintHelper instanceof Barrier) {
                        i iVar = hVar.f801e;
                        iVar.f848i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        iVar.f844g0 = barrier.getType();
                        iVar.f849j0 = barrier.getReferencedIds();
                        iVar.f846h0 = barrier.getMargin();
                    }
                }
                hVar.d(id, nVar);
            }
        }
        return this.f9016a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }
}

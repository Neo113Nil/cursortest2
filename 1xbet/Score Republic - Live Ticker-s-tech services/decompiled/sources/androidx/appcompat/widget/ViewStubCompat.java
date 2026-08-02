package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000.C0270h1;
import p000.mi1;
import p000.mz0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: j */
    public int f459j;

    /* JADX INFO: renamed from: k */
    public int f460k;

    /* JADX INFO: renamed from: l */
    public WeakReference f461l;

    /* JADX INFO: renamed from: m */
    public LayoutInflater f462m;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f459j = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5212z, 0, 0);
        this.f460k = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f459j = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public final View m384a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            C0270h1.m2191g("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f459j == 0) {
            C0270h1.m2190f("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f462m;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f459j, viewGroup, false);
        int i = this.f460k;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f461l = new WeakReference(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f460k;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f462m;
    }

    public int getLayoutResource() {
        return this.f459j;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f460k = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f462m = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f459j = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f461l;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                C0270h1.m2191g("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m384a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(mi1 mi1Var) {
    }
}

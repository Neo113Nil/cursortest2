package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC1986a;
import java.lang.ref.WeakReference;
import n.H0;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: k, reason: collision with root package name */
    public int f6792k;

    /* renamed from: l, reason: collision with root package name */
    public int f6793l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f6794m;

    /* renamed from: n, reason: collision with root package name */
    public LayoutInflater f6795n;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6792k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1986a.f17186t, 0, 0);
        this.f6793l = obtainStyledAttributes.getResourceId(2, -1);
        this.f6792k = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f6793l;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f6795n;
    }

    public int getLayoutResource() {
        return this.f6792k;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f6793l = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f6795n = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f6792k = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f6794m;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f6792k == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f6795n;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f6792k, viewGroup, false);
            int i5 = this.f6793l;
            if (i5 != -1) {
                inflate.setId(i5);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f6794m = new WeakReference(inflate);
        }
    }

    public void setOnInflateListener(H0 h02) {
    }
}

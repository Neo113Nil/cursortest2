package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC1174a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f8573a;

    /* renamed from: b, reason: collision with root package name */
    public int f8574b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f8575c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f8576d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f8573a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f8576d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f8573a, viewGroup, false);
        int i7 = this.f8574b;
        if (i7 != -1) {
            inflate.setId(i7);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f8575c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f8574b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f8576d;
    }

    public int getLayoutResource() {
        return this.f8573a;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f8574b = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f8576d = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f8573a = i7;
    }

    public void setOnInflateListener(p1 p1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f8575c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8573a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13322C, i7, 0);
        this.f8574b = obtainStyledAttributes.getResourceId(2, -1);
        this.f8573a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}

package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    public int f2158a;

    /* renamed from: b, reason: collision with root package name */
    public int f2159b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f2160c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f2161d;

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2158a = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2552v, 0, 0);
        this.f2159b = obtainStyledAttributes.getResourceId(2, -1);
        this.f2158a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2159b;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.f2161d;
    }

    public int getLayoutResource() {
        return this.f2158a;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f2159b = i2;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.f2161d = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f2158a = i2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        java.lang.ref.WeakReference weakReference = this.f2160c;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            if (view == null) {
                throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            android.view.ViewParent parent = getParent();
            if (!(parent instanceof android.view.ViewGroup)) {
                throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f2158a == 0) {
                throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            android.view.LayoutInflater layoutInflater = this.f2161d;
            if (layoutInflater == null) {
                layoutInflater = android.view.LayoutInflater.from(getContext());
            }
            android.view.View inflate = layoutInflater.inflate(this.f2158a, viewGroup, false);
            int i3 = this.f2159b;
            if (i3 != -1) {
                inflate.setId(i3);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2160c = new java.lang.ref.WeakReference(inflate);
        }
    }

    public void setOnInflateListener(h.s0 s0Var) {
    }
}

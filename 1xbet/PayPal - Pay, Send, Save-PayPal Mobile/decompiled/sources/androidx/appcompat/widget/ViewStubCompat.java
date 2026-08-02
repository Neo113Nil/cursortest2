package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final class ViewStubCompat extends android.view.View {
    private androidx.appcompat.widget.ViewStubCompat.OnInflateListener Camera2StreamConfigurationMap;
    private android.view.LayoutInflater getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private java.lang.ref.WeakReference<android.view.View> getHighSpeedVideoSizes;

    public interface OnInflateListener {
        void onInflate(androidx.appcompat.widget.ViewStubCompat viewStubCompat, android.view.View view);
    }

    @Override // android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ViewStubCompat, i, 0);
        this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final int getInflatedId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setInflatedId(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final int getLayoutResource() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setLayoutResource(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.getHighResolutionOutputSizeshNQ4ISI = layoutInflater;
    }

    public final android.view.LayoutInflater getLayoutInflater() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.getHighSpeedVideoSizes;
        if (weakReference != null) {
            android.view.View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            inflate();
        }
    }

    public final android.view.View inflate() {
        android.view.ViewParent parent = getParent();
        if (parent instanceof android.view.ViewGroup) {
            if (this.getHighSpeedVideoFpsRanges != 0) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                android.view.LayoutInflater layoutInflater = this.getHighResolutionOutputSizeshNQ4ISI;
                if (layoutInflater == null) {
                    layoutInflater = android.view.LayoutInflater.from(getContext());
                }
                android.view.View inflate = layoutInflater.inflate(this.getHighSpeedVideoFpsRanges, viewGroup, false);
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(inflate);
                androidx.appcompat.widget.ViewStubCompat.OnInflateListener onInflateListener = this.Camera2StreamConfigurationMap;
                if (onInflateListener != null) {
                    onInflateListener.onInflate(this, inflate);
                }
                return inflate;
            }
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.OnInflateListener onInflateListener) {
        this.Camera2StreamConfigurationMap = onInflateListener;
    }
}

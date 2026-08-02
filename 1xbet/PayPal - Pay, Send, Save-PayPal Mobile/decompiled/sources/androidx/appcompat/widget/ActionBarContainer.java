package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ActionBarContainer extends android.widget.FrameLayout {
    boolean Camera2StreamConfigurationMap;
    android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private android.view.View getInputFormats;
    private android.view.View getInputSizeshNQ4ISI;
    private android.view.View getOutputFormats;
    private boolean getOutputMinFrameDuration;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(android.content.Context context) {
        this(context, null);
    }

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new androidx.appcompat.widget.ActionBarBackgroundDrawable(this));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ActionBar);
        this.getHighSpeedVideoSizes = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_background);
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_backgroundStacked);
        this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == androidx.appcompat.R.id.split_action_bar) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.getHighSpeedVideoFpsRangesFor ? this.getHighSpeedVideoSizes != null || this.getHighSpeedVideoFpsRanges != null : this.getHighResolutionOutputSizeshNQ4ISI != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.getInputSizeshNQ4ISI = findViewById(androidx.appcompat.R.id.action_bar);
        this.getInputFormats = findViewById(androidx.appcompat.R.id.action_context_bar);
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoSizes;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.getHighSpeedVideoSizes);
        }
        this.getHighSpeedVideoSizes = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.getInputSizeshNQ4ISI;
            if (view != null) {
                this.getHighSpeedVideoSizes.setBounds(view.getLeft(), this.getInputSizeshNQ4ISI.getTop(), this.getInputSizeshNQ4ISI.getRight(), this.getInputSizeshNQ4ISI.getBottom());
            }
        }
        setWillNotDraw(!this.getHighSpeedVideoFpsRangesFor ? !(this.getHighSpeedVideoSizes == null && this.getHighSpeedVideoFpsRanges == null) : this.getHighResolutionOutputSizeshNQ4ISI != null);
        invalidate();
        androidx.appcompat.widget.ActionBarContainer.Api21Impl.getHighSpeedVideoFpsRangesFor(this);
    }

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.getHighSpeedVideoFpsRanges;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.getHighSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoFpsRanges = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.Camera2StreamConfigurationMap && (drawable2 = this.getHighSpeedVideoFpsRanges) != null) {
                drawable2.setBounds(this.getOutputFormats.getLeft(), this.getOutputFormats.getTop(), this.getOutputFormats.getRight(), this.getOutputFormats.getBottom());
            }
        }
        setWillNotDraw(!this.getHighSpeedVideoFpsRangesFor ? !(this.getHighSpeedVideoSizes == null && this.getHighSpeedVideoFpsRanges == null) : this.getHighResolutionOutputSizeshNQ4ISI != null);
        invalidate();
        androidx.appcompat.widget.ActionBarContainer.Api21Impl.getHighSpeedVideoFpsRangesFor(this);
    }

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.getHighSpeedVideoFpsRangesFor && (drawable2 = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.getHighSpeedVideoFpsRangesFor ? !(this.getHighSpeedVideoSizes != null || this.getHighSpeedVideoFpsRanges != null) : this.getHighResolutionOutputSizeshNQ4ISI == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        androidx.appcompat.widget.ActionBarContainer.Api21Impl.getHighSpeedVideoFpsRangesFor(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoFpsRanges;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.getHighSpeedVideoSizes && !this.getHighSpeedVideoFpsRangesFor) {
            return true;
        }
        if (drawable == this.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap) {
            return true;
        }
        return (drawable == this.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null && drawable.isStateful()) {
            this.getHighSpeedVideoSizes.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoFpsRanges;
        if (drawable2 != null && drawable2.isStateful()) {
            this.getHighSpeedVideoFpsRanges.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.getHighSpeedVideoFpsRanges;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.getOutputMinFrameDuration = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.getOutputMinFrameDuration || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(androidx.appcompat.widget.ScrollingTabContainerView scrollingTabContainerView) {
        android.view.View view = this.getOutputFormats;
        if (view != null) {
            removeView(view);
        }
        this.getOutputFormats = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            android.view.ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public android.view.View getTabContainer() {
        return this.getOutputFormats;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        int i4;
        int i5;
        if (this.getInputSizeshNQ4ISI == null && android.view.View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.getHighSpeedVideoSizesFor) >= 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i5, android.view.View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.getInputSizeshNQ4ISI != null) {
            int mode = android.view.View.MeasureSpec.getMode(i2);
            android.view.View view = this.getOutputFormats;
            if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
                return;
            }
            android.view.View view2 = this.getInputSizeshNQ4ISI;
            if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                android.view.View view3 = this.getInputSizeshNQ4ISI;
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams.topMargin;
                i4 = layoutParams.bottomMargin;
            } else {
                android.view.View view4 = this.getInputFormats;
                if (view4 != null && view4.getVisibility() != 8 && view4.getMeasuredHeight() != 0) {
                    android.view.View view5 = this.getInputFormats;
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view5.getLayoutParams();
                    measuredHeight = view5.getMeasuredHeight() + layoutParams2.topMargin;
                    i4 = layoutParams2.bottomMargin;
                } else {
                    i3 = 0;
                    int size = mode != Integer.MIN_VALUE ? android.view.View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE;
                    int measuredWidth = getMeasuredWidth();
                    android.view.View view6 = this.getOutputFormats;
                    android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) view6.getLayoutParams();
                    setMeasuredDimension(measuredWidth, java.lang.Math.min(i3 + view6.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin, size));
                }
            }
            i3 = measuredHeight + i4;
            if (mode != Integer.MIN_VALUE) {
            }
            int measuredWidth2 = getMeasuredWidth();
            android.view.View view62 = this.getOutputFormats;
            android.widget.FrameLayout.LayoutParams layoutParams32 = (android.widget.FrameLayout.LayoutParams) view62.getLayoutParams();
            setMeasuredDimension(measuredWidth2, java.lang.Math.min(i3 + view62.getMeasuredHeight() + layoutParams32.topMargin + layoutParams32.bottomMargin, size));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.graphics.drawable.Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        android.view.View view = this.getOutputFormats;
        boolean z2 = true;
        boolean z3 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            android.graphics.drawable.Drawable drawable2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (drawable2 == null) {
                return;
            } else {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.getHighSpeedVideoSizes == null) {
                z2 = false;
            } else if (this.getInputSizeshNQ4ISI.getVisibility() == 0) {
                this.getHighSpeedVideoSizes.setBounds(this.getInputSizeshNQ4ISI.getLeft(), this.getInputSizeshNQ4ISI.getTop(), this.getInputSizeshNQ4ISI.getRight(), this.getInputSizeshNQ4ISI.getBottom());
            } else {
                android.view.View view2 = this.getInputFormats;
                if (view2 != null && view2.getVisibility() == 0) {
                    this.getHighSpeedVideoSizes.setBounds(this.getInputFormats.getLeft(), this.getInputFormats.getTop(), this.getInputFormats.getRight(), this.getInputFormats.getBottom());
                } else {
                    this.getHighSpeedVideoSizes.setBounds(0, 0, 0, 0);
                }
            }
            this.Camera2StreamConfigurationMap = z3;
            if (z3 && (drawable = this.getHighSpeedVideoFpsRanges) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else if (!z2) {
                return;
            }
        }
        invalidate();
    }

    /* loaded from: classes5.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        public static void getHighSpeedVideoFpsRangesFor(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }
}

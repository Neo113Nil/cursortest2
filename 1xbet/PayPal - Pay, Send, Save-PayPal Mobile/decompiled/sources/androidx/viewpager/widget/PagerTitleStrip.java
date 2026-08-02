package androidx.viewpager.widget;

@androidx.viewpager.widget.ViewPager.DecorView
/* loaded from: classes7.dex */
public class PagerTitleStrip extends android.view.ViewGroup {
    private static final int[] getOutputFormats = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.gravity};
    private static final int[] getOutputMinFrameDuration = {android.R.attr.textAllCaps};
    androidx.viewpager.widget.ViewPager Camera2StreamConfigurationMap;
    android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    android.widget.TextView getHighSpeedVideoFpsRangesFor;
    android.widget.TextView getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private final androidx.viewpager.widget.PagerTitleStrip.PageListener getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> unwrapAs;

    static class SingleLineAllCapsTransform extends android.text.method.SingleLineTransformationMethod {
        private java.util.Locale getHighSpeedVideoSizes;

        SingleLineAllCapsTransform(android.content.Context context) {
            this.getHighSpeedVideoSizes = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
            java.lang.CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.getHighSpeedVideoSizes);
            }
            return null;
        }
    }

    public PagerTitleStrip(android.content.Context context) {
        this(context, null);
    }

    public PagerTitleStrip(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getInputFormats = -1;
        this.getHighSpeedVideoFpsRanges = -1.0f;
        this.getOutputMinFrameDurationlomOqCM = new androidx.viewpager.widget.PagerTitleStrip.PageListener();
        android.widget.TextView textView = new android.widget.TextView(context);
        this.getHighSpeedVideoFpsRangesFor = textView;
        addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.getHighSpeedVideoSizes = textView2;
        addView(textView2);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        this.getHighResolutionOutputSizeshNQ4ISI = textView3;
        addView(textView3);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getOutputFormats);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            androidx.core.widget.TextViewCompat.setTextAppearance(this.getHighSpeedVideoFpsRangesFor, resourceId);
            androidx.core.widget.TextViewCompat.setTextAppearance(this.getHighSpeedVideoSizes, resourceId);
            androidx.core.widget.TextViewCompat.setTextAppearance(this.getHighResolutionOutputSizeshNQ4ISI, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.getHighSpeedVideoFpsRangesFor.setTextColor(color);
            this.getHighSpeedVideoSizes.setTextColor(color);
            this.getHighResolutionOutputSizeshNQ4ISI.setTextColor(color);
        }
        this.getInputSizeshNQ4ISI = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizes.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.getHighSpeedVideoFpsRangesFor.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.getHighSpeedVideoSizes.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.getHighResolutionOutputSizeshNQ4ISI.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, getOutputMinFrameDuration);
            boolean z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
            if (z) {
                android.widget.TextView textView4 = this.getHighSpeedVideoFpsRangesFor;
                textView4.setTransformationMethod(new androidx.viewpager.widget.PagerTitleStrip.SingleLineAllCapsTransform(textView4.getContext()));
                android.widget.TextView textView5 = this.getHighSpeedVideoSizes;
                textView5.setTransformationMethod(new androidx.viewpager.widget.PagerTitleStrip.SingleLineAllCapsTransform(textView5.getContext()));
                android.widget.TextView textView6 = this.getHighResolutionOutputSizeshNQ4ISI;
                textView6.setTransformationMethod(new androidx.viewpager.widget.PagerTitleStrip.SingleLineAllCapsTransform(textView6.getContext()));
                this.getOutputSizeshNQ4ISI = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
            }
        }
        this.getHighSpeedVideoFpsRangesFor.setSingleLine();
        this.getHighSpeedVideoSizes.setSingleLine();
        this.getHighResolutionOutputSizeshNQ4ISI.setSingleLine();
        this.getOutputSizeshNQ4ISI = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.getOutputSizeshNQ4ISI = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.getOutputStallDurationlomOqCM = i;
        int i2 = (i << 24) | (this.getHighSpeedVideoSizesFor & 16777215);
        this.getHighSpeedVideoFpsRangesFor.setTextColor(i2);
        this.getHighResolutionOutputSizeshNQ4ISI.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.getHighSpeedVideoSizesFor = i;
        this.getHighSpeedVideoSizes.setTextColor(i);
        int i2 = (this.getOutputStallDurationlomOqCM << 24) | (this.getHighSpeedVideoSizesFor & 16777215);
        this.getHighSpeedVideoFpsRangesFor.setTextColor(i2);
        this.getHighResolutionOutputSizeshNQ4ISI.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.getHighSpeedVideoFpsRangesFor.setTextSize(i, f);
        this.getHighSpeedVideoSizes.setTextSize(i, f);
        this.getHighResolutionOutputSizeshNQ4ISI.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.getInputSizeshNQ4ISI = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof androidx.viewpager.widget.ViewPager)) {
            throw new java.lang.IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) parent;
        androidx.viewpager.widget.PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.getOutputMinFrameDurationlomOqCM);
        viewPager.addOnAdapterChangeListener(this.getOutputMinFrameDurationlomOqCM);
        this.Camera2StreamConfigurationMap = viewPager;
        java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> weakReference = this.unwrapAs;
        getHighResolutionOutputSizeshNQ4ISI(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.viewpager.widget.ViewPager viewPager = this.Camera2StreamConfigurationMap;
        if (viewPager != null) {
            getHighResolutionOutputSizeshNQ4ISI(viewPager.getAdapter(), null);
            this.Camera2StreamConfigurationMap.setInternalPageChangeListener(null);
            this.Camera2StreamConfigurationMap.removeOnAdapterChangeListener(this.getOutputMinFrameDurationlomOqCM);
            this.Camera2StreamConfigurationMap = null;
        }
    }

    final void getHighSpeedVideoFpsRanges(int i, androidx.viewpager.widget.PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.getOutputStallDuration = true;
        java.lang.CharSequence charSequence = null;
        this.getHighSpeedVideoFpsRangesFor.setText((i <= 0 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i - 1));
        this.getHighSpeedVideoSizes.setText((pagerAdapter == null || i >= count) ? null : pagerAdapter.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && pagerAdapter != null) {
            charSequence = pagerAdapter.getPageTitle(i2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setText(charSequence);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.getHighSpeedVideoFpsRangesFor.measure(makeMeasureSpec, makeMeasureSpec2);
        this.getHighSpeedVideoSizes.measure(makeMeasureSpec, makeMeasureSpec2);
        this.getHighResolutionOutputSizeshNQ4ISI.measure(makeMeasureSpec, makeMeasureSpec2);
        this.getInputFormats = i;
        if (!this.getOutputSizes) {
            Camera2StreamConfigurationMap(i, this.getHighSpeedVideoFpsRanges, false);
        }
        this.getOutputStallDuration = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.getOutputStallDuration) {
            return;
        }
        super.requestLayout();
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.getOutputMinFrameDurationlomOqCM);
            this.unwrapAs = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.getOutputMinFrameDurationlomOqCM);
            this.unwrapAs = new java.lang.ref.WeakReference<>(pagerAdapter2);
        }
        androidx.viewpager.widget.ViewPager viewPager = this.Camera2StreamConfigurationMap;
        if (viewPager != null) {
            this.getInputFormats = -1;
            this.getHighSpeedVideoFpsRanges = -1.0f;
            getHighSpeedVideoFpsRanges(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    void Camera2StreamConfigurationMap(int i, float f, boolean z) {
        if (i != this.getInputFormats) {
            getHighSpeedVideoFpsRanges(i, this.Camera2StreamConfigurationMap.getAdapter());
        } else if (!z && f == this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getOutputSizes = true;
        int measuredWidth = this.getHighSpeedVideoFpsRangesFor.getMeasuredWidth();
        int measuredWidth2 = this.getHighSpeedVideoSizes.getMeasuredWidth();
        int measuredWidth3 = this.getHighResolutionOutputSizeshNQ4ISI.getMeasuredWidth();
        int i2 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = paddingRight + i2;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i4 = ((width - i3) - ((int) (((width - (paddingLeft + i2)) - i3) * f2))) - i2;
        int i5 = measuredWidth2 + i4;
        int baseline = this.getHighSpeedVideoFpsRangesFor.getBaseline();
        int baseline2 = this.getHighSpeedVideoSizes.getBaseline();
        int baseline3 = this.getHighResolutionOutputSizeshNQ4ISI.getBaseline();
        int max = java.lang.Math.max(java.lang.Math.max(baseline, baseline2), baseline3);
        int i6 = max - baseline;
        int i7 = max - baseline2;
        int i8 = max - baseline3;
        int max2 = java.lang.Math.max(java.lang.Math.max(this.getHighSpeedVideoFpsRangesFor.getMeasuredHeight() + i6, this.getHighSpeedVideoSizes.getMeasuredHeight() + i7), this.getHighResolutionOutputSizeshNQ4ISI.getMeasuredHeight() + i8);
        int i9 = this.getInputSizeshNQ4ISI & 112;
        if (i9 == 16) {
            paddingTop = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i9 == 80) {
            paddingTop = (height - paddingBottom) - max2;
        }
        int i10 = i6 + paddingTop;
        int i11 = i7 + paddingTop;
        int i12 = paddingTop + i8;
        android.widget.TextView textView = this.getHighSpeedVideoSizes;
        textView.layout(i4, i11, i5, textView.getMeasuredHeight() + i11);
        int min = java.lang.Math.min(paddingLeft, (i4 - this.getOutputSizeshNQ4ISI) - measuredWidth);
        android.widget.TextView textView2 = this.getHighSpeedVideoFpsRangesFor;
        textView2.layout(min, i10, measuredWidth + min, textView2.getMeasuredHeight() + i10);
        int max3 = java.lang.Math.max((width - paddingRight) - measuredWidth3, i5 + this.getOutputSizeshNQ4ISI);
        android.widget.TextView textView3 = this.getHighResolutionOutputSizeshNQ4ISI;
        textView3.layout(max3, i12, max3 + measuredWidth3, textView3.getMeasuredHeight() + i12);
        this.getHighSpeedVideoFpsRanges = f;
        this.getOutputSizes = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int max;
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            throw new java.lang.IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.getHighSpeedVideoFpsRangesFor.measure(childMeasureSpec2, childMeasureSpec);
        this.getHighSpeedVideoSizes.measure(childMeasureSpec2, childMeasureSpec);
        this.getHighResolutionOutputSizeshNQ4ISI.measure(childMeasureSpec2, childMeasureSpec);
        if (android.view.View.MeasureSpec.getMode(i2) == 1073741824) {
            max = android.view.View.MeasureSpec.getSize(i2);
        } else {
            max = java.lang.Math.max(getHighSpeedVideoSizes(), this.getHighSpeedVideoSizes.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, android.view.View.resolveSizeAndState(max, i2, this.getHighSpeedVideoSizes.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.Camera2StreamConfigurationMap != null) {
            float f = this.getHighSpeedVideoFpsRanges;
            if (f < 0.0f) {
                f = 0.0f;
            }
            Camera2StreamConfigurationMap(this.getInputFormats, f, true);
        }
    }

    int getHighSpeedVideoSizes() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    class PageListener extends android.database.DataSetObserver implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private int Camera2StreamConfigurationMap;

        PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            androidx.viewpager.widget.PagerTitleStrip.this.Camera2StreamConfigurationMap(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.Camera2StreamConfigurationMap == 0) {
                androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip = androidx.viewpager.widget.PagerTitleStrip.this;
                pagerTitleStrip.getHighSpeedVideoFpsRanges(pagerTitleStrip.Camera2StreamConfigurationMap.getCurrentItem(), androidx.viewpager.widget.PagerTitleStrip.this.Camera2StreamConfigurationMap.getAdapter());
                float f = androidx.viewpager.widget.PagerTitleStrip.this.getHighSpeedVideoFpsRanges >= 0.0f ? androidx.viewpager.widget.PagerTitleStrip.this.getHighSpeedVideoFpsRanges : 0.0f;
                androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip2 = androidx.viewpager.widget.PagerTitleStrip.this;
                pagerTitleStrip2.Camera2StreamConfigurationMap(pagerTitleStrip2.Camera2StreamConfigurationMap.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.PagerAdapter pagerAdapter, androidx.viewpager.widget.PagerAdapter pagerAdapter2) {
            androidx.viewpager.widget.PagerTitleStrip.this.getHighResolutionOutputSizeshNQ4ISI(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip = androidx.viewpager.widget.PagerTitleStrip.this;
            pagerTitleStrip.getHighSpeedVideoFpsRanges(pagerTitleStrip.Camera2StreamConfigurationMap.getCurrentItem(), androidx.viewpager.widget.PagerTitleStrip.this.Camera2StreamConfigurationMap.getAdapter());
            float f = androidx.viewpager.widget.PagerTitleStrip.this.getHighSpeedVideoFpsRanges >= 0.0f ? androidx.viewpager.widget.PagerTitleStrip.this.getHighSpeedVideoFpsRanges : 0.0f;
            androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip2 = androidx.viewpager.widget.PagerTitleStrip.this;
            pagerTitleStrip2.Camera2StreamConfigurationMap(pagerTitleStrip2.Camera2StreamConfigurationMap.getCurrentItem(), f, true);
        }
    }
}

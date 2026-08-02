package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    private androidx.appcompat.widget.ContentFrameLayout.OnAttachListener Camera2StreamConfigurationMap;
    private android.util.TypedValue getHighResolutionOutputSizeshNQ4ISI;
    private android.util.TypedValue getHighSpeedVideoFpsRanges;
    private final android.graphics.Rect getHighSpeedVideoFpsRangesFor;
    private android.util.TypedValue getHighSpeedVideoSizes;
    private android.util.TypedValue getHighSpeedVideoSizesFor;
    private android.util.TypedValue getInputFormats;
    private android.util.TypedValue getInputSizeshNQ4ISI;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
    }

    public void dispatchFitSystemWindows(android.graphics.Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(androidx.appcompat.widget.ContentFrameLayout.OnAttachListener onAttachListener) {
        this.Camera2StreamConfigurationMap = onAttachListener;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoFpsRangesFor.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        boolean z;
        int measuredWidth;
        android.util.TypedValue typedValue;
        int i3;
        float fraction;
        int i4;
        float fraction2;
        int i5;
        float fraction3;
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            android.util.TypedValue typedValue2 = z3 ? this.getInputSizeshNQ4ISI : this.getHighSpeedVideoSizes;
            if (typedValue2 != null && typedValue2.type != 0) {
                if (typedValue2.type == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (typedValue2.type == 6) {
                    fraction3 = typedValue2.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                } else {
                    i5 = 0;
                    if (i5 > 0) {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i5 - (this.getHighSpeedVideoFpsRangesFor.left + this.getHighSpeedVideoFpsRangesFor.right), android.view.View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            android.util.TypedValue typedValue3 = z3 ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoFpsRanges;
                            if (typedValue3 != null && typedValue3.type != 0) {
                                if (typedValue3.type == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (typedValue3.type == 6) {
                                    fraction2 = typedValue3.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels);
                                } else {
                                    i4 = 0;
                                    if (i4 > 0) {
                                        i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4 - (this.getHighSpeedVideoFpsRangesFor.top + this.getHighSpeedVideoFpsRangesFor.bottom), android.view.View.MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                i4 = (int) fraction2;
                                if (i4 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i, i2);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z && mode == Integer.MIN_VALUE) {
                            typedValue = !z3 ? this.getInputFormats : this.getHighSpeedVideoSizesFor;
                            if (typedValue != null && typedValue.type != 0) {
                                if (typedValue.type != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (typedValue.type == 6) {
                                    fraction = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                                } else {
                                    i3 = 0;
                                    if (i3 > 0) {
                                        i3 -= this.getHighSpeedVideoFpsRangesFor.left + this.getHighSpeedVideoFpsRangesFor.right;
                                    }
                                    if (measuredWidth < i3) {
                                        makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                        if (z2) {
                                            super.onMeasure(makeMeasureSpec, i2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i3 = (int) fraction;
                                if (i3 > 0) {
                                }
                                if (measuredWidth < i3) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i5 = (int) fraction3;
                if (i5 > 0) {
                }
            }
        }
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i, i2);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
            if (!z3) {
            }
            if (typedValue != null) {
                if (typedValue.type != 5) {
                }
                i3 = (int) fraction;
                if (i3 > 0) {
                }
                if (measuredWidth < i3) {
                }
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    public android.util.TypedValue getMinWidthMajor() {
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new android.util.TypedValue();
        }
        return this.getHighSpeedVideoSizesFor;
    }

    public android.util.TypedValue getMinWidthMinor() {
        if (this.getInputFormats == null) {
            this.getInputFormats = new android.util.TypedValue();
        }
        return this.getInputFormats;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new android.util.TypedValue();
        }
        return this.getHighSpeedVideoSizes;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new android.util.TypedValue();
        }
        return this.getInputSizeshNQ4ISI;
    }

    public android.util.TypedValue getFixedHeightMajor() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.util.TypedValue();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new android.util.TypedValue();
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.ContentFrameLayout.OnAttachListener onAttachListener = this.Camera2StreamConfigurationMap;
        if (onAttachListener != null) {
            onAttachListener.onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.ContentFrameLayout.OnAttachListener onAttachListener = this.Camera2StreamConfigurationMap;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }
}

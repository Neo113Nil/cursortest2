package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public android.util.TypedValue f2038a;

    /* renamed from: b, reason: collision with root package name */
    public android.util.TypedValue f2039b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.TypedValue f2040c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.TypedValue f2041d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.TypedValue f2042e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.TypedValue f2043f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f2044g;

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2044g = new android.graphics.Rect();
    }

    public final void a(android.graphics.Rect rect) {
        fitSystemWindows(rect);
    }

    public android.util.TypedValue getFixedHeightMajor() {
        if (this.f2042e == null) {
            this.f2042e = new android.util.TypedValue();
        }
        return this.f2042e;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        if (this.f2043f == null) {
            this.f2043f = new android.util.TypedValue();
        }
        return this.f2043f;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        if (this.f2040c == null) {
            this.f2040c = new android.util.TypedValue();
        }
        return this.f2040c;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        if (this.f2041d == null) {
            this.f2041d = new android.util.TypedValue();
        }
        return this.f2041d;
    }

    public android.util.TypedValue getMinWidthMajor() {
        if (this.f2038a == null) {
            this.f2038a = new android.util.TypedValue();
        }
        return this.f2038a;
    }

    public android.util.TypedValue getMinWidthMinor() {
        if (this.f2039b == null) {
            this.f2039b = new android.util.TypedValue();
        }
        return this.f2039b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int measuredWidth;
        android.util.TypedValue typedValue;
        int i6;
        int i7;
        float fraction;
        int i8;
        int i9;
        float fraction2;
        int i10;
        int i11;
        float fraction3;
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i3);
        android.graphics.Rect rect = this.f2044g;
        if (mode == Integer.MIN_VALUE) {
            android.util.TypedValue typedValue2 = z4 ? this.f2041d : this.f2040c;
            if (typedValue2 != null && (i10 = typedValue2.type) != 0) {
                if (i10 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i10 == 6) {
                    int i12 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i12, i12);
                } else {
                    i11 = 0;
                    if (i11 > 0) {
                        i4 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i11 - (rect.left + rect.right), android.view.View.MeasureSpec.getSize(i2)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            android.util.TypedValue typedValue3 = z4 ? this.f2042e : this.f2043f;
                            if (typedValue3 != null && (i8 = typedValue3.type) != 0) {
                                if (i8 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i8 == 6) {
                                    int i13 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i13, i13);
                                } else {
                                    i9 = 0;
                                    if (i9 > 0) {
                                        i5 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i9 - (rect.top + rect.bottom), android.view.View.MeasureSpec.getSize(i3)), 1073741824);
                                        super.onMeasure(i4, i5);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z2 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z4 ? this.f2039b : this.f2038a;
                                            if (typedValue != null && (i6 = typedValue.type) != 0) {
                                                if (i6 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i6 == 6) {
                                                    int i14 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i14, i14);
                                                } else {
                                                    i7 = 0;
                                                    if (i7 > 0) {
                                                        i7 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i7) {
                                                        makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                                                        if (z3) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i5);
                                                        return;
                                                    }
                                                }
                                                i7 = (int) fraction;
                                                if (i7 > 0) {
                                                }
                                                if (measuredWidth < i7) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (z3) {
                                        }
                                    }
                                }
                                i9 = (int) fraction2;
                                if (i9 > 0) {
                                }
                            }
                        }
                        i5 = i3;
                        super.onMeasure(i4, i5);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2) {
                            if (!z4) {
                            }
                            if (typedValue != null) {
                                if (i6 != 5) {
                                }
                                i7 = (int) fraction;
                                if (i7 > 0) {
                                }
                                if (measuredWidth < i7) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
                i11 = (int) fraction3;
                if (i11 > 0) {
                }
            }
        }
        i4 = i2;
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i5 = i3;
        super.onMeasure(i4, i5);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
        }
        z3 = false;
        if (z3) {
        }
    }

    public void setAttachListener(h.InterfaceC0163v interfaceC0163v) {
    }
}

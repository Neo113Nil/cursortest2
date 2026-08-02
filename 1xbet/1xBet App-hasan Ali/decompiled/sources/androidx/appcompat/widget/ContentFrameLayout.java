package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import n.InterfaceC2117K;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f6742k;

    /* renamed from: l, reason: collision with root package name */
    public TypedValue f6743l;

    /* renamed from: m, reason: collision with root package name */
    public TypedValue f6744m;

    /* renamed from: n, reason: collision with root package name */
    public TypedValue f6745n;

    /* renamed from: o, reason: collision with root package name */
    public TypedValue f6746o;

    /* renamed from: p, reason: collision with root package name */
    public TypedValue f6747p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f6748q;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6748q = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f6746o == null) {
            this.f6746o = new TypedValue();
        }
        return this.f6746o;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f6747p == null) {
            this.f6747p = new TypedValue();
        }
        return this.f6747p;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f6744m == null) {
            this.f6744m = new TypedValue();
        }
        return this.f6744m;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f6745n == null) {
            this.f6745n = new TypedValue();
        }
        return this.f6745n;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f6742k == null) {
            this.f6742k = new TypedValue();
        }
        return this.f6742k;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f6743l == null) {
            this.f6743l = new TypedValue();
        }
        return this.f6743l;
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
    public final void onMeasure(int i, int i5) {
        int i6;
        boolean z3;
        int i7;
        int measuredWidth;
        TypedValue typedValue;
        int i8;
        int i9;
        float fraction;
        int i10;
        int i11;
        float fraction2;
        int i12;
        int i13;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i5);
        Rect rect = this.f6748q;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z6 ? this.f6745n : this.f6744m;
            if (typedValue2 != null && (i12 = typedValue2.type) != 0) {
                if (i12 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i12 == 6) {
                    int i14 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i14, i14);
                } else {
                    i13 = 0;
                    if (i13 > 0) {
                        i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z6 ? this.f6746o : this.f6747p;
                            if (typedValue3 != null && (i10 = typedValue3.type) != 0) {
                                if (i10 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i10 == 6) {
                                    int i15 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i15, i15);
                                } else {
                                    i11 = 0;
                                    if (i11 > 0) {
                                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                                        super.onMeasure(i6, i7);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z6 ? this.f6743l : this.f6742k;
                                            if (typedValue != null && (i8 = typedValue.type) != 0) {
                                                if (i8 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i8 == 6) {
                                                    int i16 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i16, i16);
                                                } else {
                                                    i9 = 0;
                                                    if (i9 > 0) {
                                                        i9 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i9) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                                                        if (z5) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i7);
                                                        return;
                                                    }
                                                }
                                                i9 = (int) fraction;
                                                if (i9 > 0) {
                                                }
                                                if (measuredWidth < i9) {
                                                }
                                            }
                                        }
                                        z5 = false;
                                        if (z5) {
                                        }
                                    }
                                }
                                i11 = (int) fraction2;
                                if (i11 > 0) {
                                }
                            }
                        }
                        i7 = i5;
                        super.onMeasure(i6, i7);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z3) {
                            if (!z6) {
                            }
                            if (typedValue != null) {
                                if (i8 != 5) {
                                }
                                i9 = (int) fraction;
                                if (i9 > 0) {
                                }
                                if (measuredWidth < i9) {
                                }
                            }
                        }
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
                i13 = (int) fraction3;
                if (i13 > 0) {
                }
            }
        }
        i6 = i;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i7 = i5;
        super.onMeasure(i6, i7);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3) {
        }
        z5 = false;
        if (z5) {
        }
    }

    public void setAttachListener(InterfaceC2117K interfaceC2117K) {
    }
}

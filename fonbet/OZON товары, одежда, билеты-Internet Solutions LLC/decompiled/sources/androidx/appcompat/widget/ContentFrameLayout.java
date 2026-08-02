package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f37616a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f37617b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f37618c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f37619d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f37620e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f37621f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f37622g;

    /* renamed from: h, reason: collision with root package name */
    private a f37623h;

    public interface a {
        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f37622g = new Rect();
    }

    public final TypedValue a() {
        if (this.f37620e == null) {
            this.f37620e = new TypedValue();
        }
        return this.f37620e;
    }

    public final TypedValue b() {
        if (this.f37621f == null) {
            this.f37621f = new TypedValue();
        }
        return this.f37621f;
    }

    public final TypedValue c() {
        if (this.f37618c == null) {
            this.f37618c = new TypedValue();
        }
        return this.f37618c;
    }

    public final TypedValue d() {
        if (this.f37619d == null) {
            this.f37619d = new TypedValue();
        }
        return this.f37619d;
    }

    public final TypedValue e() {
        if (this.f37616a == null) {
            this.f37616a = new TypedValue();
        }
        return this.f37616a;
    }

    public final TypedValue f() {
        if (this.f37617b == null) {
            this.f37617b = new TypedValue();
        }
        return this.f37617b;
    }

    public final void g(a aVar) {
        this.f37623h = aVar;
    }

    public final void h(int i11, int i12, int i13, int i14) {
        this.f37622g.set(i11, i12, i13, i14);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f37623h;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f37623h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
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
    protected final void onMeasure(int i11, int i12) {
        int i13;
        boolean z11;
        int i14;
        int measuredWidth;
        TypedValue typedValue;
        int i15;
        int i16;
        float fraction;
        int i17;
        int i18;
        float fraction2;
        int i19;
        int i21;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z12 = true;
        boolean z13 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        Rect rect = this.f37622g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z13 ? this.f37619d : this.f37618c;
            if (typedValue2 != null && (i19 = typedValue2.type) != 0) {
                if (i19 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i19 == 6) {
                    int i22 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i22, i22);
                } else {
                    i21 = 0;
                    if (i21 > 0) {
                        i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i21 - (rect.left + rect.right), View.MeasureSpec.getSize(i11)), 1073741824);
                        z11 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z13 ? this.f37620e : this.f37621f;
                            if (typedValue3 != null && (i17 = typedValue3.type) != 0) {
                                if (i17 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i17 == 6) {
                                    int i23 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i23, i23);
                                } else {
                                    i18 = 0;
                                    if (i18 > 0) {
                                        i14 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                                        super.onMeasure(i13, i14);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z11 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z13 ? this.f37617b : this.f37616a;
                                            if (typedValue != null && (i15 = typedValue.type) != 0) {
                                                if (i15 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i15 == 6) {
                                                    int i24 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i24, i24);
                                                } else {
                                                    i16 = 0;
                                                    if (i16 > 0) {
                                                        i16 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i16) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                                        if (z12) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i14);
                                                        return;
                                                    }
                                                }
                                                i16 = (int) fraction;
                                                if (i16 > 0) {
                                                }
                                                if (measuredWidth < i16) {
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z12) {
                                        }
                                    }
                                }
                                i18 = (int) fraction2;
                                if (i18 > 0) {
                                }
                            }
                        }
                        i14 = i12;
                        super.onMeasure(i13, i14);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z11) {
                            if (!z13) {
                            }
                            if (typedValue != null) {
                                if (i15 != 5) {
                                }
                                i16 = (int) fraction;
                                if (i16 > 0) {
                                }
                                if (measuredWidth < i16) {
                                }
                            }
                        }
                        z12 = false;
                        if (z12) {
                        }
                    }
                }
                i21 = (int) fraction3;
                if (i21 > 0) {
                }
            }
        }
        i13 = i11;
        z11 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i14 = i12;
        super.onMeasure(i13, i14);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z11) {
        }
        z12 = false;
        if (z12) {
        }
    }
}

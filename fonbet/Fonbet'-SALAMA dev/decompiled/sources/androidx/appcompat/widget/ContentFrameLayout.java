package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f8327a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f8328b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f8329c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f8330d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f8331e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f8332f;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f8333x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0627a0 f8334y;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f8331e == null) {
            this.f8331e = new TypedValue();
        }
        return this.f8331e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f8332f == null) {
            this.f8332f = new TypedValue();
        }
        return this.f8332f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f8329c == null) {
            this.f8329c = new TypedValue();
        }
        return this.f8329c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8330d == null) {
            this.f8330d = new TypedValue();
        }
        return this.f8330d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f8327a == null) {
            this.f8327a = new TypedValue();
        }
        return this.f8327a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f8328b == null) {
            this.f8328b = new TypedValue();
        }
        return this.f8328b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0627a0 interfaceC0627a0 = this.f8334y;
        if (interfaceC0627a0 != null) {
            interfaceC0627a0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0644j c0644j;
        super.onDetachedFromWindow();
        InterfaceC0627a0 interfaceC0627a0 = this.f8334y;
        if (interfaceC0627a0 != null) {
            i.v vVar = (i.v) ((A1.x0) interfaceC0627a0).f613b;
            InterfaceC0629b0 interfaceC0629b0 = vVar.f13756I;
            if (interfaceC0629b0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0629b0;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((j1) actionBarOverlayLayout.f8230e).f8662a.f8532a;
                if (actionMenuView != null && (c0644j = actionMenuView.f8239K) != null) {
                    c0644j.h();
                    C0634e c0634e = c0644j.f8647K;
                    if (c0634e != null && c0634e.b()) {
                        c0634e.f15199i.dismiss();
                    }
                }
            }
            if (vVar.f13761N != null) {
                vVar.f13750C.getDecorView().removeCallbacks(vVar.f13762O);
                if (vVar.f13761N.isShowing()) {
                    try {
                        vVar.f13761N.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f13761N = null;
            }
            P.b0 b0Var = vVar.f13763P;
            if (b0Var != null) {
                b0Var.b();
            }
            m.k kVar = vVar.A(0).f13736h;
            if (kVar != null) {
                kVar.c(true);
            }
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
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z4;
        int i10;
        int measuredWidth;
        TypedValue typedValue;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z8 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        Rect rect = this.f8333x;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z8 ? this.f8330d : this.f8329c;
            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                if (i15 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i15 == 6) {
                    int i17 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i17, i17);
                } else {
                    i16 = 0;
                    if (i16 > 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z4 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z8 ? this.f8331e : this.f8332f;
                            if (typedValue3 != null && (i13 = typedValue3.type) != 0) {
                                if (i13 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i13 == 6) {
                                    int i18 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i18, i18);
                                } else {
                                    i14 = 0;
                                    if (i14 > 0) {
                                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                                        super.onMeasure(i9, i10);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z4 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z8 ? this.f8328b : this.f8327a;
                                            if (typedValue != null && (i11 = typedValue.type) != 0) {
                                                if (i11 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i11 == 6) {
                                                    int i19 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i19, i19);
                                                } else {
                                                    i12 = 0;
                                                    if (i12 > 0) {
                                                        i12 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i12) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                                        if (z7) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i10);
                                                        return;
                                                    }
                                                }
                                                i12 = (int) fraction;
                                                if (i12 > 0) {
                                                }
                                                if (measuredWidth < i12) {
                                                }
                                            }
                                        }
                                        z7 = false;
                                        if (z7) {
                                        }
                                    }
                                }
                                i14 = (int) fraction2;
                                if (i14 > 0) {
                                }
                            }
                        }
                        i10 = i8;
                        super.onMeasure(i9, i10);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z4) {
                            if (!z8) {
                            }
                            if (typedValue != null) {
                                if (i11 != 5) {
                                }
                                i12 = (int) fraction;
                                if (i12 > 0) {
                                }
                                if (measuredWidth < i12) {
                                }
                            }
                        }
                        z7 = false;
                        if (z7) {
                        }
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                }
            }
        }
        i9 = i7;
        z4 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i10 = i8;
        super.onMeasure(i9, i10);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z4) {
        }
        z7 = false;
        if (z7) {
        }
    }

    public void setAttachListener(InterfaceC0627a0 interfaceC0627a0) {
        this.f8334y = interfaceC0627a0;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8333x = new Rect();
    }
}

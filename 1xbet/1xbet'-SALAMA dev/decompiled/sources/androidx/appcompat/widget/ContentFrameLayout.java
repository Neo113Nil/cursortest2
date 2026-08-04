package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f8327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f8328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f8330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f8331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f8332f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f8333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InterfaceC0606a0 f8334y;

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
        InterfaceC0606a0 interfaceC0606a0 = this.f8334y;
        if (interfaceC0606a0 != null) {
            interfaceC0606a0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0623j c0623j;
        super.onDetachedFromWindow();
        InterfaceC0606a0 interfaceC0606a0 = this.f8334y;
        if (interfaceC0606a0 != null) {
            p058i.v vVar = (p058i.v) ((A1.x0) interfaceC0606a0).f613b;
            InterfaceC0608b0 interfaceC0608b0 = vVar.f13762I;
            if (interfaceC0608b0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0608b0;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((j1) actionBarOverlayLayout.f8230e).f8662a.f8532a;
                if (actionMenuView != null && (c0623j = actionMenuView.f8239K) != null) {
                    c0623j.h();
                    C0613e c0613e = c0623j.f8647K;
                    if (c0613e != null && c0613e.b()) {
                        c0613e.f15205i.dismiss();
                    }
                }
            }
            if (vVar.f13767N != null) {
                vVar.f13756C.getDecorView().removeCallbacks(vVar.f13768O);
                if (vVar.f13767N.isShowing()) {
                    try {
                        vVar.f13767N.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f13767N = null;
            }
            P.b0 b0Var = vVar.f13769P;
            if (b0Var != null) {
                b0Var.b();
            }
            p086m.k kVar = vVar.A(0).f13742h;
            if (kVar != null) {
                kVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int iMakeMeasureSpec;
        boolean z4;
        int iMakeMeasureSpec2;
        int i9;
        int i10;
        float fraction;
        int i11;
        int i12;
        float fraction2;
        int i13;
        int i14;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z8 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        Rect rect = this.f8333x;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i7;
            z4 = false;
        } else {
            TypedValue typedValue = z8 ? this.f8330d : this.f8329c;
            if (typedValue == null || (i13 = typedValue.type) == 0) {
                iMakeMeasureSpec = i7;
                z4 = false;
            } else {
                if (i13 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i15 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i15, i15);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z4 = true;
                    } else {
                        iMakeMeasureSpec = i7;
                        z4 = false;
                    }
                }
                i14 = (int) fraction3;
                if (i14 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                    z4 = true;
                } else {
                    iMakeMeasureSpec = i7;
                    z4 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i8;
        } else {
            TypedValue typedValue2 = z8 ? this.f8331e : this.f8332f;
            if (typedValue2 == null || (i11 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i8;
            } else {
                if (i11 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i16 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i16, i16);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i8;
                    }
                }
                i12 = (int) fraction2;
                if (i12 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i8;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z4 || mode != Integer.MIN_VALUE) {
            z7 = false;
        } else {
            TypedValue typedValue3 = z8 ? this.f8328b : this.f8327a;
            if (typedValue3 == null || (i9 = typedValue3.type) == 0) {
                z7 = false;
            } else {
                if (i9 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i9 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i17, i17);
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        i10 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i10) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else {
                        z7 = false;
                    }
                }
                i10 = (int) fraction;
                if (i10 > 0) {
                    i10 -= rect.left + rect.right;
                }
                if (measuredWidth < i10) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    z7 = false;
                }
            }
        }
        if (z7) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0606a0 interfaceC0606a0) {
        this.f8334y = interfaceC0606a0;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8333x = new Rect();
    }
}

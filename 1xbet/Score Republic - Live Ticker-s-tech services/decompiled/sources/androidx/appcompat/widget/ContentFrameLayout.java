package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p000.C0384k5;
import p000.C0455m2;
import p000.C0603q2;
import p000.InterfaceC0327im;
import p000.LayoutInflaterFactory2C0828w5;
import p000.ji1;
import p000.on0;
import p000.xd1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public TypedValue f405j;

    /* JADX INFO: renamed from: k */
    public TypedValue f406k;

    /* JADX INFO: renamed from: l */
    public TypedValue f407l;

    /* JADX INFO: renamed from: m */
    public TypedValue f408m;

    /* JADX INFO: renamed from: n */
    public TypedValue f409n;

    /* JADX INFO: renamed from: o */
    public TypedValue f410o;

    /* JADX INFO: renamed from: p */
    public final Rect f411p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0327im f412q;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f411p = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f409n == null) {
            this.f409n = new TypedValue();
        }
        return this.f409n;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f410o == null) {
            this.f410o = new TypedValue();
        }
        return this.f410o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f407l == null) {
            this.f407l = new TypedValue();
        }
        return this.f407l;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f408m == null) {
            this.f408m = new TypedValue();
        }
        return this.f408m;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f405j == null) {
            this.f405j = new TypedValue();
        }
        return this.f405j;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f406k == null) {
            this.f406k = new TypedValue();
        }
        return this.f406k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0327im interfaceC0327im = this.f412q;
        if (interfaceC0327im != null) {
            interfaceC0327im.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0603q2 c0603q2;
        super.onDetachedFromWindow();
        InterfaceC0327im interfaceC0327im = this.f412q;
        if (interfaceC0327im != null) {
            LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = ((C0384k5) interfaceC0327im).f4285j;
            ActionBarOverlayLayout actionBarOverlayLayout = layoutInflaterFactory2C0828w5.f8433z;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.m355k();
                ActionMenuView actionMenuView = ((xd1) actionBarOverlayLayout.f377n).f8896a.f442j;
                if (actionMenuView != null && (c0603q2 = actionMenuView.f392C) != null) {
                    c0603q2.m4026c();
                    C0455m2 c0455m2 = c0603q2.f6320C;
                    if (c0455m2 != null && c0455m2.m5814b()) {
                        c0455m2.f9404i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0828w5.f8389E != null) {
                layoutInflaterFactory2C0828w5.f8428u.getDecorView().removeCallbacks(layoutInflaterFactory2C0828w5.f8390F);
                if (layoutInflaterFactory2C0828w5.f8389E.isShowing()) {
                    try {
                        layoutInflaterFactory2C0828w5.f8389E.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0828w5.f8389E = null;
            }
            ji1 ji1Var = layoutInflaterFactory2C0828w5.f8391G;
            if (ji1Var != null) {
                ji1Var.m2913b();
            }
            on0 on0Var = layoutInflaterFactory2C0828w5.m5255y(0).f8079h;
            if (on0Var != null) {
                on0Var.m3707c(true);
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
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f411p;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f408m : this.f407l;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f409n : this.f410o;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f406k : this.f405j;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0327im interfaceC0327im) {
        this.f412q = interfaceC0327im;
    }
}

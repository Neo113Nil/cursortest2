package a1;

import A0.AbstractC0012b;
import A0.C0009a;
import P.AbstractC0329z;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import n1.AbstractC2181w;
import n1.C;
import n1.InterfaceC2168i;
import n1.k0;

/* loaded from: classes.dex */
public final class s extends AbstractC0012b implements InterfaceC2168i {

    /* renamed from: s, reason: collision with root package name */
    public final Window f6423s;

    /* renamed from: t, reason: collision with root package name */
    public final C0305m0 f6424t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6425u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6426v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6427w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6428x;

    public s(Context context, Window window) {
        super(context);
        this.f6423s = window;
        this.f6424t = AbstractC0329z.t(q.f6421a);
        Field field = C.f18360a;
        AbstractC2181w.c(this, this);
        C.f(this, new Z0.a(this, 1));
    }

    @Override // A0.AbstractC0012b
    public final void a(int i, C0315s c0315s) {
        c0315s.Z(1735448596);
        int i5 = (c0315s.h(this) ? 4 : 2) | i;
        if (c0315s.P(i5 & 1, (i5 & 3) != 2)) {
            ((i4.e) this.f6424t.getValue()).invoke(c0315s, 0);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, 7, this);
        }
    }

    @Override // A0.AbstractC0012b
    public final void d(boolean z3, int i, int i5, int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i8 = i6 - i;
        int i9 = i7 - i5;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i8 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i9 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // n1.InterfaceC2168i
    public final k0 e(View view, k0 k0Var) {
        if (!this.f6426v) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return k0Var.f18442a.r(max, max2, max3, max4);
            }
        }
        return k0Var;
    }

    @Override // A0.AbstractC0012b
    public final void f(int i, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i, i5);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        Window window = this.f6423s;
        int i6 = (mode != Integer.MIN_VALUE || this.f6425u || this.f6426v || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i7 = size - paddingRight;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = i6 - paddingBottom;
        int i9 = i8 >= 0 ? i8 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        childAt.measure(i, i5);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f6426v || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f6425u) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // A0.AbstractC0012b
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6428x;
    }
}

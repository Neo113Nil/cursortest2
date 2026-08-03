package P;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public I0.b f1302a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f1303b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f1304c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.e f1305d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1306e;

    /* renamed from: f, reason: collision with root package name */
    public int f1307f;

    /* renamed from: g, reason: collision with root package name */
    public int f1308g;

    public v() {
        P.u uVar = new P.u(this, 0);
        P.u uVar2 = new P.u(this, 1);
        this.f1304c = new x0.e(uVar);
        this.f1305d = new x0.e(uVar2);
        this.f1306e = false;
    }

    public static int e(int i2, int i3, int i4) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i3, i4) : size : java.lang.Math.min(size, java.lang.Math.max(i3, i4));
    }

    public static void v(android.view.View view) {
        ((P.w) view.getLayoutParams()).getClass();
        throw null;
    }

    public static P.C0040m w(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        P.C0040m c0040m = new P.C0040m(1);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O.a.f1163a, i2, i3);
        c0040m.f1288b = obtainStyledAttributes.getInt(0, 1);
        c0040m.f1289c = obtainStyledAttributes.getInt(9, 1);
        c0040m.f1290d = obtainStyledAttributes.getBoolean(8, false);
        c0040m.f1291e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0040m;
    }

    public void A(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        P.B b2 = recyclerView.f2464a;
        P.E e2 = recyclerView.f2467b0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1303b.canScrollVertically(-1) && !this.f1303b.canScrollHorizontally(-1) && !this.f1303b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f1303b.getClass();
    }

    public abstract void B(android.os.Parcelable parcelable);

    public abstract android.os.Parcelable C();

    public final void E() {
        int p2 = p() - 1;
        if (p2 < 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.j(o(p2));
        throw null;
    }

    public final void F(P.B b2) {
        int size = b2.f1186a.size();
        int i2 = size - 1;
        java.util.ArrayList arrayList = b2.f1186a;
        if (i2 >= 0) {
            B1.a.m(arrayList.get(i2));
            throw null;
        }
        arrayList.clear();
        if (size > 0) {
            this.f1303b.invalidate();
        }
    }

    public final boolean G(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z2, boolean z3) {
        int s2 = s();
        int u2 = u();
        int t = this.f1307f - t();
        int r2 = this.f1308g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s2;
        int min = java.lang.Math.min(0, i2);
        int i3 = top - u2;
        int min2 = java.lang.Math.min(0, i3);
        int i4 = width - t;
        int max = java.lang.Math.max(0, i4);
        int max2 = java.lang.Math.max(0, height - r2);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f1303b;
        java.lang.reflect.Field field = y.x.f8478a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = java.lang.Math.min(i2, max);
            }
            max = min;
        } else if (max == 0) {
            max = java.lang.Math.max(min, i4);
        }
        if (min2 == 0) {
            min2 = java.lang.Math.min(i3, max2);
        }
        int[] iArr = {max, min2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z3) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s3 = s();
            int u3 = u();
            int t2 = this.f1307f - t();
            int r3 = this.f1308g - r();
            android.graphics.Rect rect2 = this.f1303b.f2474g;
            int[] iArr2 = androidx.recyclerview.widget.RecyclerView.f2442l0;
            P.w wVar = (P.w) focusedChild.getLayoutParams();
            android.graphics.Rect rect3 = wVar.f1309a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((android.view.ViewGroup.MarginLayoutParams) wVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((android.view.ViewGroup.MarginLayoutParams) wVar).topMargin, focusedChild.getRight() + rect3.right + ((android.view.ViewGroup.MarginLayoutParams) wVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((android.view.ViewGroup.MarginLayoutParams) wVar).bottomMargin);
            if (rect2.left - i5 >= t2 || rect2.right - i5 <= s3 || rect2.top - i6 >= r3 || rect2.bottom - i6 <= u3) {
                return false;
            }
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        if (z2) {
            recyclerView.scrollBy(i5, i6);
            return true;
        }
        recyclerView.r(i5, i6);
        return true;
    }

    public final void H() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1303b = null;
            this.f1302a = null;
            this.f1307f = 0;
            this.f1308g = 0;
            return;
        }
        this.f1303b = recyclerView;
        this.f1302a = recyclerView.f2470d;
        this.f1307f = recyclerView.getWidth();
        this.f1308g = recyclerView.getHeight();
    }

    public abstract void a(java.lang.String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(P.w wVar) {
        return wVar != null;
    }

    public abstract int f(P.E e2);

    public abstract void g(P.E e2);

    public abstract int h(P.E e2);

    public abstract int i(P.E e2);

    public abstract void j(P.E e2);

    public abstract int k(P.E e2);

    public abstract P.w l();

    public P.w m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new P.w(context, attributeSet);
    }

    public P.w n(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof P.w ? new P.w((P.w) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new P.w((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new P.w(layoutParams);
    }

    public final android.view.View o(int i2) {
        I0.b bVar = this.f1302a;
        if (bVar == null) {
            return null;
        }
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((androidx.recyclerview.widget.RecyclerView) ((C.j) bVar.f657b).f88b).getChildCount();
            int i4 = i2;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                O1.a aVar = (O1.a) bVar.f658c;
                int a2 = i2 - (i4 - aVar.a(i4));
                if (a2 == 0) {
                    i3 = i4;
                    while (aVar.b(i3)) {
                        i3++;
                    }
                } else {
                    i4 += a2;
                }
            }
        }
        return ((androidx.recyclerview.widget.RecyclerView) ((C.j) bVar.f657b).f88b).getChildAt(i3);
    }

    public final int p() {
        I0.b bVar = this.f1302a;
        if (bVar != null) {
            return ((androidx.recyclerview.widget.RecyclerView) ((C.j) bVar.f657b).f88b).getChildCount() - ((java.util.ArrayList) bVar.f659d).size();
        }
        return 0;
    }

    public int q(P.B b2, P.E e2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(P.B b2, P.E e2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1303b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(androidx.recyclerview.widget.RecyclerView recyclerView);

    public void D(int i2) {
    }
}

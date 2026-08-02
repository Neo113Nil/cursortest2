package C0;

import A1.x0;
import P.U;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import e3.C1023h;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.V0;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public android.support.v4.media.session.t f1314a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1315b;

    /* renamed from: c, reason: collision with root package name */
    public final V0 f1316c;

    /* renamed from: d, reason: collision with root package name */
    public final V0 f1317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1318e;

    /* renamed from: f, reason: collision with root package name */
    public int f1319f;

    /* renamed from: g, reason: collision with root package name */
    public int f1320g;

    public u() {
        x0 x0Var = new x0(this, 1);
        C1023h c1023h = new C1023h(this);
        this.f1316c = new V0((L) x0Var);
        this.f1317d = new V0((L) c1023h);
        this.f1318e = false;
    }

    public static int e(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
    }

    public static void v(View view) {
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static n w(Context context, AttributeSet attributeSet, int i7, int i8) {
        n nVar = new n(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B0.a.f967a, i7, i8);
        nVar.f1304b = obtainStyledAttributes.getInt(0, 1);
        nVar.f1305c = obtainStyledAttributes.getInt(9, 1);
        nVar.f1306d = obtainStyledAttributes.getBoolean(8, false);
        nVar.f1307e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return nVar;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1315b;
        A a2 = recyclerView.f9710a;
        C c3 = recyclerView.f9729o0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1315b.canScrollVertically(-1) && !this.f1315b.canScrollHorizontally(-1) && !this.f1315b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        this.f1315b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p5 = p() - 1;
        if (p5 < 0) {
            return;
        }
        RecyclerView.j(o(p5));
        throw null;
    }

    public final void F(A a2) {
        int size = ((ArrayList) a2.f1213c).size();
        int i7 = size - 1;
        ArrayList arrayList = (ArrayList) a2.f1213c;
        if (i7 >= 0) {
            throw e1.k.c(arrayList, i7);
        }
        arrayList.clear();
        if (size > 0) {
            this.f1315b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z7) {
        int s7 = s();
        int u4 = u();
        int t7 = this.f1319f - t();
        int r7 = this.f1320g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i7 = left - s7;
        int min = Math.min(0, i7);
        int i8 = top - u4;
        int min2 = Math.min(0, i8);
        int i9 = width - t7;
        int max = Math.max(0, i9);
        int max2 = Math.max(0, height - r7);
        RecyclerView recyclerView2 = this.f1315b;
        WeakHashMap weakHashMap = U.f5037a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i7, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i9);
        }
        if (min2 == 0) {
            min2 = Math.min(i8, max2);
        }
        int[] iArr = {max, min2};
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (z7) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s8 = s();
            int u7 = u();
            int t8 = this.f1319f - t();
            int r8 = this.f1320g - r();
            Rect rect2 = this.f1315b.f9738x;
            int[] iArr2 = RecyclerView.f9685y0;
            v vVar = (v) focusedChild.getLayoutParams();
            Rect rect3 = vVar.f1321a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) vVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin);
            if (rect2.left - i10 >= t8 || rect2.right - i10 <= s8 || rect2.top - i11 >= r8 || rect2.bottom - i11 <= u7) {
                return false;
            }
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (z4) {
            recyclerView.scrollBy(i10, i11);
            return true;
        }
        recyclerView.r(i10, i11);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1315b = null;
            this.f1314a = null;
            this.f1319f = 0;
            this.f1320g = 0;
            return;
        }
        this.f1315b = recyclerView;
        this.f1314a = recyclerView.f9715d;
        this.f1319f = recyclerView.getWidth();
        this.f1320g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(v vVar) {
        return vVar != null;
    }

    public abstract int f(C c3);

    public abstract void g(C c3);

    public abstract int h(C c3);

    public abstract int i(C c3);

    public abstract void j(C c3);

    public abstract int k(C c3);

    public abstract v l();

    public v m(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    public v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v ? new v((v) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new v((ViewGroup.MarginLayoutParams) layoutParams) : new v(layoutParams);
    }

    public final View o(int i7) {
        android.support.v4.media.session.t tVar = this.f1314a;
        if (tVar == null) {
            return null;
        }
        int i8 = -1;
        if (i7 >= 0) {
            int childCount = ((RecyclerView) ((R4.c) tVar.f8076b).f6064b).getChildCount();
            int i9 = i7;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                C0083b c0083b = (C0083b) tVar.f8077c;
                int A7 = i7 - (i9 - c0083b.A(i9));
                if (A7 == 0) {
                    i8 = i9;
                    while (c0083b.C(i8)) {
                        i8++;
                    }
                } else {
                    i9 += A7;
                }
            }
        }
        return ((RecyclerView) ((R4.c) tVar.f8076b).f6064b).getChildAt(i8);
    }

    public final int p() {
        android.support.v4.media.session.t tVar = this.f1314a;
        if (tVar != null) {
            return ((RecyclerView) ((R4.c) tVar.f8076b).f6064b).getChildCount() - ((ArrayList) tVar.f8078d).size();
        }
        return 0;
    }

    public int q(A a2, C c3) {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(A a2, C c3) {
        RecyclerView recyclerView = this.f1315b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i7) {
    }
}

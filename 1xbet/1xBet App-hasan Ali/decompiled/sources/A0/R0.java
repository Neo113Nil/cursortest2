package A0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g0.AbstractC1961f;
import g0.C1959d;
import h0.C1989c;
import java.util.ArrayList;
import java.util.Collections;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class R0 {
    public static final C0052p0 f = new C0052p0(1);

    /* renamed from: a, reason: collision with root package name */
    public final Rect f381a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f382b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f383c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final Q0 f384d = new Q0(new P0(this));

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f385e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i5;
        Rect rect2 = this.f381a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    d(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return c(i, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(AbstractC2107A.q("Unknown direction: ", i));
        }
        Q0 q02 = this.f384d;
        try {
            q02.a(arrayList, viewGroup);
            Collections.sort(arrayList, q02);
            q02.f378n.a();
            q02.f377m.b();
            q02.f379o.a();
            q02.f376l.a();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 17 || i == 33 || i == 66 || i == 130) {
                        view2 = c(i, this.f381a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i5 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i5);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            return view2 == null ? (View) arrayList.get(size - 1) : view2;
        } catch (Throwable th) {
            q02.f378n.a();
            q02.f377m.b();
            q02.f379o.a();
            q02.f376l.a();
            throw th;
        }
    }

    public final View b(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View k5 = Z.k(i, view, viewGroup2);
        boolean z3 = true;
        View view3 = k5;
        while (k5 != null) {
            if (k5.isFocusable() && k5.getVisibility() == 0 && (!k5.isInTouchMode() || k5.isFocusableInTouchMode())) {
                view2 = k5;
                break;
            }
            k5 = Z.k(i, k5, viewGroup2);
            boolean z5 = !z3;
            if (!z3) {
                view3 = view3 != null ? Z.k(i, view3, viewGroup2) : null;
                if (view3 == k5) {
                    break;
                }
            }
            z3 = z5;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.f385e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                Z.m(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = a(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f382b;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = (View) arrayList.get(i5);
            if (!kotlin.jvm.internal.l.a(view3, view) && !kotlin.jvm.internal.l.a(view3, viewGroup)) {
                Rect rect3 = this.f383c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                C1989c w5 = i0.F.w(rect3);
                C1989c w6 = i0.F.w(rect2);
                C1989c w7 = i0.F.w(rect);
                C1959d D5 = AbstractC1961f.D(i);
                if (AbstractC1961f.o(w5, w6, w7, D5 != null ? D5.f17021a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}

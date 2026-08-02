package A0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import r.C2315A;
import r.C2321G;
import r.C2322H;

/* loaded from: classes.dex */
public final class Q0 implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final P0 f375k;

    /* renamed from: l, reason: collision with root package name */
    public final C2321G f376l;

    /* renamed from: m, reason: collision with root package name */
    public final C2322H f377m;

    /* renamed from: n, reason: collision with root package name */
    public final C2321G f378n;

    /* renamed from: o, reason: collision with root package name */
    public final C2315A f379o;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup f380p;

    public Q0(P0 p02) {
        this.f375k = p02;
        long[] jArr = r.O.f18957a;
        this.f376l = new C2321G();
        int i = r.P.f18958a;
        this.f377m = new C2322H();
        this.f378n = new C2321G();
        C2315A c2315a = r.K.f18952a;
        this.f379o = new C2315A();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        C2315A c2315a;
        this.f380p = viewGroup;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            c2315a = this.f379o;
            if (i >= size) {
                break;
            }
            c2315a.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        C2322H c2322h = this.f377m;
        C2321G c2321g = this.f376l;
        if (size2 >= 0) {
            while (true) {
                int i5 = size2 - 1;
                View view = (View) arrayList.get(size2);
                P0 p02 = this.f375k;
                int nextFocusForwardId = view.getNextFocusForwardId();
                ((R0) p02.f373a).getClass();
                View k5 = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : Z.k(2, view, viewGroup);
                if (k5 != null && c2315a.d(k5) >= 0) {
                    c2321g.m(view, k5);
                    c2322h.a(k5);
                }
                if (i5 < 0) {
                    break;
                } else {
                    size2 = i5;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i6 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) c2321g.g(view2)) != null && !c2322h.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    C2321G c2321g2 = this.f378n;
                    View view4 = (View) c2321g2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    c2321g2.m(view2, view3);
                    view2 = (View) c2321g.g(view2);
                }
            }
            if (i6 < 0) {
                return;
            } else {
                size3 = i6;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        C2321G c2321g = this.f378n;
        View view3 = (View) c2321g.g(view);
        View view4 = (View) c2321g.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f376l.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        C2315A c2315a = this.f379o;
        return c2315a.e(view) < c2315a.e(view2) ? -1 : 1;
    }
}

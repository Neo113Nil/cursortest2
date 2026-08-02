package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes8.dex */
public abstract class X {
    protected static void d(View view, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11) == view) {
                return;
            }
        }
        if (androidx.core.view.Y.o(view) != null) {
            list.add(view);
        }
        for (int i12 = size; i12 < list.size(); i12++) {
            View view2 = (View) list.get(i12);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            if (list.get(i14) == childAt) {
                                break;
                            } else {
                                i14++;
                            }
                        } else if (androidx.core.view.Y.o(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    protected static void g(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    protected static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(@NonNull View view, @NonNull Object obj);

    public abstract void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public abstract void c(@NonNull ViewGroup viewGroup, Object obj);

    public abstract boolean e(@NonNull Object obj);

    public abstract Object f(Object obj);

    public void i() {
        if (G.D0(4)) {
            Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2);

    public abstract void l(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void m(@NonNull Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void n(View view, @NonNull Object obj);

    public abstract void o(@NonNull Object obj, @NonNull Rect rect);

    public void p(@NonNull Object obj, @NonNull androidx.core.os.e eVar, @NonNull Runnable runnable) {
        runnable.run();
    }

    public abstract void q(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object s(Object obj);
}

package D;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class E {
    public static boolean a(ViewParent viewParent, View view, float f, float f3, boolean z3) {
        return viewParent.onNestedFling(view, f, f3, z3);
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f3) {
        return viewParent.onNestedPreFling(view, f, f3);
    }

    public static void c(ViewParent viewParent, View view, int i3, int i4, int[] iArr) {
        viewParent.onNestedPreScroll(view, i3, i4, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i3, int i4, int i5, int i6) {
        viewParent.onNestedScroll(view, i3, i4, i5, i6);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i3) {
        viewParent.onNestedScrollAccepted(view, view2, i3);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i3) {
        return viewParent.onStartNestedScroll(view, view2, i3);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}

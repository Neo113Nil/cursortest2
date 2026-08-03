package y;

/* loaded from: classes.dex */
public abstract class C {
    public static boolean a(android.view.ViewParent viewParent, android.view.View view, float f2, float f3, boolean z2) {
        return viewParent.onNestedFling(view, f2, f3, z2);
    }

    public static boolean b(android.view.ViewParent viewParent, android.view.View view, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    public static void c(android.view.ViewParent viewParent, android.view.View view, int i2, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    public static void d(android.view.ViewParent viewParent, android.view.View view, int i2, int i3, int i4, int i5) {
        viewParent.onNestedScroll(view, i2, i3, i4, i5);
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    public static boolean f(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    public static void g(android.view.ViewParent viewParent, android.view.View view) {
        viewParent.onStopNestedScroll(view);
    }
}

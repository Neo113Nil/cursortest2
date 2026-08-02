package c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;
import n1.l0;
import n1.m0;
import n1.n0;
import n1.o0;
import q1.AbstractC2297a;

/* loaded from: classes.dex */
public final class t extends s {
    @Override // c.r, c.p, c.u
    public void b(C0521H c0521h, C0521H c0521h2, Window window, View view, boolean z3, boolean z5) {
        kotlin.jvm.internal.l.f("statusBarStyle", c0521h);
        kotlin.jvm.internal.l.f("navigationBarStyle", c0521h2);
        kotlin.jvm.internal.l.f("window", window);
        kotlin.jvm.internal.l.f("view", view);
        G4.d.K(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i5 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof AbstractC2297a)) {
                        for (Object obj : (Iterable) tag) {
                            if (obj instanceof AbstractC2297a) {
                            }
                        }
                    }
                }
                i = i5;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i6 = Build.VERSION.SDK_INT;
        N4.b o0Var = i6 >= 35 ? new o0(window) : i6 >= 30 ? new n0(window) : i6 >= 26 ? new m0(window) : new l0(window);
        o0Var.P(!z3);
        o0Var.O(true ^ z5);
    }
}

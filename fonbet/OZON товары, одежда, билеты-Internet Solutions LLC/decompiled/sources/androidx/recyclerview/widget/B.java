package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
final class B {
    static int a(RecyclerView.A a11, w wVar, View view, View view2, RecyclerView.o oVar, boolean z11) {
        if (oVar.getChildCount() == 0 || a11.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1;
        }
        return Math.min(wVar.o(), wVar.d(view2) - wVar.g(view));
    }

    static int b(RecyclerView.A a11, w wVar, View view, View view2, RecyclerView.o oVar, boolean z11, boolean z12) {
        if (oVar.getChildCount() == 0 || a11.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z12 ? Math.max(0, (a11.b() - Math.max(oVar.getPosition(view), oVar.getPosition(view2))) - 1) : Math.max(0, Math.min(oVar.getPosition(view), oVar.getPosition(view2)));
        if (z11) {
            return Math.round((max * (Math.abs(wVar.d(view2) - wVar.g(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1))) + (wVar.n() - wVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.A a11, w wVar, View view, View view2, RecyclerView.o oVar, boolean z11) {
        if (oVar.getChildCount() == 0 || a11.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return a11.b();
        }
        return (int) (((wVar.d(view2) - wVar.g(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1)) * a11.b());
    }
}

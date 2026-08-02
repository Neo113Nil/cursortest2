package d;

import A0.H0;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.L;
import c.AbstractActivityC0531j;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1904d {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f16811a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(AbstractActivityC0531j abstractActivityC0531j, X.d dVar) {
        View childAt = ((ViewGroup) abstractActivityC0531j.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        H0 h02 = childAt instanceof H0 ? (H0) childAt : null;
        if (h02 != null) {
            h02.setParentCompositionContext(null);
            h02.setContent(dVar);
            return;
        }
        H0 h03 = new H0(abstractActivityC0531j);
        h03.setParentCompositionContext(null);
        h03.setContent(dVar);
        View decorView = abstractActivityC0531j.getWindow().getDecorView();
        if (L.f(decorView) == null) {
            L.l(decorView, abstractActivityC0531j);
        }
        if (L.g(decorView) == null) {
            decorView.setTag(game.betting133.sports1xbet.R.id.view_tree_view_model_store_owner, abstractActivityC0531j);
        }
        if (N4.b.x(decorView) == null) {
            decorView.setTag(game.betting133.sports1xbet.R.id.view_tree_saved_state_registry_owner, abstractActivityC0531j);
        }
        abstractActivityC0531j.setContentView(h03, f16811a);
    }
}

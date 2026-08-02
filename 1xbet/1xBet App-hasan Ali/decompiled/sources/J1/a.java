package J1;

import B1.h;
import G4.d;
import I1.c;
import P.C0315s;
import P.D;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import game.betting133.sports1xbet.R;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f2692a = new D(new h(2));

    public static c a(C0315s c0315s) {
        c cVar;
        c cVar2 = (c) c0315s.j(f2692a);
        if (cVar2 != null) {
            c0315s.X(950834231);
            c0315s.q(false);
            return cVar2;
        }
        c0315s.X(950836184);
        View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
        l.f("<this>", view);
        while (true) {
            cVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            c cVar3 = tag instanceof c ? (c) tag : null;
            if (cVar3 != null) {
                cVar = cVar3;
                break;
            }
            Object v4 = d.v(view);
            view = v4 instanceof View ? (View) v4 : null;
        }
        c0315s.q(false);
        return cVar;
    }
}

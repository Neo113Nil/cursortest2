package sg.bigo.ads.m;

import android.transition.Transition;
import android.widget.Button;
import java.util.Iterator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5491l;

/* loaded from: classes3.dex */
public final class b0 extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f13075a;

    public b0(c0 c0Var) {
        this.f13075a = c0Var;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        d0 d0Var = this.f13075a.f;
        d0Var.x.set(false);
        ViewFlow viewFlow = d0Var.q;
        sg.bigo.ads.L0.A onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if ((onItemChangeListener == null || !(onItemChangeListener instanceof C5491l)) ? false : ((C5491l) onItemChangeListener).e) {
            C5491l.a(d0Var.q, new C5334m(d0Var));
        } else {
            Iterator it = d0Var.y.iterator();
            while (it.hasNext()) {
                d0Var.q.post((Runnable) it.next());
            }
            d0Var.y.clear();
        }
        c0 c0Var = this.f13075a;
        boolean[] zArr = c0Var.f13077a;
        zArr[0] = true;
        AbstractC5490k.a(c0Var.f.I, true, zArr[1], ((Boolean) c0Var.b.second).booleanValue());
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.f13075a.f.x.set(true);
        sg.bigo.ads.E0.p.a(this.f13075a.f.A, -1, new a0(transition));
        c0 c0Var = this.f13075a;
        d0 d0Var = c0Var.f;
        RoundedFrameLayout roundedFrameLayout = d0Var.I;
        Button button = d0Var.J;
        int intValue = ((Integer) c0Var.b.first).intValue();
        c0 c0Var2 = this.f13075a;
        AbstractC5490k.a(roundedFrameLayout, button, intValue, c0Var2.f13077a, ((Boolean) c0Var2.b.second).booleanValue(), transition.getDuration());
    }
}

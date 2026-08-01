package sg.bigo.ads.m;

import android.transition.Transition;
import android.widget.Button;
import java.util.Iterator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5491l;

/* renamed from: sg.bigo.ads.m.X, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5319X extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5320Y f13070a;

    public C5319X(RunnableC5320Y runnableC5320Y) {
        this.f13070a = runnableC5320Y;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        C5321Z c5321z = this.f13070a.g;
        c5321z.x.set(false);
        ViewFlow viewFlow = c5321z.q;
        sg.bigo.ads.L0.A onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if ((onItemChangeListener == null || !(onItemChangeListener instanceof C5491l)) ? false : ((C5491l) onItemChangeListener).e) {
            C5491l.a(c5321z.q, new C5334m(c5321z));
        } else {
            Iterator it = c5321z.y.iterator();
            while (it.hasNext()) {
                c5321z.q.post((Runnable) it.next());
            }
            c5321z.y.clear();
        }
        RunnableC5320Y runnableC5320Y = this.f13070a;
        boolean[] zArr = runnableC5320Y.f13071a;
        zArr[0] = true;
        AbstractC5490k.a(runnableC5320Y.g.G, true, zArr[1], ((Boolean) runnableC5320Y.b.second).booleanValue());
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.f13070a.g.x.set(true);
        sg.bigo.ads.E0.p.a(this.f13070a.g.A, -1, new C5318W(transition));
        RunnableC5320Y runnableC5320Y = this.f13070a;
        C5321Z c5321z = runnableC5320Y.g;
        RoundedFrameLayout roundedFrameLayout = c5321z.G;
        Button button = c5321z.H;
        int intValue = ((Integer) runnableC5320Y.b.first).intValue();
        RunnableC5320Y runnableC5320Y2 = this.f13070a;
        AbstractC5490k.a(roundedFrameLayout, button, intValue, runnableC5320Y2.f13071a, ((Boolean) runnableC5320Y2.b.second).booleanValue(), transition.getDuration());
    }
}

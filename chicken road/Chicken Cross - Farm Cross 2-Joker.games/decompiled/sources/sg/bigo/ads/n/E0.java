package sg.bigo.ads.n;

import android.transition.Transition;
import java.util.Iterator;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5491l;

/* loaded from: classes3.dex */
public final class E0 extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5389m f13131a;
    public final /* synthetic */ F0 b;

    public E0(F0 f0, C5389m c5389m) {
        this.b = f0;
        this.f13131a = c5389m;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        G0 g0 = this.b.f;
        g0.N.set(false);
        ViewFlow viewFlow = g0.C;
        sg.bigo.ads.L0.A onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if ((onItemChangeListener == null || !(onItemChangeListener instanceof C5491l)) ? false : ((C5491l) onItemChangeListener).e) {
            C5491l.a(g0.C, new C5382i0(g0));
        } else {
            Iterator it = g0.O.iterator();
            while (it.hasNext()) {
                g0.C.post((Runnable) it.next());
            }
            g0.O.clear();
        }
        F0 f0 = this.b;
        boolean[] zArr = f0.f13133a;
        zArr[0] = true;
        AbstractC5490k.a(f0.f.Y, true, zArr[1], f0.b);
        if (this.f13131a.b) {
            G0 g02 = this.b.f;
            g02.a(g02.Z, new sg.bigo.ads.E0.k());
        }
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.f.N.set(true);
        sg.bigo.ads.E0.p.a(this.b.f.Q, -1, new D0(transition));
        F0 f0 = this.b;
        G0 g0 = f0.f;
        AbstractC5490k.a(g0.Y, g0.Z, this.f13131a.f13179a, f0.f13133a, f0.b, transition.getDuration());
    }
}

package sg.bigo.ads.n;

import android.transition.Transition;
import java.util.Iterator;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5491l;

/* loaded from: classes3.dex */
public final class A0 extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5389m f13127a;
    public final /* synthetic */ B0 b;

    public A0(B0 b0, C5389m c5389m) {
        this.b = b0;
        this.f13127a = c5389m;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        C0 c0 = this.b.g;
        c0.N.set(false);
        ViewFlow viewFlow = c0.C;
        sg.bigo.ads.L0.A onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if ((onItemChangeListener == null || !(onItemChangeListener instanceof C5491l)) ? false : ((C5491l) onItemChangeListener).e) {
            C5491l.a(c0.C, new C5382i0(c0));
        } else {
            Iterator it = c0.O.iterator();
            while (it.hasNext()) {
                c0.C.post((Runnable) it.next());
            }
            c0.O.clear();
        }
        B0 b0 = this.b;
        boolean[] zArr = b0.f13128a;
        zArr[0] = true;
        AbstractC5490k.a(b0.g.W, true, zArr[1], b0.b);
        if (this.f13127a.b) {
            C0 c02 = this.b.g;
            c02.a(c02.X, new sg.bigo.ads.E0.k());
        }
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.g.N.set(true);
        sg.bigo.ads.E0.p.a(this.b.g.Q, -1, new C5415z0(transition));
        B0 b0 = this.b;
        C0 c0 = b0.g;
        AbstractC5490k.a(c0.W, c0.X, this.f13127a.f13179a, b0.f13128a, b0.b, transition.getDuration());
    }
}

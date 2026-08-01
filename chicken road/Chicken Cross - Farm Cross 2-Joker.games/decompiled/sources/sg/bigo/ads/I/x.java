package sg.bigo.ads.I;

import java.util.HashMap;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.C5185l1;

/* loaded from: classes3.dex */
public final class x extends C5185l1 implements RewardVideoAd {
    public RewardAdInteractionListener f0;

    public x(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.h.C5185l1, sg.bigo.ads.h.AbstractC5163f0
    public final Class B() {
        if (F()) {
            return p.class;
        }
        sg.bigo.ads.C.l lVar = this.W;
        boolean z = lVar instanceof sg.bigo.ads.E.d;
        return z ? (z && ((sg.bigo.ads.E.d) lVar).y0 == 3) ? sg.bigo.ads.J.b.class : sg.bigo.ads.K.c.class : A() ? ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.W.e())).o() ? t.class : w.class : s.class;
    }

    @Override // sg.bigo.ads.h.C5185l1
    public final boolean F() {
        return (D() instanceof sg.bigo.ads.D.m) || (D() instanceof sg.bigo.ads.D.l);
    }

    public final void G() {
        HashMap a2 = sg.bigo.ads.s1.b.a(this.k.f12482a, (sg.bigo.ads.Q.b) null, false);
        a2.put("rew_rslt", "1");
        a2.put("out_ad", String.valueOf(this.f));
        sg.bigo.ads.s1.b.a(a2, (sg.bigo.ads.Q.b) this, false);
        sg.bigo.ads.s1.b.a("06002019", a2);
        RewardAdInteractionListener rewardAdInteractionListener = this.f0;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.h.C5185l1, sg.bigo.ads.h.AbstractC5163f0
    public final void a(sg.bigo.ads.Z0.g gVar) {
        super.a(gVar);
    }

    @Override // sg.bigo.ads.h.C5185l1, sg.bigo.ads.h.AbstractC5163f0, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.f0 = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        setAdInteractionListener((AdInteractionListener) rewardAdInteractionListener);
        this.f0 = rewardAdInteractionListener;
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final int z() {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.k.f12482a);
        sg.bigo.ads.P.r rVar = kVar.E0;
        long j = rVar != null ? rVar.c : 0L;
        if (j == 0) {
            j = kVar.i();
        }
        return (int) (j / 1000);
    }
}

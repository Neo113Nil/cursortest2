package sg.bigo.ads.I;

import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.h.C5190n0;

/* loaded from: classes3.dex */
public final class g extends C5190n0 implements RewardVideoAd {
    public RewardAdInteractionListener c0;

    public g(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.h.C5190n0, sg.bigo.ads.h.AbstractC5163f0
    public final Class B() {
        return f.class;
    }

    @Override // sg.bigo.ads.h.C5190n0, sg.bigo.ads.h.AbstractC5163f0
    public final void a(sg.bigo.ads.Z0.g gVar) {
        super.a(gVar);
    }

    @Override // sg.bigo.ads.h.C5190n0, sg.bigo.ads.h.AbstractC5163f0, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.c0 = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        this.j = rewardAdInteractionListener;
        this.c0 = rewardAdInteractionListener;
    }
}

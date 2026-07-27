package sg.bigo.ads.n;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;
import sg.bigo.ads.h.AbstractC5140Q;

/* loaded from: classes3.dex */
public final class Y0 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ View i;
    public final /* synthetic */ ViewGroup j;
    public final /* synthetic */ Z0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Z0 z0, long j, View view, ViewGroup viewGroup) {
        super(j, 1000L);
        this.k = z0;
        this.i = view;
        this.j = viewGroup;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        this.i.setVisibility(0);
        AbstractC5140Q.a(this.i, 200L, new AnimationAnimationListenerC4952i());
        this.k.f(this.j);
    }
}

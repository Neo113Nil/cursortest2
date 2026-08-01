package sg.bigo.ads.x;

import android.animation.Animator;
import sg.bigo.ads.K0.AbstractC4951h;

/* loaded from: classes3.dex */
public final class j extends AbstractC4951h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.C.l f13375a;
    public final /* synthetic */ k b;

    public j(k kVar, sg.bigo.ads.C.l lVar) {
        this.b = kVar;
        this.f13375a = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a(this.f13375a);
        this.b.H0();
    }
}

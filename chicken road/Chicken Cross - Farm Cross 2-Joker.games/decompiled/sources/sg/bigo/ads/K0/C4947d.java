package sg.bigo.ads.K0;

import android.animation.Animator;

/* renamed from: sg.bigo.ads.K0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4947d extends AbstractC4951h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4951h f12356a;

    public C4947d(sg.bigo.ads.x.j jVar) {
        this.f12356a = jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC4951h abstractC4951h = this.f12356a;
        if (abstractC4951h != null) {
            abstractC4951h.onAnimationEnd(animator);
        }
    }
}

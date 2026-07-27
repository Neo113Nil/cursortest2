package sg.bigo.ads.F;

import android.animation.Animator;
import sg.bigo.ads.K0.AbstractC4953j;

/* loaded from: classes3.dex */
public final class e extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12286a;

    public e(f fVar) {
        this.f12286a = fVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.f12286a.f12287a;
        h.a(gVar.d, gVar.f12288a, gVar.e, gVar.c);
    }
}

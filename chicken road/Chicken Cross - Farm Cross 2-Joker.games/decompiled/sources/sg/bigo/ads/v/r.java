package sg.bigo.ads.v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.E0.k f13355a;

    public r(m mVar) {
        this.f13355a = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sg.bigo.ads.E0.k kVar = this.f13355a;
        if (kVar != null) {
            kVar.a(255);
        }
    }
}

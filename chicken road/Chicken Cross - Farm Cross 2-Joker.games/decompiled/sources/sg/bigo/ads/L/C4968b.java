package sg.bigo.ads.L;

import android.animation.Animator;
import sg.bigo.ads.K0.AbstractC4953j;

/* renamed from: sg.bigo.ads.L.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4968b extends AbstractC4953j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC4975i f12379a;

    public C4968b(RunnableC4975i runnableC4975i) {
        this.f12379a = runnableC4975i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RunnableC4975i runnableC4975i = this.f12379a;
        r.a(runnableC4975i.b, runnableC4975i.c);
    }
}

package sg.bigo.ads.h;

import android.transition.Transition;

/* renamed from: sg.bigo.ads.h.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5125B extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5126C f12802a;

    public C5125B(RunnableC5126C runnableC5126C) {
        this.f12802a = runnableC5126C;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        Runnable runnable = this.f12802a.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}

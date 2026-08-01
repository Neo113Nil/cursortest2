package sg.bigo.ads.h;

import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: sg.bigo.ads.h.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5126C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12806a = 300;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ View d;

    public RunnableC5126C(ViewGroup viewGroup, ViewGroup viewGroup2, Runnable runnable) {
        this.b = runnable;
        this.c = viewGroup;
        this.d = viewGroup2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Slide());
        transitionSet.setDuration(this.f12806a);
        transitionSet.addListener((Transition.TransitionListener) new C5125B(this));
        TransitionManager.beginDelayedTransition(this.c, transitionSet);
        this.d.setVisibility(0);
    }
}

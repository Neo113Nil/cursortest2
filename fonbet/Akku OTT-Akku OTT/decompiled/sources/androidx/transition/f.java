package androidx.transition;

import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Transition.TransitionNotification {
    @Override // androidx.transition.Transition.TransitionNotification
    public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
        transitionListener.onTransitionPause(transition);
    }
}

package androidx.transition;

import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Transition.TransitionNotification {
    @Override // androidx.transition.Transition.TransitionNotification
    public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
        transitionListener.onTransitionStart(transition, z);
    }
}

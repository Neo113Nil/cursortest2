package n1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f18371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18372b;

    public H(View view, O o5) {
        this.f18371a = o5;
        this.f18372b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        O o5 = this.f18371a;
        o5.f18387a.e(1.0f);
        J.f(this.f18372b, o5);
    }
}

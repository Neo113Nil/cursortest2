package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f6769a;
    public final /* synthetic */ kotlin.coroutines.SafeContinuation b;

    public g1(android.view.ViewPropertyAnimator viewPropertyAnimator, kotlin.coroutines.SafeContinuation safeContinuation) {
        this.f6769a = viewPropertyAnimator;
        this.b = safeContinuation;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "");
        super.onAnimationEnd(animator);
        this.f6769a.setListener(null);
        kotlin.coroutines.SafeContinuation safeContinuation = this.b;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
    }
}

package Qe0;

import android.animation.Animator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f23386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f23387b;

    public g(Function1 function1, M m11) {
        this.f23386a = function1;
        this.f23387b = m11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animator) {
        this.f23386a.invoke(this.f23387b.f71787a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animator) {
    }
}

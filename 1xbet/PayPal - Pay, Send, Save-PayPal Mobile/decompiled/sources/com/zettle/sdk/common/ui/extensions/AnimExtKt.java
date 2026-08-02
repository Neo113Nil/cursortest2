package com.zettle.sdk.common.ui.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Landroid/animation/Animator;", "", "cancelAnim", "(Landroid/animation/Animator;)V", "Landroid/view/View;", "view", "startAnim", "(Landroid/animation/Animator;Landroid/view/View;)V", "startImmediateAnim"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnimExtKt {
    public static final void cancelAnim(android.animation.Animator animator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "");
        if (animator.isRunning()) {
            animator.end();
        }
        animator.cancel();
    }

    public static final void startAnim(android.animation.Animator animator, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "");
        animator.setTarget(view);
        animator.start();
    }

    public static final void startImmediateAnim(android.animation.Animator animator, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "");
        animator.setTarget(view);
        animator.start();
        animator.end();
    }
}

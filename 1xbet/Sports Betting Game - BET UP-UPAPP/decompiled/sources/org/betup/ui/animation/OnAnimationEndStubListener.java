package org.betup.ui.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnAnimationEndStubListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lorg/betup/ui/animation/OnAnimationEndStubListener;", "Landroid/animation/Animator$AnimatorListener;", "onAnimationRepeat", "", "animator", "Landroid/animation/Animator;", "onAnimationCancel", "onAnimationStart", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OnAnimationEndStubListener extends Animator.AnimatorListener {

    /* compiled from: OnAnimationEndStubListener.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAnimationCancel(OnAnimationEndStubListener onAnimationEndStubListener, Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public static void onAnimationRepeat(OnAnimationEndStubListener onAnimationEndStubListener, Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public static void onAnimationStart(OnAnimationEndStubListener onAnimationEndStubListener, Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    void onAnimationCancel(Animator animator);

    @Override // android.animation.Animator.AnimatorListener
    void onAnimationRepeat(Animator animator);

    @Override // android.animation.Animator.AnimatorListener
    void onAnimationStart(Animator animator);
}

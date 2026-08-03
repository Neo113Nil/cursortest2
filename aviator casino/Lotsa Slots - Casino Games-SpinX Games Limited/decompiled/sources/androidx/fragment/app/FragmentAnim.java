package androidx.fragment.app;

/* loaded from: classes2.dex */
class FragmentAnim {
    private FragmentAnim() {
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context context, androidx.fragment.app.Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = getNextAnim(fragment, z, z2);
        fragment.setAnimations(0, 0, 0, 0);
        if (fragment.mContainer != null && fragment.mContainer.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(androidx.fragment.R.id.visible_removing_fragment_view_tag, null);
        }
        if (fragment.mContainer != null && fragment.mContainer.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (onCreateAnimation != null) {
            return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(onCreateAnimation);
        }
        android.animation.Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (onCreateAnimator != null) {
            return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = transitToAnimResourceId(context, nextTransition, z);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(loadAnimation);
                    }
                } catch (android.content.res.Resources.NotFoundException e) {
                    throw e;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            try {
                android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, nextAnim);
                if (loadAnimator != null) {
                    return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(loadAnimator);
                }
            } catch (java.lang.RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, nextAnim);
                if (loadAnimation2 != null) {
                    return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int getNextAnim(androidx.fragment.app.Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        }
        if (z) {
            return fragment.getEnterAnim();
        }
        return fragment.getExitAnim();
    }

    private static int transitToAnimResourceId(android.content.Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? androidx.fragment.R.animator.fragment_open_enter : androidx.fragment.R.animator.fragment_open_exit;
        }
        if (i == 8194) {
            return z ? androidx.fragment.R.animator.fragment_close_enter : androidx.fragment.R.animator.fragment_close_exit;
        }
        if (i == 8197) {
            if (z) {
                return toActivityTransitResId(context, android.R.attr.activityCloseEnterAnimation);
            }
            return toActivityTransitResId(context, android.R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? androidx.fragment.R.animator.fragment_fade_enter : androidx.fragment.R.animator.fragment_fade_exit;
        }
        if (i != 4100) {
            return -1;
        }
        if (z) {
            return toActivityTransitResId(context, android.R.attr.activityOpenEnterAnimation);
        }
        return toActivityTransitResId(context, android.R.attr.activityOpenExitAnimation);
    }

    private static int toActivityTransitResId(android.content.Context context, int i) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        AnimationOrAnimator(android.view.animation.Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new java.lang.IllegalStateException("Animation cannot be null");
            }
        }

        AnimationOrAnimator(android.animation.Animator animator) {
            this.animation = null;
            this.animator = animator;
            if (animator == null) {
                throw new java.lang.IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
            super(false);
            this.mAnimating = true;
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, android.view.animation.Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation)) {
                this.mEnded = true;
                androidx.core.view.OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, android.view.animation.Transformation transformation, float f) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.mEnded = true;
                androidx.core.view.OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mEnded && this.mAnimating) {
                this.mAnimating = false;
                this.mParent.post(this);
            } else {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            }
        }
    }
}

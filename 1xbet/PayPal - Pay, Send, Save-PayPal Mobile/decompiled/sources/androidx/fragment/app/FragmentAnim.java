package androidx.fragment.app;

/* loaded from: classes3.dex */
class FragmentAnim {
    private FragmentAnim() {
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator Camera2StreamConfigurationMap(android.content.Context context, androidx.fragment.app.Fragment fragment, boolean z, boolean z2) {
        int exitAnim;
        int i;
        int resourceId;
        int nextTransition = fragment.getNextTransition();
        if (z2) {
            if (z) {
                exitAnim = fragment.getPopEnterAnim();
            } else {
                exitAnim = fragment.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = fragment.getEnterAnim();
        } else {
            exitAnim = fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        if (fragment.mContainer != null && fragment.mContainer.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(androidx.fragment.R.id.visible_removing_fragment_view_tag, null);
        }
        if (fragment.mContainer != null && fragment.mContainer.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, exitAnim);
        if (onCreateAnimation != null) {
            return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(onCreateAnimation);
        }
        android.animation.Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, exitAnim);
        if (onCreateAnimator != null) {
            return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(onCreateAnimator);
        }
        if (exitAnim == 0 && nextTransition != 0) {
            if (nextTransition == 4097) {
                i = z ? androidx.fragment.R.animator.fragment_open_enter : androidx.fragment.R.animator.fragment_open_exit;
            } else if (nextTransition != 8194) {
                if (nextTransition != 8197) {
                    if (nextTransition == 4099) {
                        i = z ? androidx.fragment.R.animator.fragment_fade_enter : androidx.fragment.R.animator.fragment_fade_exit;
                    } else if (nextTransition != 4100) {
                        exitAnim = -1;
                    } else if (z) {
                        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{android.R.attr.activityOpenEnterAnimation});
                        resourceId = obtainStyledAttributes.getResourceId(0, -1);
                        obtainStyledAttributes.recycle();
                    } else {
                        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{android.R.attr.activityOpenExitAnimation});
                        resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                        obtainStyledAttributes2.recycle();
                    }
                } else if (z) {
                    android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{android.R.attr.activityCloseEnterAnimation});
                    resourceId = obtainStyledAttributes3.getResourceId(0, -1);
                    obtainStyledAttributes3.recycle();
                } else {
                    android.content.res.TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{android.R.attr.activityCloseExitAnimation});
                    resourceId = obtainStyledAttributes4.getResourceId(0, -1);
                    obtainStyledAttributes4.recycle();
                }
                exitAnim = resourceId;
            } else {
                i = z ? androidx.fragment.R.animator.fragment_close_enter : androidx.fragment.R.animator.fragment_close_exit;
            }
            exitAnim = i;
        }
        if (exitAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
            if (equals) {
                try {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, exitAnim);
                    if (loadAnimation != null) {
                        return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(loadAnimation);
                    }
                } catch (android.content.res.Resources.NotFoundException e) {
                    throw e;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            try {
                android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, exitAnim);
                if (loadAnimator != null) {
                    return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(loadAnimator);
                }
            } catch (java.lang.RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, exitAnim);
                if (loadAnimation2 != null) {
                    return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(loadAnimation2);
                }
            }
        }
        return null;
    }

    static class AnimationOrAnimator {
        public final android.view.animation.Animation getHighResolutionOutputSizeshNQ4ISI;
        public final android.animation.AnimatorSet getHighSpeedVideoFpsRangesFor;

        AnimationOrAnimator(android.view.animation.Animation animation) {
            this.getHighResolutionOutputSizeshNQ4ISI = animation;
            this.getHighSpeedVideoFpsRangesFor = null;
            if (animation == null) {
                throw new java.lang.IllegalStateException("Animation cannot be null");
            }
        }

        AnimationOrAnimator(android.animation.Animator animator) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.getHighSpeedVideoFpsRangesFor = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new java.lang.IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private final android.view.ViewGroup Camera2StreamConfigurationMap;
        private final android.view.View getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        EndViewTransitionAnimation(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
            super(false);
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap = viewGroup;
            this.getHighResolutionOutputSizeshNQ4ISI = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, android.view.animation.Transformation transformation) {
            this.getHighSpeedVideoFpsRangesFor = true;
            if (this.getHighSpeedVideoSizes) {
                return !this.getHighSpeedVideoFpsRanges;
            }
            if (!super.getTransformation(j, transformation)) {
                this.getHighSpeedVideoSizes = true;
                androidx.core.view.OneShotPreDrawListener.add(this.Camera2StreamConfigurationMap, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, android.view.animation.Transformation transformation, float f) {
            this.getHighSpeedVideoFpsRangesFor = true;
            if (this.getHighSpeedVideoSizes) {
                return !this.getHighSpeedVideoFpsRanges;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.getHighSpeedVideoSizes = true;
                androidx.core.view.OneShotPreDrawListener.add(this.Camera2StreamConfigurationMap, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = false;
                this.Camera2StreamConfigurationMap.post(this);
            } else {
                this.Camera2StreamConfigurationMap.endViewTransition(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRanges = true;
            }
        }
    }
}

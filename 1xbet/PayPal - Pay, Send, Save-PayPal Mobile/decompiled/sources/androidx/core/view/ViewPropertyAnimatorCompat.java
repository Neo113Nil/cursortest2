package androidx.core.view;

/* loaded from: classes3.dex */
public final class ViewPropertyAnimatorCompat {
    private final java.lang.ref.WeakReference<android.view.View> getHighSpeedVideoSizes;

    ViewPropertyAnimatorCompat(android.view.View view) {
        this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(view);
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat setDuration(long j) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat alpha(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat translationX(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat translationY(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat withEndAction(java.lang.Runnable runnable) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public final long getDuration() {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(android.view.animation.Interpolator interpolator) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final android.view.animation.Interpolator getInterpolator() {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            return (android.view.animation.Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long j) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final long getStartDelay() {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat rotation(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat rotationX(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat rotationY(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat scaleX(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat scaleY(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public final void cancel() {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat x(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat xBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat y(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat yBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().translationZBy(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat translationZ(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().translationZ(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat z(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().z(f);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat zBy(float f) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().zBy(f);
        }
        return this;
    }

    public final void start() {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat withStartAction(java.lang.Runnable runnable) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat setListener(androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            getHighSpeedVideoFpsRangesFor(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    private void getHighSpeedVideoFpsRangesFor(final android.view.View view, final androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(final androidx.core.view.ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final android.view.View view = this.getHighSpeedVideoSizes.get();
        if (view != null) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    androidx.core.view.ViewPropertyAnimatorUpdateListener.this.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }
}

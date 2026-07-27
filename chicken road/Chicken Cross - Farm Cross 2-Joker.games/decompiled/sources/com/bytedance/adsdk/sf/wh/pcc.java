package com.bytedance.adsdk.sf.wh;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public abstract class pcc extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> pcc = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> sf = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> gm = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.pcc.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.pcc.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.pcc.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.sf.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.sf.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.sf.clear();
    }

    void pcc(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.sf) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.gm.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.gm.remove(animatorPauseListener);
    }

    void pcc() {
        Iterator<Animator.AnimatorListener> it = this.sf.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void sf(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.sf) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void sf() {
        Iterator<Animator.AnimatorListener> it = this.sf.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void gm() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.pcc.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void oo() {
        Iterator<Animator.AnimatorPauseListener> it = this.gm.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void vj() {
        Iterator<Animator.AnimatorPauseListener> it = this.gm.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}

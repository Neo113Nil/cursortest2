package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class oo implements mu {
    public View gm;
    private Set<ScheduledFuture<?>> oo = new HashSet();
    public List<ObjectAnimator> pcc = pcc();
    com.bytedance.sdk.component.adexpress.dynamic.oo.pcc sf;

    abstract List<ObjectAnimator> pcc();

    public oo(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        this.gm = view;
        this.sf = pccVar;
    }

    public void gm() {
        List<ObjectAnimator> list = this.pcc;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.sf.nac() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        pcc pccVar = oo.this.new pcc(objectAnimator);
                        ScheduledFuture<?> pcc2 = com.bytedance.sdk.component.adexpress.oo.oo.pcc(pccVar, (long) (oo.this.sf.nac() * 1000.0d), TimeUnit.MILLISECONDS);
                        pccVar.pcc(pcc2);
                        oo.this.oo.add(pcc2);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu
    public void sf() {
        List<ObjectAnimator> list = this.pcc;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.oo.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator pcc(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.sf.gbb() * 1000.0d));
        if (this.sf.jr() > 0) {
            objectAnimator.setRepeatCount(this.sf.jr() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.sf.dax())) {
            if ("alternate".equals(this.sf.dax()) || "alternate-reverse".equals(this.sf.dax())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.sf.hc())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.sf.dax())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.sf.dax())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    oo.this.gm.setVisibility(0);
                    if (oo.this.gm.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh) {
                        ((View) oo.this.gm.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public class pcc implements Runnable {
        ObjectAnimator pcc;
        ScheduledFuture<?> sf;

        pcc(ObjectAnimator objectAnimator) {
            this.pcc = objectAnimator;
        }

        public void pcc(ScheduledFuture<?> scheduledFuture) {
            this.sf = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().gm().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo.pcc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pcc.this.pcc.resume();
                    }
                });
                if (this.sf != null) {
                    oo.this.oo.remove(this.sf);
                }
            }
        }
    }
}

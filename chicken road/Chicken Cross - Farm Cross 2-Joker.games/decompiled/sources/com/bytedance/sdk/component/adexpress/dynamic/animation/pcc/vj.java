package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class vj extends oo {
    public vj(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        char c;
        ArrayList arrayList = new ArrayList();
        String fum = this.sf.fum();
        switch (fum.hashCode()) {
            case 3029889:
                if (fum.equals("both")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (fum.equals("none")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 483313230:
                if (fum.equals("forwards")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1356771568:
                if (fum.equals("backwards")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            pcc(arrayList);
        } else if (c == 1) {
            oo(arrayList);
        } else if (c == 2) {
            sf(arrayList);
        } else {
            gm(arrayList);
        }
        return arrayList;
    }

    private void pcc(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.sf.lo())).setDuration(((int) (this.sf.ork() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        this.sf.wh(this.sf.jr() * 2);
        list.add(pcc(duration));
    }

    private void sf(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.sf.lo())).setDuration((int) (this.sf.ork() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.vj.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                vj.this.gm.setTranslationY(0.0f);
            }
        });
        list.add(pcc(duration));
    }

    private void gm(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.sf.lo())).setDuration((int) (this.sf.ork() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.vj.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                vj.this.gm.setTranslationY(0.0f);
            }
        });
        list.add(pcc(duration));
    }

    private void oo(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.sf.lo())).setDuration((int) (this.sf.ork() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(pcc(duration));
    }
}

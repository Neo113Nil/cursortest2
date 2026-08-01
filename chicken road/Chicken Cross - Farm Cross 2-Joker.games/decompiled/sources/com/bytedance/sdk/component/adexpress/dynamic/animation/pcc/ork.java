package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ork extends oo {
    private pcc oo;
    private float vj;
    private float wh;

    public ork(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        int i;
        String str;
        if ((this.gm instanceof ImageView) && (this.gm.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj)) {
            this.gm = (View) this.gm.getParent();
        }
        this.gm.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "alpha", 0.0f, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        this.oo = new pcc(this.gm);
        final int i2 = this.gm.getLayoutParams().height;
        this.vj = i2;
        this.wh = this.gm.getLayoutParams().width;
        if ("left".equals(this.sf.pcc()) || "right".equals(this.sf.pcc())) {
            i = (int) this.wh;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.oo, str, 0, i).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        arrayList.add(pcc(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.ork.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ork.this.oo.pcc(i2);
            }
        });
        return arrayList;
    }

    private class pcc {
        private View sf;

        public pcc(View view) {
            this.sf = view;
        }

        public void pcc(int i) {
            if (ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(ork.this.sf.pcc())) {
                if (ork.this.gm instanceof ViewGroup) {
                    for (int i2 = 0; i2 < ((ViewGroup) ork.this.gm).getChildCount(); i2++) {
                        ((ViewGroup) ork.this.gm).getChildAt(i2).setTranslationY(i - ork.this.vj);
                    }
                }
                ork.this.gm.setTranslationY(ork.this.vj - i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.sf.getLayoutParams();
            layoutParams.height = i;
            this.sf.setLayoutParams(layoutParams);
            this.sf.requestLayout();
        }
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class vh extends oo {
    public vh(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        float f;
        float vh = (float) this.sf.vh();
        float tmg = (float) this.sf.tmg();
        String dax = this.sf.dax();
        float f2 = 1.0f;
        if ("reverse".equals(dax) || "alternate-reverse".equals(dax)) {
            f = 1.0f;
        } else {
            f = tmg;
            tmg = 1.0f;
            f2 = vh;
            vh = 1.0f;
        }
        this.gm.setTag(2097610710, this.sf.sf());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "scaleX", vh, f2).setDuration((int) (this.sf.ork() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.gm, "scaleY", tmg, f).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        arrayList.add(pcc(duration2));
        return arrayList;
    }
}

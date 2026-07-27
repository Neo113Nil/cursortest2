package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class hc extends oo {
    public hc(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        if ((this.gm instanceof ImageView) && (this.gm.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vh)) {
            this.gm = (View) this.gm.getParent();
            ((ViewGroup) this.gm).setClipChildren(true);
            ((ViewGroup) this.gm.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        return arrayList;
    }
}

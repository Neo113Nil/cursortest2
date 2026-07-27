package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class pcc extends oo {
    public pcc(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        float lu = this.sf.lu() / 100.0f;
        float gpj = this.sf.gpj() / 100.0f;
        if ("reverse".equals(this.sf.dax()) && this.sf.gbb() <= 0.0d) {
            gpj = lu;
            lu = gpj;
        }
        this.gm.setAlpha(lu);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "alpha", lu, gpj).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        return arrayList;
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class qf extends oo {
    public qf(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        this.gm.setTag(2097610709, Integer.valueOf(this.sf.gm()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        return arrayList;
    }
}

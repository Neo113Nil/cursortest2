package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class gbb extends oo {
    public gbb(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "rotation", 0.0f, this.sf.vj(), 0.0f, this.sf.vj(), 0.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        return arrayList;
    }
}

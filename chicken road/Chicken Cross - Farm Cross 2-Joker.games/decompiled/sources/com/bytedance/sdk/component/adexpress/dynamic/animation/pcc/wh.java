package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class wh extends oo {
    public wh(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        float f = this.gm.getLayoutParams().width;
        this.gm.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "translationX", f, 0.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.gm, "alpha", 0.0f, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        arrayList.add(pcc(duration2));
        return arrayList;
    }
}

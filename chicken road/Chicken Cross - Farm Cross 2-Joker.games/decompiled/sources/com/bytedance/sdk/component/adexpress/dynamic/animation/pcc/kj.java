package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class kj extends oo {
    public kj(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        super(view, pccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.oo
    List<ObjectAnimator> pcc() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.gm, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.sf.ork() * 1000.0d));
        ((ViewGroup) this.gm.getParent()).setClipChildren(false);
        ((ViewGroup) this.gm.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.gm.getParent().getParent().getParent()).setClipChildren(false);
        this.gm.setTag(2097610712, this.sf.kj());
        ArrayList arrayList = new ArrayList();
        arrayList.add(pcc(duration));
        return arrayList;
    }
}

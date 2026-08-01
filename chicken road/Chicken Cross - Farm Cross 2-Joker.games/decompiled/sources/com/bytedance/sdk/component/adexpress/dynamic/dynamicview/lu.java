package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes4.dex */
public class lu extends wh {
    public sf pcc;

    public lu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        return super.vy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    protected sf pcc(Bitmap bitmap) {
        pcc pccVar = new pcc(bitmap, this.pcc);
        this.pcc = pccVar;
        return pccVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    protected GradientDrawable getDrawable() {
        sf sfVar = new sf();
        this.pcc = sfVar;
        return sfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    protected GradientDrawable pcc(GradientDrawable.Orientation orientation, int[] iArr) {
        sf sfVar = new sf(orientation, iArr);
        this.pcc = sfVar;
        return sfVar;
    }
}

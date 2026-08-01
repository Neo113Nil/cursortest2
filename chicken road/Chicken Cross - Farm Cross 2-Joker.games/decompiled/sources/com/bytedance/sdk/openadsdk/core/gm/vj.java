package com.bytedance.sdk.openadsdk.core.gm;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public abstract class vj extends pcc {
    protected abstract void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, boolean z);

    public vj(Context context, of ofVar, String str, int i) {
        super(context, ofVar, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        if (pcc(view, z)) {
            pcc(view, f, f2, f3, f4, sparseArray, this.mk, this.jsj, this.tsz, z);
        }
        super.pcc(view, f, f2, f3, f4, sparseArray, z);
    }
}

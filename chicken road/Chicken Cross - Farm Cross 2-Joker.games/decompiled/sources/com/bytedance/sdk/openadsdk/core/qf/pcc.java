package com.bytedance.sdk.openadsdk.core.qf;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.qf.gm;

/* loaded from: classes4.dex */
public class pcc extends gm {
    private static volatile pcc pcc;

    @Override // com.bytedance.sdk.openadsdk.core.qf.gm
    public /* bridge */ /* synthetic */ gm.C0171gm pcc() {
        return super.pcc();
    }

    public static pcc pcc(Context context) {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new pcc(context);
                }
            }
        }
        return pcc;
    }

    private pcc(Context context) {
        super(context);
    }
}

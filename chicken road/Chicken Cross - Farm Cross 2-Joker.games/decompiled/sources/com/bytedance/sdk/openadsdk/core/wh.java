package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.qf;

/* loaded from: classes4.dex */
public class wh extends qf {
    private static volatile wh pcc;

    @Override // com.bytedance.sdk.openadsdk.core.qf
    public /* bridge */ /* synthetic */ qf.gm pcc() {
        return super.pcc();
    }

    public static wh pcc(Context context) {
        if (pcc == null) {
            synchronized (wh.class) {
                if (pcc == null) {
                    pcc = new wh(context);
                }
            }
        }
        return pcc;
    }

    private wh(Context context) {
        super(context);
    }
}

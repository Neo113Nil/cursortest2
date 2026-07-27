package com.bytedance.sdk.component.wh.pcc.wh;

import com.bytedance.sdk.component.wh.pcc.qf;

/* loaded from: classes4.dex */
public class pcc {
    private static volatile sf pcc;

    public static sf pcc() {
        if (pcc == null) {
            synchronized (sf.class) {
                if (pcc == null) {
                    pcc = new gm(qf.wh().vj(), new wh(qf.wh().vj()));
                }
            }
        }
        return pcc;
    }
}

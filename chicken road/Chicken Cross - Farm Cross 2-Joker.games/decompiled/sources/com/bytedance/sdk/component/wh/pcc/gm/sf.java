package com.bytedance.sdk.component.wh.pcc.gm;

import com.bytedance.sdk.component.wh.pcc.qf;
import com.bytedance.sdk.component.wh.pcc.vj;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class sf {
    public static void pcc(AtomicLong atomicLong, int i) {
        vj jr = qf.wh().jr();
        if (jr == null || !jr.qf() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}

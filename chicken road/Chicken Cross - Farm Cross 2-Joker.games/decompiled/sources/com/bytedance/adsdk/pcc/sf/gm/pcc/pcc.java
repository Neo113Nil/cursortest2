package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.fum;
import java.util.Deque;

/* loaded from: classes5.dex */
public class pcc extends wh {
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        if (',' != pcc(i, str)) {
            return pccVar.pcc(str, i, deque);
        }
        deque.push(new fum(com.bytedance.adsdk.pcc.sf.oo.oo.COMMA));
        return i + 1;
    }
}

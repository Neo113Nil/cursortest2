package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.lo;
import java.util.Deque;

/* loaded from: classes5.dex */
public class sf extends wh {
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        if ('\'' != pcc(i, str)) {
            return pccVar.pcc(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && pcc(i3, str) != '\'') {
            i3++;
        }
        if (pcc(i3, str) != '\'') {
            throw new com.bytedance.adsdk.pcc.pcc.pcc("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new lo(str.substring(i2, i3)));
        return i3 + 1;
    }
}

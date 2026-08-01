package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.jr;
import java.util.Deque;

/* loaded from: classes5.dex */
public class qf extends wh {
    private boolean pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque) {
        if ('-' == pcc(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.pcc.sf.oo.gm.pcc(deque.peek().pcc())) {
                return false;
            }
            if (com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc(i + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
        }
        return com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc(i, str));
    }

    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        char pcc;
        if (!pcc(str, i, deque)) {
            return pccVar.pcc(str, i, deque);
        }
        int i2 = pcc(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            pcc = pcc(i2, str);
            if (com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc) || (!z && pcc == '.')) {
                i2++;
                if (pcc == '.') {
                    z = true;
                }
            }
        }
        if (pcc == '.') {
            throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
        }
        deque.push(new jr(str.substring(i, i2)));
        return i2;
    }
}

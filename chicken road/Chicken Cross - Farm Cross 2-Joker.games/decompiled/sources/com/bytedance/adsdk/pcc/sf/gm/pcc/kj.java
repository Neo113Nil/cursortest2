package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.dax;
import java.util.Deque;

/* loaded from: classes5.dex */
public class kj extends wh {
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        if (!com.bytedance.adsdk.pcc.sf.vj.pcc.oo(pcc(i, str))) {
            return pccVar.pcc(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{pcc(i, str), pcc(i2, str)});
        if (com.bytedance.adsdk.pcc.sf.oo.gm.pcc(str2) != null) {
            deque.push(new dax(com.bytedance.adsdk.pcc.sf.oo.gm.pcc(str2)));
            return i + 2;
        }
        String valueOf = String.valueOf(pcc(i, str));
        if (com.bytedance.adsdk.pcc.sf.oo.gm.pcc(valueOf) != null) {
            deque.push(new dax(com.bytedance.adsdk.pcc.sf.oo.gm.pcc(valueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + valueOf + "examine:" + str.substring(0, i));
    }
}

package com.bytedance.adsdk.pcc.sf.gm.pcc;

import java.util.Deque;

/* loaded from: classes5.dex */
public abstract class wh {
    public abstract int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar);

    protected char pcc(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    protected int sf(int i, String str) {
        while (com.bytedance.adsdk.pcc.sf.vj.pcc.pcc(pcc(i, str))) {
            i++;
        }
        return i;
    }
}

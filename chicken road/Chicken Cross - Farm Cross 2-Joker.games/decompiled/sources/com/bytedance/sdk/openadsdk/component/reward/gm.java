package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.sdk.component.kj.sf.gm {
    private final List<? extends com.bytedance.sdk.component.kj.sf.gm> pcc;

    public gm(String str, List<? extends com.bytedance.sdk.component.kj.sf.gm> list) {
        super(str);
        this.pcc = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.kj.sf.gm> list;
        if (com.bytedance.sdk.component.utils.lu.gm(com.bytedance.sdk.openadsdk.core.lu.pcc()) != 0 && (list = this.pcc) != null) {
            Iterator<? extends com.bytedance.sdk.component.kj.sf.gm> it = list.iterator();
            while (it.hasNext()) {
                rnn.pcc(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.vy.pcc().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}

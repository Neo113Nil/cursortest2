package com.bytedance.adsdk.ugeno.oo.pcc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class sf implements gm {
    private List<oo> pcc = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.oo.pcc.gm
    public void pcc(oo ooVar) {
        this.pcc.add(ooVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.pcc.gm
    public void pcc(String str) {
        if (this.pcc.isEmpty()) {
            return;
        }
        Iterator<oo> it = this.pcc.iterator();
        while (it.hasNext()) {
            it.next().pcc(str);
        }
    }
}

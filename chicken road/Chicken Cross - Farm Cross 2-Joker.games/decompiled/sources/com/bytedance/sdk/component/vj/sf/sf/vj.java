package com.bytedance.sdk.component.vj.sf.sf;

import com.bytedance.sdk.component.vj.gpj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class vj implements wh {
    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public boolean pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar, gpj gpjVar, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        List<com.bytedance.sdk.component.vj.sf.gm.gm> list;
        String gpj = gmVar.gpj();
        Map<String, List<com.bytedance.sdk.component.vj.sf.gm.gm>> vy = gmVar.dax().vy();
        gmVar.vh();
        gmVar.pcc();
        synchronized (vy) {
            list = vy.get(gpj);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                vy.put(gpj, list);
            }
        }
        synchronized (list) {
            list.add(gmVar);
            if (list.size() <= 1) {
                return true;
            }
            gmVar.vh();
            gmVar.pcc();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public String pcc() {
        return "check_duplicate";
    }
}

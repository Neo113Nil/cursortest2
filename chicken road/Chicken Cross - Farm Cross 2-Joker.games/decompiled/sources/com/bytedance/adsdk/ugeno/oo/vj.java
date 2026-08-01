package com.bytedance.adsdk.ugeno.oo;

import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class vj implements gm {
    @Override // com.bytedance.adsdk.ugeno.oo.gm
    public List<sf> pcc() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sf("update") { // from class: com.bytedance.adsdk.ugeno.oo.vj.1
            @Override // com.bytedance.adsdk.ugeno.oo.sf
            public com.bytedance.adsdk.ugeno.oo.sf.pcc pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
                return new com.bytedance.adsdk.ugeno.oo.sf.vj(gmVar, str, pccVar);
            }
        });
        arrayList.add(new sf("emit") { // from class: com.bytedance.adsdk.ugeno.oo.vj.2
            @Override // com.bytedance.adsdk.ugeno.oo.sf
            public com.bytedance.adsdk.ugeno.oo.sf.pcc pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
                return new com.bytedance.adsdk.ugeno.oo.sf.sf(gmVar, str, pccVar);
            }
        });
        arrayList.add(new sf("startAnimate") { // from class: com.bytedance.adsdk.ugeno.oo.vj.3
            @Override // com.bytedance.adsdk.ugeno.oo.sf
            public com.bytedance.adsdk.ugeno.oo.sf.pcc pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
                return new com.bytedance.adsdk.ugeno.oo.sf.oo(gmVar, str, pccVar);
            }
        });
        return arrayList;
    }
}

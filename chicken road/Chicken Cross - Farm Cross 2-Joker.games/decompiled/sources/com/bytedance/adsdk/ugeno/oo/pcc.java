package com.bytedance.adsdk.ugeno.oo;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class pcc implements kj {
    @Override // com.bytedance.adsdk.ugeno.oo.kj
    public List<qf> pcc() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qf("slide") { // from class: com.bytedance.adsdk.ugeno.oo.pcc.1
            @Override // com.bytedance.adsdk.ugeno.oo.qf
            public com.bytedance.adsdk.ugeno.oo.oo.gm pcc(Context context) {
                return new com.bytedance.adsdk.ugeno.oo.oo.vj(context);
            }
        });
        arrayList.add(new qf("tap") { // from class: com.bytedance.adsdk.ugeno.oo.pcc.2
            @Override // com.bytedance.adsdk.ugeno.oo.qf
            public com.bytedance.adsdk.ugeno.oo.oo.gm pcc(Context context) {
                return new com.bytedance.adsdk.ugeno.oo.oo.vy(context);
            }
        });
        arrayList.add(new qf("timer") { // from class: com.bytedance.adsdk.ugeno.oo.pcc.3
            @Override // com.bytedance.adsdk.ugeno.oo.qf
            public com.bytedance.adsdk.ugeno.oo.oo.gm pcc(Context context) {
                return new com.bytedance.adsdk.ugeno.oo.oo.ork(context);
            }
        });
        arrayList.add(new qf("touchStart") { // from class: com.bytedance.adsdk.ugeno.oo.pcc.4
            @Override // com.bytedance.adsdk.ugeno.oo.qf
            public com.bytedance.adsdk.ugeno.oo.oo.gm pcc(Context context) {
                return new com.bytedance.adsdk.ugeno.oo.oo.tmg(context);
            }
        });
        arrayList.add(new qf("touchEnd") { // from class: com.bytedance.adsdk.ugeno.oo.pcc.5
            @Override // com.bytedance.adsdk.ugeno.oo.qf
            public com.bytedance.adsdk.ugeno.oo.oo.gm pcc(Context context) {
                return new com.bytedance.adsdk.ugeno.oo.oo.vh(context);
            }
        });
        arrayList.add(new qf("animateState") { // from class: com.bytedance.adsdk.ugeno.oo.pcc.6
            @Override // com.bytedance.adsdk.ugeno.oo.qf
            public com.bytedance.adsdk.ugeno.oo.oo.gm pcc(Context context) {
                return new com.bytedance.adsdk.ugeno.oo.oo.sf(context);
            }
        });
        return arrayList;
    }
}

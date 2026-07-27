package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;

/* loaded from: classes4.dex */
public class oo extends vh {
    public pcc ork;
    public wh vy;

    public oo(vh.pcc pccVar) {
        super(pccVar);
        this.vy = new wh();
        this.ork = new pcc(this.vy.sf());
    }

    @Override // com.bytedance.sdk.component.sf.pcc.vh
    public com.bytedance.sdk.component.sf.pcc.oo sf() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.vh
    public com.bytedance.sdk.component.sf.pcc.sf pcc(tmg tmgVar) {
        tmgVar.pcc(this);
        if (tmgVar == null || tmgVar.oo() == null || tmgVar.oo().pcc() == null || TextUtils.isEmpty(tmgVar.oo().pcc().toString())) {
            return null;
        }
        if (pcc.pcc != null && pcc.pcc.sf() && this.ork.vj() && !"setting".equals(tmgVar.kj())) {
            sf sfVar = new sf(tmgVar, this.ork);
            this.ork.gm().add(sfVar);
            return sfVar;
        }
        sf sfVar2 = new sf(tmgVar, this.vy);
        this.vy.gm().add(sfVar2);
        return sfVar2;
    }
}

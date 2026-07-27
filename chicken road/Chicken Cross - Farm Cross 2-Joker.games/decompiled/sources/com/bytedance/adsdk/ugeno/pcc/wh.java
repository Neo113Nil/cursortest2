package com.bytedance.adsdk.ugeno.pcc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class wh {
    private Context gm;
    private com.bytedance.adsdk.ugeno.sf.gm oo;
    private List<gm> pcc;
    private List<pcc> sf;

    public wh(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, List<gm> list) {
        this.oo = gmVar;
        this.gm = context;
        this.pcc = list;
        oo();
    }

    private void oo() {
        this.sf = new ArrayList();
        List<gm> list = this.pcc;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.pcc.size(); i++) {
            gm gmVar = this.pcc.get(i);
            if (gmVar != null) {
                this.sf.add(new pcc(this.gm, this.oo, gmVar));
            }
        }
    }

    public void pcc() {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.oo();
            }
        }
    }

    public void sf() {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.pcc();
            }
        }
    }

    public void gm() {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.gm();
            }
        }
    }

    public void pcc(Canvas canvas) {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.pcc(canvas);
            }
        }
    }

    public void sf(Canvas canvas) {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.sf(canvas);
            }
        }
    }

    public void pcc(int i, int i2) {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.pcc(i, i2);
            }
        }
    }

    public pcc pcc(String str) {
        List<pcc> list = this.sf;
        if (list != null && !list.isEmpty()) {
            for (pcc pccVar : this.sf) {
                if (pccVar != null && TextUtils.equals(pccVar.vj(), str)) {
                    return pccVar;
                }
            }
        }
        return null;
    }
}

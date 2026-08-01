package com.bytedance.sdk.component.wh.pcc;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class oo {
    public static final oo pcc = new oo();

    public void pcc(pcc pccVar, Context context) {
        sf(pccVar, context);
        qf.wh().pcc(context);
        qf.wh().pcc(pccVar.ork());
        qf.wh().sf(pccVar.qf());
        qf.wh().gm(pccVar.kj());
        qf.wh().pcc(pccVar.sf());
        qf.wh().oo(pccVar.vy());
        qf.wh().vj(pccVar.wh());
        qf.wh().pcc(pccVar.pcc() == null ? com.bytedance.sdk.component.wh.pcc.pcc.pcc.vj.pcc : pccVar.pcc());
        qf.wh().pcc(pccVar.oo());
        qf.wh().pcc(pccVar.gm());
        qf.wh().pcc(pccVar.vj());
        com.bytedance.sdk.component.wh.pcc.sf.sf.gm.pcc(pccVar.tmg());
        com.bytedance.sdk.component.wh.pcc.sf.sf.gm.sf(pccVar.vh());
        pcc(pccVar);
    }

    private void pcc(pcc pccVar) {
        Executor vj;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.wh.pcc.gm.pcc.sf()) {
            com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc();
            return;
        }
        vj oo = pccVar.oo();
        if (oo == null || !com.bytedance.sdk.component.wh.pcc.gm.pcc.sf() || (vj = oo.vj()) == null) {
            return;
        }
        vj.execute(new Runnable() { // from class: com.bytedance.sdk.component.wh.pcc.oo.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc();
            }
        });
    }

    public void pcc(boolean z) {
        qf.wh().pcc(z);
    }

    private void sf(pcc pccVar, Context context) {
        gm.pcc(context, "context == null");
        gm.pcc(pccVar, "AdLogConfig == null");
        gm.pcc(pccVar.oo(), "AdLogDepend ==null");
    }

    public void pcc() {
        vj jr = qf.wh().jr();
        if (jr == null || qf.wh().vj() == null || jr.oo() == null) {
            return;
        }
        qf.wh().kj();
    }

    public void sf() {
        vj jr = qf.wh().jr();
        if (jr == null || qf.wh().vj() == null || jr.oo() == null) {
            return;
        }
        qf.wh().ork();
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        sf(pccVar);
    }

    private void sf(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        vj jr = qf.wh().jr();
        if (pccVar == null || jr == null || qf.wh().vj() == null || jr.oo() == null) {
            return;
        }
        qf.wh().pcc(pccVar);
    }

    public void pcc(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        vj jr = qf.wh().jr();
        if (jr == null || qf.wh().vj() == null || jr.oo() == null || !jr.kj()) {
            return;
        }
        if (jr.wh() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (jr.wh() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        qf.wh().pcc(str, list, z, map, i, str2);
    }

    public void pcc(String str, boolean z) {
        vj jr = qf.wh().jr();
        if (jr == null || qf.wh().vj() == null || jr.oo() == null || !jr.kj()) {
            return;
        }
        if (jr.wh() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        qf.wh().pcc(str, z);
    }
}

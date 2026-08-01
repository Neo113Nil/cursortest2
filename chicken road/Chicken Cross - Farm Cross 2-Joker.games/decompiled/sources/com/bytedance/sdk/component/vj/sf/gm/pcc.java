package com.bytedance.sdk.component.vj.sf.gm;

import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.gpj;
import com.bytedance.sdk.component.vj.vh;
import com.ironsource.U3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc<T> {
    private gm pcc;
    private gpj sf;

    public pcc(gm gmVar, gpj gpjVar) {
        this.pcc = gmVar;
        this.sf = gpjVar;
    }

    public void pcc(vh<T> vhVar) {
        try {
            gpj gpjVar = this.sf;
            if (gpjVar != null) {
                gpjVar.pcc("success", this.pcc);
            }
            String gpj = this.pcc.gpj();
            Map<String, List<gm>> vy = this.pcc.dax().vy();
            List<gm> list = vy.get(gpj);
            if (list == null) {
                dax wh = this.pcc.wh();
                if (wh != null) {
                    new StringBuilder("not repeat request listener is ").append(wh);
                    this.pcc.kj();
                    wh.pcc(vhVar);
                }
            } else {
                synchronized (list) {
                    list.size();
                    for (gm gmVar : list) {
                        dax wh2 = gmVar.wh();
                        if (wh2 != null) {
                            new StringBuilder("repeat request listener is ").append(wh2).append(" key is ");
                            gmVar.kj();
                            wh2.pcc(vhVar);
                        }
                    }
                    list.clear();
                    vy.remove(gpj);
                }
            }
            gpj gpjVar2 = this.sf;
            if (gpjVar2 != null) {
                gpjVar2.sf("success", this.pcc);
            }
        } catch (Throwable unused) {
        }
    }

    public void pcc(int i, String str, Throwable th) {
        try {
            gpj gpjVar = this.sf;
            if (gpjVar != null) {
                gpjVar.pcc(U3.i.t, this.pcc);
            }
            String gpj = this.pcc.gpj();
            Map<String, List<gm>> vy = this.pcc.dax().vy();
            List<gm> list = vy.get(gpj);
            if (list == null) {
                dax wh = this.pcc.wh();
                if (wh != null) {
                    wh.pcc(i, str, th);
                }
            } else {
                synchronized (list) {
                    Iterator<gm> it = list.iterator();
                    while (it.hasNext()) {
                        dax wh2 = it.next().wh();
                        if (wh2 != null) {
                            new StringBuilder("repeat request listener is ").append(wh2);
                            wh2.pcc(i, str, th);
                        }
                    }
                    list.clear();
                    vy.remove(gpj);
                }
            }
            gpj gpjVar2 = this.sf;
            if (gpjVar2 != null) {
                gpjVar2.sf(U3.i.t, this.pcc);
            }
        } catch (Throwable unused) {
        }
    }
}

package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.qf;
import com.bytedance.adsdk.ugeno.sf.pcc;
import com.ironsource.C4561o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg {
    private boolean dax;
    private float fum;
    private com.bytedance.adsdk.ugeno.sf.gm<View> gm;
    private vj gpj;
    private com.bytedance.adsdk.ugeno.oo.pcc.pcc jr;
    private com.bytedance.adsdk.ugeno.oo.gbb kj;
    private float lo;
    private List<String> lu;
    private boolean nac;
    private kj oo;
    private qf ork;
    private Context pcc;
    private dax qf;
    private JSONObject sf;
    private vh tmg;
    private vy tz;
    private String vh;
    private jr vj;
    private com.bytedance.adsdk.ugeno.oo.hc vy;
    private lu wh;
    private boolean hc = true;
    private boolean gbb = false;

    public tmg(Context context) {
        this.pcc = context;
    }

    public void pcc(String str, vh vhVar) {
        this.tmg = vhVar;
        this.vh = str;
        if (vhVar != null) {
            this.sf = vhVar.pcc();
        }
    }

    public com.bytedance.adsdk.ugeno.sf.gm<View> pcc(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.sf = jSONObject2;
        lu luVar = this.wh;
        if (luVar != null) {
            luVar.pcc();
        }
        qf qfVar = new qf(jSONObject, jSONObject2, jSONObject3);
        this.ork = qfVar;
        qfVar.pcc(this.lo, this.fum);
        this.jr = new com.bytedance.adsdk.ugeno.oo.pcc.pcc();
        if (this.vj instanceof com.bytedance.adsdk.ugeno.core.pcc.sf) {
            this.ork.sf();
            throw null;
        }
        this.gm = pcc(this.ork.pcc(), (com.bytedance.adsdk.ugeno.sf.gm<View>) null);
        if (this.tz != null) {
            throw null;
        }
        lu luVar2 = this.wh;
        if (luVar2 != null) {
            luVar2.sf();
            this.gm.pcc(this.wh);
            this.wh.gm();
        }
        pcc(this.gm);
        if (this.wh != null) {
            nac nacVar = new nac();
            nacVar.pcc(0);
            nacVar.pcc(this.gm);
            this.wh.pcc(nacVar);
        }
        return this.gm;
    }

    public com.bytedance.adsdk.ugeno.sf.gm<View> pcc(qf.pcc pccVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.sf = jSONObject;
        lu luVar = this.wh;
        if (luVar != null) {
            luVar.pcc();
        }
        this.jr = new com.bytedance.adsdk.ugeno.oo.pcc.pcc();
        if (this.vj instanceof com.bytedance.adsdk.ugeno.core.pcc.sf) {
            throw null;
        }
        this.gm = pcc(pccVar, (com.bytedance.adsdk.ugeno.sf.gm<View>) null);
        lu luVar2 = this.wh;
        if (luVar2 != null) {
            luVar2.sf();
            this.gm.pcc(this.wh);
        }
        pcc(this.gm);
        return this.gm;
    }

    public com.bytedance.adsdk.ugeno.sf.gm<View> pcc(qf.pcc pccVar, com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
        pcc.C0109pcc c0109pcc;
        List<qf.pcc> gm;
        if (!qf.oo(pccVar)) {
            return null;
        }
        String oo = pccVar.oo();
        sf pcc = oo.pcc(oo);
        sf sfVar = pcc;
        if (pcc == null) {
            this.dax = true;
            if (this.lu == null) {
                this.lu = new ArrayList();
            }
            this.lu.add(oo);
            oo = "View";
            pccVar.pcc("View");
            sf pcc2 = oo.pcc("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            sfVar = pcc2;
            if (pcc2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf("View")));
                return null;
            }
        }
        com.bytedance.adsdk.ugeno.sf.gm pcc3 = sfVar.pcc(this.pcc);
        if (pcc3 == null) {
            return null;
        }
        JSONObject vj = pccVar.vj();
        pcc3.vy(com.bytedance.adsdk.ugeno.gm.sf.pcc(pccVar.pcc(), this.sf));
        pcc3.ork(oo);
        pcc3.gm(vj);
        pcc3.pcc(pccVar);
        pcc3.sf(this.sf);
        qf qfVar = this.ork;
        if (qfVar == null) {
            pcc3.pcc(true);
        } else {
            pcc3.pcc(qfVar.oo());
        }
        pcc3.pcc(this.tmg);
        pcc3.pcc(this.jr);
        Iterator<String> keys = vj.keys();
        if (gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) {
            com.bytedance.adsdk.ugeno.sf.pcc pccVar2 = (com.bytedance.adsdk.ugeno.sf.pcc) gmVar;
            c0109pcc = pccVar2.ork();
            pcc3.pcc(pccVar2);
        } else {
            c0109pcc = null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            String pcc4 = com.bytedance.adsdk.ugeno.gm.sf.pcc(vj.optString(next), this.sf);
            pcc3.pcc(next, pcc4);
            if (this.tz != null) {
                throw null;
            }
            if (c0109pcc != null) {
                c0109pcc.pcc(this.pcc, next, pcc4);
            }
        }
        if (c0109pcc != null) {
            pcc3.pcc(c0109pcc.pcc());
        }
        if (gmVar != null && TextUtils.equals("virtualNode", gmVar.pq()) && pcc3.gd()) {
            this.nac = true;
        }
        if (pcc3 instanceof com.bytedance.adsdk.ugeno.sf.pcc) {
            List<qf.pcc> wh = pccVar.wh();
            if (wh == null || wh.size() <= 0) {
                if (TextUtils.equals(pcc3.mu(), "RecyclerLayout") && (gm = this.ork.gm()) != null && gm.size() > 0) {
                    Iterator<qf.pcc> it = gm.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.sf.gm<View> pcc5 = pcc(it.next(), (com.bytedance.adsdk.ugeno.sf.gm<View>) pcc3);
                        if (pcc5 != null && pcc5.tsx()) {
                            ((com.bytedance.adsdk.ugeno.sf.pcc) pcc3).pcc(pcc5);
                        }
                    }
                }
                return pcc3;
            }
            if (TextUtils.equals(pcc3.mu(), "Swiper") && wh.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            try {
                Collections.sort(wh, new Comparator<qf.pcc>() { // from class: com.bytedance.adsdk.ugeno.core.tmg.1
                    @Override // java.util.Comparator
                    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                    public int compare(qf.pcc pccVar3, qf.pcc pccVar4) {
                        return pccVar3.vj().optInt(C4561o2.u, 0) - pccVar4.vj().optInt(C4561o2.u, 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<qf.pcc> it2 = wh.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.sf.gm<View> pcc6 = pcc(it2.next(), (com.bytedance.adsdk.ugeno.sf.gm<View>) pcc3);
                if (pcc6 != null && !pcc6.gd()) {
                    ((com.bytedance.adsdk.ugeno.sf.pcc) pcc3).pcc(pcc6, pcc6.atb());
                }
            }
        }
        this.gm = pcc3;
        return pcc3;
    }

    public com.bytedance.adsdk.ugeno.sf.gm<View> pcc(JSONObject jSONObject) {
        lu luVar = this.wh;
        if (luVar != null) {
            luVar.pcc();
        }
        qf qfVar = new qf(jSONObject, this.sf);
        this.ork = qfVar;
        if (this.vj instanceof com.bytedance.adsdk.ugeno.core.pcc.sf) {
            qfVar.sf();
            throw null;
        }
        this.gm = sf(qfVar.pcc(), (com.bytedance.adsdk.ugeno.sf.gm<View>) null);
        lu luVar2 = this.wh;
        if (luVar2 != null) {
            luVar2.sf();
            this.gm.pcc(this.wh);
        }
        return this.gm;
    }

    public com.bytedance.adsdk.ugeno.sf.gm<View> sf(qf.pcc pccVar, com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
        List<qf.pcc> gm;
        pcc.C0109pcc c0109pcc = null;
        if (!qf.oo(pccVar)) {
            return null;
        }
        String oo = pccVar.oo();
        sf pcc = oo.pcc(oo);
        if (pcc == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(oo)));
            this.dax = true;
            if (this.lu == null) {
                this.lu = new ArrayList();
            }
            this.lu.add(oo);
            return null;
        }
        com.bytedance.adsdk.ugeno.sf.gm pcc2 = pcc.pcc(this.pcc);
        if (pcc2 == null) {
            return null;
        }
        pcc2.vy(com.bytedance.adsdk.ugeno.gm.sf.pcc(pccVar.pcc(), this.sf));
        pcc2.ork(oo);
        pcc2.gm(pccVar.vj());
        pcc2.pcc(pccVar);
        pcc2.pcc(this.tmg);
        if (gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) {
            com.bytedance.adsdk.ugeno.sf.pcc pccVar2 = (com.bytedance.adsdk.ugeno.sf.pcc) gmVar;
            pcc2.pcc(pccVar2);
            c0109pcc = pccVar2.ork();
        }
        Iterator<String> keys = pccVar.vj().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String pcc3 = com.bytedance.adsdk.ugeno.gm.sf.pcc(pccVar.vj().optString(next), this.sf);
            pcc2.pcc(next, pcc3);
            if (c0109pcc != null) {
                c0109pcc.pcc(this.pcc, next, pcc3);
            }
        }
        if (pcc2 instanceof com.bytedance.adsdk.ugeno.sf.pcc) {
            List<qf.pcc> wh = pccVar.wh();
            if (wh == null || wh.size() <= 0) {
                if (TextUtils.equals(pcc2.mu(), "RecyclerLayout") && (gm = this.ork.gm()) != null && gm.size() > 0) {
                    Iterator<qf.pcc> it = gm.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.sf.gm<View> sf = sf(it.next(), (com.bytedance.adsdk.ugeno.sf.gm<View>) pcc2);
                        if (sf != null && sf.tsx()) {
                            ((com.bytedance.adsdk.ugeno.sf.pcc) pcc2).pcc(sf);
                        }
                    }
                }
                return pcc2;
            }
            if (TextUtils.equals(pcc2.mu(), "Swiper") && wh.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<qf.pcc> it2 = wh.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.sf.gm<View> sf2 = sf(it2.next(), (com.bytedance.adsdk.ugeno.sf.gm<View>) pcc2);
                if (sf2 != null && sf2.tsx()) {
                    ((com.bytedance.adsdk.ugeno.sf.pcc) pcc2).pcc(sf2);
                }
            }
        }
        if (c0109pcc != null) {
            pcc2.pcc(c0109pcc.pcc());
        }
        this.gm = pcc2;
        return pcc2;
    }

    public void sf(JSONObject jSONObject) {
        lu luVar = this.wh;
        if (luVar != null) {
            luVar.gm();
        }
        this.sf = jSONObject;
        pcc(this.gm, jSONObject);
        pcc(this.gm);
        if (this.wh != null) {
            nac nacVar = new nac();
            nacVar.pcc(0);
            nacVar.pcc(this.gm);
            this.wh.pcc(nacVar);
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        if (gmVar == null) {
            return;
        }
        if (gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) {
            gmVar.pcc(jSONObject);
            List<com.bytedance.adsdk.ugeno.sf.gm<View>> vy = ((com.bytedance.adsdk.ugeno.sf.pcc) gmVar).vy();
            if (vy == null || vy.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.sf.gm<View>> it = vy.iterator();
            while (it.hasNext()) {
                pcc(it.next(), jSONObject);
            }
            return;
        }
        gmVar.pcc(jSONObject);
    }

    private void pcc(com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
        List<com.bytedance.adsdk.ugeno.sf.gm<View>> vy;
        if (gmVar == null) {
            return;
        }
        JSONObject jsj = gmVar.jsj();
        Iterator<String> keys = jsj.keys();
        com.bytedance.adsdk.ugeno.sf.pcc zti = gmVar.zti();
        pcc.C0109pcc ork = zti != null ? zti.ork() : null;
        sf(gmVar);
        while (keys.hasNext()) {
            String next = keys.next();
            String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(jsj.optString(next), this.sf);
            gmVar.pcc(next, pcc);
            if (ork != null) {
                ork.pcc(this.pcc, next, pcc);
            }
        }
        gmVar.pcc(this.oo);
        gmVar.pcc(this.vj);
        gmVar.pcc(this.qf);
        vy vyVar = this.tz;
        if (vyVar != null) {
            gmVar.pcc(vyVar);
        }
        vj vjVar = this.gpj;
        if (vjVar != null) {
            gmVar.pcc(vjVar);
        }
        com.bytedance.adsdk.ugeno.oo.gbb gbbVar = this.kj;
        if (gbbVar != null) {
            gmVar.pcc(gbbVar);
        }
        com.bytedance.adsdk.ugeno.oo.hc hcVar = this.vy;
        if (hcVar != null) {
            gmVar.pcc(hcVar);
        }
        if ((gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) && (vy = ((com.bytedance.adsdk.ugeno.sf.pcc) gmVar).vy()) != null && vy.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.sf.gm<View>> it = vy.iterator();
            while (it.hasNext()) {
                pcc(it.next());
            }
        }
        if (ork != null) {
            gmVar.pcc(ork.pcc());
        }
        gmVar.sf();
    }

    private void sf(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        try {
            if (!gmVar.lq() || gmVar.ye() == null || gmVar.ye().qf() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", gmVar.ye().qf());
            this.sf.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void pcc(jr jrVar) {
        com.bytedance.adsdk.ugeno.core.pcc.pcc vj = com.bytedance.adsdk.ugeno.vj.pcc().vj();
        if (vj == null) {
            this.vj = jrVar;
        } else {
            if (vj.pcc(jrVar) == null) {
                this.vj = jrVar;
                return;
            }
            throw null;
        }
    }

    public void pcc(dax daxVar) {
        this.qf = daxVar;
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.sf.gm<View>> vy;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(str, objArr);
        if (!(gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) || (vy = ((com.bytedance.adsdk.ugeno.sf.pcc) gmVar).vy()) == null || vy.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.sf.gm<View>> it = vy.iterator();
        while (it.hasNext()) {
            pcc(it.next(), str, objArr);
        }
    }

    public boolean pcc() {
        return this.dax;
    }

    public List<String> sf() {
        return this.lu;
    }

    public void pcc(vj vjVar) {
        this.gpj = vjVar;
    }

    public void pcc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        sf(jSONObject, gmVar);
        pcc((com.bytedance.adsdk.ugeno.sf.gm<View>) gmVar);
    }

    private void sf(JSONObject jSONObject, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        List<com.bytedance.adsdk.ugeno.sf.gm<View>> vy;
        if (gmVar == null) {
            return;
        }
        this.sf = jSONObject;
        gmVar.sf(jSONObject);
        gmVar.pcc(this.tmg);
        pcc.C0109pcc ork = gmVar.zti() instanceof com.bytedance.adsdk.ugeno.sf.pcc ? gmVar.zti().ork() : null;
        Iterator<String> keys = gmVar.jsj().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(gmVar.jsj().optString(next), jSONObject);
            gmVar.pcc(next, pcc);
            if (ork != null) {
                ork.pcc(this.pcc, next, pcc);
            }
        }
        if ((gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) && (vy = ((com.bytedance.adsdk.ugeno.sf.pcc) gmVar).vy()) != null && !vy.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.sf.gm<View>> it = vy.iterator();
            while (it.hasNext()) {
                sf(jSONObject, it.next());
            }
        }
        if (ork != null) {
            gmVar.pcc(ork.pcc());
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo.gbb gbbVar) {
        this.kj = gbbVar;
    }
}

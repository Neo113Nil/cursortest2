package com.bytedance.adsdk.ugeno.oo;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.oo.oo.gm;
import com.bytedance.adsdk.ugeno.oo.sf.pcc;
import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vy implements vh {
    private Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> gm;
    private hc kj;
    private Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> oo;
    private boolean ork;
    Handler pcc = new Handler(Looper.getMainLooper());
    private gbb qf;
    private pcc sf;
    private boolean tmg;
    private boolean vh;
    private com.bytedance.adsdk.ugeno.sf.gm vj;
    private com.bytedance.adsdk.ugeno.core.sf.pcc vy;
    private com.bytedance.adsdk.ugeno.core.vj wh;

    public vy(com.bytedance.adsdk.ugeno.sf.gm gmVar, pcc pccVar) {
        this.vj = gmVar;
        this.sf = pccVar;
        if (pccVar != null) {
            this.gm = pccVar.pcc;
            this.oo = pccVar.sf;
        }
        com.bytedance.adsdk.ugeno.sf.gm gmVar2 = this.vj;
        if (gmVar2 != null && gmVar2.erj() && this.vy == null) {
            this.vy = new com.bytedance.adsdk.ugeno.core.sf.pcc();
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.core.vj vjVar) {
        this.wh = vjVar;
    }

    public void pcc(gbb gbbVar) {
        this.qf = gbbVar;
    }

    public void pcc(hc hcVar) {
        this.kj = hcVar;
    }

    public void pcc() {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc2 = pcc("shake");
        if (pcc2 == null || pcc2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : pcc2) {
            if (gmVar != null) {
                gmVar.pcc(this);
                gmVar.pcc(new Object[0]);
            }
        }
    }

    public void sf() {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc2 = pcc("twist");
        if (pcc2 == null || pcc2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : pcc2) {
            if (gmVar != null) {
                gmVar.pcc(this);
                gmVar.pcc(new Object[0]);
            }
        }
    }

    public void gm() {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> value;
        pcc pccVar = this.sf;
        if (pccVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> entry : pccVar.pcc.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : value) {
                    if (gmVar instanceof com.bytedance.adsdk.ugeno.oo.oo.oo) {
                        gmVar.pcc(this);
                        gmVar.pcc(new Object[0]);
                    }
                }
            }
        }
    }

    public void oo() {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc2 = pcc("animateState");
        if (pcc2 == null || pcc2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : pcc2) {
            if (gmVar != null) {
                gmVar.pcc(this);
                gmVar.pcc(new Object[0]);
            }
        }
    }

    public void vj() {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc2 = pcc("timer");
        if (pcc2 == null || pcc2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : pcc2) {
            if (gmVar != null) {
                gmVar.pcc(this);
                gmVar.pcc(new Object[0]);
            }
        }
    }

    public boolean pcc(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc2 = pcc("touchStart");
        if (pcc2 != null && !pcc2.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : pcc2) {
                if (gmVar instanceof com.bytedance.adsdk.ugeno.oo.oo.tmg) {
                    gmVar.pcc(this);
                    gmVar.pcc(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc3 = pcc("touchEnd");
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc4 = pcc("tap");
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc5 = pcc("slide");
        if (pcc3 != null && !pcc3.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar2 : pcc3) {
                if (gmVar2 instanceof com.bytedance.adsdk.ugeno.oo.oo.vh) {
                    gmVar2.pcc(this);
                    this.tmg = gmVar2.pcc(motionEvent);
                }
            }
        }
        if ((pcc4 == null || pcc4.isEmpty()) && (pcc5 == null || pcc5.isEmpty())) {
            return this.tmg;
        }
        if (this.tmg && motionEvent.getAction() == 1) {
            return true;
        }
        com.bytedance.adsdk.ugeno.core.sf.pcc pccVar = this.vy;
        if (pccVar != null) {
            if (pccVar.pcc(motionEvent)) {
                Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                return false;
            }
            this.vy.pcc(this.vj, motionEvent);
        }
        if (pcc4 != null && !pcc4.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar3 : pcc4) {
                if (gmVar3 instanceof com.bytedance.adsdk.ugeno.oo.oo.vy) {
                    ((com.bytedance.adsdk.ugeno.oo.oo.vy) gmVar3).pcc(this.qf);
                    gmVar3.pcc(this);
                    this.ork = gmVar3.pcc(motionEvent);
                }
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.ork) {
            Log.d("GesThrough_UGEveFacade", "tap event handled");
            com.bytedance.adsdk.ugeno.core.sf.pcc pccVar2 = this.vy;
            if (pccVar2 != null) {
                pccVar2.pcc();
            }
            return true;
        }
        if (pcc5 != null && !pcc5.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar4 : pcc5) {
                if (gmVar4 instanceof com.bytedance.adsdk.ugeno.oo.oo.vj) {
                    ((com.bytedance.adsdk.ugeno.oo.oo.vj) gmVar4).pcc(this.kj);
                    gmVar4.pcc(this);
                    this.vh = gmVar4.pcc(motionEvent);
                }
            }
        }
        if (action == 1 || action == 3) {
            if (this.vh) {
                Log.d("GesThrough_UGEveFacade", "slide event handled");
                com.bytedance.adsdk.ugeno.core.sf.pcc pccVar3 = this.vy;
                if (pccVar3 != null) {
                    pccVar3.pcc();
                }
                return true;
            }
            if (this.vy != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.vy.pcc(this.vj);
            }
        }
        return this.ork || this.vh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, List<wh.pcc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (wh.pcc pccVar : list) {
            if (pccVar != null) {
                com.bytedance.adsdk.ugeno.oo.sf.pcc pcc2 = pcc.C0105pcc.pcc(this.vj, str, pccVar);
                Log.d("GesThrough_UGEveFacade", "trigger action.name is " + pccVar.toString());
                if (pcc2 != null) {
                    pcc2.pcc();
                    pcc2.sf();
                }
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.oo.oo.gm> pcc(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map2 = this.gm;
        if (((map2 == null || map2.isEmpty()) && ((map = this.oo) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map3 = this.gm;
        if (map3 != null && map3.containsKey(str)) {
            return this.gm.get(str);
        }
        Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map4 = this.oo;
        if (map4 != null && map4.containsKey(str)) {
            return this.oo.get(str);
        }
        return null;
    }

    public List<com.bytedance.adsdk.ugeno.oo.oo.gm> sf(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map2 = this.oo;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.oo) == null || !map.containsKey(str)) {
            return null;
        }
        return this.oo.get(str);
    }

    public void pcc(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> sf = sf(str);
        if (sf == null || sf.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : sf) {
            gmVar.pcc(this);
            gmVar.pcc(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oo.vh
    public void pcc(final com.bytedance.adsdk.ugeno.sf.gm gmVar, final String str, final List<wh.pcc> list, wh whVar) {
        Log.d("GesThrough_UGEveFacade", "trigger on.name is " + str + " handlers disable is " + whVar.gm() + " delay is " + whVar.oo());
        if (whVar.gm()) {
            return;
        }
        final int oo = whVar.oo();
        if (oo > 0) {
            this.pcc.postDelayed(new com.bytedance.adsdk.ugeno.qf.ork(new Runnable() { // from class: com.bytedance.adsdk.ugeno.oo.vy.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.d("GesThrough_UGEveFacade", "trigger on.name is " + str + " and delay time is up " + oo);
                    if (vy.this.wh != null) {
                        vy.this.wh.pcc(gmVar, str, list);
                    }
                    vy.this.pcc(str, (List<wh.pcc>) list);
                }
            }), oo);
            return;
        }
        com.bytedance.adsdk.ugeno.core.vj vjVar = this.wh;
        if (vjVar != null) {
            vjVar.pcc(gmVar, str, list);
        }
        pcc(str, list);
    }

    public static vy pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str) {
        com.bytedance.adsdk.ugeno.oo.oo.gm pcc2;
        if (gmVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                pcc pccVar = new pcc(new HashMap(), new HashMap(), new HashMap());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && (pcc2 = gm.pcc.pcc(gmVar.vh().getContext(), gmVar, optJSONObject, gmVar.tmg())) != null) {
                        if (pccVar.pcc.containsKey(pcc2.oo())) {
                            List<com.bytedance.adsdk.ugeno.oo.oo.gm> list = pccVar.pcc.get(pcc2.oo());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(pcc2);
                                pccVar.pcc.put(pcc2.oo(), arrayList);
                                pccVar.sf.put(pcc2.wh(), arrayList);
                            } else {
                                list.add(pcc2);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(pcc2);
                            pccVar.pcc.put(pcc2.oo(), arrayList2);
                            pccVar.sf.put(pcc2.wh(), arrayList2);
                        }
                        pccVar.gm.put(pcc2.vj(), pcc2);
                    }
                }
                return new vy(gmVar, pccVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static class pcc {
        public Map<String, com.bytedance.adsdk.ugeno.oo.oo.gm> gm;
        public Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> pcc;
        public Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> sf;

        public pcc(Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map, Map<String, com.bytedance.adsdk.ugeno.oo.oo.gm> map2, Map<String, List<com.bytedance.adsdk.ugeno.oo.oo.gm>> map3) {
            this.pcc = map;
            this.gm = map2;
            this.sf = map3;
        }
    }
}

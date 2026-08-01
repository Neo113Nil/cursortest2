package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.component.reward.pcc.vj;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh {
    private final com.bytedance.sdk.openadsdk.core.gm.vj gm;
    private final sf pcc;
    private final com.bytedance.sdk.openadsdk.core.gm.sf sf;

    public vh(sf sfVar) {
        this.pcc = sfVar;
        this.gm = pcc(sfVar, sfVar.sf);
        this.sf = new com.bytedance.sdk.openadsdk.core.gm.sf(sfVar.rnn, sfVar.sf, sfVar.vj, sfVar.oo ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                try {
                    vh.this.pcc(view, f, f2, f3, f4, sparseArray, this.mk, this.jsj, this.tsz);
                } catch (Exception e) {
                    lo.gm("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(vh.this.pcc.sf, 9);
                vh.this.pcc.fum.iv();
            }
        };
    }

    public void pcc() {
        of ofVar;
        if (qf() || (ofVar = this.pcc.sf) == null || ofVar.iv()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject kj = kj();
        boolean z = false;
        int i = -1;
        try {
            if (this.pcc.gm()) {
                if (kj == null) {
                    kj = new JSONObject();
                }
                int pcc = this.pcc.pcc();
                if (1001 == pcc) {
                    jSONObject.put("dynamic_show_type", pcc + this.pcc.sf());
                } else {
                    jSONObject.put("dynamic_show_type", pcc);
                }
            } else if (this.pcc.sf.wh() && this.pcc.yt != null && this.pcc.sf.ei() == 2) {
                jSONObject.put("dynamic_show_type", this.pcc.yt.vh());
                this.pcc.yt.pcc(jSONObject);
                i = this.pcc.yt.vh();
                z = true;
            }
        } catch (JSONException e) {
            Log.e("TTAD.RFReportManager", "Inject render fail info to pagJsonData failed", e);
        }
        pcc(jSONObject, kj, z, i, true);
    }

    private boolean qf() {
        sf sfVar = this.pcc;
        if (sfVar == null) {
            return true;
        }
        return (sfVar.ywp != null && this.pcc.ywp.rj().jsj()) && !this.pcc.ri && (this.pcc.ywp != null && !this.pcc.ywp.se());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject kj() {
        if (!this.pcc.gdh || this.pcc.ywp == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc.ywp.vh + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, boolean z2) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        of ofVar = this.pcc.sf;
        if (this.pcc.vr && this.pcc.bg == 5) {
            ofVar.hc(this.pcc.bg);
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.pcc.vj, jSONObject, jSONObject2);
        this.pcc.tsx.ork();
        if (!z) {
            i = -1;
        }
        vj.pcc pccVar = new vj.pcc(i);
        pcc(pccVar);
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.pcc.rnn.findViewById(R.id.content), ofVar, pccVar);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(ofVar);
        if (!z2 || (gto = ofVar.gto()) == null) {
            return;
        }
        gto.pcc().pcc(0L);
    }

    public void sf() {
        if (qf()) {
            return;
        }
        of ofVar = this.pcc.sf;
        if (ofVar == null || !ofVar.iv()) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            int i = -1;
            try {
                if (this.pcc.sf.wh() && this.pcc.yt != null && this.pcc.sf.ei() == 2) {
                    jSONObject.put("dynamic_show_type", this.pcc.yt.vh());
                    this.pcc.yt.pcc(jSONObject);
                    i = this.pcc.yt.vh();
                    z = true;
                }
                View findViewById = this.pcc.rnn.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", findViewById.getWidth());
                jSONObject2.put("height", findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                lo.pcc("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            pcc(jSONObject, kj(), z, i, false);
        }
    }

    public void pcc(final Map<String, Object> map) {
        if (qf()) {
            return;
        }
        of ofVar = this.pcc.sf;
        if (ofVar == null || !ofVar.iv()) {
            final View findViewById = this.pcc.rnn.findViewById(R.id.content);
            if (findViewById == null) {
                findViewById = this.pcc.rnn.getWindow().getDecorView();
            }
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    int i;
                    Map map2;
                    JSONObject jSONObject;
                    sf unused = vh.this.pcc;
                    JSONObject jSONObject2 = null;
                    try {
                        if (map != null) {
                            jSONObject = new JSONObject(map);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        jSONObject2 = jSONObject;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("width", findViewById.getWidth());
                        jSONObject3.put("height", findViewById.getHeight());
                        jSONObject3.put("alpha", findViewById.getAlpha());
                        jSONObject2.put("root_view", jSONObject3.toString());
                    } catch (Throwable th) {
                        lo.pcc("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject4 = jSONObject2;
                    if (vh.this.pcc.yt == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z = false;
                        i = -1;
                    } else {
                        i = vh.this.pcc.yt.vh();
                        z = true;
                    }
                    vh vhVar = vh.this;
                    vhVar.pcc(jSONObject4, vhVar.kj(), z, i, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    findViewById.post(runnable);
                    return;
                }
            }
            findViewById.post(runnable);
        }
    }

    private void pcc(vj.pcc pccVar) {
        if (!this.pcc.gdh || this.pcc.ywp == null) {
            return;
        }
        pccVar.sf = this.pcc.ywp.vh;
    }

    public void pcc(boolean z) {
        if (this.pcc.sf == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.pcc.oo vj = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(z ? 7 : 8).gm(String.valueOf(this.pcc.sf.kot())).vj(this.pcc.sf.qxv());
        vj.sf(this.pcc.ye.lu()).wh(this.pcc.ye.gpj());
        vj.qf(this.pcc.sf.hl()).oo(this.pcc.sf.esn());
        com.bytedance.sdk.openadsdk.dax.oo.pcc().sf(vj);
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj gm() {
        this.gm.sf(this.pcc.rnn.findViewById(R.id.content));
        if (this.pcc.tz.gm() != null) {
            this.gm.pcc(this.pcc.tz.gm());
        }
        this.pcc.of.pcc(this.gm);
        this.gm.pcc(new pcc.InterfaceC0150pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0150pcc
            public long getVideoProgress() {
                return vh.this.pcc.fum.hc();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.vh vhVar = this.pcc.mu;
        com.bytedance.sdk.openadsdk.core.gm.vj vjVar = this.gm;
        vhVar.pcc(vjVar, vjVar, this.sf);
        this.pcc.pq.pcc(this.gm);
        if (com.bytedance.sdk.openadsdk.core.model.lo.hc(this.pcc.sf) && this.pcc.zti.pcc != null && this.pcc.zti.pcc.getITopLayout() != null) {
            rj.pcc(this.pcc.zti.pcc.getITopLayout(), (View.OnClickListener) this.sf, "LandPage#TopLayoutEmptyClick");
        }
        return this.gm;
    }

    public com.bytedance.sdk.openadsdk.core.gm.sf oo() {
        return this.sf;
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj vj() {
        return this.gm;
    }

    public void sf(boolean z) {
        sf sfVar = this.pcc;
        if (sfVar == null) {
            return;
        }
        if (!z && sfVar.qcw > 0 && this.pcc.sf != null && this.pcc.sf.iv()) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(String.valueOf(SystemClock.elapsedRealtime() - this.pcc.qcw), this.pcc.sf, this.pcc.vj, this.pcc.fum.vj());
            this.pcc.qcw = 0L;
        } else {
            this.pcc.qcw = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.pcc.sf, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(this.pcc.sf, z ? 4 : 8);
    }

    public void wh() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        try {
            if (this.pcc.vy.get()) {
                if (!this.pcc.ye.gm()) {
                    if (this.pcc.lq.oo()) {
                        i = 3;
                    } else {
                        i = this.pcc.ye.oo() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.pcc.sf, this.pcc.vj, "click_close", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.qf) {
            pcc("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.wh || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.vy) {
            pcc("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.vj) {
            pcc("click_play_source", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.oo) {
            pcc("click_play_logo", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.gbb || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.gga || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.lu) {
            pcc("click_start_play_bar", ork());
        } else if (view.getId() == 520093705) {
            pcc("click_start_play", ork());
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.hc) {
            pcc("click_video", ork());
        } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.ork) {
            pcc("fallback_endcard_click", ork());
        }
        sf(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    private void sf(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3) {
        if (!vy() || this.pcc.sf == null || view == null) {
            return;
        }
        boolean z = com.bytedance.sdk.openadsdk.core.model.lo.hc(this.pcc.sf) && (view instanceof TopLayoutDislike2) && this.pcc.zti.pcc.getITopLayout() == view;
        int id = view.getId();
        if (z || id == com.bytedance.sdk.openadsdk.utils.nac.qf || id == com.bytedance.sdk.openadsdk.utils.nac.wh || id == com.bytedance.sdk.openadsdk.utils.nac.vj || id == com.bytedance.sdk.openadsdk.utils.nac.oo || id == com.bytedance.sdk.openadsdk.utils.nac.gbb || id == com.bytedance.sdk.openadsdk.utils.nac.gga || id == com.bytedance.sdk.openadsdk.utils.nac.lu || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.nac.hc || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.nac.vy) {
            int ork = rj.ork(com.bytedance.sdk.openadsdk.core.lu.pcc());
            com.bytedance.sdk.openadsdk.core.model.tmg pcc = new tmg.pcc().wh(f).vj(f2).oo(f3).gm(f4).sf(System.currentTimeMillis()).pcc(0L).pcc(rj.pcc(this.pcc.mu.tmg())).sf(rj.gm(this.pcc.mu.tmg())).oo(i2).vj(i3).wh(i).pcc(sparseArray).sf(com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2).gm(ork).pcc(rj.kj(com.bytedance.sdk.openadsdk.core.lu.pcc())).sf(rj.vy(com.bytedance.sdk.openadsdk.core.lu.pcc())).pcc();
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.pcc.fum.hc()));
            String str = this.pcc.vj;
            if (z) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click_other", this.pcc.sf, pcc, str, true, (Map<String, Object>) hashMap, -1);
        }
    }

    private boolean vy() {
        return this.pcc.sf != null && this.pcc.sf.rc() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, JSONObject jSONObject) {
        of ofVar = this.pcc.sf;
        String str2 = this.pcc.vj;
        if (!this.pcc.oo) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str2, str, jSONObject);
    }

    private JSONObject ork() {
        try {
            long of = this.pcc.fum.of();
            int yt = this.pcc.fum.yt();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, of);
                jSONObject.put("percent", yt);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void gm(boolean z) {
        sf sfVar = this.pcc;
        if (sfVar != null && z && sfVar.sf.qap() && !this.pcc.sf.tsz()) {
            this.pcc.sf.qf(true);
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc.sf, this.pcc.vj, this.pcc.sf.uij());
        }
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj pcc(final sf sfVar, final of ofVar) {
        return new com.bytedance.sdk.openadsdk.core.gm.vj(sfVar.rnn, ofVar, sfVar.vj, sfVar.oo ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.4
            @Override // com.bytedance.sdk.openadsdk.core.gm.vj
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, boolean z) {
                if (ofVar.on() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        pcc((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(sfVar.fum.hc()));
                if (sfVar.vy.get()) {
                    hashMap.put("click_scence", 2);
                } else {
                    hashMap.put("click_scence", 1);
                }
                if (sfVar.ywp != null) {
                    sfVar.ywp.pcc(hashMap, f, f2);
                }
                pcc(hashMap);
                sfVar.tsx.pq();
                sfVar.tz.pcc(view, f, f2, f3, f4, sparseArray, i, i2, i3, new vj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.vj.pcc
                    public void pcc(String str, JSONObject jSONObject) {
                        vh.this.pcc(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.vj.pcc
                    public void pcc(View view2, float f5, float f6, float f7, float f8, SparseArray<gm.pcc> sparseArray2, int i4, int i5, int i6) {
                        vh.this.pcc(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(ofVar, 9);
                sfVar.fum.iv();
            }
        };
    }
}

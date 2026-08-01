package com.bytedance.sdk.openadsdk.core.gm;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf extends gm {
    private static int pq = Integer.MIN_VALUE;
    protected Map<String, Object> dax;
    protected boolean gbb;
    private boolean gm;
    protected int gpj;
    protected com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm hc;
    protected com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm jr;
    protected final int kj;
    protected com.bytedance.sdk.openadsdk.core.ork.sf lu;
    protected com.bytedance.sdk.openadsdk.core.oo.pcc nac;
    protected Context oo;
    protected tmg ork;
    private String pcc;
    protected final String qf;
    private WeakReference<Activity> sf;
    protected PAGNativeAd tmg;
    protected pcc vh;
    public dax vj;
    protected WeakReference<View> vy;
    protected final of wh;

    public interface pcc {
        void pcc(View view, int i);
    }

    public boolean pcc(tmg tmgVar, Map<String, Object> map) {
        return false;
    }

    public void pcc(com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar) {
        this.jr = gmVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.ork.sf sfVar) {
        this.lu = sfVar;
    }

    public void pcc(PAGNativeAd pAGNativeAd) {
        this.tmg = pAGNativeAd;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.oo.pcc pccVar) {
        this.nac = pccVar;
    }

    public void vj(boolean z) {
        this.gbb = z;
    }

    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar) {
        this.hc = gmVar;
    }

    public sf(Context context, of ofVar, String str, int i) {
        this.gbb = false;
        this.gpj = 0;
        this.gm = false;
        this.oo = context;
        this.wh = ofVar;
        this.qf = str;
        this.kj = i;
    }

    public sf(Context context, of ofVar, String str, int i, boolean z) {
        this(context, ofVar, str, i);
        this.gm = z;
    }

    public void pcc(pcc pccVar) {
        this.vh = pccVar;
    }

    public void pcc(Activity activity) {
        if (activity == null) {
            return;
        }
        this.sf = new WeakReference<>(activity);
    }

    public void sf(View view) {
        if (view == null) {
            return;
        }
        this.vy = new WeakReference<>(view);
    }

    public View oo() {
        WeakReference<Activity> weakReference = this.sf;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.sf.get().findViewById(R.id.content);
    }

    public void pcc(Map<String, Object> map) {
        Map<String, Object> map2 = this.dax;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.dax);
        }
        this.dax = map;
    }

    public void pcc(int i) {
        this.mk = i;
    }

    public void sf(int i) {
        this.tsz = i;
    }

    public void gm(int i) {
        this.jsj = i;
    }

    public void oo(int i) {
        this.gpj = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.gm
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        int i;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
        if (this.oo == null) {
            this.oo = lu.pcc();
        }
        if ((this.gm || !pcc(view, 1, f, f2, f3, f4, sparseArray, z)) && this.oo != null) {
            dax daxVar = this.vj;
            if (daxVar != null) {
                i = daxVar.kj;
                jSONObject = this.vj.vy;
                jSONObject2 = this.vj.hc;
                z2 = this.vj.gbb;
            } else {
                i = -1;
                z2 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.yt;
            long j2 = this.qy;
            WeakReference<View> weakReference = this.vy;
            tmg pcc3 = pcc(f, f2, f3, f4, sparseArray, j, j2, weakReference == null ? null : weakReference.get(), vj(), rj.kj(this.oo), rj.ork(this.oo), rj.vy(this.oo), i, jSONObject, jSONObject2);
            this.ork = pcc3;
            if (pcc(pcc3, this.dax)) {
                return;
            }
            if (this.hc != null) {
                if (this.dax == null) {
                    this.dax = new HashMap();
                }
                this.dax.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.hc.wh()));
            }
            of ofVar = this.wh;
            if (this.gm || z2) {
                com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, true, this.dax, z ? 1 : 2);
                com.bytedance.sdk.openadsdk.core.model.oo gto = ofVar.gto();
                if (gto == null || ofVar.on() || (pcc2 = gto.pcc()) == null) {
                    return;
                }
                com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.hc;
                pcc2.qf(gmVar != null ? gmVar.wh() : 0L);
                return;
            }
            pcc pccVar = this.vh;
            if (pccVar != null) {
                pccVar.pcc(view, -1);
            }
            if (pcc(view, z)) {
                boolean sf = atb.sf(ofVar);
                String pcc4 = sf ? this.qf : kun.pcc(this.kj);
                if (view != null) {
                    try {
                        if (Boolean.TRUE.equals(view.getTag(520093762))) {
                            rnn.pcc(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity pcc5 = view != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
                boolean pcc6 = rnn.pcc(pcc5 == null ? this.oo : pcc5, ofVar, this.kj, this.tmg, this.nac, pcc4, this.jr, sf, 0);
                rnn.pcc(false);
                if (pcc6 || ofVar == null || ofVar.dt() == null || ofVar.dt().gm() != 2) {
                    if (ofVar != null && !pcc6 && TextUtils.isEmpty(ofVar.xy()) && com.bytedance.sdk.openadsdk.oo.sf.pcc(this.qf)) {
                        com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.oo, this.qf).pcc(ofVar);
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, pcc6, this.dax, z ? 1 : 2);
                }
            }
        }
    }

    public boolean pcc(View view, boolean z) {
        return pcc(view, this.wh, z);
    }

    public static boolean pcc(View view, of ofVar, boolean z) {
        if (view != null && ofVar != null) {
            try {
                String valueOf = String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.lo));
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.lo) != null && !TextUtils.isEmpty(valueOf)) {
                    if ("click".equals(valueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (gm(view)) {
                return ofVar.gh() != 1 || z;
            }
            if (ofVar.tmh() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    protected tmg pcc(float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        return new tmg.pcc().wh(f).vj(f2).oo(f3).gm(f4).sf(j).pcc(j2).pcc(rj.pcc(view)).sf(rj.gm(view)).oo(this.jsj).vj(this.tsz).wh(this.mk).pcc(sparseArray).sf(ork.sf().pcc() ? 1 : 2).pcc(str).pcc(f5).gm(i).sf(f6).pcc(i2).pcc(jSONObject).sf(jSONObject2).pcc();
    }

    protected boolean pcc(View view, int i, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        if (this.lu == null) {
            return false;
        }
        this.lu.pcc(view, i, new dax.pcc().oo(f).gm(f2).sf(f3).pcc(f4).sf(this.yt).pcc(this.qy).pcc(sparseArray).pcc(z).pcc());
        return true;
    }

    public static boolean gm(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || pcc(view.getContext()) == view.getId() || nac.ofe == view.getId() || nac.edk == view.getId();
    }

    private static int pcc(Context context) {
        if (pq == Integer.MIN_VALUE) {
            pq = tz.vj(context, "btn_native_creative");
        }
        return pq;
    }

    public String vj() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }
}

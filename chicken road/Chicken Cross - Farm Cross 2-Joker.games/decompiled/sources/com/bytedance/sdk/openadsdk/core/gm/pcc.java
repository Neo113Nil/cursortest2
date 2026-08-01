package com.bytedance.sdk.openadsdk.core.gm;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.gm.kj;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.core.model.vy;
import com.bytedance.sdk.openadsdk.core.ork.fum;
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
public class pcc extends sf {
    private boolean gm;
    private boolean mu;
    private int nn;
    private boolean pcc;
    private WeakReference<InterfaceC0150pcc> pq;
    private boolean sf;

    /* renamed from: com.bytedance.sdk.openadsdk.core.gm.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0150pcc {
        long getVideoProgress();
    }

    public boolean gm() {
        return false;
    }

    public boolean sf() {
        return false;
    }

    public pcc(Context context, of ofVar, String str, int i) {
        super(context, ofVar, str, i);
        this.pcc = true;
        this.sf = false;
        this.gm = false;
        this.mu = false;
    }

    public void pcc(boolean z) {
        this.pcc = z;
    }

    public void sf(boolean z) {
        this.sf = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        String str;
        com.bytedance.sdk.openadsdk.core.gbb.pcc ibs;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        JSONObject jSONObject;
        boolean z2;
        int i;
        JSONObject jSONObject2;
        View view2;
        Object obj;
        Activity pcc2;
        boolean z3;
        if (pcc(view, 2, f, f2, f3, f4, sparseArray, z)) {
            return;
        }
        of ofVar = this.wh;
        ofVar.jr(true);
        ofVar.hu();
        if (!ofVar.lo()) {
            ofVar.oo(true);
        }
        if (of.vj(ofVar)) {
            if (kj.pcc(ofVar) && this.vj != null) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.qf, this.vj.nac);
            } else {
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.qf, ofVar.zex());
            }
        }
        if (this.hc != null) {
            if (this.dax == null) {
                this.dax = new HashMap();
            }
            this.dax.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.hc.wh()));
        }
        int apl = ofVar.apl();
        ofVar.zsj(0);
        if (this.jr != null) {
            this.jr.pcc(apl > 0 ? apl : 0);
        }
        if (this.dax != null) {
            this.dax.remove("dsp_click_type");
            this.dax.remove("click_probability_jump");
            this.dax.remove("auto_click");
        }
        boolean on = ofVar.on();
        if (apl > 0) {
            if (this.dax == null) {
                this.dax = new HashMap();
            }
            if (on && apl < 11) {
                this.dax.put("dsp_click_type", Integer.valueOf(apl));
            }
            if (apl >= 11 && ofVar.fg() == 0) {
                this.dax.put("click_probability_jump", Integer.valueOf(vy.pcc(apl)));
            }
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = ofVar.gto();
        if (on || gto != null) {
            WeakReference<InterfaceC0150pcc> weakReference = this.pq;
            long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.pq.get().getVideoProgress();
            if (!on && gto != null && (pcc = gto.pcc()) != null) {
                pcc.qf(videoProgress);
            }
            if (on) {
                if (view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        str = (String) tag;
                        ibs = ofVar.ibs();
                        if (ibs != null) {
                            ibs.vj(str);
                            if (!TextUtils.isEmpty(str)) {
                                pcc(str);
                            }
                            if ("VAST_ICON".equals(str)) {
                                com.bytedance.sdk.openadsdk.core.gbb.sf sf = ibs.sf();
                                if (sf != null) {
                                    sf.pcc(videoProgress);
                                }
                            } else if ("VAST_END_CARD".equals(str)) {
                                com.bytedance.sdk.openadsdk.core.gbb.gm gm = ibs.gm();
                                if (gm != null) {
                                    gm.pcc(videoProgress);
                                }
                            } else {
                                com.bytedance.sdk.openadsdk.core.gbb.oo pcc3 = ibs.pcc();
                                if (pcc3 != null) {
                                    pcc3.qf(videoProgress);
                                }
                            }
                        }
                    }
                }
                str = "VAST_ACTION_BUTTON";
                ibs = ofVar.ibs();
                if (ibs != null) {
                }
            }
        }
        if (vy() && oo(view) && !this.gm) {
            super.pcc(view, f, f2, f3, f4, sparseArray, z);
            return;
        }
        if (this.oo == null) {
            this.oo = lu.pcc();
        }
        if (this.oo == null || !pcc(view, z)) {
            return;
        }
        JSONObject pcc4 = fum.pcc(view);
        if (this.vj != null) {
            i = this.vj.kj;
            jSONObject = this.vj.vy;
            jSONObject2 = this.vj.hc;
            z2 = this.vj.gbb;
        } else {
            jSONObject = pcc4;
            z2 = false;
            i = -1;
            jSONObject2 = null;
        }
        int i2 = 1;
        this.ork = pcc(f, f2, f3, f4, sparseArray, this.yt, this.qy, this.vy == null ? oo() : this.vy.get(), vj(), rj.kj(this.oo), rj.ork(this.oo), rj.vy(this.oo), i, jSONObject, jSONObject2);
        if (z2) {
            tmg tmgVar = this.ork;
            String str2 = this.qf;
            Map<String, Object> map = this.dax;
            if (!z) {
                i2 = 2;
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, tmgVar, str2, true, map, i2);
            return;
        }
        int az = ofVar.az();
        if (az != 2 && az != 3) {
            if (az != 4) {
                if (az == 5) {
                    String sf2 = sf(this.qf);
                    if (!TextUtils.isEmpty(sf2)) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc("click_call", ofVar, this.ork, sf2, true, this.dax, z ? 1 : 2);
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, kun.sf(view.getContext(), ofVar.ln()), this.dax, z ? 1 : 2);
                    view2 = view;
                } else if (az != 8) {
                    view2 = view;
                    az = -1;
                }
            } else if (atb.sf(ofVar) && (this.tmg != null || this.nac != null)) {
                view2 = view;
                pcc2 = view2 != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
                boolean pcc5 = rnn.pcc(pcc2 == null ? this.oo : pcc2, ofVar, this.kj, this.tmg, this.nac, this.qf, this.jr, true, apl);
                if (this.pcc) {
                    com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, pcc5, this.dax, z ? 1 : 2);
                }
            } else {
                view2 = view;
                if (this.jr != null) {
                    this.jr.pcc(ofVar);
                    Map<String, Object> map2 = this.dax;
                    if (ofVar.lo() && !ofVar.gpj()) {
                        map2.put("auto_click", Boolean.TRUE);
                        ofVar.vj(false);
                    }
                    if (this.pcc) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, true, map2, z ? 1 : 2);
                    }
                }
            }
            if (this.vh != null) {
                this.vh.pcc(view2, az);
                return;
            }
            return;
        }
        view2 = view;
        if (az == 3) {
            String xy = ofVar.xy();
            if (!TextUtils.isEmpty(xy) && xy.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(this.oo, xy, xy.substring(xy.indexOf("?id=") + 4), this.qf, ofVar)) {
                    if (this.pcc) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, true, this.dax, z ? 1 : 2);
                    }
                    if (this.vh != null) {
                    }
                }
            }
        }
        if (this.tmg != null || this.sf) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click_button", ofVar, this.ork, this.qf, true, this.dax, z ? 1 : 2);
        }
        if (view2 != null) {
            try {
                obj = view2.getTag(520093762);
            } catch (Exception unused) {
            }
        } else {
            obj = null;
        }
        if ((view2 != null && (view.getId() == 520093726 || (view2 instanceof com.bytedance.sdk.openadsdk.core.jr.sf.wh))) || Boolean.TRUE.equals(obj)) {
            rnn.pcc(true);
        }
        pcc2 = view2 != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
        Context context = pcc2 == null ? this.oo : pcc2;
        if (lo.gm(ofVar) && this.mu) {
            z3 = false;
        } else {
            boolean pcc6 = rnn.pcc(context, ofVar, this.kj, this.tmg, this.nac, this.qf, this.jr, true, apl);
            ofVar.wh(SystemClock.elapsedRealtime());
            rnn.pcc(false);
            z3 = pcc6;
        }
        if (this.pcc) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, this.qf, z3, this.dax, z ? 1 : 2);
        }
        if (this.vh != null) {
        }
    }

    protected boolean pcc() {
        of ofVar = this.wh;
        if (ofVar == null) {
            return true;
        }
        int sf = lu.oo().sf(ofVar.kot());
        int gm = com.bytedance.sdk.component.utils.lu.gm(lu.pcc());
        if (sf == 1) {
            return kun.oo(gm);
        }
        if (sf == 2) {
            return kun.vj(gm) || kun.oo(gm) || kun.wh(gm);
        }
        if (sf != 3) {
            return sf != 5 || kun.oo(gm) || kun.wh(gm);
        }
        return false;
    }

    private boolean qf() {
        of ofVar = this.wh;
        return of.vj(ofVar) && ofVar.ra() == 1;
    }

    private boolean oo(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.jr.sf.wh) || view.getId() == nac.eko || view.getId() == nac.lrr || view.getId() == nac.iv || view.getId() == nac.xb || view.getId() == nac.ri || view.getId() == 520093726 || view.getId() == nac.bgf) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return false;
            }
            if (oo(viewGroup.getChildAt(i))) {
                return true;
            }
            i++;
        }
    }

    private boolean kj() {
        return this instanceof com.bytedance.sdk.openadsdk.core.ork.vy;
    }

    private boolean vy() {
        of ofVar = this.wh;
        if (ofVar == null || kj()) {
            return false;
        }
        if (ofVar.ct() != 5 && ofVar.ct() != 15) {
            return false;
        }
        if (this.nn == 0) {
            this.nn = ofVar.hh();
        }
        sf();
        pcc();
        gm();
        if (this.nn == 5 && qf() && pcc() && !sf() && !gm()) {
            return false;
        }
        int i = this.nn;
        return i == 1 || i == 2 || i == 5;
    }

    private String sf(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void gm(boolean z) {
        this.gm = z;
    }

    public void pcc(InterfaceC0150pcc interfaceC0150pcc) {
        this.pq = new WeakReference<>(interfaceC0150pcc);
    }

    public void oo(boolean z) {
        this.mu = z;
    }

    public void pcc(View view) {
        pcc(view, this.lo, this.fum, this.tz, this.of, this.zti, this.ye);
    }
}

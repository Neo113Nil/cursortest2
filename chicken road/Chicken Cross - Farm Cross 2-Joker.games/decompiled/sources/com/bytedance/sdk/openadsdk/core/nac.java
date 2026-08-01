package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.kj;
import com.bytedance.sdk.openadsdk.utils.lrr;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class nac {
    private com.bytedance.sdk.openadsdk.core.gm.pcc gbb;
    private final Context gm;
    private com.bytedance.sdk.openadsdk.core.gm.sf hc;
    private long kj;
    private final PAGNativeAd oo;
    private final com.bytedance.sdk.openadsdk.pcc.sf.pcc ork;
    private final com.bytedance.sdk.openadsdk.core.model.of pcc;
    private com.bytedance.sdk.openadsdk.pcc.sf.wh qf;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm sf;
    private com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm vh;
    private final String wh;
    private List<View> vj = new ArrayList();
    private final com.bytedance.sdk.openadsdk.oo.qf vy = new com.bytedance.sdk.openadsdk.oo.qf();
    private final AtomicBoolean tmg = new AtomicBoolean(false);

    public com.bytedance.sdk.openadsdk.oo.qf pcc() {
        return this.vy;
    }

    public nac(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar) {
        this.oo = pAGNativeAd;
        this.pcc = ofVar;
        this.gm = context;
        this.wh = str;
        this.ork = pccVar;
        if (ofVar.az() == 4) {
            this.sf = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(context, str);
        }
    }

    public void pcc(View view, int i) {
        com.bytedance.sdk.openadsdk.pcc.sf.wh whVar = this.qf;
        if (whVar != null) {
            whVar.onAdClicked();
        }
    }

    public void pcc(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.pcc.sf.wh whVar) {
        sf(viewGroup, list, list2, list3, whVar);
        pcc(viewGroup);
        pcc(viewGroup, list2, list3);
    }

    private void sf(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.pcc.sf.wh whVar) {
        this.qf = whVar;
        viewGroup.addOnLayoutChangeListener(new pcc(this.vy, viewGroup));
        this.vj = list;
        pcc(list2, (com.bytedance.sdk.openadsdk.core.gm.gm) null);
        if (list != null) {
            for (View view : this.vj) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        pcc(list3, (com.bytedance.sdk.openadsdk.core.gm.gm) null);
    }

    private void pcc(List<View> list, com.bytedance.sdk.openadsdk.core.gm.gm gmVar) {
        if (com.bytedance.sdk.component.utils.hc.sf(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(gmVar);
                    view.setOnTouchListener(gmVar);
                }
            }
        }
    }

    private kj gm(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.pcc.sf.wh whVar) {
        this.qf = whVar;
        viewGroup.addOnLayoutChangeListener(new pcc(this.vy, viewGroup));
        this.vj = list;
        kj vj = vj(viewGroup);
        if (vj == null) {
            vj = new kj(this.gm, viewGroup, false);
            viewGroup.addView(vj);
        }
        vj.pcc();
        vj.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.vj) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        vj.setRefCreativeViews(list3);
        return vj;
    }

    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar) {
        this.vh = gmVar;
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = this.hc;
        if (sfVar != null) {
            sfVar.pcc(gmVar);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.gbb;
        if (pccVar != null) {
            pccVar.pcc(gmVar);
        }
    }

    private static class pcc implements View.OnLayoutChangeListener {
        private final com.bytedance.sdk.openadsdk.oo.qf pcc;
        private final ViewGroup sf;

        public pcc(com.bytedance.sdk.openadsdk.oo.qf qfVar, ViewGroup viewGroup) {
            this.pcc = qfVar;
            this.sf = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.pcc.pcc(System.currentTimeMillis(), nn.pcc(this.sf));
        }
    }

    private void pcc(ViewGroup viewGroup) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        Context pcc2 = viewGroup != null ? com.bytedance.sdk.component.utils.sf.pcc(viewGroup) : null;
        if (pcc2 == null) {
            pcc2 = this.gm;
        }
        if (this.pcc.ei() == 2) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar = this.pcc;
            String str = this.wh;
            this.hc = new com.bytedance.sdk.openadsdk.core.ork.ork(pcc2, ofVar, str, com.bytedance.sdk.openadsdk.utils.kun.pcc(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.pcc;
            String str2 = this.wh;
            this.hc = new com.bytedance.sdk.openadsdk.core.gm.sf(pcc2, ofVar2, str2, com.bytedance.sdk.openadsdk.utils.kun.pcc(str2));
        }
        this.hc.sf(viewGroup);
        this.hc.pcc(this.vh);
        this.hc.pcc(this.sf);
        this.hc.pcc(this.oo);
        this.hc.pcc(hashMap);
        this.hc.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.nac.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                if (nac.this.qf != null) {
                    nac.this.qf.onAdClicked();
                }
            }
        });
        if (this.pcc.ei() == 2) {
            Context context = this.gm;
            com.bytedance.sdk.openadsdk.core.model.of ofVar3 = this.pcc;
            String str3 = this.wh;
            this.gbb = new com.bytedance.sdk.openadsdk.core.ork.vy(context, ofVar3, str3, com.bytedance.sdk.openadsdk.utils.kun.pcc(str3));
        } else {
            Context context2 = this.gm;
            com.bytedance.sdk.openadsdk.core.model.of ofVar4 = this.pcc;
            String str4 = this.wh;
            this.gbb = new com.bytedance.sdk.openadsdk.core.gm.pcc(context2, ofVar4, str4, com.bytedance.sdk.openadsdk.utils.kun.pcc(str4));
        }
        this.gbb.sf(viewGroup);
        this.gbb.pcc(this.vh);
        this.gbb.pcc(this.sf);
        this.gbb.pcc(this.oo);
        this.gbb.pcc(hashMap);
        this.gbb.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.nac.2
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                if (nac.this.qf != null) {
                    nac.this.qf.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(nac.this.pcc, 9);
                nac.this.ork.hc();
            }
        });
    }

    private void pcc(ViewGroup viewGroup, kj kjVar, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = this.hc;
        if (sfVar == null || this.gbb == null) {
            return;
        }
        kjVar.pcc(list, sfVar);
        kjVar.pcc(list2, this.gbb);
        pcc(this.hc, this.gbb);
        pcc(kjVar, viewGroup);
    }

    private void pcc(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = this.hc;
        if (sfVar == null || this.gbb == null) {
            return;
        }
        pcc(list, sfVar);
        pcc(list2, this.gbb);
        pcc(this.hc, this.gbb);
        sf(viewGroup);
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gm.sf sfVar, com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        if (this.pcc.ei() == 2) {
            sf(sfVar, pccVar);
        } else {
            pcc(pccVar);
        }
    }

    private void sf(com.bytedance.sdk.openadsdk.core.gm.sf sfVar, com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar2 = this.ork;
        if (pccVar2 != null && pccVar2.sf() != null) {
            com.bytedance.sdk.openadsdk.core.ork.fum sf = this.ork.sf();
            if ((sfVar instanceof com.bytedance.sdk.openadsdk.core.ork.ork) && (pccVar instanceof com.bytedance.sdk.openadsdk.core.ork.vy)) {
                sf.setClickListener((com.bytedance.sdk.openadsdk.core.ork.ork) sfVar);
                sf.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.ork.vy) pccVar);
            }
            sf.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.core.nac.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.vj
                public void pcc() {
                    if (nac.this.qf != null) {
                        nac.this.qf.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar3 = this.ork;
        if (pccVar3 != null && pccVar3.pcc() != null) {
            this.ork.pcc().setOnClickListener(pccVar);
            this.ork.pcc().setOnTouchListener(pccVar);
        }
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar4 = this.ork;
        if (pccVar4 != null) {
            pccVar4.pcc(pccVar);
            this.ork.pcc(sfVar);
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().oo(String.valueOf(this.pcc.kot()))) {
            com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar2 = this.ork;
            if (pccVar2 != null && pccVar2.pcc() != null) {
                this.ork.pcc().setOnClickListener(pccVar);
                this.ork.pcc().setOnTouchListener(pccVar);
            }
            com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar3 = this.ork;
            if (pccVar3 != null) {
                pccVar3.pcc(pccVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar4 = this.ork;
        if (pccVar4 != null && pccVar4.pcc() != null) {
            PAGMediaView pcc2 = this.ork.pcc();
            com.bytedance.sdk.openadsdk.core.gm.gm gmVar = new com.bytedance.sdk.openadsdk.core.gm.gm() { // from class: com.bytedance.sdk.openadsdk.core.nac.4
                @Override // com.bytedance.sdk.openadsdk.core.gm.gm
                protected void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pcc2.setOnClickListener(gmVar);
            pcc2.setOnTouchListener(gmVar);
        }
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar5 = this.ork;
        if (pccVar5 != null) {
            pccVar5.pcc((com.bytedance.sdk.openadsdk.core.gm.pcc) null);
        }
    }

    private void pcc(kj kjVar, final ViewGroup viewGroup) {
        kjVar.setCallback(new kj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.nac.5
            @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
            public void pcc(boolean z) {
                nac.this.pcc(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
            public void pcc() {
                nac.this.gm(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
            public void sf() {
                nac.this.sf();
            }

            @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
            public void pcc(View view) {
                nac.this.pcc(viewGroup, view);
            }
        });
    }

    private void sf(final ViewGroup viewGroup) {
        lrr.pcc(viewGroup, true, 5, false, new lrr.sf() { // from class: com.bytedance.sdk.openadsdk.core.nac.6
            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc(boolean z) {
                nac.this.pcc(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc() {
                nac.this.gm(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void sf() {
                nac.this.sf();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc(View view, boolean z) {
                if (!z) {
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(nac.this.pcc, 8);
                } else {
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(nac.this.pcc, 4);
                    nac.this.pcc(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z, ViewGroup viewGroup) {
        if (z && this.pcc.qap() && !this.pcc.tsz()) {
            this.pcc.qf(true);
            com.bytedance.sdk.openadsdk.core.model.of ofVar = this.pcc;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.wh, ofVar.uij());
        }
        if (!z && this.kj > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.kj);
            this.vy.pcc(System.currentTimeMillis(), nn.pcc(viewGroup));
            com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, this.pcc, this.wh, this.vy);
            this.kj = 0L;
            return;
        }
        this.vy.pcc(System.currentTimeMillis(), nn.pcc(viewGroup));
        this.kj = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(ViewGroup viewGroup) {
        this.vy.pcc(System.currentTimeMillis(), nn.pcc(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        if (this.kj > 0) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(String.valueOf(SystemClock.elapsedRealtime() - this.kj), this.pcc, this.wh, this.vy);
            this.kj = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(ViewGroup viewGroup, View view) {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
        if (this.tmg.get()) {
            return;
        }
        this.tmg.set(true);
        if (this.oo instanceof com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm) {
            com.bytedance.sdk.openadsdk.core.ork.fum sf = this.ork.sf();
            if (sf != null) {
                sf.gpj();
            }
            ((com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm) this.oo).pcc(true);
        }
        this.vy.pcc(System.currentTimeMillis(), nn.pcc(viewGroup));
        this.kj = SystemClock.elapsedRealtime();
        oo(viewGroup);
        com.bytedance.sdk.openadsdk.pcc.sf.wh whVar = this.qf;
        if (whVar != null) {
            whVar.pcc(this.oo);
        }
        if (this.pcc.qxq()) {
            com.bytedance.sdk.openadsdk.utils.kun.pcc(this.pcc, view);
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.pcc.gto();
        if (gto == null || (pcc2 = gto.pcc()) == null) {
            return;
        }
        pcc2.pcc(0L);
    }

    private void oo(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.vj != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.vj) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            if (this.ork.kj() != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", rj.gm(this.gm, r11.getWidth()) * 1.0f);
                    jSONObject4.put("height", rj.gm(this.gm, r11.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.ork.fum sf = this.ork.sf();
            if (sf != null && (ofVar = this.pcc) != null) {
                jSONObject.put("dynamic_show_type", ofVar.rt());
                sf.pcc(jSONObject, this.pcc);
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc, this.wh, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(this.pcc);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.pcc("InteractionManager", "onShowFun json error", e);
        }
    }

    private kj vj(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof kj) {
                return (kj) childAt;
            }
        }
        return null;
    }
}

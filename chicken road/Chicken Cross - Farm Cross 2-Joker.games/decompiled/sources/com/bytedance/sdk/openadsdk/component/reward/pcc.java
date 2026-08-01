package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.jr.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.tz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class pcc<L, A> {
    protected com.bytedance.sdk.component.kj.sf.gm oo;
    protected final Context pcc;
    protected final AtomicBoolean sf = new AtomicBoolean(false);
    protected final List<pcc<L, A>.oo> gm = Collections.synchronizedList(new ArrayList());
    private final jsj.pcc vj = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.6
        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (z && pcc.this.oo == null) {
                pcc pccVar = pcc.this;
                pcc pccVar2 = pcc.this;
                pccVar.oo = new sf("net connect task", pccVar2.gm);
                com.bytedance.sdk.component.utils.vy.pcc().post(pcc.this.oo);
            }
        }
    };

    protected abstract jr pcc();

    protected abstract A pcc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot);

    protected abstract Object pcc(A a2);

    protected abstract void pcc(L l, int i, String str);

    protected abstract void pcc(L l, Object obj);

    protected abstract int sf();

    protected abstract void sf(A a2);

    protected abstract int wh();

    protected pcc(Context context) {
        this.pcc = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
        gm();
    }

    public void pcc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        sf(adSlot);
    }

    private void sf(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, pcc(adSlot, true), sf(), new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.1
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                return pcc.this.pcc().pcc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc = pcc.this.pcc().pcc(pccVar);
                this.pcc = pcc;
                return pcc;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (this.pcc || pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    return;
                }
                pcc pccVar2 = pcc.this;
                pcc.this.pcc(pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) pccVar2.pcc(pccVar2.pcc, pccVar, adSlot), adSlot, true, (boolean) null);
            }
        });
    }

    public void pcc(AdSlot adSlot, L l) {
        new StringBuilder("load(new) called with: adSlot = [").append(adSlot).append("], listener = [").append(l);
        sf(adSlot, l);
    }

    private void sf(final AdSlot adSlot, final L l) {
        final long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, pcc(adSlot, false), sf(), new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.2
            boolean pcc = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                Object obj = l;
                if (obj != null) {
                    pcc.this.pcc((pcc) obj, i, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
                    pcc pccVar2 = pcc.this;
                    Object pcc = pccVar2.pcc(pccVar2.pcc, pccVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(pccVar.vj().isEmpty() ? null : pccVar.vj().get(0));
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(pccVar.qf(), System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (l != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 0) {
                        pcc.this.pcc(adSlot, pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) l, pcc, this.pcc);
                    }
                    pcc.this.pcc(pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) pcc, adSlot, false, (boolean) l);
                    return;
                }
                Object obj = l;
                if (obj != null) {
                    pcc.this.pcc((pcc) obj, -3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
                    gmVar.pcc(-3);
                    gmVar.gm(pcc.this.wh());
                    com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String pcc = pcc.this.pcc().pcc(adSlot.getCodeId(), true);
                TextUtils.isEmpty(pcc);
                if (TextUtils.isEmpty(pcc)) {
                    return null;
                }
                return pcc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                this.pcc = pcc.this.pcc().pcc(pccVar);
                return this.pcc;
            }
        });
    }

    protected void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, A a2, AdSlot adSlot, boolean z, L l) {
        if (!z) {
            com.bytedance.sdk.openadsdk.gbb.gm.pcc().pcc(pccVar.qf());
        }
        pcc<L, A>.gm gmVar = new gm(new C0146pcc(adSlot, pccVar, l, false), pccVar);
        pcc(pccVar);
        for (int i = 0; i < pccVar.vj().size(); i++) {
            of ofVar = pccVar.vj().get(i);
            int bg = ofVar.bg();
            if (i == 0 && bg == 43) {
                ofVar.kez().wh(0);
            }
            if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.vj()) {
                    ofVar.kez().wh(0);
                }
                if (!pccVar.vy() && bg != 43) {
                    return;
                }
            }
            pcc(pccVar, ofVar, (of) a2, adSlot, z, (pcc<L, of>.gm) gmVar);
            if (!pccVar.vy()) {
            }
        }
    }

    protected void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        qy vh = pccVar.vh();
        int i = pccVar.vy() ? 10 : 1;
        if (vh != null) {
            i = vh.dax();
        }
        for (final int i2 = 0; i2 < pccVar.vj().size() && i2 < i; i2++) {
            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pccVar.vj().get(i2), new pcc.InterfaceC0161pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.3
                @Override // com.bytedance.sdk.openadsdk.core.jr.gm.pcc.InterfaceC0161pcc
                public void pcc(boolean z) {
                    com.bytedance.sdk.component.utils.lo.pcc("BVL", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private boolean pcc(boolean z, of ofVar, AdSlot adSlot) {
        if (z) {
            return !atb.gm(ofVar) && of.vj(ofVar) && com.bytedance.sdk.openadsdk.core.lu.oo().tsz(adSlot.getCodeId()).oo == 1 && !com.bytedance.sdk.component.utils.lu.oo(this.pcc);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(pcc<L, A>.gm gmVar) {
        return gmVar != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 1;
    }

    private void pcc(of ofVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, final A a2, final boolean z, final pcc<L, A>.gm gmVar) {
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(CacheDirFactory.getICacheDir(ofVar.we()).pcc(), ofVar);
        pcc.pcc("material_meta", ofVar);
        pcc.pcc("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new com.bykv.vk.openvk.pcc.pcc.pcc.vj.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2, int i) {
                pcc.this.sf((pcc) a2);
                if (!z) {
                    if (pcc.this.pcc(gmVar)) {
                        gmVar.pcc(a2);
                        return;
                    }
                    return;
                }
                pcc.this.pcc().pcc(adSlot, pccVar);
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2, int i, String str) {
                if (pcc.this.pcc(gmVar)) {
                    gmVar.pcc(i, str);
                }
            }
        });
    }

    protected void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of ofVar, A a2, AdSlot adSlot, boolean z, pcc<L, A>.gm gmVar) {
        if (pcc(z, ofVar, adSlot)) {
            pcc((oo) new oo(ofVar, adSlot, pccVar));
            return;
        }
        boolean pcc = pcc((gm) gmVar);
        if (atb.gm(ofVar)) {
            if (z) {
                pcc().pcc(adSlot, pccVar);
            }
        } else if (of.vj(ofVar)) {
            if (ofVar.kez() == null) {
                return;
            }
            pcc(ofVar, adSlot, pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) a2, z, (pcc<L, com.bytedance.sdk.openadsdk.core.model.pcc>.gm) gmVar);
            pcc = false;
        } else if (z) {
            pcc().pcc(adSlot, pccVar);
        }
        if (pcc) {
            gmVar.pcc(a2);
        }
    }

    protected void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, L l, A a2, final boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    pcc.this.gm(adSlot);
                } else {
                    pcc.this.pcc().pcc(adSlot, pccVar);
                    pcc.this.gm(adSlot);
                }
            }
        });
        if (l != null) {
            pcc((pcc<L, A>) l, pcc((pcc<L, A>) a2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(AdSlot adSlot) {
        pcc().pcc(adSlot.getCodeId());
    }

    protected void pcc(pcc<L, A>.oo ooVar) {
        if (ooVar == null) {
            return;
        }
        if (this.gm.size() > 0) {
            this.gm.remove(0);
        }
        this.gm.add(ooVar);
    }

    protected tsz pcc(AdSlot adSlot, boolean z) {
        tsz tszVar = new tsz();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd())) {
            tszVar.vy = 2;
        }
        if (sf() == 7) {
            tszVar.sf = z ? 2 : 1;
        } else {
            tszVar.gm = z ? 2 : 1;
        }
        return tszVar;
    }

    protected void gm() {
        if (this.sf.get()) {
            return;
        }
        this.sf.set(true);
        jsj.pcc(this.vj, this.pcc);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.oo != null) {
            try {
                com.bytedance.sdk.component.utils.vy.pcc().removeCallbacks(this.oo);
            } catch (Throwable unused) {
            }
            this.oo = null;
        }
        oo();
    }

    protected void oo() {
        if (this.sf.get()) {
            this.sf.set(false);
            try {
                jsj.pcc(this.vj);
            } catch (Exception unused) {
            }
        }
    }

    public void pcc(String str, of ofVar) {
        pcc().pcc(str, ofVar);
    }

    public void vj() {
        try {
            pcc().pcc();
        } catch (Throwable unused) {
        }
    }

    protected class oo extends com.bytedance.sdk.component.kj.sf.gm {
        final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        final of pcc;
        final AdSlot sf;

        public oo(of ofVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            super("VideoPreloadTask");
            this.pcc = ofVar;
            this.sf = adSlot;
            this.gm = pccVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            of ofVar = this.pcc;
            if (ofVar == null || ofVar.kez() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(CacheDirFactory.getICacheDir(this.pcc.we()).pcc(), this.pcc);
            pcc.pcc("material_meta", this.pcc);
            pcc.pcc("ad_slot", this.sf);
            com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new com.bykv.vk.openvk.pcc.pcc.pcc.vj.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.oo.1
                @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i) {
                    pcc.this.pcc().pcc(oo.this.sf, oo.this.gm);
                }
            });
        }
    }

    protected class sf extends com.bytedance.sdk.component.kj.sf.gm {
        private final List<pcc<L, A>.oo> sf;

        public sf(String str, List<pcc<L, A>.oo> list) {
            super(str);
            this.sf = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<pcc<L, A>.oo> list = this.sf;
            if (list == null || list.isEmpty()) {
                pcc.this.oo = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.sf);
            this.sf.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((oo) it.next()).run();
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.lo.pcc("BVL", "continue download task error", e);
                }
            }
            pcc.this.oo = null;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.pcc$pcc, reason: collision with other inner class name */
    protected class C0146pcc {
        protected final L gm;
        protected final boolean oo;
        protected final AdSlot pcc;
        protected final com.bytedance.sdk.openadsdk.core.model.pcc sf;

        public C0146pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, L l, boolean z) {
            this.pcc = adSlot;
            this.sf = pccVar;
            this.gm = l;
            this.oo = z;
        }

        public void pcc(int i, String str) {
            L l = this.gm;
            if (l != null) {
                pcc.this.pcc((pcc) l, i, str);
            }
        }

        public void pcc(A a2) {
            pcc.this.pcc(this.pcc, this.sf, (com.bytedance.sdk.openadsdk.core.model.pcc) this.gm, (L) a2, this.oo);
        }
    }

    protected class gm {
        protected final AtomicInteger gm;
        protected final com.bytedance.sdk.openadsdk.core.model.pcc oo;
        protected final pcc<L, A>.C0146pcc pcc;
        protected final AtomicBoolean sf;

        private gm(pcc<L, A>.C0146pcc c0146pcc, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            this.sf = new AtomicBoolean(false);
            this.pcc = c0146pcc;
            this.oo = pccVar;
            this.gm = new AtomicInteger(pcc());
        }

        private int pcc() {
            if (!this.oo.wh()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.oo.vj().size(); i2++) {
                of ofVar = this.oo.vj().get(i2);
                if (ofVar != null && !atb.gm(ofVar) && ofVar.kez() != null) {
                    i++;
                }
            }
            return i;
        }

        public void pcc(int i, String str) {
            if (this.gm.decrementAndGet() > 0 || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.pcc(i, str);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gm.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", gm.this.oo.gm());
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("choose_ad_load_error").sf(jSONObject.toString());
                }
            });
        }

        public void pcc(A a2) {
            this.gm.decrementAndGet();
            if (this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.pcc(a2);
        }
    }
}

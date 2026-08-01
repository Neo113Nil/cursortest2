package com.bytedance.sdk.openadsdk.core.ork;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc {
    private static String gm;
    private static final AtomicBoolean pcc = new AtomicBoolean(false);
    private static String sf;

    public static void pcc() {
        com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().pcc(new com.bytedance.sdk.component.adexpress.pcc.pcc.sf() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.1
            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.sf
            public int pcc(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.sf
            public Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.sf
            public int pcc(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.sf
            public void pcc(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().pcc(new com.bytedance.sdk.component.adexpress.pcc.pcc.gm() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.2
            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int tmg() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int vy() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int pcc() {
                if (com.bytedance.sdk.openadsdk.core.lu.oo() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.lu.oo().vj();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public Context sf() {
                return com.bytedance.sdk.openadsdk.core.lu.pcc();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public Handler gm() {
                return com.bytedance.sdk.openadsdk.core.jr.gm();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public void oo() {
                int kz = com.bytedance.sdk.openadsdk.core.lu.oo().kz();
                int ew = com.bytedance.sdk.openadsdk.core.lu.oo().ew();
                if (kz == 0 && ew == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(kz);
                com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf(ew);
                int qf = com.bytedance.sdk.openadsdk.yt.vj.qf();
                int wh = com.bytedance.sdk.openadsdk.yt.vj.wh();
                if (qf == 0 && wh == 0) {
                    return;
                }
                MessageQueue[] messageQueueArr = new MessageQueue[1];
                pcc(com.bytedance.sdk.openadsdk.core.jr.gm().getLooper().getQueue(), wh, qf);
            }

            /* renamed from: com.bytedance.sdk.openadsdk.core.ork.hc$2$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ int gm;
                final /* synthetic */ MessageQueue[] pcc;
                final /* synthetic */ int sf;

                AnonymousClass1(MessageQueue[] messageQueueArr, int i, int i2) {
                    this.pcc = messageQueueArr;
                    this.sf = i;
                    this.gm = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.pcc[0] = Looper.myQueue();
                    pcc(this.pcc[0], this.sf, this.gm);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void pcc(final MessageQueue messageQueue, final int i, final int i2) {
                if (messageQueue != null) {
                    final int pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            sf(messageQueue, i);
                            pcc(messageQueue, i2);
                        }
                    };
                    if (pcc2 > 0) {
                        com.bytedance.sdk.openadsdk.core.jr.gm().postDelayed(runnable, pcc2);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void pcc(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.pcc.gm(i, true, messageQueue).sf();
                        return false;
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void sf(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.pcc.gm(i, false, messageQueue).sf();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public com.bytedance.sdk.component.adexpress.pcc.gm.pcc vj() {
                return com.bytedance.sdk.openadsdk.core.lu.gm().pcc();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public com.bytedance.sdk.component.qf.sf.pcc wh() {
                com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
                oo.pcc(8);
                oo.sf("express_down");
                return oo;
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public com.bytedance.sdk.component.qf.sf.sf qf() {
                com.bytedance.sdk.component.qf.sf.sf gm2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
                gm2.pcc(8);
                gm2.sf("express_get");
                return gm2;
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public String kj() {
                return com.bytedance.sdk.openadsdk.core.ork.sf().oo();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int ork() {
                return com.bytedance.sdk.openadsdk.core.lu.oo().kz();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int vh() {
                return com.bytedance.sdk.openadsdk.core.lu.oo().ew();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public ExecutorService hc() {
                return rnn.vj();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public ExecutorService gbb() {
                return rnn.ork();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public ScheduledExecutorService jr() {
                return rnn.pcc();
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int dax() {
                return rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc());
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int nac() {
                return rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc());
            }

            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.gm
            public int lu() {
                return com.bytedance.sdk.openadsdk.yt.vj.pcc("gaussian_blur_type", 0);
            }
        });
        com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().pcc(new com.bytedance.sdk.component.adexpress.pcc.pcc.oo() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.3
            @Override // com.bytedance.sdk.component.adexpress.pcc.pcc.oo
            public void pcc(int i) {
                com.bytedance.sdk.openadsdk.dax.oo.pcc().pcc(com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().sf(i).wh(com.bytedance.sdk.openadsdk.core.vy.pcc(i)));
            }
        });
        com.bytedance.sdk.component.vy.pcc.pcc.pcc().pcc(new com.bytedance.sdk.component.vy.pcc.sf() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.4
            @Override // com.bytedance.sdk.component.vy.pcc.sf
            public void pcc(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.oo.gm.gm(com.bytedance.sdk.openadsdk.utils.sf.qf(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.vy.pcc.sf
            public void pcc(com.bytedance.sdk.component.vy.sf.pcc pccVar, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.of ofVar = new com.bytedance.sdk.openadsdk.core.model.of();
                ofVar.atb(pccVar.sf());
                ofVar.jsj(pccVar.gm());
                ofVar.of(pccVar.oo());
                ofVar.yt(pccVar.vj());
                ofVar.gpj(pccVar.pcc());
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str, str2, jSONObject, j);
            }

            @Override // com.bytedance.sdk.component.vy.pcc.sf
            public void pcc(com.bytedance.sdk.component.vy.sf.pcc pccVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (pccVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.of ofVar = new com.bytedance.sdk.openadsdk.core.model.of();
                    ofVar.atb(pccVar.sf());
                    ofVar.jsj(pccVar.gm());
                    ofVar.of(pccVar.oo());
                    ofVar.yt(pccVar.vj());
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.hc.4.1
                        @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                        public JSONObject gm() {
                            String str3 = str2;
                            JSONObject jSONObject3 = jSONObject2;
                            new Object[]{"click_interval_intercept", str3, jSONObject3};
                            return jSONObject3;
                        }

                        @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                        public JSONObject pcc() {
                            return jSONObject;
                        }
                    });
                }
            }
        });
    }

    public static void sf() {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || pcc.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc();
    }

    public static String gm() {
        String gm2;
        if (sf == null) {
            sf = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc sf2 = com.bytedance.sdk.component.adexpress.pcc.sf.kj.sf();
        if (sf2 != null && (gm2 = sf2.gm()) != null && !gm2.equals(sf)) {
            sf = gm2;
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_sp", "js_render_ver", gm2);
        }
        return sf;
    }

    public static String oo() {
        Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2;
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar;
        String gm2;
        if (gm == null) {
            gm = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc sf2 = com.bytedance.sdk.component.adexpress.pcc.sf.kj.sf();
        if (sf2 != null && (pcc2 = sf2.pcc()) != null && (pccVar = pcc2.get("v3")) != null && (gm2 = pccVar.gm()) != null && !gm2.equals(gm)) {
            gm = gm2;
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_sp", "js_render_v3_ver", gm2);
        }
        return gm;
    }
}

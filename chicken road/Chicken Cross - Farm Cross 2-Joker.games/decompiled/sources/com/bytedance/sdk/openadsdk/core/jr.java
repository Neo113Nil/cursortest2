package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class jr {
    public static long gm = 0;
    private static final Runnable kj;
    public static long oo = 0;
    public static volatile boolean pcc = false;
    private static volatile HandlerThread wh;
    public static AtomicBoolean sf = new AtomicBoolean(false);
    private static volatile int vj = 0;
    private static volatile Handler qf = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.jr.1
            boolean pcc = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.pcc) {
                    return;
                }
                this.pcc = true;
                super.start();
            }
        };
        wh = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.kj.pcc(wh);
        oo = System.currentTimeMillis();
        kj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().vgx()) {
                    jr.wh();
                    return;
                }
                String sf2 = com.bytedance.sdk.openadsdk.core.settings.vh.sf(lu.pcc());
                int pcc2 = com.bytedance.sdk.openadsdk.core.settings.vh.pcc(lu.pcc());
                if (!TextUtils.equals(sf2, com.bytedance.sdk.openadsdk.core.settings.vh.oo) || pcc2 != com.bytedance.sdk.openadsdk.core.settings.vh.vj) {
                    com.bytedance.sdk.openadsdk.core.settings.vh.sf().pcc(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.vh.oo = sf2;
                    com.bytedance.sdk.openadsdk.core.settings.vh.vj = pcc2;
                }
                jr.wh();
            }
        };
    }

    public static void pcc(long j) {
        oo = j;
    }

    public static long pcc() {
        return oo;
    }

    public static Handler sf() {
        if (wh == null || !wh.isAlive()) {
            synchronized (jr.class) {
                if (wh == null || !wh.isAlive()) {
                    wh = com.bytedance.sdk.component.utils.kj.pcc("pag_init_handle", -1);
                    qf = new Handler(wh.getLooper());
                }
            }
        } else if (qf == null) {
            synchronized (jr.class) {
                if (qf == null) {
                    qf = new Handler(wh.getLooper());
                }
            }
        }
        return qf;
    }

    public static Handler gm() {
        return new Handler(Looper.getMainLooper());
    }

    public static int oo() {
        return vj;
    }

    public static void pcc(int i) {
        vj = i;
    }

    public static boolean vj() {
        return oo() == 1;
    }

    public static void wh() {
        Handler sf2 = sf();
        Runnable runnable = kj;
        sf2.removeCallbacks(runnable);
        sf().postDelayed(runnable, 10000L);
    }

    public static void pcc(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    ork.sf().sf(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("InitHelper", th.getMessage());
        }
    }

    public static void qf() {
        sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.jr.3.1
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("init");
                            return pccVar;
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("InitHelper", th.getMessage());
                }
            }
        });
    }
}

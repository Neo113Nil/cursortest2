package com.bytedance.sdk.openadsdk.fum.pcc.sf;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.dax.pcc.oo;
import com.bytedance.sdk.openadsdk.dax.sf;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private static volatile pcc kj;
    private volatile Boolean pcc = null;
    private AtomicLong sf = new AtomicLong(0);
    private int gm = 0;
    private String oo = "";
    private final CountDownLatch vj = new CountDownLatch(1);
    private volatile boolean wh = false;
    private String qf = "";

    public static pcc pcc() {
        if (kj == null) {
            synchronized (pcc.class) {
                if (kj == null) {
                    kj = new pcc();
                }
            }
        }
        return kj;
    }

    private pcc() {
    }

    public String sf() {
        if (lu.oo().fy() == 1) {
            if (rnn.wh()) {
                return this.oo;
            }
            if (!this.wh) {
                try {
                    this.vj.await(4L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.wh = true;
                    this.vj.countDown();
                    throw th;
                }
                this.wh = true;
                this.vj.countDown();
            }
            return this.oo;
        }
        return this.oo;
    }

    public void pcc(boolean z) {
        if (this.gm == 1 || !TextUtils.isEmpty(this.oo)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.sf.get() <= elapsedRealtime) {
            this.sf.set(elapsedRealtime + 300000);
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            rnn.pcc(new gm("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.gm] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? r4;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(lu.pcc());
                        if (advertisingIdInfo != null) {
                            r4 = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (r4 != 0) {
                                pcc.this.gm = 1;
                                pcc.this.pcc(2, "lmt", SystemClock.elapsedRealtime() - elapsedRealtime2);
                            }
                            if (r4 == 0) {
                                String id = advertisingIdInfo.getId();
                                String str = pcc.this.oo;
                                if (!TextUtils.isEmpty(id)) {
                                    pcc.this.oo = id;
                                    pcc.this.pcc(true, SystemClock.elapsedRealtime() - elapsedRealtime2);
                                } else {
                                    pcc.this.pcc(4, "empty gaid", SystemClock.elapsedRealtime() - elapsedRealtime2);
                                }
                                if (!str.equals(id)) {
                                    hc.pcc();
                                }
                            }
                        } else {
                            r4 = -1;
                        }
                        if (r4 != -1) {
                            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("limit_ad_track", r4);
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
    }

    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(L6.X0, sf());
        } catch (JSONException unused) {
        }
    }

    public void pcc(boolean z, long j) {
        pcc(z, 0, "", null, j);
    }

    public void pcc(int i, String str, long j) {
        pcc(false, i, str, null, j);
    }

    public void pcc(int i, Throwable th, long j) {
        pcc(false, i, "", th, j);
    }

    public void pcc(final boolean z, final int i, final String str, final Throwable th, final long j) {
        if ((this.pcc == null || this.pcc.booleanValue()) && lu.pcc() != null) {
            lu.vj().pcc(new sf() { // from class: com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.2
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    if (!pcc.this.gm()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, pcc.this.qf);
                    jSONObject.put("is_success", z);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? pcc.sf(th) : str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("has_setting", vh.sf().otd() > 0);
                    return oo.sf().pcc("gid_status").sf(jSONObject.toString());
                }
            }, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gm() {
        if (this.pcc == null) {
            synchronized (this) {
                if (this.pcc == null) {
                    this.pcc = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= com.bytedance.sdk.openadsdk.dax.gm.sf("gid_status", 100));
                    if (this.pcc.booleanValue()) {
                        try {
                            this.qf = tsz.pcc();
                        } catch (Throwable unused) {
                            this.qf = BuildConfig.FLAVOR;
                        }
                    }
                }
            }
        }
        return this.pcc.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String sf(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}

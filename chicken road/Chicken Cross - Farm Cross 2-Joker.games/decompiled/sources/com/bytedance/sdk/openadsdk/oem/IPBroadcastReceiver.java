package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.mk;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPBroadcastReceiver pcc;
    private pcc gm;
    private int oo = 0;
    private final LruCache<String, of> sf;

    private IPBroadcastReceiver() {
        int i = 10;
        int pcc2 = vj.pcc("ip_data_config", "ip_ad_cache_count", 10);
        if (pcc2 > 0 && pcc2 <= 200) {
            i = pcc2;
        }
        new Object[]{"cacheSize=", Integer.valueOf(i)};
        this.sf = new LruCache<>(i);
    }

    public void pcc(String str, of ofVar) {
        if (TextUtils.isEmpty(str) || ofVar == null || this.sf.get(str) != null) {
            return;
        }
        this.sf.put(str, ofVar);
    }

    public of pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.sf.get(str);
    }

    public void pcc(pcc pccVar) {
        this.gm = pccVar;
    }

    public void pcc() {
        this.gm = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            pcc(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            sf(intent);
        }
    }

    private void pcc(final Intent intent) {
        if (intent == null) {
            return;
        }
        rnn.sf(new gm("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i;
                final int i2;
                final int i3;
                try {
                    int i4 = 0;
                    final int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                    if (intExtra < 0) {
                        int intExtra2 = intent.getIntExtra("reason", 0);
                        if (intExtra == -4 && intExtra2 == -1) {
                            return;
                        } else {
                            i = intExtra2;
                        }
                    } else {
                        i = 0;
                    }
                    if (intExtra == 5) {
                        int intExtra3 = intent.getIntExtra("status", 0);
                        if (intExtra3 == -2) {
                            try {
                                i4 = intent.getIntExtra(NotificationCompat.CATEGORY_PROGRESS, 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.oo = 1;
                            }
                            if (i4 < 100) {
                                return;
                            }
                        }
                        i2 = intExtra3;
                        i3 = i4;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    String stringExtra = intent.getStringExtra("packageName");
                    pcc pccVar = IPBroadcastReceiver.this.gm;
                    if (intExtra > 0 && pccVar != null) {
                        pccVar.pcc(stringExtra, intExtra);
                    }
                    final of pcc2 = IPBroadcastReceiver.this.pcc(stringExtra);
                    new Object[]{"err_code=", Integer.valueOf(intExtra), " reason=", Integer.valueOf(i), " status=", Integer.valueOf(i2), " progress=", Integer.valueOf(i3)};
                    if (pcc2 != null) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), pcc2, kun.pcc(pcc2), "ip_listener_log", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                            public JSONObject pcc() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra);
                                    of ofVar = pcc2;
                                    if (ofVar != null) {
                                        jSONObject.put("ip_is_w2a", ofVar.lu());
                                    }
                                    int i5 = intExtra;
                                    if (i5 > 0) {
                                        if (i5 == 5) {
                                            jSONObject.put("ip_status", i2);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.oo);
                                        }
                                        if (i2 == -2) {
                                            jSONObject.put("ip_progress", i3);
                                        }
                                    }
                                    if (intExtra < 0) {
                                        jSONObject.put("ip_reason", i);
                                    }
                                    return jSONObject;
                                } catch (Throwable th) {
                                    lo.pcc("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    lo.pcc("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                }
            }
        });
    }

    private void sf(final Intent intent) {
        if (intent == null) {
            return;
        }
        rnn.sf(new gm("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra("app_package_name");
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int pcc2 = sf.pcc(intExtra);
                        final int sf = sf.sf(intExtra);
                        String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(pcc2), Integer.valueOf(sf));
                        pcc pccVar = IPBroadcastReceiver.this.gm;
                        if (pcc2 > 0 && pccVar != null) {
                            pccVar.pcc(stringExtra3, pcc2);
                        }
                        final of pcc3 = IPBroadcastReceiver.this.pcc(stringExtra3);
                        if (pcc3 != null) {
                            com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), pcc3, kun.pcc(pcc3), "ip_listener_log", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                                public JSONObject pcc() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", pcc2);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", sf);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.oo);
                                        of ofVar = pcc3;
                                        if (ofVar != null) {
                                            jSONObject.put("ip_is_w2a", ofVar.lu());
                                            if (pcc3.gmi() != null) {
                                                jSONObject.put("ip_oem_type", pcc3.gmi().wh());
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        lo.pcc("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    lo.pcc("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                    IPBroadcastReceiver.this.oo = 2;
                }
            }
        });
    }

    public static IPBroadcastReceiver pcc(Context context, of ofVar) {
        mk gmi;
        int pcc2 = vj.pcc("ip_data_config", "ip_link_listener", 0);
        new Object[]{"open =", Integer.valueOf(pcc2)};
        if (pcc2 == 0 || ofVar == null || (gmi = ofVar.gmi()) == null) {
            return null;
        }
        if (pcc == null) {
            synchronized (IPBroadcastReceiver.class) {
                if (pcc == null) {
                    pcc = new IPBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    if (gmi.qf()) {
                        intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    } else if (gmi.kj()) {
                        intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                    }
                    if (Build.VERSION.SDK_INT >= 34 && kun.wh(context) >= 34) {
                        context.registerReceiver(pcc, intentFilter, 2);
                    } else {
                        context.registerReceiver(pcc, intentFilter);
                    }
                }
            }
        }
        return pcc;
    }

    public static void sf(final Context context, final of ofVar) {
        mk gmi;
        if (pcc != null || ofVar == null || (gmi = ofVar.gmi()) == null) {
            return;
        }
        if (gmi.qf() || gmi.kj()) {
            jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.pcc(lu.pcc(context), ofVar);
                    } catch (Throwable th) {
                        lo.pcc("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th);
                    }
                }
            });
        }
    }
}

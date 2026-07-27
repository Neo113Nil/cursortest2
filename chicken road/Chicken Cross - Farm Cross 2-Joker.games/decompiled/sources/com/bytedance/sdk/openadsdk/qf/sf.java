package com.bytedance.sdk.openadsdk.qf;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private static final String[] pcc = {"gecko16-normal-useast5.tiktokv.us"};

    public interface pcc {
        void pcc();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.qf.sf$sf, reason: collision with other inner class name */
    private static class C0202sf {
        private static final sf pcc = new sf();
    }

    public static sf pcc() {
        return C0202sf.pcc;
    }

    public ILoader sf() {
        try {
            return GeckoHubImp.inst(lu.pcc()).getGeckoResLoader();
        } catch (Throwable th) {
            lo.pcc("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private sf() {
        try {
            GeckoHubImp.inst(lu.pcc());
        } catch (Throwable th) {
            lo.pcc("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    private static String oo() {
        String[] tmh = lu.oo().tmh();
        if (tmh != null) {
            int length = tmh.length;
        }
        if (tmh == null) {
            tmh = pcc;
        }
        String str = tmh[new SecureRandom().nextInt(tmh.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = pcc;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public void pcc(Map<String, of> map) {
        pcc(map, (pcc) null, false);
    }

    public void pcc(final Map<String, of> map, final pcc pccVar, boolean z) {
        try {
            String pcc2 = hc.pcc(lu.pcc());
            if (TextUtils.isEmpty(pcc2)) {
                return;
            }
            for (of ofVar : map.values()) {
                if (ofVar != null) {
                    if (!z && ofVar.ss()) {
                        map.remove(ofVar.cz());
                    } else {
                        oo.sf(ofVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(oo());
            GeckoHubImp.inst(lu.pcc()).preload(pcc2, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.qf.sf.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        of ofVar2 = (of) map.get(jSONObject.optString("channel"));
                        if (ofVar2 != null) {
                            gm.pcc.pcc(str, jSONObject, ofVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        new Object[]{"gecko download finish", jSONObject};
                        pcc pccVar2 = pccVar;
                        if (pccVar2 != null) {
                            pccVar2.pcc();
                        }
                        sf.sf(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.qf.pcc());
        } catch (Throwable th) {
            sf(map, null, th.toString());
            lo.pcc("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(Map<String, of> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put("msg", str);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject = jSONObject2;
            }
            Iterator<of> it = map.values().iterator();
            while (it.hasNext()) {
                oo.pcc(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            lo.pcc("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void pcc(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(lu.pcc()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                lo.pcc("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel pcc(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(lu.pcc()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            lo.pcc("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int pcc(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(lu.pcc()).getResCount(iLoader, str);
        } catch (Throwable th) {
            lo.pcc("GeckoHub", "getResCount error", th);
            return 0;
        }
    }

    public static void gm() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.qf.sf.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return rnn.vj();
                }
            });
        } catch (Throwable th) {
            lo.pcc("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }
}

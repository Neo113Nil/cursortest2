package com.bytedance.sdk.openadsdk.fum.pcc.pcc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.dax;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.hc;
import com.bytedance.sdk.openadsdk.core.model.mk;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.wh;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.vj;
import com.bytedance.sdk.openadsdk.utils.yt;
import com.facebook.share.internal.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf implements gm {
    private final WeakReference<Context> gm;
    protected String pcc;
    protected int sf;

    private static boolean sf() {
        return false;
    }

    public sf(Context context, String str) {
        this.gm = new WeakReference<>(context);
        this.pcc = str;
        new Object[]{str, "====tag===".concat(String.valueOf(str))};
        if (lu.pcc() == null) {
            lu.sf(context);
        }
    }

    public static boolean pcc(Context context, String str, String str2, String str3, of ofVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str3, "store_open", (JSONObject) null);
                vj.pcc(ofVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse("market://details?id=".concat(String.valueOf(str2)));
                intent2.setData(parse);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str3, "store_open", (JSONObject) null);
                        vj.pcc(ofVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public static boolean pcc(of ofVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent pcc;
        if (ofVar != null && ofVar.edk() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (pcc = kun.pcc(context, str)) == null) {
                return false;
            }
            pcc.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                pcc.addFlags(268435456);
            }
            context.startActivity(pcc);
            if (map == null) {
                map = new HashMap<>();
            }
            if (ofVar != null && ofVar.fg() == 0) {
                map.put("auto_click", Boolean.valueOf(!ofVar.gpj()));
            }
            map.put("can_query_install", Integer.valueOf(sf() ? 1 : 0));
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm
    public void pcc(int i) {
        this.sf = i;
    }

    public boolean pcc(Context context, of ofVar, String str, String str2) {
        return pcc(context, str, str2, this.pcc, ofVar);
    }

    protected Context pcc() {
        WeakReference<Context> weakReference = this.gm;
        return (weakReference == null || weakReference.get() == null) ? lu.pcc() : this.gm.get();
    }

    @Override // com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm
    public void pcc(final of ofVar) {
        if (pcc() == null || ofVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("gp_downloader_async", 0) == 1) {
            rnn.vy().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.1
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.vj(ofVar);
                }
            });
        } else {
            vj(ofVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj(of ofVar) {
        if (sf(ofVar)) {
            ofVar.wh(true);
            vj.pcc(ofVar);
            return;
        }
        if (oo(ofVar)) {
            ofVar.wh(true);
            vj.pcc(ofVar);
            return;
        }
        if (pcc(ofVar, false)) {
            vj.pcc(ofVar);
            return;
        }
        if (gm(ofVar)) {
            ofVar.wh(true);
            vj.pcc(ofVar);
        } else {
            if (ofVar.xfm() != null || ofVar.xy() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.rnn.pcc(pcc(), ofVar.xy(), ofVar, kun.pcc(this.pcc), this.pcc, true);
            ofVar.wh(true);
            vj.pcc(ofVar);
        }
    }

    public boolean sf(of ofVar) {
        hc dt = ofVar.dt();
        if (dt == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        pcc(ofVar, hashMap);
        if (pcc.pcc(pcc(), dt.pcc(), ofVar, kun.sf(ofVar), hashMap, true)) {
            return true;
        }
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("dpl_fallback_enable", 0) != 1 || !yt.pcc(pcc(), dt.sf(), ofVar, sf.pcc.pcc, true)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.pcc, "open_fallback_url", hashMap);
        return true;
    }

    private void pcc(of ofVar, Map<String, Object> map) {
        if (ofVar != null && ofVar.fg() == 0) {
            map.put("auto_click", Boolean.valueOf((ofVar == null || ofVar.gpj()) ? false : true));
        }
        if (ofVar != null && ofVar.fg() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.sf >= 11));
        }
        map.put("can_query_install", Integer.valueOf(sf() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm
    public boolean gm(of ofVar) {
        wh xfm;
        if (ofVar == null || (xfm = ofVar.xfm()) == null) {
            return false;
        }
        return pcc(pcc(), ofVar, xfm.pcc(), xfm.gm());
    }

    @Override // com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm
    public boolean oo(of ofVar) {
        wh xfm;
        if (ofVar == null || (xfm = ofVar.xfm()) == null || ofVar.edk() == 0) {
            return false;
        }
        String gm = xfm.gm();
        if (TextUtils.isEmpty(gm)) {
            return false;
        }
        return pcc(ofVar, gm, pcc(), this.pcc, new HashMap());
    }

    public boolean pcc(of ofVar, boolean z) {
        return sf(ofVar, pcc(), z);
    }

    private static void pcc(final JSONObject jSONObject, of ofVar, String str, final int i) {
        try {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.2
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject pcc() {
                    try {
                        jSONObject.put("status", i);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean pcc(of ofVar, Context context, boolean z) {
        if (ofVar != null && ofVar.gmi() != null && ofVar.gmi().vy() && !TextUtils.isEmpty(ofVar.gmi().ork()) && context != null) {
            try {
                mk gmi = ofVar.gmi();
                String pcc = kun.pcc(ofVar);
                final JSONObject vh = gmi.vh();
                vh.put("from_web", z ? 1 : 0);
                vh.put("is_w2a", ofVar.lu());
                com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, pcc, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.3
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        try {
                            vh.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return vh;
                    }
                });
                Intent pcc2 = pcc(context, gmi);
                if (pcc2 == null) {
                    pcc(vh, ofVar, pcc, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!yt.pcc((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity sf = dax.pcc().vj().sf();
                    if (sf != null && yt.pcc(sf)) {
                        context = sf;
                    }
                }
                if (!(context instanceof Activity)) {
                    pcc(vh, ofVar, pcc, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || pcc2.resolveActivity(packageManager) == null) {
                    pcc(vh, ofVar, pcc, -4);
                    return false;
                }
                try {
                    ((Activity) context).startActivityForResult(pcc2, 0);
                    pcc(vh, ofVar, pcc, 1);
                    return true;
                } catch (Throwable unused) {
                    pcc(vh, ofVar, pcc, -3);
                    return false;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent pcc(Context context, mk mkVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String oo = mkVar.oo();
            if (!TextUtils.isEmpty(oo)) {
                intent.setPackage(oo);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(mkVar.ork()));
            boolean z = true;
            if (mkVar.sf() != 1) {
                z = false;
            }
            intent.putExtra("overlay", z);
            if (TextUtils.isEmpty(mkVar.gm())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", mkVar.gm());
            }
            mkVar.pcc(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static boolean sf(of ofVar, Context context, boolean z) {
        String gm;
        IPBroadcastReceiver pcc;
        if (ofVar != null && context != null) {
            try {
                mk gmi = ofVar.gmi();
                if (gmi != null && !TextUtils.isEmpty(gmi.ork())) {
                    if (gmi.vy() && pcc(ofVar, context, z)) {
                        return true;
                    }
                    if (gmi.qf() || gmi.kj()) {
                        if (ofVar.lu() == 1) {
                            gm = gmi.pcc();
                        } else {
                            gm = (ofVar.xfm() == null || TextUtils.isEmpty(ofVar.xfm().gm())) ? null : ofVar.xfm().gm();
                        }
                        if (!TextUtils.isEmpty(gm) && (pcc = IPBroadcastReceiver.pcc(context, ofVar)) != null) {
                            pcc.pcc(gm, ofVar);
                        }
                    }
                    final boolean pcc2 = pcc.pcc(context, gmi.ork(), ofVar, kun.sf(ofVar), pcc(ofVar, z, gmi), true);
                    rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (pcc2) {
                                ork.pcc("oem_store", "1");
                            } else {
                                ork.pcc("oem_store", "-2");
                            }
                        }
                    });
                    return pcc2;
                }
            } catch (Throwable th) {
                lo.gm("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    private static Map<String, Object> pcc(of ofVar, boolean z, mk mkVar) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", mkVar.wh());
            jSONObject.put("from_web", z ? 1 : 0);
            jSONObject.put("is_w2a", ofVar.lu());
            hashMap.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static boolean pcc(String str, of ofVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!ProxyConfig.MATCH_HTTP.equals(scheme) && !"https".equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = parse.getQueryParameter(ShareConstants.MEDIA_URI)) != null) {
                        return pcc(queryParameter, ofVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean pcc(of ofVar, String str) {
        if (ofVar == null || ofVar.gmi() == null) {
            return false;
        }
        String vj = ofVar.gmi().vj();
        if (TextUtils.isEmpty(vj)) {
            return false;
        }
        return Pattern.compile(vj).matcher(str).matches();
    }
}

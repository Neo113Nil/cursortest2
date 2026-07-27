package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.ironsource.C4658ta;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.util.UrlConst;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kun {
    private static String gbb;
    private static final byte[] hc;
    private static String jr;
    public static Integer pcc;
    private static final byte[] tmg;
    private static final HashSet<String> vh;
    private static final ExecutorService sf = Executors.newSingleThreadExecutor();
    private static volatile boolean gm = false;
    private static final AtomicInteger oo = new AtomicInteger(0);
    private static volatile String vj = "";
    private static final ReentrantLock wh = new ReentrantLock();
    private static String qf = null;
    private static String kj = null;
    private static String vy = null;
    private static final HashSet<String> ork = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    public static boolean oo(int i) {
        return i == 4;
    }

    public static boolean oo(Context context) {
        return false;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, View view) {
    }

    public static int qf(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static boolean vj(int i) {
        return i == 5;
    }

    public static boolean wh(int i) {
        return i == 6;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        vh = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        pcc = null;
        tmg = new byte[]{108, 111, 97, 100, 105, 110, 103};
        hc = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static Intent pcc(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static sf pcc(Context context, Intent intent) {
        return new sf(null, 0);
    }

    public static class sf {
        public final ComponentName pcc;
        public final int sf;

        public sf(ComponentName componentName, int i) {
            this.pcc = componentName;
            this.sf = i;
        }
    }

    public static boolean pcc() {
        return (com.bytedance.sdk.openadsdk.core.dax.pcc() == null || com.bytedance.sdk.openadsdk.core.dax.pcc().oo()) ? false : true;
    }

    public static boolean sf(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.sf.pcc(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String pcc(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static String sf(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i == 7) {
            return "rewarded_video_landingpage";
        }
        return "unknow";
    }

    public static String pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            return null;
        }
        try {
            return gm(ofVar.hh());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            return -1;
        }
        int hh = ofVar.hh();
        int i = 1;
        if (hh == 1) {
            return 2;
        }
        if (hh == 3) {
            return 4;
        }
        if (hh != 5) {
            i = 7;
            if (hh != 7) {
                return hh != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static int pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.hashCode();
        switch (str) {
        }
        return 1;
    }

    public static String gm(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i == 7) {
            return "rewarded_video";
        }
        if (i == 8) {
            return "fullscreen_interstitial_ad";
        }
        return "embeded_ad";
    }

    public static String sf() {
        String sf2;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
        try {
            sf2 = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("android_system_ua", "unKnow");
        } catch (Exception unused) {
        }
        if (sf2 != null && !"unKnow".equals(sf2)) {
            return sf2;
        }
        FutureTask futureTask = new FutureTask(new pcc(2));
        sf.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.lo.gm("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static void gm() {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.utils.kun.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", kun.lq());
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("recycle_version_not_valid").sf(jSONObject.toString());
            }
        });
    }

    public static String oo() {
        if (!TextUtils.isEmpty(vj)) {
            return vj;
        }
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
        String pcc2 = com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_local_web_ua", 86400000L);
        vj = pcc2;
        if (TextUtils.isEmpty(pcc2)) {
            ReentrantLock reentrantLock = wh;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(vj)) {
                            vj = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.lu.pcc());
                        }
                        com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_local_web_ua", vj);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "", e);
                        return vj;
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "", e2);
                        return vj;
                    }
                }
            } finally {
                wh.unlock();
            }
        }
        return vj;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.kun$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(kun.vj)) {
                    com.bytedance.sdk.component.vy.qf qfVar = new com.bytedance.sdk.component.vy.qf(com.bytedance.sdk.openadsdk.core.lu.pcc(), qf.gm.USER_AGENT);
                    qfVar.setWebViewClient(new qf.pcc());
                    String unused = kun.vj = qfVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.mk.pcc(qfVar);
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String mu() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.lu.pcc());
            webView.setWebViewClient(new qf.pcc());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static class pcc implements Callable<String> {
        private final int pcc;

        pcc(int i) {
            this.pcc = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            int i = this.pcc;
            if (i == 1) {
                str = gm();
            } else if (i == 2) {
                str = sf();
            }
            return str;
        }

        private String sf() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("android_system_ua", str);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.lo.gm("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                str = "unKnow";
                th = th3;
            }
            return str;
        }

        private synchronized String gm() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.kun.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = kun.mu();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }
    }

    public static String vj() {
        return tsz.pcc();
    }

    public static synchronized String wh() {
        String str;
        Context pcc2;
        synchronized (kun.class) {
            if (TextUtils.isEmpty(qf) && (pcc2 = com.bytedance.sdk.openadsdk.core.lu.pcc()) != null) {
                try {
                    qf = pcc2.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
            str = qf;
        }
        return str;
    }

    public static synchronized String qf() {
        String str;
        synchronized (kun.class) {
            if (TextUtils.isEmpty(kj) && com.bytedance.sdk.openadsdk.core.lu.pcc() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.lu.pcc().getPackageManager().getPackageInfo(wh(), 0);
                    kj = String.valueOf(packageInfo.versionCode);
                    vy = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
            str = kj;
        }
        return str;
    }

    public static synchronized String kj() {
        String str;
        synchronized (kun.class) {
            if (TextUtils.isEmpty(vy) && com.bytedance.sdk.openadsdk.core.lu.pcc() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.lu.pcc().getPackageManager().getPackageInfo(wh(), 0);
                    kj = String.valueOf(packageInfo.versionCode);
                    vy = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
            str = vy;
        }
        return str;
    }

    public static String pcc(Context context) {
        String sf2 = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("total_memory", (String) null);
        if (sf2 == null || sf(sf2) <= 0) {
            sf2 = gm("MemTotal");
            if (sf(sf2) <= 0) {
                sf2 = vy();
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("total_memory", sf2);
        }
        return sf2;
    }

    public static long sf(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String vy() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String ork() {
        return com.bytedance.sdk.openadsdk.core.gm.pcc().sf("total_memory", "0");
    }

    public static String vh() {
        return gm("MemTotal");
    }

    public static String gm(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!readLine.contains(str));
                if (readLine == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = readLine.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static long sf(Context context) {
        return com.bytedance.sdk.openadsdk.core.gm.pcc().sf("total_internal_storage", 0L).longValue();
    }

    public static long tmg() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long hc() {
        return com.bytedance.sdk.openadsdk.core.gm.pcc().sf("free_internal_storage", 0L).longValue();
    }

    public static long gbb() {
        return com.bytedance.sdk.openadsdk.core.gm.pcc().sf("total_sdcard_storage", 0L).longValue();
    }

    public static long jr() {
        try {
            if (!nn()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    private static boolean nn() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int dax() {
        return com.bytedance.sdk.openadsdk.core.gm.pcc().sf("is_root", -1);
    }

    public static boolean nac() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String oo(String str) {
        return pcc(str, false, false);
    }

    public static String pcc(String str, boolean z, boolean z2) {
        String lu;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(String.valueOf(str));
        }
        if (z2) {
            lu = fum();
        } else {
            lu = lu();
        }
        if (TextUtils.isEmpty(lu)) {
            lu = "api16-access-ttp.tiktokpangle.us";
        }
        String str2 = UrlConst.HTTPS + lu + str;
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return str2;
        }
        if (nn.pcc() && !z) {
            str2 = nn.pcc(str2);
        }
        return z ? gbb(str2) : str2;
    }

    public static List<String> pcc(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/")) {
            str = "/".concat(String.valueOf(str));
        }
        ArrayList arrayList = new ArrayList();
        Set<String> gga = com.bytedance.sdk.openadsdk.core.lu.oo().gga();
        if (gga != null && !gga.isEmpty()) {
            for (String str2 : gga) {
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = UrlConst.HTTPS + str2 + str;
                    if (nn.pcc() && !z) {
                        str3 = nn.pcc(str3);
                    }
                    if (z) {
                        str3 = gbb(str3);
                    }
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    public static String lu() {
        String tsx = com.bytedance.sdk.openadsdk.core.lu.oo().tsx();
        return TextUtils.isEmpty(tsx) ? of.pcc() : tsx;
    }

    public static String gpj() {
        String jq = com.bytedance.sdk.openadsdk.core.lu.oo().jq();
        if (!TextUtils.isEmpty(jq)) {
            return jq;
        }
        String pcc2 = of.pcc();
        return !TextUtils.isEmpty(pcc2) ? UrlConst.HTTPS + pcc2 + "/service/2/dual_events/" : jq;
    }

    public static List<String> lo() {
        ArrayList arrayList = new ArrayList();
        Set<String> gqd = com.bytedance.sdk.openadsdk.core.lu.oo().gqd();
        if (gqd != null && !gqd.isEmpty()) {
            for (String str : gqd) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static String fum() {
        String kez = com.bytedance.sdk.openadsdk.core.settings.vh.kez();
        if (!TextUtils.isEmpty(kez)) {
            return kez;
        }
        String kun = com.bytedance.sdk.openadsdk.core.lu.oo().kun();
        return TextUtils.isEmpty(kun) ? of.pcc() : kun;
    }

    private static String gbb(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(C4658ta.b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", qf()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static String vj(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.lu.oo().rj();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith(ProxyConfig.MATCH_HTTP) ? UrlConst.HTTPS.concat(String.valueOf(str)) : str;
    }

    public static String wh(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith(ProxyConfig.MATCH_HTTP) ? UrlConst.HTTPS.concat(String.valueOf(str)) : str;
    }

    public static String tz() {
        return String.format(Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String of() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static String yt() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int qy() {
        try {
            String id = TimeZone.getDefault().getID();
            if (ork.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id != null && id.startsWith("America/")) {
                if (!vh.contains(id)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String gm(Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int jsj() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String tsz() {
        int i = -jsj();
        if (i >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i));
        }
        return "Etc/GMT".concat(String.valueOf(i));
    }

    public static JSONObject pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, long j, com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
        if (ofVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, ofVar.esn());
            jSONObject.put("buffers_time", j);
            com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = ofVar.kez();
            if (kez != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, kez.vj());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, kez.vy());
            }
            pcc(jSONObject, pccVar);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    private static void pcc(JSONObject jSONObject, com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || pccVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(pccVar.oo()), Integer.valueOf(pccVar.vj())));
        } catch (Throwable unused) {
        }
    }

    public static boolean qf(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean gm(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            return true;
        }
        int sf2 = com.bytedance.sdk.openadsdk.core.lu.oo().sf(ofVar.kot());
        int gm2 = com.bytedance.sdk.component.utils.lu.gm(com.bytedance.sdk.openadsdk.core.lu.pcc());
        if (sf2 == 1) {
            return oo(gm2);
        }
        if (sf2 == 2) {
            return vj(gm2) || oo(gm2) || wh(gm2);
        }
        if (sf2 != 3) {
            return sf2 != 5 || oo(gm2) || wh(gm2);
        }
        return false;
    }

    public static boolean kj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    public static String vy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static void pcc(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !vj(context)) {
            return;
        }
        int length = str2.length();
        int i2 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i3 = 3572;
        int i4 = 0;
        while (i2 <= i) {
            if (i3 < length) {
                Log.d(str, i + "-" + i2 + ServerSentEventKt.COLON + str2.substring(i4, i3));
                i2++;
                i4 = i3;
                i3 += 3572;
            } else {
                Log.d(str, i + "-" + i2 + ServerSentEventKt.COLON + str2.substring(i4));
                return;
            }
        }
    }

    public static boolean vj(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static int wh(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            new Object[]{"targetSdkVersion = ", Integer.valueOf(i)};
            return i;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.getMessage());
            return i;
        }
    }

    public static long qf(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().minSdkVersion;
            new Object[]{"minSdkVersion = ", Integer.valueOf(i)};
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static long ork(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                return 0L;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                if (!kj(str2)) {
                    return 0L;
                }
                if (str2.length() == 1) {
                    sb.append("0").append(str2);
                } else {
                    sb.append(str2);
                }
                if (sb.length() > 18) {
                    return 0L;
                }
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return 0L;
            }
            return Long.parseLong(sb2);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", e.getMessage());
            return 0L;
        }
    }

    public static boolean vh(String str) {
        if (com.bytedance.sdk.openadsdk.core.jr.vj()) {
            return true;
        }
        com.bytedance.sdk.component.utils.lo.gm("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static void tmg(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.lo.gm("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static int kj(Context context) {
        return qf(com.bytedance.sdk.component.utils.jsj.pcc(context, 0L));
    }

    public static boolean mk() {
        return oo.get() == 1;
    }

    public static void vy(Context context) {
        try {
            AtomicInteger atomicInteger = oo;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.dax.oo.pcc().gm();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            oo.set(2);
        }
    }

    public static boolean kj(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static void pcc(StringBuilder sb, String str, String str2) {
        int indexOf;
        if (sb == null || TextUtils.isEmpty(str) || (indexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(indexOf, str.length() + indexOf, str2);
    }

    public static int ork(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = pcc;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(queryIntentActivities.size());
        pcc = valueOf;
        return valueOf.intValue();
    }

    public static com.bytedance.sdk.openadsdk.common.vj pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, com.bytedance.sdk.component.vy.qf qfVar, Context context, String str) {
        int jmx = ofVar.jmx();
        if (ofVar == null || !ofVar.zpi() || (jmx != 1 && jmx != 3)) {
            return null;
        }
        qfVar.pcc(true, (View) new com.bytedance.sdk.openadsdk.common.oo(context));
        return new com.bytedance.sdk.openadsdk.common.vj(ofVar, qfVar, str, false);
    }

    public static void pcc(JSONObject jSONObject) {
        int intValue;
        try {
            Pair<String, Long> oo2 = com.bytedance.sdk.openadsdk.core.ork.oo("oem_store");
            int i = -1;
            if (oo2 != null && ((intValue = Integer.valueOf((String) oo2.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) oo2.second).longValue() < com.bytedance.sdk.openadsdk.yt.vj.pcc("oem_store_state_time", 259200000))) {
                i = intValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, com.bytedance.sdk.component.vy.qf qfVar) {
        pcc(ofVar, qfVar, false);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, com.bytedance.sdk.component.vy.qf qfVar, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.kj qy;
        List<Integer> list;
        if (ofVar == null || qfVar == null) {
            return;
        }
        int jmx = ofVar.jmx();
        if (ofVar.zpi() && ((jmx == 2 || jmx == 3 || jmx == 5) && (qy = ofVar.qy()) != null)) {
            List<Integer> wh2 = qy.wh();
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (int i = 0; i < wh2.size(); i++) {
                    arrayList.add(Integer.valueOf(wh2.get(i).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = wh2;
            }
            qfVar.pcc(true, qy.oo(), qy.vj(), list, qy.qf(), qy.gm());
        }
        int rq = ofVar.rq();
        long wsb = ofVar.wsb();
        if ((rq == 1 || rq == 2) && wsb > 0) {
            qfVar.pcc(rq, wsb);
        }
    }

    public static boolean oo(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        return ofVar != null && ofVar.az() == 3 && ofVar.zpi() && (ofVar.jmx() == 4 || ofVar.jmx() == 5);
    }

    public static String atb() {
        String str = gbb;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(tmg);
        gbb = str2;
        return str2;
    }

    public static String ye() {
        String str = jr;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(hc);
        jr = str2;
        return str2;
    }

    public static int pcc(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            int size = copyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject pcc(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static int lq() {
        return gm.pcc;
    }

    private static class gm {
        private static final int pcc;

        static {
            Class<?> cls;
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i = 2;
            try {
                cls = Class.forName("androidx.recyclerview.widget.RecyclerView$ViewHolder");
            } catch (ClassNotFoundException unused) {
            } catch (NoSuchMethodException unused2) {
            }
            if (cls != null) {
                if (cls.getDeclaredMethod("getBindingAdapterPosition", new Class[0]) != null) {
                    i = 0;
                }
                pcc = i;
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
            }
            i = 1;
            pcc = i;
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
        }
    }
}

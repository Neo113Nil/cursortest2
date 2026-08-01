package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.U3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class mk {
    public static boolean pcc = false;
    public static boolean sf = false;
    private static String vj = null;
    private static int wh = Integer.MAX_VALUE;
    private static final CharSequence gm = "amigo";
    private static final CharSequence oo = "funtouch";
    private static final ConcurrentHashMap<String, String> qf = new ConcurrentHashMap<>();

    public static String pcc() {
        if (!TextUtils.isEmpty(vj)) {
            return vj;
        }
        String pcc2 = com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_local_rom_info", 604800000L);
        vj = pcc2;
        if (TextUtils.isEmpty(pcc2)) {
            String of = of();
            vj = of;
            com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_local_rom_info", of);
        }
        return vj;
    }

    public static boolean sf() {
        try {
            String pcc2 = pcc();
            if (TextUtils.isEmpty(pcc2) || !pcc2.startsWith("miui")) {
                return false;
            }
            String str = Build.VERSION.INCREMENTAL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.toLowerCase().startsWith("v12");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String of() {
        if (dax()) {
            return nac();
        }
        if (wh()) {
            return hc();
        }
        if (gm()) {
            return lu();
        }
        if (gpj()) {
            return lo();
        }
        String gbb = gbb();
        if (!TextUtils.isEmpty(gbb)) {
            return gbb;
        }
        if (kj()) {
            return qf();
        }
        if (vy()) {
            return ork();
        }
        if (vj()) {
            return oo();
        }
        String vh = vh();
        return !TextUtils.isEmpty(vh) ? vh : Build.DISPLAY;
    }

    public static boolean gm() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String oo() {
        return oo("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean vj() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean wh() {
        if (!sf) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    pcc = true;
                    sf = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            sf = true;
        }
        return pcc;
    }

    public static String qf() {
        return oo("ro.vivo.os.build.display.id") + "_" + oo("ro.vivo.product.version");
    }

    public static boolean kj() {
        String oo2 = oo("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(oo2) && oo2.toLowerCase().contains(oo);
    }

    public static boolean vy() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(gm);
    }

    public static String ork() {
        return Build.DISPLAY + "_" + oo("ro.gn.sv.version");
    }

    public static String vh() {
        if (tmg()) {
            return "eui_" + oo("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean tmg() {
        return !TextUtils.isEmpty(oo("ro.letv.release.version"));
    }

    public static String hc() {
        if (wh()) {
            return "miui_" + oo("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static String gbb() {
        String jr = jr();
        if (jr != null && jr.toLowerCase().contains("emotionui")) {
            return jr + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String jr() {
        return oo("ro.build.version.emui");
    }

    public static boolean dax() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String nac() {
        if (dax()) {
            try {
                return "smartisan_".concat(String.valueOf(oo("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String lu() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean gpj() {
        if (wh == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String vy = kun.vy("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(vy)) {
                wh = 1;
            } else {
                wh = 0;
            }
        }
        return wh == 1;
    }

    public static String lo() {
        if (gpj()) {
            return "coloros_" + oo(kun.vy("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean fum() {
        try {
            if (TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) {
                if (TextUtils.isEmpty(Build.MANUFACTURER)) {
                    return false;
                }
                if (!Build.MANUFACTURER.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            str = jr();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || fum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String gm(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        Process exec;
        String str2 = "";
        Process process = null;
        try {
            try {
                try {
                    exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
                    } catch (IllegalThreadStateException unused) {
                        bufferedReader = null;
                    }
                } catch (IOException e) {
                    com.bytedance.sdk.component.utils.lo.pcc("ToolUtils", "Exception while closing InputStream", e);
                }
            } catch (IllegalThreadStateException unused2) {
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            str2 = bufferedReader.readLine();
            exec.exitValue();
            bufferedReader.close();
        } catch (IllegalThreadStateException unused3) {
            process = exec;
            try {
                process.destroy();
            } catch (Throwable unused4) {
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return str2;
        } catch (Throwable th3) {
            th = th3;
            try {
                com.bytedance.sdk.component.utils.lo.pcc("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                return str2;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        com.bytedance.sdk.component.utils.lo.pcc("ToolUtils", "Exception while closing InputStream", e2);
                    }
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String oo(String str) {
        String str2;
        new Object[]{"getSystemPropertyTask() called with: propName = [", str, U3.j.e};
        String str3 = qf.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.kj.sf.sf sfVar = new com.bytedance.sdk.component.kj.sf.sf(new pcc(str), 5, 2);
            rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.mk.1
                @Override // java.lang.Runnable
                public void run() {
                    sfVar.run();
                }
            });
            str2 = (String) sfVar.get(1L, TimeUnit.SECONDS);
            return str2 != null ? "" : str2;
        }
        str2 = "";
        if (str2 != null) {
        }
    }

    public static class pcc implements Callable<String> {
        private final String pcc;

        public pcc(String str) {
            this.pcc = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) mk.qf.get(this.pcc);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String gm = mk.gm(this.pcc);
            System.currentTimeMillis();
            if (gm != null) {
                mk.qf.put(this.pcc, gm);
            }
            return gm;
        }
    }
}

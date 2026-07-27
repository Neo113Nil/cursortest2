package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.adjust.sdk.Constants;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj {
    private static final AtomicReference<Boolean> pcc = new AtomicReference<>(null);
    private static final AtomicReference<String> sf = new AtomicReference<>(null);

    public static void pcc(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (sf()) {
                com.bytedance.sdk.openadsdk.core.gm pcc2 = com.bytedance.sdk.openadsdk.core.gm.pcc();
                pcc2.pcc("w_ver", vj(context));
                pcc2.pcc("bp", sf(context));
                pcc2.pcc("is_fold", qf(context) ? 1 : 0);
                pcc2.pcc("abi", pcc());
                pcc2.pcc("t_ver", gm(context));
                pcc2.pcc(CampaignEx.JSON_KEY_AAB, oo(context));
            }
        } catch (Throwable unused) {
        }
    }

    public static int sf(Context context) {
        if (kj(context)) {
            return 1;
        }
        if (vy(context)) {
            return 2;
        }
        return ork(context) ? 3 : 4;
    }

    private static boolean kj(Context context) {
        try {
            return Class.forName("com.unity3d.player.UnityPlayerActivity") != null;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean vy(Context context) {
        try {
            return Class.forName("io.flutter.embedding.android.FlutterActivity") != null;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean ork(Context context) {
        try {
            return Class.forName("com.facebook.react.ReactActivity") != null;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static String gm(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int oo(Context context) {
        try {
            return Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager") != null ? 1 : 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static String vj(Context context) {
        String str;
        try {
            AtomicReference<String> atomicReference = sf;
            String str2 = atomicReference.get();
            if (str2 != null) {
                return str2;
            }
            PackageInfo wh = wh(context);
            if (wh == null) {
                str = "";
            } else {
                str = wh.versionName;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, str);
            return str;
        } catch (Throwable unused) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(sf, null, "");
            return "";
        }
    }

    public static PackageInfo wh(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
            return packageInfo != null ? packageInfo : vh(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static PackageInfo vh(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean qf(Context context) {
        boolean z;
        boolean z2;
        char c;
        try {
            AtomicReference<Boolean> atomicReference = pcc;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                str = str.toLowerCase();
            }
            String str2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.toLowerCase();
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, Boolean.FALSE);
                return false;
            }
            char c2 = 65535;
            if (TextUtils.isEmpty(str)) {
                z = false;
                z2 = false;
            } else {
                switch (str.hashCode()) {
                    case -759499589:
                        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3418016:
                        if (str.equals("oppo")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3620012:
                        if (str.equals(Constants.REFERRER_API_VIVO)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1864941562:
                        if (str.equals(Constants.REFERRER_API_SAMSUNG)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    z = vy();
                } else if (c == 1) {
                    z = wh();
                } else if (c == 2) {
                    z = vj();
                } else if (c != 3) {
                    z = false;
                    z2 = true;
                } else {
                    z = oo();
                }
                z2 = false;
            }
            if (z2 && !TextUtils.isEmpty(str2)) {
                switch (str2.hashCode()) {
                    case -759499589:
                        if (str2.equals(Constants.REFERRER_API_XIAOMI)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3418016:
                        if (str2.equals("oppo")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3620012:
                        if (str2.equals(Constants.REFERRER_API_VIVO)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1864941562:
                        if (str2.equals(Constants.REFERRER_API_SAMSUNG)) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    z = vy();
                } else if (c2 == 1) {
                    z = wh();
                } else if (c2 == 2) {
                    z = vj();
                } else {
                    z = c2 != 3 ? false : oo();
                }
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, Boolean.valueOf(z));
            return z;
        } catch (Throwable unused) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(pcc, null, Boolean.FALSE);
            return false;
        }
    }

    private static boolean oo() {
        String lowerCase;
        if (vh()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase2 = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase2)) {
                for (int i = 0; i < 12; i++) {
                    if (lowerCase2.contains(strArr2[i])) {
                        return true;
                    }
                }
            }
            lowerCase = Build.MODEL.toLowerCase();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        for (int i2 = 0; i2 < 12; i2++) {
            if (lowerCase.contains(strArr[i2])) {
                return true;
            }
        }
        if (sf()) {
            String pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("fold_config", "fold_samung", "");
            if (TextUtils.isEmpty(pcc2)) {
                return false;
            }
            for (String str : pcc2.split(",")) {
                if (lowerCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean vj() {
        if (kj()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 6; i++) {
                    if (lowerCase.contains(strArr[i])) {
                        return true;
                    }
                }
                if (sf()) {
                    String gm = gm();
                    if (TextUtils.isEmpty(gm)) {
                        return false;
                    }
                    for (String str : gm.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean wh() {
        if (qf()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 7; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (sf()) {
                    String gm = gm();
                    if (TextUtils.isEmpty(gm)) {
                        return false;
                    }
                    for (String str : gm.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean qf() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }

    private static boolean kj() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean vy() {
        if (ork()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 9; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (sf()) {
                    String gm = gm();
                    if (TextUtils.isEmpty(gm)) {
                        return false;
                    }
                    for (String str : gm.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ork() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e) {
            e = e;
            com.bytedance.sdk.component.utils.lo.gm("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            com.bytedance.sdk.component.utils.lo.gm("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (NoSuchMethodException e3) {
            e = e3;
            com.bytedance.sdk.component.utils.lo.gm("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (InvocationTargetException e4) {
            e = e4;
            com.bytedance.sdk.component.utils.lo.gm("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String pcc() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void pcc(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (sf()) {
                com.bytedance.sdk.openadsdk.core.gm pcc2 = com.bytedance.sdk.openadsdk.core.gm.pcc();
                String sf2 = pcc2.sf(L6.u, com.bytedance.sdk.openadsdk.core.ork.sf().qf());
                if (!TextUtils.isEmpty(sf2)) {
                    jSONObject.put(L6.u, sf2);
                }
                int sf3 = pcc2.sf("bp", sf(context));
                if (sf3 != 4) {
                    jSONObject.put("bp", sf3);
                }
                String sf4 = pcc2.sf("t_ver", gm(context));
                if (!TextUtils.isEmpty(sf4)) {
                    jSONObject.put("t_ver", sf4);
                }
                jSONObject.put("is_fold", pcc2.sf("is_fold", qf(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, pcc2.sf(CampaignEx.JSON_KEY_AAB, oo(context)));
                String sf5 = pcc2.sf("abi", pcc());
                if (TextUtils.isEmpty(sf5)) {
                    return;
                }
                jSONObject.put("abi", sf5);
            }
        } catch (Throwable unused) {
        }
    }

    public static void sf(JSONObject jSONObject, Context context) {
        try {
            if (sf()) {
                String sf2 = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("w_ver", vj(context));
                if (TextUtils.isEmpty(sf2)) {
                    return;
                }
                jSONObject.put("w_ver", sf2);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean vh() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object invoke = cls.getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(invoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(invoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.lo.gm("PAG_BANNER", "get ss fold device error: " + e.getMessage());
            return false;
        }
    }

    public static boolean sf() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("fold_config", a.k, 0) == 1;
    }

    public static String gm() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("fold_config", "fold_default", "");
    }
}

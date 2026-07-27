package com.bytedance.sdk.component.adexpress.dynamic.vj;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.vj.sf;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.component.utils.tz;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh {
    private static final Set<String> pcc = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String sf;

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:185|(1:188)|189)(2:214|(1:216)(5:217|191|(5:201|202|203|(3:205|(1:211)(1:208)|209)|212)|199|200))|190|191|(3:193|195|197)|201|202|203|(0)|212) */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0464 A[Catch: Exception -> 0x0475, JSONException -> 0x0479, TryCatch #2 {JSONException -> 0x0479, blocks: (B:162:0x03a9, B:164:0x03d7, B:166:0x03dc, B:168:0x03e4, B:176:0x03f9, B:178:0x0400, B:180:0x040c, B:182:0x0414, B:185:0x041b, B:189:0x0425, B:191:0x0439, B:193:0x0441, B:195:0x0447, B:197:0x044f, B:199:0x0475, B:203:0x0459, B:205:0x0464, B:209:0x046e, B:214:0x042e), top: B:161:0x03a9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sf.gm pcc(String str, String str2, String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, double d, int i2, double d2, String str4, hc hcVar) {
        String str5;
        int i3;
        int i4;
        int i5;
        float optDouble;
        float optDouble2;
        float optDouble3;
        float f;
        float f2;
        float f3;
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj;
        String str6 = str;
        int i6 = i;
        String oo = hcVar.oo();
        int qf = hcVar.qf();
        if (com.bytedance.sdk.component.adexpress.oo.sf() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new sf.gm(0.0f, 0.0f);
        }
        sf.gm gmVar = new sf.gm();
        if (str6.startsWith("<svg") || pcc.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.oo.sf() && "close-fill".equals(str2))) {
                    float optDouble4 = (float) new JSONObject(str3).optDouble("fontSize");
                    gmVar.pcc = optDouble4;
                    gmVar.sf = optDouble4;
                    return gmVar;
                }
            } catch (Exception unused) {
            }
            gmVar.pcc = 10.0f;
            gmVar.sf = 10.0f;
            return gmVar;
        }
        if ("logo".equals(str2)) {
            if (!com.bytedance.sdk.component.adexpress.oo.sf() && ((!TextUtils.isEmpty(str) && str6.contains("adx:")) || sf())) {
                if (sf()) {
                    return pcc(gmVar, str6, str3, sf);
                }
                return pcc(gmVar, str6, str3, "");
            }
            gmVar.pcc = "union".equals(str6) ? 14.0f : 20.0f;
            gmVar.sf = 10.0f;
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                String tsz = hcVar.tsz();
                if ("union".equals(str6) && TextUtils.isEmpty(tsz)) {
                    gmVar.pcc = 0.0f;
                }
                String str7 = str2 + str6;
                float sf2 = (float) sf(str3);
                if (str7.contains("logoad")) {
                    String mk = hcVar.mk();
                    if (TextUtils.isEmpty(mk)) {
                        gmVar.pcc = 0.0f;
                    } else {
                        return pcc(mk, str3);
                    }
                }
                gmVar.sf = sf2;
            }
            return gmVar;
        }
        if ("development-name".equals(str2)) {
            str5 = "";
            str6 = tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_text_privacy_development") + str6;
        } else {
            str5 = "";
        }
        if ("app-version".equals(str2)) {
            i3 = qf;
            str6 = tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_text_privacy_app_version") + str6;
        } else {
            i3 = qf;
        }
        if ("score-count".equals(str2)) {
            try {
                i4 = Integer.parseInt(str6);
            } catch (NumberFormatException unused2) {
                i4 = 0;
            }
            if (com.bytedance.sdk.component.adexpress.oo.sf() && i4 < 0) {
                return new sf.gm(0.0f, 0.0f);
            }
            return pcc("(" + String.format(tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_comment_num"), Integer.valueOf(i4)) + ")", str3);
        }
        if ("score-count-type-2".equals(str2)) {
            try {
                i5 = Integer.parseInt(str6);
            } catch (NumberFormatException unused3) {
                i5 = 0;
            }
            if (com.bytedance.sdk.component.adexpress.oo.sf() && i5 < 0) {
                return new sf.gm(0.0f, 0.0f);
            }
            return pcc("(" + String.format(new DecimalFormat("###,###,###").format(i5), Integer.valueOf(i5)) + ")", str3);
        }
        if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.oo.sf()) {
            sf.gm gmVar2 = new sf.gm();
            float sf3 = (float) sf(str3);
            gmVar2.pcc = sf3;
            gmVar2.sf = sf3;
            return gmVar2;
        }
        if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
            if (!hcVar.pcc() || !com.bytedance.sdk.component.adexpress.oo.wh.sf(oo)) {
                if (d < 10.0d) {
                    return pcc("0S", str3);
                }
                return pcc("00S", str3);
            }
            if (((int) (d + 0.5d)) - i3 < 10) {
                if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
                    return pcc(String.format(tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip"), "0"), str3);
                }
                return pcc("0s", str3);
            }
            if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
                return pcc(String.format(tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip"), "00"), str3);
            }
            return pcc("00s", str3);
        }
        if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
            return pcc("| " + tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_screen_skip_tx"), str3);
        }
        if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
            return pcc("| ".concat(String.valueOf(String.format(tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip_count_down"), "00"))), str3);
        }
        if ("skip-with-time-skip-btn".equals(str2)) {
            sf.gm pcc2 = pcc("| " + tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_screen_skip_tx"), str3);
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                try {
                    pcc2.sf = (float) ((pcc2.sf * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                } catch (Throwable unused4) {
                }
                pcc2.pcc = pcc2.sf;
            }
            return pcc2;
        }
        if ("skip".equals(str2)) {
            return pcc(tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_screen_skip_tx"), str3);
        }
        if ("timedown".equals(str2)) {
            return pcc(IdManager.DEFAULT_VERSION_NAME, str3);
        }
        if ("text_star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.oo.sf() && (d2 < 0.0d || d2 > 5.0d)) {
                return new sf.gm(0.0f, 0.0f);
            }
            return pcc(IdManager.DEFAULT_VERSION_NAME, str3);
        }
        if (TextUtils.equals("privacy-detail", str2)) {
            return pcc("Permission list | Privacy policy", str3);
        }
        if ("arrowButton".equals(str2)) {
            return pcc("Download", str3);
        }
        if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.oo.sf() && TextUtils.isEmpty(str6) && (vj = kjVar.ork().vj()) != null) {
            str6 = vj.gdh() != null ? kjVar.ork().vj().gdh().optString(com.bytedance.sdk.component.adexpress.oo.qf.gm(com.bytedance.sdk.component.adexpress.oo.pcc())) : str5;
        }
        if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && (!com.bytedance.sdk.component.adexpress.oo.sf() || !"open_ad".equals(oo))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
            return pcc(str6, str3);
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            int length = str6.length();
            optDouble = (float) jSONObject.optDouble("fontSize");
            float optDouble5 = (float) jSONObject.optDouble("letterSpacing");
            optDouble2 = (float) jSONObject.optDouble("lineHeight");
            optDouble3 = (float) jSONObject.optDouble("maxWidth");
            f = (length * (optDouble + optDouble5)) - optDouble5;
        } catch (JSONException unused5) {
        }
        if ("muted".equals(str2)) {
            gmVar.pcc = optDouble;
            gmVar.sf = optDouble;
            return gmVar;
        }
        if ("star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.oo.sf() && (d2 < 0.0d || d2 > 5.0d || i2 != 4)) {
                return new sf.gm(0.0f, 0.0f);
            }
            sf.gm pcc3 = pcc("str", str3);
            pcc3.pcc = optDouble * 5.0f;
            return pcc3;
        }
        if ("icon".equals(str2)) {
            gmVar.pcc = optDouble;
            gmVar.sf = optDouble;
            return gmVar;
        }
        if (z) {
            int i7 = ((int) (f / optDouble3)) + 1;
            if (z2 && i7 >= i6) {
                i7 = i6;
            }
            f2 = (float) (optDouble2 * optDouble * i7 * 1.2d);
        } else {
            f2 = (float) (optDouble2 * optDouble * 1.2d);
            if (f <= optDouble3) {
                f3 = f;
                if (!"title".equals(str2) || (com.bytedance.sdk.component.adexpress.oo.sf() && "open_ad".equals(oo) && "source".equals(str2))) {
                    sf.gm pcc4 = pcc(str6.replace('\n', ' '), str3, false);
                    if (z) {
                        int i8 = ((int) (f / optDouble3)) + 1;
                        if (!z2 || i8 < i6) {
                            i6 = i8;
                        }
                        pcc4.sf *= i6;
                    }
                    return pcc4;
                }
                gmVar.pcc = f3;
                gmVar.sf = f2;
                return gmVar;
            }
        }
        f3 = optDouble3;
        if (!"title".equals(str2)) {
        }
        sf.gm pcc42 = pcc(str6.replace('\n', ' '), str3, false);
        if (z) {
        }
        return pcc42;
    }

    public static String pcc(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static sf.gm pcc(sf.gm gmVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            gmVar.pcc = 0.0f;
            gmVar.sf = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = pcc(str);
            }
            if (TextUtils.isEmpty(str3)) {
                gmVar.pcc = 0.0f;
                gmVar.sf = 0.0f;
            } else {
                return pcc(str3, str2);
            }
        }
        return gmVar;
    }

    public static sf.gm pcc(String str, String str2) {
        return pcc(str, str2, false);
    }

    public static sf.gm pcc(String str, String str2, boolean z) {
        sf.gm gmVar = new sf.gm();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] pcc2 = pcc(str, (float) sf(str2), z);
            gmVar.pcc = pcc2[0];
            gmVar.sf = pcc2[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                gmVar.sf = 0.0f;
            }
        } catch (Exception unused) {
        }
        return gmVar;
    }

    public static double sf(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] pcc(String str, float f, boolean z) {
        int[] sf2 = sf(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), sf2[0]), com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), sf2[1])};
    }

    public static int[] sf(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.oo.pcc());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static String pcc() {
        return sf;
    }

    public static boolean sf() {
        return !TextUtils.isEmpty(sf);
    }
}

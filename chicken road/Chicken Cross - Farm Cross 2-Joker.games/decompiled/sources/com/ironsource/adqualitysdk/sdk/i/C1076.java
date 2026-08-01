package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ℓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1076 extends AbstractC0599 {
    static {
        StringFog.decrypt("0+XvrzgFWznl9uSlBg==\n", "oICBy3J2NFc=\n");
        StringFog.decrypt("qKQgbtgzos+MuDRKwDKpyQ==\n", "ycBEK65WzLs=\n");
        StringFog.decrypt("hJnMrlMM1aGAiNef\n", "4/y47Txiu8Q=\n");
        StringFog.decrypt("X61UPoskCVVAvA==\n", "OMggfeRKfTA=\n");
        StringFog.decrypt("y9qE4T4org==\n", "rL/wtVdFyzs=\n");
        StringFog.decrypt("2BrHTEnKxarQCtBo\n", "v3+zACi5sf4=\n");
        StringFog.decrypt("+RtFLdAK5vjxC1IJ5RD/yQ==\n", "nn4xYbF5kqw=\n");
        StringFog.decrypt("qDiDuP2Pn/ehKbaY/JSb+7sk\n", "z133+4j97ZI=\n");
        StringFog.decrypt("a+XY0h7Rl/9t9snaHNGd4274\n", "CJe9s2q01I0=\n");
        StringFog.decrypt("C7md1GO9b0EerorBfqtLVyGlnto=\n", "aMv4tRfYLiU=\n");
        StringFog.decrypt("r1G1XcA+foGpQqRVwj50l78=\n", "zCPQPLRbPfM=\n");
        StringFog.decrypt("5MPmrEiJZRnj2OK5VYNGOObF4g==\n", "h7GDzTzsKHw=\n");
        StringFog.decrypt("D5lldYUAkKIaj3hJjw==\n", "aPwRJuFrxsc=\n");
        StringFog.decrypt("7ZUjsvxvot3umwGR+3Cn4eQ=\n", "ivBX9IkDzo4=\n");
        StringFog.decrypt("hXNgaj5sPUWDRXBSB2YiWot5eg==\n", "4hYUOVEDUCk=\n");
        StringFog.decrypt("DKTtooA7tDEak/Smiiw=\n", "btaCw+RY1UI=\n");
        StringFog.decrypt("1/ZOSdZZ4PLi9ldnxVnN6d71U28=\n", "sJM6CLE8joY=\n");
        StringFog.decrypt("lJ39JbBDRneRju0osGN0d5mb0jerSA==\n", "9++YRMQmAhI=\n");
        StringFog.decrypt("dOLaTvHPWTtw88F/yMRFLXrowA==\n", "E4euDZ6hN14=\n");
        StringFog.decrypt("Ss4bmcOZdjM=\n", "JqF83LX8GEc=\n");
        StringFog.decrypt("8NLrcgDjC4j80sxbBM4A\n", "maG4FmuqZdw=\n");
        StringFog.decrypt("hg4t1Kyn/YqELzzmq4HtipUCNvs=\n", "4WtZlcjzhPo=\n");
        StringFog.decrypt("ek2HDFc1iuxzXLAgTCmd6mlHgQFDKp0=\n", "HSjzTyJH+Ik=\n");
        StringFog.decrypt("soDsUHAOmNq7kdR6dgiP0bCX1nJoGQ==\n", "1eWYEwV86r8=\n");
        StringFog.decrypt("ZtVdopqPZINJyWyukbpoimvjcKyWhWiA\n", "D6YezfTpDeQ=\n");
        StringFog.decrypt("7UtDUEgMzrztYFhaShLtrf5cVlZRB8ah2ktFcEIM3A==\n", "ii43EydiqNU=\n");
        StringFog.decrypt("SQOXgCdIjglHC4arK3uEFUgPhA==\n", "LmbjxV8463s=\n");
        StringFog.decrypt("REhHxbcL2HRKQFbuuy7OY1F5XOuqFQ==\n", "Iy0zgM97vQY=\n");
        StringFog.decrypt("jnhRRzHle2iAcEBsPcFse4BpVg==\n", "6R0lAkmVHho=\n");
        StringFog.decrypt("iNbIcfhKNNyG3tla9G4jz4bH\n", "77O8NIA6Ua4=\n");
        StringFog.decrypt("05b7om2rJQvbndueY704\n", "tPOP8QjYVmI=\n");
        StringFog.decrypt("9AJcRUgMpFDyE0k=\n", "k2coCC14xRQ=\n");
        StringFog.decrypt("Mk/n8J+jtlE/b9Hmj7+rWg==\n", "Wzy0lfzWxDQ=\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:10:0x0019, B:16:0x002c, B:18:0x003c, B:23:0x0023), top: B:9:0x0019 }] */
    /* renamed from: ﬤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5839() {
        boolean z;
        if (!AbstractC0398.m5397().mo5403()) {
            return true;
        }
        C1198 c1198 = C1198.f3392;
        if (c1198.f3394 || c1198.f3395 == null) {
            return false;
        }
        try {
            C1236 c1236 = c1198.f3395;
            C0460 c0460 = C0874.f2494.f2497;
            C1236 m5450 = c0460 == null ? null : c0460.m5450();
            if (c1236 != null && m5450 != null) {
                z = m5450.m5937().equals(c1236.m5937());
                if (!z) {
                    c1198.f3394 = true;
                }
                return z;
            }
            z = false;
            if (!z) {
            }
            return z;
        } catch (Exception e) {
            String str = C1198.f3393;
            AbstractC0544.m5511(str, str, StringFog.decrypt("5WTTUlGSWo3BYtlfS5ldm89/3gtb10qWzW7cX0SWQJLNaQ==\n", "qA23fyL3Kf4=\n"), e, null, false);
            c1198.f3394 = true;
            return false;
        }
    }

    /* renamed from: טּ, reason: contains not printable characters */
    public static boolean m5840() {
        return ((C0470) AbstractC0398.m5397()).f879;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public static boolean m5841() {
        return AbstractC0398.m5397().mo5404();
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    public static long m5842() {
        String str = AbstractC0494.f1141;
        return Calendar.getInstance().getTimeInMillis();
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static String m5843() {
        return IronSourceAdQuality.getSDKVersion();
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static String m5844() {
        JSONObject jSONObject;
        C0439 c0439;
        C0470 c0470 = (C0470) AbstractC0398.m5397();
        synchronized (c0470) {
            jSONObject = c0470.f3224;
        }
        if (!jSONObject.optBoolean(c0470.f901) || (c0439 = c0470.f874) == null) {
            return null;
        }
        return c0439.f595;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static HashMap m5845() {
        JSONObject jSONObject;
        C0470 c0470 = (C0470) AbstractC0398.m5397();
        synchronized (c0470) {
            jSONObject = c0470.f3224;
        }
        if (!jSONObject.optBoolean(c0470.f900) || c0470.f874 == null) {
            return null;
        }
        return new HashMap(c0470.f874.f597);
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static long m5846() {
        C0744 c0744;
        C1312 m5944 = C1312.m5944();
        synchronized (m5944) {
            c0744 = m5944.f3784;
        }
        return c0744.f2072;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static JSONObject m5847() {
        C0744 c0744;
        C1312 m5944 = C1312.m5944();
        synchronized (m5944) {
            c0744 = m5944.f3784;
        }
        return AbstractC0647.m5605(c0744.f2074, c0744.f2073, c0744.f2072, c0744.f2071);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static String m5848() {
        return ((C0470) AbstractC0398.m5397()).f886.m5491();
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static JSONObject m5849() {
        JSONObject jSONObject;
        C0521 c0521 = ((C0470) AbstractC0398.m5397()).f886;
        synchronized (c0521) {
            jSONObject = c0521.f3224;
        }
        return jSONObject.optJSONObject(C0521.f1184);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String m5850(C1226 c1226) {
        return c1226.f3477.f2809.m5527();
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static Activity m5852() {
        return AbstractC0554.m5521().mo5524();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String m5855(C1226 c1226) {
        return c1226.f3484.f314.f3776;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m5856(C1226 c1226) {
        return c1226.f3477.f2812.f3104;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C0627 m5859() {
        return new C0627();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static C0628 m5861() {
        return new C0628();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C0633 m5864() {
        return new C0633();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5870(C1226 c1226, ArrayList arrayList) {
        c1226.m5936((String) AbstractC0599.m5554(arrayList, 0, String.class), (JSONObject) AbstractC0599.m5554(arrayList, 1, JSONObject.class));
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static String m5853(C1226 c1226) {
        return c1226.f3477.f2809.mo5371();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Context m5858(C1226 c1226) {
        return c1226.f3477.f2808;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m5863(C1226 c1226) {
        return c1226.f3477.f2812.f3102;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C0969 m5865(C1226 c1226) {
        return c1226.f3477;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m5866(ArrayList arrayList) {
        return ISAdQualityAdType.fromInt(((Integer) AbstractC0599.m5554(arrayList, 0, Integer.class)).intValue()).name().toLowerCase();
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static JSONObject m5851() {
        JSONObject jSONObject;
        C0521 c0521 = ((C0470) AbstractC0398.m5397()).f886;
        synchronized (c0521) {
            jSONObject = c0521.f3224;
        }
        return jSONObject;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static double m5854() {
        JSONObject jSONObject;
        C0470 c0470 = (C0470) AbstractC0398.m5397();
        synchronized (c0470) {
            jSONObject = c0470.f3224;
        }
        return jSONObject.optDouble(c0470.f907, 1.0d);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m5857() {
        JSONObject jSONObject;
        AbstractC0398 m5397 = AbstractC0398.m5397();
        synchronized (m5397) {
            jSONObject = m5397.f3224;
        }
        return AbstractC0647.m5606(jSONObject, false);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5860(ArrayList arrayList) {
        String decrypt = StringFog.decrypt("eyvZBOSJFclDHMw6\n", "Ok+IcYXlfL0=\n");
        AbstractC0544.m5512(decrypt, decrypt, (String) AbstractC0599.m5554(arrayList, 0, String.class), true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5869(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        C0623 c0623 = (C0623) AbstractC0599.m5554(arrayList, 0, C0623.class);
        if (c0623 != null) {
            c1226.f3477.f2811.f563.add(new C1083(c0623, c1074, c1226));
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m5862(ArrayList arrayList) {
        JSONObject jSONObject;
        String str = (String) AbstractC0599.m5554(arrayList, 0, String.class);
        C0521 c0521 = ((C0470) AbstractC0398.m5397()).f886;
        synchronized (c0521) {
            jSONObject = c0521.f3224;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(C0521.f1184);
        if (optJSONObject == null) {
            return null;
        }
        return optJSONObject.opt(str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0488 m5867() {
        return new C0488();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5871(ArrayList arrayList) {
        C0682 c0682;
        String str = (String) AbstractC0599.m5554(arrayList, 0, String.class);
        List m5555 = AbstractC0599.m5555(arrayList, 1);
        C0932 m5751 = C0932.m5751();
        synchronized (m5751) {
            c0682 = m5751.f2613;
        }
        if (c0682 != null) {
            c0682.m5634(str, m5555);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5868(C1226 c1226) {
        return c1226.m5932();
    }
}

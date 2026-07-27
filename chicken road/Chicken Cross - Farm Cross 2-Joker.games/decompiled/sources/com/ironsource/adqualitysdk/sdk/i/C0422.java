package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʡ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0422 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1050 f564;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Handler f565;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C1095 f566;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f561 = StringFog.decrypt("qLPlUrCpMn+JoPI=\n", "7cWAPMT6VxE=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f560 = StringFog.decrypt("0kAs9Abzu8LWRw==\n", "syNYq3aSzrE=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f559 = StringFog.decrypt("6sZzFCVwhJDmwGM=\n", "i6UHS1cV9+U=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f558 = StringFog.decrypt("gpbuifwNykOXkP4=\n", "4/Wa1p9/ryI=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f557 = StringFog.decrypt("HSr/FaJHPQQILO8=\n", "fEmLStEzXHY=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f556 = StringFog.decrypt("QbhYzJIQ9qpQvkg=\n", "INssk+Fkmdo=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f555 = StringFog.decrypt("cgt50WgPpYJhB3TraA==\n", "E2gNjgxq1vY=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f554 = StringFog.decrypt("myLaRcLn+UaeHt1u0PLq\n", "+kGuGrGGjyM=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f563 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f562 = new HashSet();

    public C0422(Handler handler, C1050 c1050) {
        this.f564 = c1050;
        this.f565 = handler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5430(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f562) {
            String str5 = str3 + StringFog.decrypt("uw==\n", "gZGXuLYeSzw=\n") + str2;
            if (!this.f562.contains(str5) || z || AbstractC0398.m5397().mo5404()) {
                this.f562.add(str5);
                if (Math.random() * 100.0d >= m5429()) {
                    AbstractC0544.m5503(f561, StringFog.decrypt("x/jwzotu4JLt9qPZmkPhifH+8Y2PauGV97GujY514JWk5aPdi2/32/f58ciZdOuX5w==\n", "g5GDreochPs=\n"));
                    return;
                }
                this.f564.getClass();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(StringFog.decrypt("+ziDvRI=\n", "nkr33HWmA2A=\n"), str);
                    jSONObject2.put(StringFog.decrypt("gq6EmBc=\n", "59zp63CuL8k=\n"), str2);
                    jSONObject2.put(StringFog.decrypt("HbwFoGks\n", "eM5mzw1JwNw=\n"), str3);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject2.put(StringFog.decrypt("zcoU4RU=\n", "qLhnlX7ptxI=\n"), str4);
                    }
                    if (jSONObject != null) {
                        AbstractC0647.m5608(jSONObject2, jSONObject, false);
                    }
                } catch (JSONException e) {
                    String str6 = C1050.f3117;
                    AbstractC0544.m5511(str6, str6, StringFog.decrypt("tRHm3Ua+p8eUCvrVFPu00Z8RtN9R7bXClwY=\n", "8GOUsjSexqM=\n"), e, null, false);
                }
                String decrypt = StringFog.decrypt("up4CwcyxBi0=\n", "zu5dpL7DaV8=\n");
                Iterator it = new HashSet(this.f563).iterator();
                while (it.hasNext()) {
                    JSONObject mo5674 = ((InterfaceC1014) it.next()).mo5674(decrypt, jSONObject2);
                    if (mo5674 != null) {
                        AbstractC0647.m5608(jSONObject2, mo5674, false);
                    }
                }
                this.f564.m5831(StringFog.decrypt("uG7R689k/DQ=\n", "zB6Ojr0Wk0Y=\n"), jSONObject2);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static double m5429() {
        JSONObject jSONObject;
        if (((C0470) AbstractC0398.m5397()).f879) {
            return 100.0d;
        }
        C0470 c0470 = (C0470) AbstractC0398.m5397();
        synchronized (c0470) {
            jSONObject = c0470.f3224;
        }
        return jSONObject.optDouble(StringFog.decrypt("39oH\n", "q793N0UVEd0=\n"), 5.0d);
    }
}

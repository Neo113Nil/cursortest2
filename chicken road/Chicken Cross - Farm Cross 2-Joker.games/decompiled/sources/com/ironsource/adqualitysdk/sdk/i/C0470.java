package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Τ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0470 extends AbstractC0398 {

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f869;

    /* renamed from: Ḽ, reason: contains not printable characters */
    public C0439 f874;

    /* renamed from: Ṿ, reason: contains not printable characters */
    public volatile long f875;

    /* renamed from: Ὑ, reason: contains not printable characters */
    public boolean f876;

    /* renamed from: Ῠ, reason: contains not printable characters */
    public ArrayList f877;

    /* renamed from: Ῡ, reason: contains not printable characters */
    public C0965 f878;

    /* renamed from: Ὺ, reason: contains not printable characters */
    public boolean f879;

    /* renamed from: Ύ, reason: contains not printable characters */
    public int f880;

    /* renamed from: K, reason: contains not printable characters */
    public boolean f881;

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public C1177 f882;

    /* renamed from: Ↄ, reason: contains not printable characters */
    public ArrayList f883;

    /* renamed from: く, reason: contains not printable characters */
    public ArrayList f884;

    /* renamed from: っ, reason: contains not printable characters */
    public C1175 f885;

    /* renamed from: へ, reason: contains not printable characters */
    public C0521 f886;

    /* renamed from: ゥ, reason: contains not printable characters */
    public C0679 f887;

    /* renamed from: ト, reason: contains not printable characters */
    public C0936 f888;

    /* renamed from: リ, reason: contains not printable characters */
    public L f889;

    /* renamed from: ヮ, reason: contains not printable characters */
    public Handler f890;

    /* renamed from: ヶ, reason: contains not printable characters */
    public C0516 f891;

    /* renamed from: 丫, reason: contains not printable characters */
    public C0482 f892;

    /* renamed from: 乁, reason: contains not printable characters */
    public final String f893;

    /* renamed from: 爫, reason: contains not printable characters */
    public final String f894;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public final int f895;

    /* renamed from: טּ, reason: contains not printable characters */
    public final int f896;

    /* renamed from: סּ, reason: contains not printable characters */
    public final int f897;

    /* renamed from: ףּ, reason: contains not printable characters */
    public final int f898;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final String f899;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final String f900;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f901;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f902;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final String f903;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String f904;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String f905;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String f906;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f907;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f908;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f909;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f910 = StringFog.decrypt("xoRC\n", "o+o0vBpxuQU=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f873 = StringFog.decrypt("iKLjHnrNNUS0oecW\n", "2seOcQ6odis=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f872 = StringFog.decrypt("LSQBaLT8piQ8Jg1utw==\n", "X0duBtKVwQo=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f871 = StringFog.decrypt("D9VG2Ig9LOUQiUzNwzsvqAnCStSZOi7pFcFO3A==\n", "e6cnu+1fTYY=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f870 = StringFog.decrypt("ozZgfqOvk061On12u+OKT7M2YXU=\n", "0FkPE8/Ovj0=\n");

    static {
        StringFog.decrypt("IeV4\n", "UoEUQ6tCJKM=\n");
        f869 = StringFog.decrypt("UdxW6Zr/6PcT31n9wN3j6FPWW/rb7Nn2WdJM6+D34eNOx1njxA==\n", "PbM4jrSejIY=\n");
    }

    public C0470() {
        StringFog.decrypt("8TuV\n", "lFbx9cnk3m4=\n");
        this.f909 = StringFog.decrypt("1Mgqow==\n", "t69G19f82WM=\n");
        this.f908 = StringFog.decrypt("e1e5qQ==\n", "GCTV3Ucvq1A=\n");
        this.f907 = StringFog.decrypt("o4orsw==\n", "zeNOwxxHRfI=\n");
        this.f906 = StringFog.decrypt("/KjN+Q==\n", "ndy5m6PJvHQ=\n");
        this.f905 = StringFog.decrypt("HDxsLQ==\n", "f08ASbWS4lQ=\n");
        this.f904 = StringFog.decrypt("rbBR\n", "3tw1S2ZVvD4=\n");
        this.f903 = StringFog.decrypt("5DWkSA==\n", "l1TVO+NFj1U=\n");
        this.f902 = StringFog.decrypt("qYqf\n", "yv38s5GzBsI=\n");
        this.f901 = StringFog.decrypt("Wmap\n", "LxXdqN2I0n0=\n");
        this.f900 = StringFog.decrypt("1BJy4w==\n", "uWYWl0AZ08I=\n");
        this.f899 = StringFog.decrypt("+a2O\n", "lMT9SCiJD9M=\n");
        TimeUnit timeUnit = TimeUnit.HOURS;
        timeUnit.toMillis(24L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        this.f898 = (int) timeUnit2.toMillis(5L);
        this.f897 = (int) timeUnit.toMillis(12L);
        this.f896 = (int) timeUnit2.toMillis(3L);
        this.f895 = (int) timeUnit2.toMillis(10L);
        this.f894 = StringFog.decrypt("y3bN\n", "rhiuSi+jbfE=\n");
        this.f893 = StringFog.decrypt("fgkQ\n", "SScgwFjmGVE=\n");
        this.f880 = 0;
        this.f877 = null;
        this.f876 = false;
        this.f875 = 0L;
    }

    /* renamed from: 乁, reason: contains not printable characters */
    public final synchronized void m5453() {
        this.f881 = false;
    }

    /* renamed from: 爫, reason: contains not printable characters */
    public final synchronized void m5454() {
        Handler handler = this.f890;
        if (handler != null) {
            handler.post(new C0514(this));
        }
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    public final boolean m5455() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(this.f894, false);
    }

    /* renamed from: טּ, reason: contains not printable characters */
    public final synchronized C0516 m5456() {
        return this.f891;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public final int m5457() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optInt(StringFog.decrypt("gxtetg==\n", "7ngyxGHlEpQ=\n"), 3);
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    public final void m5458() {
        if (mo5403()) {
            C1198 c1198 = C1198.f3392;
            c1198.getClass();
            try {
                if (c1198.f3395 != null) {
                    return;
                }
                synchronized (c1198) {
                    if (c1198.f3395 != null) {
                        return;
                    }
                    C0460 c0460 = C0874.f2494.f2497;
                    C1236 m5450 = c0460 == null ? null : c0460.m5450();
                    if (m5450 != null) {
                        c1198.f3395 = m5450;
                    }
                }
            } catch (Exception e) {
                String str = C1198.f3393;
                AbstractC0544.m5511(str, str, StringFog.decrypt("tVcMhOHbtDSFGRmS9cyuM5FcFpWmz7wpkFwc\n", "/Dl44Yap3UA=\n"), e, null, false);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﭖ */
    public final boolean mo5398() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(this.f905);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﭴ */
    public final synchronized void mo5399() {
        this.f890.removeCallbacksAndMessages(null);
        this.f890 = null;
        AbstractC1145.m5891(new C0549(this));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﭸ */
    public final boolean mo5400() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(this.f903);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﮉ */
    public final boolean mo5401() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(StringFog.decrypt("IDQApQ==\n", "UlJjxK+t920=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﮌ */
    public final boolean mo5402() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(StringFog.decrypt("kmhl\n", "4AwAppZ4Jtc=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﮐ */
    public final boolean mo5403() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(this.f899, false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﱟ */
    public final boolean mo5404() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optBoolean(StringFog.decrypt("qQeg\n", "zGHT4Ow753Q=\n"), false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﱡ */
    public final synchronized boolean mo5405() {
        return this.f881;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﺙ */
    public final String mo5406() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = m5877().optString(StringFog.decrypt("yKsC+A==\n", "rN9mjDXTRkY=\n"));
        return TextUtils.isEmpty(optString) ? this.f3223.f3327.optString(C1161.f3325, C1161.f3323) : optString;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﻐ */
    public final HashMap mo5407() {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        try {
            synchronized (this) {
                jSONObject = this.f3224;
            }
            String optString = jSONObject.optString(StringFog.decrypt("OsS2\n", "XqfF2xqJBCU=\n"));
            if (TextUtils.isEmpty(optString)) {
                return hashMap;
            }
            JSONObject jSONObject2 = new JSONObject(optString);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap2.put(next, new C1033(jSONObject2.optJSONObject(next)));
            }
            return hashMap2;
        } catch (JSONException e) {
            AbstractC0480.m5464(f873, StringFog.decrypt("VOGXOQx5EjIx9IAiPTYVMnTwkTkMKi8zVfqWNxw1Hg==\n", "EZPlVn5Ze1w=\n"), (Throwable) e, false);
            return hashMap;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﻛ */
    public final int mo5408() {
        int optInt;
        synchronized (this) {
            optInt = m5877().optInt(this.f904, 100);
        }
        return optInt;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ｋ */
    public final int mo5409() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optInt(this.f908, this.f895);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﾇ */
    public final String mo5410() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optString(StringFog.decrypt("wLY5\n", "o9FP9KaF5Ek=\n"), this.f893);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﾒ */
    public final void mo5412(Context context, C0516 c0516, C0965 c0965, C1177 c1177, boolean z) {
        JSONObject jSONObject;
        this.f892 = new C0482(context, f871, f870);
        this.f891 = c0516;
        this.f881 = false;
        this.f879 = z;
        this.f878 = c0965;
        this.f890 = new Handler(Looper.getMainLooper());
        C1161 c1161 = new C1161();
        this.f889 = new L(c1161);
        this.f888 = new C0936(c1161);
        this.f887 = new C0679(c1161);
        this.f886 = new C0521();
        String m5468 = this.f892.m5468(f872);
        if (m5468 != null) {
            try {
                jSONObject = new JSONObject(m5468);
            } catch (JSONException unused) {
            }
            mo5459(jSONObject);
            this.f3223 = c1161;
            this.f882 = c1177;
            this.f884 = new ArrayList();
            this.f883 = new ArrayList();
        }
        jSONObject = new JSONObject();
        mo5459(jSONObject);
        this.f3223 = c1161;
        this.f882 = c1177;
        this.f884 = new ArrayList();
        this.f883 = new ArrayList();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0398
    /* renamed from: ﾒ */
    public final void mo5411(Context context, C0439 c0439, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str = AbstractC0494.f1141;
        this.f875 = SystemClock.elapsedRealtime();
        this.f874 = c0439;
        if (z) {
            C0524 c0524 = new C0524(this);
            C0470 c0470 = (C0470) AbstractC0398.m5397();
            synchronized (c0470) {
                jSONObject2 = c0470.f3224;
            }
            AbstractC1145.m5894(c0524, jSONObject2.optInt(c0470.f909, c0470.f896));
        }
        m5453();
        JSONObject jSONObject3 = new JSONObject();
        try {
            String m5468 = this.f892.m5468(f869);
            jSONObject = new C0536(context, c0439, !TextUtils.isEmpty(m5468) ? Long.parseLong(m5468) : 0L).mo5493(new JSONObject(), m5456().f1171.m5449(), true, false);
        } catch (JSONException e) {
            String str2 = f873;
            AbstractC0544.m5511(str2, str2, StringFog.decrypt("4Uqzz4RfU4zBWbXJmBgQnMVLpICTCVWQ0A==\n", "pDjBoPZ/MP4=\n"), e, null, false);
            jSONObject = jSONObject3;
        }
        C0516 m5456 = m5456();
        C0965 c0965 = this.f878;
        String decrypt = StringFog.decrypt("7gwO0Q==\n", "h2JnpWtYGWc=\n");
        String str3 = c0965.f2803;
        StringBuilder sb = new StringBuilder();
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder append = sb.append(str3).append(StringFog.decrypt("AA==\n", "L4Vj7OYCT54=\n"));
        if (decrypt == null) {
            decrypt = "";
        }
        String sb2 = append.append(decrypt).toString();
        boolean z2 = m5455() && this.f880 != m5457();
        C0518 c0518 = new C0518(this, context, c0439);
        m5456.getClass();
        if (!TextUtils.isEmpty(sb2)) {
            C0575 c0575 = new C0575(jSONObject, sb2, c0439, context, z2);
            if (m5456.f1170) {
                AbstractC0544.m5502(C0516.f1169, StringFog.decrypt("XsKsLAqQuC9536gsAd6pYC3Erz8KlbhdaNy0LBaK/XhlyK9pK5upeGLfqgQEkLxoaN/hPgSN/Xxl\n2LUtComz\n", "Da3BSWX+3Q8=\n"));
                return;
            }
            C0517 c0517 = new C0517(m5456, c0518, c0575);
            String str4 = AbstractC0494.f1141;
            try {
                Executors.newSingleThreadExecutor().execute(c0517);
                return;
            } catch (Throwable th) {
                AbstractC0480.m5464(AbstractC0494.f1141, StringFog.decrypt("dEtqo30ULuFUWm24ZlosuVBKYaJsFD/4QlI=\n", "MTkYzA80S5k=\n"), th, false);
                return;
            }
        }
        String str5 = C0516.f1169;
        AbstractC0544.m5505(str5, str5, StringFog.decrypt("rdK+fJQmv2GXnK9xize/do3Pq3GVY+1wicm6bYxj+nyM1Lps2BbNWdjTrT6KJuxll9Kse7Ai8XGU\n2a0+jybtcNjSsGrYM+16jtW7e5w=\n", "+LzfHvhDnxU=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1102
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void mo5459(JSONObject jSONObject) {
        if (jSONObject.has(StringFog.decrypt("cxg/MNsK\n", "B2peWa95eyk=\n"))) {
            AbstractC0647.m5608(jSONObject, jSONObject.optJSONObject(StringFog.decrypt("JiaoN5/n\n", "UlTJXuuU+vY=\n")), false);
        }
        super.mo5459(jSONObject);
        this.f889.mo5459(jSONObject);
        this.f888.mo5459(jSONObject);
        this.f887.mo5459(jSONObject);
        this.f886.mo5459(jSONObject);
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0932 extends IronSourceAdQuality {

    /* renamed from: 丫, reason: contains not printable characters */
    public static C0932 f2602;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public C0872 f2605;

    /* renamed from: טּ, reason: contains not printable characters */
    public C0563 f2606;

    /* renamed from: ףּ, reason: contains not printable characters */
    public C0767 f2608;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public C0482 f2609;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C1050 f2610;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public C0516 f2611;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public ISAdQualityAdListener f2612;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public C0682 f2613;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public Context f2615;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public ISAdQualityConfig f2622;

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2604 = StringFog.decrypt("2dqucwD3CHHh7btN\n", "mL7/BmGbYQU=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2603 = StringFog.decrypt("eRNU0QLn\n", "Cnw7vG6GPwY=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0439 f2623 = new C0439();

    /* renamed from: ｋ, reason: contains not printable characters */
    public boolean f2621 = false;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f2620 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public boolean f2619 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f2618 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f2617 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public ISAdQualityLogLevel f2616 = ISAdQualityLogLevel.INFO;

    /* renamed from: סּ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f2607 = new CopyOnWriteArraySet();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final C0965 f2614 = new C0965();

    static {
        StringFog.decrypt("4DeJyNOwNbHhJJ6IyK0Rr/UEmsPJt2o=\n", "hUHspqfDUN8=\n");
        f2602 = null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m5749(C0932 c0932) {
        boolean z;
        synchronized (c0932) {
            z = c0932.f2618;
        }
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5750(C0932 c0932) {
        synchronized (c0932) {
            c0932.f2620 = false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5753(C0932 c0932, Context context) {
        c0932.getClass();
        try {
            context.registerReceiver(new C0967(), new IntentFilter(StringFog.decrypt("CUAgLMklezYBQDA7yDgxeQtaLTHIYl1ZPHoBDP8TXFApYAMb4g==\n", "aC5EXqZMHxg=\n")), null, AbstractC1145.f3287);
        } catch (Throwable th) {
            String str = f2604;
            AbstractC0544.m5511(str, str, StringFog.decrypt("Y09+7QqxvXtKDmXkCLzue0BcN+MOoelqV1c38wq2+GZTS2U=\n", "JS4XgW/VnQ8=\n"), th, null, true);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5756(C0932 c0932, boolean z) {
        synchronized (c0932) {
            c0932.f2618 = z;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void changeUserId(String str) {
        C0439 c0439;
        try {
            if (m5769(str)) {
                synchronized (this) {
                    c0439 = this.f2623;
                }
                boolean equals = str.equals(c0439.m5441());
                boolean z = !equals;
                boolean mo5522 = AbstractC0554.m5521().mo5522();
                if (!equals && mo5522) {
                    C1050 c1050 = this.f2610;
                    c1050.getClass();
                    AbstractC1145.m5892(new C1127(c1050));
                }
                m5767(this.f2615, str, z, true, mo5522);
            }
        } catch (Exception e) {
            AbstractC0480.m5465(f2604, AbstractC0548.m5514("SOTEADxsY3J54t8BKWxlZGjk/wtu\n", "DZa2b05MEBc=\n", new StringBuilder(), str), e, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str) {
        initializeWithGameId(context, str, null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        boolean z;
        synchronized (this) {
            z = this.f2619;
        }
        if (z) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("Azb3btWj0JMuM7kq1PDXmS139CzF6sKCKTj3adPm1ZMuIvxpjKPqpQEzyDzA78qCOXfKDeqj1Jcz\nd+oh1PfHmTc5tw==\n", "QFeZSaGDo/Y=\n"));
            return;
        }
        if (!m5761()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("oUAOcHijOlSMRUA0efA9Xo8BDTJo6ihFi04Od37mP1SMVAV3IaMAYqNFMSJt7yBFmwEzE0ejIELC\nTw8jLOonWJZIATtl+SxVzA==\n", "4iFgVwyDSTE=\n"));
            return;
        }
        this.f2606.getClass();
        if (iSAdQualityCustomMediationRevenue != null && iSAdQualityCustomMediationRevenue.getMediationNetwork() == ISAdQualityMediationNetwork.LEVEL_PLAY && iSAdQualityCustomMediationRevenue.getCustomData() != null && iSAdQualityCustomMediationRevenue.getCustomData().length() > 0) {
            C0563 c0563 = this.f2606;
            c0563.getClass();
            AbstractC1145.m5895(new C0572(c0563, iSAdQualityCustomMediationRevenue));
            return;
        }
        C0563 c05632 = this.f2606;
        c05632.getClass();
        if (iSAdQualityCustomMediationRevenue != null) {
            if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
                AbstractC0544.m5504(C0563.f1276, StringFog.decrypt("5uAMC8F78Z3L5UJPwCj2l8ihD0nRMuOMzO4MDMc+9J3L9AcWlSnnjsDvF0mVKOqX0O0GDNc+opbK\n709C0DzjjMz3Bw==\n", "pYFiLLVbgvg=\n"));
                return;
            }
            ISAdQualityMediationNetwork mediationNetwork = iSAdQualityCustomMediationRevenue.getMediationNetwork();
            if (mediationNetwork == null || TextUtils.isEmpty(C0563.m5530(mediationNetwork))) {
                AbstractC0544.m5504(C0563.f1276, StringFog.decrypt("WnhWoUl8gHV3fRjlSC+Hf3Q5VeNZNZJkcHZWpk85hXV3bF28HTGaY2pwVuEdMZZ0cHhM71Iy0358\nbU/pTzc=\n", "GRk4hj1c8xA=\n"));
                return;
            }
            ISAdQualityAdType adType = iSAdQualityCustomMediationRevenue.getAdType();
            if (adType != ISAdQualityAdType.INTERSTITIAL && adType != ISAdQualityAdType.VIDEO && adType != ISAdQualityAdType.REWARDED_VIDEO && adType != ISAdQualityAdType.REWARDED && (iSAdQualityCustomMediationRevenue.getMediationNetwork() != ISAdQualityMediationNetwork.LEVEL_PLAY || iSAdQualityCustomMediationRevenue.getCustomData() == null || iSAdQualityCustomMediationRevenue.getCustomData().length() <= 0)) {
                AbstractC0544.m5504(C0563.f1276, StringFog.decrypt("8FMNQjXsCpbdVkMGNL8NnN4SDgAlpRiH2l0NRTOpD5bdRwZfYb8Mg8NdEREkqFmS1xIXHDGpCtPS\nQAZFKKINlsFBFww1pRifnxIVDCWpFt+TQAYSIL4dltcSFQwlqRbT0lwHRTOpDpLBVgYB\n", "szJjZUHMefM=\n"));
                return;
            }
            AbstractC1145.m5896(new C0585(c05632, iSAdQualityCustomMediationRevenue), ((C0470) AbstractC0398.m5397()).f3223 != null ? r6.f3327.optInt(StringFog.decrypt("6kJvWw==\n", "iS8dP3cw278=\n"), 3000) : 3000);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        boolean z;
        synchronized (this) {
            z = this.f2619;
        }
        if (z) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("/GMb/iXre+fLIhS9cadh8ctnG7wj6yWi9lE0vQC+ae7Wdgz5Ao9DoshjBvkio332220Ct38=\n", "vwJ12VHLCII=\n"));
        } else {
            this.f2612 = iSAdQualityAdListener;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        boolean z;
        synchronized (this) {
            z = this.f2619;
        }
        if (z) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("dFeRZ8GZRWxDFpwv299fbhcb3wnm+FJYQleTKcHAFlpzfd831MoWel9DiyTazlgn\n", "Nzb/QLW5Ngk=\n"));
        } else if (m5763()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("WRkHJTSvdJpuWAptLulumDpVSUsTzmOubxkFazT2J6xeM0lrM69mk2gdCGY5r26RcwwAYyzmfZp+\nVg==\n", "GnhpAkCPB/8=\n"));
        } else {
            this.f2622 = iSAdQualityConfig;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setMetaData(String str, String str2) {
        boolean z;
        try {
            synchronized (this) {
                z = this.f2619;
            }
            if (z) {
                AbstractC0544.m5504(f2604, StringFog.decrypt("WVxh8vmBLwduHWKw+cB8BntJbvWggRUxW1leoOzNNRZjHVyRxoErA2kdfL341TgNbVMh\n", "Gj0P1Y2hXGI=\n"));
                return;
            }
            if (!m5761()) {
                AbstractC0544.m5504(f2604, StringFog.decrypt("7jOjeYa+ysaXNbgwn6LY3t4ms3mimPjW5im3NYK/wJLkGJ15ia7f3cU59jqKp9Xb2Tv2fpiuzf/S\nKLcdir/YlQ==\n", "t1zWWevLubI=\n"));
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (!AbstractC0552.f1251.contains(str)) {
                    if (AbstractC0552.m5520(m5764().f597, str)) {
                        AbstractC0544.m5504(f2604, StringFog.decrypt("JaS4ME8WPNo3ta1VCg==\n", "VsHMfSpiXZ4=\n") + str + StringFog.decrypt("IF3DJ00EZExjBYZ/AUEpDWwYjnJLBGQNdB7D\n", "AHHjGz9hAC0=\n") + 5 + StringFog.decrypt("OXjBJrEJYgdtdIQksUVzA2o7hBu3R2kUcHvDcr1Mcgc5ccUmsQlwB3VgwXw=\n", "GRWkUtApBmY=\n"));
                        return;
                    } else if (!AbstractC1191.m5916(str, 64) || !AbstractC1191.m5916(str2, 64)) {
                        AbstractC0544.m5504(f2604, StringFog.decrypt("aa/0UzKJ1Ix7vuE2dw==\n", "GsqAHlf9tcg=\n") + str + StringFog.decrypt("SPkI2T2XbmULoU2BcdIjJBy9TcUjl2RjHL0IiinSaGscvQiRJ5cqbw2sCIQhlipwALAIky6ef2FI\npkCKOp5uJAqwCIcqhn1hDbsI\n", "aNUo5U/yCgQ=\n") + 1 + StringFog.decrypt("W8ehZCQ=\n", "e6bPAAQ2D2g=\n") + 64 + StringFog.decrypt("HSPF7P7sre5YMt6j\n", "PUCtjYyNzpo=\n"));
                        return;
                    }
                }
                C0439 m5764 = m5764();
                if (str == null) {
                    m5764.getClass();
                } else if (str2 == null) {
                    m5764.f597.remove(str);
                } else {
                    m5764.f597.put(str, str2);
                }
                if (StringFog.decrypt("daHEkr9hVPpzqc+Pv2Ze4mWu\n", "AMCg4eASMYk=\n").equals(str)) {
                    m5764().f595 = str2;
                }
            }
        } catch (Exception e) {
            AbstractC0480.m5465(f2604, AbstractC0548.m5514("VXoMV1SqOYxkfBdWQaonjGRpXlxH/ivJ\n", "EAh+OCaKSuk=\n", new StringBuilder(), str), e, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setSegment(ISAdQualitySegment iSAdQualitySegment) {
        boolean z;
        synchronized (this) {
            z = this.f2619;
        }
        if (z) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("jZ7/TM9E5Dm63+IO3AnyMrrfvEvyN9Y4n4rwB9IQ7nydu9pLzAXkfL2X5B/fC+Ay4A==\n", "zv+Ra7tkl1w=\n"));
        } else {
            AbstractC1145.m5895(new C0950(this, iSAdQualitySegment));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setUserConsent(boolean z) {
        C0439 c0439;
        synchronized (this) {
            c0439 = this.f2623;
        }
        c0439.f601 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final synchronized void shutdown() {
        m5768(false);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized void m5758() {
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m5759() {
        if (m5760()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("EuRWMi+DVqElpVF7L8ZXqjDpGGE+0FHkPOpccHuOBY0CxFxELsJJrSX8GEYf6AWzMPYYZjPWUaA+\n8lY7\n", "UYU4FVujJcQ=\n"));
        } else if (m5761()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("FaATVX1IgYx4vA5VOEmKmTT1FEQuT8SVN7EFAT9egpcqsEBIM1KQkTm5CVs0VYPZ\n", "WNVgIV075Pg=\n"));
        } else {
            this.f2617 = true;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m5760() {
        return this.f2619;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized boolean m5761() {
        return this.f2621;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m5762() {
        return this.f2617;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            m5766((Application) context, (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m5766((Application) context.getApplicationContext(), (Activity) null, str, (String) null, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m5766(activity.getApplication(), activity, str, (String) null, iSAdQualityConfig);
        } else {
            String decrypt = StringFog.decrypt("Wx/EVk93K1N7OPxhWklkVnwl8Vt/biNFd2zmXXB2L0dmbORAeSInSmE4pVB7IiVZMjj8QnsiC1xm\nJfNbantlfmI86Vt9Yz5WfSI=\n", "EkyFMh4CSj8=\n");
            AbstractC0544.m5504(f2604, decrypt);
            m5757(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (context instanceof Application) {
            m5766((Application) context, (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m5766((Application) context.getApplicationContext(), (Activity) null, (String) null, str2, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            m5766(activity.getApplication(), activity, (String) null, str2, iSAdQualityConfig);
        } else {
            String decrypt = StringFog.decrypt("aT3f6iShYqRJGufdMZ8toU4H6ucUuGqyRU794RugZrBUTv/8EvRuvVMavuwQ9GyuABrn/hD0QqtU\nB+jnAa0siVAe8ucWtXehTwA=\n", "IG6ejnXUA8g=\n");
            AbstractC0544.m5504(f2604, decrypt);
            m5757(iSAdQualityConfig != null ? iSAdQualityConfig.getAdQualityInitListeners() : null, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0439 m5754(C0932 c0932) {
        C0439 c0439;
        synchronized (c0932) {
            c0439 = c0932.f2623;
        }
        return c0439;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m5763() {
        return this.f2620;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized C0439 m5764() {
        return this.f2623;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5766(Application application, Activity activity, String str, String str2, ISAdQualityConfig iSAdQualityConfig) {
        boolean z;
        ISAdQualityInitError iSAdQualityInitError;
        String str3;
        String decrypt;
        ISAdQualityInitError iSAdQualityInitError2;
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (this.f2622 == null) {
            z = true;
        } else {
            try {
                String str4 = iSAdQualityConfig.getMetaData().get(StringFog.decrypt("826O40ZuRy3NaJPTTQ==\n", "kgr/vC8ALlk=\n"));
                if (!TextUtils.isEmpty(str4)) {
                    z = new JSONObject(str4).optBoolean(StringFog.decrypt("nMUlhgeLDWWHxxSAG4cmSpbNJY8ciQ==\n", "9aJL6XXuUhU=\n"));
                }
            } catch (Throwable unused) {
            }
            z = false;
        }
        if (!z) {
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f2622, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        synchronized (this) {
            if (this.f2619) {
                iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN;
                str3 = StringFog.decrypt("fzgRCjn2hTVVLRZMIb+WPhx0X2Qel4gKSTgTRDmvzAh4El9aLKXMKFQsC0kioYJ1\n", "PFl/LU3W7Fs=\n");
            } else if (this.f2620) {
                iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                str3 = StringFog.decrypt("1xDxopGQmfT3N8mVhK7W8fAqxK+hiZHi+2PRqrKAmfznY9OnrImd/A==\n", "nkOwxsDl+Jg=\n");
            } else if (this.f2621) {
                iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                str3 = StringFog.decrypt("CvVpFH7QFisq0lFQfOE8ZyrIQQRGxBsuOcMIHUrRHygnhksRQYUVImPDUBVM0AMiJ4ZHHkPcVygt\nxU0=\n", "Q6YocC+ld0c=\n");
            } else {
                this.f2620 = true;
                iSAdQualityInitError = null;
                str3 = null;
            }
        }
        if (iSAdQualityInitError != null) {
            if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN) {
                AbstractC0544.m5504(f2604, str3);
            }
            m5757(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError, str3);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId()) && iSAdQualityConfig2.isUserIdSet()) {
            String decrypt2 = StringFog.decrypt("+Dds5bE65nfSImujqXP1fJsfUYOhS/p41z92u+VJy1KbIWu2rTrhbNc6Iq23Oup0yyJ74rBp6mub\nP2bs\n", "u1YCwsUajxk=\n");
            AbstractC0544.m5504(f2604, decrypt2);
            synchronized (this) {
                this.f2620 = false;
            }
            m5757(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, decrypt2);
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            if (str2 != null) {
                decrypt = StringFog.decrypt("9+dkiF4Rm/Pd8mPORliI+JSrKshLXJfU0KZpzkQWhr3W4yrBX12evdv0KspHQYbkmg==\n", "tIYKryox8p0=\n");
            } else {
                decrypt = StringFog.decrypt("HZvOdm9n5Xs3jskwdy72cH7XgDBrN8dwJ9rDMHVg+DU8n4A/bivgNTGIgDR2N/hscA==\n", "XvqgURtHjBU=\n");
            }
            if (str2 != null) {
                iSAdQualityInitError2 = ISAdQualityInitError.ILLEGAL_GAME_ID;
            } else {
                iSAdQualityInitError2 = ISAdQualityInitError.ILLEGAL_APP_KEY;
            }
            AbstractC0544.m5504(f2604, decrypt);
            synchronized (this) {
                this.f2620 = false;
            }
            m5757(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError2, decrypt);
            return;
        }
        synchronized (this) {
            this.f2607.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
        }
        AbstractC0393.m5394(application, activity);
        AbstractC1145.m5895(new C1022(this, iSAdQualityConfig2, str, str2, application, activity));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5752(C0932 c0932) {
        synchronized (c0932) {
            c0932.f2621 = true;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C0932 m5751() {
        synchronized (C0932.class) {
            if (f2602 == null) {
                f2602 = new C0932();
            }
        }
        return f2602;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5768(boolean z) {
        String str;
        String str2;
        C1033 c1033;
        try {
        } catch (Exception e) {
            AbstractC0480.m5465(f2604, StringFog.decrypt("ZuFSw6H3zdRW51TFvbCe2EzkTg==\n", "I5MgrNPXvrw=\n"), e, true, false, true);
        }
        if (m5760()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("86nLd3V7narTjvNAYEXcsduJqnJIfJmn3oOqYEx7iKLVjeQ9\n", "uvqKEyQO/MY=\n"));
            return;
        }
        if (!m5761()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("8qgjWMbFq/zSjxtv0/vq59qIQlLyxq/im5IMVePZq/zSgQdYt53q/tTbDFny1Ork1NsRVOLErv/M\nlUw=\n", "u/tiPJewypA=\n"));
            return;
        }
        String decrypt = StringFog.decrypt("Vk1XowOe56V2am/nAa/N6Wh/Zechg/O9e3FhqQ==\n", "Hx4Wx1Lrhsk=\n");
        if (z) {
            decrypt = decrypt + StringFog.decrypt("b8e9S3Al5qEe1K5IdHHe5T/NrlB7atWo\n", "T6HPJB0Fp8U=\n");
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "0EFyDbfh\n";
            str2 = "oyQAe9KTCN0=\n";
        } else {
            str = "6SVm\n";
            str2 = "mkENF9VUZDs=\n";
        }
        try {
            jSONObject.put(StringFog.decrypt("pg==\n", "1b0/iliLKg0=\n"), StringFog.decrypt(str, str2));
        } catch (JSONException unused) {
        }
        this.f2610.m5831(StringFog.decrypt("rV69xvk=\n", "2S7isoq+RwI=\n"), jSONObject);
        AbstractC0398 m5397 = AbstractC0398.m5397();
        String str3 = f2603;
        C0470 c0470 = (C0470) m5397;
        if (str3 != null) {
            c1033 = (C1033) c0470.mo5407().get(str3);
        } else {
            c0470.getClass();
            c1033 = null;
        }
        String str4 = c1033 != null ? c1033.f3067 : null;
        if (!TextUtils.isEmpty(str4)) {
            decrypt = decrypt + StringFog.decrypt("h2mVLRvQAIvGbZM3SdA=\n", "px78WXPwcu4=\n") + str4;
        }
        AbstractC0544.m5509(f2604, decrypt);
        m5757(this.f2607, ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, decrypt);
        this.f2619 = true;
        AbstractC0398.m5397().mo5399();
        C0780.m5666(this.f2615).m5668();
        this.f2613.m5626();
        C0516 c0516 = this.f2611;
        C0455 c0455 = c0516.f1171;
        c0455.f847.unregisterReceiver(c0455);
        c0516.f1170 = true;
        this.f2610.m5820();
        C0874.f2494.m5687();
        C0391.m5392();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5769(String str) {
        boolean z;
        synchronized (this) {
            z = this.f2619;
        }
        if (z) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("PMtDgKz3OkQexErC+KIqSQ2KRMP4+nllLOtJ9q22NUUL0w30nJx5Wx7ZDdSwoi1IEN1DiQ==\n", "f6otp9jXWSw=\n"));
            return false;
        }
        if (!m5761()) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("y0rIirYgXeuyTNPDrzxP8/tf2IqSBm/7w1DcxrIhV7/BYfaKuTBI8OBAncm6OUL2/EKdjbg9T/H1\nQOjZvidn+7U=\n", "kiW9qttVLp8=\n"));
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        AbstractC0544.m5504(f2604, StringFog.decrypt("r7ERHObWavXBvQIc8MRhoJX0BFmzy3rrjfQJTrPAYveVrQ==\n", "4dRmPJOlD4c=\n"));
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5767(Context context, String str, boolean z, boolean z2, boolean z3) {
        C0439 c0439;
        synchronized (this) {
            c0439 = this.f2623;
        }
        String m5441 = c0439.m5441();
        m5764().m5442(str);
        if (str == null) {
            AbstractC0544.m5504(f2604, StringFog.decrypt("z2Imnw7s0P75VQbwFYnQ4vkQGqUwod6r2lwRsS+o0ObrWxHwL7iC7qpEG/AsrIP4qlFUpj2hme+q\nXhu+caOF5+YQAaM5v9DCzhAAv3yEo8ruYQGxMKSE8qpjMJty\n", "ijB00FzN8Is=\n"));
        } else if (str.equals(StringFog.decrypt("/ekkqIlMo4mx/jKpzFKsgOg=\n", "nIdd3OElze4=\n"))) {
            AbstractC0544.m5504(f2604, AbstractC1196.m5920("HOd4Xz9PykI2wA1iCE6faDDbTTAZBo87PdBMcRgCnjssxk9iTSeuOw==\n", "WbUqEG1u6hs=\n", new StringBuilder(), str).append(StringFog.decrypt("2fcIqiRmLG3XujmtJCcsfYWyeLIuJy9phKR4p2FyMWGGoj3mNHQ6eteeHOYnaC0okrY7rmFyLG2F\n9yypYU4MSZOGLactbitx14QcjW8=\n", "99dYxkEHXwg=\n")).toString());
        } else {
            String str2 = f2604;
            AbstractC0544.m5512(str2, str2, AbstractC0548.m5514("5IA5ddY0AyPZvjlmmhQkG528CEzWCCMHz88FQ9YUI1id\n", "ve9MB/Z9UGI=\n", new StringBuilder(), str), true);
        }
        AbstractC0398 m5397 = AbstractC0398.m5397();
        C0970 c0970 = new C0970(this, z, context, z2, m5441, z3);
        C0470 c0470 = (C0470) m5397;
        Handler handler = c0470.f890;
        if (handler != null) {
            handler.post(new C0506(c0470, c0970));
        }
        JSONObject m5765 = m5765();
        if (m5765 != null) {
            AbstractC0398 m53972 = AbstractC0398.m5397();
            C0439 m5764 = m5764();
            C0470 c04702 = (C0470) m53972;
            c04702.f875 = 0L;
            c04702.f874 = m5764;
            c04702.mo5459(m5765);
            c04702.m5458();
            c04702.m5454();
            return;
        }
        AbstractC0398.m5397().mo5411(context, m5764(), true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m5765() {
        C0439 c0439;
        synchronized (this) {
            c0439 = this.f2623;
        }
        ConcurrentHashMap concurrentHashMap = c0439.f597;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(StringFog.decrypt("SlffBqbaKjd0UcI2rQ==\n", "KzOuWc+0Q0M=\n"))) {
            return null;
        }
        try {
            return new JSONObject((String) concurrentHashMap.get(StringFog.decrypt("eN1Lw57lhYBG21bzlQ==\n", "Gbk6nPeL7PQ=\n")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5755(C0932 c0932, Context context) {
        String m5468 = c0932.f2609.m5468(StringFog.decrypt("QC6ZgBiXvudgJA==\n", "KUDtrmvyzZQ=\n"));
        if (TextUtils.isEmpty(m5468)) {
            return;
        }
        String decrypt = StringFog.decrypt("JtFnaS6pWhw5jW18Za9ZUTPNZ2Yyv1IcIQ==\n", "UqMGCkvLO38=\n");
        String decrypt2 = StringFog.decrypt("I36YtveyfaE1coW+7/5ksz5wm6LvujOh\n", "UBH325vTUNI=\n");
        Context applicationContext = context.getApplicationContext();
        C0834 c0834 = new C0834(applicationContext, decrypt);
        C0857 c0857 = new C0857(AbstractC0838.f2446, applicationContext.getPackageName(), AbstractC0831.m5676(applicationContext), decrypt2);
        try {
            c0834.m5680(StringFog.decrypt("uMwMh/tW62OYxg==\n", "0aJ4qYgzmBA=\n"), c0857.m5685(m5468));
        } catch (Throwable unused) {
        }
        c0932.f2609.m5467(StringFog.decrypt("pW6xoFbGLaiFZA==\n", "zADFjiWjXts=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5757(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        if (set == null) {
            return;
        }
        AbstractC1145.m5891(new C0937(set, iSAdQualityInitError, str));
    }
}

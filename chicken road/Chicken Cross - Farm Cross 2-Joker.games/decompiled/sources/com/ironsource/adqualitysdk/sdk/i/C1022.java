package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.ktor.util.date.GMTDateParser;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẍ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1022 extends AbstractRunnableC0730 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0932 f3039;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3040;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ Application f3041;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f3042;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f3043;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityConfig f3044;

    public C1022(C0932 c0932, ISAdQualityConfig iSAdQualityConfig, String str, String str2, Application application, Activity activity) {
        this.f3039 = c0932;
        this.f3044 = iSAdQualityConfig;
        this.f3043 = str;
        this.f3042 = str2;
        this.f3041 = application;
        this.f3040 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String str;
        try {
            String userId = this.f3044.getUserId();
            C0932 c0932 = this.f3039;
            ISAdQualityLogLevel logLevel = this.f3044.getLogLevel();
            synchronized (c0932) {
                c0932.f2616 = logLevel;
            }
            this.f3039.m5758();
            if (TextUtils.isEmpty(this.f3043)) {
                String decrypt = StringFog.decrypt("g13ahrHKf3m7as+4\n", "wjmL89CmFg0=\n");
                AbstractC0544.m5512(decrypt, decrypt, StringFog.decrypt("8/rQ6FriXszA/df7E/Rb0dK03v1e5hLM3rQ=\n", "upS5nDODMqU=\n") + this.f3042, true);
            } else {
                String decrypt2 = StringFog.decrypt("x5Rv0SB4Rl7/o3rv\n", "hvA+pEEULyo=\n");
                AbstractC0544.m5512(decrypt2, decrypt2, StringFog.decrypt("J9Lxn1kCGBMU1faMEBQdDgac+ZtAQx8fF5w=\n", "bryY6zBjdHo=\n") + this.f3043, true);
            }
            C0780.m5666(this.f3041.getApplicationContext()).m5669();
            C0932.m5756(this.f3039, this.f3044.isTestMode());
            if (this.f3044.isTestMode()) {
                AbstractC0544.m5504(StringFog.decrypt("/BozenOziHXELSZE\n", "vX5iDxLf4QE=\n"), StringFog.decrypt("zGAYxbI/+BG6AGrPlFHRX+8BLeTbHdZG/gE94o8Zn0T+Uj7GlBXaDe9TP+7aUJ4Q3lcv5Y8Cn0fy\nVSKrjxTMRNZOLu7GBc1F/gE94pcdn1L+AS7iiBLeQv9ELqraUA==\n", "myFKi/txvzA=\n"));
            }
            try {
                Class.forName(StringFog.decrypt("RdqxY54n5e9Lx/tQgjfvonDVpno=\n", "JLTVEfFOgcE=\n"));
            } catch (Throwable unused) {
            }
            Activity activity = this.f3040;
            if (activity != null) {
                AbstractC0540.m5498(activity);
            } else {
                Application application = this.f3041;
                String str2 = AbstractC0540.f1235;
                if (application != null) {
                    AbstractC0540.m5499(application.getApplicationContext());
                }
            }
            if (TextUtils.isEmpty(this.f3043)) {
                C0932.m5754(this.f3039).f603 = this.f3042;
            } else {
                C0932.m5754(this.f3039).f604 = this.f3043;
            }
            C0932.m5754(this.f3039).f600 = this.f3044.getInitializationSource();
            C0932.m5754(this.f3039).f599 = this.f3044.getCoppa();
            C0932.m5754(this.f3039).f598 = this.f3044.getDeviceIdType();
            if (this.f3044.getMetaData() != null) {
                C0439 m5754 = C0932.m5754(this.f3039);
                Map<String, String> metaData = this.f3044.getMetaData();
                m5754.f597.clear();
                if (metaData != null) {
                    m5754.f597.putAll(metaData);
                }
                if (this.f3044.getMetaData().containsKey(StringFog.decrypt("nGOhRbKROoWaa6pYspYwnYxs\n", "6QLFNu3iX/Y=\n"))) {
                    C0932.m5754(this.f3039).f595 = this.f3044.getMetaData().get(StringFog.decrypt("UVKifG934N1XWqlhb3DqxUFd\n", "JDPGDzAEha4=\n"));
                }
            }
            Context applicationContext = this.f3041.getApplicationContext();
            this.f3039.f2615 = applicationContext;
            C0874.f2494.m5688(applicationContext, this.f3043);
            this.f3039.f2611 = new C0516(applicationContext);
            C0932 c09322 = this.f3039;
            c09322.f2609 = new C0482(applicationContext, c09322.f2614.f2800, new String(new char[]{'B', '0', 'r', '1', GMTDateParser.SECONDS, 'W', '@', GMTDateParser.SECONDS, 'H', '3', 'r', 'e'}));
            AbstractC0398 m5397 = AbstractC0398.m5397();
            C0932 c09323 = this.f3039;
            m5397.mo5412(applicationContext, c09323.f2611, c09323.f2614, new C1177(this), C0932.m5749(c09323));
            C0932 c09324 = this.f3039;
            C0932 c09325 = this.f3039;
            c09324.f2608 = new C0767(applicationContext, c09325.f2611, c09325.f2614.f2801);
            String m5639 = AbstractC0722.m5639(applicationContext);
            AbstractC0398 m53972 = AbstractC0398.m5397();
            C1175 c1175 = new C1175(this, m5639);
            C0470 c0470 = (C0470) m53972;
            Handler handler = c0470.f890;
            if (handler != null) {
                handler.post(new C0481(c0470, c1175));
            }
            AbstractC0398 m53973 = AbstractC0398.m5397();
            C1148 c1148 = new C1148(this);
            C0470 c04702 = (C0470) m53973;
            Handler handler2 = c04702.f890;
            if (handler2 != null) {
                handler2.post(new C0484(c04702, c1148));
            }
            C0932.m5755(this.f3039, applicationContext);
            this.f3039.f2610 = new C1050(applicationContext, C0932.m5754(this.f3039), this.f3039.f2614, this.f3040 != null, m5639, new C1124(this));
            if (this.f3044.isUserIdSet()) {
                str = userId;
            } else {
                C0932.m5754(this.f3039).f596 = true;
                C0482 c0482 = new C0482(this.f3039.f2610.f3124, C1050.f3116, C1050.f3115);
                String str3 = C1050.f3113;
                String m5468 = c0482.m5468(str3);
                if (TextUtils.isEmpty(m5468)) {
                    m5468 = UUID.randomUUID().toString();
                    c0482.m5469(str3, m5468);
                }
                str = m5468;
            }
            if (this.f3039.m5762()) {
                this.f3039.f2610.m5830(new C1123(this));
            }
            this.f3039.f2610.m5829(new C1109(this));
            C0651 c0651 = new C0651();
            C0932 c09326 = this.f3039;
            C0932 c09327 = this.f3039;
            c09326.f2613 = new C0682(c09327.f2608, c09327.f2610, m5639, c0651, new C1096(this));
            C0932 c09328 = this.f3039;
            c09328.f2613.f1856.f566 = new C1095(this);
            c09328.f2606 = new C0563(this.f3039.f2613);
            C0932 c09329 = this.f3039;
            c09329.f2605 = new C0872(c09329.f2610);
            AbstractC0544.m5509(StringFog.decrypt("df9pGywWshVNyHwl\n", "NJs4bk1622E=\n"), StringFog.decrypt("8+Qmc1OfKufTwx5ERqFr+M7WFWNrhCyr3NgVN3eYJ7Ga\n", "urdnFwLqS4s=\n") + this.f3039.f2614.f2803);
            C0932 c093210 = this.f3039;
            Activity activity2 = this.f3040;
            c093210.m5767(activity2 != null ? activity2 : applicationContext, str, true, false, true);
            C0932.m5753(this.f3039, applicationContext);
            C0932.m5752(this.f3039);
            C0932.m5750(this.f3039);
        } catch (Throwable th) {
            String decrypt3 = StringFog.decrypt("x8ImT6XUMG3rxD1Bu50jauzXdGmEtT1S99E4SaONeVDG+w==\n", "grBUINf0WQM=\n");
            AbstractC0480.m5465(StringFog.decrypt("QbP6NDY5Zmh5hO8K\n", "ANerQVdVDxw=\n"), decrypt3, th, true, false, true);
            C0932.m5757(this.f3039.f2607, ISAdQualityInitError.EXCEPTION_ON_INIT, decrypt3);
        }
    }
}

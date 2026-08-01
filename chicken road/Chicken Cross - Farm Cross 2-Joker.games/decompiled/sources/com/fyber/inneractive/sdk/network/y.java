package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.util.UrlConst;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f5516a;
    public final HashMap b;
    public String c;

    public y(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        int i = com.fyber.inneractive.sdk.config.n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String a2 = TextUtils.isEmpty(property) ? UrlConst.HTTPS + IAConfigManager.R.j.f : com.fyber.inneractive.sdk.config.a.a(property, "Event");
        this.c = null;
        if (TextUtils.isEmpty(a2)) {
            throw new InvalidParameterException();
        }
        this.b = new HashMap();
        this.f5516a = a2;
        a(str7 == null ? "8.4.6" : str7, L6.V);
        a(com.fyber.inneractive.sdk.util.o.f5960a.getPackageName(), "pkgn");
        if (IAConfigManager.c()) {
            return;
        }
        a(U3.d, "osn");
        a(Build.VERSION.RELEASE, "osv");
        a(com.fyber.inneractive.sdk.util.k.g(), "model");
        a(com.fyber.inneractive.sdk.util.k.i(), "pkgv");
        a(str, "appid");
        a(str2, "session");
        a(str3, "adnt");
        a(l, "adnt_id");
        a(str4, CampaignEx.JSON_KEY_CREATIVE_ID);
        a(str5, "adomain");
        a(str6, FirebaseAnalytics.Param.CAMPAIGN_ID);
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}

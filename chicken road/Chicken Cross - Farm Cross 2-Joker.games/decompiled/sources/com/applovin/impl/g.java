package com.applovin.impl;

import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.l lVar) {
        String b = d.b(appLovinFullscreenActivity);
        String a2 = d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z = StringUtils.isValidString(b) && !b.equals(packageName);
        boolean z2 = StringUtils.isValidString(a2) && !a2.equals(packageName);
        if (z || z2) {
            Map a3 = j2.a((AppLovinAdImpl) bVar);
            a3.put("details", "activityTaskAffinityMismatch=" + z + ",baseActivityTaskAffinityMismatch=" + z2);
            lVar.E().a(h2.P0, "taskAffinityMismatch", a3);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.l lVar) {
        if (bVar == null) {
            return;
        }
        boolean a2 = s.a(bVar);
        boolean canDrawOverlays = Settings.canDrawOverlays(bVar.getContext());
        if (canDrawOverlays || a2) {
            Map a3 = j2.a((AppLovinAdImpl) bVar.getCurrentAd());
            a3.put("details", "canDrawOverlays=" + canDrawOverlays + ",isViewOverlaid=" + a2);
            lVar.E().a(h2.P0, "overlayViolation", a3);
        }
    }
}

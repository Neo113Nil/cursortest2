package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.t7;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i) {
        l f = t7.f();
        if (f != null) {
            return f.t0().a(i);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i) {
        l f = t7.f();
        if (f != null) {
            return f.t0().b(i);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i) {
        l f = t7.f();
        if (f != null) {
            return f.t0().c(i);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i) {
        l f = t7.f();
        if (f != null) {
            return f.t0().d(i);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(l.p());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(l.p());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(l.p());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(l.p());
    }

    public static void setDoNotSell(boolean z) {
        setDoNotSell(z, l.p());
    }

    public static void setHasUserConsent(boolean z) {
        setHasUserConsent(z, l.p());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean b = q0.b().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean b = q0.a().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return q0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return q0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z, Context context) {
        p.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (q0.a(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z, Context context) {
        p.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (q0.b(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z), null);
        }
    }
}

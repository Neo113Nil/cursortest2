package com.tiktok.iap.billing;

import android.app.Application;
import android.text.TextUtils;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.TTReflect;

/* loaded from: classes7.dex */
public class GPBillVersions {
    private static volatile String sVersion;

    public enum GPBillingVer {
        NONE,
        V1,
        V2_V4,
        V5_V8
    }

    public static GPBillingVer getMajorVersion() {
        try {
            String version = getVersion();
            if (version != null) {
                int parseInt = Integer.parseInt(version.split("\\.")[0]);
                if (parseInt == 1) {
                    return GPBillingVer.V1;
                }
                if (parseInt > 1 && parseInt < 5) {
                    return GPBillingVer.V2_V4;
                }
                return GPBillingVer.V5_V8;
            }
        } catch (Throwable unused) {
        }
        return GPBillingVer.NONE;
    }

    public static String getVersion() {
        if (!TextUtils.isEmpty(sVersion)) {
            return sVersion;
        }
        sVersion = readFromMeta();
        if (!TextUtils.isEmpty(sVersion)) {
            return sVersion;
        }
        sVersion = readFromBuildConfig();
        if (!TextUtils.isEmpty(sVersion)) {
            return sVersion;
        }
        return "";
    }

    private static String readFromMeta() {
        try {
            Application applicationContext = TikTokBusinessSdk.getApplicationContext();
            if (applicationContext != null) {
                applicationContext.getPackageManager().getInstallerPackageName("");
                String string = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getString("com.google.android.play.billingclient.version", null);
                if (string != null) {
                    if (string.length() > 2) {
                        return string;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String readFromBuildConfig() {
        try {
            String str = (String) TTReflect.on("com.android.billingclient.BuildConfig").findField("VERSION_NAME").getValue(null);
            if (str != null) {
                if (str.length() > 2) {
                    return str;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

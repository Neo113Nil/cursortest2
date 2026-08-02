package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class CommonUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("CommonUtils", "");

    public static java.lang.String getAppVersion(android.content.Context context) {
        try {
            return java.lang.String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            zza.e("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    public static java.lang.String languageTagFromLocale(java.util.Locale locale) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(locale.getLanguage());
        if (!android.text.TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!android.text.TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }

    private CommonUtils() {
    }
}

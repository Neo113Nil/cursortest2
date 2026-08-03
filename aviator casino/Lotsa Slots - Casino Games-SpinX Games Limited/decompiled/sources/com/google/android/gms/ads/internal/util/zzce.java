package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzce {
    private static com.google.android.gms.ads.internal.util.zzce zzb;
    java.lang.String zza;

    private zzce() {
    }

    public static com.google.android.gms.ads.internal.util.zzce zza() {
        if (zzb == null) {
            zzb = new com.google.android.gms.ads.internal.util.zzce();
        }
        return zzb;
    }

    public final void zzb(android.content.Context context) {
        com.google.android.gms.ads.internal.util.zze.zza("Updating user agent.");
        java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.zza)) {
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (!com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                if (remoteContext == null) {
                    remoteContext = null;
                }
                this.zza = defaultUserAgent;
            }
            android.content.SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", android.webkit.WebSettings.getDefaultUserAgent(context));
            if (remoteContext == null) {
                putString.apply();
            } else {
                com.google.android.gms.common.util.SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, putString, "admob_user_agent");
            }
            this.zza = defaultUserAgent;
        }
        com.google.android.gms.ads.internal.util.zze.zza("User agent is updated.");
    }
}

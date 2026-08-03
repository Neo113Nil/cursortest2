package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzht {
    public static java.lang.String zza(android.content.Context context) {
        try {
            return context.getResources().getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final java.lang.String zzb(java.lang.String str, android.content.res.Resources resources, java.lang.String str2) {
        int identifier = resources.getIdentifier("google_app_id", "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final java.lang.Boolean zzc(java.lang.String str, android.content.res.Resources resources, java.lang.String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return java.lang.Boolean.valueOf(resources.getBoolean(identifier));
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }
}

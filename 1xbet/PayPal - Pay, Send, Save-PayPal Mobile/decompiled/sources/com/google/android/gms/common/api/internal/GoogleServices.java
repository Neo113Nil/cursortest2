package com.google.android.gms.common.api.internal;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class GoogleServices {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.google.android.gms.common.api.internal.GoogleServices zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.common.api.Status zzd;
    private final boolean zze;
    private final boolean zzf;

    GoogleServices(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_INT, resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z2 = integer == 0;
            boolean z3 = integer != 0;
            this.zzf = z2;
            z = z3;
        } else {
            this.zzf = false;
        }
        this.zze = z;
        java.lang.String zza2 = com.google.android.gms.common.internal.zzae.zza(context);
        zza2 = zza2 == null ? new com.google.android.gms.common.internal.StringResourceValueReader(context).getString("google_app_id") : zza2;
        if (android.text.TextUtils.isEmpty(zza2)) {
            this.zzd = new com.google.android.gms.common.api.Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = zza2;
            this.zzd = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
    }

    static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    public static java.lang.String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context context) {
        com.google.android.gms.common.api.Status status;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new com.google.android.gms.common.api.internal.GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    public static boolean isMeasurementEnabled() {
        com.google.android.gms.common.api.internal.GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    final com.google.android.gms.common.api.Status checkGoogleAppId(java.lang.String str) {
        java.lang.String str2 = this.zzc;
        if (str2 == null || str2.equals(str)) {
            return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 97);
        sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        sb.append(str2);
        sb.append("'.");
        return new com.google.android.gms.common.api.Status(10, sb.toString());
    }

    private static com.google.android.gms.common.api.internal.GoogleServices checkInitialized(java.lang.String str) {
        com.google.android.gms.common.api.internal.GoogleServices googleServices;
        synchronized (zza) {
            googleServices = zzb;
            if (googleServices == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context context, java.lang.String str, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            com.google.android.gms.common.api.internal.GoogleServices googleServices = zzb;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            com.google.android.gms.common.api.internal.GoogleServices googleServices2 = new com.google.android.gms.common.api.internal.GoogleServices(str, z);
            zzb = googleServices2;
            return googleServices2.zzd;
        }
    }

    GoogleServices(java.lang.String str, boolean z) {
        this.zzc = str;
        this.zzd = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        this.zze = z;
        this.zzf = !z;
    }
}

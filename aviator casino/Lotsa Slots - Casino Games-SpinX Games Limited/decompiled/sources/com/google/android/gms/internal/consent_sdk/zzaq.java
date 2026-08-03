package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzaq {
    static final com.google.android.gms.internal.consent_sdk.zzdw zza = com.google.android.gms.internal.consent_sdk.zzdw.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", com.google.ads.mediation.inmobi.InMobiNetworkKeys.IAB_US_PRIVACY_STRING);
    private final android.app.Application zzb;
    private final android.content.SharedPreferences zzc;
    private final java.util.Set zzd;

    zzaq(android.app.Application application) {
        this.zzb = application;
        android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new java.util.HashSet(sharedPreferences.getStringSet("written_values", java.util.Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus zzb() {
        return com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(this.zzc.getString("privacy_options_requirement_status", com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
    }

    public final java.util.Map zzc() {
        java.lang.String str;
        java.util.Set<java.lang.String> stringSet = this.zzc.getStringSet("stored_info", com.google.android.gms.internal.consent_sdk.zzdw.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : stringSet) {
            android.app.Application application = this.zzb;
            com.google.android.gms.internal.consent_sdk.zzcu zza2 = com.google.android.gms.internal.consent_sdk.zzcw.zza(application, str2);
            if (zza2 == null) {
                android.util.Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(java.lang.String.valueOf(str2)));
            } else {
                java.lang.Object obj = application.getSharedPreferences(zza2.zza, 0).getAll().get(zza2.zzb);
                if (obj == null) {
                    android.util.Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(java.lang.String.valueOf(str2)));
                } else {
                    if (obj instanceof java.lang.Boolean) {
                        str = true != ((java.lang.Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof java.lang.Number) {
                        str = obj.toString();
                    } else if (obj instanceof java.lang.String) {
                        str = (java.lang.String) obj;
                    } else {
                        android.util.Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(java.lang.String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final java.util.Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        android.app.Application application = this.zzb;
        java.util.Set set = this.zzd;
        com.google.android.gms.internal.consent_sdk.zzcw.zzb(application, set);
        set.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).commit();
    }

    public final void zzg(int i) {
        this.zzc.edit().putInt("consent_status", i).commit();
    }

    public final void zzh(boolean z) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z).commit();
    }

    public final void zzi(com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus) {
        this.zzc.edit().putString("privacy_options_requirement_status", privacyOptionsRequirementStatus.name()).commit();
    }

    public final void zzj(java.util.Set set) {
        this.zzc.edit().putStringSet("stored_info", set).commit();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }
}

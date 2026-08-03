package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzcv {
    private static final com.google.android.gms.internal.consent_sdk.zzdw zza = com.google.android.gms.internal.consent_sdk.zzdw.zzk("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES);
    private final android.content.Context zzc;
    private final java.util.Map zzb = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();

    public zzcv(android.content.Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.content.SharedPreferences.Editor zzf(java.lang.String str) {
        java.util.Map map = this.zzd;
        if (!map.containsKey(str)) {
            map.put(str, this.zzc.getSharedPreferences(str, 0).edit());
        }
        return (android.content.SharedPreferences.Editor) map.get(str);
    }

    public final java.util.Map zzb() {
        return this.zzb;
    }

    public final void zzc() {
        java.util.Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((android.content.SharedPreferences.Editor) it.next()).commit();
        }
    }

    public final void zzd() {
        this.zzb.clear();
    }

    public final boolean zze(java.lang.String str, java.lang.Object obj) {
        com.google.android.gms.internal.consent_sdk.zzcu zza2 = com.google.android.gms.internal.consent_sdk.zzcw.zza(this.zzc, str);
        if (zza2 == null) {
            return false;
        }
        android.content.SharedPreferences.Editor zzf = zzf(zza2.zza);
        if (obj instanceof java.lang.Integer) {
            java.lang.Integer num = (java.lang.Integer) obj;
            java.lang.String str2 = zza2.zzb;
            zzf.putInt(str2, num.intValue());
            if (!zza.contains(str2)) {
                return true;
            }
            this.zzb.put(str2, num);
            return true;
        }
        if (obj instanceof java.lang.Long) {
            zzf.putLong(zza2.zzb, ((java.lang.Long) obj).longValue());
            return true;
        }
        if (obj instanceof java.lang.Double) {
            zzf.putFloat(zza2.zzb, ((java.lang.Double) obj).floatValue());
            return true;
        }
        if (obj instanceof java.lang.Float) {
            zzf.putFloat(zza2.zzb, ((java.lang.Float) obj).floatValue());
            return true;
        }
        if (obj instanceof java.lang.Boolean) {
            zzf.putBoolean(zza2.zzb, ((java.lang.Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        zzf.putString(zza2.zzb, (java.lang.String) obj);
        return true;
    }
}

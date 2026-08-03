package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbhz implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private final java.lang.Object zza = new java.lang.Object();
    private android.content.SharedPreferences zzb = null;
    private org.json.JSONObject zzc = new org.json.JSONObject();

    private final void zzg(final android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbis.zza(new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzbhy
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ java.lang.Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (org.json.JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final void zza(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            if (this.zzb != null) {
                return;
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            com.google.android.gms.ads.internal.client.zzba.zza();
            android.content.SharedPreferences zza = com.google.android.gms.internal.ads.zzbij.zza(context);
            this.zzb = zza;
            zzg(zza);
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzb.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            }
        }
    }

    public final java.lang.String zzb(java.lang.String str, java.lang.String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(java.lang.String str, long j) {
        return !str.startsWith("adapter:") ? j : this.zzc.optLong(str, j);
    }

    public final int zzd(java.lang.String str, int i) {
        return !str.startsWith("adapter:") ? i : this.zzc.optInt(str, i);
    }

    public final float zze(java.lang.String str, float f) {
        return !str.startsWith("adapter:") ? f : (float) this.zzc.optDouble(str, f);
    }

    public final boolean zzf(java.lang.String str, boolean z) {
        return !str.startsWith("adapter:") ? z : this.zzc.optBoolean(str, z);
    }
}

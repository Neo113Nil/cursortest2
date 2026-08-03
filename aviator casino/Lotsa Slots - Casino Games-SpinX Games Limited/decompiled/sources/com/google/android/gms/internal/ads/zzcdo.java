package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcdo implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private final android.content.Context zza;
    private final android.content.SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private java.lang.String zzd = com.ironsource.C2945a2.f;
    private int zze = -1;

    zzcdo(android.content.Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb(java.lang.String str, int i) {
        android.content.Context context;
        boolean z = false;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbj)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(com.ironsource.C2945a2.f))) {
            z = true;
        }
        this.zzc.zzw(z);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue() && z && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        this.zzc.zzw(true);
        com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        char c;
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbl)).booleanValue()) {
                if (java.util.Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
                    if (i != zzgVar.zzD()) {
                        zzc();
                    }
                    zzgVar.zzC(i);
                    return;
                }
                if (java.util.Objects.equals(str, "IABTCF_TCString")) {
                    java.lang.String string = sharedPreferences.getString(str, com.ironsource.C2945a2.f);
                    com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zzc;
                    if (!java.util.Objects.equals(string, zzgVar2.zzB())) {
                        zzc();
                    }
                    zzgVar2.zzA(string);
                    return;
                }
                return;
            }
            java.lang.String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", com.ironsource.C2945a2.f);
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            java.lang.String valueOf = java.lang.String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                if (string2.equals(com.ironsource.C2945a2.f) || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzb(string2, i2);
                return;
            }
            if (c != 1) {
                return;
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbj)).booleanValue() || i2 == -1 || this.zze == i2) {
                return;
            }
            this.zze = i2;
            zzb(string2, i2);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    final void zza() {
        android.content.SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbl)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezd implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;

    zzezd(android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zza = context;
        this.zzb = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zzb.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzezd.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 18;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzezb zzc() {
        android.os.Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzc();
        java.lang.String string = !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgZ)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        java.lang.String string2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhb)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzha)).booleanValue()) {
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new android.os.Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            java.lang.String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                java.lang.String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new com.google.android.gms.internal.ads.zzezb(string, string2, bundle, null);
    }
}

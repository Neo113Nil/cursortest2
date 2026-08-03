package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzay extends com.google.android.gms.internal.ads.zzatt {
    private final android.content.Context zzb;

    private zzay(android.content.Context context, com.google.android.gms.internal.ads.zzats zzatsVar) {
        super(zzatsVar);
        this.zzb = context;
    }

    public static com.google.android.gms.internal.ads.zzath zzb(android.content.Context context) {
        com.google.android.gms.internal.ads.zzath zzathVar = new com.google.android.gms.internal.ads.zzath(new com.google.android.gms.internal.ads.zzaua(new java.io.File(com.google.android.gms.internal.ads.zzfzk.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new com.google.android.gms.ads.internal.util.zzay(context, new com.google.android.gms.internal.ads.zzauf(null, null)), 4);
        zzathVar.zza();
        return zzathVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatt, com.google.android.gms.internal.ads.zzasx
    public final com.google.android.gms.internal.ads.zzata zza(com.google.android.gms.internal.ads.zzate zzateVar) throws com.google.android.gms.internal.ads.zzatn {
        if (zzateVar.zza() == 0) {
            if (java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfr), zzateVar.zzh())) {
                android.content.Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzay.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 13400000)) {
                    com.google.android.gms.internal.ads.zzata zza = new com.google.android.gms.internal.ads.zzbro(context).zza(zzateVar);
                    if (zza != null) {
                        java.lang.String zzh = zzateVar.zzh();
                        java.lang.String.valueOf(zzh);
                        com.google.android.gms.ads.internal.util.zze.zza("Got gmscore asset response: ".concat(java.lang.String.valueOf(zzh)));
                        return zza;
                    }
                    java.lang.String zzh2 = zzateVar.zzh();
                    java.lang.String.valueOf(zzh2);
                    com.google.android.gms.ads.internal.util.zze.zza("Failed to get gmscore asset response: ".concat(java.lang.String.valueOf(zzh2)));
                }
            }
        }
        return super.zza(zzateVar);
    }
}

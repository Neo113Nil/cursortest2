package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeym implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzeym(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static com.google.android.gms.internal.ads.zzeym zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzeym(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzgww zzh;
        com.google.android.gms.internal.ads.zzezk zzb = ((com.google.android.gms.internal.ads.zzezm) this.zza).zzb();
        android.content.Context zza = ((com.google.android.gms.internal.ads.zzcns) this.zzb).zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmN)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(zza)) {
                zzh = com.google.android.gms.internal.ads.zzgww.zzi(zzb);
                com.google.android.gms.internal.ads.zzinc.zzb(zzh);
                return zzh;
            }
        }
        zzh = com.google.android.gms.internal.ads.zzgww.zzh();
        com.google.android.gms.internal.ads.zzinc.zzb(zzh);
        return zzh;
    }
}

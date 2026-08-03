package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwa implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzcwa(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzcwa zza(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzcwa(zzcvsVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzgww zzi = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoc)).booleanValue() ? com.google.android.gms.internal.ads.zzgww.zzi(new com.google.android.gms.internal.ads.zzdkq(((com.google.android.gms.internal.ads.zzcxe) this.zza).zzb(), com.google.android.gms.internal.ads.zzcfr.zza)) : com.google.android.gms.internal.ads.zzgww.zzh();
        com.google.android.gms.internal.ads.zzinc.zzb(zzi);
        return zzi;
    }
}

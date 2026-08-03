package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdyl implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzdyl(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzdyl zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzdyl(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set emptySet;
        final java.lang.String zza = ((com.google.android.gms.internal.ads.zzfeu) this.zza).zza();
        android.content.Context zza2 = ((com.google.android.gms.internal.ads.zzcns) this.zzb).zza();
        com.google.android.gms.internal.ads.zzhcg zzc = com.google.android.gms.internal.ads.zzfoa.zzc();
        java.util.Map zzb = ((com.google.android.gms.internal.ads.zzimy) this.zzc).zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzge)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbhp zzbhpVar = new com.google.android.gms.internal.ads.zzbhp(new com.google.android.gms.internal.ads.zzbhu(zza2));
            zzbhpVar.zzb(new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzdym
                @Override // com.google.android.gms.internal.ads.zzbho
                public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                    zzaVar.zzh(zza);
                }
            });
            emptySet = java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq(new com.google.android.gms.internal.ads.zzdyo(zzbhpVar, zzb), zzc));
        } else {
            emptySet = java.util.Collections.emptySet();
        }
        com.google.android.gms.internal.ads.zzinc.zzb(emptySet);
        return emptySet;
    }
}

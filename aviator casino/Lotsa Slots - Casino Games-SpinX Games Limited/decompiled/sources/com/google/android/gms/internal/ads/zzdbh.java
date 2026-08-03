package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdbh implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzdbh(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzdbh zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzdbh(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        final android.content.Context context = (android.content.Context) this.zza.zzb();
        final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza = ((com.google.android.gms.internal.ads.zzcoi) this.zzb).zza();
        final com.google.android.gms.internal.ads.zzfky zza2 = ((com.google.android.gms.internal.ads.zzdci) this.zzc).zza();
        return new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzdbg
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfkf zzfkfVar = (com.google.android.gms.internal.ads.zzfkf) obj;
                com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
                zzatVar.zze(zzfkfVar.zzB);
                zzatVar.zzf(zzfkfVar.zzC.toString());
                zzatVar.zzd(zza.afmaVersion);
                zzatVar.zzc(zza2.zzg);
                return zzatVar;
            }
        };
    }
}

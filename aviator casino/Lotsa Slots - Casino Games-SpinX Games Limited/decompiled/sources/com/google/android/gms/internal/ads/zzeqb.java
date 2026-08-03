package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeqb implements com.google.android.gms.internal.ads.zzdno {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdwi zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfkf zze;
    private final com.google.common.util.concurrent.ListenableFuture zzf;
    private final com.google.android.gms.internal.ads.zzcku zzg;
    private final com.google.android.gms.internal.ads.zzbpt zzh;
    private final boolean zzi;
    private final com.google.android.gms.internal.ads.zzekr zzj;
    private final com.google.android.gms.internal.ads.zzdzg zzk;
    private final com.google.android.gms.internal.ads.zzdzl zzl;

    zzeqb(android.content.Context context, com.google.android.gms.internal.ads.zzdwi zzdwiVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbpt zzbptVar, boolean z, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzdwiVar;
        this.zzc = zzfkyVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfkfVar;
        this.zzf = listenableFuture;
        this.zzg = zzckuVar;
        this.zzh = zzbptVar;
        this.zzi = z;
        this.zzj = zzekrVar;
        this.zzk = zzdzgVar;
        this.zzl = zzdzlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzdno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) {
        boolean z2;
        com.google.android.gms.internal.ads.zzdvn zzdvnVar = (com.google.android.gms.internal.ads.zzdvn) com.google.android.gms.internal.ads.zzhbw.zzt(this.zzf);
        try {
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zze;
            final com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzg;
            if (zzckuVar.zzaB()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzby)).booleanValue()) {
                    zzckuVar = this.zzb.zza(this.zzc.zzf, null, null);
                    com.google.android.gms.internal.ads.zzbqj.zzb(zzckuVar, zzdvnVar.zzk());
                    final com.google.android.gms.internal.ads.zzdwm zzdwmVar = new com.google.android.gms.internal.ads.zzdwm();
                    zzdvnVar.zzl().zzi(zzckuVar, true, this.zzi ? this.zzh : null, this.zzk);
                    zzckuVar.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq(zzdwmVar, zzckuVar) { // from class: com.google.android.gms.internal.ads.zzeqa
                        private final /* synthetic */ com.google.android.gms.internal.ads.zzcku zza;

                        {
                            this.zza = zzckuVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcmq
                        public final /* synthetic */ void zza(boolean z3, int i, java.lang.String str, java.lang.String str2) {
                            com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zza;
                            zzckuVar2.zzJ();
                            zzckuVar2.zzP().zzq();
                        }
                    });
                    com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
                    java.util.Objects.requireNonNull(zzckuVar);
                    zzP.zzH(new com.google.android.gms.internal.ads.zzcmr() { // from class: com.google.android.gms.internal.ads.zzepz
                        @Override // com.google.android.gms.internal.ads.zzcmr
                        public final /* synthetic */ void zza() {
                            com.google.android.gms.internal.ads.zzcku.this.zzI();
                        }
                    });
                    com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
                    zzckuVar.zzau(zzfkkVar.zzb, zzfkkVar.zza, null);
                }
            }
            com.google.android.gms.internal.ads.zzcku zzckuVar2 = zzckuVar;
            zzckuVar2.zzag(true);
            boolean z3 = this.zzi;
            boolean z4 = false;
            boolean zzc = z3 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            if (z3) {
                if (this.zzh.zzd()) {
                    z4 = true;
                    z2 = true;
                    float zze = !z4 ? this.zzh.zze() : 0.0f;
                    com.google.android.gms.internal.ads.zzfkf zzfkfVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfkfVar2.zzO, zzfkfVar2.zzP);
                    if (zzddeVar != null) {
                        zzddeVar.zzb();
                    }
                    com.google.android.gms.ads.internal.zzt.zzb();
                    com.google.android.gms.internal.ads.zzdnd zzj = zzdvnVar.zzj();
                    int i = zzfkfVar2.zzQ;
                    com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzd;
                    java.lang.String str = zzfkfVar2.zzB;
                    com.google.android.gms.internal.ads.zzfkk zzfkkVar2 = zzfkfVar2.zzs;
                    java.lang.String str2 = zzfkkVar2.zzb;
                    java.lang.String str3 = zzfkkVar2.zza;
                    com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzc;
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj, null, zzckuVar2, i, versionInfoParcel, str, zzlVar, str2, str3, zzfkyVar.zzg, zzddeVar, zzfkfVar2.zzb() ? this.zzj : null, zzckuVar2.zzn()), true, this.zzl);
                }
                z4 = true;
            }
            z2 = false;
            if (!z4) {
            }
            com.google.android.gms.internal.ads.zzfkf zzfkfVar22 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfkfVar22.zzO, zzfkfVar22.zzP);
            if (zzddeVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.internal.ads.zzdnd zzj2 = zzdvnVar.zzj();
            int i2 = zzfkfVar22.zzQ;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzd;
            java.lang.String str4 = zzfkfVar22.zzB;
            com.google.android.gms.internal.ads.zzfkk zzfkkVar22 = zzfkfVar22.zzs;
            java.lang.String str22 = zzfkkVar22.zzb;
            java.lang.String str32 = zzfkkVar22.zza;
            com.google.android.gms.internal.ads.zzfky zzfkyVar2 = this.zzc;
            if (zzfkfVar22.zzb()) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj2, null, zzckuVar2, i2, versionInfoParcel2, str4, zzlVar2, str22, str32, zzfkyVar2.zzg, zzddeVar, zzfkfVar22.zzb() ? this.zzj : null, zzckuVar2.zzn()), true, this.zzl);
        } catch (com.google.android.gms.internal.ads.zzclj e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zze;
    }
}

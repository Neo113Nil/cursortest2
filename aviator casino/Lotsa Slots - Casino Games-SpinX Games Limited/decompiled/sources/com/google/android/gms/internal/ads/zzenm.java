package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzenm implements com.google.android.gms.internal.ads.zzdno {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;
    private final com.google.android.gms.internal.ads.zzfkf zzd;
    private final com.google.android.gms.internal.ads.zzcku zze;
    private final com.google.android.gms.internal.ads.zzfky zzf;
    private final com.google.android.gms.internal.ads.zzbpt zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzekr zzi;
    private final com.google.android.gms.internal.ads.zzdzl zzj;

    zzenm(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, boolean z, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfkfVar;
        this.zze = zzckuVar;
        this.zzf = zzfkyVar;
        this.zzg = zzbptVar;
        this.zzh = z;
        this.zzi = zzekrVar;
        this.zzj = zzdzlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // com.google.android.gms.internal.ads.zzdno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) {
        boolean z2;
        com.google.android.gms.internal.ads.zzdma zzdmaVar = (com.google.android.gms.internal.ads.zzdma) com.google.android.gms.internal.ads.zzhbw.zzt(this.zzc);
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zze;
        zzckuVar.zzag(true);
        boolean z3 = this.zzh;
        boolean z4 = false;
        boolean zzc = z3 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        if (z3) {
            if (this.zzg.zzd()) {
                z4 = true;
                z2 = true;
                float zze = !z4 ? this.zzg.zze() : 0.0f;
                com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzd;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfkfVar.zzO, false);
                if (zzddeVar != null) {
                    zzddeVar.zzb();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.internal.ads.zzdnd zzj = zzdmaVar.zzj();
                int i = zzfkfVar.zzQ;
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzb;
                java.lang.String str = zzfkfVar.zzB;
                com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
                java.lang.String str2 = zzfkkVar.zzb;
                java.lang.String str3 = zzfkkVar.zza;
                com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzf;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj, null, zzckuVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfkyVar.zzg, zzddeVar, !zzfkfVar.zzb() ? this.zzi : null, zzckuVar.zzn()), true, this.zzj);
            }
            z4 = true;
        }
        z2 = false;
        if (!z4) {
        }
        com.google.android.gms.internal.ads.zzfkf zzfkfVar2 = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfkfVar2.zzO, false);
        if (zzddeVar != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.internal.ads.zzdnd zzj2 = zzdmaVar.zzj();
        int i2 = zzfkfVar2.zzQ;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzb;
        java.lang.String str4 = zzfkfVar2.zzB;
        com.google.android.gms.internal.ads.zzfkk zzfkkVar2 = zzfkfVar2.zzs;
        java.lang.String str22 = zzfkkVar2.zzb;
        java.lang.String str32 = zzfkkVar2.zza;
        com.google.android.gms.internal.ads.zzfky zzfkyVar2 = this.zzf;
        if (!zzfkfVar2.zzb()) {
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj2, null, zzckuVar, i2, versionInfoParcel2, str4, zzlVar2, str22, str32, zzfkyVar2.zzg, zzddeVar, !zzfkfVar2.zzb() ? this.zzi : null, zzckuVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzemf implements com.google.android.gms.internal.ads.zzdno {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final com.google.common.util.concurrent.ListenableFuture zzb;
    private final com.google.android.gms.internal.ads.zzfkf zzc;
    private final com.google.android.gms.internal.ads.zzcku zzd;
    private final com.google.android.gms.internal.ads.zzfky zze;
    private final com.google.android.gms.internal.ads.zzbpt zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.ads.zzekr zzh;
    private final com.google.android.gms.internal.ads.zzdzl zzi;

    zzemf(com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, boolean z, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfkfVar;
        this.zzd = zzckuVar;
        this.zze = zzfkyVar;
        this.zzg = z;
        this.zzf = zzbptVar;
        this.zzh = zzekrVar;
        this.zzi = zzdzlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    @Override // com.google.android.gms.internal.ads.zzdno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) {
        boolean z2;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzcuw zzcuwVar = (com.google.android.gms.internal.ads.zzcuw) com.google.android.gms.internal.ads.zzhbw.zzt(this.zzb);
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
        zzckuVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = false;
        if (z3) {
            if (this.zzf.zzd()) {
                z4 = true;
                z2 = true;
                float zze = !z4 ? this.zzf.zze() : 0.0f;
                com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, true, z2, zze, -1, z, zzfkfVar.zzO, false);
                if (zzddeVar != null) {
                    zzddeVar.zzb();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.internal.ads.zzdnd zzj = zzcuwVar.zzj();
                i = zzfkfVar.zzQ;
                if (i == -1) {
                    com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
                    if (zzxVar != null) {
                        int i3 = zzxVar.zza;
                        if (i3 == 1) {
                            i2 = 7;
                        } else if (i3 == 2) {
                            i2 = 6;
                        }
                        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zza;
                        java.lang.String str = zzfkfVar.zzB;
                        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
                        java.lang.String str2 = zzfkkVar.zzb;
                        java.lang.String str3 = zzfkkVar.zza;
                        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zze;
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj, null, zzckuVar, i2, versionInfoParcel, str, zzlVar, str2, str3, zzfkyVar.zzg, zzddeVar, zzfkfVar.zzb() ? this.zzh : null, zzckuVar.zzn()), true, this.zzi);
                    }
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
                i2 = i;
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zza;
                java.lang.String str4 = zzfkfVar.zzB;
                com.google.android.gms.internal.ads.zzfkk zzfkkVar2 = zzfkfVar.zzs;
                java.lang.String str22 = zzfkkVar2.zzb;
                java.lang.String str32 = zzfkkVar2.zza;
                com.google.android.gms.internal.ads.zzfky zzfkyVar2 = this.zze;
                if (zzfkfVar.zzb()) {
                }
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj, null, zzckuVar, i2, versionInfoParcel2, str4, zzlVar, str22, str32, zzfkyVar2.zzg, zzddeVar, zzfkfVar.zzb() ? this.zzh : null, zzckuVar.zzn()), true, this.zzi);
            }
            z4 = true;
        }
        z2 = false;
        if (!z4) {
        }
        com.google.android.gms.internal.ads.zzfkf zzfkfVar2 = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, true, z2, zze, -1, z, zzfkfVar2.zzO, false);
        if (zzddeVar != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.internal.ads.zzdnd zzj2 = zzcuwVar.zzj();
        i = zzfkfVar2.zzQ;
        if (i == -1) {
        }
        i2 = i;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel22 = this.zza;
        java.lang.String str42 = zzfkfVar2.zzB;
        com.google.android.gms.internal.ads.zzfkk zzfkkVar22 = zzfkfVar2.zzs;
        java.lang.String str222 = zzfkkVar22.zzb;
        java.lang.String str322 = zzfkkVar22.zza;
        com.google.android.gms.internal.ads.zzfky zzfkyVar22 = this.zze;
        if (zzfkfVar2.zzb()) {
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzj2, null, zzckuVar, i2, versionInfoParcel22, str42, zzlVar2, str222, str322, zzfkyVar22.zzg, zzddeVar, zzfkfVar2.zzb() ? this.zzh : null, zzckuVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaos implements com.google.android.gms.internal.ads.zzanl {
    public static final com.google.android.gms.internal.ads.zzand zza = new com.google.android.gms.internal.ads.zzand(com.google.android.gms.internal.ads.zzgwm.zzi(), -9223372036854775807L, -9223372036854775807L);
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzaor zzd;
    private java.util.zip.Inflater zze;

    public zzaos(java.util.List list) {
        com.google.android.gms.internal.ads.zzaor zzaorVar = new com.google.android.gms.internal.ads.zzaor();
        this.zzd = zzaorVar;
        zzaorVar.zza(new java.lang.String((byte[]) list.get(0), java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzand zzandVar;
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
        zzetVar.zzb(bArr, i2 + i);
        zzetVar.zzh(i);
        if (this.zze == null) {
            this.zze = new java.util.zip.Inflater();
        }
        com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzc;
        if (com.google.android.gms.internal.ads.zzfl.zzO(zzetVar, zzetVar2, this.zze)) {
            zzetVar.zzb(zzetVar2.zzi(), zzetVar2.zze());
        }
        com.google.android.gms.internal.ads.zzaor zzaorVar = this.zzd;
        zzaorVar.zzc();
        int zzd = zzetVar.zzd();
        if (zzd < 2 || zzetVar.zzt() != zzd) {
            zzandVar = zza;
        } else {
            zzaorVar.zzd(zzetVar);
            long zzf = zzaorVar.zzf();
            com.google.android.gms.internal.ads.zzcx zzb = zzaorVar.zzb(zzetVar);
            long j = -9223372036854775807L;
            if (zzf != -9223372036854775807L) {
                if (zzaorVar.zze() != -9223372036854775807L) {
                    if (zzaorVar.zzf() > zzaorVar.zze()) {
                        j = zzaorVar.zzf() - zzaorVar.zze();
                    }
                }
                j = zzaorVar.zzf();
            }
            zzandVar = new com.google.android.gms.internal.ads.zzand(zzb != null ? com.google.android.gms.internal.ads.zzgwm.zzj(zzb) : com.google.android.gms.internal.ads.zzgwm.zzi(), zzaorVar.zze(), j);
        }
        zzdtVar.zza(zzandVar);
    }
}

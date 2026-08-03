package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzanz implements com.google.android.gms.internal.ads.zzanl {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzany zzc = new com.google.android.gms.internal.ads.zzany();
    private java.util.zip.Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zzb(bArr, i2 + i);
        zzetVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new java.util.zip.Inflater();
        }
        com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
        if (com.google.android.gms.internal.ads.zzfl.zzO(zzetVar, zzetVar2, this.zzd)) {
            zzetVar.zzb(zzetVar2.zzi(), zzetVar2.zze());
        }
        com.google.android.gms.internal.ads.zzany zzanyVar = this.zzc;
        zzanyVar.zzb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zzetVar.zzd() >= 3) {
            int zze = zzetVar.zze();
            int zzs = zzetVar.zzs();
            int zzt = zzetVar.zzt();
            int zzg = zzetVar.zzg() + zzt;
            com.google.android.gms.internal.ads.zzcx zzcxVar = null;
            if (zzg > zze) {
                zzetVar.zzh(zze);
            } else {
                if (zzs != 128) {
                    switch (zzs) {
                        case 20:
                            zzanyVar.zzc(zzetVar, zzt);
                            break;
                        case 21:
                            zzanyVar.zzd(zzetVar, zzt);
                            break;
                        case 22:
                            zzanyVar.zze(zzetVar, zzt);
                            break;
                    }
                } else {
                    com.google.android.gms.internal.ads.zzcx zza = zzanyVar.zza();
                    zzanyVar.zzb();
                    zzcxVar = zza;
                }
                zzetVar.zzh(zzg);
            }
            if (zzcxVar != null) {
                arrayList.add(zzcxVar);
            }
        }
        zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}

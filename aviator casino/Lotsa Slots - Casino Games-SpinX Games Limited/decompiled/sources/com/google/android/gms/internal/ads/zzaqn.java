package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqn implements com.google.android.gms.internal.ads.zzafj {
    private final com.google.android.gms.internal.ads.zzfi zza;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet();

    /* synthetic */ zzaqn(com.google.android.gms.internal.ads.zzfi zzfiVar, byte[] bArr) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final com.google.android.gms.internal.ads.zzafi zza(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        int zzh;
        long j2;
        long zzn = zzafzVar.zzn();
        int min = (int) java.lang.Math.min(20000L, zzafzVar.zzo() - zzn);
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
        zzetVar.zza(min);
        zzafzVar.zzi(zzetVar.zzi(), 0, min);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (zzetVar.zzd() >= 4) {
            if (com.google.android.gms.internal.ads.zzaqo.zzh(zzetVar.zzi(), zzetVar.zzg()) != 442) {
                zzetVar.zzk(1);
            } else {
                zzetVar.zzk(4);
                long zze = com.google.android.gms.internal.ads.zzaqp.zze(zzetVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return com.google.android.gms.internal.ads.zzafi.zza(zze2, zzn);
                        }
                        j2 = i2;
                    } else if (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + zze2 > j) {
                        j2 = zzetVar.zzg();
                    } else {
                        i2 = zzetVar.zzg();
                        j3 = zze2;
                    }
                    return com.google.android.gms.internal.ads.zzafi.zzc(zzn + j2);
                }
                int zze3 = zzetVar.zze();
                if (zzetVar.zzd() >= 10) {
                    zzetVar.zzk(9);
                    int zzs = zzetVar.zzs() & 7;
                    if (zzetVar.zzd() >= zzs) {
                        zzetVar.zzk(zzs);
                        if (zzetVar.zzd() >= 4) {
                            if (com.google.android.gms.internal.ads.zzaqo.zzh(zzetVar.zzi(), zzetVar.zzg()) == 443) {
                                zzetVar.zzk(4);
                                int zzt = zzetVar.zzt();
                                if (zzetVar.zzd() < zzt) {
                                    zzetVar.zzh(zze3);
                                } else {
                                    zzetVar.zzk(zzt);
                                }
                            }
                            while (true) {
                                if (zzetVar.zzd() < 4 || (zzh = com.google.android.gms.internal.ads.zzaqo.zzh(zzetVar.zzi(), zzetVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzetVar.zzk(4);
                                if (zzetVar.zzd() < 2) {
                                    zzetVar.zzh(zze3);
                                    break;
                                }
                                zzetVar.zzh(java.lang.Math.min(zzetVar.zze(), zzetVar.zzg() + zzetVar.zzt()));
                            }
                        } else {
                            zzetVar.zzh(zze3);
                        }
                    } else {
                        zzetVar.zzh(zze3);
                    }
                } else {
                    zzetVar.zzh(zze3);
                }
                i = zzetVar.zzg();
            }
        }
        return j3 != -9223372036854775807L ? com.google.android.gms.internal.ads.zzafi.zzb(j3, zzn + i) : com.google.android.gms.internal.ads.zzafi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final void zzb() {
        byte[] bArr = com.google.android.gms.internal.ads.zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}

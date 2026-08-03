package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqx implements com.google.android.gms.internal.ads.zzafj {
    private final com.google.android.gms.internal.ads.zzfi zza;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet();
    private final int zzc;

    public zzaqx(int i, com.google.android.gms.internal.ads.zzfi zzfiVar, int i2) {
        this.zzc = i;
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final com.google.android.gms.internal.ads.zzafi zza(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        int zza;
        int zza2;
        long zzn = zzafzVar.zzn();
        int min = (int) java.lang.Math.min(112800L, zzafzVar.zzo() - zzn);
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
        zzetVar.zza(min);
        zzafzVar.zzi(zzetVar.zzi(), 0, min);
        int zze = zzetVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzetVar.zzd() >= 188 && (zza2 = (zza = com.google.android.gms.internal.ads.zzarj.zza(zzetVar.zzi(), zzetVar.zzg(), zze)) + 188) <= zze) {
            long zzb = com.google.android.gms.internal.ads.zzarj.zzb(zzetVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 <= j) {
                    j4 = zza;
                    if (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + zze2 <= j) {
                        j3 = zze2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return com.google.android.gms.internal.ads.zzafi.zza(zze2, zzn);
                }
                return com.google.android.gms.internal.ads.zzafi.zzc(zzn + j4);
            }
            zzetVar.zzh(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? com.google.android.gms.internal.ads.zzafi.zzb(j3, zzn + j2) : com.google.android.gms.internal.ads.zzafi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final void zzb() {
        byte[] bArr = com.google.android.gms.internal.ads.zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}

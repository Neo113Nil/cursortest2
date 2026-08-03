package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahl {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzafzVar.zzi(bArr, 0, 10);
        zzafzVar.zzl();
        int i = com.google.android.gms.internal.ads.zzaey.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzahk zzahkVar, long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzahj zzahjVar) {
        com.google.android.gms.internal.ads.zzgtj.zzj(this.zzg <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zzd(zzahkVar, zzahjVar);
            }
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzahk zzahkVar, com.google.android.gms.internal.ads.zzahj zzahjVar) {
        if (this.zzc > 0) {
            zzahkVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahjVar);
            this.zzc = 0;
        }
    }
}

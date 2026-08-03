package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaro implements com.google.android.gms.internal.ads.zzarn {
    private final com.google.android.gms.internal.ads.zzagb zza;
    private final com.google.android.gms.internal.ads.zzahk zzb;
    private final com.google.android.gms.internal.ads.zzarr zzc;
    private final com.google.android.gms.internal.ads.zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaro(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzahk zzahkVar, com.google.android.gms.internal.ads.zzarr zzarrVar, java.lang.String str, int i) throws com.google.android.gms.internal.ads.zzat {
        this.zza = zzagbVar;
        this.zzb = zzahkVar;
        this.zzc = zzarrVar;
        int i2 = zzarrVar.zzb * zzarrVar.zze;
        int i3 = zzarrVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 28 + java.lang.String.valueOf(i3).length());
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i3);
            throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
        }
        int i5 = zzarrVar.zzc * i4;
        int i6 = i5 * 8;
        int max = java.lang.Math.max(i4, i5 / 10);
        this.zze = max;
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i6);
        zztVar.zzj(i6);
        zztVar.zzp(max);
        zztVar.zzG(zzarrVar.zzb);
        zztVar.zzH(zzarrVar.zzc);
        zztVar.zzI(i);
        this.zzd = zztVar.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void zzb(int i, long j) {
        com.google.android.gms.internal.ads.zzaru zzaruVar = new com.google.android.gms.internal.ads.zzaru(this.zzc, 1, i, j);
        this.zza.zzw(zzaruVar);
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzb;
        zzahkVar.zzA(this.zzd);
        zzahkVar.zzO(zzaruVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final boolean zzc(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zza = this.zzb.zza(zzafzVar, (int) java.lang.Math.min(i2 - i, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        com.google.android.gms.internal.ads.zzarr zzarrVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzarrVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long zzv = this.zzf + com.google.android.gms.internal.ads.zzfl.zzv(this.zzh, 1000000L, zzarrVar.zzc, java.math.RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zze(zzv, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzakw implements com.google.android.gms.internal.ads.zzakt {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzakw(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static com.google.android.gms.internal.ads.zzakw zze(com.google.android.gms.internal.ads.zzakv zzakvVar, long j) {
        long zzb = zzakvVar.zzb();
        if (zzb == -9223372036854775807L) {
            return null;
        }
        com.google.android.gms.internal.ads.zzagv zzagvVar = zzakvVar.zza;
        return new com.google.android.gms.internal.ads.zzakw(j, zzagvVar.zzc, zzb, zzagvVar.zzf, zzakvVar.zzc, zzakvVar.zzg);
    }

    private final long zzi(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        if (!zzb()) {
            com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(0L, this.zza + this.zzb);
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        long j2 = this.zzc;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        long max = java.lang.Math.max(0L, java.lang.Math.min(j, j2));
        double d = (max * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        long j3 = this.zze;
        com.google.android.gms.internal.ads.zzahc zzahcVar2 = new com.google.android.gms.internal.ads.zzahc(max, this.zza + java.lang.Math.max(this.zzb, java.lang.Math.min(java.lang.Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar2, zzahcVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzf(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        long[] jArr2 = jArr;
        double d = (j2 * 256.0d) / this.zze;
        int zzo = com.google.android.gms.internal.ads.zzfl.zzo(jArr2, (long) d, true, true);
        long zzi = zzi(zzo);
        long j3 = jArr2[zzo];
        int i = zzo + 1;
        long zzi2 = zzi(i);
        return zzi + java.lang.Math.round((j3 == (zzo == 99 ? 256L : jArr2[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (zzi2 - zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}

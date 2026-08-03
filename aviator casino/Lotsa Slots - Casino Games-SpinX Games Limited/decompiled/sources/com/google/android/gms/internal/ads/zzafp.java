package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafp implements com.google.android.gms.internal.ads.zzafz {
    private final com.google.android.gms.internal.ads.zzj zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        com.google.android.gms.internal.ads.zzal.zzb("media3.extractor");
    }

    public zzafp(com.google.android.gms.internal.ads.zzj zzjVar, long j, long j2) {
        this.zzb = zzjVar;
        this.zzd = j;
        this.zzc = j2;
    }

    private final void zzp(int i) {
        int i2 = this.zzf + i;
        int length = this.zze.length;
        if (i2 > length) {
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            this.zze = java.util.Arrays.copyOf(this.zze, java.lang.Math.max(65536 + i2, java.lang.Math.min(length + length, i2 + 524288)));
        }
    }

    private final int zzq(int i) {
        int min = java.lang.Math.min(this.zzg, i);
        zzs(min);
        return min;
    }

    private final int zzr(byte[] bArr, int i, int i2) {
        int i3 = this.zzg;
        if (i3 == 0) {
            return 0;
        }
        int min = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.zze, 0, bArr, i, min);
        zzs(min);
        return min;
    }

    private final void zzs(int i) {
        int i2 = this.zzg - i;
        this.zzg = i2;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i, int i2, int i3, boolean z) throws java.io.IOException {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException();
        }
        int zza = this.zzb.zza(bArr, i + i3, i2 - i3);
        if (zza != -1) {
            return i3 + zza;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    private final void zzu(int i) {
        if (i != -1) {
            this.zzd += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafz, com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int zzr = zzr(bArr, i, i2);
        if (zzr == 0) {
            zzr = zzt(bArr, i, i2, 0, true);
        }
        zzu(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final boolean zzb(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        int zzr = zzr(bArr, i, i2);
        while (zzr < i2 && zzr != -1) {
            zzr = zzt(bArr, i, i2, zzr, z);
        }
        zzu(zzr);
        return zzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final void zzc(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzb(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final int zzd(int i) throws java.io.IOException {
        int zzq = zzq(1);
        if (zzq == 0) {
            zzq = zzt(this.zza, 0, java.lang.Math.min(1, 4096), 0, true);
        }
        zzu(zzq);
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final boolean zze(int i, boolean z) throws java.io.IOException {
        int zzq = zzq(i);
        while (zzq < i && zzq != -1) {
            zzq = zzt(this.zza, -zzq, java.lang.Math.min(i, zzq + 4096), zzq, z);
        }
        zzu(zzq);
        return zzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final void zzf(int i) throws java.io.IOException {
        zze(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final int zzg(byte[] bArr, int i, int i2) throws java.io.IOException {
        int min;
        zzp(i2);
        int i3 = this.zzg;
        int i4 = this.zzf;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = zzt(this.zze, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = java.lang.Math.min(i2, i5);
        }
        java.lang.System.arraycopy(this.zze, this.zzf, bArr, i, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final boolean zzh(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        if (!zzj(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.zze, this.zzf - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final void zzi(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzh(bArr, i, i2, false);
    }

    public final boolean zzj(int i, boolean z) throws java.io.IOException {
        zzp(i);
        int i2 = this.zzg - this.zzf;
        while (i2 < i) {
            i2 = zzt(this.zze, this.zzf, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.zzg = this.zzf + i2;
        }
        this.zzf += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final void zzk(int i) throws java.io.IOException {
        zzj(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzm() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzo() {
        return this.zzc;
    }
}

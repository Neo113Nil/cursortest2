package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzack implements zzacw {
    private final zzl zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzaq.zzb("media3.extractor");
    }

    public zzack(zzl zzlVar, long j, long j3) {
        this.zzb = zzlVar;
        this.zzd = j;
        this.zzc = j3;
    }

    private final int zzp(byte[] bArr, int i7, int i8) {
        int i9 = this.zzg;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.zze, 0, bArr, i7, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i7, int i8, int i9, boolean z4) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int zza = this.zzb.zza(bArr, i7 + i9, i8 - i9);
        if (zza != -1) {
            return i9 + zza;
        }
        if (i9 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    private final int zzr(int i7) {
        int min = Math.min(this.zzg, i7);
        zzu(min);
        return min;
    }

    private final void zzs(int i7) {
        if (i7 != -1) {
            this.zzd += i7;
        }
    }

    private final void zzt(int i7) {
        int i8 = this.zzf + i7;
        int length = this.zze.length;
        if (i8 > length) {
            int i9 = zzen.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i8, Math.min(length + length, i8 + 524288)));
        }
    }

    private final void zzu(int i7) {
        int i8 = this.zzg - i7;
        this.zzg = i8;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i8 < bArr.length + (-524288) ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzacw, com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        int zzp = zzp(bArr, i7, i8);
        if (zzp == 0) {
            zzp = zzq(bArr, i7, i8, 0, true);
        }
        zzs(zzp);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final int zzb(byte[] bArr, int i7, int i8) {
        int min;
        zzt(i8);
        int i9 = this.zzg;
        int i10 = this.zzf;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = zzq(this.zze, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i7, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final int zzc(int i7) {
        int zzr = zzr(1);
        if (zzr == 0) {
            zzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzg(int i7) {
        zzl(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzh(byte[] bArr, int i7, int i8) {
        zzm(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzi(byte[] bArr, int i7, int i8) {
        zzn(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzk(int i7) {
        zzo(i7, false);
    }

    public final boolean zzl(int i7, boolean z4) {
        zzt(i7);
        int i8 = this.zzg - this.zzf;
        while (i8 < i7) {
            i8 = zzq(this.zze, this.zzf, i7, i8, z4);
            if (i8 == -1) {
                return false;
            }
            this.zzg = this.zzf + i8;
        }
        this.zzf += i7;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zzm(byte[] bArr, int i7, int i8, boolean z4) {
        if (!zzl(i8, z4)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i8, bArr, i7, i8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zzn(byte[] bArr, int i7, int i8, boolean z4) {
        int zzp = zzp(bArr, i7, i8);
        while (zzp < i8 && zzp != -1) {
            zzp = zzq(bArr, i7, i8, zzp, z4);
        }
        zzs(zzp);
        return zzp != -1;
    }

    public final boolean zzo(int i7, boolean z4) {
        int zzr = zzr(i7);
        while (zzr < i7 && zzr != -1) {
            zzr = zzq(this.zza, -zzr, Math.min(i7, zzr + 4096), zzr, false);
        }
        zzs(zzr);
        return zzr != -1;
    }
}

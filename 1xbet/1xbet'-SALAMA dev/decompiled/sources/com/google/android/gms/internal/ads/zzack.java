package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
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
        int iMin = Math.min(i9, i8);
        System.arraycopy(this.zze, 0, bArr, i7, iMin);
        zzu(iMin);
        return iMin;
    }

    private final int zzq(byte[] bArr, int i7, int i8, int i9, boolean z4) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i7 + i9, i8 - i9);
        if (iZza != -1) {
            return i9 + iZza;
        }
        if (i9 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    private final int zzr(int i7) {
        int iMin = Math.min(this.zzg, i7);
        zzu(iMin);
        return iMin;
    }

    private final void zzs(int i7) {
        if (i7 != -1) {
            this.zzd += (long) i7;
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
    public final int zza(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        int iZzp = zzp(bArr, i7, i8);
        if (iZzp == 0) {
            iZzp = zzq(bArr, i7, i8, 0, true);
        }
        zzs(iZzp);
        return iZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final int zzb(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        int iMin;
        zzt(i8);
        int i9 = this.zzg;
        int i10 = this.zzf;
        int i11 = i9 - i10;
        if (i11 == 0) {
            iMin = zzq(this.zze, i10, i8, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.zzg += iMin;
        } else {
            iMin = Math.min(i8, i11);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i7, iMin);
        this.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final int zzc(int i7) throws EOFException, InterruptedIOException {
        int iZzr = zzr(1);
        if (iZzr == 0) {
            iZzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final long zze() {
        return this.zzd + ((long) this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzg(int i7) throws EOFException, InterruptedIOException {
        zzl(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzh(byte[] bArr, int i7, int i8) {
        zzm(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzi(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        zzn(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzk(int i7) throws EOFException, InterruptedIOException {
        zzo(i7, false);
    }

    public final boolean zzl(int i7, boolean z4) throws EOFException, InterruptedIOException {
        zzt(i7);
        int iZzq = this.zzg - this.zzf;
        while (iZzq < i7) {
            iZzq = zzq(this.zze, this.zzf, i7, iZzq, z4);
            if (iZzq == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzq;
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
    public final boolean zzn(byte[] bArr, int i7, int i8, boolean z4) throws EOFException, InterruptedIOException {
        int iZzp = zzp(bArr, i7, i8);
        while (iZzp < i8 && iZzp != -1) {
            iZzp = zzq(bArr, i7, i8, iZzp, z4);
        }
        zzs(iZzp);
        return iZzp != -1;
    }

    public final boolean zzo(int i7, boolean z4) throws EOFException, InterruptedIOException {
        int iZzr = zzr(i7);
        while (iZzr < i7 && iZzr != -1) {
            iZzr = zzq(this.zza, -iZzr, Math.min(i7, iZzr + 4096), iZzr, false);
        }
        zzs(iZzr);
        return iZzr != -1;
    }
}

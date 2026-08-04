package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzamq {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzamq(int i7, int i8) {
        this.zzc = i7;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i7, int i8) {
        if (this.zzd) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i10 = this.zzb + i9;
            if (length < i10) {
                this.zza = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.zza, this.zzb, i9);
            this.zzb += i9;
        }
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int i7) {
        zzcv.zzf(!this.zzd);
        boolean z4 = i7 == this.zzc;
        this.zzd = z4;
        if (z4) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int i7) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i7;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final boolean zze() {
        return this.zze;
    }
}

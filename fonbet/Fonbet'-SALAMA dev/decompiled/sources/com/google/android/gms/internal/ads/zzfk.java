package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfk {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfk(byte[] bArr, int i7, int i8) {
        this.zza = bArr;
        this.zzc = i7;
        this.zzb = i8;
        zzj();
    }

    private final int zzi() {
        int i7 = 0;
        while (!zzh()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? zza(i7) : 0);
    }

    private final void zzj() {
        int i7;
        int i8 = this.zzc;
        boolean z4 = false;
        if (i8 >= 0 && (i8 < (i7 = this.zzb) || (i8 == i7 && this.zzd == 0))) {
            z4 = true;
        }
        zzcv.zzf(z4);
    }

    private final boolean zzk(int i7) {
        if (i7 < 2 || i7 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 + (-1)] == 0;
    }

    public final int zza(int i7) {
        int i8;
        this.zzd += i7;
        int i9 = 0;
        while (true) {
            i8 = this.zzd;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.zzd = i10;
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            i9 |= (bArr[i11] & 255) << i10;
            if (true != zzk(i11 + 1)) {
                r3 = 1;
            }
            this.zzc = i11 + r3;
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        int i13 = i9 | ((bArr2[i12] & 255) >> (8 - i8));
        int i14 = 32 - i7;
        if (i8 == 8) {
            this.zzd = 0;
            this.zzc = i12 + (true != zzk(i12 + 1) ? 1 : 2);
        }
        int i15 = ((-1) >>> i14) & i13;
        zzj();
        return i15;
    }

    public final int zzb() {
        int zzi = zzi();
        int i7 = zzi % 2;
        return ((zzi + 1) / 2) * (i7 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i7 = this.zzd;
        if (i7 > 0) {
            zzf(8 - i7);
        }
    }

    public final void zze() {
        int i7 = this.zzd + 1;
        this.zzd = i7;
        if (i7 == 8) {
            this.zzd = 0;
            int i8 = this.zzc;
            this.zzc = i8 + (true == zzk(i8 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzf(int i7) {
        int i8 = this.zzc;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.zzc = i10;
        int i11 = (i7 - (i9 * 8)) + this.zzd;
        this.zzd = i11;
        if (i11 > 7) {
            this.zzc = i10 + 1;
            this.zzd = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.zzc) {
                zzj();
                return;
            } else if (zzk(i8)) {
                this.zzc++;
                i8 += 2;
            }
        }
    }

    public final boolean zzg(int i7) {
        int i8 = this.zzc;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.zzd + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.zzb) {
                break;
            }
            if (zzk(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.zzb;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i7 = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        return i7 != 0;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaed {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaed(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i7) {
        int i8 = this.zzc;
        int i9 = 8 - this.zzd;
        int i10 = i8 + 1;
        byte[] bArr = this.zza;
        int min = Math.min(i7, i9);
        int i11 = ((bArr[i8] & 255) >> this.zzd) & (255 >> (8 - min));
        while (min < i7) {
            i11 |= (this.zza[i10] & 255) << min;
            min += 8;
            i10++;
        }
        int i12 = i11 & ((-1) >>> (32 - i7));
        zzc(i7);
        return i12;
    }

    public final void zzc(int i7) {
        int i8;
        int i9 = i7 / 8;
        int i10 = this.zzc + i9;
        this.zzc = i10;
        int i11 = (i7 - (i9 * 8)) + this.zzd;
        this.zzd = i11;
        if (i11 > 7) {
            i10++;
            this.zzc = i10;
            i11 -= 8;
            this.zzd = i11;
        }
        boolean z4 = false;
        if (i10 >= 0 && (i10 < (i8 = this.zzb) || (i10 == i8 && i11 == 0))) {
            z4 = true;
        }
        zzcv.zzf(z4);
    }

    public final boolean zzd() {
        int i7 = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        return 1 == (i7 & 1);
    }
}

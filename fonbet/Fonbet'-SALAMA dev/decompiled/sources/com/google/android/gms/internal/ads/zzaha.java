package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaha {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i7) {
        int i8 = 0;
        while (i8 < 8) {
            int i9 = i8 + 1;
            if ((zza[i8] & i7) != 0) {
                return i9;
            }
            i8 = i9;
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i7, boolean z4) {
        long j = bArr[0] & 255;
        if (z4) {
            j &= ~zza[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j = (j << 8) | (bArr[i8] & 255);
        }
        return j;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzacw zzacwVar, boolean z4, boolean z7, int i7) {
        if (this.zzc == 0) {
            if (!zzacwVar.zzn(this.zzb, 0, 1, z4)) {
                return -1L;
            }
            int zzb = zzb(this.zzb[0] & 255);
            this.zzd = zzb;
            if (zzb == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i8 = this.zzd;
        if (i8 > i7) {
            this.zzc = 0;
            return -2L;
        }
        if (i8 != 1) {
            zzacwVar.zzi(this.zzb, 1, i8 - 1);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z7);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}

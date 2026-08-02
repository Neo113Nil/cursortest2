package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagz {
    private final zzed zza = new zzed(8);
    private int zzb;

    private final long zzb(zzacw zzacwVar) {
        int i7;
        zzack zzackVar = (zzack) zzacwVar;
        int i8 = 0;
        zzackVar.zzm(this.zza.zzN(), 0, 1, false);
        int i9 = this.zza.zzN()[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while (true) {
            i7 = i11 + 1;
            if ((i9 & i10) != 0) {
                break;
            }
            i10 >>= 1;
            i11 = i7;
        }
        int i12 = i9 & (~i10);
        zzackVar.zzm(this.zza.zzN(), 1, i11, false);
        while (i8 < i11) {
            i8++;
            i12 = (this.zza.zzN()[i8] & 255) + (i12 << 8);
        }
        this.zzb += i7;
        return i12;
    }

    public final boolean zza(zzacw zzacwVar) {
        long zzd = zzacwVar.zzd();
        long j = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j = zzd;
        }
        zzack zzackVar = (zzack) zzacwVar;
        zzackVar.zzm(this.zza.zzN(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i7 = (int) j;
            int i8 = this.zzb + 1;
            this.zzb = i8;
            if (i8 == i7) {
                return false;
            }
            zzackVar.zzm(this.zza.zzN(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzN()[0] & 255);
        }
        long zzb = zzb(zzacwVar);
        long j3 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j7 = j3 + zzb;
            if (zzd == -1 || j7 < zzd) {
                while (true) {
                    long j8 = this.zzb;
                    if (j8 < j7) {
                        if (zzb(zzacwVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzacwVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i9 = (int) zzb2;
                            zzackVar.zzl(i9, false);
                            this.zzb += i9;
                        }
                    } else if (j8 == j7) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

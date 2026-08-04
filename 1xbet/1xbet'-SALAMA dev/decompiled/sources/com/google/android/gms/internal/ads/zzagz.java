package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
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

    public final boolean zza(zzacw zzacwVar) throws EOFException, InterruptedIOException {
        long jZzd = zzacwVar.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        zzack zzackVar = (zzack) zzacwVar;
        zzackVar.zzm(this.zza.zzN(), 0, 4, false);
        long jZzu = this.zza.zzu();
        this.zzb = 4;
        while (jZzu != 440786851) {
            int i7 = (int) j;
            int i8 = this.zzb + 1;
            this.zzb = i8;
            if (i8 == i7) {
                return false;
            }
            zzackVar.zzm(this.zza.zzN(), 0, 1, false);
            jZzu = ((jZzu << 8) & (-256)) | ((long) (this.zza.zzN()[0] & 255));
        }
        long jZzb = zzb(zzacwVar);
        long j3 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j7 = j3 + jZzb;
            if (jZzd == -1 || j7 < jZzd) {
                while (true) {
                    long j8 = this.zzb;
                    if (j8 < j7) {
                        if (zzb(zzacwVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzacwVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i9 = (int) jZzb2;
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

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzyj {
    private final int[] zza;
    private final zzwv[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwv zze;

    public zzyj(String[] strArr, int[] iArr, zzwv[] zzwvVarArr, int[] iArr2, int[][][] iArr3, zzwv zzwvVar) {
        this.zza = iArr;
        this.zzb = zzwvVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwvVar;
    }

    public final int zza(int i7, int i8, boolean z4) {
        int i9 = this.zzb[i7].zzb(i8).zza;
        int[] iArr = new int[i9];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            if ((this.zzd[i7][i8][i12] & 7) == 4) {
                iArr[i11] = i12;
                i11++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
        String str = null;
        int i13 = 0;
        int iMin = 16;
        boolean z7 = false;
        while (i10 < iArrCopyOf.length) {
            String str2 = this.zzb[i7].zzb(i8).zzb(iArrCopyOf[i10]).zzo;
            int i14 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                int i15 = zzen.zza;
                z7 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i7][i8][i10] & 24);
            i10++;
            i13 = i14;
        }
        return z7 ? Math.min(iMin, this.zzc[i7]) : iMin;
    }

    public final int zzb(int i7, int i8, int i9) {
        return this.zzd[i7][i8][i9];
    }

    public final int zzc(int i7) {
        return this.zza[i7];
    }

    public final zzwv zzd(int i7) {
        return this.zzb[i7];
    }

    public final zzwv zze() {
        return this.zze;
    }
}

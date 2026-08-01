package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
class zzhmd {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhmd() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhmd(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void zzb(zzhmd zzhmdVar, int i) {
        zzhmc.zza(this.zza, zzhmdVar.zza, i);
        zzhmc.zza(this.zzb, zzhmdVar.zzb, i);
        zzhmc.zza(this.zzc, zzhmdVar.zzc, i);
    }

    zzhmd(zzhmd zzhmdVar) {
        this.zza = Arrays.copyOf(zzhmdVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhmdVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhmdVar.zzc, 10);
    }
}

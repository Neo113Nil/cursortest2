package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzhkx {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhkx() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhkx(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    void zza(long[] jArr, long[] jArr2) {
        java.lang.System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void zzb(com.google.android.gms.internal.ads.zzhkx zzhkxVar, int i) {
        com.google.android.gms.internal.ads.zzhkw.zza(this.zza, zzhkxVar.zza, i);
        com.google.android.gms.internal.ads.zzhkw.zza(this.zzb, zzhkxVar.zzb, i);
        com.google.android.gms.internal.ads.zzhkw.zza(this.zzc, zzhkxVar.zzc, i);
    }

    zzhkx(com.google.android.gms.internal.ads.zzhkx zzhkxVar) {
        this.zza = java.util.Arrays.copyOf(zzhkxVar.zza, 10);
        this.zzb = java.util.Arrays.copyOf(zzhkxVar.zzb, 10);
        this.zzc = java.util.Arrays.copyOf(zzhkxVar.zzc, 10);
    }
}

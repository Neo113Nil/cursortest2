package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhkz {
    final com.google.android.gms.internal.ads.zzhla zza;
    final long[] zzb;

    zzhkz() {
        this(new com.google.android.gms.internal.ads.zzhla(), new long[10]);
    }

    zzhkz(com.google.android.gms.internal.ads.zzhla zzhlaVar, long[] jArr) {
        this.zza = zzhlaVar;
        this.zzb = jArr;
    }

    zzhkz(com.google.android.gms.internal.ads.zzhkz zzhkzVar) {
        this.zza = new com.google.android.gms.internal.ads.zzhla(zzhkzVar.zza);
        this.zzb = java.util.Arrays.copyOf(zzhkzVar.zzb, 10);
    }
}

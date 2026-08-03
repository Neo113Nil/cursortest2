package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhlb {
    final com.google.android.gms.internal.ads.zzhla zza;
    final long[] zzb;

    zzhlb() {
        this(new com.google.android.gms.internal.ads.zzhla(), new long[10]);
    }

    zzhlb(com.google.android.gms.internal.ads.zzhla zzhlaVar, long[] jArr) {
        this.zza = zzhlaVar;
        this.zzb = jArr;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzhlb zza(com.google.android.gms.internal.ads.zzhlb zzhlbVar, com.google.android.gms.internal.ads.zzhkz zzhkzVar) {
        zzb(zzhlbVar, zzhkzVar);
        return zzhlbVar;
    }

    private static com.google.android.gms.internal.ads.zzhlb zzb(com.google.android.gms.internal.ads.zzhlb zzhlbVar, com.google.android.gms.internal.ads.zzhkz zzhkzVar) {
        com.google.android.gms.internal.ads.zzhla zzhlaVar = zzhkzVar.zza;
        com.google.android.gms.internal.ads.zzhla zzhlaVar2 = zzhlbVar.zza;
        long[] jArr = zzhlaVar2.zza;
        long[] jArr2 = zzhlaVar.zza;
        long[] jArr3 = zzhkzVar.zzb;
        com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhlaVar2.zzb;
        long[] jArr5 = zzhlaVar.zzb;
        long[] jArr6 = zzhlaVar.zzc;
        com.google.android.gms.internal.ads.zzhlj.zze(jArr4, jArr5, jArr6);
        com.google.android.gms.internal.ads.zzhlj.zze(zzhlaVar2.zzc, jArr6, jArr3);
        com.google.android.gms.internal.ads.zzhlj.zze(zzhlbVar.zzb, jArr2, jArr5);
        return zzhlbVar;
    }

    zzhlb(com.google.android.gms.internal.ads.zzhkz zzhkzVar) {
        this();
        zzb(this, zzhkzVar);
    }
}

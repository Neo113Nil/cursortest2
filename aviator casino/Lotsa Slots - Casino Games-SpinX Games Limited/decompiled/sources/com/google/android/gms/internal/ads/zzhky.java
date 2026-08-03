package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhky extends com.google.android.gms.internal.ads.zzhkx {
    private final long[] zzd;

    zzhky() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhkx
    public final void zza(long[] jArr, long[] jArr2) {
        com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhky(com.google.android.gms.internal.ads.zzhlb zzhlbVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        com.google.android.gms.internal.ads.zzhla zzhlaVar = zzhlbVar.zza;
        com.google.android.gms.internal.ads.zzhlj.zza(jArr2, zzhlaVar.zzb, zzhlaVar.zza);
        long[] jArr3 = this.zzb;
        com.google.android.gms.internal.ads.zzhla zzhlaVar2 = zzhlbVar.zza;
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr3, zzhlaVar2.zzb, zzhlaVar2.zza);
        java.lang.System.arraycopy(zzhlbVar.zza.zzc, 0, jArr, 0, 10);
        com.google.android.gms.internal.ads.zzhlj.zze(this.zzc, zzhlbVar.zzb, com.google.android.gms.internal.ads.zzhle.zzb);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhme extends zzhmd {
    private final long[] zzd;

    zzhme() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhmd
    public final void zza(long[] jArr, long[] jArr2) {
        zzhmp.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhme(zzhmh zzhmhVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhmg zzhmgVar = zzhmhVar.zza;
        zzhmp.zza(jArr2, zzhmgVar.zzb, zzhmgVar.zza);
        long[] jArr3 = this.zzb;
        zzhmg zzhmgVar2 = zzhmhVar.zza;
        zzhmp.zzb(jArr3, zzhmgVar2.zzb, zzhmgVar2.zza);
        System.arraycopy(zzhmhVar.zza.zzc, 0, jArr, 0, 10);
        zzhmp.zze(this.zzc, zzhmhVar.zzb, zzhmk.zzb);
    }
}

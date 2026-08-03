package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbyn extends com.google.android.gms.internal.ads.zzbnh {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyo zza;

    /* synthetic */ zzbyn(com.google.android.gms.internal.ads.zzbyo zzbyoVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbyoVar);
        this.zza = zzbyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zze(com.google.android.gms.internal.ads.zzbmv zzbmvVar) {
        com.google.android.gms.internal.ads.zzbyo zzbyoVar = this.zza;
        zzbyoVar.zzd().onCustomFormatAdLoaded(zzbyoVar.zzc(zzbmvVar));
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgc implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcga zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfy zzb;

    zzcgc(com.google.android.gms.internal.ads.zzcgd zzcgdVar, com.google.android.gms.internal.ads.zzcga zzcgaVar, com.google.android.gms.internal.ads.zzcfy zzcfyVar) {
        this.zza = zzcgaVar;
        this.zzb = zzcfyVar;
        java.util.Objects.requireNonNull(zzcgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        this.zza.zza(obj);
    }
}

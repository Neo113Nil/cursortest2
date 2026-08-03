package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfhm implements com.google.android.gms.internal.ads.zzfhw {
    private com.google.android.gms.internal.ads.zzdbz zza;

    @Override // com.google.android.gms.internal.ads.zzfhw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzdbz zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, java.lang.Object obj) {
        return zzb(zzfhxVar, zzfhvVar, null);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, com.google.android.gms.internal.ads.zzdbz zzdbzVar) {
        com.google.android.gms.internal.ads.zzcyx zza;
        if (zzdbzVar != null) {
            this.zza = zzdbzVar;
        } else {
            this.zza = (com.google.android.gms.internal.ads.zzdbz) zzfhvVar.zza(zzfhxVar.zzb).zzh();
        }
        zza = this.zza.zza();
        return zza.zzc(zza.zzb());
    }
}

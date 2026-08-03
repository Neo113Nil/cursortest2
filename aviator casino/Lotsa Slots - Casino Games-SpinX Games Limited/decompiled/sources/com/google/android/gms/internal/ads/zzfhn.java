package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfhn implements com.google.android.gms.internal.ads.zzfhw {
    private final com.google.android.gms.internal.ads.zzfhw zza;
    private com.google.android.gms.internal.ads.zzdbz zzb;

    public zzfhn(com.google.android.gms.internal.ads.zzfhw zzfhwVar) {
        this.zza = zzfhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzdbz zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, java.lang.Object obj) {
        return zzb(zzfhxVar, zzfhvVar, null);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, com.google.android.gms.internal.ads.zzdbz zzdbzVar) {
        com.google.android.gms.internal.ads.zzcbd zzcbdVar;
        this.zzb = zzdbzVar;
        if (zzdbzVar == null || (zzcbdVar = zzfhxVar.zza) == null) {
            com.google.android.gms.internal.ads.zzdbz zzdbzVar2 = zzdbzVar;
            return ((com.google.android.gms.internal.ads.zzfhm) this.zza).zzb(zzfhxVar, zzfhvVar, zzdbzVar);
        }
        com.google.android.gms.internal.ads.zzcyx zza = zzdbzVar.zza();
        return zza.zzc(zza.zza(com.google.android.gms.internal.ads.zzhbw.zza(zzcbdVar)));
    }
}

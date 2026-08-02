package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfzo extends zzfzq {
    public zzfzo(I3.b bVar, Class cls, zzgaj zzgajVar) {
        super(bVar, cls, zzgajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) {
        zzgaj zzgajVar = (zzgaj) obj;
        I3.b zza = zzgajVar.zza(th);
        zzfth.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgajVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final /* synthetic */ void zzf(Object obj) {
        zzs((I3.b) obj);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfzx extends zzfzz {
    public zzfzx(I3.b bVar, zzgaj zzgajVar) {
        super(bVar, zzgajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzgaj zzgajVar = (zzgaj) obj;
        I3.b zza = zzgajVar.zza(obj2);
        zzfth.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgajVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final /* synthetic */ void zzf(Object obj) {
        zzs((I3.b) obj);
    }
}

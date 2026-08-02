package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgcb extends zzgbk {
    final /* synthetic */ zzgcd zza;
    private final zzgai zzb;

    public zzgcb(zzgcd zzgcdVar, zzgai zzgaiVar) {
        this.zza = zzgcdVar;
        this.zzb = zzgaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final /* bridge */ /* synthetic */ Object zza() {
        zzgai zzgaiVar = this.zzb;
        I3.b zza = zzgaiVar.zza();
        zzfth.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgaiVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((I3.b) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final boolean zzg() {
        return this.zza.isDone();
    }
}

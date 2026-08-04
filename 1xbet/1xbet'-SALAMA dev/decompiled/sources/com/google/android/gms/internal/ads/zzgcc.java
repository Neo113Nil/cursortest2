package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzgcc extends zzgbk {
    final /* synthetic */ zzgcd zza;
    private final Callable zzb;

    public zzgcc(zzgcd zzgcdVar, Callable callable) {
        this.zza = zzgcdVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final Object zza() {
        return this.zzb.call();
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
    public final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final boolean zzg() {
        return this.zza.isDone();
    }
}

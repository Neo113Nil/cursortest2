package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzie implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.common.util.concurrent.SettableFuture zza;

    zzie(com.google.android.libraries.places.internal.zzja zzjaVar, com.google.common.util.concurrent.SettableFuture settableFuture) {
        this.zza = settableFuture;
        java.util.Objects.requireNonNull(zzjaVar);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        com.google.android.libraries.places.api.auth.zza zzd = com.google.android.libraries.places.api.auth.zzb.zzd();
        zzd.zza(true);
        zzd.zzb("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==");
        zzd.zzc(th.getMessage());
        this.zza.set(zzd.zzd());
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final /* synthetic */ void onSuccess(java.lang.Object obj) {
        com.google.android.libraries.places.api.auth.zza zzd = com.google.android.libraries.places.api.auth.zzb.zzd();
        zzd.zza(true);
        zzd.zzb((java.lang.String) obj);
        zzd.zzc(null);
        this.zza.set(zzd.zzd());
    }
}

package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zznc implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.libraries.places.internal.zzaoc zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzne zzb;

    zznc(com.google.android.libraries.places.internal.zzne zzneVar, com.google.android.libraries.places.internal.zzaoc zzaocVar) {
        this.zza = zzaocVar;
        java.util.Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final /* synthetic */ void onSuccess(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!str.isEmpty()) {
            com.google.android.libraries.places.internal.zzaoc zzaocVar = this.zza;
            com.google.android.libraries.places.internal.zzbhk zzc = com.google.android.libraries.places.internal.zzbhl.zzc();
            zzc.zza(str);
            zzaocVar.zzk(zzc);
        }
        this.zzb.zzc(this.zza);
    }
}

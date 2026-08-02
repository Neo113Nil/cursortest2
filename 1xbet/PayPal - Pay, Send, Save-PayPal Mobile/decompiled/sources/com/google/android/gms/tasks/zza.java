package com.google.android.gms.tasks;

/* loaded from: classes8.dex */
final class zza implements com.google.android.gms.tasks.OnSuccessListener {
    final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zza;

    zza(com.google.android.gms.tasks.zzb zzbVar, com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
        java.util.Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(java.lang.Object obj) {
        this.zza.onCanceled();
    }
}

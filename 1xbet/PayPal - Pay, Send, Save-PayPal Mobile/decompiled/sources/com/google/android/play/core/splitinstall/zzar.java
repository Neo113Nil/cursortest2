package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzar extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzb = zzbcVar;
        this.zza = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        java.lang.String str;
        try {
            ?? zze = this.zzb.zza.zze();
            com.google.android.play.core.splitinstall.zzbc zzbcVar = this.zzb;
            str = zzbcVar.zzd;
            zze.zzi(str, new com.google.android.play.core.splitinstall.zzaz(zzbcVar, this.zza));
        } catch (android.os.RemoteException e) {
            zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
            zzuVar.zzc(e, "getSessionStates", new java.lang.Object[0]);
            this.zza.trySetException(new java.lang.RuntimeException(e));
        }
    }
}

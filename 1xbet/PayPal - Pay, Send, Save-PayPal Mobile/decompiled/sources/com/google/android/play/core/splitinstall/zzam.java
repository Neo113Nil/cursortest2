package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzam extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzam(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.util.List list, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzbcVar;
        this.zza = list;
        this.zzb = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        java.lang.String str;
        android.os.Bundle zzo;
        try {
            ?? zze = this.zzc.zza.zze();
            str = this.zzc.zzd;
            java.util.ArrayList zzn = com.google.android.play.core.splitinstall.zzbc.zzn(this.zza);
            zzo = com.google.android.play.core.splitinstall.zzbc.zzo();
            zze.zzg(str, zzn, zzo, new com.google.android.play.core.splitinstall.zzax(this.zzc, this.zzb));
        } catch (android.os.RemoteException e) {
            zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
            zzuVar.zzc(e, "deferredUninstall(%s)", this.zza);
            this.zzb.trySetException(new java.lang.RuntimeException(e));
        }
    }
}

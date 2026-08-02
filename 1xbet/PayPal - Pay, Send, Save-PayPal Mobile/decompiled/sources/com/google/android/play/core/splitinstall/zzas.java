package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzas extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzbcVar;
        this.zza = i;
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
            int i = this.zza;
            zzo = com.google.android.play.core.splitinstall.zzbc.zzo();
            zze.zzc(str, i, zzo, new com.google.android.play.core.splitinstall.zzat(this.zzc, this.zzb));
        } catch (android.os.RemoteException e) {
            zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
            zzuVar.zzc(e, "cancelInstall(%d)", java.lang.Integer.valueOf(this.zza));
            this.zzb.trySetException(new java.lang.RuntimeException(e));
        }
    }
}

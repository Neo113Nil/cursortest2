package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzaq extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaq(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
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
        try {
            ?? zze = this.zzc.zza.zze();
            com.google.android.play.core.splitinstall.zzbc zzbcVar = this.zzc;
            str = zzbcVar.zzd;
            zze.zzh(str, this.zza, new com.google.android.play.core.splitinstall.zzay(zzbcVar, this.zzb));
        } catch (android.os.RemoteException e) {
            zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
            zzuVar.zzc(e, "getSessionState(%d)", java.lang.Integer.valueOf(this.zza));
            this.zzb.trySetException(new java.lang.RuntimeException(e));
        }
    }
}

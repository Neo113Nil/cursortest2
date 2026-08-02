package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzal extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ java.util.Collection zza;
    final /* synthetic */ java.util.Collection zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzn zzc;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzd;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.util.Collection collection, java.util.Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzbcVar;
        this.zza = collection;
        this.zzb = collection2;
        this.zzc = zznVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        java.lang.String str;
        java.util.ArrayList zzn = com.google.android.play.core.splitinstall.zzbc.zzn(this.zza);
        zzn.addAll(com.google.android.play.core.splitinstall.zzbc.zzm(this.zzb));
        try {
            this.zzc.zzb(2);
            ?? zze = this.zze.zza.zze();
            str = this.zze.zzd;
            zze.zzj(str, zzn, com.google.android.play.core.splitinstall.zzbc.zzb(this.zzc), new com.google.android.play.core.splitinstall.zzba(this.zze, this.zzd));
        } catch (android.os.RemoteException e) {
            zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
            zzuVar.zzc(e, "startInstall(%s,%s)", this.zza, this.zzb);
            this.zzd.trySetException(new java.lang.RuntimeException(e));
        }
    }
}

package com.google.android.play.core.review;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
final class zzf extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.play.core.review.zzi zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(com.google.android.play.core.review.zzi zziVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzb = zziVar;
        this.zza = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.review.internal.zzf] */
    @Override // com.google.android.play.core.review.internal.zzj
    protected final void zza() {
        com.google.android.play.core.review.internal.zzi zziVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            ?? zze = this.zzb.zza.zze();
            str2 = this.zzb.zzc;
            android.os.Bundle zza = com.google.android.play.core.review.zzj.zza();
            com.google.android.play.core.review.zzi zziVar2 = this.zzb;
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
            str3 = zziVar2.zzc;
            zze.zzc(str2, zza, new com.google.android.play.core.review.zzh(zziVar2, taskCompletionSource, str3));
        } catch (android.os.RemoteException e) {
            zziVar = com.google.android.play.core.review.zzi.zzb;
            str = this.zzb.zzc;
            zziVar.zzc(e, "error requesting in-app review for %s", str);
            this.zza.trySetException(new java.lang.RuntimeException(e));
        }
    }
}

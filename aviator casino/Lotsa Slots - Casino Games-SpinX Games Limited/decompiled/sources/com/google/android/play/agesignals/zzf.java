package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzf extends com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback.Stub {
    final com.google.android.gms.internal.playcore_age_signals.zzd zza;
    final com.google.android.gms.tasks.TaskCompletionSource zzb;
    final /* synthetic */ com.google.android.play.agesignals.zzg zzc;

    zzf(com.google.android.play.agesignals.zzg zzgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        java.util.Objects.requireNonNull(zzgVar);
        this.zzc = zzgVar;
        this.zza = new com.google.android.gms.internal.playcore_age_signals.zzd("OnCheckAgeSignalsCallback");
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
    public final void onCompleteCheckAgeSignals(android.os.Bundle bundle) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzc.zza;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zzb;
        zzoVar.zzu(taskCompletionSource);
        this.zza.zzc("onCompleteCheckAgeSignals", new java.lang.Object[0]);
        taskCompletionSource.trySetResult(com.google.android.play.agesignals.AgeSignalsResult.zza(bundle));
    }

    @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
    public final void onError(android.os.Bundle bundle) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzc.zza;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zzb;
        zzoVar.zzu(taskCompletionSource);
        int i = bundle.getInt("error.code");
        this.zza.zza("onError(%d)", java.lang.Integer.valueOf(i));
        taskCompletionSource.trySetException(new com.google.android.play.agesignals.AgeSignalsException(i));
    }
}

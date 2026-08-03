package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zze extends com.google.android.gms.internal.playcore_age_signals.zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.play.agesignals.AgeSignalsRequest zzb;
    final /* synthetic */ com.google.android.play.agesignals.zzg zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(com.google.android.play.agesignals.zzg zzgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.agesignals.AgeSignalsRequest ageSignalsRequest) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = ageSignalsRequest;
        java.util.Objects.requireNonNull(zzgVar);
        this.zzc = zzgVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zza(java.lang.Exception exc) {
        if (exc instanceof com.google.android.gms.internal.playcore_age_signals.zzp) {
            super.zza(new com.google.android.play.agesignals.AgeSignalsException(-5));
        } else {
            super.zza(exc);
        }
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    protected final void zzb() {
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar;
        android.content.Context context;
        try {
            com.google.android.play.agesignals.zzg zzgVar = this.zzc;
            com.google.android.play.agesignals.protocol.IAgeSignalsService iAgeSignalsService = (com.google.android.play.agesignals.protocol.IAgeSignalsService) zzgVar.zza.zze();
            context = zzgVar.zzc;
            java.lang.String packageName = context.getPackageName();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("playcore.version.code", 2);
            iAgeSignalsService.checkAgeRange(packageName, bundle, new com.google.android.play.agesignals.zzf(zzgVar, this.zza));
        } catch (android.os.RemoteException e) {
            com.google.android.play.agesignals.AgeSignalsRequest ageSignalsRequest = this.zzb;
            zzdVar = com.google.android.play.agesignals.zzg.zzb;
            zzdVar.zzb(e, "checkAgeSignals(%s)", ageSignalsRequest);
            this.zza.trySetException(new com.google.android.play.agesignals.AgeSignalsException(-100));
        }
    }
}

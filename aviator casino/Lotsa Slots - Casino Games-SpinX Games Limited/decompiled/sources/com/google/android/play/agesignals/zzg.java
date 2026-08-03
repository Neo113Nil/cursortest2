package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public final class zzg {
    private static final com.google.android.gms.internal.playcore_age_signals.zzd zzb = new com.google.android.gms.internal.playcore_age_signals.zzd("AgeSignalsService");
    final com.google.android.gms.internal.playcore_age_signals.zzo zza;
    private final android.content.Context zzc;

    public zzg(android.content.Context context) {
        this.zzc = context;
        if (com.google.android.gms.internal.playcore_age_signals.zzr.zzb(context)) {
            this.zza = new com.google.android.gms.internal.playcore_age_signals.zzo(context, zzb, "AgeSignalsService", com.google.android.play.agesignals.zza.zza, new com.google.android.play.agesignals.zzd(), null);
        } else {
            this.zza = null;
        }
    }

    private static com.google.android.gms.tasks.Task zzd(int i) {
        zzb.zza("onError(%d)", java.lang.Integer.valueOf(i));
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.agesignals.AgeSignalsException(i));
    }

    public final com.google.android.gms.tasks.Task zzb(com.google.android.play.agesignals.AgeSignalsRequest ageSignalsRequest) {
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zza;
        if (zzoVar == null) {
            return zzd(-2);
        }
        if (com.google.android.gms.internal.playcore_age_signals.zzr.zza(this.zzc) < 82380000) {
            return zzd(-6);
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zzoVar.zzt(new com.google.android.play.agesignals.zze(this, taskCompletionSource, taskCompletionSource, ageSignalsRequest), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}

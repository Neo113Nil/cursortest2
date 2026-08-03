package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public final class zzb implements com.google.android.play.agesignals.AgeSignalsManager {
    private final com.google.android.play.agesignals.zzg zza;

    zzb(com.google.android.play.agesignals.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.agesignals.AgeSignalsResult> checkAgeSignals(com.google.android.play.agesignals.AgeSignalsRequest ageSignalsRequest) {
        return this.zza.zzb(ageSignalsRequest);
    }
}

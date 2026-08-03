package com.google.android.play.agesignals.testing;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public class FakeAgeSignalsManager implements com.google.android.play.agesignals.AgeSignalsManager {
    private com.google.android.play.agesignals.AgeSignalsException zza;
    private com.google.android.play.agesignals.AgeSignalsResult zzb;

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public com.google.android.gms.tasks.Task<com.google.android.play.agesignals.AgeSignalsResult> checkAgeSignals(com.google.android.play.agesignals.AgeSignalsRequest ageSignalsRequest) {
        com.google.android.play.agesignals.AgeSignalsException ageSignalsException = this.zza;
        if (ageSignalsException != null) {
            return com.google.android.gms.tasks.Tasks.forException(ageSignalsException);
        }
        com.google.android.play.agesignals.AgeSignalsResult ageSignalsResult = this.zzb;
        return ageSignalsResult != null ? com.google.android.gms.tasks.Tasks.forResult(ageSignalsResult) : com.google.android.gms.tasks.Tasks.forException(new java.lang.IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    public void setNextAgeSignalsException(com.google.android.play.agesignals.AgeSignalsException ageSignalsException) {
        this.zza = ageSignalsException;
        this.zzb = null;
    }

    public void setNextAgeSignalsResult(com.google.android.play.agesignals.AgeSignalsResult ageSignalsResult) {
        this.zza = null;
        this.zzb = ageSignalsResult;
    }
}

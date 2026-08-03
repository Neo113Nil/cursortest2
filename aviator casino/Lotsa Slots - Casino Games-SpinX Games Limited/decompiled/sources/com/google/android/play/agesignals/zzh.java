package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzh extends com.google.android.play.agesignals.AgeSignalsResult.Builder {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;
    private java.lang.Integer zzc;
    private java.util.Date zzd;
    private java.lang.String zze;

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final com.google.android.play.agesignals.AgeSignalsResult build() {
        return new com.google.android.play.agesignals.zzj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final com.google.android.play.agesignals.AgeSignalsResult.Builder setAgeLower(java.lang.Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final com.google.android.play.agesignals.AgeSignalsResult.Builder setAgeUpper(java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final com.google.android.play.agesignals.AgeSignalsResult.Builder setInstallId(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final com.google.android.play.agesignals.AgeSignalsResult.Builder setMostRecentApprovalDate(java.util.Date date) {
        this.zzd = date;
        return this;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult.Builder
    public final com.google.android.play.agesignals.AgeSignalsResult.Builder setUserStatus(java.lang.Integer num) {
        this.zza = num;
        return this;
    }
}

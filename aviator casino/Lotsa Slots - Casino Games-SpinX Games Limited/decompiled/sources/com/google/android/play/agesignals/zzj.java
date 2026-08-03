package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzj extends com.google.android.play.agesignals.AgeSignalsResult {
    private final java.lang.Integer zza;
    private final java.lang.Integer zzb;
    private final java.lang.Integer zzc;
    private final java.util.Date zzd;
    private final java.lang.String zze;

    /* synthetic */ zzj(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.util.Date date, java.lang.String str, com.google.android.play.agesignals.zzi zziVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = num3;
        this.zzd = date;
        this.zze = str;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final java.lang.Integer ageLower() {
        return this.zzb;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final java.lang.Integer ageUpper() {
        return this.zzc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.agesignals.AgeSignalsResult) {
            com.google.android.play.agesignals.AgeSignalsResult ageSignalsResult = (com.google.android.play.agesignals.AgeSignalsResult) obj;
            java.lang.Integer num = this.zza;
            if (num != null ? num.equals(ageSignalsResult.userStatus()) : ageSignalsResult.userStatus() == null) {
                java.lang.Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(ageSignalsResult.ageLower()) : ageSignalsResult.ageLower() == null) {
                    java.lang.Integer num3 = this.zzc;
                    if (num3 != null ? num3.equals(ageSignalsResult.ageUpper()) : ageSignalsResult.ageUpper() == null) {
                        java.util.Date date = this.zzd;
                        if (date != null ? date.equals(ageSignalsResult.mostRecentApprovalDate()) : ageSignalsResult.mostRecentApprovalDate() == null) {
                            java.lang.String str = this.zze;
                            if (str != null ? str.equals(ageSignalsResult.installId()) : ageSignalsResult.installId() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final java.lang.String installId() {
        return this.zze;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final java.util.Date mostRecentApprovalDate() {
        return this.zzd;
    }

    public final java.lang.String toString() {
        return "AgeSignalsResult{userStatus=" + this.zza + ", ageLower=" + this.zzb + ", ageUpper=" + this.zzc + ", mostRecentApprovalDate=" + java.lang.String.valueOf(this.zzd) + ", installId=" + this.zze + "}";
    }

    @Override // com.google.android.play.agesignals.AgeSignalsResult
    public final java.lang.Integer userStatus() {
        return this.zza;
    }

    public final int hashCode() {
        java.lang.Integer num = this.zza;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.zzb;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = hashCode ^ 1000003;
        java.lang.Integer num3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        java.util.Date date = this.zzd;
        int hashCode4 = (hashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        java.lang.String str = this.zze;
        return hashCode4 ^ (str != null ? str.hashCode() : 0);
    }
}

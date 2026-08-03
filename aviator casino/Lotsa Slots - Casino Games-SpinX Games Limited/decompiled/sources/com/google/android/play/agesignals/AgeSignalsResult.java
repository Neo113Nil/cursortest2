package com.google.android.play.agesignals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public abstract class AgeSignalsResult {

    /* compiled from: com.google.android.play:age-signals@@0.0.2 */
    public static abstract class Builder {
        public abstract com.google.android.play.agesignals.AgeSignalsResult build();

        public abstract com.google.android.play.agesignals.AgeSignalsResult.Builder setAgeLower(java.lang.Integer num);

        public abstract com.google.android.play.agesignals.AgeSignalsResult.Builder setAgeUpper(java.lang.Integer num);

        public abstract com.google.android.play.agesignals.AgeSignalsResult.Builder setInstallId(java.lang.String str);

        public abstract com.google.android.play.agesignals.AgeSignalsResult.Builder setMostRecentApprovalDate(java.util.Date date);

        public abstract com.google.android.play.agesignals.AgeSignalsResult.Builder setUserStatus(java.lang.Integer num);
    }

    public static com.google.android.play.agesignals.AgeSignalsResult.Builder builder() {
        return new com.google.android.play.agesignals.zzh();
    }

    public static com.google.android.play.agesignals.AgeSignalsResult zza(android.os.Bundle bundle) {
        if (!bundle.containsKey("user.status")) {
            return builder().build();
        }
        com.google.android.play.agesignals.AgeSignalsResult.Builder builder = builder();
        builder.setUserStatus(zzb(bundle, "user.status"));
        builder.setAgeLower(zzb(bundle, "age.range.lower"));
        builder.setAgeUpper(zzb(bundle, "age.range.upper"));
        builder.setMostRecentApprovalDate(bundle.containsKey("most.recent.approval.date") ? new java.util.Date(bundle.getLong("most.recent.approval.date")) : null);
        builder.setInstallId(bundle.containsKey("install.id") ? bundle.getString("install.id") : null);
        return builder.build();
    }

    private static java.lang.Integer zzb(android.os.Bundle bundle, java.lang.String str) {
        if (bundle.containsKey(str)) {
            return java.lang.Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public abstract java.lang.Integer ageLower();

    public abstract java.lang.Integer ageUpper();

    public abstract java.lang.String installId();

    public abstract java.util.Date mostRecentApprovalDate();

    public abstract java.lang.Integer userStatus();
}

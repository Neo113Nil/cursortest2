package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class ActivityTransition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransition> CREATOR = new com.google.android.gms.location.zze();
    private final int zza;
    private final int zzb;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SupportedActivityTransition {
    }

    ActivityTransition(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public static void zza(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 30);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.ActivityTransition)) {
            return false;
        }
        com.google.android.gms.location.ActivityTransition activityTransition = (com.google.android.gms.location.ActivityTransition) obj;
        return this.zza == activityTransition.zza && this.zzb == activityTransition.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb));
    }

    public java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 52 + java.lang.String.valueOf(i2).length() + 1);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        public com.google.android.gms.location.ActivityTransition build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza != -1, "Activity type not set.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzb != -1, "Activity transition type not set.");
            return new com.google.android.gms.location.ActivityTransition(this.zza, this.zzb);
        }

        public com.google.android.gms.location.ActivityTransition.Builder setActivityTransition(int i) {
            com.google.android.gms.location.ActivityTransition.zza(i);
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.location.ActivityTransition.Builder setActivityType(int i) {
            this.zza = i;
            return this;
        }
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int getActivityType() {
        return this.zza;
    }
}

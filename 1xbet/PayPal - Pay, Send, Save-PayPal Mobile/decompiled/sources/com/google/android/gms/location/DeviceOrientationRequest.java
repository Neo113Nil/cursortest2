package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class DeviceOrientationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.DeviceOrientationRequest> CREATOR = new com.google.android.gms.location.zzn();
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;
    private final long zza;
    private final boolean zzb;

    public static final class Builder {
        private long zza;
        private final boolean zzb;

        public Builder(long j) {
            this.zzb = false;
            setSamplingPeriodMicros(j);
        }

        public final com.google.android.gms.location.DeviceOrientationRequest build() {
            return new com.google.android.gms.location.DeviceOrientationRequest(this.zza, this.zzb);
        }

        public final com.google.android.gms.location.DeviceOrientationRequest.Builder setSamplingPeriodMicros(long j) {
            boolean z = false;
            if (j >= 0 && j < Long.MAX_VALUE) {
                z = true;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 102);
            sb.append("Invalid interval: ");
            sb.append(j);
            sb.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
            com.google.android.gms.internal.identity.zzer.zzb(z, sb.toString());
            this.zza = j;
            return this;
        }

        public Builder(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest) {
            this.zza = deviceOrientationRequest.zza();
            this.zzb = deviceOrientationRequest.zzb();
        }
    }

    DeviceOrientationRequest(long j, boolean z) {
        this.zza = j;
        this.zzb = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.DeviceOrientationRequest)) {
            return false;
        }
        com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest = (com.google.android.gms.location.DeviceOrientationRequest) obj;
        return this.zza == deviceOrientationRequest.zza && this.zzb == deviceOrientationRequest.zzb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Boolean.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        long j = this.zza;
        int length = java.lang.String.valueOf(j).length();
        java.lang.String str = true != this.zzb ? "" : ", withVelocity";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 46 + str.length() + 1);
        sb.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(j);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, getSamplingPeriodMicros());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final /* synthetic */ boolean zzb() {
        return this.zzb;
    }

    final /* synthetic */ long zza() {
        return this.zza;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getSamplingPeriodMicros() {
        return this.zza;
    }
}

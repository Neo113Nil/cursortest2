package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public final class ComplianceOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ComplianceOptions> CREATOR;
    public static final com.google.android.gms.common.api.ComplianceOptions zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;

    static {
        com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder = newBuilder();
        newBuilder.setCallerProductId(-1);
        newBuilder.setDataOwnerProductId(-1);
        newBuilder.setProcessingReason(0);
        newBuilder.setIsUserData(true);
        zza = newBuilder.build();
        CREATOR = new com.google.android.gms.common.api.zzc();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.ComplianceOptions)) {
            return false;
        }
        com.google.android.gms.common.api.ComplianceOptions complianceOptions = (com.google.android.gms.common.api.ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze));
    }

    public final com.google.android.gms.common.api.ComplianceOptions.Builder toBuilder() {
        com.google.android.gms.common.api.ComplianceOptions.Builder builder = new com.google.android.gms.common.api.ComplianceOptions.Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    public final java.lang.String toString() {
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = java.lang.String.valueOf(i2).length();
        int i3 = this.zzd;
        int length3 = java.lang.String.valueOf(i3).length();
        boolean z = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 55 + length2 + 19 + length3 + 13 + java.lang.String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzb;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        public final com.google.android.gms.common.api.ComplianceOptions build() {
            return new com.google.android.gms.common.api.ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public final com.google.android.gms.common.api.ComplianceOptions.Builder setProcessingReason(int i) {
            this.zzc = i;
            return this;
        }

        public final com.google.android.gms.common.api.ComplianceOptions.Builder setIsUserData(boolean z) {
            this.zzd = z;
            return this;
        }

        public final com.google.android.gms.common.api.ComplianceOptions.Builder setDataOwnerProductId(int i) {
            this.zzb = i;
            return this;
        }

        public final com.google.android.gms.common.api.ComplianceOptions.Builder setCallerProductId(int i) {
            this.zza = i;
            return this;
        }
    }

    public static final com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder(android.content.Context context) {
        return newBuilder();
    }

    public static com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder() {
        return new com.google.android.gms.common.api.ComplianceOptions.Builder();
    }

    ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }
}

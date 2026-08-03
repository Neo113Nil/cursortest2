package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class ApiMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final com.google.android.gms.common.api.ApiMetadata zza;
    private final com.google.android.gms.common.api.ComplianceOptions zzc;
    private final boolean zzd;
    private boolean zze;
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ApiMetadata> CREATOR = com.google.android.gms.common.api.zza.zza();
    private static final com.google.android.gms.common.api.ApiMetadata zzb = newBuilder().build();

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static final class Builder {
        private com.google.android.gms.common.api.ComplianceOptions zza;
        private boolean zzb = false;
        private boolean zzc;

        public com.google.android.gms.common.api.ApiMetadata build() {
            com.google.android.gms.common.api.ApiMetadata apiMetadata = new com.google.android.gms.common.api.ApiMetadata(this.zza, this.zzb);
            apiMetadata.zza(this.zzc);
            return apiMetadata;
        }

        public com.google.android.gms.common.api.ApiMetadata.Builder setCallbackSupportEnabled(boolean z) {
            this.zzb = z;
            return this;
        }

        public com.google.android.gms.common.api.ApiMetadata.Builder setComplianceOptions(com.google.android.gms.common.api.ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }

        final /* synthetic */ com.google.android.gms.common.api.ApiMetadata.Builder zza(boolean z) {
            this.zzc = z;
            return this;
        }
    }

    static {
        com.google.android.gms.common.api.ApiMetadata.Builder newBuilder = newBuilder();
        newBuilder.zza(true);
        zza = newBuilder.build();
    }

    ApiMetadata(com.google.android.gms.common.api.ComplianceOptions complianceOptions, boolean z) {
        this.zzc = complianceOptions;
        this.zzd = z;
    }

    public static final com.google.android.gms.common.api.ApiMetadata fromComplianceOptions(com.google.android.gms.common.api.ComplianceOptions complianceOptions) {
        com.google.android.gms.common.api.ApiMetadata.Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(complianceOptions);
        return newBuilder.build();
    }

    public static final com.google.android.gms.common.api.ApiMetadata getEmptyInstance() {
        return zzb;
    }

    public static com.google.android.gms.common.api.ApiMetadata.Builder newBuilder() {
        return new com.google.android.gms.common.api.ApiMetadata.Builder();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.ApiMetadata)) {
            return false;
        }
        com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzc, apiMetadata.zzc) && this.zze == apiMetadata.zze && this.zzd == apiMetadata.zzd;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzc, java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(this.zzd));
    }

    public com.google.android.gms.common.api.ApiMetadata.Builder toBuilder() {
        com.google.android.gms.common.api.ApiMetadata.Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(this.zzc);
        newBuilder.setCallbackSupportEnabled(this.zzd);
        newBuilder.zza(this.zze);
        return newBuilder;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31);
        sb.append("ApiMetadata(complianceOptions=");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final /* synthetic */ void zza(boolean z) {
        this.zze = z;
    }
}

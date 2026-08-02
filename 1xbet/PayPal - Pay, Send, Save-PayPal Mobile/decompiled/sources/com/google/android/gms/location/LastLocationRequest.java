package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class LastLocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LastLocationRequest> CREATOR = new com.google.android.gms.location.zzaa();
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.identity.ClientIdentity zzd;

    LastLocationRequest(long j, int i, boolean z, com.google.android.gms.internal.identity.ClientIdentity clientIdentity) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = clientIdentity;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LastLocationRequest)) {
            return false;
        }
        com.google.android.gms.location.LastLocationRequest lastLocationRequest = (com.google.android.gms.location.LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && com.google.android.gms.common.internal.Objects.equal(this.zzd, lastLocationRequest.zzd);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sb.append("maxAge=");
            com.google.android.gms.internal.identity.zzeo.zzc(this.zza, sb);
        }
        if (this.zzb != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzq.zzb(this.zzb));
        }
        if (this.zzc) {
            sb.append(", bypass");
        }
        if (this.zzd != null) {
            sb.append(", impersonation=");
            sb.append(this.zzd);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.internal.identity.ClientIdentity zzb() {
        return this.zzd;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zza() {
        return this.zzc;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public static final class Builder {
        private long zza;
        private int zzb;
        private final boolean zzc;
        private final com.google.android.gms.internal.identity.ClientIdentity zzd;

        public Builder(com.google.android.gms.location.LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zza();
            this.zzd = lastLocationRequest.zzb();
        }

        public final com.google.android.gms.location.LastLocationRequest build() {
            return new com.google.android.gms.location.LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public final com.google.android.gms.location.LastLocationRequest.Builder setGranularity(int i) {
            com.google.android.gms.location.zzq.zza(i);
            this.zzb = i;
            return this;
        }

        public final com.google.android.gms.location.LastLocationRequest.Builder setMaxUpdateAgeMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j;
            return this;
        }

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int getGranularity() {
        return this.zzb;
    }
}

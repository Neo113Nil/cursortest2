package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class CurrentLocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.CurrentLocationRequest> CREATOR = new com.google.android.gms.location.zzj();
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final boolean zze;
    private final int zzf;
    private final android.os.WorkSource zzg;
    private final com.google.android.gms.internal.identity.ClientIdentity zzh;

    CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, android.os.WorkSource workSource, com.google.android.gms.internal.identity.ClientIdentity clientIdentity) {
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = z;
        this.zzf = i3;
        this.zzg = workSource;
        this.zzh = clientIdentity;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.CurrentLocationRequest)) {
            return false;
        }
        com.google.android.gms.location.CurrentLocationRequest currentLocationRequest = (com.google.android.gms.location.CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && com.google.android.gms.common.internal.Objects.equal(this.zzg, currentLocationRequest.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, currentLocationRequest.zzh);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(com.google.android.gms.location.zzan.zzb(this.zzc));
        if (this.zza != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            com.google.android.gms.internal.identity.zzeo.zzc(this.zza, sb);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.zzd);
            sb.append("ms");
        }
        if (this.zzb != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzq.zzb(this.zzb));
        }
        if (this.zze) {
            sb.append(", bypass");
        }
        if (this.zzf != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzar.zzb(this.zzf));
        }
        if (!com.google.android.gms.common.util.WorkSourceUtil.isEmpty(this.zzg)) {
            sb.append(", workSource=");
            sb.append(this.zzg);
        }
        if (this.zzh != null) {
            sb.append(", impersonation=");
            sb.append(this.zzh);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getPriority());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.internal.identity.ClientIdentity zzd() {
        return this.zzh;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final android.os.WorkSource zzc() {
        return this.zzg;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int zzb() {
        return this.zzf;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zza() {
        return this.zze;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int getPriority() {
        return this.zzc;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int getGranularity() {
        return this.zzb;
    }

    public static final class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private final boolean zze;
        private final int zzf;
        private final android.os.WorkSource zzg;
        private final com.google.android.gms.internal.identity.ClientIdentity zzh;

        public Builder(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zza();
            this.zzf = currentLocationRequest.zzb();
            this.zzg = new android.os.WorkSource(currentLocationRequest.zzc());
            this.zzh = currentLocationRequest.zzd();
        }

        public final com.google.android.gms.location.CurrentLocationRequest build() {
            return new com.google.android.gms.location.CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, new android.os.WorkSource(this.zzg), this.zzh);
        }

        public final com.google.android.gms.location.CurrentLocationRequest.Builder setDurationMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zzd = j;
            return this;
        }

        public final com.google.android.gms.location.CurrentLocationRequest.Builder setGranularity(int i) {
            com.google.android.gms.location.zzq.zza(i);
            this.zzb = i;
            return this;
        }

        public final com.google.android.gms.location.CurrentLocationRequest.Builder setMaxUpdateAgeMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j;
            return this;
        }

        public final com.google.android.gms.location.CurrentLocationRequest.Builder setPriority(int i) {
            com.google.android.gms.location.zzan.zza(i);
            this.zzc = i;
            return this;
        }

        public Builder() {
            this.zza = 10000L;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = 0;
            this.zzg = null;
            this.zzh = null;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getDurationMillis() {
        return this.zzd;
    }
}

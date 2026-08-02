package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationRequest> CREATOR = new com.google.android.gms.location.zzaf();

    @java.lang.Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @java.lang.Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @java.lang.Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @java.lang.Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final android.os.WorkSource zzm;
    private final com.google.android.gms.internal.identity.ClientIdentity zzn;

    @java.lang.Deprecated
    public LocationRequest() {
        this(102, 3600000L, androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new android.os.WorkSource(), null);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.location.LocationRequest create() {
        return new com.google.android.gms.location.LocationRequest(102, 3600000L, androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new android.os.WorkSource(), null);
    }

    private static java.lang.String zze(long j) {
        return j == Long.MAX_VALUE ? "∞" : com.google.android.gms.internal.identity.zzeo.zzb(j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationRequest)) {
            return false;
        }
        com.google.android.gms.location.LocationRequest locationRequest = (com.google.android.gms.location.LocationRequest) obj;
        if (this.zza != locationRequest.zza) {
            return false;
        }
        if ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched()) {
            return (!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && com.google.android.gms.common.internal.Objects.equal(this.zzn, locationRequest.zzn);
        }
        return false;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final long getExpirationTime() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = this.zze;
        long j2 = elapsedRealtime + j;
        if (((elapsedRealtime ^ j2) & (j ^ j2)) < 0) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final long getMaxWaitTime() {
        return java.lang.Math.max(this.zzd, this.zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        long j = this.zzb;
        long j2 = this.zzc;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), this.zzm);
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setExpirationDuration(long j) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
        this.zze = j;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setExpirationTime(long j) {
        this.zze = java.lang.Math.max(1L, j - android.os.SystemClock.elapsedRealtime());
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setFastestInterval(long j) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "illegal fastest interval: %d", java.lang.Long.valueOf(j));
        this.zzc = j;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setInterval(long j) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.zzc;
        long j3 = this.zzb;
        if (j2 == j3 / 6) {
            this.zzc = j / 6;
        }
        if (this.zzi == j3) {
            this.zzi = j;
        }
        this.zzb = j;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setMaxWaitTime(long j) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "illegal max wait time: %d", java.lang.Long.valueOf(j));
        this.zzd = j;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 20);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setPriority(int i) {
        com.google.android.gms.location.zzan.zza(i);
        this.zza = i;
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(f).length() + 22);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        if (isPassive()) {
            sb.append(com.google.android.gms.location.zzan.zzb(this.zza));
            if (this.zzd > 0) {
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                com.google.android.gms.internal.identity.zzeo.zzc(this.zzd, sb);
            }
        } else {
            sb.append("@");
            if (isBatched()) {
                com.google.android.gms.internal.identity.zzeo.zzc(this.zzb, sb);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                com.google.android.gms.internal.identity.zzeo.zzc(this.zzd, sb);
            } else {
                com.google.android.gms.internal.identity.zzeo.zzc(this.zzb, sb);
            }
            sb.append(" ");
            sb.append(com.google.android.gms.location.zzan.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sb.append(", minUpdateInterval=");
            sb.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sb.append(", duration=");
            com.google.android.gms.internal.identity.zzeo.zzc(this.zze, sb);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.zzf);
        }
        if (this.zzk != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            sb.append(", bypass");
        }
        if (!com.google.android.gms.common.util.WorkSourceUtil.isEmpty(this.zzm)) {
            sb.append(", ");
            sb.append(this.zzm);
        }
        if (this.zzn != null) {
            sb.append(", impersonation=");
            sb.append(this.zzn);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getPriority());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 15, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 16, this.zzm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 17, this.zzn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private boolean zzl;
        private android.os.WorkSource zzm;
        private com.google.android.gms.internal.identity.ClientIdentity zzn;

        public Builder(int i, long j) {
            this(j);
            setPriority(i);
        }

        public final com.google.android.gms.location.LocationRequest build() {
            int i = this.zza;
            long j = this.zzb;
            long j2 = this.zzc;
            if (j2 == -1) {
                j2 = j;
            } else if (i != 105) {
                j2 = java.lang.Math.min(j2, j);
            }
            long max = java.lang.Math.max(this.zzd, this.zzb);
            long j3 = this.zze;
            int i2 = this.zzf;
            float f = this.zzg;
            boolean z = this.zzh;
            long j4 = this.zzi;
            return new com.google.android.gms.location.LocationRequest(i, j, j2, max, Long.MAX_VALUE, j3, i2, f, z, j4 == -1 ? this.zzb : j4, this.zzj, this.zzk, this.zzl, new android.os.WorkSource(this.zzm), this.zzn);
        }

        public final com.google.android.gms.location.LocationRequest.Builder setDurationMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zze = j;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setGranularity(int i) {
            com.google.android.gms.location.zzq.zza(i);
            this.zzj = i;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setIntervalMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setMaxUpdateAgeMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setMaxUpdateDelayMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setMaxUpdates(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.zzf = i;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setMinUpdateDistanceMeters(float f) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setMinUpdateIntervalMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setPriority(int i) {
            com.google.android.gms.location.zzan.zza(i);
            this.zza = i;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder zza(int i) {
            com.google.android.gms.location.zzar.zza(i);
            this.zzk = i;
            return this;
        }

        public Builder(long j) {
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j);
        }

        public Builder(com.google.android.gms.location.LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int zza = locationRequest.zza();
            com.google.android.gms.location.zzar.zza(zza);
            this.zzk = zza;
            this.zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            com.google.android.gms.internal.identity.ClientIdentity zzd = locationRequest.zzd();
            boolean z = true;
            if (zzd != null && zzd.zza()) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z);
            this.zzn = zzd;
        }

        public final com.google.android.gms.location.LocationRequest.Builder zzc(android.os.WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder zzb(boolean z) {
            this.zzl = z;
            return this;
        }

        public final com.google.android.gms.location.LocationRequest.Builder setWaitForAccurateLocation(boolean z) {
            this.zzh = z;
            return this;
        }
    }

    LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, android.os.WorkSource workSource, com.google.android.gms.internal.identity.ClientIdentity clientIdentity) {
        long j7;
        this.zza = i;
        if (i == 105) {
            this.zzb = Long.MAX_VALUE;
            j7 = j;
        } else {
            j7 = j;
            this.zzb = j7;
        }
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 != Long.MAX_VALUE ? java.lang.Math.min(java.lang.Math.max(1L, j4 - android.os.SystemClock.elapsedRealtime()), j5) : j5;
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j7;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = z2;
        this.zzm = workSource;
        this.zzn = clientIdentity;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.internal.identity.ClientIdentity zzd() {
        return this.zzn;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final android.os.WorkSource zzc() {
        return this.zzm;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zzb() {
        return this.zzl;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int zza() {
        return this.zzk;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.location.LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzh = z;
        return this;
    }

    public final boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean isPassive() {
        return this.zza == 105;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int getPriority() {
        return this.zza;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final int getNumUpdates() {
        return getMaxUpdates();
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int getMaxUpdates() {
        return this.zzf;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getIntervalMillis() {
        return this.zzb;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final long getInterval() {
        return getIntervalMillis();
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int getGranularity() {
        return this.zzj;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public final long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    @org.checkerframework.dataflow.qual.Pure
    public final long getDurationMillis() {
        return this.zze;
    }
}

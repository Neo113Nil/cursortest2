package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class LocationAvailability extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    final int zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;
    private final com.google.android.gms.location.zzal[] zzg;
    public static final com.google.android.gms.location.LocationAvailability zza = new com.google.android.gms.location.LocationAvailability(0, 1, 1, 0, null, true);
    public static final com.google.android.gms.location.LocationAvailability zzb = new com.google.android.gms.location.LocationAvailability(1000, 1, 1, 0, null, false);
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationAvailability> CREATOR = new com.google.android.gms.location.zzab();

    LocationAvailability(int i, int i2, int i3, long j, com.google.android.gms.location.zzal[] zzalVarArr, boolean z) {
        this.zzc = i < 1000 ? 0 : 1000;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = j;
        this.zzg = zzalVarArr;
    }

    public static com.google.android.gms.location.LocationAvailability extractLocationAvailability(android.content.Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (com.google.android.gms.location.LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean hasLocationAvailability(android.content.Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationAvailability)) {
            return false;
        }
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) obj;
        return this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && java.util.Arrays.equals(this.zzg, locationAvailability.zzg);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(isLocationAvailable).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(isLocationAvailable);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzd;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isLocationAvailable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean isLocationAvailable() {
        return this.zzc < 1000;
    }
}

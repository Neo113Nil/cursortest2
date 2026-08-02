package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class LocationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private final java.util.List zzb;
    static final java.util.List zza = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationResult> CREATOR = new com.google.android.gms.location.zzag();

    LocationResult(java.util.List list) {
        this.zzb = list;
    }

    public static com.google.android.gms.location.LocationResult create(java.util.List<android.location.Location> list) {
        if (list == null) {
            list = zza;
        }
        return new com.google.android.gms.location.LocationResult(list);
    }

    public static com.google.android.gms.location.LocationResult extractResult(android.content.Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (com.google.android.gms.location.LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationResult)) {
            return false;
        }
        com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) obj;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return this.zzb.equals(locationResult.zzb);
        }
        if (this.zzb.size() != locationResult.zzb.size()) {
            return false;
        }
        java.util.Iterator it = locationResult.zzb.iterator();
        for (android.location.Location location : this.zzb) {
            android.location.Location location2 = (android.location.Location) it.next();
            if (java.lang.Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || java.lang.Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !com.google.android.gms.common.internal.Objects.equal(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final android.location.Location getLastLocation() {
        int size = this.zzb.size();
        if (size == 0) {
            return null;
        }
        return (android.location.Location) this.zzb.get(size - 1);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationResult");
        int i = com.google.android.gms.location.zzak.zza;
        java.util.List list = this.zzb;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        java.util.Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.google.android.gms.location.zzak.zza((android.location.Location) it.next(), sb);
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getLocations(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.util.List<android.location.Location> getLocations() {
        return this.zzb;
    }
}

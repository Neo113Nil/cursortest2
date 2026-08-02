package com.google.android.gms.internal.identity;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zzeg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzeg> CREATOR = new com.google.android.gms.internal.identity.zzeh();
    com.google.android.gms.location.LocationRequest zza;

    zzeg(com.google.android.gms.location.LocationRequest locationRequest, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str, long j) {
        android.os.WorkSource workSource;
        com.google.android.gms.location.LocationRequest.Builder builder = new com.google.android.gms.location.LocationRequest.Builder(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new android.os.WorkSource();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.common.internal.ClientIdentity clientIdentity = (com.google.android.gms.common.internal.ClientIdentity) it.next();
                    com.google.android.gms.common.util.WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
            }
            builder.zzc(workSource);
        }
        if (z) {
            builder.setGranularity(1);
        }
        if (z2) {
            builder.zza(2);
        }
        if (z3) {
            builder.zzb(true);
        }
        if (z4) {
            builder.setWaitForAccurateLocation(true);
        }
        if (j != Long.MAX_VALUE) {
            builder.setMaxUpdateAgeMillis(j);
        }
        this.zza = builder.build();
    }

    @java.lang.Deprecated
    public static com.google.android.gms.internal.identity.zzeg zza(java.lang.String str, com.google.android.gms.location.LocationRequest locationRequest) {
        return new com.google.android.gms.internal.identity.zzeg(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.identity.zzeg) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.internal.identity.zzeg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

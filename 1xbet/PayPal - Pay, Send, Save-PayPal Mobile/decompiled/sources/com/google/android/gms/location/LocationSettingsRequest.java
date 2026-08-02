package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class LocationSettingsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsRequest> CREATOR = new com.google.android.gms.location.zzah();
    private final java.util.List zza;
    private final boolean zzb;
    private final boolean zzc;

    LocationSettingsRequest(java.util.List list, boolean z, boolean z2) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, java.util.Collections.unmodifiableList(list), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private final java.util.ArrayList zza = new java.util.ArrayList();
        private boolean zzb = false;
        private boolean zzc = false;

        public final com.google.android.gms.location.LocationSettingsRequest.Builder addAllLocationRequests(java.util.Collection<com.google.android.gms.location.LocationRequest> collection) {
            for (com.google.android.gms.location.LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zza.add(locationRequest);
                }
            }
            return this;
        }

        public final com.google.android.gms.location.LocationSettingsRequest.Builder addLocationRequest(com.google.android.gms.location.LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        public final com.google.android.gms.location.LocationSettingsRequest build() {
            return new com.google.android.gms.location.LocationSettingsRequest(this.zza, this.zzb, this.zzc);
        }

        public final com.google.android.gms.location.LocationSettingsRequest.Builder setNeedBle(boolean z) {
            this.zzc = z;
            return this;
        }

        public final com.google.android.gms.location.LocationSettingsRequest.Builder setAlwaysShow(boolean z) {
            this.zzb = z;
            return this;
        }
    }
}

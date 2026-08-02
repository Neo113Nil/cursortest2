package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class GeofencingRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.GeofencingRequest> CREATOR = new com.google.android.gms.location.zzp();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final java.util.List zza;
    private final int zzb;
    private final java.lang.String zzc;

    /* loaded from: classes3.dex */
    public @interface InitialTrigger {
    }

    GeofencingRequest(java.util.List list, int i, java.lang.String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
    }

    public java.util.List<com.google.android.gms.location.Geofence> getGeofences() {
        return new java.util.ArrayList(this.zza);
    }

    public java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        int length = java.lang.String.valueOf(valueOf).length();
        int i = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 45 + java.lang.String.valueOf(i).length() + 1);
        sb.append("GeofencingRequest[geofences=");
        sb.append(valueOf);
        sb.append(", initialTrigger=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private final java.util.List zza = new java.util.ArrayList();
        private int zzb = 5;

        public final com.google.android.gms.location.GeofencingRequest.Builder addGeofence(com.google.android.gms.location.Geofence geofence) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.identity.zzek, "Geofence must be created using Geofence.Builder.");
            this.zza.add((com.google.android.gms.internal.identity.zzek) geofence);
            return this;
        }

        public final com.google.android.gms.location.GeofencingRequest.Builder addGeofences(java.util.List<? extends com.google.android.gms.location.Geofence> list) {
            java.util.Iterator<? extends com.google.android.gms.location.Geofence> it = list.iterator();
            while (it.hasNext()) {
                addGeofence(it.next());
            }
            return this;
        }

        public final com.google.android.gms.location.GeofencingRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new com.google.android.gms.location.GeofencingRequest(new java.util.ArrayList(this.zza), this.zzb, null);
        }

        public final com.google.android.gms.location.GeofencingRequest.Builder setInitialTrigger(int i) {
            this.zzb = i & 7;
            return this;
        }
    }

    public int getInitialTrigger() {
        return this.zzb;
    }
}

package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class StreetViewSource extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewSource> CREATOR = new com.google.android.gms.maps.model.zzab();
    public static final com.google.android.gms.maps.model.StreetViewSource DEFAULT = new com.google.android.gms.maps.model.StreetViewSource(0);
    public static final com.google.android.gms.maps.model.StreetViewSource OUTDOOR = new com.google.android.gms.maps.model.StreetViewSource(1);
    private final int zza;

    public StreetViewSource(int i) {
        this.zza = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.maps.model.StreetViewSource) && this.zza == ((com.google.android.gms.maps.model.StreetViewSource) obj).zza;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza));
    }

    public final java.lang.String toString() {
        int i = this.zza;
        return java.lang.String.format("StreetViewSource:%s", i != 0 ? i != 1 ? java.lang.String.format("UNKNOWN(%s)", java.lang.Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

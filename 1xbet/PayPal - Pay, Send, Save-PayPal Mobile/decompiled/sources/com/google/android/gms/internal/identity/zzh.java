package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    final com.google.android.gms.location.DeviceOrientationRequest zzc;
    final java.util.List zzd;
    final java.lang.String zze;
    static final java.util.List zza = java.util.Collections.emptyList();
    static final com.google.android.gms.location.DeviceOrientationRequest zzb = new com.google.android.gms.location.DeviceOrientationRequest.Builder(com.google.android.gms.location.DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).build();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzh> CREATOR = new com.google.android.gms.internal.identity.zzi();

    zzh(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, java.util.List list, java.lang.String str) {
        this.zzc = deviceOrientationRequest;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.identity.zzh)) {
            return false;
        }
        com.google.android.gms.internal.identity.zzh zzhVar = (com.google.android.gms.internal.identity.zzh) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzc, zzhVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzhVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzhVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzd);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        java.lang.String str = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 68 + length2 + 7 + java.lang.String.valueOf(str).length() + 2);
        sb.append("DeviceOrientationRequestInternal[deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("']");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.safetynet.zzf> CREATOR = new com.google.android.gms.safetynet.zzg();
    private final java.lang.String zza;

    public zzf(java.lang.String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}

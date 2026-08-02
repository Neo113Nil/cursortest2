package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public final class zzd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.safetynet.zzd> CREATOR = new com.google.android.gms.safetynet.zze();
    public final long zza;
    public final com.google.android.gms.safetynet.HarmfulAppsData[] zzb;
    public final int zzc;
    public final boolean zzd;

    public zzd(long j, com.google.android.gms.safetynet.HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.zza = j;
        this.zzb = harmfulAppsDataArr;
        this.zzd = z;
        if (z) {
            this.zzc = i;
        } else {
            this.zzc = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

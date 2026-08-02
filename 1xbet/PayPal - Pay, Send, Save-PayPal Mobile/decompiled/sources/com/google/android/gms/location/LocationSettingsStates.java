package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class LocationSettingsStates extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsStates> CREATOR = new com.google.android.gms.location.zzaj();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }

    public static com.google.android.gms.location.LocationSettingsStates fromIntent(android.content.Intent intent) {
        return (com.google.android.gms.location.LocationSettingsStates) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    public final boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public final boolean isLocationUsable() {
        return this.zza || this.zzb;
    }

    public final boolean isLocationPresent() {
        return this.zzd || this.zze;
    }

    public final boolean isGpsUsable() {
        return this.zza;
    }

    public final boolean isGpsPresent() {
        return this.zzd;
    }

    public final boolean isBleUsable() {
        return this.zzc;
    }

    public final boolean isBlePresent() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzem> CREATOR = new com.google.android.gms.internal.identity.zzen();
    private final java.util.List zza;
    private final android.app.PendingIntent zzb;
    private final java.lang.String zzc;

    zzem(java.util.List list, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zza = list == null ? com.google.android.gms.internal.identity.zzex.zzi() : com.google.android.gms.internal.identity.zzex.zzj(list);
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static com.google.android.gms.internal.identity.zzem zza(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "geofence can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new com.google.android.gms.internal.identity.zzem(list, null, "");
    }

    public static com.google.android.gms.internal.identity.zzem zzb(android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new com.google.android.gms.internal.identity.zzem(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

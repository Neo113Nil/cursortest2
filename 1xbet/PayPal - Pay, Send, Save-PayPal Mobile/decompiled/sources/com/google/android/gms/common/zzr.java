package com.google.android.gms.common;

/* loaded from: classes8.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzr> CREATOR = new com.google.android.gms.common.zzs();
    private final boolean zza;

    @javax.annotation.Nullable
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    zzr(boolean z, java.lang.String str, int i, int i2, long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = com.google.android.gms.common.zzz.zza(i) - 1;
        this.zzd = com.google.android.gms.common.zzc.zza(i2) - 1;
        this.zze = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zzd() {
        return com.google.android.gms.common.zzz.zza(this.zzc);
    }

    public final int zze() {
        return com.google.android.gms.common.zzc.zza(this.zzd);
    }

    public final long zzc() {
        return this.zze;
    }

    @javax.annotation.Nullable
    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final boolean zza() {
        return this.zza;
    }
}

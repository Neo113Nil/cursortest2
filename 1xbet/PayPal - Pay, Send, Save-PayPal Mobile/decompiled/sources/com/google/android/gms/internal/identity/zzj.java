package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzj> CREATOR = new com.google.android.gms.internal.identity.zzk();
    final int zza;
    final com.google.android.gms.internal.identity.zzh zzb;
    final com.google.android.gms.location.zzt zzc;
    final com.google.android.gms.internal.identity.zzr zzd;

    zzj(int i, com.google.android.gms.internal.identity.zzh zzhVar, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zza = i;
        this.zzb = zzhVar;
        com.google.android.gms.internal.identity.zzr zzrVar = null;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzs.zzb(iBinder);
        if (iBinder2 != null) {
            android.os.IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar = queryLocalInterface instanceof com.google.android.gms.internal.identity.zzr ? (com.google.android.gms.internal.identity.zzr) queryLocalInterface : new com.google.android.gms.internal.identity.zzp(iBinder2);
        }
        this.zzd = zzrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzt zztVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zztVar == null ? null : zztVar.asBinder(), false);
        com.google.android.gms.internal.identity.zzr zzrVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzrVar != null ? zzrVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.identity;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zzei extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzei> CREATOR = new com.google.android.gms.internal.identity.zzej();
    private final int zza;
    private final com.google.android.gms.internal.identity.zzeg zzb;
    private final com.google.android.gms.location.zzz zzc;
    private final com.google.android.gms.location.zzw zzd;
    private final android.app.PendingIntent zze;
    private final com.google.android.gms.internal.identity.zzr zzf;
    private final java.lang.String zzg;

    zzei(int i, com.google.android.gms.internal.identity.zzeg zzegVar, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder3, java.lang.String str) {
        this.zza = i;
        this.zzb = zzegVar;
        com.google.android.gms.internal.identity.zzr zzrVar = null;
        this.zzc = iBinder != null ? com.google.android.gms.location.zzy.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? com.google.android.gms.location.zzv.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            android.os.IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar = queryLocalInterface instanceof com.google.android.gms.internal.identity.zzr ? (com.google.android.gms.internal.identity.zzr) queryLocalInterface : new com.google.android.gms.internal.identity.zzp(iBinder3);
        }
        this.zzf = zzrVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzz zzzVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzzVar == null ? null : zzzVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zze, i, false);
        com.google.android.gms.location.zzw zzwVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzwVar == null ? null : zzwVar.asBinder(), false);
        com.google.android.gms.internal.identity.zzr zzrVar = this.zzf;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 6, zzrVar != null ? zzrVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

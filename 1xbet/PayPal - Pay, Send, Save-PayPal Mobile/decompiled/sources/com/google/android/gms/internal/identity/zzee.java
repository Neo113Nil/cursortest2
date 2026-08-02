package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzee extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzee> CREATOR = new com.google.android.gms.internal.identity.zzef();
    private final int zza;
    private final android.os.IBinder zzb;
    private final android.os.IBinder zzc;
    private final android.app.PendingIntent zzd;
    private final java.lang.String zze;

    zzee(int i, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zza = i;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.zzz] */
    public static com.google.android.gms.internal.identity.zzee zza(android.os.IInterface iInterface, com.google.android.gms.location.zzz zzzVar, java.lang.String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new com.google.android.gms.internal.identity.zzee(1, iInterface, zzzVar, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.zzw] */
    public static com.google.android.gms.internal.identity.zzee zzb(android.os.IInterface iInterface, com.google.android.gms.location.zzw zzwVar, java.lang.String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new com.google.android.gms.internal.identity.zzee(2, iInterface, zzwVar, null, str);
    }

    public static com.google.android.gms.internal.identity.zzee zzc(android.app.PendingIntent pendingIntent) {
        return new com.google.android.gms.internal.identity.zzee(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.internal.identity.zzee zzd(com.google.android.gms.internal.identity.zzz zzzVar) {
        return new com.google.android.gms.internal.identity.zzee(4, null, zzzVar, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

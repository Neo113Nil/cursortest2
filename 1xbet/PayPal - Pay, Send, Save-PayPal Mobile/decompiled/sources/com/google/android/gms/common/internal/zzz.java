package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            onPostInitComplete(readInt, readStrongBinder, bundle);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            zzb(readInt2, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.zzj zzjVar = (com.google.android.gms.common.internal.zzj) com.google.android.gms.internal.common.zzc.zzb(parcel, com.google.android.gms.common.internal.zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            zzc(readInt3, readStrongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

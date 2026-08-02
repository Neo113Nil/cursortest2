package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzu extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzv {
    public zzu() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(readInt);
        parcel2.writeNoException();
        return true;
    }
}

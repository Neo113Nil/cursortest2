package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzq extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzr {
    public zzq() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}

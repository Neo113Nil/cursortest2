package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzba extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbb {
    public zzba() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(asInterface);
        parcel2.writeNoException();
        return true;
    }
}

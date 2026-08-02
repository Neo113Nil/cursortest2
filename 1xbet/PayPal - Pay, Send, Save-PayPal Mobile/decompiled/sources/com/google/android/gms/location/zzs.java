package com.google.android.gms.location;

/* loaded from: classes8.dex */
public abstract class zzs extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.location.zzt {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static com.google.android.gms.location.zzt zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof com.google.android.gms.location.zzt ? (com.google.android.gms.location.zzt) queryLocalInterface : new com.google.android.gms.location.zzr(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.location.DeviceOrientation deviceOrientation = (com.google.android.gms.location.DeviceOrientation) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.location.DeviceOrientation.CREATOR);
        com.google.android.gms.internal.identity.zzc.zzd(parcel);
        zzd(deviceOrientation);
        return true;
    }
}

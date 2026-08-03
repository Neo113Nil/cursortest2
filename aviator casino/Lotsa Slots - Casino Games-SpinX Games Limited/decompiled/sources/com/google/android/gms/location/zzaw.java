package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
public class zzaw extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzax {
    public static com.google.android.gms.location.zzax zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof com.google.android.gms.location.zzax ? (com.google.android.gms.location.zzax) queryLocalInterface : new com.google.android.gms.location.zzav(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        throw null;
    }
}

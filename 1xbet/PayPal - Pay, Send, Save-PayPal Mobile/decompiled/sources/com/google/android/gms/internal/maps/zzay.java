package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzay extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzaz {
    public zzay() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static com.google.android.gms.internal.maps.zzaz zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzaz ? (com.google.android.gms.internal.maps.zzaz) queryLocalInterface : new com.google.android.gms.internal.maps.zzax(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        com.google.android.gms.maps.model.Tile zzb = zzb(readInt, readInt2, readInt3);
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzf(parcel2, zzb);
        return true;
    }
}

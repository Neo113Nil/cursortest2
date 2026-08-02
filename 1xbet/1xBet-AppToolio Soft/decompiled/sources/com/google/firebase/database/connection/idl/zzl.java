package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzl extends com.google.android.gms.internal.firebase_database.zzb implements zzk {
    public zzl() {
        super("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzn zzpVar;
        if (i != 1) {
            return false;
        }
        boolean zza = com.google.android.gms.internal.firebase_database.zzc.zza(parcel);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IGetTokenCallback");
            zzpVar = queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzp(readStrongBinder);
        }
        zza(zza, zzpVar);
        parcel2.writeNoException();
        return true;
    }
}

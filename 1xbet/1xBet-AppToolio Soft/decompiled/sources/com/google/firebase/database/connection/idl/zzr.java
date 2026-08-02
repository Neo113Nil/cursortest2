package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzr extends com.google.android.gms.internal.firebase_database.zzb implements zzq {
    public zzr() {
        super("com.google.firebase.database.connection.idl.IListenHashProvider");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zzx = zzx();
                parcel2.writeNoException();
                parcel2.writeString(zzx);
                return true;
            case 2:
                boolean zzy = zzy();
                parcel2.writeNoException();
                com.google.android.gms.internal.firebase_database.zzc.writeBoolean(parcel2, zzy);
                return true;
            case 3:
                zza zzaw = zzaw();
                parcel2.writeNoException();
                com.google.android.gms.internal.firebase_database.zzc.zzb(parcel2, zzaw);
                return true;
            default:
                return false;
        }
    }
}

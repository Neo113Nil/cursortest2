package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzai extends com.google.android.gms.internal.firebase_database.zzb implements zzah {
    public zzai() {
        super("com.google.firebase.database.connection.idl.IRequestResultCallback");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}

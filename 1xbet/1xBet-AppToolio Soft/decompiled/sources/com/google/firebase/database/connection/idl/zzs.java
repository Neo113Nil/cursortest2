package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzs extends com.google.android.gms.internal.firebase_database.zza implements zzq {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IListenHashProvider");
    }

    @Override // com.google.firebase.database.connection.idl.zzq
    public final zza zzaw() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        zza zzaVar = (zza) com.google.android.gms.internal.firebase_database.zzc.zza(transactAndReadException, zza.CREATOR);
        transactAndReadException.recycle();
        return zzaVar;
    }

    @Override // com.google.firebase.database.connection.idl.zzq
    public final String zzx() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.firebase.database.connection.idl.zzq
    public final boolean zzy() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        boolean zza = com.google.android.gms.internal.firebase_database.zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }
}

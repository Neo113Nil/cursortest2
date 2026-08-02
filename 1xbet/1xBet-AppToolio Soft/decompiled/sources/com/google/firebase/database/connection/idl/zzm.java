package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzm extends com.google.android.gms.internal.firebase_database.zza implements zzk {
    zzm(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
    }

    @Override // com.google.firebase.database.connection.idl.zzk
    public final void zza(boolean z, zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_database.zzc.writeBoolean(obtainAndWriteInterfaceToken, z);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zznVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}

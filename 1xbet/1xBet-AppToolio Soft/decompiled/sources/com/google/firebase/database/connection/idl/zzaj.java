package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzaj extends com.google.android.gms.internal.firebase_database.zza implements zzah {
    zzaj(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IRequestResultCallback");
    }

    @Override // com.google.firebase.database.connection.idl.zzah
    public final void zzb(String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}

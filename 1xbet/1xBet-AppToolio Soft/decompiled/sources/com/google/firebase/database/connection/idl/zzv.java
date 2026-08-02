package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.firebase_database.zza implements zzt {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IPersistentConnection");
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void compareAndPut(List<String> list, IObjectWrapper iObjectWrapper, String str, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void initialize() throws RemoteException {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void interrupt(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final boolean isInterrupted(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
        boolean zza = com.google.android.gms.internal.firebase_database.zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void listen(List<String> list, IObjectWrapper iObjectWrapper, zzq zzqVar, long j, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzqVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void merge(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void onDisconnectCancel(List<String> list, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void onDisconnectMerge(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void onDisconnectPut(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void purgeOutstandingWrites() throws RemoteException {
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void put(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void refreshAuthToken() throws RemoteException {
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void refreshAuthToken2(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void resume(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void setup(zzc zzcVar, zzk zzkVar, IObjectWrapper iObjectWrapper, zzw zzwVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzcVar);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzkVar);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, zzwVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void shutdown() throws RemoteException {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public final void unlisten(List<String> list, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringList(list);
        com.google.android.gms.internal.firebase_database.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }
}

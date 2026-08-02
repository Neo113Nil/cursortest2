package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
public final class zzg extends com.google.android.gms.internal.auth_blockstore.zza implements android.os.IInterface {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void zza(com.google.android.gms.internal.auth_blockstore.zzi zziVar, com.google.android.gms.auth.blockstore.DeleteBytesRequest deleteBytesRequest) throws android.os.RemoteException {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, zziVar);
        com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, deleteBytesRequest);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    public final void zzb(com.google.android.gms.internal.auth_blockstore.zzk zzkVar) throws android.os.RemoteException {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, zzkVar);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    public final void zzc(com.google.android.gms.internal.auth_blockstore.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, zzmVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zzd(com.google.android.gms.internal.auth_blockstore.zzm zzmVar, com.google.android.gms.auth.blockstore.RetrieveBytesRequest retrieveBytesRequest) throws android.os.RemoteException {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, zzmVar);
        com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, retrieveBytesRequest);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    public final void zze(com.google.android.gms.internal.auth_blockstore.zzo zzoVar, com.google.android.gms.auth.blockstore.StoreBytesData storeBytesData) throws android.os.RemoteException {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, zzoVar);
        com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, storeBytesData);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }
}

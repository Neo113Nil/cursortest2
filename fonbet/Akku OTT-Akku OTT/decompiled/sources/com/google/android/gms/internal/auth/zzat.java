package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.a;
import com.google.android.gms.auth.api.accounttransfer.b;
import com.google.android.gms.auth.api.accounttransfer.i;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public interface zzat extends IInterface {
    void zzb(byte[] bArr) throws RemoteException;

    void zzc(a aVar) throws RemoteException;

    void zzd(Status status) throws RemoteException;

    void zze() throws RemoteException;

    void zzf(Status status, i iVar) throws RemoteException;

    void zzg(Status status, b bVar) throws RemoteException;

    void zzh(Status status) throws RemoteException;
}

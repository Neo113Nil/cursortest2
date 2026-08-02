package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* loaded from: classes4.dex */
public interface d extends IInterface {

    public static abstract class a extends zzb implements d {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.google.android.gms.auth.blockstore.restorecredential.internal.d$a$a, reason: collision with other inner class name */
        public static class C0109a extends zza implements d {
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.d
            public final void k(@NonNull com.google.android.gms.auth.blockstore.restorecredential.g gVar, @NonNull k kVar) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, gVar);
                zzc.zzc(obtainAndWriteInterfaceToken, kVar);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.d
            public final void l(@NonNull com.google.android.gms.auth.blockstore.restorecredential.a aVar, @NonNull i iVar) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, aVar);
                zzc.zzc(obtainAndWriteInterfaceToken, iVar);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.d
            public final void u(@NonNull com.google.android.gms.auth.blockstore.restorecredential.c cVar, @NonNull j jVar) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, cVar);
                zzc.zzc(obtainAndWriteInterfaceToken, jVar);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }
    }

    void k(@NonNull com.google.android.gms.auth.blockstore.restorecredential.g gVar, @NonNull k kVar) throws RemoteException;

    void l(@NonNull com.google.android.gms.auth.blockstore.restorecredential.a aVar, @NonNull i iVar) throws RemoteException;

    void u(@NonNull com.google.android.gms.auth.blockstore.restorecredential.c cVar, @NonNull j jVar) throws RemoteException;
}

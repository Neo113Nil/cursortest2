package com.google.firebase.auth.api.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
public final class zzcj extends com.google.android.gms.internal.firebase_auth.zza implements zzch {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void onFailure(Status status) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, status);
        transactOneway(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, phoneAuthCredential);
        transactOneway(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, status);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, phoneAuthCredential);
        transactOneway(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(com.google.android.gms.internal.firebase_auth.zzao zzaoVar, com.google.android.gms.internal.firebase_auth.zzaj zzajVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzaoVar);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzajVar);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(com.google.android.gms.internal.firebase_auth.zzav zzavVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzavVar);
        transactOneway(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zza(com.google.android.gms.internal.firebase_auth.zzx zzxVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzxVar);
        transactOneway(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzac() throws RemoteException {
        transactOneway(6, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzad() throws RemoteException {
        transactOneway(7, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzae() throws RemoteException {
        transactOneway(13, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzb(com.google.android.gms.internal.firebase_auth.zzao zzaoVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzaoVar);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzd(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactOneway(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zze(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactOneway(9, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzch
    public final void zzf(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactOneway(11, obtainAndWriteInterfaceToken);
    }
}

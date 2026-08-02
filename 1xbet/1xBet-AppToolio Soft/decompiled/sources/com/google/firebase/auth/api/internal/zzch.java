package com.google.firebase.auth.api.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
public interface zzch extends IInterface {
    void onFailure(Status status) throws RemoteException;

    void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) throws RemoteException;

    void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException;

    void zza(com.google.android.gms.internal.firebase_auth.zzao zzaoVar, com.google.android.gms.internal.firebase_auth.zzaj zzajVar) throws RemoteException;

    void zza(com.google.android.gms.internal.firebase_auth.zzav zzavVar) throws RemoteException;

    void zza(com.google.android.gms.internal.firebase_auth.zzx zzxVar) throws RemoteException;

    void zzac() throws RemoteException;

    void zzad() throws RemoteException;

    void zzae() throws RemoteException;

    void zzb(com.google.android.gms.internal.firebase_auth.zzao zzaoVar) throws RemoteException;

    void zzd(String str) throws RemoteException;

    void zze(String str) throws RemoteException;

    void zzf(String str) throws RemoteException;
}

package com.google.firebase.auth.api.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;

/* loaded from: classes.dex */
public interface zzck extends IInterface {
    void zza(com.google.android.gms.internal.firebase_auth.zzax zzaxVar, zzch zzchVar) throws RemoteException;

    void zza(com.google.android.gms.internal.firebase_auth.zzbf zzbfVar, zzch zzchVar) throws RemoteException;

    void zza(EmailAuthCredential emailAuthCredential, zzch zzchVar) throws RemoteException;

    void zza(PhoneAuthCredential phoneAuthCredential, zzch zzchVar) throws RemoteException;

    void zza(zzch zzchVar) throws RemoteException;

    void zza(String str, com.google.android.gms.internal.firebase_auth.zzbf zzbfVar, zzch zzchVar) throws RemoteException;

    @Deprecated
    void zza(String str, ActionCodeSettings actionCodeSettings, zzch zzchVar) throws RemoteException;

    void zza(String str, PhoneAuthCredential phoneAuthCredential, zzch zzchVar) throws RemoteException;

    void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzch zzchVar) throws RemoteException;

    void zza(String str, zzch zzchVar) throws RemoteException;

    void zza(String str, String str2, zzch zzchVar) throws RemoteException;

    void zza(String str, String str2, String str3, zzch zzchVar) throws RemoteException;

    void zzb(String str, ActionCodeSettings actionCodeSettings, zzch zzchVar) throws RemoteException;

    void zzb(String str, zzch zzchVar) throws RemoteException;

    void zzb(String str, String str2, zzch zzchVar) throws RemoteException;

    void zzc(String str, ActionCodeSettings actionCodeSettings, zzch zzchVar) throws RemoteException;

    void zzc(String str, zzch zzchVar) throws RemoteException;

    void zzc(String str, String str2, zzch zzchVar) throws RemoteException;

    void zzd(String str, zzch zzchVar) throws RemoteException;

    void zzd(String str, String str2, zzch zzchVar) throws RemoteException;

    void zze(String str, zzch zzchVar) throws RemoteException;

    void zze(String str, String str2, zzch zzchVar) throws RemoteException;

    void zzf(String str, zzch zzchVar) throws RemoteException;

    void zzf(String str, String str2, zzch zzchVar) throws RemoteException;

    void zzg(String str, zzch zzchVar) throws RemoteException;

    void zzh(String str, zzch zzchVar) throws RemoteException;

    void zzi(String str, zzch zzchVar) throws RemoteException;

    void zzj(String str, zzch zzchVar) throws RemoteException;

    void zzk(String str, zzch zzchVar) throws RemoteException;
}

package com.google.firebase.auth.api.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;

/* loaded from: classes.dex */
public final class zzcm extends com.google.android.gms.internal.firebase_auth.zza implements zzck {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(com.google.android.gms.internal.firebase_auth.zzax zzaxVar, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzaxVar);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(com.google.android.gms.internal.firebase_auth.zzbf zzbfVar, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzbfVar);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(EmailAuthCredential emailAuthCredential, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, emailAuthCredential);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(PhoneAuthCredential phoneAuthCredential, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, phoneAuthCredential);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, com.google.android.gms.internal.firebase_auth.zzbf zzbfVar, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzbfVar);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, ActionCodeSettings actionCodeSettings, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, actionCodeSettings);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, PhoneAuthCredential phoneAuthCredential, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, phoneAuthCredential);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, userProfileChangeRequest);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, String str2, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zza(String str, String str2, String str3, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzb(String str, ActionCodeSettings actionCodeSettings, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, actionCodeSettings);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzb(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzb(String str, String str2, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzc(String str, ActionCodeSettings actionCodeSettings, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, actionCodeSettings);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzc(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzc(String str, String str2, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzd(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzd(String str, String str2, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zze(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zze(String str, String str2, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzf(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzf(String str, String str2, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzg(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzh(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzi(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzj(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.firebase.auth.api.internal.zzck
    public final void zzk(String str, zzch zzchVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.firebase_auth.zzc.zza(obtainAndWriteInterfaceToken, zzchVar);
        transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
    }
}

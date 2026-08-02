package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
public final class zzu extends com.google.android.gms.internal.p000authapi.zzd implements zzv {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zzc(zzt zztVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, zztVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, googleSignInOptions);
        zzc(101, zzc);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zzd(zzt zztVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, zztVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, googleSignInOptions);
        zzc(102, zzc);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zze(zzt zztVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, zztVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, googleSignInOptions);
        zzc(103, zzc);
    }
}

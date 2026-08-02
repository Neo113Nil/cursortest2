package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzac extends zzd implements zzad {
    zzac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzad
    public final void zzc(zzab zzabVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzabVar);
        zzf.zzc(zzc, beginSignInRequest);
        zzc(1, zzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzad
    public final void zzc(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, iStatusCallback);
        zzc.writeString(str);
        zzc(2, zzc);
    }
}

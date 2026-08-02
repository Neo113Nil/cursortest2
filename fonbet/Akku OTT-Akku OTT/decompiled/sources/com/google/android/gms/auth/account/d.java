package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: classes4.dex */
public final class d extends zza implements f {
    @Override // com.google.android.gms.auth.account.f
    public final void A(c cVar, Account account) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, cVar);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.auth.account.f
    public final void j(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.auth.account.f
    public final void z(c cVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, cVar);
        zza.writeString(str);
        zzc(2, zza);
    }
}

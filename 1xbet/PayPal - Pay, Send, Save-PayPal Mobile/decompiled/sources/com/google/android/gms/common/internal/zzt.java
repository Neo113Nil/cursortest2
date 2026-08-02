package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class zzt extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {
    zzt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(2, zza());
        android.accounts.Account account = (android.accounts.Account) com.google.android.gms.internal.common.zzc.zzb(zzB, android.accounts.Account.CREATOR);
        zzB.recycle();
        return account;
    }
}

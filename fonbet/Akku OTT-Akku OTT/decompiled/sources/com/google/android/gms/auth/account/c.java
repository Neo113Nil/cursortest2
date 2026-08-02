package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface c extends IInterface {
    void zzb(@Nullable Account account) throws RemoteException;

    void zzc(boolean z) throws RemoteException;
}

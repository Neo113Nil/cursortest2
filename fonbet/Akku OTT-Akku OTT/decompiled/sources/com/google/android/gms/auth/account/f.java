package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface f extends IInterface {
    void A(c cVar, Account account) throws RemoteException;

    void j(boolean z) throws RemoteException;

    void z(c cVar, String str) throws RemoteException;
}

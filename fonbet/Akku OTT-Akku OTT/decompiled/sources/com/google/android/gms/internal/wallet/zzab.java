package com.google.android.gms.internal.wallet;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.wobs.WalletObjects;

/* loaded from: classes4.dex */
public final class zzab implements WalletObjects {
    @Override // com.google.android.gms.wallet.wobs.WalletObjects
    @SuppressLint({"MissingRemoteException"})
    public final void createWalletObjects(h hVar, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        hVar.a(new zzaa(this, hVar, createWalletObjectsRequest, i));
    }
}

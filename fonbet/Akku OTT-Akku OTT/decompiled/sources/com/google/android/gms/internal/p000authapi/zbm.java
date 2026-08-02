package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0818l;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.c;

/* loaded from: classes4.dex */
public final class zbm extends zba implements IInterface {
    public zbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbs zbsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbsVar);
        zbc.zbb(zba, saveAccountLinkingTokenRequest);
        zbc.zbb(zba, cVar);
        zbb(1, zba);
    }

    public final void zbd(zbu zbuVar, C0818l c0818l, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbuVar);
        zbc.zbb(zba, c0818l);
        zbc.zbb(zba, cVar);
        zbb(2, zba);
    }
}

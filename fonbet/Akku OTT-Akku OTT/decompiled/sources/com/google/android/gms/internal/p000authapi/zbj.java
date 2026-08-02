package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.InterfaceC0834h;

/* loaded from: classes4.dex */
public final class zbj extends zba implements IInterface {
    public zbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbi zbiVar, AuthorizationRequest authorizationRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbiVar);
        zbc.zbb(zba, authorizationRequest);
        zbc.zbb(zba, cVar);
        zbb(1, zba);
    }

    public final void zbd(InterfaceC0834h interfaceC0834h, RevokeAccessRequest revokeAccessRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, interfaceC0834h);
        zbc.zbb(zba, revokeAccessRequest);
        zbc.zbb(zba, cVar);
        zbb(3, zba);
    }

    public final void zbe(InterfaceC0834h interfaceC0834h, ClearTokenRequest clearTokenRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, interfaceC0834h);
        zbc.zbb(zba, clearTokenRequest);
        zbc.zbb(zba, cVar);
        zbb(4, zba);
    }
}

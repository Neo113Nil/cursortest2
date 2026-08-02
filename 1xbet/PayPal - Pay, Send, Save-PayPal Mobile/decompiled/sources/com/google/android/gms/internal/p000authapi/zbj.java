package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbj extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbi zbiVar, com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbiVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, authorizationRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.auth.api.identity.RevokeAccessRequest revokeAccessRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, iStatusCallback);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, revokeAccessRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(3, zba);
    }

    public final void zbe(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.auth.api.identity.ClearTokenRequest clearTokenRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, iStatusCallback);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, clearTokenRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(4, zba);
    }
}

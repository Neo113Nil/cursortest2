package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbk extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbj zbjVar, com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbjVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, authorizationRequest);
        zbb(1, zba);
    }
}

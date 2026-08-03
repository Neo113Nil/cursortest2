package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbn extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbt zbtVar, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbtVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.internal.p000authapi.zbv zbvVar, com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbvVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, savePasswordRequest);
        zbb(2, zba);
    }
}

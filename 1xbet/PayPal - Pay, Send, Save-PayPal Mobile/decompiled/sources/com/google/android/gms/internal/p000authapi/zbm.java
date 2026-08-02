package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbm extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbs zbsVar, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbsVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, saveAccountLinkingTokenRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.internal.p000authapi.zbu zbuVar, com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbuVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, savePasswordRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(2, zba);
    }
}

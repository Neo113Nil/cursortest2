package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbv extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbl zblVar, com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zblVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, beginSignInRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, java.lang.String str, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, iStatusCallback);
        zba.writeString(str);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(2, zba);
    }

    public final void zbe(com.google.android.gms.internal.p000authapi.zbq zbqVar, com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbqVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, getSignInIntentRequest);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(3, zba);
    }

    public final void zbf(com.google.android.gms.internal.p000authapi.zbo zboVar, com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, java.lang.String str, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zboVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, apiMetadata);
        zbb(4, zba);
    }
}

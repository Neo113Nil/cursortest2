package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbw extends com.google.android.gms.internal.p000authapi.zba implements android.os.IInterface {
    zbw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbm zbmVar, com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbmVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, beginSignInRequest);
        zbb(1, zba);
    }

    public final void zbd(com.google.android.gms.internal.p000authapi.zbp zbpVar, com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbpVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(com.google.android.gms.internal.p000authapi.zbr zbrVar, com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    public final void zbf(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}

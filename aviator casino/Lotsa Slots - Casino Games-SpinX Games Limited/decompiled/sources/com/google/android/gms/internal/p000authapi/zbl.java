package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public abstract class zbl extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.internal.p000authapi.zbm {
    public zbl() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.auth.api.identity.BeginSignInResult beginSignInResult = (com.google.android.gms.auth.api.identity.BeginSignInResult) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.auth.api.identity.BeginSignInResult.CREATOR);
        com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
        zbb(status, beginSignInResult);
        return true;
    }
}

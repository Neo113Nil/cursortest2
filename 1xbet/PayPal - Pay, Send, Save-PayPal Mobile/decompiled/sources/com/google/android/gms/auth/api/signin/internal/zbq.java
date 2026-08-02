package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public abstract class zbq extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.auth.api.signin.internal.zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 101:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbd(parcel);
                zbb(googleSignInAccount, status);
                break;
            case 102:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbd(parcel);
                zbc(status2);
                break;
            case 103:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbd(parcel);
                zbd(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

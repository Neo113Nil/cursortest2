package com.google.android.gms.signin.internal;

/* loaded from: classes4.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zaf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws android.os.RemoteException {
        android.os.Parcel zaa = zaa();
        zaa.writeInt(i);
        zac(7, zaa);
    }

    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, int i, boolean z) throws android.os.RemoteException {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iAccountAccessor);
        zaa.writeInt(i);
        zaa.writeInt(z ? 1 : 0);
        zac(9, zaa);
    }

    public final void zag(com.google.android.gms.signin.internal.zai zaiVar, com.google.android.gms.signin.internal.zae zaeVar) throws android.os.RemoteException {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        zac(12, zaa);
    }
}

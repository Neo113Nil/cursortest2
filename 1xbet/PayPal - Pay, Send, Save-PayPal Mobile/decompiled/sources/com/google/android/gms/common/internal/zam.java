package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zam(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zae(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.common.internal.zax zaxVar) throws android.os.RemoteException {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(zaa, zaxVar);
        android.os.Parcel zab = zab(2, zaa);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zab.readStrongBinder());
        zab.recycle();
        return asInterface;
    }
}

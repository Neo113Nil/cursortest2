package com.google.android.gms.common.internal.service;

/* loaded from: classes8.dex */
public final class zal extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(com.google.android.gms.common.internal.service.zak zakVar) throws android.os.RemoteException {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zakVar);
        zad(1, zaa);
    }
}

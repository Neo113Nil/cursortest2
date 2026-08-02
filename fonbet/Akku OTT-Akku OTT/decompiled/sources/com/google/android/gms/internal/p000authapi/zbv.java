package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0810d;
import com.google.android.gms.auth.api.identity.C0814h;
import com.google.android.gms.auth.api.identity.C0815i;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.InterfaceC0834h;

/* loaded from: classes4.dex */
public final class zbv extends zba implements IInterface {
    public zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, C0810d c0810d, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zblVar);
        zbc.zbb(zba, c0810d);
        zbc.zbb(zba, cVar);
        zbb(1, zba);
    }

    public final void zbd(InterfaceC0834h interfaceC0834h, String str, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, interfaceC0834h);
        zba.writeString(str);
        zbc.zbb(zba, cVar);
        zbb(2, zba);
    }

    public final void zbe(zbq zbqVar, C0815i c0815i, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbqVar);
        zbc.zbb(zba, c0815i);
        zbc.zbb(zba, cVar);
        zbb(3, zba);
    }

    public final void zbf(zbo zboVar, C0814h c0814h, String str, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zboVar);
        zbc.zbb(zba, c0814h);
        zba.writeString(str);
        zbc.zbb(zba, cVar);
        zbb(4, zba);
    }
}

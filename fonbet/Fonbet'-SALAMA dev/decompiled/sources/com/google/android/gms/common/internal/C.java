package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class C implements InterfaceC0862n {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f11229a;

    public C(IBinder iBinder) {
        this.f11229a = iBinder;
    }

    public final void Z(G g3, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(g3.asBinder());
            obtain.writeInt(1);
            E.a(getServiceRequest, obtain, 0);
            this.f11229a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11229a;
    }
}

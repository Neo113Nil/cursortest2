package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0818n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f11229a;

    public C(IBinder iBinder) {
        this.f11229a = iBinder;
    }

    public final void Z(G g3, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(g3.asBinder());
            parcelObtain.writeInt(1);
            E.a(getServiceRequest, parcelObtain, 0);
            this.f11229a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11229a;
    }
}

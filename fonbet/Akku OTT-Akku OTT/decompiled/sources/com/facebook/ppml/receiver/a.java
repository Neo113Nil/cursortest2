package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: com.facebook.ppml.receiver.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0098a extends Binder implements a {

        /* renamed from: com.facebook.ppml.receiver.a$a$a, reason: collision with other inner class name */
        public static class C0099a implements a {
            public IBinder a;

            @Override // com.facebook.ppml.receiver.a
            public final int a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }
        }

        public static a C(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            C0099a c0099a = new C0099a();
            c0099a.a = iBinder;
            return c0099a;
        }
    }

    int a(Bundle bundle) throws RemoteException;
}

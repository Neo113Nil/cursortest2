package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class m implements io.appmetrica.analytics.identifiers.impl.o {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f3875a;

    public m(android.os.IBinder iBinder) {
        this.f3875a = iBinder;
    }

    public final java.lang.String a() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f3875a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f3875a;
    }

    public final boolean b() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f3875a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

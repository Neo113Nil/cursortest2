package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public abstract class n extends android.os.Binder implements io.appmetrica.analytics.identifiers.impl.o {
    public n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    public static io.appmetrica.analytics.identifiers.impl.o a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof io.appmetrica.analytics.identifiers.impl.o)) ? new io.appmetrica.analytics.identifiers.impl.m(iBinder) : (io.appmetrica.analytics.identifiers.impl.o) queryLocalInterface;
    }

    public abstract /* synthetic */ java.lang.String a();

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    public abstract /* synthetic */ boolean b();

    @Override // android.os.Binder
    public final boolean onTransact(int i2, android.os.Parcel parcel, android.os.Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            java.lang.String a2 = a();
            parcel2.writeNoException();
            parcel2.writeString(a2);
            return true;
        }
        if (i2 != 2) {
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        boolean b2 = b();
        parcel2.writeNoException();
        parcel2.writeInt(b2 ? 1 : 0);
        return true;
    }
}

package sg.bigo.ads.o0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: sg.bigo.ads.o0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5425b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f13223a;

    public C5425b(IBinder iBinder) {
        this.f13223a = iBinder;
    }

    public final String a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f13223a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13223a;
    }

    public final Boolean b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z = true;
            obtain.writeInt(1);
            this.f13223a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

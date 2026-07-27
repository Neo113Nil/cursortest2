package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n2.AbstractC1341c;
import o.BinderC1346a;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257b implements InterfaceC0259d {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f4758a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4758a;
    }

    public final boolean b(BinderC1346a binderC1346a, Uri uri, Bundle bundle, ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0259d.f4760c);
            obtain.writeStrongInterface(binderC1346a);
            AbstractC1341c.M(obtain, uri);
            AbstractC1341c.M(obtain, bundle);
            if (arrayList == null) {
                obtain.writeInt(-1);
            } else {
                int size = arrayList.size();
                obtain.writeInt(size);
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1341c.M(obtain, (Parcelable) arrayList.get(i2));
                }
            }
            this.f4758a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean c(BinderC1346a binderC1346a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0259d.f4760c);
            obtain.writeStrongInterface(binderC1346a);
            this.f4758a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0259d.f4760c);
            obtain.writeLong(0L);
            this.f4758a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

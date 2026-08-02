package b;

import a.AbstractC0444a;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import q.BinderC2290e;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497b implements InterfaceC0499d {

    /* renamed from: k, reason: collision with root package name */
    public IBinder f7131k;

    public final boolean L(BinderC2290e binderC2290e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0499d.f7133c);
            obtain.writeStrongInterface(binderC2290e);
            this.f7131k.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int N(BinderC2290e binderC2290e, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0499d.f7133c);
            obtain.writeStrongInterface(binderC2290e);
            obtain.writeString(str);
            AbstractC0444a.f(obtain, bundle);
            this.f7131k.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean Y(BinderC2290e binderC2290e, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0499d.f7133c);
            obtain.writeStrongInterface(binderC2290e);
            AbstractC0444a.f(obtain, uri);
            this.f7131k.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7131k;
    }

    public final boolean d1(BinderC2290e binderC2290e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0499d.f7133c);
            obtain.writeStrongInterface(binderC2290e);
            AbstractC0444a.f(obtain, uri);
            AbstractC0444a.f(obtain, bundle);
            this.f7131k.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean h1() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0499d.f7133c);
            obtain.writeLong(0L);
            this.f7131k.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

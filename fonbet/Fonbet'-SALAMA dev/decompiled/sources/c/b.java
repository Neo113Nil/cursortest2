package c;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import n3.AbstractC1464a;
import p.BinderC1519f;
import p.BinderC1529p;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f10157a;

    public final boolean A0(BinderC1519f binderC1519f, int i7, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            obtain.writeInt(i7);
            AbstractC1464a.a0(obtain, uri);
            AbstractC1464a.a0(obtain, bundle);
            this.f10157a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean B0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeLong(0L);
            this.f10157a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean Z(BinderC1519f binderC1519f, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            AbstractC1464a.a0(obtain, bundle);
            this.f10157a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10157a;
    }

    public final boolean t0(BinderC1519f binderC1519f, Uri uri, Bundle bundle, List list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            AbstractC1464a.a0(obtain, uri);
            AbstractC1464a.a0(obtain, bundle);
            if (list == null) {
                obtain.writeInt(-1);
            } else {
                int size = list.size();
                obtain.writeInt(size);
                for (int i7 = 0; i7 < size; i7++) {
                    AbstractC1464a.a0(obtain, (Parcelable) list.get(i7));
                }
            }
            this.f10157a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean u0(BinderC1519f binderC1519f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            this.f10157a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int v0(BinderC1519f binderC1519f, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            obtain.writeString(str);
            AbstractC1464a.a0(obtain, bundle);
            this.f10157a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean w0(BinderC1519f binderC1519f, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            AbstractC1464a.a0(obtain, uri);
            this.f10157a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean x0(BinderC1519f binderC1519f, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            AbstractC1464a.a0(obtain, uri);
            AbstractC1464a.a0(obtain, bundle);
            this.f10157a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean y0(BinderC1519f binderC1519f, BinderC1529p binderC1529p, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            obtain.writeStrongBinder(binderC1529p);
            AbstractC1464a.a0(obtain, bundle);
            this.f10157a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean z0(BinderC1519f binderC1519f, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f10159m);
            obtain.writeStrongInterface(binderC1519f);
            AbstractC1464a.a0(obtain, bundle);
            this.f10157a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f8042a;

    @Override // android.support.v4.media.session.d
    public final boolean L(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8042a;
    }

    @Override // android.support.v4.media.session.d
    public final void e(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(bVar);
            this.f8042a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent m() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void w(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(bVar);
            this.f8042a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

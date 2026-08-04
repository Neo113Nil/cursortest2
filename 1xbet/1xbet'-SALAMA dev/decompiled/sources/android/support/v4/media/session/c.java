package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(bVar);
            this.f8042a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent m() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void w(b bVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(bVar);
            this.f8042a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

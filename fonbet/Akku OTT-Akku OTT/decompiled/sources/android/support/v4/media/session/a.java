package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0017a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C0018a implements a {
            public IBinder a;

            @Override // android.support.v4.media.session.a
            public final void B(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.v4.media.session.a
            public final void g(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void n(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(1);
                    parcelableVolumeInfo.writeToParcel(obtain, 0);
                    this.a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void onSessionDestroyed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.readString();
                    ((MediaControllerCompat.a.b) this).a.get();
                    return true;
                case 2:
                    onSessionDestroyed();
                    return true;
                case 3:
                    ((MediaControllerCompat.a.b) this).B((PlaybackStateCompat) b.a(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    g((MediaMetadataCompat) b.a(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    y();
                    return true;
                case 6:
                    c();
                    return true;
                case 7:
                    d();
                    return true;
                case 8:
                    n((ParcelableVolumeInfo) b.a(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    parcel.readInt();
                    ((MediaControllerCompat.a.b) this).a.get();
                    return true;
                case 10:
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.readInt();
                    ((MediaControllerCompat.a.b) this).a.get();
                    return true;
                case 12:
                    parcel.readInt();
                    ((MediaControllerCompat.a.b) this).a.get();
                    return true;
                case 13:
                    ((MediaControllerCompat.a.b) this).a.get();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void B(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void c() throws RemoteException;

    void d() throws RemoteException;

    void g(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void n(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void onSessionDestroyed() throws RemoteException;

    void y() throws RemoteException;
}

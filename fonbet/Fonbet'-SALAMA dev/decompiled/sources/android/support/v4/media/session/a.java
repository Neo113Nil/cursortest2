package android.support.v4.media.session;

import a.AbstractC0603a;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f8041a;

    @Override // android.support.v4.media.session.b
    public final void F(boolean z4) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(z4 ? 1 : 0);
            this.f8041a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void P() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f8041a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void R(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC0603a.x0(obtain, mediaMetadataCompat);
            this.f8041a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8041a;
    }

    @Override // android.support.v4.media.session.b
    public final void b(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            this.f8041a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void b0(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            this.f8041a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void q0(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC0603a.x0(obtain, playbackStateCompat);
            this.f8041a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void r(List list) {
        throw null;
    }

    @Override // android.support.v4.media.session.b
    public final void s0(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC0603a.x0(obtain, parcelableVolumeInfo);
            this.f8041a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

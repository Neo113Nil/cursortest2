package android.support.v4.media.session;

import a.AbstractC0603a;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import g5.C1150e;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends Binder implements b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8046a;

    public g(C1150e c1150e) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f8046a = new WeakReference(c1150e);
    }

    @Override // android.support.v4.media.session.b
    public final void F(boolean z4) {
        C1150e c1150e = (C1150e) this.f8046a.get();
        if (c1150e != null) {
            c1150e.a(11, Boolean.valueOf(z4), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void M(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void P() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void R(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void b(int i7) {
        C1150e c1150e = (C1150e) this.f8046a.get();
        if (c1150e != null) {
            c1150e.a(9, Integer.valueOf(i7), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void b0(int i7) {
        C1150e c1150e = (C1150e) this.f8046a.get();
        if (c1150e != null) {
            c1150e.a(12, Integer.valueOf(i7), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f8046a;
        switch (i7) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0603a.a(parcel, Bundle.CREATOR);
                C1150e c1150e = (C1150e) weakReference.get();
                if (c1150e != null) {
                    c1150e.a(1, readString, bundle);
                }
                return true;
            case 2:
                P();
                return true;
            case 3:
                q0((PlaybackStateCompat) AbstractC0603a.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                R((MediaMetadataCompat) AbstractC0603a.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                r(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                M((CharSequence) AbstractC0603a.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                p((Bundle) AbstractC0603a.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                s0((ParcelableVolumeInfo) AbstractC0603a.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                b(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                F(parcel.readInt() != 0);
                return true;
            case 12:
                b0(parcel.readInt());
                return true;
            case 13:
                C1150e c1150e2 = (C1150e) weakReference.get();
                if (c1150e2 != null) {
                    c1150e2.a(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i8);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void p(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void q0(PlaybackStateCompat playbackStateCompat) {
        C1150e c1150e = (C1150e) this.f8046a.get();
        if (c1150e != null) {
            c1150e.a(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void r(List list) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void s0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

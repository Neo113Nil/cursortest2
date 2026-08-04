package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8046a;

    public g(p049g5.e eVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f8046a = new WeakReference(eVar);
    }

    @Override // android.support.v4.media.session.b
    public final void F(boolean z4) {
        p049g5.e eVar = (p049g5.e) this.f8046a.get();
        if (eVar != null) {
            eVar.a(11, Boolean.valueOf(z4), null);
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
        p049g5.e eVar = (p049g5.e) this.f8046a.get();
        if (eVar != null) {
            eVar.a(9, Integer.valueOf(i7), null);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void b0(int i7) {
        p049g5.e eVar = (p049g5.e) this.f8046a.get();
        if (eVar != null) {
            eVar.a(12, Integer.valueOf(i7), null);
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
                String string = parcel.readString();
                Bundle bundle = (Bundle) p003a.a.a(parcel, Bundle.CREATOR);
                p049g5.e eVar = (p049g5.e) weakReference.get();
                if (eVar != null) {
                    eVar.a(1, string, bundle);
                }
                return true;
            case 2:
                P();
                return true;
            case 3:
                q0((PlaybackStateCompat) p003a.a.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                R((MediaMetadataCompat) p003a.a.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                r(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                M((CharSequence) p003a.a.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                p((Bundle) p003a.a.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                s0((ParcelableVolumeInfo) p003a.a.a(parcel, ParcelableVolumeInfo.CREATOR));
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
                p049g5.e eVar2 = (p049g5.e) weakReference.get();
                if (eVar2 != null) {
                    eVar2.a(13, null, null);
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
        p049g5.e eVar = (p049g5.e) this.f8046a.get();
        if (eVar != null) {
            eVar.a(2, playbackStateCompat, null);
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

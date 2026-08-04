package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Binder implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8058b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f8059a;

    public n(o oVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f8059a = new AtomicReference(oVar);
    }

    @Override // android.support.v4.media.session.d
    public final void A(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B(int i7, int i8) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void C() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void E(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void K(float f7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean L(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Q(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String S() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void T(boolean z4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat W() {
        long j;
        o oVar = (o) this.f8059a.get();
        if (oVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = oVar.f8065f;
        MediaMetadataCompat mediaMetadataCompat = oVar.f8067h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j3 = playbackStateCompat.f8028b;
        long j7 = -1;
        if (j3 == -1) {
            return playbackStateCompat;
        }
        int i7 = playbackStateCompat.f8027a;
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            return playbackStateCompat;
        }
        long j8 = playbackStateCompat.f8034y;
        if (j8 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = ((long) (playbackStateCompat.f8030d * (jElapsedRealtime - j8))) + j3;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f7991a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j7 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j7 < 0 || j9 <= j7) {
            j = j9 < 0 ? 0L : j9;
        } else {
            j = j7;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.f8035z;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f8027a, j, playbackStateCompat.f8029c, playbackStateCompat.f8030d, playbackStateCompat.f8031e, playbackStateCompat.f8032f, playbackStateCompat.f8033x, jElapsedRealtime, arrayList, playbackStateCompat.f8024A, playbackStateCompat.f8025B);
    }

    @Override // android.support.v4.media.session.d
    public final int X() {
        o oVar = (o) this.f8059a.get();
        if (oVar != null) {
            return oVar.f8069k;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void Y(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean a0() {
        o oVar = (o) this.f8059a.get();
        return oVar != null && oVar.f8068i;
    }

    @Override // android.support.v4.media.session.d
    public final long c() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void d(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e(b bVar) {
        o oVar = (o) this.f8059a.get();
        if (oVar == null) {
            return;
        }
        oVar.f8064e.register(bVar, new p117q0.t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (oVar.f8063d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void e0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void g(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List g0() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void h(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void h0(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void i0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean k() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int k0() {
        o oVar = (o) this.f8059a.get();
        if (oVar != null) {
            return oVar.j;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void l(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void l0(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent m() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo m0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n() {
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o0(int i7) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i7) {
            case 1:
                f0(parcel.readString(), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) p097n3.a.d(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zL = L((KeyEvent) p097n3.a.d(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.f8041a = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                e(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.f8041a = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) iInterfaceQueryLocalInterface2;
                    }
                }
                w(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zK = k();
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 6:
                String strP0 = p0();
                parcel2.writeNoException();
                parcel2.writeString(strP0);
                return true;
            case 7:
                String strS = S();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 8:
                PendingIntent pendingIntentM = m();
                parcel2.writeNoException();
                p097n3.a.b0(parcel2, pendingIntentM, 1);
                return true;
            case 9:
                long jC = c();
                parcel2.writeNoException();
                parcel2.writeLong(jC);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoM0 = m0();
                parcel2.writeNoException();
                p097n3.a.b0(parcel2, parcelableVolumeInfoM0, 1);
                return true;
            case 11:
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                parcel.readString();
                q(i9, i10);
                parcel2.writeNoException();
                return true;
            case 12:
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                parcel.readString();
                B(i11, i12);
                parcel2.writeNoException();
                return true;
            case 13:
                e0();
                parcel2.writeNoException();
                return true;
            case 14:
                y(parcel.readString(), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                A(parcel.readString(), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                D((Uri) p097n3.a.d(parcel, Uri.CREATOR), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                l0(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                pause();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                C();
                parcel2.writeNoException();
                return true;
            case 23:
                i0();
                parcel2.writeNoException();
                return true;
            case 24:
                E(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                g((RatingCompat) p097n3.a.d(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                d(parcel.readString(), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatT = t();
                parcel2.writeNoException();
                p097n3.a.b0(parcel2, mediaMetadataCompatT, 1);
                return true;
            case 28:
                PlaybackStateCompat playbackStateCompatW = W();
                parcel2.writeNoException();
                p097n3.a.b0(parcel2, playbackStateCompatW, 1);
                return true;
            case 29:
                List listG0 = g0();
                parcel2.writeNoException();
                if (listG0 == null) {
                    parcel2.writeInt(-1);
                } else {
                    int size = listG0.size();
                    parcel2.writeInt(size);
                    for (int i13 = 0; i13 < size; i13++) {
                        p097n3.a.b0(parcel2, (Parcelable) listG0.get(i13), 1);
                    }
                }
                return true;
            case 30:
                CharSequence charSequenceS = s();
                parcel2.writeNoException();
                if (charSequenceS != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceS, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                p097n3.a.b0(parcel2, extras, 1);
                return true;
            case 32:
                n();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                a();
                parcel2.writeNoException();
                return true;
            case 34:
                u(parcel.readString(), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                o(parcel.readString(), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                h((Uri) p097n3.a.d(parcel, Uri.CREATOR), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iK0 = k0();
                parcel2.writeNoException();
                parcel2.writeInt(iK0);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                h0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                l((MediaDescriptionCompat) p097n3.a.d(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                Q((MediaDescriptionCompat) p097n3.a.d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                j((MediaDescriptionCompat) p097n3.a.d(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                Y(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                boolean zA0 = a0();
                parcel2.writeNoException();
                parcel2.writeInt(zA0 ? 1 : 0);
                return true;
            case 46:
                T(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iX = X();
                parcel2.writeNoException();
                parcel2.writeInt(iX);
                return true;
            case 48:
                o0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                K(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleV = v();
                parcel2.writeNoException();
                p097n3.a.b0(parcel2, bundleV, 1);
                return true;
            case 51:
                O((RatingCompat) p097n3.a.d(parcel, RatingCompat.CREATOR), (Bundle) p097n3.a.d(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i8);
        }
    }

    @Override // android.support.v4.media.session.d
    public final String p0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void pause() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(int i7, int i8) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence s() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat t() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle v() {
        ((o) this.f8059a.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void w(b bVar) {
        o oVar = (o) this.f8059a.get();
        if (oVar == null) {
            return;
        }
        oVar.f8064e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (oVar.f8063d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void y(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

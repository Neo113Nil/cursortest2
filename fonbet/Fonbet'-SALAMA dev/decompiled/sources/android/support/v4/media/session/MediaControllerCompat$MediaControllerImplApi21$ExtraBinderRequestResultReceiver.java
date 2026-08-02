package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f8010a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.support.v4.media.session.d] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        c cVar;
        h hVar = (h) this.f8010a.get();
        if (hVar == null || bundle == null) {
            return;
        }
        synchronized (hVar.f8048b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = hVar.f8051e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i8 = n.f8058b;
            Q0.d dVar = null;
            if (binder == null) {
                cVar = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    c cVar2 = new c();
                    cVar2.f8042a = binder;
                    cVar = cVar2;
                } else {
                    cVar = (d) queryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.f8015a) {
                mediaSessionCompat$Token.f8017c = cVar;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.f8051e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(Q0.a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    dVar = ((ParcelImpl) parcelable).f9841a;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.f8015a) {
                mediaSessionCompat$Token2.f8018d = dVar;
            }
            hVar.a();
        }
    }
}

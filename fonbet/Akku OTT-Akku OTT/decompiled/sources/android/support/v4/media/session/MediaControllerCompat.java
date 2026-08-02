package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    public final MediaControllerImplApi21 a;
    public final Set<a> b;

    @RequiresApi(21)
    public static class MediaControllerImplApi21 {
        public final MediaController a;
        public final Object b = new Object();

        @GuardedBy("mLock")
        public final ArrayList c = new ArrayList();
        public final HashMap<a, a> d = new HashMap<>();
        public final MediaSessionCompat.Token e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> a;

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                android.support.v4.media.session.b bVar;
                MediaControllerImplApi21 mediaControllerImplApi21 = this.a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                    IBinder binder = BundleCompat.getBinder(bundle, androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER);
                    int i2 = b.a.a;
                    if (binder == null) {
                        bVar = null;
                    } else {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.b)) {
                            b.a.C0019a c0019a = new b.a.C0019a();
                            c0019a.a = binder;
                            bVar = c0019a;
                        } else {
                            bVar = (android.support.v4.media.session.b) queryLocalInterface;
                        }
                    }
                    synchronized (token.a) {
                        token.c = bVar;
                    }
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.e;
                    VersionedParcelable versionedParcelable = ParcelUtils.getVersionedParcelable(bundle, androidx.media3.session.legacy.MediaSessionCompat.KEY_SESSION2_TOKEN);
                    synchronized (token2.a) {
                        token2.d = versionedParcelable;
                    }
                    mediaControllerImplApi21.a();
                }
            }
        }

        public static class a extends a.b {
            @Override // android.support.v4.media.session.a
            public final void c() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void d() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void g(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void n(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void y() throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.b);
            this.a = mediaController;
            if (token.l() == null) {
                ExtraBinderRequestResultReceiver extraBinderRequestResultReceiver = new ExtraBinderRequestResultReceiver(null);
                extraBinderRequestResultReceiver.a = new WeakReference<>(this);
                mediaController.sendCommand(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, extraBinderRequestResultReceiver);
            }
        }

        @GuardedBy("mLock")
        public final void a() {
            MediaSessionCompat.Token token = this.e;
            if (token.l() == null) {
                return;
            }
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                a aVar2 = new a(aVar);
                this.d.put(aVar, aVar2);
                aVar.getClass();
                try {
                    token.l().o(aVar2);
                } catch (RemoteException unused) {
                }
            }
            arrayList.clear();
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        public static class C0015a extends MediaController.Callback {
            public final WeakReference<a> a;

            public C0015a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.a.get() != null) {
                    playbackInfo.getPlaybackType();
                    AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes());
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (this.a.get() != null) {
                    ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.c;
                    if (mediaMetadata != null) {
                        Parcel obtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.b = mediaMetadata;
                    }
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                this.a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (this.a.get() == null || list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaSession.QueueItem queueItem2 : list) {
                    if (queueItem2 != null) {
                        MediaSession.QueueItem queueItem3 = queueItem2;
                        queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.h(MediaSessionCompat.QueueItem.b.b(queueItem3)), MediaSessionCompat.QueueItem.b.c(queueItem3));
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                this.a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.a.get();
            }
        }

        public static class b extends a.AbstractBinderC0017a {
            public final WeakReference<a> a;

            public b(a aVar) {
                attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public final void B(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                this.a.get();
            }
        }

        public a() {
            new C0015a(this);
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
        }
    }

    @RequiresApi(29)
    public static class b extends MediaControllerImplApi21 {
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.b = Collections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new b(context, token);
        } else {
            this.a = new MediaControllerImplApi21(context, token);
        }
    }
}

package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final /* synthetic */ int b = 0;
    public final e a;

    public static class CustomActionResultReceiver extends android.support.v4.os.b {
        @Override // android.support.v4.os.b
        public final void onReceiveResult(int i, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends android.support.v4.os.b {
        @Override // android.support.v4.os.b
        public final void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.a(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public static class SearchResultReceiver extends android.support.v4.os.b {
        @Override // android.support.v4.os.b
        public final void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.a(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        public static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    public static class b extends Handler {
        public final WeakReference<g> a;
        public WeakReference<Messenger> b;

        public b(d dVar) {
            this.a = new WeakReference<>(dVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            WeakReference<g> weakReference2 = this.a;
            if (weakReference2.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            g gVar = weakReference2.get();
            Messenger messenger = this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    MediaSessionCompat.a(data.getBundle("data_root_hints"));
                    gVar.c(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN));
                    return;
                }
                if (i == 2) {
                    gVar.b(messenger);
                    return;
                }
                if (i != 3) {
                    message.toString();
                    return;
                }
                Bundle bundle = data.getBundle("data_options");
                MediaSessionCompat.a(bundle);
                MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                gVar.a(messenger, string, bundle);
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    gVar.b(messenger);
                }
            }
        }
    }

    public static class c {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new a();
        b mConnectionCallbackInternal;

        @RequiresApi(21)
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnected() {
                android.support.v4.media.session.b bVar;
                c cVar = c.this;
                b bVar2 = cVar.mConnectionCallbackInternal;
                if (bVar2 != null) {
                    d dVar = (d) bVar2;
                    b bVar3 = dVar.d;
                    MediaBrowser mediaBrowser = dVar.b;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = BundleCompat.getBinder(extras, "extra_messenger");
                            if (binder != null) {
                                Bundle bundle = dVar.c;
                                h hVar = new h();
                                hVar.a = new Messenger(binder);
                                hVar.b = bundle;
                                dVar.f = hVar;
                                Messenger messenger = new Messenger(bVar3);
                                dVar.g = messenger;
                                bVar3.getClass();
                                bVar3.b = new WeakReference<>(messenger);
                                try {
                                    h hVar2 = dVar.f;
                                    Context context = dVar.a;
                                    Messenger messenger2 = dVar.g;
                                    hVar2.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("data_package_name", context.getPackageName());
                                    bundle2.putInt("data_calling_pid", Process.myPid());
                                    bundle2.putBundle("data_root_hints", hVar2.b);
                                    hVar2.a(6, bundle2, messenger2);
                                } catch (RemoteException unused) {
                                }
                            }
                            IBinder binder2 = BundleCompat.getBinder(extras, "extra_session_binder");
                            int i = b.a.a;
                            if (binder2 == null) {
                                bVar = null;
                            } else {
                                IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.b)) {
                                    b.a.C0019a c0019a = new b.a.C0019a();
                                    c0019a.a = binder2;
                                    bVar = c0019a;
                                } else {
                                    bVar = (android.support.v4.media.session.b) queryLocalInterface;
                                }
                            }
                            if (bVar != null) {
                                dVar.h = MediaSessionCompat.Token.h(mediaBrowser.getSessionToken(), bVar);
                            }
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                cVar.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionFailed() {
                c cVar = c.this;
                b bVar = cVar.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.getClass();
                }
                cVar.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionSuspended() {
                c cVar = c.this;
                b bVar = cVar.mConnectionCallbackInternal;
                if (bVar != null) {
                    d dVar = (d) bVar;
                    dVar.f = null;
                    dVar.g = null;
                    dVar.h = null;
                    b bVar2 = dVar.d;
                    bVar2.getClass();
                    bVar2.b = new WeakReference<>(null);
                }
                cVar.onConnectionSuspended();
            }
        }

        public interface b {
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(b bVar) {
            this.mConnectionCallbackInternal = bVar;
        }
    }

    @RequiresApi(23)
    public static class e extends d {
    }

    @RequiresApi(26)
    public static class f extends e {
    }

    public interface g {
        void a(Messenger messenger, String str, Bundle bundle);

        void b(Messenger messenger);

        void c(Messenger messenger, String str, MediaSessionCompat.Token token);
    }

    public static class h {
        public Messenger a;
        public Bundle b;

        public final void a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }
    }

    public static class i {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static abstract class j {

        @RequiresApi(21)
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                MediaItem.h(list);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(@NonNull String str) {
                j.this.getClass();
            }
        }

        @RequiresApi(26)
        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.a(bundle);
                MediaItem.h(list);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j.this.getClass();
            }
        }

        public j() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new b();
            } else {
                new a();
            }
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new f(context, componentName, cVar);
        } else {
            this.a = new e(context, componentName, cVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public final int a;
        public final MediaDescriptionCompat b;

        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = i;
            this.b = mediaDescriptionCompat;
        }

        public static void h(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                        mediaItem = new MediaItem(MediaDescriptionCompat.h(a.a(mediaItem2)), a.b(mediaItem2));
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NonNull
        public final String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    @RequiresApi(21)
    public static class d implements g, c.b {
        public final Context a;
        public final MediaBrowser b;
        public final Bundle c;
        public final b d = new b(this);
        public final ArrayMap<String, i> e = new ArrayMap<>();
        public h f;
        public Messenger g;
        public MediaSessionCompat.Token h;

        public d(Context context, ComponentName componentName, c cVar) {
            this.a = context;
            Bundle bundle = new Bundle();
            this.c = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            cVar.setInternalConnectionCallback(this);
            this.b = new MediaBrowser(context, componentName, cVar.mConnectionCallbackFwk, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void a(Messenger messenger, String str, Bundle bundle) {
            if (this.g != messenger) {
                return;
            }
            i iVar = this.e.get(str);
            if (iVar == null) {
                int i = MediaBrowserCompat.b;
                return;
            }
            ArrayList arrayList = iVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) arrayList.get(i2), bundle)) {
                    return;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void b(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void c(Messenger messenger, String str, MediaSessionCompat.Token token) {
        }
    }
}

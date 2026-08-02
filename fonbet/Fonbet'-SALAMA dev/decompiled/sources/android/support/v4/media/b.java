package android.support.v4.media;

import F.x;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.n;
import android.util.Log;
import java.lang.ref.WeakReference;
import w1.V0;

/* loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f7999a;

    public b(x xVar) {
        this.f7999a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.support.v4.media.session.d] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.c cVar;
        boolean z4 = false;
        x xVar = this.f7999a;
        c cVar2 = (c) xVar.f2476b;
        if (cVar2 != null) {
            MediaBrowser mediaBrowser = cVar2.f8001b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        V0 v02 = new V0(26, z4);
                        v02.f17562b = new Messenger(binder);
                        v02.f17563c = cVar2.f8002c;
                        cVar2.f8005f = v02;
                        a aVar = cVar2.f8003d;
                        Messenger messenger = new Messenger(aVar);
                        cVar2.f8006g = messenger;
                        aVar.getClass();
                        aVar.f7998b = new WeakReference(messenger);
                        try {
                            V0 v03 = cVar2.f8005f;
                            Context context = cVar2.f8000a;
                            Messenger messenger2 = cVar2.f8006g;
                            v03.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) v03.f17563c);
                            v03.Y(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i7 = n.f8058b;
                    if (binder2 == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.d)) {
                            android.support.v4.media.session.c cVar3 = new android.support.v4.media.session.c();
                            cVar3.f8042a = binder2;
                            cVar = cVar3;
                        } else {
                            cVar = (android.support.v4.media.session.d) queryLocalInterface;
                        }
                    }
                    if (cVar != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        cVar2.f8007h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, cVar) : null;
                    }
                }
            } catch (IllegalStateException e7) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e7);
            }
        }
        xVar.p();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        x xVar = this.f7999a;
        Object obj = xVar.f2476b;
        xVar.q();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        x xVar = this.f7999a;
        c cVar = (c) xVar.f2476b;
        if (cVar != null) {
            cVar.f8005f = null;
            cVar.f8006g = null;
            cVar.f8007h = null;
            a aVar = cVar.f8003d;
            aVar.getClass();
            aVar.f7998b = new WeakReference(null);
        }
        xVar.r();
    }
}

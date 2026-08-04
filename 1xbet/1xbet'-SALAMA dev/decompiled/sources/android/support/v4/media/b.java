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
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f7999a;

    public b(x xVar) {
        this.f7999a = xVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.d dVar;
        android.support.v4.media.session.d dVar2;
        boolean z4 = false;
        x xVar = this.f7999a;
        c cVar = (c) xVar.f2476b;
        if (cVar != null) {
            MediaBrowser mediaBrowser = cVar.f8001b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        V0 v6 = new V0(26, z4);
                        v6.f17568b = new Messenger(binder);
                        v6.f17569c = cVar.f8002c;
                        cVar.f8005f = v6;
                        a aVar = cVar.f8003d;
                        Messenger messenger = new Messenger(aVar);
                        cVar.f8006g = messenger;
                        aVar.getClass();
                        aVar.f7998b = new WeakReference(messenger);
                        try {
                            V0 v7 = cVar.f8005f;
                            Context context = cVar.f8000a;
                            Messenger messenger2 = cVar.f8006g;
                            v7.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) v7.f17569c);
                            v7.Y(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i7 = n.f8058b;
                    if (binder2 == null) {
                        dVar2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.d)) {
                            android.support.v4.media.session.c cVar2 = new android.support.v4.media.session.c();
                            cVar2.f8042a = binder2;
                            dVar2 = cVar2;
                        } else {
                            dVar = (android.support.v4.media.session.d) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (dVar2 != null) {
                        dVar2 = dVar;
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        cVar.f8007h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, dVar2) : null;
                    }
                }
            } catch (IllegalStateException e7) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e7);
            }
        }
        dVar2 = dVar;
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

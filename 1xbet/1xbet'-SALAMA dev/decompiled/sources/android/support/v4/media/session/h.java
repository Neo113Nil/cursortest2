package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f8047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8048b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8049c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8050d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaSessionCompat$Token f8051e;

    public h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f8051e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f8016b);
        this.f8047a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f8010a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f8051e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList<p049g5.e> arrayList = this.f8049c;
        for (p049g5.e eVar : arrayList) {
            g gVar = new g(eVar);
            this.f8050d.put(eVar, gVar);
            eVar.f13254c = gVar;
            try {
                mediaSessionCompat$Token.a().e(gVar);
                eVar.a(13, null, null);
            } catch (RemoteException e7) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
            }
        }
        arrayList.clear();
    }

    public final void b(p049g5.e eVar) {
        this.f8047a.unregisterCallback(eVar.f13252a);
        synchronized (this.f8048b) {
            if (this.f8051e.a() != null) {
                try {
                    g gVar = (g) this.f8050d.remove(eVar);
                    if (gVar != null) {
                        eVar.f13254c = null;
                        this.f8051e.a().w(gVar);
                    }
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e7);
                }
            } else {
                this.f8049c.remove(eVar);
            }
        }
    }
}

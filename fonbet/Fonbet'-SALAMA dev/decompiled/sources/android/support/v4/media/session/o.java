package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import com.ryanheise.audioservice.AudioService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSession f8060a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8061b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f8062c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8063d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f8064e = new RemoteCallbackList();

    /* renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f8065f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f8066g;

    /* renamed from: h, reason: collision with root package name */
    public MediaMetadataCompat f8067h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8068i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f8069k;

    /* renamed from: l, reason: collision with root package name */
    public m f8070l;

    /* renamed from: m, reason: collision with root package name */
    public q0.t f8071m;

    public o(AudioService audioService) {
        MediaSession a2 = a(audioService);
        this.f8060a = a2;
        n nVar = new n(this);
        this.f8061b = nVar;
        this.f8062c = new MediaSessionCompat$Token(a2.getSessionToken(), nVar);
        a2.setFlags(3);
    }

    public MediaSession a(AudioService audioService) {
        return new MediaSession(audioService, "media-session");
    }

    public final m b() {
        m mVar;
        synchronized (this.f8063d) {
            mVar = this.f8070l;
        }
        return mVar;
    }

    public q0.t c() {
        q0.t tVar;
        synchronized (this.f8063d) {
            tVar = this.f8071m;
        }
        return tVar;
    }

    public final PlaybackStateCompat d() {
        return this.f8065f;
    }

    public final void e(m mVar, Handler handler) {
        synchronized (this.f8063d) {
            this.f8070l = mVar;
            this.f8060a.setCallback(mVar == null ? null : mVar.f8054b, handler);
            if (mVar != null) {
                synchronized (mVar.f8053a) {
                    try {
                        mVar.f8056d = new WeakReference(this);
                        R1.c cVar = mVar.f8057e;
                        R1.c cVar2 = null;
                        if (cVar != null) {
                            cVar.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            cVar2 = new R1.c(mVar, handler.getLooper(), 1);
                        }
                        mVar.f8057e = cVar2;
                    } finally {
                    }
                }
            }
        }
    }

    public void f(q0.t tVar) {
        synchronized (this.f8063d) {
            this.f8071m = tVar;
        }
    }
}

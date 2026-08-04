package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public final class l extends MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f8052a;

    public l(m mVar) {
        this.f8052a = mVar;
    }

    public static void b(o oVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = oVar.f8060a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e7) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e7);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        oVar.f(new p117q0.t(str, -1, -1));
    }

    public final o a() {
        o oVar;
        synchronized (this.f8052a.f8053a) {
            oVar = (o) this.f8052a.f8056d.get();
        }
        if (oVar == null || this.f8052a != oVar.b()) {
            return null;
        }
        return oVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        Q0.d dVar;
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = oVarA.f8062c;
                d dVarA = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", dVarA == null ? null : dVarA.asBinder());
                synchronized (mediaSessionCompat$Token.f8015a) {
                    dVar = mediaSessionCompat$Token.f8018d;
                }
                if (dVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(dVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                this.f8052a.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                this.f8052a.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                this.f8052a.p((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f8052a.getClass();
            } else if (oVarA.f8066g != null) {
                int i7 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i7 < 0 || i7 >= oVarA.f8066g.size()) ? null : (MediaSessionCompat$QueueItem) oVarA.f8066g.get(i7);
                if (mediaSessionCompat$QueueItem != null) {
                    this.f8052a.p(mediaSessionCompat$QueueItem.f8011a);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            m mVar = this.f8052a;
            if (zEquals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.Z(bundle2);
                mVar.k(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                mVar.l();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.Z(bundle3);
                mVar.m(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.Z(bundle4);
                mVar.n(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.Z(bundle5);
                mVar.o(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                mVar.s(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                mVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                mVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.Z(bundle6);
                mVar.v(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                mVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                mVar.d(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.e();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        o oVarA = a();
        if (oVarA == null) {
            return false;
        }
        b(oVarA);
        boolean zF = this.f8052a.f(intent);
        oVarA.f(null);
        return zF || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.g();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.h();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        this.f8052a.i(str, bundle);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        this.f8052a.j(str, bundle);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        this.f8052a.k(uri, bundle);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.l();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        this.f8052a.m(str, bundle);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        this.f8052a.n(str, bundle);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        t.Z(bundle);
        b(oVarA);
        this.f8052a.o(uri, bundle);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.q();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.r(j);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.t(f7);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.u(RatingCompat.a(rating));
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.y();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.z();
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.A(j);
        oVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        o oVarA = a();
        if (oVarA == null) {
            return;
        }
        b(oVarA);
        this.f8052a.B();
        oVarA.f(null);
    }
}

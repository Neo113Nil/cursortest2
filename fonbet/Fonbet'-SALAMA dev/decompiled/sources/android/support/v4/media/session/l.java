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

/* loaded from: classes.dex */
public final class l extends MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
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
        oVar.f(new q0.t(str, -1, -1));
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
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a2.f8062c;
                d a4 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a4 == null ? null : a4.asBinder());
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
            } else if (a2.f8066g != null) {
                int i7 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i7 < 0 || i7 >= a2.f8066g.size()) ? null : (MediaSessionCompat$QueueItem) a2.f8066g.get(i7);
                if (mediaSessionCompat$QueueItem != null) {
                    this.f8052a.p(mediaSessionCompat$QueueItem.f8011a);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            m mVar = this.f8052a;
            if (equals) {
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
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.e();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        o a2 = a();
        if (a2 == null) {
            return false;
        }
        b(a2);
        boolean f7 = this.f8052a.f(intent);
        a2.f(null);
        return f7 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.g();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.h();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        this.f8052a.i(str, bundle);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        this.f8052a.j(str, bundle);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        this.f8052a.k(uri, bundle);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.l();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        this.f8052a.m(str, bundle);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        this.f8052a.n(str, bundle);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        t.Z(bundle);
        b(a2);
        this.f8052a.o(uri, bundle);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.q();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.r(j);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.t(f7);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.u(RatingCompat.a(rating));
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.y();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.z();
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.A(j);
        a2.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        o a2 = a();
        if (a2 == null) {
            return;
        }
        b(a2);
        this.f8052a.B();
        a2.f(null);
    }
}

package sg.bigo.ads.r1;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class g implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final AtomicBoolean m = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f13273a;
    public Surface b;
    public String c;
    public f d;
    public boolean f;
    public boolean g;
    public final boolean k;
    public int e = 0;
    public final c h = new c(this);
    public boolean i = false;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public int l = 0;

    public g() {
        this.k = false;
        this.k = sg.bigo.ads.O.g.f12472a.B.a(3);
        a();
    }

    public final void a() {
        this.f13273a = new MediaPlayer();
        m.set(false);
        this.f13273a.setOnCompletionListener(this);
        this.f13273a.setOnErrorListener(this);
        this.f13273a.setOnInfoListener(this);
        this.f13273a.setOnPreparedListener(this);
        this.f13273a.setOnVideoSizeChangedListener(this);
        this.f13273a.setOnBufferingUpdateListener(this);
    }

    public final int b() {
        try {
            if (this.f) {
                return this.f13273a.getCurrentPosition();
            }
            AbstractC5496a.a("MediaPlayerWrapper", "getCurrentPosition failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e) {
            f fVar = this.d;
            if (fVar != null) {
                n nVar = (n) fVar;
                nVar.a(5, this.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a("MediaPlayerWrapper", "getCurrentPosition IllegalStateException");
            return 0;
        }
    }

    public final void c() {
        try {
            this.f13273a.release();
            m.set(true);
            AbstractC5446j.a(this.h);
        } catch (IllegalStateException e) {
            f fVar = this.d;
            if (fVar != null) {
                n nVar = (n) fVar;
                nVar.a(7, this.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a("MediaPlayerWrapper", "player release IllegalStateException");
        }
        this.e = 0;
        this.f = false;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC5446j.a(this.h);
        f fVar = this.d;
        if (fVar != null) {
            this.e = 5;
            n nVar = (n) fVar;
            nVar.v = true;
            AdImageView adImageView = nVar.n;
            if (adImageView != null) {
                adImageView.setVisibility(0);
            }
            nVar.g.setVisibility(nVar.w ? 8 : 0);
            nVar.g.setImageDrawable(AbstractC4944a.c(nVar.b, R.drawable.bigo_ad_ic_media_play));
            nVar.a(false);
            nVar.a("AdVideoComplete", (int[]) null);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        f fVar;
        if ((!this.k || this.l >= 3) && (fVar = this.d) != null) {
            ((n) fVar).a(i, i2);
            return true;
        }
        AbstractC5446j.a(this.h);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        f fVar = this.d;
        if (fVar != null) {
            n nVar = (n) fVar;
            if (i != 3) {
                nVar.getClass();
            } else {
                AdImageView adImageView = nVar.n;
                if (adImageView != null) {
                    adImageView.setVisibility(8);
                }
                ImageView imageView = nVar.e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        String str;
        if (!this.g) {
            str = "Surface is not available, do prepare cancel";
        } else {
            if (!this.j.get()) {
                this.e = 1;
                this.f = true;
                SystemClock.elapsedRealtime();
                f fVar = this.d;
                if (fVar != null) {
                    ((n) fVar).a(mediaPlayer, this.l);
                    return;
                }
                return;
            }
            str = "Destroy Has Called";
        }
        AbstractC5496a.b("MediaPlayerWrapper", str);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        f fVar = this.d;
        if (fVar != null) {
            ((n) fVar).a("AdSizeChange", (int[]) null);
        }
    }

    public final void a(int i) {
        if (this.k) {
            int i2 = this.l;
            if (i2 < 3) {
                this.l = i2 + 1;
                c();
                AbstractC5446j.a(2, null, new e(this, i), 0L);
            } else {
                f fVar = this.d;
                if (fVar != null) {
                    ((n) fVar).a(i, i2, "retry times has reached limit");
                }
            }
        }
    }

    public final void b(int i) {
        try {
            this.f13273a.seekTo(i);
        } catch (IllegalStateException e) {
            f fVar = this.d;
            if (fVar != null) {
                ((n) fVar).a(1, this.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a(1, 6, "MediaPlayerWrapper", "The video failed to seek:" + e.getMessage());
        }
    }

    public final boolean a(boolean z) {
        try {
            if (z) {
                this.f13273a.setVolume(0.0f, 0.0f);
            } else {
                this.f13273a.setVolume(1.0f, 1.0f);
            }
        } catch (IllegalStateException e) {
            f fVar = this.d;
            if (fVar != null) {
                ((n) fVar).a(14, this.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a(1, 6, "MediaPlayerWrapper", "The video failed to set volume: " + e.getMessage());
        }
        return z;
    }

    public final void a(Surface surface) {
        try {
            this.b = surface;
            this.f13273a.setSurface(surface);
            this.g = true;
        } catch (Exception e) {
            f fVar = this.d;
            if (fVar != null) {
                n nVar = (n) fVar;
                nVar.a(12, this.l, Log.getStackTraceString(e));
            }
            a(12);
            AbstractC5496a.a("MediaPlayerWrapper", "setSurface IllegalStateException");
        }
    }
}

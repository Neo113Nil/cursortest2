package sg.bigo.ads.r1;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.HashMap;
import java.util.Objects;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.P;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class n extends q implements f {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public final boolean G;
    public long H;
    public final String I;
    public final String J;
    public boolean K;
    public boolean L;
    public final View M;
    public b N;
    public int O;
    public int k;
    public int l;
    public final r m;
    public AdImageView n;
    public String o;
    public ProgressBar p;
    public View q;
    public g r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final long x;
    public l y;
    public final m z;

    public n(Context context, int i, int i2, sg.bigo.ads.R.b bVar, sg.bigo.ads.U0.k kVar) {
        super(context, bVar, kVar);
        InterfaceC5087a interfaceC5087a;
        sg.bigo.ads.z1.a aVar;
        this.r = new g();
        this.s = 0;
        this.t = 0;
        this.u = true;
        this.A = false;
        this.B = true;
        this.C = false;
        this.E = false;
        this.H = 0L;
        this.I = "";
        this.J = "";
        this.K = true;
        this.L = false;
        k kVar2 = new k(this);
        this.O = 0;
        this.J = kVar != null ? kVar.e() : "";
        if (kVar != null && (aVar = kVar.M0) != null) {
            this.I = aVar.b;
        }
        k();
        long j = bVar.d;
        this.x = j;
        this.v = false;
        this.k = i;
        this.l = i2;
        int i3 = bVar.f12516a;
        this.w = bVar.b;
        r rVar = new r(this.b, i, i2, i3);
        this.m = rVar;
        X.a(rVar, this, null, -1);
        rVar.setSurfaceTextureListener(kVar2);
        sg.bigo.ads.P.c cVar = this.d;
        if (cVar != null && ((sg.bigo.ads.U0.b) cVar).l != 2 && j > 0) {
            AbstractC5446j.a(this.z);
            if (this.z == null) {
                this.z = new m(this);
            }
            AbstractC5446j.a(2, null, this.z, j);
        }
        if (!bVar.e && (interfaceC5087a = this.d) != null && !TextUtils.isEmpty(((sg.bigo.ads.U0.k) interfaceC5087a).j())) {
            a(sg.bigo.ads.U.q.a(((sg.bigo.ads.U0.k) this.d).j(), getContext().getApplicationContext()));
        }
        boolean a2 = this.r.a(false);
        this.u = a2;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageDrawable(AbstractC4944a.c(this.b, a2 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        InterfaceC5087a interfaceC5087a2 = this.d;
        boolean z = interfaceC5087a2 != null && ((sg.bigo.ads.U0.k) interfaceC5087a2).n();
        this.G = z;
        if (z) {
            h();
        }
        ImageView imageView2 = this.g;
        if (imageView2 != null) {
            imageView2.setVisibility(this.v ? 0 : 8);
        }
        this.r.d = this;
        a(0);
    }

    public final void a(int i, int i2) {
        if (i == 100) {
            this.r.c();
            this.r = new g();
        }
        AbstractC5496a.a(2, 6, "VideoPlayView", "An error occurred during the video playback: " + i);
        a("AdError", new int[]{i, i2});
        if (i != -38) {
            AbstractC5496a.a("VideoPlayView", "onError code = " + i + ", now reset status and init again.Range=" + this.s);
            if (this.r.b() == 0) {
                g gVar = this.r;
                if (gVar.l < 3) {
                    gVar.a(15);
                    return;
                }
                return;
            }
            return;
        }
        AbstractC5496a.a("VideoPlayView", "onError code = -38, now reset status and init again.Range=" + this.s);
        g gVar2 = this.r;
        String str = this.o;
        gVar2.getClass();
        if (I.a((CharSequence) str)) {
            AbstractC5496a.a("MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            gVar2.c = str;
            AbstractC5446j.a(1, new d(gVar2, str));
        }
    }

    @Override // sg.bigo.ads.r1.a
    public final boolean b() {
        return this.u;
    }

    @Override // sg.bigo.ads.r1.a
    public final void c() {
        if (this.i || this.v) {
            a(false);
        } else {
            b(false);
        }
    }

    @Override // sg.bigo.ads.r1.q
    public final boolean d() {
        return this.r.f;
    }

    @Override // sg.bigo.ads.r1.a
    public final void destroy() {
        a(false);
        g();
        setOnEventListener(null);
        this.p = null;
        AbstractC5446j.a(this.y);
    }

    @Override // sg.bigo.ads.r1.q
    public final void e() {
        if (this.G && this.C) {
            return;
        }
        f();
    }

    public final void g() {
        this.r.j.set(true);
        g gVar = this.r;
        gVar.getClass();
        try {
            gVar.f13273a.stop();
            AbstractC5446j.a(gVar.h);
            gVar.e = 4;
        } catch (IllegalStateException e) {
            f fVar = gVar.d;
            if (fVar != null) {
                ((n) fVar).a(6, gVar.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a(1, 6, "MediaPlayerWrapper", "Failed to stop video: " + e.getMessage());
        }
        this.r.c();
    }

    @Override // sg.bigo.ads.r1.q
    public int getAdDuration() {
        g gVar = this.r;
        gVar.getClass();
        int i = 0;
        try {
            if (gVar.f) {
                i = gVar.f13273a.getDuration();
            } else {
                AbstractC5496a.a("MediaPlayerWrapper", "getDuration failed，not initialize or release already");
            }
        } catch (IllegalStateException e) {
            f fVar = gVar.d;
            if (fVar != null) {
                n nVar = (n) fVar;
                nVar.a(8, gVar.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a("MediaPlayerWrapper", "getDuration IllegalStateException");
        }
        return i;
    }

    @Override // sg.bigo.ads.r1.q
    public int getAdRemainingTime() {
        return this.r.b();
    }

    public ImageView getCoverView() {
        return this.n;
    }

    public int getCurrentPos() {
        return this.s;
    }

    @Override // sg.bigo.ads.r1.q
    public int getPlayStatus() {
        return this.r.e;
    }

    public final void h() {
        Context context = getContext();
        ProgressBar progressBar = new ProgressBar(context);
        this.p = progressBar;
        progressBar.setBackgroundColor(AbstractC4944a.a(context, android.R.color.transparent));
        P.a(context, this.p, R.drawable.bigo_ad_progressbar_white);
        this.p.setVisibility(8);
        X.a(this.p, this, new FrameLayout.LayoutParams(-2, -2, 17), -1);
    }

    public final void i() {
        r rVar;
        InterfaceC5087a interfaceC5087a;
        Pair pair;
        if (this.d == null || (rVar = this.m) == null || !rVar.isAvailable() || this.L || (interfaceC5087a = this.d) == null) {
            return;
        }
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
        if (!kVar.e1 || (pair = kVar.V0) == null || kVar.O0) {
            return;
        }
        Bitmap bitmap = (Bitmap) pair.first;
        this.L = true;
        if (this.q == null) {
            this.q = AbstractC4944a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.q;
        if (view != null) {
            view.setVisibility(8);
        }
        a(bitmap);
        g gVar = this.r;
        a("AdBackupImgReady", new int[]{(gVar == null || TextUtils.isEmpty(gVar.c)) ? 0 : 1});
    }

    public final void j() {
        r rVar;
        if (this.d == null || (rVar = this.m) == null || this.L || !rVar.isAvailable()) {
            return;
        }
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) this.d;
        if (kVar.O0) {
            return;
        }
        this.L = true;
        kVar.a(getContext());
        g gVar = this.r;
        String a2 = ((sg.bigo.ads.U0.k) this.d).a(getContext().getApplicationContext());
        gVar.getClass();
        if (I.a((CharSequence) a2)) {
            AbstractC5496a.a("MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            gVar.c = a2;
            AbstractC5446j.a(1, new d(gVar, a2));
        }
    }

    public final void k() {
        int i;
        InterfaceC5087a interfaceC5087a = this.d;
        if (interfaceC5087a == null) {
            return;
        }
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
        Pair pair = kVar.V0;
        if (kVar.W0) {
            i = 0;
        } else if (pair == null) {
            i = 5;
        } else if (Objects.equals(pair.second, this.I)) {
            interfaceC5087a = this.d;
            i = 1;
        } else {
            if (!Objects.equals(pair.second, this.J)) {
                return;
            }
            interfaceC5087a = this.d;
            i = 2;
        }
        ((sg.bigo.ads.U0.k) interfaceC5087a).T0 = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        this.p = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a(i == 0);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        View view = this.M;
        if (view != null) {
            if (i == 0) {
                X.c(view);
                X.a(this.m, this, null, 0);
            } else {
                X.c(this.m);
                X.a(this.M, this, new FrameLayout.LayoutParams(this.k, this.l), 0);
            }
        }
    }

    public void setIVideoPlayerViewListener(b bVar) {
        this.N = bVar;
    }

    @Override // sg.bigo.ads.r1.q
    public void setMute(boolean z) {
        if (this.u == z) {
            this.B = false;
            return;
        }
        boolean a2 = this.r.a(z);
        this.u = a2;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageDrawable(AbstractC4944a.c(this.b, a2 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        if (this.B) {
            this.B = false;
        } else {
            a("AdVolumeChange", new int[]{this.u ? 0 : 100});
        }
    }

    public void setSeekPos(int i) {
        this.t = i;
    }

    @Override // sg.bigo.ads.r1.q
    public void setStatPrepareEventOnce(boolean z) {
        this.K = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    @Override // sg.bigo.ads.r1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        AdImageView adImageView;
        this.i = false;
        if (!this.r.f) {
            AbstractC5496a.b("VideoPlayView", "incorrect status, the player is not prepared".concat(z ? " wating to play" : ", start ad failed"));
            this.A = z;
            int i = this.O;
            if (i < 8) {
                int i2 = i + 1;
                this.O = i2;
                if (i2 == 8) {
                    sg.bigo.ads.s1.b.a(3003, 10107, "Not prepared, src path = " + this.o, this.d);
                    return;
                }
                return;
            }
            return;
        }
        if (!sg.bigo.ads.I0.f.j(getContext().getApplicationContext())) {
            AbstractC5496a.b("VideoPlayView", "screen is off, start ad cancel");
            return;
        }
        g gVar = this.r;
        gVar.getClass();
        try {
        } catch (IllegalStateException e) {
            f fVar = gVar.d;
            if (fVar != null) {
                ((n) fVar).a(3, gVar.l, Log.getStackTraceString(e));
            }
            AbstractC5496a.a(1, 6, "MediaPlayerWrapper", "Failed to play video: " + e.getMessage());
        }
        if (gVar.f && gVar.g) {
            if (!gVar.f13273a.isPlaying()) {
                gVar.f13273a.start();
                if (!gVar.i) {
                    gVar.i = true;
                    f fVar2 = gVar.d;
                    if (fVar2 != null) {
                        ((n) fVar2).a("AdVideoStart", (int[]) null);
                    }
                }
                gVar.e = 2;
                AbstractC5446j.a(gVar.h);
                AbstractC5446j.a(2, null, gVar.h, 0L);
                f fVar3 = gVar.d;
                if (fVar3 != null) {
                    n nVar = (n) fVar3;
                    nVar.v = false;
                    int i3 = nVar.t;
                    if (i3 > 0) {
                        nVar.r.b(i3);
                        nVar.t = -1;
                    }
                    nVar.a("AdVideoPlaying", (int[]) null);
                }
            }
            this.F = getAdDuration();
            InterfaceC5087a interfaceC5087a = this.d;
            if (interfaceC5087a != null) {
                ((sg.bigo.ads.U0.k) interfaceC5087a).T0 = 0;
            }
            adImageView = this.n;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            this.g.setVisibility(8);
            a(true);
        }
        AbstractC5496a.b("MediaPlayerWrapper", "Surface is not available or player unprepared, do start play cancel");
        adImageView = this.n;
        if (adImageView != null) {
        }
        this.g.setVisibility(8);
        a(true);
    }

    public final void a(int i, int i2, String str) {
        InterfaceC5087a interfaceC5087a = this.d;
        String k = interfaceC5087a != null ? ((sg.bigo.ads.U0.k) interfaceC5087a).k() : "";
        HashMap hashMap = interfaceC5087a == null ? new HashMap() : sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("rslt", "0");
        hashMap.put("video_url", k);
        hashMap.put("retry", String.valueOf(i2));
        hashMap.put("media_player_status", String.valueOf(i));
        hashMap.put("error", str);
        sg.bigo.ads.s1.b.a("06002054", hashMap);
    }

    public final void a(MediaPlayer mediaPlayer, int i) {
        AbstractC5446j.a(this.y);
        if (this.p == null) {
            h();
        }
        this.p.setVisibility(8);
        if (this.q == null) {
            this.q = AbstractC4944a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.q;
        if (view != null) {
            view.setVisibility(8);
        }
        boolean z = this.k == 0 && this.l == 0;
        this.k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.l = videoHeight;
        if (this.L || (z && this.k > 0 && videoHeight > 0)) {
            r rVar = this.m;
            rVar.f13282a = this.k;
            rVar.b = videoHeight;
            rVar.requestLayout();
        }
        new HashMap();
        if (this.H > 0) {
            a(10, i, SystemClock.elapsedRealtime() - this.H);
            this.H = 0L;
        }
        if (this.K) {
            a(18);
        }
        if (this.A || this.x > 0) {
            this.A = false;
            c();
        } else {
            if (this.i || this.v) {
                return;
            }
            a(true);
        }
    }

    @Override // sg.bigo.ads.R.a
    public final void a() {
        g gVar = this.r;
        if (gVar.f) {
            try {
                gVar.f13273a.pause();
                AbstractC5446j.a(gVar.h);
                gVar.e = 3;
                f fVar = gVar.d;
                if (fVar != null) {
                    ((n) fVar).a("AdVideoPaused", (int[]) null);
                }
                this.A = false;
                if (this.G) {
                    if (this.p == null) {
                        h();
                    }
                    this.p.setVisibility(8);
                }
                this.E = false;
            } catch (IllegalStateException e) {
                f fVar2 = gVar.d;
                if (fVar2 != null) {
                    ((n) fVar2).a(4, gVar.l, Log.getStackTraceString(e));
                }
                AbstractC5496a.a(1, 6, "MediaPlayerWrapper", "Failed to pause video: " + e.getMessage());
            }
        }
    }

    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        if (this.n == null) {
            AdImageView adImageView = new AdImageView(this.b);
            this.n = adImageView;
            adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        X.a(this.n, this, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        boolean z = false;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.n.setVisibility(0);
            AdImageView adImageView2 = this.n;
            sg.bigo.ads.P.c cVar = this.d;
            if (cVar != null && ((sg.bigo.ads.U0.b) cVar).T) {
                z = true;
            }
            adImageView2.a(str, z);
            return;
        }
        if (obj instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj;
            this.n.setVisibility(0);
            this.n.setImageBitmap(bitmap);
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.m.f13282a = bitmap.getWidth();
            this.m.b = bitmap.getHeight();
            this.m.requestLayout();
        }
    }

    public final void a(int i, int i2, long j) {
        HashMap a2;
        InterfaceC5087a interfaceC5087a = this.d;
        String k = interfaceC5087a != null ? ((sg.bigo.ads.U0.k) interfaceC5087a).k() : "";
        if (interfaceC5087a == null) {
            a2 = new HashMap();
        } else {
            a2 = sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
        }
        a2.put("rslt", "1");
        a2.put("video_url", k);
        a2.put("retry", String.valueOf(i2));
        a2.put("media_player_status", String.valueOf(i));
        a2.put("cost", String.valueOf(j));
        sg.bigo.ads.s1.b.a("06002054", a2);
    }
}

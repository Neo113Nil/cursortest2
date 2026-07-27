package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes6.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f9078a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private SurfaceHolder g;
    protected float h;
    protected float i;
    protected int j;
    private boolean k;
    private MediaEvents l;
    private String m;
    private int n;
    private AudioManager o;
    private AudioManager.OnAudioFocusChangeListener p;
    private boolean q;
    private boolean r;
    private boolean s;
    private AspectRatioFrameLayout t;
    private boolean u;
    private final com.mbridge.msdk.config.dynamic.baseview.video.c v;

    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            CusPlayerView.this.a(i);
        }
    }

    class b implements com.mbridge.msdk.config.dynamic.baseview.video.c {
        b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void a(float f) {
            if (CusPlayerView.this.t != null) {
                CusPlayerView.this.t.setAspectRatio(f);
                if (CusPlayerView.this.t.getVisibility() != 0) {
                    CusPlayerView.this.t.setVisibility(0);
                }
            }
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void onRenderedFirstFrame() {
        }
    }

    private class c implements SurfaceHolder.Callback {
        private c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f9078a != null && surfaceHolder != null && CusPlayerView.this.g != surfaceHolder) {
                    CusPlayerView.this.g = surfaceHolder;
                    CusPlayerView.this.f9078a.a(surfaceHolder);
                    if (CusPlayerView.this.u) {
                        CusPlayerView.this.f9078a.n();
                    }
                }
                CusPlayerView.this.d = false;
            } catch (Exception e) {
                q0.b("PlayerView", e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f9078a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.g = surfaceHolder;
                CusPlayerView.this.f9078a.a(surfaceHolder);
            } catch (Exception e) {
                q0.b("PlayerView", e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.d = true;
                CusPlayerView.this.f = true;
                CusPlayerView.this.f9078a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e) {
                q0.b("PlayerView", e.getMessage());
            }
        }

        /* synthetic */ c(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.j = 1;
        this.k = false;
        this.m = "";
        this.n = 1;
        this.q = false;
        this.r = false;
        this.s = true;
        this.u = false;
        this.v = new b();
        b();
    }

    private boolean e() {
        int i;
        try {
            if (this.o == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z = true;
            if (this.r) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i = 1;
            }
            if (this.o.requestAudioFocus(this.p, 3, i) != 1) {
                z = false;
            }
            this.q = z;
            return z;
        } catch (Exception e) {
            q0.b("PlayerView", "Error requesting audio focus: " + e.getMessage());
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f9078a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f9078a.f() && !this.f) {
                    start(true);
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public int getCurPosition() {
        long j;
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar;
        try {
            bVar = this.f9078a;
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
        if (bVar != null) {
            j = bVar.c();
            return Math.toIntExact(j);
        }
        j = 0;
        return Math.toIntExact(j);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.m;
    }

    public MediaEvents getVideoEvents() {
        return this.l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            bVar.b(i);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.b = str;
        this.f9078a.a(aVar);
        this.f9078a.c(this.b);
        this.c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                return bVar.g();
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.r;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.s;
    }

    public boolean isSilent() {
        return this.f9078a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getRawX();
        this.i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f9078a != null && !this.d && !isComplete() && !this.e) {
                q0.c("PlayerView", "onresume========");
                if (this.f9078a.f()) {
                    resumeStart();
                } else {
                    playVideo(0);
                }
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                bVar.m();
            }
            this.u = false;
            pauseOmsdk();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.l == null || this.k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.k = true;
            this.l.pause();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean playVideo(int i) {
        try {
            if (this.f9078a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f9078a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.s) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f9078a.j();
                }
            }
            this.f9078a.a(i);
            this.u = true;
            this.f = false;
            return true;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.l != null) {
                this.l = null;
            }
            a();
            if (this.g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.g.getSurface().release();
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.l;
            if (mediaEvents != null) {
                this.k = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f9078a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void seekTo(int i) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                bVar.a(i);
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z) {
        try {
            this.e = z;
            q0.b("PlayerView", "mIsCovered:" + z);
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i) {
        this.r = i == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z) {
        this.s = z;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z);
    }

    public void setPlaybackParams(float f) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            bVar.a(f);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.l = mediaEvents;
    }

    public void setVideoGravity(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.t;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i);
        }
    }

    public void setVolume(float f, float f2) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
        if (bVar != null) {
            bVar.a(f, f2);
        }
    }

    public void start(boolean z) {
        try {
            if (this.f9078a != null) {
                this.u = true;
                if (z) {
                    if (e()) {
                        this.f9078a.t();
                    } else {
                        this.f9078a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
                if (bVar == null || this.e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void stop() {
        try {
            this.u = false;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.l != null) {
                this.l = null;
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    private void c() {
        try {
            this.o = (AudioManager) getContext().getSystemService("audio");
            this.p = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e.getMessage());
        }
    }

    private void d() {
        this.t = new AspectRatioFrameLayout(getContext());
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.g = holder;
        holder.setKeepScreenOn(true);
        this.g.addCallback(new c(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f9078a = bVar;
        bVar.a(getContext(), this.g);
        this.f9078a.a(this.v);
        this.t.addView(surfaceView, -1, -1);
        setGravity(17);
        this.t.setVisibility(4);
        addView(this.t, -1, -1);
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        try {
            if (i == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f9078a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                }
            } else if (i == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f9078a;
                if (bVar2 != null && bVar2.h()) {
                    this.f9078a.m();
                }
            } else if (i == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f9078a;
                if (bVar3 != null && bVar3.h()) {
                    this.f9078a.m();
                }
            } else {
                if (i != 1) {
                    return;
                }
                q0.c("PlayerView", "Audio focus gained");
                this.q = true;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f9078a;
                if (bVar4 != null) {
                    bVar4.a(1.0f, 1.0f);
                    if (!this.f9078a.h()) {
                        this.f9078a.n();
                    }
                }
            }
        } catch (Exception e) {
            q0.b("PlayerView", "Error handling audio focus change: " + e.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    private void a() {
        try {
            AudioManager audioManager = this.o;
            if (audioManager == null || !this.q) {
                return;
            }
            int abandonAudioFocus = audioManager.abandonAudioFocus(this.p);
            this.q = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + abandonAudioFocus);
        } catch (Exception e) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e.getMessage());
        }
    }
}

package L3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import m3.N;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final C3568h f16455a = new C3568h();

    /* renamed from: b, reason: collision with root package name */
    private final a f16456b;

    /* renamed from: c, reason: collision with root package name */
    private final b f16457c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16458d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f16459e;

    /* renamed from: f, reason: collision with root package name */
    private float f16460f;

    /* renamed from: g, reason: collision with root package name */
    private float f16461g;

    /* renamed from: h, reason: collision with root package name */
    private float f16462h;

    /* renamed from: i, reason: collision with root package name */
    private float f16463i;

    /* renamed from: j, reason: collision with root package name */
    private int f16464j;

    /* renamed from: k, reason: collision with root package name */
    private long f16465k;

    /* renamed from: l, reason: collision with root package name */
    private long f16466l;

    /* renamed from: m, reason: collision with root package name */
    private long f16467m;

    /* renamed from: n, reason: collision with root package name */
    private long f16468n;

    /* renamed from: o, reason: collision with root package name */
    private long f16469o;

    /* renamed from: p, reason: collision with root package name */
    private long f16470p;

    /* renamed from: q, reason: collision with root package name */
    private long f16471q;

    private final class a implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f16472a;

        public a(DisplayManager displayManager) {
            this.f16472a = displayManager;
        }

        public final void a() {
            Handler p11 = N.p(null);
            DisplayManager displayManager = this.f16472a;
            displayManager.registerDisplayListener(this, p11);
            y.a(y.this, displayManager.getDisplay(0));
        }

        public final void b() {
            this.f16472a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i11) {
            if (i11 == 0) {
                y.a(y.this, this.f16472a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i11) {
        }
    }

    private static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e, reason: collision with root package name */
        private static final b f16474e = new b();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f16475a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f16476b;

        /* renamed from: c, reason: collision with root package name */
        private Choreographer f16477c;

        /* renamed from: d, reason: collision with root package name */
        private int f16478d;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i11 = N.f74289a;
            Handler handler = new Handler(looper, this);
            this.f16476b = handler;
            handler.sendEmptyMessage(1);
        }

        public static b b() {
            return f16474e;
        }

        public final void a() {
            this.f16476b.sendEmptyMessage(2);
        }

        public final void c() {
            this.f16476b.sendEmptyMessage(3);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            this.f16475a = j11;
            Choreographer choreographer = this.f16477c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    this.f16477c = Choreographer.getInstance();
                } catch (RuntimeException e11) {
                    m3.s.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e11);
                }
                return true;
            }
            if (i11 == 2) {
                Choreographer choreographer = this.f16477c;
                if (choreographer != null) {
                    int i12 = this.f16478d + 1;
                    this.f16478d = i12;
                    if (i12 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i11 != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f16477c;
            if (choreographer2 != null) {
                int i13 = this.f16478d - 1;
                this.f16478d = i13;
                if (i13 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f16475a = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public y(Context context) {
        DisplayManager displayManager;
        a aVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new a(displayManager);
        this.f16456b = aVar;
        this.f16457c = aVar != null ? b.b() : null;
        this.f16465k = -9223372036854775807L;
        this.f16466l = -9223372036854775807L;
        this.f16460f = -1.0f;
        this.f16463i = 1.0f;
        this.f16464j = 0;
    }

    static void a(y yVar, Display display) {
        yVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            yVar.f16465k = refreshRate;
            yVar.f16466l = (refreshRate * 80) / 100;
        } else {
            m3.s.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            yVar.f16465k = -9223372036854775807L;
            yVar.f16466l = -9223372036854775807L;
        }
    }

    private void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f16459e) == null || this.f16464j == Integer.MIN_VALUE || this.f16462h == 0.0f) {
            return;
        }
        this.f16462h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e11) {
            m3.s.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT < 30 || this.f16459e == null) {
            return;
        }
        C3568h c3568h = this.f16455a;
        float b11 = c3568h.e() ? c3568h.b() : this.f16460f;
        float f7 = this.f16461g;
        if (b11 == f7) {
            return;
        }
        if (b11 != -1.0f && f7 != -1.0f) {
            if (Math.abs(b11 - this.f16461g) < ((!c3568h.e() || c3568h.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b11 == -1.0f && c3568h.c() < 30) {
            return;
        }
        this.f16461g = b11;
        m(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m(boolean z11) {
        Surface surface;
        float f7;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f16459e) == null || this.f16464j == Integer.MIN_VALUE) {
            return;
        }
        try {
            if (this.f16458d) {
                float f11 = this.f16461g;
                if (f11 != -1.0f) {
                    f7 = f11 * this.f16463i;
                    if (z11 && this.f16462h == f7) {
                        return;
                    }
                    this.f16462h = f7;
                    surface.setFrameRate(f7, f7 != 0.0f ? 0 : 1);
                    return;
                }
            }
            surface.setFrameRate(f7, f7 != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e11) {
            m3.s.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
            return;
        }
        f7 = 0.0f;
        if (z11) {
        }
        this.f16462h = f7;
    }

    public final long b(long j11) {
        long j12;
        if (this.f16470p != -1 && this.f16455a.e()) {
            long a11 = this.f16471q + ((long) (((this.f16467m - this.f16470p) * this.f16455a.a()) / this.f16463i));
            if (Math.abs(j11 - a11) <= 20000000) {
                j11 = a11;
            } else {
                this.f16467m = 0L;
                this.f16470p = -1L;
                this.f16468n = -1L;
            }
        }
        this.f16468n = this.f16467m;
        this.f16469o = j11;
        b bVar = this.f16457c;
        if (bVar != null && this.f16465k != -9223372036854775807L) {
            long j13 = bVar.f16475a;
            if (j13 != -9223372036854775807L) {
                long j14 = this.f16465k;
                long j15 = (((j11 - j13) / j14) * j14) + j13;
                if (j11 <= j15) {
                    j12 = j15 - j14;
                } else {
                    j12 = j15;
                    j15 = j14 + j15;
                }
                if (j15 - j11 >= j11 - j12) {
                    j15 = j12;
                }
                return j15 - this.f16466l;
            }
        }
        return j11;
    }

    public final void d(float f7) {
        this.f16460f = f7;
        this.f16455a.g();
        l();
    }

    public final void e(long j11) {
        long j12 = this.f16468n;
        if (j12 != -1) {
            this.f16470p = j12;
            this.f16471q = this.f16469o;
        }
        this.f16467m++;
        this.f16455a.f(j11 * 1000);
        l();
    }

    public final void f(float f7) {
        this.f16463i = f7;
        this.f16467m = 0L;
        this.f16470p = -1L;
        this.f16468n = -1L;
        m(false);
    }

    public final void g() {
        this.f16467m = 0L;
        this.f16470p = -1L;
        this.f16468n = -1L;
    }

    public final void h() {
        this.f16458d = true;
        this.f16467m = 0L;
        this.f16470p = -1L;
        this.f16468n = -1L;
        a aVar = this.f16456b;
        if (aVar != null) {
            b bVar = this.f16457c;
            bVar.getClass();
            bVar.a();
            aVar.a();
        }
        m(false);
    }

    public final void i() {
        this.f16458d = false;
        a aVar = this.f16456b;
        if (aVar != null) {
            aVar.b();
            b bVar = this.f16457c;
            bVar.getClass();
            bVar.c();
        }
        c();
    }

    public final void j(Surface surface) {
        if (this.f16459e == surface) {
            return;
        }
        c();
        this.f16459e = surface;
        m(true);
    }

    public final void k(int i11) {
        if (this.f16464j == i11) {
            return;
        }
        this.f16464j = i11;
        m(true);
    }
}

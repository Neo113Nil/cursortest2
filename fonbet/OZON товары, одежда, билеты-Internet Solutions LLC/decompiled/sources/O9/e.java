package O9;

import E.b0;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20076n = 0;

    /* renamed from: a, reason: collision with root package name */
    private i f20077a;

    /* renamed from: b, reason: collision with root package name */
    private h f20078b;

    /* renamed from: c, reason: collision with root package name */
    private f f20079c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f20080d;

    /* renamed from: e, reason: collision with root package name */
    private k f20081e;

    /* renamed from: h, reason: collision with root package name */
    private Handler f20084h;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20082f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20083g = true;

    /* renamed from: i, reason: collision with root package name */
    private g f20085i = new g();

    /* renamed from: j, reason: collision with root package name */
    private Runnable f20086j = new a();

    /* renamed from: k, reason: collision with root package name */
    private Runnable f20087k = new b();

    /* renamed from: l, reason: collision with root package name */
    private Runnable f20088l = new c();

    /* renamed from: m, reason: collision with root package name */
    private Runnable f20089m = new d();

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            try {
                Log.d("e", "Opening camera");
                eVar.f20079c.g();
            } catch (Exception e11) {
                e.e(eVar, e11);
                Log.e("e", "Failed to open camera", e11);
            }
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            try {
                Log.d("e", "Configuring camera");
                eVar.f20079c.d();
                if (eVar.f20080d != null) {
                    eVar.f20080d.obtainMessage(R.id.zxing_prewiew_size_ready, e.g(eVar)).sendToTarget();
                }
            } catch (Exception e11) {
                e.e(eVar, e11);
                Log.e("e", "Failed to configure camera", e11);
            }
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            try {
                Log.d("e", "Starting preview");
                eVar.f20079c.l(eVar.f20078b);
                eVar.f20079c.n();
            } catch (Exception e11) {
                e.e(eVar, e11);
                Log.e("e", "Failed to start preview", e11);
            }
        }
    }

    final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            try {
                Log.d("e", "Closing camera");
                eVar.f20079c.o();
                eVar.f20079c.c();
            } catch (Exception e11) {
                Log.e("e", "Failed to close camera", e11);
            }
            eVar.f20083g = true;
            eVar.f20080d.sendEmptyMessage(R.id.zxing_camera_closed);
            eVar.f20077a.b();
        }
    }

    public e(Context context) {
        N9.o.d();
        this.f20077a = i.d();
        f fVar = new f(context);
        this.f20079c = fVar;
        fVar.i(this.f20085i);
        this.f20084h = new Handler();
    }

    public static /* synthetic */ void c(e eVar, n nVar) {
        if (!eVar.f20082f) {
            Log.d("e", "Camera is closed, not requesting preview");
        } else {
            eVar.f20077a.c(new O9.d(0, eVar, nVar));
        }
    }

    static void e(e eVar, Exception exc) {
        Handler handler = eVar.f20080d;
        if (handler != null) {
            handler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }

    static N9.m g(e eVar) {
        return eVar.f20079c.f();
    }

    public final void k() {
        N9.o.d();
        if (this.f20082f) {
            this.f20077a.c(this.f20089m);
        } else {
            this.f20083g = true;
        }
        this.f20082f = false;
    }

    public final void l() {
        N9.o.d();
        if (!this.f20082f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
        this.f20077a.c(this.f20087k);
    }

    public final k m() {
        return this.f20081e;
    }

    public final boolean n() {
        return this.f20083g;
    }

    public final void o() {
        N9.o.d();
        this.f20082f = true;
        this.f20083g = false;
        this.f20077a.e(this.f20086j);
    }

    public final void p(n nVar) {
        this.f20084h.post(new b0(2, this, nVar));
    }

    public final void q(g gVar) {
        if (this.f20082f) {
            return;
        }
        this.f20085i = gVar;
        this.f20079c.i(gVar);
    }

    public final void r(k kVar) {
        this.f20081e = kVar;
        this.f20079c.k(kVar);
    }

    public final void s(Handler handler) {
        this.f20080d = handler;
    }

    public final void t(h hVar) {
        this.f20078b = hVar;
    }

    public final void u(boolean z11) {
        N9.o.d();
        if (this.f20082f) {
            this.f20077a.c(new KD.j(z11, 1, this));
        }
    }

    public final void v() {
        N9.o.d();
        if (!this.f20082f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
        this.f20077a.c(this.f20088l);
    }
}

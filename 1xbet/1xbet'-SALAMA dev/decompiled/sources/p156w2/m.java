package p156w2;

import A1.x0;
import R5.C0418n;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f18030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f18031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f18032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f18034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18038i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f18044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f18045q;

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    public m(Context context) {
        k c0418n;
        DisplayManager displayManager;
        d dVar = new d();
        dVar.f17975a = new c();
        dVar.f17976b = new c();
        dVar.f17978d = -9223372036854775807L;
        this.f18030a = dVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            c0418n = (t.f17159a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new C0418n(displayManager);
            if (c0418n == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    c0418n = new x0(windowManager, 22);
                } else {
                    c0418n = null;
                }
            }
        } else {
            c0418n = null;
        }
        this.f18031b = c0418n;
        this.f18032c = c0418n != null ? l.f18025e : null;
        this.f18039k = -9223372036854775807L;
        this.f18040l = -9223372036854775807L;
        this.f18035f = -1.0f;
        this.f18038i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (t.f17159a < 30 || (surface = this.f18034e) == null || this.j == Integer.MIN_VALUE || this.f18037h == 0.0f) {
            return;
        }
        this.f18037h = 0.0f;
        j.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void b() {
        float f7;
        float f8;
        if (t.f17159a < 30 || this.f18034e == null) {
            return;
        }
        d dVar = this.f18030a;
        if (!dVar.f17975a.a()) {
            f7 = this.f18035f;
        } else if (dVar.f17975a.a()) {
            c cVar = dVar.f17975a;
            long j = cVar.f17971e;
            f7 = (float) (1.0E9d / (j != 0 ? cVar.f17972f / j : 0L));
        } else {
            f7 = -1.0f;
        }
        float f9 = this.f18036g;
        if (f7 == f9) {
            return;
        }
        if (f7 != -1.0f && f9 != -1.0f) {
            if (dVar.f17975a.a()) {
                if ((dVar.f17975a.a() ? dVar.f17975a.f17972f : -9223372036854775807L) >= 5000000000L) {
                    f8 = 0.02f;
                } else {
                    f8 = 1.0f;
                }
            } else {
                f8 = 1.0f;
            }
            if (Math.abs(f7 - this.f18036g) < f8) {
                return;
            }
        } else if (f7 == -1.0f && dVar.f17979e < 30) {
            return;
        }
        this.f18036g = f7;
        c(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void c(boolean z4) {
        Surface surface;
        float f7;
        if (t.f17159a < 30 || (surface = this.f18034e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f18033d) {
            float f8 = this.f18036g;
            if (f8 != -1.0f) {
                f7 = f8 * this.f18038i;
            } else {
                f7 = 0.0f;
            }
        } else {
            f7 = 0.0f;
        }
        if (z4 || this.f18037h != f7) {
            this.f18037h = f7;
            j.a(surface, f7);
        }
    }
}

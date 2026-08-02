package w2;

import A1.x0;
import R5.C0418n;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import v2.t;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C1769d f18024a;

    /* renamed from: b, reason: collision with root package name */
    public final k f18025b;

    /* renamed from: c, reason: collision with root package name */
    public final l f18026c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18027d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f18028e;

    /* renamed from: f, reason: collision with root package name */
    public float f18029f;

    /* renamed from: g, reason: collision with root package name */
    public float f18030g;

    /* renamed from: h, reason: collision with root package name */
    public float f18031h;

    /* renamed from: i, reason: collision with root package name */
    public float f18032i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f18033k;

    /* renamed from: l, reason: collision with root package name */
    public long f18034l;

    /* renamed from: m, reason: collision with root package name */
    public long f18035m;

    /* renamed from: n, reason: collision with root package name */
    public long f18036n;

    /* renamed from: o, reason: collision with root package name */
    public long f18037o;

    /* renamed from: p, reason: collision with root package name */
    public long f18038p;

    /* renamed from: q, reason: collision with root package name */
    public long f18039q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Context context) {
        k kVar;
        DisplayManager displayManager;
        C1769d c1769d = new C1769d();
        c1769d.f17969a = new C1768c();
        c1769d.f17970b = new C1768c();
        c1769d.f17972d = -9223372036854775807L;
        this.f18024a = c1769d;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            kVar = (t.f17153a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new C0418n(displayManager);
            if (kVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    kVar = new x0(windowManager, 22);
                }
            }
            this.f18025b = kVar;
            this.f18026c = kVar != null ? l.f18019e : null;
            this.f18033k = -9223372036854775807L;
            this.f18034l = -9223372036854775807L;
            this.f18029f = -1.0f;
            this.f18032i = 1.0f;
            this.j = 0;
        }
        kVar = null;
        this.f18025b = kVar;
        this.f18026c = kVar != null ? l.f18019e : null;
        this.f18033k = -9223372036854775807L;
        this.f18034l = -9223372036854775807L;
        this.f18029f = -1.0f;
        this.f18032i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (t.f17153a < 30 || (surface = this.f18028e) == null || this.j == Integer.MIN_VALUE || this.f18031h == 0.0f) {
            return;
        }
        this.f18031h = 0.0f;
        j.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f7;
        float f8;
        if (t.f17153a < 30 || this.f18028e == null) {
            return;
        }
        C1769d c1769d = this.f18024a;
        if (!c1769d.f17969a.a()) {
            f7 = this.f18029f;
        } else if (c1769d.f17969a.a()) {
            f7 = (float) (1.0E9d / (c1769d.f17969a.f17965e != 0 ? r2.f17966f / r4 : 0L));
        } else {
            f7 = -1.0f;
        }
        float f9 = this.f18030g;
        if (f7 == f9) {
            return;
        }
        if (f7 != -1.0f && f9 != -1.0f) {
            if (c1769d.f17969a.a()) {
                if ((c1769d.f17969a.a() ? c1769d.f17969a.f17966f : -9223372036854775807L) >= 5000000000L) {
                    f8 = 0.02f;
                    if (Math.abs(f7 - this.f18030g) < f8) {
                        return;
                    }
                }
            }
            f8 = 1.0f;
            if (Math.abs(f7 - this.f18030g) < f8) {
            }
        } else if (f7 == -1.0f && c1769d.f17973e < 30) {
            return;
        }
        this.f18030g = f7;
        c(false);
    }

    public final void c(boolean z4) {
        Surface surface;
        float f7;
        if (t.f17153a < 30 || (surface = this.f18028e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f18027d) {
            float f8 = this.f18030g;
            if (f8 != -1.0f) {
                f7 = f8 * this.f18032i;
                if (z4 && this.f18031h == f7) {
                    return;
                }
                this.f18031h = f7;
                j.a(surface, f7);
            }
        }
        f7 = 0.0f;
        if (z4) {
        }
        this.f18031h = f7;
        j.a(surface, f7);
    }
}

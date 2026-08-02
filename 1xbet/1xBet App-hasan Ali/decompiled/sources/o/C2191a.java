package o;

import android.os.Looper;
import r3.AbstractC2349a;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2191a extends AbstractC2349a {

    /* renamed from: o, reason: collision with root package name */
    public static volatile C2191a f18494o;

    /* renamed from: p, reason: collision with root package name */
    public static final O1.b f18495p = new O1.b(1);

    /* renamed from: n, reason: collision with root package name */
    public final C2193c f18496n = new C2193c();

    public static C2191a Q() {
        if (f18494o != null) {
            return f18494o;
        }
        synchronized (C2191a.class) {
            try {
                if (f18494o == null) {
                    f18494o = new C2191a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18494o;
    }

    public final void R(Runnable runnable) {
        C2193c c2193c = this.f18496n;
        if (c2193c.f18501p == null) {
            synchronized (c2193c.f18499n) {
                try {
                    if (c2193c.f18501p == null) {
                        c2193c.f18501p = C2193c.Q(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c2193c.f18501p.post(runnable);
    }
}

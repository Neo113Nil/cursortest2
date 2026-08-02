package u1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import w1.C1755w0;
import w1.C1761y0;
import w1.C1764z0;
import w1.r;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f16703a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16704b = false;

    /* renamed from: c, reason: collision with root package name */
    public static HashMap f16705c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C1764z0 f16706d = null;

    /* renamed from: e, reason: collision with root package name */
    public static C1761y0 f16707e = null;

    public static C1761y0 a() {
        C1761y0 c1761y0;
        if (f16707e == null) {
            synchronized (C1761y0.class) {
                try {
                    if (C1761y0.f17929c == null) {
                        if (!r.f17840z.get()) {
                            throw new IllegalStateException("Flurry SDK must be initialized before starting config");
                        }
                        C1761y0 c1761y02 = new C1761y0(0, false);
                        c1761y02.f17932b = C1755w0.h();
                        C1761y0.f17929c = c1761y02;
                    }
                    c1761y0 = C1761y0.f17929c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            f16707e = c1761y0;
            C1764z0 a2 = C1764z0.a("PUBLISHER");
            f16706d = a2;
            ((C1755w0) f16707e.f17932b).i(new j(0), a2);
        }
        return f16707e;
    }

    public static void b() {
        ((C1755w0) a().f17932b).m();
    }
}

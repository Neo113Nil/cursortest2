package p145u1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p155w1.C1046w0;
import p155w1.C1052y0;
import p155w1.C1055z0;
import p155w1.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f16709a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f16710b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap f16711c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1055z0 f16712d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1052y0 f16713e = null;

    public static C1052y0 a() {
        C1052y0 c1052y0;
        if (f16713e == null) {
            synchronized (C1052y0.class) {
                try {
                    if (C1052y0.f17935c == null) {
                        if (!r.f17846z.get()) {
                            throw new IllegalStateException("Flurry SDK must be initialized before starting config");
                        }
                        C1052y0 c1052y1 = new C1052y0(0, false);
                        c1052y1.f17938b = C1046w0.h();
                        C1052y0.f17935c = c1052y1;
                    }
                    c1052y0 = C1052y0.f17935c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            f16713e = c1052y0;
            C1055z0 c1055z0A = C1055z0.a("PUBLISHER");
            f16712d = c1055z0A;
            ((C1046w0) f16713e.f17938b).i(new j(0), c1055z0A);
        }
        return f16713e;
    }

    public static void b() {
        ((C1046w0) a().f17938b).m();
    }
}

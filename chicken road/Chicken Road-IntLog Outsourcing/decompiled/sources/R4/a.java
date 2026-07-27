package R4;

import f4.C0431h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2674a;

    static {
        Object l2;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.i.d(property, "getProperty(...)");
            l2 = B4.r.P(property);
        } catch (Throwable th) {
            l2 = e5.g.l(th);
        }
        if (l2 instanceof C0431h) {
            l2 = null;
        }
        Integer num = (Integer) l2;
        f2674a = num != null ? num.intValue() : 2097152;
    }
}

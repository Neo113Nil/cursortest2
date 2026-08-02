package U5;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: U5.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0450q {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f6571a = Logger.getLogger(C0450q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C0450q f6572b = new C0450q();

    public static C0450q b() {
        ((q0) AbstractC0448o.f6562a).getClass();
        C0450q c0450q = (C0450q) q0.f6574b.get();
        C0450q c0450q2 = f6572b;
        if (c0450q == null) {
            c0450q = c0450q2;
        }
        return c0450q == null ? c0450q2 : c0450q;
    }

    public final C0450q a() {
        ((q0) AbstractC0448o.f6562a).getClass();
        ThreadLocal threadLocal = q0.f6574b;
        C0450q c0450q = (C0450q) threadLocal.get();
        C0450q c0450q2 = f6572b;
        if (c0450q == null) {
            c0450q = c0450q2;
        }
        threadLocal.set(this);
        return c0450q == null ? c0450q2 : c0450q;
    }

    public final void c(C0450q c0450q) {
        if (c0450q == null) {
            throw new NullPointerException("toAttach");
        }
        ((q0) AbstractC0448o.f6562a).getClass();
        ThreadLocal threadLocal = q0.f6574b;
        C0450q c0450q2 = (C0450q) threadLocal.get();
        C0450q c0450q3 = f6572b;
        if (c0450q2 == null) {
            c0450q2 = c0450q3;
        }
        if (c0450q2 != this) {
            q0.f6573a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c0450q != c0450q3) {
            threadLocal.set(c0450q);
        } else {
            threadLocal.set(null);
        }
    }
}

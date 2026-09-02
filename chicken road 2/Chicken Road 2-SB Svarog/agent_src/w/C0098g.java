package w;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import x.InterfaceC0099a;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0098g f1295a = new C0098g();

    /* renamed from: b, reason: collision with root package name */
    public static final W.e f1296b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0092a f1297c;

    static {
        g0.l.a(h.class).b();
        f1296b = new W.e(C0097f.f1294c);
        f1297c = C0092a.f1276a;
    }

    public static C0093b a(Context context) {
        g0.h.e(context, "context");
        InterfaceC0099a interfaceC0099a = (InterfaceC0099a) f1296b.a();
        if (interfaceC0099a == null) {
            z.l lVar = z.l.f1340c;
            if (z.l.f1340c == null) {
                ReentrantLock reentrantLock = z.l.f1341d;
                reentrantLock.lock();
                try {
                    if (z.l.f1340c == null) {
                        z.j jVar = null;
                        try {
                            t.i b2 = z.h.b();
                            if (b2 != null) {
                                t.i iVar = t.i.f1267g;
                                g0.h.e(iVar, "other");
                                Object a2 = b2.f1272f.a();
                                g0.h.d(a2, "<get-bigInteger>(...)");
                                Object a3 = iVar.f1272f.a();
                                g0.h.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    z.j jVar2 = new z.j(context);
                                    if (jVar2.e()) {
                                        jVar = jVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        z.l.f1340c = new z.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0099a = z.l.f1340c;
            g0.h.b(interfaceC0099a);
        }
        int i2 = n.f1309b;
        C0093b c0093b = new C0093b(interfaceC0099a);
        f1297c.getClass();
        return c0093b;
    }
}

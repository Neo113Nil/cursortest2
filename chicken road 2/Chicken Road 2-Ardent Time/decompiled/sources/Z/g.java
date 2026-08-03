package Z;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Z.g f1853a = new Z.g();

    /* renamed from: b, reason: collision with root package name */
    public static final h1.C0175g f1854b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z.a f1855c;

    static {
        kotlin.jvm.internal.q.a(Z.h.class).b();
        f1854b = Q1.l.q(Z.f.f1852e);
        f1855c = Z.a.f1834a;
    }

    public static Z.b a(android.content.Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        a0.InterfaceC0060a interfaceC0060a = (a0.InterfaceC0060a) f1854b.a();
        if (interfaceC0060a == null) {
            c0.k kVar = c0.k.f2568c;
            if (c0.k.f2568c == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = c0.k.f2569d;
                reentrantLock.lock();
                try {
                    if (c0.k.f2568c == null) {
                        c0.i iVar = null;
                        try {
                            W.i c2 = c0.g.c();
                            if (c2 != null) {
                                W.i other = W.i.f1821f;
                                kotlin.jvm.internal.i.e(other, "other");
                                java.lang.Object a2 = c2.f1826e.a();
                                kotlin.jvm.internal.i.d(a2, "<get-bigInteger>(...)");
                                java.lang.Object a3 = other.f1826e.a();
                                kotlin.jvm.internal.i.d(a3, "<get-bigInteger>(...)");
                                if (((java.math.BigInteger) a2).compareTo((java.math.BigInteger) a3) >= 0) {
                                    c0.i iVar2 = new c0.i(context);
                                    if (iVar2.i()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                        c0.k.f2568c = new c0.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0060a = c0.k.f2568c;
            kotlin.jvm.internal.i.b(interfaceC0060a);
        }
        int i2 = Z.m.f1865b;
        Z.b bVar = new Z.b(interfaceC0060a);
        f1855c.getClass();
        return bVar;
    }
}

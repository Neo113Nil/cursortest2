package A;

import a.AbstractC0009a;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f19a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final K0.g f20b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f21c;

    static {
        kotlin.jvm.internal.n.a(h.class).b();
        f20b = AbstractC0009a.t(f.f18e);
        f21c = a.f0a;
    }

    public static b a(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        B.a aVar = (B.a) f20b.a();
        if (aVar == null) {
            D.k kVar = D.k.f156c;
            if (D.k.f156c == null) {
                ReentrantLock reentrantLock = D.k.f157d;
                reentrantLock.lock();
                try {
                    if (D.k.f156c == null) {
                        D.i iVar = null;
                        try {
                            x.i c2 = D.g.c();
                            if (c2 != null) {
                                x.i other = x.i.f6772f;
                                kotlin.jvm.internal.j.e(other, "other");
                                Object a2 = c2.f6777e.a();
                                kotlin.jvm.internal.j.d(a2, "<get-bigInteger>(...)");
                                Object a3 = other.f6777e.a();
                                kotlin.jvm.internal.j.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    D.i iVar2 = new D.i(context);
                                    if (iVar2.i()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        D.k.f156c = new D.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = D.k.f156c;
            kotlin.jvm.internal.j.b(aVar);
        }
        int i2 = p.f35b;
        b bVar = new b(aVar);
        f21c.getClass();
        return bVar;
    }
}

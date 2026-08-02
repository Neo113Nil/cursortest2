package X0;

import Y4.D;
import a1.AbstractC0612h;
import a1.C0614j;
import a1.C0616l;
import android.content.Context;
import f6.C1114g;
import io.sentry.protocol.Request;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import t6.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f7442a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C1114g f7443b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f7444c;

    static {
        q.a(h.class).b();
        f7443b = D.C(f.f7441a);
        f7444c = a.f7421a;
    }

    public static b a(Context context) {
        t6.h.e(context, "context");
        Y0.a aVar = (Y0.a) f7443b.getValue();
        if (aVar == null) {
            C0616l c0616l = C0616l.f7968c;
            if (C0616l.f7968c == null) {
                ReentrantLock reentrantLock = C0616l.f7969d;
                reentrantLock.lock();
                try {
                    if (C0616l.f7968c == null) {
                        C0614j c0614j = null;
                        try {
                            U0.j c3 = AbstractC0612h.c();
                            if (c3 != null) {
                                U0.j jVar = U0.j.f6393f;
                                t6.h.e(jVar, Request.JsonKeys.OTHER);
                                Object value = c3.f6398e.getValue();
                                t6.h.d(value, "<get-bigInteger>(...)");
                                Object value2 = jVar.f6398e.getValue();
                                t6.h.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    C0614j c0614j2 = new C0614j(context);
                                    if (c0614j2.i()) {
                                        c0614j = c0614j2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        C0616l.f7968c = new C0616l(c0614j);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = C0616l.f7968c;
            t6.h.b(aVar);
        }
        int i7 = o.f7459b;
        b bVar = new b(aVar);
        f7444c.getClass();
        return bVar;
    }
}

package X0;

import Y4.D;
import android.content.Context;
import io.sentry.protocol.Request;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import t6.q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f7442a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p044f6.g f7443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
            p005a1.l lVar = p005a1.l.f7968c;
            if (p005a1.l.f7968c == null) {
                ReentrantLock reentrantLock = p005a1.l.f7969d;
                reentrantLock.lock();
                try {
                    if (p005a1.l.f7968c == null) {
                        p005a1.j jVar = null;
                        try {
                            U0.j jVarC = p005a1.h.c();
                            if (jVarC != null) {
                                U0.j jVar2 = U0.j.f6393f;
                                t6.h.e(jVar2, Request.JsonKeys.OTHER);
                                Object value = jVarC.f6398e.getValue();
                                t6.h.d(value, "<get-bigInteger>(...)");
                                Object value2 = jVar2.f6398e.getValue();
                                t6.h.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    p005a1.j jVar3 = new p005a1.j(context);
                                    if (jVar3.i()) {
                                        jVar = jVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        p005a1.l.f7968c = new p005a1.l(jVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            aVar = p005a1.l.f7968c;
            t6.h.b(aVar);
        }
        int i7 = o.f7459b;
        b bVar = new b(aVar);
        f7444c.getClass();
        return bVar;
    }
}

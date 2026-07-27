package g0;

import android.content.Context;
import d0.C0268h;
import d2.C0277g;
import h0.InterfaceC0324a;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0308g f4964a = new C0308g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0277g f4965b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0302a f4966c;

    static {
        r.a(InterfaceC0309h.class).b();
        f4965b = new C0277g(C0307f.f4963e);
        f4966c = C0302a.f4947a;
    }

    public static C0303b a(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        InterfaceC0324a interfaceC0324a = (InterfaceC0324a) f4965b.a();
        if (interfaceC0324a == null) {
            j0.k kVar = j0.k.f9522c;
            if (j0.k.f9522c == null) {
                ReentrantLock reentrantLock = j0.k.f9523d;
                reentrantLock.lock();
                try {
                    if (j0.k.f9522c == null) {
                        j0.i iVar = null;
                        try {
                            C0268h b3 = j0.h.b();
                            if (b3 != null) {
                                C0268h other = C0268h.f;
                                kotlin.jvm.internal.j.e(other, "other");
                                Object a3 = b3.f4842e.a();
                                kotlin.jvm.internal.j.d(a3, "<get-bigInteger>(...)");
                                Object a4 = other.f4842e.a();
                                kotlin.jvm.internal.j.d(a4, "<get-bigInteger>(...)");
                                if (((BigInteger) a3).compareTo((BigInteger) a4) >= 0) {
                                    j0.i iVar2 = new j0.i(context);
                                    if (iVar2.e()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        j0.k.f9522c = new j0.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0324a = j0.k.f9522c;
            kotlin.jvm.internal.j.b(interfaceC0324a);
        }
        int i3 = C0314m.f4974b;
        C0303b c0303b = new C0303b(interfaceC0324a);
        f4966c.getClass();
        return c0303b;
    }
}

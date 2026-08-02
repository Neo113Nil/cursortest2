package S6;

import B4.V;
import S6.k;
import S6.m;
import S6.r;
import android.content.Context;
import b7.InterfaceC5572a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    private static volatile k f25947e;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5572a f25948a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5572a f25949b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.e f25950c;

    /* renamed from: d, reason: collision with root package name */
    private final Y6.m f25951d;

    u(InterfaceC5572a interfaceC5572a, InterfaceC5572a interfaceC5572a2, X6.e eVar, Y6.m mVar, Y6.o oVar) {
        this.f25948a = interfaceC5572a;
        this.f25949b = interfaceC5572a2;
        this.f25950c = eVar;
        this.f25951d = mVar;
        oVar.c();
    }

    public static u a() {
        k kVar = f25947e;
        if (kVar != null) {
            return kVar.d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void c(Context context) {
        if (f25947e == null) {
            synchronized (u.class) {
                try {
                    if (f25947e == null) {
                        k.a aVar = new k.a();
                        aVar.b(context);
                        f25947e = aVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final Y6.m b() {
        return this.f25951d;
    }

    public final Q6.i d(com.google.android.datatransport.cct.a aVar) {
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(aVar.e()) : Collections.singleton(Q6.c.b("proto"));
        r.a a11 = r.a();
        aVar.getClass();
        a11.b("cct");
        a11.c(aVar.d());
        return new s(unmodifiableSet, a11.a(), this);
    }

    public final void e(i iVar, V v11) {
        r d11 = iVar.d();
        Q6.e c11 = iVar.b().c();
        d11.getClass();
        r.a a11 = r.a();
        a11.b(d11.b());
        a11.d(c11);
        a11.c(d11.c());
        r a12 = a11.a();
        m.a a13 = m.a();
        a13.h(this.f25948a.t());
        a13.j(this.f25949b.t());
        a13.i(iVar.e());
        a13.g(new l(iVar.a(), iVar.c().apply(iVar.b().b())));
        a13.f(iVar.b().a());
        this.f25950c.a(a12, a13.d(), v11);
    }
}

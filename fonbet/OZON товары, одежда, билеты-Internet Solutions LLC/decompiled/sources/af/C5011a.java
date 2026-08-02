package af;

import We.B;
import We.C4862d;
import We.F;
import We.G;
import We.InterfaceC4865g;
import We.L;
import We.M;
import We.v;
import We.z;
import af.C5014d;
import cf.C5824e;
import ef.C6355e;
import ef.C6358h;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: af.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5011a implements B {

    /* renamed from: b, reason: collision with root package name */
    public static final C0707a f36690b = new C0707a();

    /* renamed from: a, reason: collision with root package name */
    private final C4862d f36691a;

    /* renamed from: af.a$a, reason: collision with other inner class name */
    public static final class C0707a {
        public static final z a(C0707a c0707a, z zVar, z zVar2) {
            c0707a.getClass();
            z.a aVar = new z.a();
            int size = zVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String e11 = zVar.e(i11);
                String k11 = zVar.k(i11);
                if ((!"Warning".equalsIgnoreCase(e11) || !kotlin.text.h.e0(k11, "1", false)) && ("Content-Length".equalsIgnoreCase(e11) || "Content-Encoding".equalsIgnoreCase(e11) || "Content-Type".equalsIgnoreCase(e11) || !c(e11) || zVar2.c(e11) == null)) {
                    aVar.c(e11, k11);
                }
            }
            int size2 = zVar2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String e12 = zVar2.e(i12);
                if (!"Content-Length".equalsIgnoreCase(e12) && !"Content-Encoding".equalsIgnoreCase(e12) && !"Content-Type".equalsIgnoreCase(e12) && c(e12)) {
                    aVar.c(e12, zVar2.k(i12));
                }
            }
            return aVar.e();
        }

        public static final L b(C0707a c0707a, L l11) {
            c0707a.getClass();
            if ((l11 != null ? l11.c() : null) == null) {
                return l11;
            }
            l11.getClass();
            L.a aVar = new L.a(l11);
            aVar.b(null);
            return aVar.c();
        }

        private static boolean c(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public C5011a(C4862d c4862d) {
        this.f36691a = c4862d;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        v vVar;
        M c11;
        M c12;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC4865g call = chain.call();
        C4862d c4862d = this.f36691a;
        L c13 = c4862d != null ? c4862d.c(chain.request()) : null;
        C5014d cacheStrategy = new C5014d.b(System.currentTimeMillis(), chain.request(), c13).a();
        G b11 = cacheStrategy.b();
        L a11 = cacheStrategy.a();
        if (c4862d != null) {
            synchronized (c4862d) {
                Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            }
        }
        C5824e c5824e = (C5824e) (call instanceof C5824e ? call : null);
        if (c5824e == null || (vVar = c5824e.i()) == null) {
            vVar = v.NONE;
        }
        if (c13 != null && a11 == null && (c12 = c13.c()) != null) {
            Ye.b.e(c12);
        }
        if (b11 == null && a11 == null) {
            L.a aVar = new L.a();
            aVar.r(chain.request());
            aVar.o(F.HTTP_1_1);
            aVar.f(504);
            aVar.l("Unsatisfiable Request (only-if-cached)");
            aVar.b(Ye.b.f34902c);
            aVar.s(-1L);
            aVar.p(System.currentTimeMillis());
            L c14 = aVar.c();
            vVar.satisfactionFailure(call, c14);
            return c14;
        }
        C0707a c0707a = f36690b;
        if (b11 == null) {
            Intrinsics.f(a11);
            L.a aVar2 = new L.a(a11);
            aVar2.d(C0707a.b(c0707a, a11));
            L c15 = aVar2.c();
            vVar.cacheHit(call, c15);
            return c15;
        }
        if (a11 != null) {
            vVar.cacheConditionalHit(call, a11);
        } else if (c4862d != null) {
            vVar.cacheMiss(call);
        }
        try {
            L proceed = chain.proceed(b11);
            if (proceed == null && c13 != null && c11 != null) {
            }
            if (a11 != null) {
                if (proceed != null && proceed.m() == 304) {
                    L.a aVar3 = new L.a(a11);
                    aVar3.j(C0707a.a(c0707a, a11.r(), proceed.r()));
                    aVar3.s(proceed.O());
                    aVar3.p(proceed.I());
                    aVar3.d(C0707a.b(c0707a, a11));
                    aVar3.m(C0707a.b(c0707a, proceed));
                    L c16 = aVar3.c();
                    M c17 = proceed.c();
                    Intrinsics.f(c17);
                    c17.close();
                    Intrinsics.f(c4862d);
                    synchronized (c4862d) {
                    }
                    C4862d.r(a11, c16);
                    vVar.cacheHit(call, c16);
                    return c16;
                }
                M c18 = a11.c();
                if (c18 != null) {
                    Ye.b.e(c18);
                }
            }
            Intrinsics.f(proceed);
            L.a aVar4 = new L.a(proceed);
            aVar4.d(C0707a.b(c0707a, a11));
            aVar4.m(C0707a.b(c0707a, proceed));
            L c19 = aVar4.c();
            if (c4862d != null) {
                if (C6355e.b(c19) && C5014d.a.a(b11, c19)) {
                    InterfaceC5013c m11 = c4862d.m(c19);
                    if (m11 != null) {
                        C4862d.C0598d.a b12 = m11.b();
                        M c21 = c19.c();
                        Intrinsics.f(c21);
                        C5012b c5012b = new C5012b(c21.source(), m11, sf.z.c(b12));
                        String q11 = L.q(c19, "Content-Type");
                        long contentLength = c19.c().contentLength();
                        L.a aVar5 = new L.a(c19);
                        aVar5.b(new C6358h(q11, contentLength, sf.z.d(c5012b)));
                        c19 = aVar5.c();
                    }
                    if (a11 != null) {
                        vVar.cacheMiss(call);
                    }
                    return c19;
                }
                String method = b11.h();
                Intrinsics.checkNotNullParameter(method, "method");
                if (!Intrinsics.d(method, "POST") && !Intrinsics.d(method, "PATCH") && !Intrinsics.d(method, "PUT") && !Intrinsics.d(method, "DELETE") && !Intrinsics.d(method, "MOVE")) {
                    return c19;
                }
                try {
                    c4862d.o(b11);
                } catch (IOException unused) {
                }
            }
            return c19;
        } finally {
            if (c13 != null && (c11 = c13.c()) != null) {
                Ye.b.e(c11);
            }
        }
    }
}

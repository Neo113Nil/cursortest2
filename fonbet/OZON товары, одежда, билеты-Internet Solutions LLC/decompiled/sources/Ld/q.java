package Ld;

import Md.a;
import fe.C6530i;
import fe.C6535n;
import fe.C6545y;
import he.C6924F;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9820K;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<a.EnumC0345a> f16801b = e0.h(a.EnumC0345a.CLASS);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<a.EnumC0345a> f16802c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Rd.e f16803d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Rd.e f16804e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16805f = 0;

    /* renamed from: a, reason: collision with root package name */
    public C6535n f16806a;

    static {
        a.EnumC0345a[] elements = {a.EnumC0345a.FILE_FACADE, a.EnumC0345a.MULTIFILE_CLASS_PART};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f16802c = C7705l.j0(elements);
        new Rd.e(1, 1, 2);
        f16803d = new Rd.e(1, 1, 11);
        f16804e = new Rd.e(1, 1, 13);
    }

    private final C6545y<Rd.e> d(y yVar) {
        c().g().getClass();
        if (yVar.a().d().g(te.c.a(c().g()))) {
            return null;
        }
        return new C6545y<>(yVar.a().d(), Rd.e.f25015g, te.c.a(c().g()), te.c.a(c().g()).i(yVar.a().d().h()), yVar.getLocation(), yVar.b());
    }

    private final boolean e(y yVar) {
        c().g().getClass();
        c().g().getClass();
        return yVar.a().h() && Intrinsics.d(yVar.a().d(), f16803d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (Ld.q.f16802c.contains(r0.c()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6924F b(@NotNull InterfaceC9820K descriptor, @NotNull y kotlinClass) {
        String[] g10;
        Pair<Rd.f, Nd.k> pair;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Md.a a11 = kotlinClass.a();
        String[] a12 = a11.a();
        if (a12 == null) {
            a12 = a11.b();
        }
        if (a12 != null) {
        }
        a12 = null;
        if (a12 != null && (g10 = kotlinClass.a().g()) != null) {
            try {
                try {
                    pair = Rd.h.j(a12, g10);
                } catch (Td.j e11) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
                }
            } catch (Throwable th2) {
                c().g().getClass();
                if (kotlinClass.a().d().g(te.c.a(c().g()))) {
                    throw th2;
                }
                pair = null;
            }
            if (pair != null) {
                Rd.f a13 = pair.a();
                Nd.k b11 = pair.b();
                d(kotlinClass);
                e(kotlinClass);
                c().g().getClass();
                t tVar = new t(kotlinClass, b11, a13, kotlinClass.a().i() ? he.u.UNSTABLE : he.u.STABLE);
                return new C6924F(descriptor, b11, a13, kotlinClass.a().d(), tVar, c(), "scope for " + tVar + " in " + descriptor, p.f16800a);
            }
        }
        return null;
    }

    @NotNull
    public final C6535n c() {
        C6535n c6535n = this.f16806a;
        if (c6535n != null) {
            return c6535n;
        }
        Intrinsics.n("components");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (Ld.q.f16801b.contains(r1.c()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6530i f(@NotNull y kotlinClass) {
        Pair<Rd.f, Nd.b> pair;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Md.a a11 = kotlinClass.a();
        String[] a12 = a11.a();
        if (a12 == null) {
            a12 = a11.b();
        }
        if (a12 != null) {
        }
        a12 = null;
        if (a12 != null) {
            String[] g10 = kotlinClass.a().g();
            try {
            } catch (Throwable th2) {
                c().g().getClass();
                if (kotlinClass.a().d().g(te.c.a(c().g()))) {
                    throw th2;
                }
                pair = null;
            }
            if (g10 != null) {
                try {
                    pair = Rd.h.g(a12, g10);
                    if (pair != null) {
                        Rd.f a13 = pair.a();
                        Nd.b b11 = pair.b();
                        d(kotlinClass);
                        e(kotlinClass);
                        c().g().getClass();
                        return new C6530i(a13, b11, kotlinClass.a().d(), new A(kotlinClass, kotlinClass.a().i() ? he.u.UNSTABLE : he.u.STABLE));
                    }
                } catch (Td.j e11) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
                }
            }
        }
        return null;
    }
}

package Vd;

import Vd.n;
import java.util.Collection;
import ke.h;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9811B;
import td.InterfaceC9820K;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.d0;
import td.i0;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f28542a = new g();

    private static d0 d(InterfaceC9835a interfaceC9835a) {
        while (interfaceC9835a instanceof InterfaceC9836b) {
            InterfaceC9836b interfaceC9836b = (InterfaceC9836b) interfaceC9835a;
            if (interfaceC9836b.getKind() != InterfaceC9836b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends InterfaceC9836b> o11 = interfaceC9836b.o();
            Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
            interfaceC9835a = (InterfaceC9836b) C7714v.C0(o11);
            if (interfaceC9835a == null) {
                return null;
            }
        }
        return interfaceC9835a.e();
    }

    public final boolean a(InterfaceC9845k interfaceC9845k, InterfaceC9845k interfaceC9845k2, boolean z11) {
        if ((interfaceC9845k instanceof InterfaceC9839e) && (interfaceC9845k2 instanceof InterfaceC9839e)) {
            return Intrinsics.d(((InterfaceC9839e) interfaceC9845k).k(), ((InterfaceC9839e) interfaceC9845k2).k());
        }
        if ((interfaceC9845k instanceof i0) && (interfaceC9845k2 instanceof i0)) {
            return b((i0) interfaceC9845k, (i0) interfaceC9845k2, z11, d.f28536a);
        }
        if (!(interfaceC9845k instanceof InterfaceC9835a) || !(interfaceC9845k2 instanceof InterfaceC9835a)) {
            return ((interfaceC9845k instanceof InterfaceC9820K) && (interfaceC9845k2 instanceof InterfaceC9820K)) ? Intrinsics.d(((InterfaceC9820K) interfaceC9845k).c(), ((InterfaceC9820K) interfaceC9845k2).c()) : Intrinsics.d(interfaceC9845k, interfaceC9845k2);
        }
        InterfaceC9835a a11 = (InterfaceC9835a) interfaceC9845k;
        InterfaceC9835a b11 = (InterfaceC9835a) interfaceC9845k2;
        h.a kotlinTypeRefiner = h.a.f71488a;
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!Intrinsics.d(a11, b11)) {
            if (Intrinsics.d(a11.getName(), b11.getName()) && ((!(a11 instanceof InterfaceC9811B) || !(b11 instanceof InterfaceC9811B) || ((InterfaceC9811B) a11).p0() == ((InterfaceC9811B) b11).p0()) && ((!Intrinsics.d(a11.d(), b11.d()) || (z11 && Intrinsics.d(d(a11), d(b11)))) && !i.y(a11) && !i.y(b11)))) {
                InterfaceC9845k d11 = a11.d();
                InterfaceC9845k d12 = b11.d();
                if (((d11 instanceof InterfaceC9836b) || (d12 instanceof InterfaceC9836b)) ? false : a(d11, d12, z11)) {
                    n e11 = n.e(kotlinTypeRefiner, new e(a11, b11, z11));
                    Intrinsics.checkNotNullExpressionValue(e11, "create(...)");
                    n.c.a c11 = e11.o(a11, b11, null, true).c();
                    n.c.a aVar = n.c.a.OVERRIDABLE;
                    if (c11 != aVar || e11.o(b11, a11, null, true).c() != aVar) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean b(@NotNull i0 a11, @NotNull i0 b11, boolean z11, @NotNull Function2<? super InterfaceC9845k, ? super InterfaceC9845k, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.d(a11, b11)) {
            return true;
        }
        if (Intrinsics.d(a11.d(), b11.d())) {
            return false;
        }
        InterfaceC9845k d11 = a11.d();
        InterfaceC9845k d12 = b11.d();
        return (((d11 instanceof InterfaceC9836b) || (d12 instanceof InterfaceC9836b)) ? equivalentCallables.invoke(d11, d12).booleanValue() : a(d11, d12, z11)) && a11.getIndex() == b11.getIndex();
    }
}

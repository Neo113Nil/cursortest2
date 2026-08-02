package Cd;

import Vd.j;
import Vd.n;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7748h;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9839e;
import td.c0;
import td.i0;
import td.p0;
import wd.AbstractC10518d;

/* renamed from: Cd.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2755p implements Vd.j {

    /* renamed from: Cd.p$a */
    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4766a;

        static {
            int[] iArr = new int[n.c.a.values().length];
            try {
                iArr[n.c.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4766a = iArr;
        }
    }

    @Override // Vd.j
    @NotNull
    public final j.b a(@NotNull InterfaceC9835a superDescriptor, @NotNull InterfaceC9835a subDescriptor, InterfaceC9839e interfaceC9839e) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof Ed.e) {
            Ed.e eVar = (Ed.e) subDescriptor;
            List<i0> typeParameters = eVar.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                n.c k11 = Vd.n.k(superDescriptor, subDescriptor);
                if ((k11 != null ? k11.c() : null) != null) {
                    return j.b.UNKNOWN;
                }
                List<p0> f7 = eVar.f();
                Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                kotlin.sequences.I v11 = kotlin.sequences.l.v(C7714v.w(f7), C2754o.f4765a);
                je.N returnType = eVar.getReturnType();
                Intrinsics.f(returnType);
                C7748h z11 = kotlin.sequences.l.z(v11, returnType);
                InterfaceC9834Z d02 = eVar.d0();
                Iterator it = kotlin.sequences.l.x(z11, C7714v.c0(d02 != null ? ((AbstractC10518d) d02).getType() : null)).iterator();
                while (true) {
                    C7748h.a aVar = (C7748h.a) it;
                    if (!aVar.hasNext()) {
                        InterfaceC9835a b22 = superDescriptor.b2(new Hd.i().c());
                        if (b22 == null) {
                            return j.b.UNKNOWN;
                        }
                        if (b22 instanceof c0) {
                            c0 c0Var = (c0) b22;
                            List<i0> typeParameters2 = c0Var.getTypeParameters();
                            Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
                            if (!typeParameters2.isEmpty()) {
                                b22 = c0Var.U().a(kotlin.collections.K.f71697a).build();
                                Intrinsics.f(b22);
                            }
                        }
                        n.c.a c11 = Vd.n.f28546e.p(b22, subDescriptor, false).c();
                        Intrinsics.checkNotNullExpressionValue(c11, "getResult(...)");
                        return a.f4766a[c11.ordinal()] == 1 ? j.b.OVERRIDABLE : j.b.UNKNOWN;
                    }
                    je.N n11 = (je.N) aVar.next();
                    if (!n11.F0().isEmpty() && !(n11.K0() instanceof Hd.k)) {
                        return j.b.UNKNOWN;
                    }
                }
            }
        }
        return j.b.UNKNOWN;
    }

    @Override // Vd.j
    @NotNull
    public final j.a b() {
        return j.a.SUCCESS_ONLY;
    }
}

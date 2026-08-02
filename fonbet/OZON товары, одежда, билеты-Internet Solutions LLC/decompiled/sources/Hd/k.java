package Hd;

import Ud.u;
import ce.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.AbstractC7360E;
import je.K0;
import je.N;
import je.Y;
import je.o0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* loaded from: classes10.dex */
public final class k extends AbstractC7360E {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Y lowerBound, @NotNull Y upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        ke.e.f71486a.d(lowerBound, upperBound);
    }

    private static final ArrayList T0(u uVar, Y y11) {
        List<y0> F02 = y11.F0();
        ArrayList arrayList = new ArrayList(C7714v.z(F02, 10));
        Iterator<T> it = F02.iterator();
        while (it.hasNext()) {
            arrayList.add(uVar.n0((y0) it.next()));
        }
        return arrayList;
    }

    private static final String U0(String str, String str2) {
        if (!kotlin.text.h.u(str, '<')) {
            return str;
        }
        return kotlin.text.h.l0(str, '<') + '<' + str2 + '>' + kotlin.text.h.j0('>', str, str);
    }

    @Override // je.K0
    public final K0 L0(boolean z11) {
        return new k(P0().L0(z11), Q0().L0(z11));
    }

    @Override // je.K0
    public final K0 N0(o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new k(P0().N0(newAttributes), Q0().N0(newAttributes));
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final Y O0() {
        return P0();
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final String R0(@NotNull u renderer, @NotNull u options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String h02 = renderer.h0(P0());
        String h03 = renderer.h0(Q0());
        if (options.z()) {
            return "raw (" + h02 + ".." + h03 + ')';
        }
        if (Q0().F0().isEmpty()) {
            return renderer.N(h02, h03, C8701c.h(this));
        }
        ArrayList T02 = T0(renderer, P0());
        ArrayList T03 = T0(renderer, Q0());
        String V11 = C7714v.V(T02, ", ", null, null, j.f10856a, 30);
        ArrayList b12 = C7714v.b1(T02, T03);
        if (!b12.isEmpty()) {
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.e();
                String str2 = (String) pair.f();
                if (!Intrinsics.d(str, kotlin.text.h.S(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        }
        h03 = U0(h03, V11);
        String U02 = U0(h02, V11);
        return Intrinsics.d(U02, h03) ? U02 : renderer.N(U02, h03, C8701c.h(this));
    }

    @Override // je.K0
    @NotNull
    /* renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final AbstractC7360E M0(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N a11 = kotlinTypeRefiner.a(P0());
        Intrinsics.g(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        N a12 = kotlinTypeRefiner.a(Q0());
        Intrinsics.g(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((Y) a11, (Y) a12);
    }

    @Override // je.AbstractC7360E, je.N
    @NotNull
    public final l p() {
        InterfaceC9842h p11 = H0().p();
        InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
        if (interfaceC9839e != null) {
            l i02 = interfaceC9839e.i0(new i());
            Intrinsics.checkNotNullExpressionValue(i02, "getMemberScope(...)");
            return i02;
        }
        throw new IllegalStateException(("Incorrect classifier: " + H0().p()).toString());
    }
}

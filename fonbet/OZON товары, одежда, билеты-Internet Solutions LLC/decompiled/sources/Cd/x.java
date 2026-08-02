package Cd;

import Ld.u;
import Vd.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.p0;

/* loaded from: classes.dex */
public final class x implements Vd.j {

    public static final class a {
        public static boolean a(@NotNull InterfaceC9835a superDescriptor, @NotNull InterfaceC9835a subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if (!(subDescriptor instanceof Ed.e) || !(superDescriptor instanceof InterfaceC9857w)) {
                return false;
            }
            Ed.e eVar = (Ed.e) subDescriptor;
            eVar.f().size();
            InterfaceC9857w interfaceC9857w = (InterfaceC9857w) superDescriptor;
            interfaceC9857w.f().size();
            List<p0> f7 = eVar.n0().f();
            Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
            List<p0> f11 = interfaceC9857w.n0().f();
            Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
            Iterator it = C7714v.b1(f7, f11).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                p0 p0Var = (p0) pair.a();
                p0 p0Var2 = (p0) pair.b();
                Intrinsics.f(p0Var);
                boolean z11 = b((InterfaceC9857w) subDescriptor, p0Var) instanceof u.c;
                Intrinsics.f(p0Var2);
                if (z11 != (b(interfaceC9857w, p0Var2) instanceof u.c)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (Zd.e.g(r0).equals(Zd.e.g(r3)) == false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static Ld.u b(InterfaceC9857w interfaceC9857w, p0 p0Var) {
            if (!Ld.D.c(interfaceC9857w)) {
                if (interfaceC9857w.f().size() == 1) {
                    InterfaceC9845k d11 = interfaceC9857w.d();
                    InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
                    if (interfaceC9839e != null) {
                        List<p0> f7 = interfaceC9857w.f();
                        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                        InterfaceC9842h p11 = ((p0) C7714v.B0(f7)).getType().H0().p();
                        InterfaceC9839e interfaceC9839e2 = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
                        if (interfaceC9839e2 != null) {
                            if (qd.m.f0(interfaceC9839e)) {
                            }
                        }
                    }
                }
                je.N type = p0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return Ld.D.d(type);
            }
            je.N type2 = p0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return Ld.D.d(C8701c.p(type2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r2.contains(r1) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, Ld.D.a(r1, 2)) != false) goto L45;
     */
    @Override // Vd.j
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j.b a(@NotNull InterfaceC9835a superDescriptor, @NotNull InterfaceC9835a subDescriptor, InterfaceC9839e interfaceC9839e) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof InterfaceC9836b) && (subDescriptor instanceof InterfaceC9857w) && !qd.m.V(subDescriptor)) {
            int i11 = C2747h.f4757m;
            InterfaceC9857w interfaceC9857w = (InterfaceC9857w) subDescriptor;
            Sd.f name = interfaceC9857w.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!C2747h.j(name)) {
                int i12 = Q.f4744l;
                Sd.f name2 = interfaceC9857w.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Intrinsics.checkNotNullParameter(name2, "<this>");
                hashSet = Q.f4742j;
            }
            InterfaceC9836b d11 = P.d((InterfaceC9836b) superDescriptor);
            boolean z11 = superDescriptor instanceof InterfaceC9857w;
            InterfaceC9857w interfaceC9857w2 = z11 ? (InterfaceC9857w) superDescriptor : null;
            if ((interfaceC9857w2 != null && interfaceC9857w.B0() == interfaceC9857w2.B0()) || (d11 != null && interfaceC9857w.B0())) {
                if ((interfaceC9839e instanceof Ed.c) && interfaceC9857w.v0() == null && d11 != null && !P.e(interfaceC9839e, d11)) {
                    if ((d11 instanceof InterfaceC9857w) && z11 && C2747h.i((InterfaceC9857w) d11) != null) {
                        String a11 = Ld.D.a(interfaceC9857w, 2);
                        InterfaceC9857w n02 = ((InterfaceC9857w) superDescriptor).n0();
                        Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
                    }
                }
            }
            return j.b.INCOMPATIBLE;
        }
        return a.a(superDescriptor, subDescriptor) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }

    @Override // Vd.j
    @NotNull
    public final j.a b() {
        return j.a.CONFLICTS_ONLY;
    }
}

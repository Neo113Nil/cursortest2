package Vd;

import je.H0;
import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9816G;
import td.C9858x;
import td.InterfaceC9831W;
import td.InterfaceC9832X;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.n0;
import td.q0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28543a = 0;

    static {
        Sd.c topLevelFqName = new Sd.c("kotlin.jvm.JvmInline");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
    }

    public static final boolean a(@NotNull InterfaceC9836b interfaceC9836b) {
        n0<Y> e02;
        Intrinsics.checkNotNullParameter(interfaceC9836b, "<this>");
        if (!(interfaceC9836b instanceof InterfaceC9832X)) {
            return false;
        }
        InterfaceC9831W f02 = ((InterfaceC9832X) interfaceC9836b).f0();
        Intrinsics.checkNotNullExpressionValue(f02, "getCorrespondingProperty(...)");
        Intrinsics.checkNotNullParameter(f02, "<this>");
        if (f02.d0() != null) {
            return false;
        }
        InterfaceC9845k d11 = f02.d();
        InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
        if (interfaceC9839e == null || (e02 = interfaceC9839e.e0()) == null) {
            return false;
        }
        Sd.f name = f02.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return e02.a(name);
    }

    public static final boolean b(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        return (interfaceC9845k instanceof InterfaceC9839e) && (((InterfaceC9839e) interfaceC9845k).e0() instanceof C9858x);
    }

    public static final boolean c(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 != null) {
            return b(p11);
        }
        return false;
    }

    public static final boolean d(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        return (interfaceC9845k instanceof InterfaceC9839e) && (((InterfaceC9839e) interfaceC9845k).e0() instanceof C9816G);
    }

    public static final boolean e(@NotNull q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        if (q0Var.d0() != null) {
            return false;
        }
        InterfaceC9845k d11 = q0Var.d();
        Sd.f fVar = null;
        InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
        if (interfaceC9839e != null) {
            int i11 = Zd.e.f35896a;
            n0<Y> e02 = interfaceC9839e.e0();
            C9858x c9858x = e02 instanceof C9858x ? (C9858x) e02 : null;
            if (c9858x != null) {
                fVar = c9858x.b();
            }
        }
        return Intrinsics.d(fVar, q0Var.getName());
    }

    public static final boolean f(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        return b(interfaceC9845k) || d(interfaceC9845k);
    }

    public static final boolean g(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 != null) {
            return f(p11);
        }
        return false;
    }

    public static final boolean h(@NotNull N receiver) {
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        InterfaceC9842h p11 = receiver.H0().p();
        if (p11 == null || !d(p11)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return !H0.g(receiver);
    }

    public static final Y i(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC9842h p11 = n11.H0().p();
        InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
        if (interfaceC9839e != null) {
            int i11 = Zd.e.f35896a;
            n0<Y> e02 = interfaceC9839e.e0();
            C9858x c9858x = e02 instanceof C9858x ? (C9858x) e02 : null;
            if (c9858x != null) {
                return (Y) c9858x.c();
            }
        }
        return null;
    }
}

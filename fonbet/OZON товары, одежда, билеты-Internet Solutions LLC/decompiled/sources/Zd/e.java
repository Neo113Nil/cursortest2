package Zd;

import Vd.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import ke.h;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import kotlin.reflect.g;
import kotlin.sequences.C7748h;
import kotlin.sequences.Sequence;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import qd.m;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9830V;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.InterfaceC9846l;
import td.p0;
import ud.InterfaceC10025c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35896a = 0;

    /* loaded from: classes10.dex */
    /* synthetic */ class a extends C7734p implements Function1<p0, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35897a = new a(1);

        @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final g getOwner() {
            return N.b(p0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(p0 p0Var) {
            p0 p02 = p0Var;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(p02.R());
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(Sd.f.f(AppMeasurementSdk.ConditionalUserProperty.VALUE), "identifier(...)");
    }

    public static final boolean a(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Boolean d11 = te.b.d(C7714v.a0(p0Var), Zd.a.f35894a, a.f35897a);
        Intrinsics.checkNotNullExpressionValue(d11, "ifAny(...)");
        return d11.booleanValue();
    }

    public static InterfaceC9836b b(InterfaceC9836b interfaceC9836b, Function1 predicate) {
        Intrinsics.checkNotNullParameter(interfaceC9836b, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (InterfaceC9836b) te.b.b(C7714v.a0(interfaceC9836b), new c(), new f(predicate, new M()));
    }

    public static final Sd.c c(@NotNull InterfaceC9846l interfaceC9846l) {
        Intrinsics.checkNotNullParameter(interfaceC9846l, "<this>");
        Sd.d h11 = h(interfaceC9846l);
        if (!h11.f()) {
            h11 = null;
        }
        if (h11 != null) {
            return h11.l();
        }
        return null;
    }

    public static final InterfaceC9839e d(@NotNull InterfaceC10025c interfaceC10025c) {
        Intrinsics.checkNotNullParameter(interfaceC10025c, "<this>");
        InterfaceC9842h p11 = interfaceC10025c.getType().H0().p();
        if (p11 instanceof InterfaceC9839e) {
            return (InterfaceC9839e) p11;
        }
        return null;
    }

    @NotNull
    public static final m e(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        return j(interfaceC9845k).n();
    }

    public static final Sd.b f(InterfaceC9842h interfaceC9842h) {
        InterfaceC9845k d11;
        Sd.b f7;
        if (interfaceC9842h == null || (d11 = interfaceC9842h.d()) == null) {
            return null;
        }
        if (d11 instanceof InterfaceC9820K) {
            Sd.c c11 = ((InterfaceC9820K) d11).c();
            Sd.f name = interfaceC9842h.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return new Sd.b(c11, name);
        }
        if (!(d11 instanceof InterfaceC9843i) || (f7 = f((InterfaceC9842h) d11)) == null) {
            return null;
        }
        Sd.f name2 = interfaceC9842h.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return f7.d(name2);
    }

    @NotNull
    public static final Sd.c g(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        Sd.c l11 = i.l(interfaceC9845k);
        Intrinsics.checkNotNullExpressionValue(l11, "getFqNameSafe(...)");
        return l11;
    }

    @NotNull
    public static final Sd.d h(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        Sd.d k11 = i.k(interfaceC9845k);
        Intrinsics.checkNotNullExpressionValue(k11, "getFqName(...)");
        return k11;
    }

    @NotNull
    public static final h.a i(@NotNull InterfaceC9815F interfaceC9815F) {
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        return h.a.f71488a;
    }

    @NotNull
    public static final InterfaceC9815F j(@NotNull InterfaceC9845k interfaceC9845k) {
        Intrinsics.checkNotNullParameter(interfaceC9845k, "<this>");
        InterfaceC9815F e11 = i.e(interfaceC9845k);
        Intrinsics.checkNotNullExpressionValue(e11, "getContainingModule(...)");
        return e11;
    }

    @NotNull
    public static final Sequence k(@NotNull InterfaceC9843i interfaceC9843i) {
        Intrinsics.checkNotNullParameter(interfaceC9843i, "<this>");
        Intrinsics.checkNotNullParameter(interfaceC9843i, "<this>");
        return l.e(l.q(interfaceC9843i, b.f35895a), 1);
    }

    @NotNull
    public static final InterfaceC9836b l(@NotNull InterfaceC9836b interfaceC9836b) {
        Intrinsics.checkNotNullParameter(interfaceC9836b, "<this>");
        if (!(interfaceC9836b instanceof InterfaceC9830V)) {
            return interfaceC9836b;
        }
        InterfaceC9831W f02 = ((InterfaceC9830V) interfaceC9836b).f0();
        Intrinsics.checkNotNullExpressionValue(f02, "getCorrespondingProperty(...)");
        return f02;
    }

    @NotNull
    public static final C7748h m(@NotNull InterfaceC9836b interfaceC9836b) {
        Intrinsics.checkNotNullParameter(interfaceC9836b, "<this>");
        InterfaceC9836b[] elements = {interfaceC9836b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence g10 = C7705l.g(elements);
        Collection<? extends InterfaceC9836b> o11 = interfaceC9836b.o();
        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
        return l.y(g10, l.m(C7714v.w(o11), new d()));
    }
}

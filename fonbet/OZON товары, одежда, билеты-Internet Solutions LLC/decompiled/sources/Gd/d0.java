package Gd;

import Bd.InterfaceC2627a;
import ae.C4999a;
import ae.InterfaceC5004f;
import fe.InterfaceC6543w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import te.C9865a;

/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f10016p = 0;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Jd.g f10017n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C3085o f10018o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull Fd.k c11, @NotNull Jd.g jClass, @NotNull C3085o ownerDescriptor) {
        super(c11);
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f10017n = jClass;
        this.f10018o = ownerDescriptor;
    }

    private static InterfaceC9831W F(InterfaceC9831W interfaceC9831W) {
        InterfaceC9836b.a kind = interfaceC9831W.getKind();
        kind.getClass();
        if (kind != InterfaceC9836b.a.FAKE_OVERRIDE) {
            return interfaceC9831W;
        }
        Collection<? extends InterfaceC9836b> o11 = interfaceC9831W.o();
        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC9836b> collection = o11;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC9831W interfaceC9831W2 = (InterfaceC9831W) it.next();
            Intrinsics.f(interfaceC9831W2);
            arrayList.add(F(interfaceC9831W2));
        }
        return (InterfaceC9831W) C7714v.B0(C7714v.C(arrayList));
    }

    @Override // Gd.W
    public final InterfaceC9845k A() {
        return this.f10018o;
    }

    @Override // ce.m, ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // Gd.W
    @NotNull
    protected final Set<Sd.f> n(@NotNull ce.d kindFilter, Function1<? super Sd.f, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return kotlin.collections.M.f71699a;
    }

    @Override // Gd.W
    @NotNull
    protected final Set<Sd.f> o(@NotNull ce.d kindFilter, Function1<? super Sd.f, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet X02 = C7714v.X0(x().invoke().a());
        C3085o c3085o = this.f10018o;
        d0 b11 = Ed.h.b(c3085o);
        Set<Sd.f> a11 = b11 != null ? b11.a() : null;
        if (a11 == null) {
            a11 = kotlin.collections.M.f71699a;
        }
        X02.addAll(a11);
        if (this.f10017n.A()) {
            X02.addAll(C7714v.b0(qd.s.f81856c, qd.s.f81854a));
        }
        X02.addAll(((C4999a) w().a().w()).c(c3085o, w()));
        return X02;
    }

    @Override // Gd.W
    protected final void p(@NotNull Sd.f name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        InterfaceC5004f w11 = w().a().w();
        C4999a c4999a = (C4999a) w11;
        c4999a.d(this.f10018o, name, result, w());
    }

    @Override // Gd.W
    public final InterfaceC3073c q() {
        return new C3072b(this.f10017n, X.f10000a);
    }

    @Override // Gd.W
    protected final void s(@NotNull LinkedHashSet result, @NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        C3085o c3085o = this.f10018o;
        d0 b11 = Ed.h.b(c3085o);
        Collection Y02 = b11 == null ? kotlin.collections.M.f71699a : C7714v.Y0(b11.g(name, Bd.c.WHEN_GET_SUPER_MEMBERS));
        LinkedHashSet e11 = Dd.b.e(this.f10018o, name, ((ke.r) w().a().k()).a(), w().a().c(), result, Y02);
        Intrinsics.checkNotNullExpressionValue(e11, "resolveOverridesForStaticMembers(...)");
        result.addAll(e11);
        if (this.f10017n.A()) {
            if (name.equals(qd.s.f81856c)) {
                wd.V f7 = Vd.h.f(c3085o);
                Intrinsics.checkNotNullExpressionValue(f7, "createEnumValueOfMethod(...)");
                result.add(f7);
            } else if (name.equals(qd.s.f81854a)) {
                wd.V g10 = Vd.h.g(c3085o);
                Intrinsics.checkNotNullExpressionValue(g10, "createEnumValuesMethod(...)");
                result.add(g10);
            }
        }
    }

    @Override // Gd.e0, Gd.W
    protected final void t(@NotNull Sd.f name, @NotNull ArrayList result) {
        Sd.f fVar;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Z z11 = new Z(name);
        C3085o c3085o = this.f10018o;
        te.b.b(C7714v.a0(c3085o), a0.f10004a, new c0(c3085o, linkedHashSet, z11));
        if (result.isEmpty()) {
            fVar = name;
            arrayList = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC9831W F11 = F((InterfaceC9831W) obj);
                Object obj2 = linkedHashMap.get(F11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(F11, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                InterfaceC6543w c11 = w().a().c();
                LinkedHashSet e11 = Dd.b.e(this.f10018o, fVar, ((ke.r) w().a().k()).a(), c11, arrayList, collection);
                Intrinsics.checkNotNullExpressionValue(e11, "resolveOverridesForStaticMembers(...)");
                C7714v.p(e11, arrayList2);
            }
            arrayList.addAll(arrayList2);
        } else {
            InterfaceC6543w c12 = w().a().c();
            LinkedHashSet e12 = Dd.b.e(this.f10018o, name, ((ke.r) w().a().k()).a(), c12, result, linkedHashSet);
            fVar = name;
            arrayList = result;
            Intrinsics.checkNotNullExpressionValue(e12, "resolveOverridesForStaticMembers(...)");
            arrayList.addAll(e12);
        }
        if (this.f10017n.A() && Intrinsics.d(fVar, qd.s.f81855b)) {
            C9865a.a(arrayList, Vd.h.e(c3085o));
        }
    }

    @Override // Gd.W
    @NotNull
    protected final Set u(@NotNull ce.d kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet X02 = C7714v.X0(x().invoke().e());
        Y y11 = Y.f10001a;
        C3085o c3085o = this.f10018o;
        te.b.b(C7714v.a0(c3085o), a0.f10004a, new c0(c3085o, X02, y11));
        if (this.f10017n.A()) {
            X02.add(qd.s.f81855b);
        }
        return X02;
    }
}

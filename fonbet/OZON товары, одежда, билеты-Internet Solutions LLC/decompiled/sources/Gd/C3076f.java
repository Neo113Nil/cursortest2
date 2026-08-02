package Gd;

import Ad.C2379a;
import Bd.InterfaceC2627a;
import he.C6924F;
import ie.C7056e;
import ie.InterfaceC7061j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se.C9671a;
import td.InterfaceC9811B;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;

/* renamed from: Gd.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3076f implements ce.l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f10020f = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C3076f.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fd.k f10021b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final F f10022c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final I f10023d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f10024e;

    public C3076f(@NotNull Fd.k c11, @NotNull Jd.t jPackage, @NotNull F packageFragment) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f10021b = c11;
        this.f10022c = packageFragment;
        this.f10023d = new I(c11, jPackage, packageFragment);
        this.f10024e = ((C7056e) c11.e()).a(new C3075e(this));
    }

    static ce.l[] h(C3076f c3076f) {
        Collection<Ld.y> values = c3076f.f10022c.H0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            C6924F b11 = c3076f.f10021b.a().b().b(c3076f.f10022c, (Ld.y) it.next());
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        return (ce.l[]) C9671a.b(arrayList).toArray(new ce.l[0]);
    }

    private final ce.l[] j() {
        return (ce.l[]) ie.n.a(this.f10024e, f10020f[0]);
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> a() {
        ce.l[] j11 = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ce.l lVar : j11) {
            C7714v.p(lVar.a(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f10023d.a());
        return linkedHashSet;
    }

    @Override // ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        k(name, location);
        ce.l[] j11 = j();
        Collection b11 = this.f10023d.b(name, location);
        for (ce.l lVar : j11) {
            b11 = C9671a.a(b11, lVar.b(name, location));
        }
        return b11 == null ? kotlin.collections.M.f71699a : b11;
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> c() {
        ce.l[] j11 = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ce.l lVar : j11) {
            C7714v.p(lVar.c(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f10023d.c());
        return linkedHashSet;
    }

    @Override // ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        k(name, location);
        InterfaceC9839e d11 = this.f10023d.d(name, location);
        if (d11 != null) {
            return d11;
        }
        InterfaceC9842h interfaceC9842h = null;
        for (ce.l lVar : j()) {
            InterfaceC9842h d12 = lVar.d(name, location);
            if (d12 != null) {
                if (!(d12 instanceof InterfaceC9843i) || !((InterfaceC9811B) d12).p0()) {
                    return d12;
                }
                if (interfaceC9842h == null) {
                    interfaceC9842h = d12;
                }
            }
        }
        return interfaceC9842h;
    }

    @Override // ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        ce.l[] j11 = j();
        Collection<InterfaceC9845k> e11 = this.f10023d.e(kindFilter, nameFilter);
        for (ce.l lVar : j11) {
            e11 = C9671a.a(e11, lVar.e(kindFilter, nameFilter));
        }
        return e11 == null ? kotlin.collections.M.f71699a : e11;
    }

    @Override // ce.l
    public final Set<Sd.f> f() {
        HashSet a11 = ce.n.a(C7705l.d(j()));
        if (a11 == null) {
            return null;
        }
        a11.addAll(this.f10023d.f());
        return a11;
    }

    @Override // ce.l
    @NotNull
    public final Collection<td.c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        k(name, location);
        ce.l[] j11 = j();
        Collection<td.c0> g10 = this.f10023d.g(name, location);
        for (ce.l lVar : j11) {
            g10 = C9671a.a(g10, lVar.g(name, location));
        }
        return g10 == null ? kotlin.collections.M.f71699a : g10;
    }

    @NotNull
    public final I i() {
        return this.f10023d;
    }

    public final void k(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        C2379a.b(this.f10021b.a().l(), location, this.f10022c, name);
    }

    @NotNull
    public final String toString() {
        return "scope for " + this.f10022c;
    }
}

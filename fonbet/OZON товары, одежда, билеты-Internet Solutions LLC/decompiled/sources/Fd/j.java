package Fd;

import Fd.o;
import Gd.F;
import Jd.t;
import Sc.C4004f;
import Sc.InterfaceC3999a;
import ie.C7056e;
import ie.InterfaceC7052a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9826Q;
import te.C9865a;

/* loaded from: classes.dex */
public final class j implements InterfaceC9826Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f9394a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7052a<Sd.c, F> f9395b;

    public j(@NotNull d components) {
        Intrinsics.checkNotNullParameter(components, "components");
        k kVar = new k(components, o.a.f9408a, new C4004f(null));
        this.f9394a = kVar;
        this.f9395b = ((C7056e) kVar.e()).h();
    }

    static F d(j jVar, t tVar) {
        return new F(jVar.f9394a, tVar);
    }

    private final F e(Sd.c cVar) {
        return (F) this.f9395b.a(cVar, new i(this, ((yd.d) this.f9394a.a().d()).b(cVar)));
    }

    @Override // td.InterfaceC9826Q
    public final void a(@NotNull Sd.c fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        C9865a.a(packageFragments, e(fqName));
    }

    @Override // td.InterfaceC9821L
    @InterfaceC3999a
    @NotNull
    public final List<F> b(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return C7714v.a0(e(fqName));
    }

    @Override // td.InterfaceC9826Q
    public final boolean c(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ((yd.d) this.f9394a.a().d()).b(fqName);
        return false;
    }

    @Override // td.InterfaceC9821L
    public final Collection j(Sd.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        List<Sd.c> I02 = e(fqName).I0();
        if (I02 == null) {
            I02 = K.f71697a;
        }
        return I02;
    }

    @NotNull
    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f9394a.a().m();
    }
}

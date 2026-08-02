package Dd;

import Jd.InterfaceC3391a;
import Jd.InterfaceC3392b;
import ie.C7056e;
import ie.InterfaceC7061j;
import java.util.Map;
import je.Y;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import td.d0;
import wd.L;

/* loaded from: classes10.dex */
public class d implements Ed.g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f6564f = {N.h(new E(N.b(d.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sd.c f6565a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d0 f6566b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f6567c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3392b f6568d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6569e;

    public d(@NotNull Fd.k c11, InterfaceC3391a interfaceC3391a, @NotNull Sd.c fqName) {
        d0 NO_SOURCE;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f6565a = fqName;
        if (interfaceC3391a != null) {
            NO_SOURCE = ((yd.k) c11.a().t()).a(interfaceC3391a);
        } else {
            NO_SOURCE = d0.f99392a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.f6566b = NO_SOURCE;
        this.f6567c = ((C7056e) c11.e()).a(new c(c11, this));
        this.f6568d = interfaceC3391a != null ? (InterfaceC3392b) C7714v.L(interfaceC3391a.e()) : null;
        this.f6569e = false;
    }

    static Y d(Fd.k kVar, d dVar) {
        Y q11 = ((L) kVar.d()).n().o(dVar.f6565a).q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        return q11;
    }

    @Override // Ed.g
    public final boolean a() {
        return this.f6569e;
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public Map<Sd.f, Xd.g<?>> b() {
        return U.c();
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final Sd.c c() {
        return this.f6565a;
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final d0 e() {
        return this.f6566b;
    }

    protected final InterfaceC3392b f() {
        return this.f6568d;
    }

    @Override // ud.InterfaceC10025c
    public final je.N getType() {
        return (Y) ie.n.a(this.f6567c, f6564f[0]);
    }
}

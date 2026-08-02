package Kd;

import Cd.C2742c;
import Cd.EnumC2741b;
import Gd.C3080j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9846l;
import td.p0;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
final class g0 extends AbstractC3507d<InterfaceC10025c> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9846l f15903a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15904b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Fd.k f15905c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final EnumC2741b f15906d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15907e;

    public g0(InterfaceC9846l interfaceC9846l, boolean z11, @NotNull Fd.k containerContext, @NotNull EnumC2741b containerApplicabilityType, boolean z12) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.f15903a = interfaceC9846l;
        this.f15904b = z11;
        this.f15905c = containerContext;
        this.f15906d = containerApplicabilityType;
        this.f15907e = z12;
    }

    @Override // Kd.AbstractC3507d
    public final boolean c(InterfaceC10025c interfaceC10025c, ne.g gVar) {
        InterfaceC10025c interfaceC10025c2 = interfaceC10025c;
        Intrinsics.checkNotNullParameter(interfaceC10025c2, "<this>");
        if ((interfaceC10025c2 instanceof Ed.g) && ((Ed.g) interfaceC10025c2).a()) {
            return true;
        }
        if (interfaceC10025c2 instanceof C3080j) {
            i();
            if (((C3080j) interfaceC10025c2).h()) {
                return true;
            }
            if (this.f15906d == EnumC2741b.TYPE_PARAMETER_BOUNDS) {
                return true;
            }
        }
        if (gVar == null || !qd.m.e0((je.N) gVar) || !o().j(interfaceC10025c2)) {
            return false;
        }
        this.f15905c.a().q().getClass();
        return true;
    }

    @Override // Kd.AbstractC3507d
    @NotNull
    public final Iterable<InterfaceC10025c> e() {
        InterfaceC10030h annotations;
        InterfaceC9846l interfaceC9846l = this.f15903a;
        return (interfaceC9846l == null || (annotations = interfaceC9846l.getAnnotations()) == null) ? kotlin.collections.K.f71697a : annotations;
    }

    @Override // Kd.AbstractC3507d
    @NotNull
    public final EnumC2741b f() {
        return this.f15906d;
    }

    @Override // Kd.AbstractC3507d
    public final Cd.B g() {
        return this.f15905c.b();
    }

    @Override // Kd.AbstractC3507d
    public final boolean h() {
        InterfaceC9846l interfaceC9846l = this.f15903a;
        return (interfaceC9846l instanceof p0) && ((p0) interfaceC9846l).x0() != null;
    }

    @Override // Kd.AbstractC3507d
    public final boolean i() {
        this.f15905c.a().q().getClass();
        return false;
    }

    @Override // Kd.AbstractC3507d
    public final boolean k() {
        return this.f15907e;
    }

    @Override // Kd.AbstractC3507d
    public final boolean l() {
        return this.f15904b;
    }

    @Override // Kd.AbstractC3507d
    public final boolean m(@NotNull je.N n11, @NotNull ne.g other) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ((ke.r) this.f15905c.a().k()).c(n11, (je.N) other);
    }

    @NotNull
    public final C2742c o() {
        return this.f15905c.a().a();
    }

    public /* synthetic */ g0(InterfaceC9846l interfaceC9846l, boolean z11, Fd.k kVar, EnumC2741b enumC2741b) {
        this(interfaceC9846l, z11, kVar, enumC2741b, false);
    }
}

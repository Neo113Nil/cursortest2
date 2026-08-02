package Dd;

import fe.InterfaceC6543w;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;

/* renamed from: Dd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2856a extends Vd.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6543w f6558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LinkedHashSet f6559b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f6560c;

    /* renamed from: Dd.a$a, reason: collision with other inner class name */
    final class C0136a implements Function1<InterfaceC9836b, Unit> {
        C0136a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(@NotNull InterfaceC9836b interfaceC9836b) {
            InterfaceC9836b interfaceC9836b2 = interfaceC9836b;
            if (interfaceC9836b2 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            }
            C2856a.this.f6558a.b(interfaceC9836b2);
            return Unit.f71690a;
        }
    }

    C2856a(InterfaceC6543w interfaceC6543w, LinkedHashSet linkedHashSet, boolean z11) {
        this.f6558a = interfaceC6543w;
        this.f6559b = linkedHashSet;
        this.f6560c = z11;
    }

    private static /* synthetic */ void d(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "fromSuper";
        } else if (i11 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i11 == 3) {
            objArr[0] = "member";
        } else if (i11 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i11 == 1 || i11 == 2) {
            objArr[2] = "conflict";
        } else if (i11 == 3 || i11 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Vd.m
    public final void a(@NotNull InterfaceC9836b interfaceC9836b) {
        if (interfaceC9836b == null) {
            d(0);
            throw null;
        }
        Vd.n.t(interfaceC9836b, new C0136a());
        this.f6559b.add(interfaceC9836b);
    }

    @Override // Vd.m
    public final void b(@NotNull InterfaceC9836b interfaceC9836b, @NotNull InterfaceC9836b interfaceC9836b2) {
        if (interfaceC9836b2 != null) {
            return;
        }
        d(2);
        throw null;
    }

    @Override // Vd.m
    public final void c(@NotNull InterfaceC9836b interfaceC9836b, @NotNull Collection<? extends InterfaceC9836b> collection) {
        if (interfaceC9836b == null) {
            d(3);
            throw null;
        }
        if (!this.f6560c || interfaceC9836b.getKind() == InterfaceC9836b.a.FAKE_OVERRIDE) {
            super.c(interfaceC9836b, collection);
        }
    }
}

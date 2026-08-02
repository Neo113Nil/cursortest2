package E0;

import E0.AbstractC2923g0;
import Q1.C3848q;
import Q1.InterfaceC3841j;
import java.util.List;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import ze.EnumC11113a;

/* renamed from: E0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2910a extends AbstractC2923g0 {

    /* renamed from: b, reason: collision with root package name */
    private xe.B0 f7139b;

    /* renamed from: c, reason: collision with root package name */
    private C2935m0 f7140c;

    /* renamed from: d, reason: collision with root package name */
    private Ae.C0 f7141d;

    /* renamed from: E0.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0151a extends AbstractC7737t implements Function1<C2935m0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q1.K f7142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2910a f7143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q1.r f7144d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<List<? extends InterfaceC3841j>, Unit> f7145e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<C3848q, Unit> f7146f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0151a(Q1.K k11, C2910a c2910a, Q1.r rVar, Function1<? super List<? extends InterfaceC3841j>, Unit> function1, Function1<? super C3848q, Unit> function12) {
            super(1);
            this.f7142b = k11;
            this.f7143c = c2910a;
            this.f7144d = rVar;
            this.f7145e = function1;
            this.f7146f = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C2935m0 c2935m0) {
            c2935m0.i(this.f7142b, this.f7143c.i(), this.f7144d, this.f7145e, this.f7146f);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ae.w0<Unit> o() {
        Ae.C0 c02 = this.f7141d;
        if (c02 != null) {
            return c02;
        }
        if (!C0.c.a()) {
            return null;
        }
        Ae.C0 b11 = Ae.E0.b(1, 0, EnumC11113a.DROP_LATEST, 2);
        this.f7141d = b11;
        return b11;
    }

    @Override // Q1.F
    public final void a(Q1.K k11, @NotNull Q1.K k12) {
        C2935m0 c2935m0 = this.f7140c;
        if (c2935m0 != null) {
            c2935m0.j(k11, k12);
        }
    }

    @Override // Q1.F
    public final void b() {
        xe.B0 b02 = this.f7139b;
        if (b02 != null) {
            b02.j(null);
        }
        this.f7139b = null;
        Ae.w0<Unit> o11 = o();
        if (o11 != null) {
            ((Ae.C0) o11).resetReplayCache();
        }
    }

    @Override // Q1.F
    public final void c(@NotNull Q1.K k11, @NotNull Q1.D d11, @NotNull K1.K k12, @NotNull Function1<? super C7837o0, Unit> function1, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        C2935m0 c2935m0 = this.f7140c;
        if (c2935m0 != null) {
            c2935m0.k(k11, d11, k12, c7460f, c7460f2);
        }
    }

    @Override // Q1.F
    public final void d() {
        AbstractC2923g0.a i11 = i();
        if (i11 == null) {
            return;
        }
        C2912b c2912b = new C2912b(null, this, i11, null);
        C2917d0 c2917d0 = (C2917d0) i11;
        this.f7139b = c2917d0.isAttached() ? C10727i.c(c2917d0.getCoroutineScope(), null, xe.O.UNDISPATCHED, new C2915c0(c2917d0, c2912b, null), 1) : null;
    }

    @Override // Q1.F
    public final void f(@NotNull C7460f c7460f) {
        C2935m0 c2935m0 = this.f7140c;
        if (c2935m0 != null) {
            c2935m0.h(c7460f);
        }
    }

    @Override // Q1.F
    public final void g(@NotNull Q1.K k11, @NotNull Q1.r rVar, @NotNull Function1<? super List<? extends InterfaceC3841j>, Unit> function1, @NotNull Function1<? super C3848q, Unit> function12) {
        C0151a c0151a = new C0151a(k11, this, rVar, function1, function12);
        AbstractC2923g0.a i11 = i();
        if (i11 == null) {
            return;
        }
        C2912b c2912b = new C2912b(c0151a, this, i11, null);
        C2917d0 c2917d0 = (C2917d0) i11;
        this.f7139b = c2917d0.isAttached() ? C10727i.c(c2917d0.getCoroutineScope(), null, xe.O.UNDISPATCHED, new C2915c0(c2917d0, c2912b, null), 1) : null;
    }

    @Override // E0.AbstractC2923g0
    public final void k() {
        Ae.w0<Unit> o11 = o();
        if (o11 != null) {
            ((Ae.C0) o11).tryEmit(Unit.f71690a);
        }
    }
}

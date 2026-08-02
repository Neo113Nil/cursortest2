package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3787x1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21434a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.material3.internal.p<EnumC3790y1> f21435b;

    public C3787x1(boolean z11, @NotNull Z1.d dVar, @NotNull EnumC3790y1 enumC3790y1, @NotNull Function1 function1) {
        m0.T0 t02;
        this.f21434a = z11;
        if (z11 && enumC3790y1 == EnumC3790y1.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        t02 = C3772s1.f21350a;
        this.f21435b = new androidx.compose.material3.internal.p<>(enumC3790y1, new C3781v1(dVar), new C3784w1(dVar), t02, function1);
    }

    public static Object a(C3787x1 c3787x1, EnumC3790y1 enumC3790y1, kotlin.coroutines.jvm.internal.j jVar) {
        Object c11 = androidx.compose.material3.internal.e.c(c3787x1.f21435b, enumC3790y1, c3787x1.f21435b.r(), jVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    public final Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        EnumC3790y1 enumC3790y1 = EnumC3790y1.Expanded;
        androidx.compose.material3.internal.p<EnumC3790y1> pVar = this.f21435b;
        Object c11 = androidx.compose.material3.internal.e.c(pVar, enumC3790y1, pVar.r(), (kotlin.coroutines.jvm.internal.j) dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @NotNull
    public final androidx.compose.material3.internal.p<EnumC3790y1> c() {
        return this.f21435b;
    }

    @NotNull
    public final EnumC3790y1 d() {
        return this.f21435b.p();
    }

    public final boolean e() {
        return this.f21435b.l().c(EnumC3790y1.Expanded);
    }

    public final boolean f() {
        return this.f21435b.l().c(EnumC3790y1.PartiallyExpanded);
    }

    public final boolean g() {
        return this.f21434a;
    }

    @NotNull
    public final EnumC3790y1 h() {
        return this.f21435b.t();
    }

    public final Object i(@NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object a11 = a(this, EnumC3790y1.Hidden, jVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final boolean j() {
        return this.f21435b.p() != EnumC3790y1.Hidden;
    }

    public final Object k(@NotNull kotlin.coroutines.jvm.internal.j jVar) {
        if (this.f21434a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object a11 = a(this, EnumC3790y1.PartiallyExpanded, jVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final float l() {
        return this.f21435b.w();
    }

    public final Object m(float f7, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object y11 = this.f21435b.y(f7, dVar);
        return y11 == Wc.a.COROUTINE_SUSPENDED ? y11 : Unit.f71690a;
    }
}

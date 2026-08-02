package J0;

import androidx.compose.material.C5204b;
import androidx.compose.material.C5210h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3326o1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5210h<EnumC3337r1> f13340a;

    /* renamed from: J0.o1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13341a;

        static {
            int[] iArr = new int[EnumC3337r1.values().length];
            try {
                iArr[EnumC3337r1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13341a = iArr;
        }
    }

    public C3326o1(@NotNull EnumC3337r1 enumC3337r1, @NotNull Z1.d dVar, @NotNull Function1 function1, @NotNull m0.T0 t02) {
        this.f13340a = new C5210h<>(enumC3337r1, new C3330p1(dVar), new C3334q1(dVar), t02, function1);
    }

    public static Object a(C3326o1 c3326o1, EnumC3337r1 enumC3337r1, kotlin.coroutines.d dVar) {
        Object c11 = C5204b.c(c3326o1.f13340a, enumC3337r1, c3326o1.f13340a.r(), dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    public final Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11;
        M<EnumC3337r1> l11 = this.f13340a.l();
        EnumC3337r1 enumC3337r1 = EnumC3337r1.Expanded;
        return (l11.c(enumC3337r1) && (a11 = a(this, enumC3337r1, dVar)) == Wc.a.COROUTINE_SUSPENDED) ? a11 : Unit.f71690a;
    }

    @NotNull
    public final C5210h<EnumC3337r1> c() {
        return this.f13340a;
    }

    @NotNull
    public final EnumC3337r1 d() {
        return this.f13340a.p();
    }

    public final boolean e() {
        return this.f13340a.l().c(EnumC3337r1.HalfExpanded);
    }

    @NotNull
    public final EnumC3337r1 f() {
        return this.f13340a.t();
    }

    public final Object g(@NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object a11 = a(this, EnumC3337r1.Hidden, jVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final boolean h() {
        return this.f13340a.p() != EnumC3337r1.Hidden;
    }

    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        M<EnumC3337r1> l11 = this.f13340a.l();
        EnumC3337r1 enumC3337r1 = EnumC3337r1.Expanded;
        boolean c11 = l11.c(enumC3337r1);
        if (a.f13341a[d().ordinal()] == 1) {
            if (e()) {
                enumC3337r1 = EnumC3337r1.HalfExpanded;
            }
        } else if (!c11) {
            enumC3337r1 = EnumC3337r1.Hidden;
        }
        Object a11 = a(this, enumC3337r1, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}

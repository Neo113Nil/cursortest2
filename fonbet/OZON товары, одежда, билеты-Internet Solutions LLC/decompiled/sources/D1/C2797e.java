package D1;

import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2797e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f5431a = new a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<C2793c, Unit> f5432b = b.f5434b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function1<C2793c, Unit> f5433c = c.f5435b;

    /* renamed from: D1.e$a */
    public static final class a implements C1.l {
        @Override // C1.l
        public final Object G(@NotNull C1.m mVar) {
            return mVar.a().invoke();
        }
    }

    /* renamed from: D1.e$b */
    static final class b extends AbstractC7737t implements Function1<C2793c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5434b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C2793c c2793c) {
            c2793c.M1();
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.e$c */
    static final class c extends AbstractC7737t implements Function1<C2793c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5435b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C2793c c2793c) {
            c2793c.P1();
            return Unit.f71690a;
        }
    }

    public static final boolean d(C2793c c2793c) {
        e.c m11 = C2809k.f(c2793c).c0().m();
        Intrinsics.g(m11, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((G0) m11).I1();
    }
}

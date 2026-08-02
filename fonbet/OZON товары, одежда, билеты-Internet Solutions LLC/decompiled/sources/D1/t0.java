package D1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t0 implements y0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<t0, Unit> f5552b = a.f5554b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r0 f5553a;

    static final class a extends AbstractC7737t implements Function1<t0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5554b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(t0 t0Var) {
            t0 t0Var2 = t0Var;
            if (t0Var2.m0()) {
                t0Var2.b().onObservedReadsChanged();
            }
            return Unit.f71690a;
        }
    }

    public t0(@NotNull r0 r0Var) {
        this.f5553a = r0Var;
    }

    @NotNull
    public final r0 b() {
        return this.f5553a;
    }

    @Override // D1.y0
    public final boolean m0() {
        return this.f5553a.getNode().isAttached();
    }
}

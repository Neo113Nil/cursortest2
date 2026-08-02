package B0;

import B1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class R0 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f1500a;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<B1.U> f1501b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ R0 f1502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends B1.U> list, R0 r02) {
            super(1);
            this.f1501b = list;
            this.f1502c = r02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList e11 = C2510t.e(this.f1501b, this.f1502c.f1500a);
            if (e11 != null) {
                int size = e11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Pair pair = (Pair) e11.get(i11);
                    B1.m0 m0Var = (B1.m0) pair.a();
                    Function0 function0 = (Function0) pair.b();
                    aVar2.f(m0Var, function0 != null ? ((Z1.m) function0.invoke()).g() : 0L, 0.0f);
                }
            }
            return Unit.f71690a;
        }
    }

    public R0(@NotNull Function0<Boolean> function0) {
        this.f1500a = function0;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.W z02;
        z02 = y11.z0(Z1.b.k(j11), Z1.b.j(j11), kotlin.collections.U.c(), new a(list, this));
        return z02;
    }
}

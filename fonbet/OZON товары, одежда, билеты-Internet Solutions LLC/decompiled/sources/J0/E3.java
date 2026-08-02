package J0;

import P1.C3807n;
import V1.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final K1.T f12763a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f12764b;

    static final class a extends AbstractC7737t implements Function0<D3> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12765b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final D3 invoke() {
            return new D3();
        }
    }

    static {
        K1.T t2;
        V1.f fVar = new V1.f(f.a.f27910a, 0);
        t2 = K1.T.f15012d;
        f12763a = K1.T.c(t2, 0L, 0L, null, null, null, 0L, null, null, 0L, I.a(), fVar, 15204351);
        f12764b = new S0.B1(a.f12765b);
    }

    public static final K1.T a(K1.T t2, C3807n c3807n) {
        return t2.h() != null ? t2 : K1.T.c(t2, 0L, 0L, null, c3807n, null, 0L, null, null, 0L, null, null, 16777183);
    }

    @NotNull
    public static final K1.T b() {
        return f12763a;
    }

    @NotNull
    public static final S0.B1 c() {
        return f12764b;
    }
}

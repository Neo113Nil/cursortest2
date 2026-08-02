package I0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.O f11552a = new S0.O(a.f11554b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final j1 f11553b;

    static final class a extends AbstractC7737t implements Function0<j1> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11554b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final j1 invoke() {
            return k1.f11553b;
        }
    }

    static {
        long c11 = C7811b0.c(4282550004L);
        f11553b = new j1(c11, C7807Z.o(0.4f, c11));
    }

    @NotNull
    public static final S0.O b() {
        return f11552a;
    }
}

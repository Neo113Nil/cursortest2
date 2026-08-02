package A5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static Function0<Long> f449a = a.f450a;

    /* synthetic */ class a extends C7735q implements Function0<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f450a = new a(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static long a() {
        return ((Number) ((a) f449a).invoke()).longValue();
    }
}

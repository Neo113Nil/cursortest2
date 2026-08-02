package Hd0;

import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes7.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final IntRange f10857a = new IntRange(CounterView.COUNTER_MAX_DEFAULT, 599, 1);

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        L proceed = chain.proceed(request);
        if (!f10857a.n(proceed.m())) {
            return proceed;
        }
        int i11 = 0;
        while (!proceed.v() && i11 < 2) {
            i11++;
            proceed.close();
            Thread.sleep(300L);
            proceed = chain.proceed(request);
        }
        return proceed;
    }
}

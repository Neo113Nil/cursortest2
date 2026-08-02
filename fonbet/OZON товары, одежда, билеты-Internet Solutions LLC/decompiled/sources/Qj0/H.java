package Qj0;

import We.B;
import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MetricType;
import sf.InterfaceC9683i;

/* loaded from: classes7.dex */
public final class H implements We.B {
    @Override // We.B
    @NotNull
    public final We.L intercept(@NotNull B.a chain) {
        We.M c11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC6369b b11 = InterfaceC6369b.f62344a.b();
        if (b11 == null || !b11.i()) {
            return chain.proceed(chain.request());
        }
        We.G request = chain.request();
        We.L proceed = chain.proceed(request);
        if (proceed.v()) {
            String q11 = We.L.q(proceed, "content-type");
            if (q11 == null) {
                q11 = "";
            }
            if ((kotlin.text.h.e0(q11, "application/json", false) || kotlin.text.h.e0(q11, "image", false)) && (c11 = proceed.c()) != null) {
                InterfaceC9683i source = c11.source();
                source.n(Long.MAX_VALUE);
                U.p(b11.beginTrace(s0.a(request)), MetricType.DECODED_SIZE, source.f().size(), false, 4);
                return proceed;
            }
        }
        return proceed;
    }
}

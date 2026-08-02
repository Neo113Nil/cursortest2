package X00;

import We.B;
import We.G;
import We.L;
import af.C5014d;
import ef.C6355e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        String c11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        L proceed = chain.proceed(request);
        String method = request.h();
        Intrinsics.checkNotNullParameter(method, "method");
        if (Intrinsics.d(method, "POST") || Intrinsics.d(method, "PATCH") || Intrinsics.d(method, "PUT") || Intrinsics.d(method, "DELETE") || Intrinsics.d(method, "MOVE") || !C6355e.b(proceed) || !C5014d.a.a(request, proceed) || (c11 = request.e().c("x-page-view-id")) == null) {
            return proceed;
        }
        L.a aVar = new L.a(proceed);
        aVar.i("x-page-view-id", c11);
        return aVar.c();
    }
}

package Cf0;

import We.B;
import eg0.C6364b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class P implements We.B {
    @Override // We.B
    @NotNull
    public final We.L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        We.G request = chain.request();
        Object i11 = request.i(uf0.b.class);
        C6364b c6364b = i11 instanceof C6364b ? (C6364b) i11 : null;
        if (c6364b == null) {
            return chain.proceed(request);
        }
        long nanoTime = System.nanoTime() - (c6364b.p() + (c6364b.m() + c6364b.a()));
        if (c6364b.f() == 0) {
            c6364b.E(nanoTime);
        }
        c6364b.R(nanoTime);
        c6364b.T(nanoTime);
        return chain.proceed(request);
    }
}

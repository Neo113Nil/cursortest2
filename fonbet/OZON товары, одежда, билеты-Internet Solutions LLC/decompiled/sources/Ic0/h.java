package Ic0;

import Sc.InterfaceC4008j;
import We.B;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h extends Db0.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<g> f12229a;

    public h(@NotNull InterfaceC4008j<g> initSessionInterceptor) {
        Intrinsics.checkNotNullParameter(initSessionInterceptor, "initSessionInterceptor");
        this.f12229a = initSessionInterceptor;
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a chain) {
        String q11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        return (proceed.m() == 401 && ((q11 = L.q(proceed, "x-o3-gdecision")) == null || kotlin.text.h.K(q11))) ? this.f12229a.getValue().e(proceed, chain) : proceed;
    }
}

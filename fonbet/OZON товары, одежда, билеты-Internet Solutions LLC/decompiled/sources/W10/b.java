package W10;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f33192a;

    public b(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.f33192a = tokenizedAnalytics;
    }

    @Override // W10.a
    public final void a(@NotNull d trackingDataHolder, t tVar, WZ.e eVar) {
        Intrinsics.checkNotNullParameter(trackingDataHolder, "trackingDataHolder");
        if (tVar == null || trackingDataHolder.a() || !trackingDataHolder.c()) {
            return;
        }
        m.c(this.f33192a, tVar, eVar);
        trackingDataHolder.d();
    }
}

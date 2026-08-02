package Mj0;

import We.B;
import We.G;
import We.L;
import fi0.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f18145a;

    public a(@NotNull x trackerSettings) {
        Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
        this.f18145a = trackerSettings;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        x xVar = this.f18145a;
        if (xVar.l() != null) {
            request.getClass();
            G.a aVar = new G.a(request);
            aVar.d("x-o3-app-name", xVar.l());
            request = aVar.b();
        }
        return chain.proceed(request);
    }
}

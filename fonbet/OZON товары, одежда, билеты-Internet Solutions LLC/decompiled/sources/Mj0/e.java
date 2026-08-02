package Mj0;

import We.B;
import We.G;
import We.L;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes7.dex */
public final class e implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f18152a = new e();

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        if (request.a() == null || Intrinsics.d(request.d("Content-Encoding"), "gzip")) {
            return chain.proceed(request);
        }
        G.a aVar = new G.a(request);
        aVar.d("Content-Encoding", "gzip");
        String h11 = request.h();
        d dVar = new d(request.a());
        C9681g c9681g = new C9681g();
        dVar.writeTo(c9681g);
        aVar.f(new c(dVar, c9681g), h11);
        return chain.proceed(aVar.b());
    }
}
